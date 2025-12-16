package androidx.media3.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.media3.common.H;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23119j;
import androidx.media3.common.util.r;
import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.C23213d;
import androidx.media3.session.C23240m;
import androidx.media3.session.C23257s;
import androidx.media3.session.D1;
import androidx.media3.session.InterfaceC23243n;
import androidx.media3.session.L1;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class M1 implements InterfaceC23096j.a, C23240m.d, InterfaceC23119j, r.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52145b;

    public /* synthetic */ M1(int i12) {
        this.f52145b = i12;
    }

    public static InterfaceC23243n a(String str, Parcel parcel) {
        parcel.enforceInterface(str);
        return InterfaceC23243n.b.e4(parcel.readStrongBinder());
    }

    public static D1.a b(D1 d12, D1 d13) {
        d12.getClass();
        return new D1.a(d13);
    }

    @Override // androidx.media3.common.util.InterfaceC23119j
    public void accept(Object obj) {
        C23257s.b bVar = (C23257s.b) obj;
        switch (this.f52145b) {
            case 7:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    @Override // androidx.media3.common.InterfaceC23096j.a
    public InterfaceC23096j fromBundle(Bundle bundle) {
        switch (this.f52145b) {
            case 0:
                Bundle bundle2 = bundle.getBundle(N1.f52179n);
                return new N1(bundle2 == null ? N1.f52177l : (H.k) H.k.f47253r.fromBundle(bundle2), bundle.getBoolean(N1.f52180o, false), bundle.getLong(N1.f52181p, -9223372036854775807L), bundle.getLong(N1.f52182q, -9223372036854775807L), bundle.getLong(N1.f52183r, 0L), bundle.getInt(N1.f52184s, 0), bundle.getLong(N1.f52185t, 0L), bundle.getLong(N1.f52186u, -9223372036854775807L), bundle.getLong(N1.f52187v, -9223372036854775807L), bundle.getLong(N1.f52188w, 0L));
            case 1:
                String str = Q1.f52244k;
                C23110a.a("uid should be set.", bundle.containsKey(str));
                int i12 = bundle.getInt(str);
                String str2 = Q1.f52245l;
                C23110a.a("type should be set.", bundle.containsKey(str2));
                int i13 = bundle.getInt(str2);
                int i14 = bundle.getInt(Q1.f52246m, 0);
                int i15 = bundle.getInt(Q1.f52252s, 0);
                String string = bundle.getString(Q1.f52247n);
                if (TextUtils.isEmpty(string)) {
                    throw new IllegalArgumentException("package name should be set.");
                }
                String string2 = bundle.getString(Q1.f52248o, "");
                IBinder binder = bundle.getBinder(Q1.f52250q);
                ComponentName componentName = (ComponentName) bundle.getParcelable(Q1.f52249p);
                Bundle bundle3 = bundle.getBundle(Q1.f52251r);
                if (bundle3 == null) {
                    bundle3 = Bundle.EMPTY;
                }
                return new Q1(i12, i13, i14, i15, string, string2, componentName, binder, bundle3);
            case 2:
                Bundle bundle4 = bundle.getBundle(R1.f52266h);
                MediaSessionCompat.Token tokenFromBundle = bundle4 == null ? null : MediaSessionCompat.Token.fromBundle(bundle4);
                String str3 = R1.f52267i;
                C23110a.a("uid should be set.", bundle.containsKey(str3));
                int i16 = bundle.getInt(str3);
                String str4 = R1.f52268j;
                C23110a.a("type should be set.", bundle.containsKey(str4));
                int i17 = bundle.getInt(str4);
                ComponentName componentName2 = (ComponentName) bundle.getParcelable(R1.f52269k);
                String string3 = bundle.getString(R1.f52270l);
                if (TextUtils.isEmpty(string3)) {
                    throw new IllegalArgumentException("package name should be set.");
                }
                Bundle bundle5 = bundle.getBundle(R1.f52271m);
                if (bundle5 == null) {
                    bundle5 = Bundle.EMPTY;
                }
                return new R1(tokenFromBundle, i16, i17, componentName2, string3, bundle5);
            case 3:
                Bundle bundle6 = bundle.getBundle(C23213d.f52416h);
                K1 k12 = bundle6 == null ? null : (K1) K1.f52114j.fromBundle(bundle6);
                int i18 = bundle.getInt(C23213d.f52417i, -1);
                int i19 = bundle.getInt(C23213d.f52418j, 0);
                CharSequence charSequence = bundle.getCharSequence(C23213d.f52419k, "");
                Bundle bundle7 = bundle.getBundle(C23213d.f52420l);
                boolean z12 = bundle.getBoolean(C23213d.f52421m, false);
                C23213d.b bVar = new C23213d.b();
                if (k12 != null) {
                    C23110a.a("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", bVar.f52430b == -1);
                    bVar.f52429a = k12;
                }
                if (i18 != -1) {
                    bVar.e(i18);
                }
                bVar.f52431c = i19;
                bVar.f52432d = charSequence;
                if (bundle7 == null) {
                    bundle7 = Bundle.EMPTY;
                }
                bVar.c(bundle7);
                bVar.f52434f = z12;
                return bVar.a();
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return new P1(bundle);
            case 6:
                return C23252q.a(bundle, null);
            case 11:
                Bundle bundle8 = bundle.getBundle(AbstractServiceC23270w0.b.f52651f);
                boolean z13 = bundle.getBoolean(AbstractServiceC23270w0.b.f52652g, false);
                boolean z14 = bundle.getBoolean(AbstractServiceC23270w0.b.f52653h, false);
                boolean z15 = bundle.getBoolean(AbstractServiceC23270w0.b.f52654i, false);
                if (bundle8 == null) {
                    bundle8 = Bundle.EMPTY;
                }
                return new AbstractServiceC23270w0.b(bundle8, z13, z14, z15);
            case 12:
                return new D1.b(bundle.getBoolean(D1.b.f52032e, false), bundle.getBoolean(D1.b.f52033f, false));
            case 13:
                int i22 = bundle.getInt(K1.f52111g, 0);
                if (i22 != 0) {
                    return new K1(i22);
                }
                String string4 = bundle.getString(K1.f52112h);
                string4.getClass();
                Bundle bundle9 = bundle.getBundle(K1.f52113i);
                if (bundle9 == null) {
                    bundle9 = Bundle.EMPTY;
                }
                return new K1(bundle9, string4);
            case 14:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(L1.f52124d);
                if (parcelableArrayList == null) {
                    androidx.media3.common.util.s.g();
                    return L1.f52123c;
                }
                L1.b bVar2 = new L1.b();
                for (int i23 = 0; i23 < parcelableArrayList.size(); i23++) {
                    bVar2.f52127a.add((K1) K1.f52114j.fromBundle((Bundle) parcelableArrayList.get(i23)));
                }
                return bVar2.b();
            case 15:
                int i24 = bundle.getInt(O1.f52226e, -1);
                Bundle bundle10 = bundle.getBundle(O1.f52227f);
                long j12 = bundle.getLong(O1.f52228g, SystemClock.elapsedRealtime());
                if (bundle10 == null) {
                    bundle10 = Bundle.EMPTY;
                }
                return new O1(i24, j12, bundle10);
        }
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        ((H.g) obj).onPlaybackStateChanged(1);
    }
}
