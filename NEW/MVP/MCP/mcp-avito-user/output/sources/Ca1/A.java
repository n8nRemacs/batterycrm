package Ca1;

import Ba1.AbstractC13126d;
import android.view.animation.AlphaAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class A extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B91.y f2250l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B91.y yVar) {
        super(0);
        this.f2250l = yVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        B91.y yVar = this.f2250l;
        AbstractC13126d.a(yVar.f1197d);
        AppCompatImageView appCompatImageView = yVar.f1197d;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setFillAfter(true);
        appCompatImageView.startAnimation(alphaAnimation);
        yVar.f1197d.setVisibility(0);
        return G0.f406611a;
    }
}
