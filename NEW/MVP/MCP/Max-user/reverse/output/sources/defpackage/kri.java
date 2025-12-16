package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public abstract class kri {
    public static boolean a(hp5 hp5Var) {
        qyg qygVar = new qyg(8);
        int i = y21.b(hp5Var, qygVar).b;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        hp5Var.i(0, qygVar.a, 4);
        qygVar.E(0);
        int iF = qygVar.f();
        if (iF == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unsupported form type: ");
        sb.append(iF);
        Log.e("WavHeaderReader", sb.toString());
        return false;
    }

    public static String b(Context context, String str) {
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", packageName);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static y21 c(int i, hp5 hp5Var, qyg qygVar) throws ParserException {
        y21 y21VarB = y21.b(hp5Var, qygVar);
        while (true) {
            int i2 = y21VarB.b;
            if (i2 == i) {
                return y21VarB;
            }
            az1.s("Ignoring unknown WAV chunk: ", 39, i2, "WavHeaderReader");
            long j = y21VarB.c + 8;
            if (j > 2147483647L) {
                StringBuilder sb = new StringBuilder(51);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i2);
                throw ParserException.c(sb.toString());
            }
            hp5Var.z((int) j);
            y21VarB = y21.b(hp5Var, qygVar);
        }
    }

    public static final void d(esg esgVar) {
        esgVar.b(1, new a28(4));
        esgVar.d(HttpStatus.SC_GATEWAY_TIMEOUT, new yv6(5));
        esgVar.d(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED, new yv6(6));
        esgVar.d(484, new yv6(7));
    }
}
