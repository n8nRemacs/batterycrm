package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import java.security.Principal;
import java.security.cert.X509Certificate;
import java.util.Date;

/* loaded from: classes.dex */
public abstract class jib {
    public static final nme a = new nme("DISK_USAGE", 1);

    public static StringBuilder a(StringBuilder sb, X509Certificate x509Certificate) {
        Principal subjectDN = x509Certificate.getSubjectDN();
        if (subjectDN != null) {
            sb.append("subjectDN=");
            sb.append(subjectDN.getName());
            sb.append(';');
            sb.append(' ');
        }
        Principal issuerDN = x509Certificate.getIssuerDN();
        if (issuerDN != null) {
            sb.append("issuerDN=");
            sb.append(issuerDN.getName());
            sb.append(';');
            sb.append(' ');
        }
        Date notBefore = x509Certificate.getNotBefore();
        if (notBefore != null) {
            sb.append("notBefore=");
            sb.append(notBefore);
            sb.append(';');
            sb.append(' ');
        }
        Date notAfter = x509Certificate.getNotAfter();
        if (notAfter != null) {
            sb.append("notAfter=");
            sb.append(notAfter);
            sb.append(';');
            sb.append(' ');
        }
        return sb;
    }

    public static Drawable b(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    public static vtd c(hr6 hr6Var) {
        if (hr6Var.p == null) {
            hr6Var.p = new vtd();
        }
        return hr6Var.p;
    }

    public static e9j d(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return tyd.i;
            case 1:
                return tyd.h;
            case 2:
                return tyd.f;
            case 3:
                return tyd.g;
            case 4:
                return tyd.b;
            case 5:
                return tyd.d;
            case 6:
                return tyd.c;
            case 7:
                return tyd.j;
            case 8:
                return tyd.e;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }
}
