package defpackage;

import android.graphics.drawable.Drawable;
import one.me.sdk.uikit.common.span.FitFontImageSpan;

/* loaded from: classes2.dex */
public final class wh9 extends FitFontImageSpan implements ry2 {
    public final /* synthetic */ Drawable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh9(Drawable drawable) {
        super(drawable, null, false, false, 14, null);
        this.a = drawable;
    }

    @Override // defpackage.ry2
    public final void a(yt0 yt0Var) {
        cei.k(this.a, yt0Var.b.i);
    }
}
