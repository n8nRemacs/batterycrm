package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class zz8 implements om6, kw0, n79, y89, fu3, x89 {
    public final /* synthetic */ int a;

    public /* synthetic */ zz8(int i) {
        this.a = i;
    }

    @Override // defpackage.n79
    public void a(t69 t69Var, int i) {
        switch (this.a) {
            case 4:
                t69Var.getClass();
                break;
            case 5:
                t69Var.b(i);
                break;
            default:
                t69Var.getClass();
                break;
        }
    }

    @Override // defpackage.fu3
    public void accept(Object obj) {
        a5c a5cVar = (a5c) obj;
        switch (this.a) {
            case 9:
                a5cVar.T();
                break;
            case 10:
                a5cVar.b0();
                break;
            case 11:
                a5cVar.M();
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                a5cVar.W();
                break;
            case 13:
            case 16:
            case 19:
            case 20:
            case 22:
            case 23:
            case 25:
            default:
                a5cVar.m0();
                a5cVar.a.b0();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                a5cVar.c0();
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                a5cVar.d0();
                break;
            case LangUtils.HASH_SEED /* 17 */:
                a5cVar.X();
                break;
            case 18:
                a5cVar.a0();
                break;
            case 21:
                a5cVar.o();
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                a5cVar.l0();
                break;
            case 26:
                a5cVar.prepare();
                break;
            case 27:
                a5cVar.k();
                break;
        }
    }

    @Override // defpackage.om6, defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ilf ilfVar = (ilf) obj;
                ilfVar.getClass();
                Bundle bundle = new Bundle();
                int i = ilfVar.a;
                if (i != 0) {
                    bundle.putInt(ilf.d, i);
                }
                int i2 = ilfVar.b;
                if (i2 != 0) {
                    bundle.putInt(ilf.o, i2);
                }
                int i3 = ilfVar.c;
                if (i3 != 0) {
                    bundle.putInt(ilf.X, i3);
                }
                return bundle;
            case 1:
                g09 g09Var = (g09) obj;
                g09Var.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(g09.h, g09Var.a);
                String str = g09Var.b;
                if (str != null) {
                    bundle2.putString(g09.i, str);
                }
                String str2 = g09Var.c;
                if (str2 != null) {
                    bundle2.putString(g09.j, str2);
                }
                int i4 = g09Var.d;
                if (i4 != 0) {
                    bundle2.putInt(g09.k, i4);
                }
                int i5 = g09Var.e;
                if (i5 != 0) {
                    bundle2.putInt(g09.l, i5);
                }
                String str3 = g09Var.f;
                if (str3 != null) {
                    bundle2.putString(g09.m, str3);
                }
                String str4 = g09Var.g;
                if (str4 != null) {
                    bundle2.putString(g09.n, str4);
                }
                return bundle2;
            default:
                Bundle bundle3 = (Bundle) obj;
                Uri uri = (Uri) bundle3.getParcelable(g09.h);
                uri.getClass();
                String string = bundle3.getString(g09.i);
                String string2 = bundle3.getString(g09.j);
                int i6 = bundle3.getInt(g09.k, 0);
                int i7 = bundle3.getInt(g09.l, 0);
                String string3 = bundle3.getString(g09.m);
                String string4 = bundle3.getString(g09.n);
                bl3 bl3Var = new bl3();
                bl3Var.d = uri;
                bl3Var.a = xz9.n(string);
                bl3Var.e = string2;
                bl3Var.b = i6;
                bl3Var.c = i7;
                bl3Var.f = string3;
                bl3Var.g = string4;
                return new g09(bl3Var);
        }
    }

    @Override // defpackage.x89
    public void b(a5c a5cVar, u69 u69Var, List list) {
        switch (this.a) {
            case 20:
                a5cVar.c(list);
                break;
            default:
                a5cVar.c(list);
                break;
        }
    }

    @Override // defpackage.kw0
    public lw0 e(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        t19 t19Var = new t19();
        t19Var.a = bundle.getCharSequence(Integer.toString(0, 36));
        t19Var.b = bundle.getCharSequence(Integer.toString(1, 36));
        t19Var.c = bundle.getCharSequence(Integer.toString(2, 36));
        t19Var.d = bundle.getCharSequence(Integer.toString(3, 36));
        t19Var.e = bundle.getCharSequence(Integer.toString(4, 36));
        t19Var.f = bundle.getCharSequence(Integer.toString(5, 36));
        t19Var.g = bundle.getCharSequence(Integer.toString(6, 36));
        t19Var.h = (Uri) bundle.getParcelable(Integer.toString(7, 36));
        byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
        Integer numValueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
        t19Var.k = byteArray != null ? (byte[]) byteArray.clone() : null;
        t19Var.l = numValueOf;
        t19Var.m = (Uri) bundle.getParcelable(Integer.toString(11, 36));
        t19Var.x = bundle.getCharSequence(Integer.toString(22, 36));
        t19Var.y = bundle.getCharSequence(Integer.toString(23, 36));
        t19Var.z = bundle.getCharSequence(Integer.toString(24, 36));
        t19Var.C = bundle.getCharSequence(Integer.toString(27, 36));
        t19Var.D = bundle.getCharSequence(Integer.toString(28, 36));
        t19Var.E = bundle.getCharSequence(Integer.toString(30, 36));
        t19Var.F = bundle.getBundle(Integer.toString(1000, 36));
        boolean zContainsKey = bundle.containsKey(Integer.toString(8, 36));
        iqa iqaVar = f8d.a;
        if (zContainsKey && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
            t19Var.i = (f8d) iqaVar.e(bundle3);
        }
        if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
            t19Var.j = (f8d) iqaVar.e(bundle2);
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            t19Var.n = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            t19Var.o = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
        }
        if (bundle.containsKey(Integer.toString(14, 36))) {
            t19Var.p = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            t19Var.q = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            t19Var.r = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
        }
        if (bundle.containsKey(Integer.toString(17, 36))) {
            t19Var.s = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
        }
        if (bundle.containsKey(Integer.toString(18, 36))) {
            t19Var.t = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
        }
        if (bundle.containsKey(Integer.toString(19, 36))) {
            t19Var.u = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
        }
        if (bundle.containsKey(Integer.toString(20, 36))) {
            t19Var.v = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
        }
        if (bundle.containsKey(Integer.toString(21, 36))) {
            t19Var.w = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
        }
        if (bundle.containsKey(Integer.toString(25, 36))) {
            t19Var.A = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
        }
        if (bundle.containsKey(Integer.toString(26, 36))) {
            t19Var.B = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
        }
        return new v19(t19Var);
    }

    @Override // defpackage.y89
    public Object n(o79 o79Var, u69 u69Var, int i) {
        switch (this.a) {
            case 7:
                o79Var.getClass();
                throw new ClassCastException();
            case 8:
                o79Var.getClass();
                throw new ClassCastException();
            case 13:
                return o79Var.n(u69Var);
            case 16:
                o79Var.getClass();
                throw new ClassCastException();
            case 19:
                usd usdVar = o79Var.e;
                o79Var.t(u69Var);
                usdVar.getClass();
                return a6a.c(new yie(-6));
            case 23:
                o79Var.getClass();
                throw new ClassCastException();
            case 25:
                o79Var.getClass();
                throw new ClassCastException();
            default:
                o79Var.getClass();
                throw new ClassCastException();
        }
    }

    public /* synthetic */ zz8(Object obj, int i, Object obj2) {
        this.a = i;
    }
}
