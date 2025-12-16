package com.avito.android.work_profile.profile.applies.ui.items.applies_banner;

import Y61.k;
import android.widget.TextView;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.avito.android.verification.verification_input_inn.o;
import iQ0.InterfaceC41333a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AppliesBannerPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/items/applies_banner/e;", "LTV0/d;", "Lcom/avito/android/work_profile/profile/applies/ui/items/applies_banner/g;", "Lcom/avito/android/work_profile/profile/applies/ui/items/applies_banner/AppliesBannerItem;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements TV0.d<g, AppliesBannerItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC41333a f330941b;

    @Inject
    public e(@k InterfaceC41333a interfaceC41333a) {
        this.f330941b = interfaceC41333a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.C] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        AppliesBannerItem appliesBannerItem = (AppliesBannerItem) aVar;
        d dVar = new d(this);
        I5.a((TextView) gVar.f330945c.getValue(), appliesBannerItem.f330931c, false);
        I5.a((TextView) gVar.f330946d.getValue(), appliesBannerItem.f330932d, false);
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(appliesBannerItem.f330933e, com.avito.android.lib.util.darkTheme.c.b(gVar.itemView.getContext()));
        ImageRequest.a aVarA = C35949t5.a((SimpleDraweeView) gVar.f330948f.getValue());
        aVarA.d(n.a(imageDependsOnThemeOrDefault));
        aVarA.c();
        ?? r42 = gVar.f330947e;
        com.avito.android.lib.design.button.b.a((Button) r42.getValue(), appliesBannerItem.f330934f.f330935b, false);
        ((Button) r42.getValue()).setOnClickListener(new o(7, appliesBannerItem, dVar));
    }
}
