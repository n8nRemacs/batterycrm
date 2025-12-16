package com.avito.android.onboarding.dialog.view.carousel;

import C40.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C23494e;
import androidx.transition.Q;
import com.avito.android.lib.design.button.Button;
import com.avito.android.onboarding.dialog.view.carousel.g;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OnboardingCarouselView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class n extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f209006l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f209007m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, ArrayList arrayList) {
        super(1);
        this.f209006l = arrayList;
        this.f209007m = oVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == -1) {
            iIntValue = 0;
        }
        final OnboardingCarouselItem onboardingCarouselItem = (OnboardingCarouselItem) this.f209006l.get(iIntValue);
        final o oVar = this.f209007m;
        Y41.p<? super String, ? super Integer, G0> pVar = oVar.f209022o;
        G0 g02 = null;
        if (pVar != null) {
            AttributedText attributedText = onboardingCarouselItem.f208971d;
            ((g.a) pVar).invoke(attributedText != null ? attributedText.getText() : null, onboardingCarouselItem.f208978k);
        }
        String str = onboardingCarouselItem.f208973f;
        Button button = oVar.f209015h;
        if (str != null) {
            C23494e c23494e = new C23494e();
            c23494e.f54670g.add(button);
            c23494e.f54667d = 200L;
            Q.a(oVar.f209012e, c23494e);
            if (!D6.y(oVar.f209014g)) {
                ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                layoutParams.width = -1;
                button.setLayoutParams(layoutParams);
            }
            com.avito.android.lib.design.button.b.a(button, str, false);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.onboarding.dialog.view.carousel.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    oVar.f209011d.invoke(new a.C0088a(onboardingCarouselItem));
                }
            });
            D6.H(button);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(button);
        }
        return G0.f406611a;
    }
}
