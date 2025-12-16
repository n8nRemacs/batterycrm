package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import ru.ok.messages.utils.ContextDirCreationException;

/* loaded from: classes2.dex */
public final class iz5 implements qx5 {
    public static volatile String d;
    public static volatile String e;
    public static final fz5 f = new fz5();
    public final hx5 b = new hx5("ru.oneme.app.provider", 0);
    public final Context c;

    public iz5(Context context) {
        this.c = context;
    }

    public static String b(Context context) {
        if (d == null) {
            wqi.c("iz5", "getAppBasePath: try to create", new Object[0]);
            if (Build.VERSION.SDK_INT > 29) {
                fz5 fz5Var = f;
                Objects.requireNonNull(context);
                if (!jqd.c(false, fz5Var, new ns2(context, 8))) {
                    wqi.p("iz5", "getAppBasePath fail", new ContextDirCreationException("appbase"));
                }
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir == null) {
                    wqi.p("iz5", "externalCache is null", new ContextDirCreationException("externalCacheDir"));
                } else if (!externalCacheDir.exists()) {
                    wqi.p("iz5", "externalCache not exists", new ContextDirCreationException("externalCacheDir"));
                }
                if (externalCacheDir != null) {
                    d = externalCacheDir.getAbsolutePath();
                    if (d == null) {
                        wqi.o("iz5", null, "getAppBasePath: appBasePath is null", Arrays.copyOf(new Object[0], 0));
                    } else {
                        wqi.c("iz5", "getAppBasePath: appBasePath=" + d, new Object[0]);
                    }
                }
            }
            if (d == null) {
                d = c(context);
            }
        }
        return d;
    }

    public static String c(Context context) {
        if (e == null) {
            fz5 fz5Var = f;
            Objects.requireNonNull(context);
            if (!jqd.c(false, fz5Var, new ns2(context, 9))) {
                wqi.p("iz5", "getCacheDir fail", new ContextDirCreationException("sandbox"));
            }
            e = context.getCacheDir().getAbsolutePath();
        }
        return e;
    }

    public static File g(String str, String str2) {
        File file = new File(str, str2);
        file.mkdirs();
        return file;
    }

    public static Uri q(String str) {
        if (l8g.c(str)) {
            return null;
        }
        return Uri.parse(str);
    }

    public final File d(long j) {
        return new File(g(b(this.c), "audioCache"), a9h.d(j, "audio_", ".wav"));
    }

    public final File e(long j) {
        return new File(g(b(this.c), "botCommands"), vb9.e(j, "botCommands"));
    }

    public final Uri f(Context context, File file) {
        return FileProvider.d(context, file, this.b.a);
    }

    public final File h(String str) {
        return new File(i(), xpi.a(str));
    }

    public final File i() {
        String str = Environment.DIRECTORY_DOWNLOADS;
        File externalFilesDir = Build.VERSION.SDK_INT == 29 ? this.c.getExternalFilesDir(str) : Environment.getExternalStoragePublicDirectory(str);
        if (externalFilesDir == null) {
            return null;
        }
        File file = new File(externalFilesDir.getAbsolutePath(), "MAX");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public final File j(String str) {
        return new File(k(), wy1.h("gif_preview", str));
    }

    public final File k() {
        return g(b(this.c), "imageCache");
    }

    public final File l(String str) {
        return p(str + ".mp4");
    }

    public final File m(String str, String str2) {
        String strH = !l8g.c(str2) ? wy1.h(".", str2) : "";
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        return p(str + strH);
    }

    public final File n() {
        return g(b(this.c), "stickerCache");
    }

    public final File o() {
        File file = new File(b(this.c), "showcase");
        if (file.exists() && file.isDirectory()) {
            file.delete();
        }
        return file;
    }

    public final File p(String str) {
        return new File(g(b(this.c), "upload"), xpi.a(str));
    }

    public final File r(long j) {
        return new File(i(), a9h.d(j, "video_", ".mp4"));
    }
}
