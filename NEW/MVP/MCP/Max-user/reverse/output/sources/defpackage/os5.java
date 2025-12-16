package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.sdk.api.GetAnonymTokenByLinkRequest;
import ru.ok.android.externcalls.sdk.api.JoinByLinkResponse;
import ru.ok.android.externcalls.sdk.api.request.JoinConversation;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class os5 implements gu3, tm6, o44, rl3, lp5, kw0, om6, ox7, hc7, ic7, o7c, m7c {
    public final /* synthetic */ int a;

    public /* synthetic */ os5(int i) {
        this.a = i;
    }

    @Override // defpackage.hc7, defpackage.ic7
    public boolean a(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
        }
        return false;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                wqi.e("ps5", "publishFavoritesIds: failed", (Throwable) obj);
                break;
            default:
                x00 x00Var = (x00) obj;
                x00Var.i = p10.d;
                x00Var.k = 0.0f;
                x00Var.p = 0L;
                x00Var.o = 0L;
                break;
        }
    }

    @Override // defpackage.o7c
    /* renamed from: apply, reason: collision with other method in class */
    public boolean mo44apply(Object obj) {
        CancellationException cancellationException = df7.l;
        return true;
    }

    @Override // defpackage.lp5
    public gp5[] c() {
        switch (this.a) {
            case 11:
                return new gp5[]{new t16()};
            default:
                return new gp5[]{new y76()};
        }
    }

    @Override // defpackage.kw0
    public lw0 e(Bundle bundle) {
        switch (this.a) {
            case 13:
                gf6 gf6Var = gf6.Q0;
                ef6 ef6Var = new ef6();
                if (bundle != null) {
                    ClassLoader classLoader = mw0.class.getClassLoader();
                    int i = xxg.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Integer.toString(0, 36));
                String str = gf6Var.a;
                if (string == null) {
                    string = str;
                }
                ef6Var.a = string;
                String string2 = bundle.getString(Integer.toString(1, 36));
                String str2 = gf6Var.b;
                if (string2 == null) {
                    string2 = str2;
                }
                ef6Var.b = string2;
                String string3 = bundle.getString(Integer.toString(2, 36));
                String str3 = gf6Var.c;
                if (string3 == null) {
                    string3 = str3;
                }
                ef6Var.c = string3;
                ef6Var.d = bundle.getInt(Integer.toString(3, 36), gf6Var.d);
                ef6Var.e = bundle.getInt(Integer.toString(4, 36), gf6Var.o);
                ef6Var.f = bundle.getInt(Integer.toString(5, 36), gf6Var.X);
                ef6Var.g = bundle.getInt(Integer.toString(6, 36), gf6Var.Y);
                String string4 = bundle.getString(Integer.toString(7, 36));
                String str4 = gf6Var.s0;
                if (string4 == null) {
                    string4 = str4;
                }
                ef6Var.h = string4;
                sy9 sy9Var = (sy9) bundle.getParcelable(Integer.toString(8, 36));
                sy9 sy9Var2 = gf6Var.t0;
                if (sy9Var == null) {
                    sy9Var = sy9Var2;
                }
                ef6Var.i = sy9Var;
                String string5 = bundle.getString(Integer.toString(9, 36));
                String str5 = gf6Var.u0;
                if (string5 == null) {
                    string5 = str5;
                }
                ef6Var.j = string5;
                String string6 = bundle.getString(Integer.toString(10, 36));
                String str6 = gf6Var.v0;
                if (string6 == null) {
                    string6 = str6;
                }
                ef6Var.k = string6;
                ef6Var.l = bundle.getInt(Integer.toString(11, 36), gf6Var.w0);
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (true) {
                    String string7 = Integer.toString(12, 36);
                    String string8 = Integer.toString(i2, 36);
                    StringBuilder sb = new StringBuilder(u45.f(u45.f(1, string7), string8));
                    sb.append(string7);
                    sb.append("_");
                    sb.append(string8);
                    byte[] byteArray = bundle.getByteArray(sb.toString());
                    if (byteArray == null) {
                        ef6Var.m = arrayList;
                        ef6Var.n = (x45) bundle.getParcelable(Integer.toString(13, 36));
                        ef6Var.o = bundle.getLong(Integer.toString(14, 36), gf6Var.z0);
                        ef6Var.p = bundle.getInt(Integer.toString(15, 36), gf6Var.A0);
                        ef6Var.q = bundle.getInt(Integer.toString(16, 36), gf6Var.B0);
                        ef6Var.r = bundle.getFloat(Integer.toString(17, 36), gf6Var.C0);
                        ef6Var.s = bundle.getInt(Integer.toString(18, 36), gf6Var.D0);
                        ef6Var.t = bundle.getFloat(Integer.toString(19, 36), gf6Var.E0);
                        ef6Var.u = bundle.getByteArray(Integer.toString(20, 36));
                        ef6Var.v = bundle.getInt(Integer.toString(21, 36), gf6Var.G0);
                        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
                        ef6Var.w = bundle2 == null ? null : new ff3(bundle2.getInt(Integer.toString(0, 36), -1), bundle2.getInt(Integer.toString(1, 36), -1), bundle2.getInt(Integer.toString(2, 36), -1), bundle2.getByteArray(Integer.toString(3, 36)));
                        ef6Var.x = bundle.getInt(Integer.toString(23, 36), gf6Var.I0);
                        ef6Var.y = bundle.getInt(Integer.toString(24, 36), gf6Var.J0);
                        ef6Var.z = bundle.getInt(Integer.toString(25, 36), gf6Var.K0);
                        ef6Var.A = bundle.getInt(Integer.toString(26, 36), gf6Var.L0);
                        ef6Var.B = bundle.getInt(Integer.toString(27, 36), gf6Var.M0);
                        ef6Var.C = bundle.getInt(Integer.toString(28, 36), gf6Var.N0);
                        ef6Var.D = bundle.getInt(Integer.toString(29, 36), gf6Var.O0);
                        return new gf6(ef6Var);
                    }
                    arrayList.add(byteArray);
                    i2++;
                }
            default:
                fsi.b(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new z17(bundle.getBoolean(Integer.toString(2, 36), false)) : new z17();
        }
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(v6dVar);
    }

    @Override // defpackage.ox7
    public Object parse(xx7 xx7Var) {
        switch (this.a) {
            case 16:
                return GetAnonymTokenByLinkRequest.lambda$static$0(xx7Var);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return JoinByLinkResponse.lambda$static$0(xx7Var);
            case 25:
                return JoinConversation.Response.PARSER$lambda$0(xx7Var);
            case 26:
                return Boolean.valueOf(xx7Var.W());
            default:
                return xx7Var.B();
        }
    }

    @Override // defpackage.o44
    public Object s(Task task) throws IOException {
        int i;
        Object obj;
        switch (this.a) {
            case 2:
                i = HttpStatus.SC_FORBIDDEN;
                break;
            case 3:
                i = -1;
                break;
            default:
                ybj ybjVar = (ybj) task;
                synchronized (ybjVar.a) {
                    s5j.i("Task is not yet complete", ybjVar.c);
                    if (ybjVar.d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(ybjVar.f)) {
                        throw ((Throwable) IOException.class.cast(ybjVar.f));
                    }
                    Exception exc = ybjVar.f;
                    if (exc != null) {
                        throw new RuntimeExecutionException(exc);
                    }
                    obj = ybjVar.e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString(NegotiationErrorStat.KEY_ERROR);
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 28:
                return "join".equalsIgnoreCase(str);
            default:
                return "u".equalsIgnoreCase(str);
        }
    }

    public /* synthetic */ os5(int i, Object obj) {
        this.a = i;
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return ((is5) obj).a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                r08 r08Var = (r08) obj;
                return r08Var.a + ": " + r08Var.b;
            default:
                i67 i67Var = (i67) obj;
                i67Var.e();
                return wg7.j(lqi.d(new o9g(4), i67Var.S0.b));
        }
    }
}
