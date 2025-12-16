package defpackage;

import android.net.Uri;
import java.io.File;
import kotlinx.serialization.json.internal.a;
import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public abstract class ioi {
    public static final qt5 a;
    public static final qt5[] b;

    static {
        qt5 qt5Var = new qt5("CLIENT_TELEMETRY", 1L);
        a = qt5Var;
        b = new qt5[]{qt5Var};
    }

    public static final void a(b bVar) {
        if ((bVar instanceof b ? bVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + vid.a(bVar.getClass()));
    }

    public static final a b(lh4 lh4Var) {
        a aVar = lh4Var instanceof a ? (a) lh4Var : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + vid.a(lh4Var.getClass()));
    }

    public static final File c(Uri uri) {
        if (!fni.a(uri.getScheme(), "file")) {
            throw new IllegalArgumentException(ctd.i(uri, "Uri lacks 'file' scheme: ").toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(ctd.i(uri, "Uri path is null: ").toString());
    }
}
