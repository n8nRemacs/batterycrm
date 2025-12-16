package com.avito.android.gig_motivations_list.ui.compose;

import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.promo_snippet.PromoSnippetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MotivationsListContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PromoSnippetState f160313l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f160314m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f160315n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PromoSnippetState promoSnippetState, androidx.compose.ui.v vVar, Y41.l lVar, int i12) {
        super(2);
        this.f160313l = promoSnippetState;
        this.f160314m = vVar;
        this.f160315n = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        l.a(this.f160313l, this.f160314m, this.f160315n, a12, iA2);
        return G0.f406611a;
    }
}
