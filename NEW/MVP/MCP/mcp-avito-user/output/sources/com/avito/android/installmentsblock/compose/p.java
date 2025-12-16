package com.avito.android.installmentsblock.compose;

import android.content.Context;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.installments_block.entity.InstallmentsPriceInfo;
import com.avito.android.installmentsblock.compose.b;
import com.avito.android.remote.model.text.AttributedText;
import defpackage._avito_credits_public;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsBlock.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class p extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f172941l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f172942m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InstallmentsPriceInfo.PriceBadge f172943n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f172944o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(AttributedText attributedText, Y41.l<? super DeepLink, G0> lVar, InstallmentsPriceInfo.PriceBadge priceBadge, Context context) {
        super(1);
        this.f172941l = attributedText;
        this.f172942m = lVar;
        this.f172943n = priceBadge;
        this.f172944o = context;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        CharSequence charSequenceA;
        com.avito.android.lib.design.text_view.a aVar2 = aVar;
        Y41.l<DeepLink, G0> lVar = this.f172942m;
        b.g gVar = new b.g(lVar);
        AttributedText attributedText = this.f172941l;
        attributedText.setOnDeepLinkClickListener(gVar);
        com.avito.android.util.text.j.a(aVar2, attributedText, null);
        InstallmentsPriceInfo.PriceBadge priceBadge = this.f172943n;
        if (priceBadge != null) {
            boolean z12 = priceBadge instanceof InstallmentsPriceInfo.PriceBadge.RedBadge;
            Context context = this.f172944o;
            if (z12) {
                InstallmentsPriceInfo.PriceBadge.RedBadge redBadge = (InstallmentsPriceInfo.PriceBadge.RedBadge) priceBadge;
                charSequenceA = _avito_credits_public.b(aVar2.getText(), context, redBadge.f172871b, redBadge.f172872c, lVar);
            } else {
                if (!(priceBadge instanceof InstallmentsPriceInfo.PriceBadge.QuestionIcon)) {
                    throw new NoWhenBranchMatchedException();
                }
                charSequenceA = _avito_credits_public.a(aVar2.getText(), context, ((InstallmentsPriceInfo.PriceBadge.QuestionIcon) priceBadge).f172870b, lVar);
            }
            aVar2.setText(charSequenceA);
        }
        return G0.f406611a;
    }
}
