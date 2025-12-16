package defpackage;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class js3 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final int a;
    public final int b;
    public final eb7 c;
    public final PendingIntent d;
    public final bie e;
    public final o3c f;
    public final o3c g;
    public final Bundle h;
    public final Bundle i;
    public final q4c j;
    public final wg7 k;
    public final wg7 l;
    public final MediaSession.Token m;
    public final wg7 n;

    static {
        String str = zxg.a;
        o = Integer.toString(0, 36);
        p = Integer.toString(1, 36);
        q = Integer.toString(2, 36);
        r = Integer.toString(9, 36);
        s = Integer.toString(14, 36);
        t = Integer.toString(13, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(11, 36);
        z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(12, 36);
    }

    public js3(int i, int i2, eb7 eb7Var, PendingIntent pendingIntent, wg7 wg7Var, wg7 wg7Var2, wg7 wg7Var3, bie bieVar, o3c o3cVar, o3c o3cVar2, Bundle bundle, Bundle bundle2, q4c q4cVar, MediaSession.Token token) {
        this.a = i;
        this.b = i2;
        this.c = eb7Var;
        this.d = pendingIntent;
        this.k = wg7Var;
        this.l = wg7Var2;
        this.n = wg7Var3;
        this.e = bieVar;
        this.f = o3cVar;
        this.g = o3cVar2;
        this.h = bundle;
        this.i = bundle2;
        this.j = q4cVar;
        this.m = token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [eb7] */
    public static js3 a(Bundle bundle) {
        zjd zjdVarI;
        zjd zjdVarI2;
        zjd zjdVarI3;
        cb7 cb7Var;
        IBinder binder = bundle.getBinder(B);
        if (binder instanceof is3) {
            return ((is3) binder).c;
        }
        int i = bundle.getInt(o, 0);
        int i2 = bundle.getInt(A, 0);
        IBinder binder2 = bundle.getBinder(p);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(q);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(r);
        if (parcelableArrayList != null) {
            tg7 tg7VarI = wg7.i();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                bundle2.getClass();
                tg7VarI.a(bg3.d(i2, bundle2));
            }
            zjdVarI = tg7VarI.i();
        } else {
            t76 t76Var = wg7.b;
            zjdVarI = zjd.o;
        }
        zjd zjdVar = zjdVarI;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(s);
        if (parcelableArrayList2 != null) {
            tg7 tg7VarI2 = wg7.i();
            for (int i4 = 0; i4 < parcelableArrayList2.size(); i4++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i4);
                bundle3.getClass();
                tg7VarI2.a(bg3.d(i2, bundle3));
            }
            zjdVarI2 = tg7VarI2.i();
        } else {
            t76 t76Var2 = wg7.b;
            zjdVarI2 = zjd.o;
        }
        zjd zjdVar2 = zjdVarI2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(t);
        if (parcelableArrayList3 != null) {
            tg7 tg7VarI3 = wg7.i();
            for (int i5 = 0; i5 < parcelableArrayList3.size(); i5++) {
                Bundle bundle4 = (Bundle) parcelableArrayList3.get(i5);
                bundle4.getClass();
                tg7VarI3.a(bg3.d(i2, bundle4));
            }
            zjdVarI3 = tg7VarI3.i();
        } else {
            t76 t76Var3 = wg7.b;
            zjdVarI3 = zjd.o;
        }
        zjd zjdVar3 = zjdVarI3;
        Bundle bundle5 = bundle.getBundle(u);
        bie bieVarA = bundle5 == null ? bie.b : bie.a(bundle5);
        Bundle bundle6 = bundle.getBundle(w);
        o3c o3cVarB = bundle6 == null ? o3c.b : o3c.b(bundle6);
        Bundle bundle7 = bundle.getBundle(v);
        o3c o3cVarB2 = bundle7 == null ? o3c.b : o3c.b(bundle7);
        Bundle bundle8 = bundle.getBundle(x);
        Bundle bundle9 = bundle.getBundle(y);
        Bundle bundle10 = bundle.getBundle(z);
        q4c q4cVarM = bundle10 == null ? q4c.F : q4c.m(i2, bundle10);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(C);
        Bundle bundle11 = bundle9;
        int i6 = z89.h;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof eb7)) {
            cb7 cb7Var2 = new cb7();
            cb7Var2.c = iBinder;
            cb7Var = cb7Var2;
        } else {
            cb7Var = (eb7) iInterfaceQueryLocalInterface;
        }
        if (bundle8 == null) {
            bundle8 = Bundle.EMPTY;
        }
        Bundle bundle12 = bundle8;
        if (bundle11 == null) {
            bundle11 = Bundle.EMPTY;
        }
        return new js3(i, i2, cb7Var, pendingIntent, zjdVar, zjdVar2, zjdVar3, bieVarA, o3cVarB2, o3cVarB, bundle12, bundle11, q4cVarM, token);
    }

    public final Bundle b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(o, this.a);
        bundle.putBinder(p, this.c.asBinder());
        bundle.putParcelable(q, this.d);
        wg7 wg7Var = this.k;
        boolean zIsEmpty = wg7Var.isEmpty();
        String str = r;
        if (!zIsEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(wg7Var.size());
            Iterator<E> it = wg7Var.iterator();
            while (it.hasNext()) {
                arrayList.add(((bg3) it.next()).g());
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        wg7 wg7Var2 = this.l;
        if (!wg7Var2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(wg7Var2.size());
                Iterator<E> it2 = wg7Var2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((bg3) it2.next()).g());
                }
                bundle.putParcelableArrayList(s, arrayList2);
            } else {
                zjd zjdVarE = bg3.e(wg7Var2, true, true);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(zjdVarE.d);
                t76 t76VarListIterator = zjdVarE.listIterator(0);
                while (t76VarListIterator.hasNext()) {
                    arrayList3.add(((bg3) t76VarListIterator.next()).g());
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        wg7 wg7Var3 = this.n;
        if (!wg7Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(wg7Var3.size());
            Iterator<E> it3 = wg7Var3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((bg3) it3.next()).g());
            }
            bundle.putParcelableArrayList(t, arrayList4);
        }
        bie bieVar = this.e;
        bieVar.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        rrg it4 = bieVar.a.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((aie) it4.next()).b());
        }
        bundle2.putParcelableArrayList(bie.c, arrayList5);
        bundle.putBundle(u, bundle2);
        String str2 = v;
        o3c o3cVar = this.f;
        bundle.putBundle(str2, o3cVar.c());
        String str3 = w;
        o3c o3cVar2 = this.g;
        bundle.putBundle(str3, o3cVar2.c());
        bundle.putBundle(x, this.h);
        bundle.putBundle(y, this.i);
        bundle.putBundle(z, this.j.l(rei.d(o3cVar, o3cVar2), false, false).o(i));
        bundle.putInt(A, this.b);
        MediaSession.Token token = this.m;
        if (token != null) {
            bundle.putParcelable(C, token);
        }
        return bundle;
    }
}
