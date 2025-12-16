package PH;

import Y61.k;
import android.animation.Animator;
import com.avito.android.glow_animation_text_view.GlowTextAnimationView;
import com.avito.android.util.C35872q;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: GlowTextAnimationView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPH/b;", "Lcom/avito/android/util/q$b;", "_avito_glow-animation-text-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends C35872q.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GlowTextAnimationView f12946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.a f12947b;

    public b(GlowTextAnimationView glowTextAnimationView, l0.a aVar) {
        this.f12946a = glowTextAnimationView;
        this.f12947b = aVar;
    }

    @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@k Animator animator) {
        this.f12946a.f161199c.setMaskVisible(false);
    }

    @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(@k Animator animator) {
        l0.a aVar = this.f12947b;
        boolean z12 = aVar.f406838b;
        aVar.f406838b = !z12;
        this.f12946a.f161199c.setMaskVisible(z12);
    }

    @Override // com.avito.android.util.C35872q.b, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@k Animator animator) {
        this.f12946a.f161199c.setMaskVisible(true);
    }
}
