package defpackage;

import com.google.android.gms.maps.model.LatLng;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class lye extends xfh {
    public final ci5 A0;
    public final ci5 B0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final LatLng b;
    public final float c;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final tcf y0;
    public final hbd z0;

    public lye(LatLng latLng, float f, Long l, Long l2, Long l3) {
        ff8 ff8Var = ff8.a;
        bwf bwfVarD = ff8Var.getAccessor().d(12);
        bwf bwfVarD2 = ff8Var.getAccessor().d(46);
        bwf bwfVarD3 = ff8Var.getAccessor().d(474);
        bwf bwfVarD4 = ff8Var.getAccessor().d(91);
        bwf bwfVarD5 = ff8Var.getAccessor().d(10);
        bwf bwfVarD6 = ff8Var.getAccessor().d(123);
        bwf bwfVarD7 = ff8Var.getAccessor().d(138);
        bwf bwfVarD8 = ff8Var.getAccessor().d(88);
        bwf bwfVarD9 = ff8Var.getAccessor().d(HttpStatus.SC_GONE);
        bwf bwfVarD10 = ff8Var.getAccessor().d(8);
        bwf bwfVarD11 = ff8Var.getAccessor().d(454);
        this.b = latLng;
        this.c = f;
        this.d = bwfVarD;
        this.o = bwfVarD2;
        this.X = bwfVarD3;
        this.Y = bwfVarD4;
        this.Z = bwfVarD5;
        this.s0 = bwfVarD6;
        this.t0 = bwfVarD7;
        this.u0 = bwfVarD8;
        this.v0 = bwfVarD9;
        this.w0 = bwfVarD10;
        this.x0 = bwfVarD11;
        tcf tcfVarA = ucf.a(new gye(null, null, null, null, null, null));
        this.y0 = tcfVarA;
        this.z0 = new hbd(tcfVarA);
        this.A0 = new ci5(0);
        this.B0 = new ci5(0);
        svi.e(this.a, null, null, new jye(this, latLng, f, l2, l, l3, null), 3);
    }

    public static final void t(lye lyeVar, cf8 cf8Var) {
        xzf xzfVar = (xzf) lyeVar.Y.getValue();
        LatLng latLng = lyeVar.b;
        float fA = xzfVar.a(latLng.a, latLng.b, cf8Var.a, cf8Var.b);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        String str = fA < 1000.0f ? new DecimalFormat("0", decimalFormatSymbols).format(fA) : new DecimalFormat("0.#", decimalFormatSymbols).format(fA / 1000);
        n5g n5gVar = fA < 1000.0f ? new n5g(mvd.G0) : new n5g(mvd.h0);
        tcf tcfVar = lyeVar.y0;
        tcfVar.m(null, gye.a((gye) tcfVar.getValue(), null, null, null, n5gVar, str, null, 39));
    }

    public final void u() {
        if (!((qsb) this.Z.getValue()).c(qsb.k)) {
            xfh.r(this.B0, wxe.a);
        } else {
            svi.e(this.a, null, null, new hye(this, null), 3);
        }
    }
}
