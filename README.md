# CloudStream CineStream Plugin 🎬

Plugin oficial de **CloudStream 3** para reproducir películas y series desde **[CineStream](https://cinestream.studio/#home)**.

## ✨ Características

- 🍿 **Catálogo Completo**: Películas en cartelera, populares, series en emisión y tendencias actualizadas en tiempo real desde CineStream.
- ⚡ **Múltiples Servidores (Extractores)**:
  - **Videasy 4K** (Ultra HD Direct)
  - **Vidy 4K** (High Speed Stream)
  - **VidBolt 1080p** (Cloud Server)
  - **FilmU Multi-Server**
  - **VidFast 4K**
  - **Screenscape** & **Mapple**
- 💬 **Subtítulos Multilenguaje**: Integración automática con Stremio y OpenSubtitles (Español, Inglés, etc.).
- 🛡️ **Anti-Publicidad**: Reproducción nativa en ExoPlayer de CloudStream sin redirecciones ni popups.

---

## 📲 ¿Cómo instalar en CloudStream 3?

### Método 1: Repositorio en GitHub (Recomendado)
1. Crea un repositorio en GitHub llamado `CloudstreamPlugins`.
2. Sube todos los archivos de este ZIP a la rama `main` o `master`.
3. GitHub Actions compilará automáticamente el archivo binario `.cs3` en la rama `builds`.
4. En tu aplicación CloudStream en Android o Smart TV:
   - Ve a **Ajustes** ⚙️ ➔ **Extensiones** ➔ **Repositorios**.
   - Haz clic en **Añadir Repositorio**.
   - Ingresa el nombre: `CineStream` y la URL del repositorio:
     ```text
     https://raw.githubusercontent.com/chichidelacrus577/CloudstreamPlugins/builds/plugins.json
     ```
   - Haz clic en **Descargar** o **Instalar** en CineStream. ¡Listo!

### Método 2: Compilación Local con Gradle
Si deseas compilar el archivo `.cs3` manualmente en tu PC:
```bash
# Linux / macOS
./gradlew makePlugins

# Windows
gradlew.bat makePlugins
```
El archivo generado se ubicará en `build/CineStream.cs3`. Puedes transferirlo a tu teléfono y abrirlo con CloudStream.

---

## 🛠️ Tecnologías
- **Lenguaje**: Kotlin 1.9+
- **Framework**: CloudStream 3 Plugin SDK (Android)
- **Fuente de Datos**: API REST de `https://cinestream.studio`
