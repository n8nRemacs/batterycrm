package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public interface qx5 {
    public static final String[] a = {"/videoCache/", "/previewVideoCache/", "/stickerCache/", "/upload/", "/imageCache/", "/audioCache/", "/gifCache/", "/exo_files_cache/", "/logsCache/", "/font/", "/ringtones/"};

    default File a(String str) {
        return ((iz5) this).m(null, str);
    }
}
