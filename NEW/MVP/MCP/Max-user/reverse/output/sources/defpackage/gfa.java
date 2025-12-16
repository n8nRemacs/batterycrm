package defpackage;

import android.net.Uri;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class gfa extends d2f {
    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(zea zeaVar) {
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.a;
        oneMeDraweeView.setId(Long.hashCode(zeaVar.a));
        sf7 sf7VarD = sf7.d(Uri.parse(zeaVar.b));
        float f = 64;
        sf7VarD.d = new ynd(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        rf7 rf7VarA = sf7VarD.a();
        int i = OneMeDraweeView.B0;
        oneMeDraweeView.i(rf7VarA, null);
    }
}
