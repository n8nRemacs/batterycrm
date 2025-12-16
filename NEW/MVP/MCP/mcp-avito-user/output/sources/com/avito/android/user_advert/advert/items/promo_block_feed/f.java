package com.avito.android.user_advert.advert.items.promo_block_feed;

import android.net.Uri;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PromoBlockItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.l<Uri, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f309864l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(1);
        this.f309864l = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(Uri uri) {
        g gVar = this.f309864l;
        gVar.f309867d.accept(gVar.f309866c.e(uri));
        return G0.f406611a;
    }
}
