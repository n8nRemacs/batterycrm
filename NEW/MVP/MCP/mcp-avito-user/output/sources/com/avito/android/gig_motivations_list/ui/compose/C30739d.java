package com.avito.android.gig_motivations_list.ui.compose;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.promo_snippet.PromoSnippet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MotivationsListContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/promo_snippet/PromoSnippet;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.gig_motivations_list.ui.compose.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30739d extends N implements Y41.l<Context, PromoSnippet> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f160311l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30739d(Y41.l<? super DeepLink, G0> lVar) {
        super(1);
        this.f160311l = lVar;
    }

    @Override // Y41.l
    public final PromoSnippet invoke(Context context) {
        PromoSnippet promoSnippet = new PromoSnippet(context, null, 0);
        promoSnippet.setOnClickListener(this.f160311l);
        ConstraintLayout constraintLayout = promoSnippet.f231695b;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        layoutParams.height = -2;
        constraintLayout.setLayoutParams(layoutParams);
        return promoSnippet;
    }
}
