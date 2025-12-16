package defpackage;

import android.content.Context;
import android.view.TextureView;

/* loaded from: classes2.dex */
public final class mdh extends TextureView {
    public final /* synthetic */ odh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdh(odh odhVar, Context context) {
        super(context);
        this.a = odhVar;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        odh odhVar = this.a;
        a3h a3hVar = odhVar.t0;
        if (a3hVar != null) {
            a3hVar.a.setPlayer(null);
        }
        hdh hdhVar = odhVar.u0;
        if (hdhVar != null) {
            hdhVar.onSurfaceTextureDestroyed(getSurfaceTexture());
        }
    }
}
