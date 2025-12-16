package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* loaded from: classes2.dex */
public final class i21 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;

    public gs3 a() {
        return new gs3(this.b, this.c, (String[]) this.d, (String[]) this.e);
    }

    public void b(q93... q93VarArr) throws CloneNotSupportedException {
        if (!this.b) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(q93VarArr.length);
        for (q93 q93Var : q93VarArr) {
            arrayList.add(q93Var.a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) throws CloneNotSupportedException {
        if (!this.b) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object objClone = strArr.clone();
        if (objClone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        this.d = (String[]) objClone;
    }

    public void d(qbg... qbgVarArr) throws CloneNotSupportedException {
        if (!this.b) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(qbgVarArr.length);
        for (qbg qbgVar : qbgVarArr) {
            arrayList.add(qbgVar.a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void e(String... strArr) throws CloneNotSupportedException {
        if (!this.b) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object objClone = strArr.clone();
        if (objClone == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
        }
        this.e = (String[]) objClone;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sbN = az1.n("CodecInfo{type=", (this.b ? "Video" : "Audio").concat(this.c ? "Decoder" : "Encoder"), ", configurationFormat=");
                sbN.append((String) this.d);
                sbN.append(", name=");
                return u45.l(sbN, (String) this.e, '}');
            default:
                return super.toString();
        }
    }

    public i21(b7d b7dVar, CallAnalyticsSender callAnalyticsSender) {
        this.a = 0;
        this.d = b7dVar;
        this.e = callAnalyticsSender;
        callAnalyticsSender.setIdle(this.c);
    }

    public i21(String str, String str2, boolean z, boolean z2) {
        this.a = 2;
        this.d = str;
        this.b = z;
        this.c = z2;
        this.e = str2;
    }

    public i21(int i) {
        this.a = i;
        switch (i) {
            case 3:
                break;
            default:
                this.b = true;
                break;
        }
    }
}
