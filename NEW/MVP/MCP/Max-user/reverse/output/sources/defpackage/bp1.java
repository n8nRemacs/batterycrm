package defpackage;

import android.media.VolumeProvider;
import one.me.calls.impl.service.CallServiceImpl;

/* loaded from: classes.dex */
public final class bp1 extends VolumeProvider {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp1(v79 v79Var, int i, int i2, int i3) {
        super(i, i2, i3);
        this.b = v79Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        switch (this.a) {
            case 0:
                wqi.c("CallServiceTag", "on adjust volume changed: " + i, new Object[0]);
                ((s91) ((CallServiceImpl) this.b).X.getValue()).a();
                break;
            default:
                v79 v79Var = (v79) this.b;
                zxg.a0(v79Var.f, new u79(v79Var.g, i, 1));
                break;
        }
    }

    @Override // android.media.VolumeProvider
    public void onSetVolumeTo(int i) {
        switch (this.a) {
            case 1:
                v79 v79Var = (v79) this.b;
                zxg.a0(v79Var.f, new u79(v79Var.g, i, 0));
                break;
            default:
                super.onSetVolumeTo(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp1(CallServiceImpl callServiceImpl) {
        super(1, 0, 0);
        this.b = callServiceImpl;
    }
}
