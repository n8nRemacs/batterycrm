package D40;

import Y41.l;
import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.onboarding.dialog.mvi.entity.item.OnboardingResultItem;
import com.avito.android.onboarding.dialog.view.carousel.o;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: OnboardingViewRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD40/f;", "LD40/e;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.onboarding.dialog.view.quiz.a f2895a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.onboarding.dialog.view.carousel.f f2896b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final E40.c f2897c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f2898d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f2899e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l<C40.a, G0> f2900f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public ViewGroup f2901g;

    /* renamed from: h, reason: collision with root package name */
    public LayoutInflater f2902h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public com.avito.android.onboarding.dialog.b f2903i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2904j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public d f2905k;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k com.avito.android.onboarding.dialog.view.quiz.a aVar, @k com.avito.android.onboarding.dialog.view.carousel.f fVar, @k E40.c cVar, @k a aVar2, @k com.avito.android.util.text.a aVar3, @k l<? super C40.a, G0> lVar) {
        this.f2895a = aVar;
        this.f2896b = fVar;
        this.f2897c = cVar;
        this.f2898d = aVar2;
        this.f2899e = aVar3;
        this.f2900f = lVar;
    }

    @Override // D40.e
    public final void a() {
        d dVar = this.f2905k;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // D40.e
    public final void b() {
        d dVar = this.f2905k;
        com.avito.android.onboarding.dialog.view.carousel.f fVar = dVar instanceof com.avito.android.onboarding.dialog.view.carousel.f ? (com.avito.android.onboarding.dialog.view.carousel.f) dVar : null;
        if (fVar != null) {
            fVar.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // D40.e
    public final void c(@k OnboardingResultItem onboardingResultItem) {
        com.avito.android.onboarding.dialog.view.quiz.a aVar;
        ViewGroup viewGroup = this.f2901g;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        boolean z12 = onboardingResultItem instanceof OnboardingResultItem.OnboardingResultPreviewItem;
        a aVar2 = this.f2898d;
        com.avito.android.util.text.a aVar3 = this.f2899e;
        l<C40.a, G0> lVar = this.f2900f;
        if (z12) {
            OnboardingResultItem.OnboardingResultPreviewItem onboardingResultPreviewItem = (OnboardingResultItem.OnboardingResultPreviewItem) onboardingResultItem;
            LayoutInflater layoutInflater = this.f2902h;
            View viewInflate = (layoutInflater != null ? layoutInflater : null).inflate(R.layout.onboarding_preview, this.f2901g, false);
            com.avito.android.onboarding.dialog.b bVar = this.f2903i;
            if (bVar != null) {
                bVar.V();
            }
            ViewGroup viewGroup2 = this.f2901g;
            if (viewGroup2 != null) {
                viewGroup2.addView(viewInflate);
            }
            E40.g gVar = new E40.g(viewInflate, aVar2, aVar3, lVar);
            E40.c cVar = this.f2897c;
            cVar.J8(gVar);
            cVar.I8(onboardingResultPreviewItem.f208915b);
            cVar.K8(onboardingResultPreviewItem);
            aVar = cVar;
        } else if (onboardingResultItem instanceof OnboardingResultItem.OnboardingResultCarouselItem) {
            OnboardingResultItem.OnboardingResultCarouselItem onboardingResultCarouselItem = (OnboardingResultItem.OnboardingResultCarouselItem) onboardingResultItem;
            LayoutInflater layoutInflater2 = this.f2902h;
            View viewInflate2 = (layoutInflater2 != null ? layoutInflater2 : null).inflate(R.layout.onboarding_carousel, this.f2901g, false);
            com.avito.android.onboarding.dialog.b bVar2 = this.f2903i;
            if (bVar2 != null) {
                j.b(bVar2, false, 4);
            }
            ViewGroup viewGroup3 = this.f2901g;
            if (viewGroup3 != null) {
                viewGroup3.addView(viewInflate2);
            }
            o oVar = new o(viewInflate2, aVar2, this.f2904j, lVar);
            com.avito.android.onboarding.dialog.view.carousel.f fVar = this.f2896b;
            fVar.e(oVar);
            fVar.c(onboardingResultCarouselItem);
            aVar = fVar;
        } else {
            if (!(onboardingResultItem instanceof OnboardingResultItem.OnboardingResultQuizItem)) {
                throw new NoWhenBranchMatchedException();
            }
            OnboardingResultItem.OnboardingResultQuizItem onboardingResultQuizItem = (OnboardingResultItem.OnboardingResultQuizItem) onboardingResultItem;
            LayoutInflater layoutInflater3 = this.f2902h;
            View viewInflate3 = (layoutInflater3 != null ? layoutInflater3 : null).inflate(R.layout.onboarding_quiz, this.f2901g, false);
            com.avito.android.onboarding.dialog.b bVar3 = this.f2903i;
            if (bVar3 != null) {
                bVar3.V();
            }
            ViewGroup viewGroup4 = this.f2901g;
            if (viewGroup4 != null) {
                viewGroup4.addView(viewInflate3);
            }
            com.avito.android.onboarding.dialog.view.quiz.f fVar2 = new com.avito.android.onboarding.dialog.view.quiz.f(lVar, viewInflate3, aVar3);
            com.avito.android.onboarding.dialog.view.quiz.a aVar4 = this.f2895a;
            aVar4.d(fVar2);
            aVar4.f(onboardingResultQuizItem);
            aVar = aVar4;
        }
        this.f2905k = aVar;
        aVar.fa();
    }

    @Override // D40.e
    public final void d(@Y61.l ViewGroup viewGroup, @k com.avito.android.onboarding.dialog.b bVar, boolean z12) {
        this.f2901g = viewGroup;
        this.f2903i = bVar;
        this.f2904j = z12;
        this.f2902h = LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null);
    }

    @Override // D40.e
    public final void e() {
        d dVar = this.f2905k;
        com.avito.android.onboarding.dialog.view.quiz.a aVar = dVar instanceof com.avito.android.onboarding.dialog.view.quiz.a ? (com.avito.android.onboarding.dialog.view.quiz.a) dVar : null;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Override // D40.e
    public final void f() {
        d dVar = this.f2905k;
        com.avito.android.onboarding.dialog.view.quiz.a aVar = dVar instanceof com.avito.android.onboarding.dialog.view.quiz.a ? (com.avito.android.onboarding.dialog.view.quiz.a) dVar : null;
        if (aVar != null) {
            aVar.b();
        }
    }
}
