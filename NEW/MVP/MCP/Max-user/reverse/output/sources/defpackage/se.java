package defpackage;

import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class se implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnhancedAnimatedVectorDrawable b;

    public /* synthetic */ se(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable, int i) {
        this.a = i;
        this.b = enhancedAnimatedVectorDrawable;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.findPath("circle");
            case 1:
                return this.b.findPath("hours");
            case 2:
                return this.b.findPath("minutes");
            case 3:
                return this.b.findPath("circleL");
            case 4:
                return this.b.findPath("circleM");
            default:
                return this.b.findPath("circleR");
        }
    }
}
