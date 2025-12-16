package com.avito.android.lib.design.animation;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.B;
import com.airbnb.lottie.G;
import com.airbnb.lottie.LottieAnimationView;
import com.avito.android.R;
import com.avito.android.lib.design.animation.AnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AnimationViewLottieEngine.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/animation/d;", "Lcom/avito/android/lib/design/animation/b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AnimationView.EngineType f178339a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LottieAnimationView f178340b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public AnimationView.e f178341c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public AnimationView.AnimationState f178342d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public AnimationView.b f178343e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public AnimationView.c f178344f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.animation.a f178345g;

    /* compiled from: AnimationViewLottieEngine.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AnimationView.RepeatMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnimationView.RepeatMode.a aVar = AnimationView.RepeatMode.f178281b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? R.attr.lottieAnimationViewStyle : i12;
        this.f178339a = AnimationView.EngineType.f178278b;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context, attributeSet, i12);
        com.avito.android.lib.design.a.f178170a.getClass();
        lottieAnimationView.setSafeMode(com.avito.android.lib.design.a.f178173d);
        this.f178340b = lottieAnimationView;
        this.f178341c = AnimationView.e.d.f178301a;
        this.f178342d = AnimationView.AnimationState.f178274b;
        AV.a aVar = new AV.a(this, 9);
        e eVar = new e(this);
        com.avito.android.checkable_image.b bVar = new com.avito.android.checkable_image.b(this, 2);
        G g12 = new G() { // from class: com.avito.android.lib.design.animation.c
            @Override // com.airbnb.lottie.G
            public final void a() {
                AnimationView.e.b bVar2 = AnimationView.e.b.f178299a;
                d dVar = this.f178338a;
                AnimationView.e eVar2 = dVar.f178341c;
                dVar.f178341c = bVar2;
                a aVar2 = dVar.f178345g;
                if (aVar2 != null) {
                    aVar2.a(eVar2, bVar2);
                }
            }
        };
        B b12 = lottieAnimationView.f59121f;
        b12.f59036c.addPauseListener(eVar);
        b12.f59036c.addUpdateListener(aVar);
        lottieAnimationView.setFailureListener(bVar);
        if (lottieAnimationView.getComposition() != null) {
            g12.a();
        }
        lottieAnimationView.f59128m.add(g12);
    }

    public final void a() {
        LottieAnimationView lottieAnimationView = this.f178340b;
        lottieAnimationView.f59125j = false;
        lottieAnimationView.f59121f.m();
    }
}
