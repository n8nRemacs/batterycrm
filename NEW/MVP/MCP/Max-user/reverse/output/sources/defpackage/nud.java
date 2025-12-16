package defpackage;

import android.os.Parcel;
import android.view.MenuItem;
import android.view.ViewGroup;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.msgpack.core.buffer.OutputStreamBufferOutput;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException;

/* loaded from: classes2.dex */
public final class nud implements mud, xe7, wwg, ezf, zbg, gu3, ikd {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ nud() {
        this.a = 6;
    }

    public static bj a(long j, gud gudVar) throws IOException {
        if (gudVar == null) {
            throw new IllegalArgumentException("Illegal 'command' value: null");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            il9 il9Var = kl9.b;
            il9Var.getClass();
            ll9 ll9Var = new ll9(new OutputStreamBufferOutput(byteArrayOutputStream, 8192), il9Var);
            try {
                h(ll9Var, j, gudVar);
                ll9Var.close();
                return new bj(2, byteArrayOutputStream.toByteArray());
            } finally {
            }
        } catch (JSONException e) {
            throw new IllegalArgumentException("Unable to serialize command: " + gudVar.getClass(), e);
        }
    }

    public static void h(ll9 ll9Var, long j, gud gudVar) {
        if (gudVar instanceof qmd) {
            qmd qmdVar = (qmd) gudVar;
            ll9Var.l(1);
            ll9Var.l(0);
            ll9Var.w(j);
            ll9Var.w(qmdVar.b);
            ll9Var.w(qmdVar.a);
            return;
        }
        if (!(gudVar instanceof atg)) {
            if (gudVar instanceof and) {
                ll9Var.l(3);
                ll9Var.l(0);
                ll9Var.w(j);
                ll9Var.h0(((and) gudVar).a ? (byte) -61 : (byte) -62);
                return;
            }
            if (!(gudVar instanceof omd)) {
                throw new IllegalArgumentException("No serializer for command: " + j + " " + gudVar.getClass());
            }
            omd omdVar = (omd) gudVar;
            ll9Var.l(4);
            ll9Var.l(0);
            ll9Var.w(j);
            ll9Var.w(omdVar.a);
            ll9Var.w(omdVar.b);
            return;
        }
        atg atgVar = (atg) gudVar;
        ll9Var.l(0);
        ll9Var.l(0);
        ll9Var.w(j);
        boolean z = atgVar.b;
        ArrayList arrayList = atgVar.a;
        ll9Var.h0(z ? (byte) -61 : (byte) -62);
        int size = arrayList.size();
        if (size == 0) {
            ll9Var.h0((byte) -64);
        } else {
            ll9Var.i(size * 2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jfe jfeVar = (jfe) it.next();
                ll9Var.Q(paj.H(jfeVar));
                ife ifeVar = jfeVar.b;
                if (ifeVar.a) {
                    ll9Var.l(1);
                } else {
                    ll9Var.l(0);
                    ll9Var.h0((byte) -64);
                    ll9Var.l(ifeVar.b);
                    ll9Var.l(ifeVar.c);
                    ll9Var.l(az1.v(ifeVar.d));
                }
            }
        }
        ll9Var.h0((byte) -64);
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        a7d a7dVar = (a7d) obj;
        y87 y87Var = (y87) this.b;
        long msSinceBoot = ((y8g) y87Var.j).getMsSinceBoot();
        for (Map.Entry entry : ((HashMap) y87Var.c).entrySet()) {
            udf udfVar = (udf) entry.getKey();
            y9i y9iVar = (y9i) entry.getValue();
            if ((y9iVar.b.toMillis(y9iVar.a) + y9iVar.c) - 10 < msSinceBoot) {
                y9iVar.c = msSinceBoot;
                udfVar.a(a7dVar);
            }
        }
    }

    @Override // defpackage.mud
    public v32 b(int i, byte[] bArr) throws RtcCommandSerializeException {
        try {
            return c(i, bArr);
        } catch (Throwable th) {
            throw new RtcCommandSerializeException(null, false, th);
        }
    }

    public v32 c(int i, byte[] bArr) {
        if (i == 0) {
            throw new IllegalArgumentException("Illegal 'format' value: null");
        }
        if (i != 2) {
            throw new UnsupportedOperationException("Only binary format is supported");
        }
        try {
            tm9 tm9VarA = kl9.a(bArr);
            try {
                int iS0 = tm9VarA.s0();
                int iS02 = tm9VarA.s0();
                int iS03 = tm9VarA.s0();
                if (iS02 != 0) {
                    throw new UnsupportedOperationException("Unsupported version: " + iS02 + " for command " + iS0);
                }
                if (iS03 == 0) {
                    v32 v32Var = iS0 != 0 ? iS0 != 1 ? null : new v32(tm9VarA.t0(), new rmd(Integer.valueOf(tm9VarA.s0())), 11) : g(tm9VarA);
                    tm9VarA.close();
                    return v32Var;
                }
                throw new IllegalArgumentException("Error code " + iS03 + " for command " + iS0);
            } finally {
            }
        } catch (Throwable th) {
            throw new IllegalArgumentException("Unable to decode command body: ".concat(h27.a(bArr)), th);
        }
    }

    @Override // defpackage.ezf
    public void d(l0g l0gVar) {
        j1g j1gVar = (j1g) this.b;
        j1gVar.b().a(new aee(j1gVar, 24, l0gVar));
    }

    @Override // defpackage.ezf
    public void e(pzf pzfVar) {
        j1g j1gVar = (j1g) this.b;
        j1gVar.b().a(new p0g(j1gVar, pzfVar, 2));
    }

    @Override // defpackage.xe7
    public void f() {
        nef nefVar = (nef) this.b;
        nefVar.a(nefVar.f, new Exception("onDownloadFailed"));
    }

    public v32 g(tm9 tm9Var) throws IOException {
        nt1 nt1VarJ;
        long jT0 = tm9Var.t0();
        HashMap map = new HashMap();
        int iU0 = tm9Var.u0();
        for (int i = 0; i < iU0; i++) {
            if (tm9Var.w().a() == 5) {
                String strW0 = tm9Var.w0();
                nt1VarJ = paj.J(strW0);
                if (nt1VarJ == null) {
                    throw new IllegalArgumentException("Not found video track participant key for ".concat(strW0));
                }
            } else {
                int iS0 = tm9Var.s0();
                nt1VarJ = (nt1) ((ConcurrentHashMap) ((y6i) this.b).b).get(Integer.valueOf(iS0));
                if (nt1VarJ == null) {
                    throw new IllegalArgumentException(ho7.f(iS0, "Not found video track participant key for "));
                }
            }
            map.put(nt1VarJ, tm9Var.s0() == -1 ? btg.b : btg.a);
        }
        return new v32(jT0, new ctg(map), 11);
    }

    @Override // defpackage.ezf
    public long k() {
        return 0L;
    }

    @Override // defpackage.pn5
    public c8a o() {
        return (x8a) this.b;
    }

    @Override // defpackage.zbg
    public boolean onMenuItemClick(MenuItem menuItem) {
        return ((acg) this.b).b.onMenuItemSelected(0, menuItem);
    }

    @Override // defpackage.wwg
    public xwg q() {
        return new xlf(fjb.a((x8a) this.b));
    }

    @Override // defpackage.xe7
    public void t(String str) {
        nef nefVar = (nef) this.b;
        rx rxVar = nefVar.f;
        File file = new File(str);
        if (nefVar.b) {
            return;
        }
        rxVar.f(file);
        rxVar.b();
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ServerSettings(" + new JSONObject((Map) this.b) + ")";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mud
    public bj z(long j, gud gudVar) throws RtcCommandSerializeException {
        try {
            return a(j, gudVar);
        } catch (Throwable th) {
            throw new RtcCommandSerializeException(Long.valueOf(j), false, th);
        }
    }

    public /* synthetic */ nud(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ nud(bci bciVar, bm bmVar) {
        this.a = 10;
        this.b = bmVar;
    }

    public nud(Map map) {
        this.a = 1;
        this.b = map;
        map.get("chats-list-promo-link-enabled");
    }

    public nud(ViewGroup viewGroup) {
        this.a = 7;
        this.b = viewGroup.getOverlay();
    }

    public nud(x8a x8aVar) {
        Object objF;
        this.a = 3;
        this.b = x8aVar;
        Object objF2 = null;
        try {
            objF = x8aVar.f(a2g.f0);
        } catch (IllegalArgumentException unused) {
            objF = null;
        }
        Class cls = (Class) objF;
        if (cls != null && !cls.equals(wlf.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        ((x8a) this.b).n(xwg.p0, zwg.o);
        x8a x8aVar2 = (x8a) this.b;
        x8aVar2.n(a2g.f0, wlf.class);
        try {
            objF2 = x8aVar2.f(a2g.e0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objF2 == null) {
            x8aVar2.n(a2g.e0, wlf.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // defpackage.ikd
    public void accept(Object obj, Object obj2) {
        eci eciVar = new eci((n2g) obj2, 1);
        pbi pbiVar = (pbi) ((hci) obj).o();
        bm bmVar = (bm) this.b;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(pbiVar.e);
        int i = cbi.a;
        parcelObtain.writeStrongBinder(eciVar);
        cbi.c(parcelObtain, bmVar);
        parcelObtain.writeStrongBinder(null);
        pbiVar.i(parcelObtain, 2);
    }
}
