package defpackage;

import android.graphics.Bitmap;
import one.me.sdk.uikit.qr.QrCodeGenerator;

/* loaded from: classes2.dex */
public final class arc extends q44 {
    public erc X;
    public String Y;
    public Bitmap Z;
    public QrCodeGenerator d;
    public iz5 o;
    public Bitmap s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ QrCodeGenerator u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arc(QrCodeGenerator qrCodeGenerator, q44 q44Var) {
        super(q44Var);
        this.u0 = qrCodeGenerator;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        this.t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return this.u0.f(null, 0, null, null, null, null, null, null, null, null, null, this);
    }
}
