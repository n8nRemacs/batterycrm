package defpackage;

import android.content.ComponentName;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import com.facebook.animated.gif.GifImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Objects;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class a3b implements dbd, j7a, ox7, ka, pn5, cu2, l83, rk3, aa7, qf8, bs8, h97, kof {
    public static final int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ a3b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static a3b m(ao3 ao3Var) {
        a3b a3bVar = new a3b(8);
        ao3Var.c(new i00(a3bVar, 12, ao3Var));
        return a3bVar;
    }

    @Override // defpackage.j7a
    public void A() {
        i40 i40Var = (i40) this.b;
        Long l = (Long) i40Var.g;
        l7a l7aVar = (l7a) i40Var.c;
        long j = ((b8a) l7aVar).j();
        if (l != null && l.longValue() == j) {
            return;
        }
        if (((Long) i40Var.g) == null) {
            i40Var.g = Long.valueOf(((b8a) l7aVar).j());
        }
        if (i40Var.b) {
            return;
        }
        ((jve) i40Var.d).h(new g40(new n5g(m8b.a)));
        i40Var.f();
    }

    @Override // defpackage.bbd
    public /* bridge */ /* synthetic */ Object D(Object obj, yy7 yy7Var) {
        return x(yy7Var);
    }

    @Override // defpackage.dbd
    public void O(Object obj, yy7 yy7Var, Object obj2) {
        wqi.c(a3b.class.getName(), "set new router", new Object[0]);
        this.b = (eud) obj2;
    }

    @Override // defpackage.bs8
    public void a(Object obj) {
        ((bs8) ((pr8) this.b).b).a(obj);
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void b() {
        switch (this.a) {
            case 11:
                ((v2f) this.b).a(qqg.a);
                break;
            default:
                ((bs8) ((pr8) this.b).b).b();
                break;
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void c(py4 py4Var) {
        switch (this.a) {
            case 11:
                ((v2f) this.b).c(py4Var);
                break;
            default:
                ty4.h((pr8) this.b, py4Var);
                break;
        }
    }

    @Override // defpackage.ka
    public void d(zi1 zi1Var, boolean z) {
        CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) this.b;
        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
        ((v11) ((z01) callOpponentsListWidget.E0().s0.getValue())).c(zi1Var, z);
    }

    @Override // defpackage.j7a
    public void e() {
        ((i40) this.b).f();
    }

    @Override // defpackage.kof
    public boolean f(hf6 hf6Var) {
        String str = hf6Var.n;
        return ((b6a) this.b).f(hf6Var) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
    }

    @Override // defpackage.j7a
    public void g() {
    }

    @Override // defpackage.aa7
    public long getContentLength() {
        return ((File) this.b).length();
    }

    @Override // defpackage.aa7
    public String getContentType() {
        return "application/octet-stream";
    }

    @Override // defpackage.h97
    public ba7 h(gge ggeVar) {
        return ((tlf) this.b).h(ggeVar);
    }

    @Override // defpackage.kof
    public jof i(hf6 hf6Var) {
        b6a b6aVar = (b6a) this.b;
        String str = hf6Var.n;
        int i = hf6Var.K;
        if (str != null) {
            switch (str) {
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new p62(str, i);
                case "application/cea-708":
                    return new w62(i, hf6Var.q);
            }
        }
        if (!b6aVar.f(hf6Var)) {
            throw new IllegalArgumentException(wy1.h("Attempted to create decoder for unsupported MIME type: ", str));
        }
        tof tofVarX = b6aVar.x(hf6Var);
        tofVarX.getClass().getSimpleName().concat("Decoder");
        return new jhb(tofVarX);
    }

    @Override // defpackage.ka
    public void j() {
        ug1 ug1Var = ug1.c;
        ug1Var.getClass();
        ug1Var.p0().b(":call-admin-waiting-room", null);
    }

    public void k(int i, boolean z) {
        y16 y16Var = (y16) this.b;
        if (z) {
            y16Var.a(i);
        } else {
            y16Var.getClass();
        }
    }

    public ukd l() {
        return new ukd(9, fjb.a((x8a) this.b));
    }

    @Override // defpackage.j7a
    public void n() {
    }

    @Override // defpackage.pn5
    public c8a o() {
        throw null;
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void onError(Throwable th) {
        switch (this.a) {
            case 11:
                ((v2f) this.b).onError(th);
                break;
            default:
                ((bs8) ((pr8) this.b).b).onError(th);
                break;
        }
    }

    public int p() {
        return ((GifImage) ((fs3) this.b).e).e();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    @Override // defpackage.ox7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object parse(defpackage.xx7 r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            lm[] r0 = (defpackage.lm[]) r0
            int r1 = r0.length
            sa9[] r1 = new defpackage.sa9[r1]
            r9.r()
            int r2 = r0.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L74
            r4 = r0[r3]
            r9.p()
            java.lang.String r5 = r9.name()
            int r6 = r5.hashCode()
            r7 = 3548(0xddc, float:4.972E-42)
            if (r6 == r7) goto L45
            r7 = 3135262(0x2fd71e, float:4.393438E-39)
            if (r6 == r7) goto L25
            goto L63
        L25:
            java.lang.String r6 = "fail"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L2e
            goto L63
        L2e:
            yl r5 = r4.b
            ox7 r5 = r5.getFailParser()
            java.lang.Object r5 = r5.parse(r9)
            ru.ok.android.api.core.ApiInvocationException r5 = (ru.ok.android.api.core.ApiInvocationException) r5
            sa9 r5 = new sa9
            mm r6 = new mm
            r6.<init>()
            r5.<init>(r4, r6)
            goto L6c
        L45:
            java.lang.String r6 = "ok"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L63
            b83 r5 = new b83
            r5.<init>(r9)
            yl r6 = r4.b
            ox7 r6 = r6.getOkParser()
            java.lang.Object r5 = r6.parse(r5)
            sa9 r6 = new sa9
            r6.<init>(r4, r5)
            r5 = r6
            goto L6c
        L63:
            r9.v()
            sa9 r5 = new sa9
            r6 = 0
            r5.<init>(r4, r6)
        L6c:
            r9.n()
            r1[r3] = r5
            int r3 = r3 + 1
            goto Lc
        L74:
            r9.q()
            dm0 r9 = new dm0
            r9.<init>(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a3b.parse(xx7):java.lang.Object");
    }

    @Override // defpackage.j7a
    public void r() {
        ((i40) this.b).f();
    }

    @Override // defpackage.qf8
    public void s() {
        try {
            ((jaa) this.b).accept(Boolean.TRUE);
        } catch (Throwable th) {
            wqi.e("of8", "checkLocationSettingsAndPermissions", th);
        }
    }

    @Override // defpackage.qf8
    public void t(Exception exc) {
        try {
            ((jaa) this.b).accept(Boolean.FALSE);
        } catch (Throwable th) {
            wqi.e("of8", "checkLocationSettingsAndPermissions", th);
        }
    }

    public String toString() {
        switch (this.a) {
            case 25:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.j7a
    public void u(long j) {
        i40 i40Var = (i40) this.b;
        i40Var.f();
        ((jve) i40Var.d).h(f40.a);
    }

    public int v() {
        return ((GifImage) ((fs3) this.b).e).i();
    }

    @Override // defpackage.j7a
    public void w() {
        ((i40) this.b).f();
    }

    @Override // defpackage.aa7
    public void writeTo(OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.b);
        try {
            swi.a(fileInputStream, outputStream);
            fileInputStream.close();
        } finally {
        }
    }

    public eud x(yy7 yy7Var) {
        eud eudVar = (eud) this.b;
        if (eudVar != null) {
            return eudVar;
        }
        throw new IllegalStateException(("Property " + yy7Var.getName() + " should be initialized before get.").toString());
    }

    public void y() {
        f7a f7aVar = (f7a) this.b;
        f7aVar.r = true;
        if (!f7aVar.j.isEmpty()) {
            f7aVar.b();
            return;
        }
        rr4 rr4Var = f7aVar.o;
        rr4Var.getClass();
        rr4Var.i();
    }

    public /* synthetic */ a3b(int i, boolean z) {
        this.a = i;
    }

    public a3b(wk3 wk3Var, v2f v2fVar) {
        this.a = 11;
        this.b = v2fVar;
    }

    public a3b(zva zvaVar) {
        this.a = 28;
        this.b = new tlf();
    }

    public a3b(n83 n83Var, k83 k83Var) {
        this.a = 10;
        this.b = n83Var;
    }

    public a3b(int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = x8a.b();
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                this.b = (SmallDisplaySizeQuirk) rv4.a.e(SmallDisplaySizeQuirk.class);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                this.b = Collections.synchronizedSet(new LinkedHashSet());
                break;
            case 18:
                this.b = new zl6(5, 1.0f, false, 1);
                break;
            case 29:
                this.b = new b6a(26);
                break;
            default:
                this.b = new y16(1);
                break;
        }
    }
}
