package com.avito.android.rating.details;

import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.rating.details.mvi.entity.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class n extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating.details.mvi.entity.b f247519l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RatingDetailsFragment f247520m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.avito.android.rating.details.mvi.entity.b bVar, RatingDetailsFragment ratingDetailsFragment) {
        super(1);
        this.f247519l = bVar;
        this.f247520m = ratingDetailsFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        com.avito.android.rating.details.mvi.entity.b bVar = this.f247519l;
        b.d dVar = bVar.f247422e;
        contentPlaceholder2.setTitle(dVar != null ? dVar.f247436a.k0(contentPlaceholder2.getContext()) : null);
        b.d dVar2 = bVar.f247422e;
        contentPlaceholder2.setSubtitle(dVar2 != null ? dVar2.f247437b.k0(contentPlaceholder2.getContext()) : null);
        contentPlaceholder2.setImageDrawable(null);
        String str = dVar2 != null ? dVar2.f247438c : null;
        a.i iVar = dVar2 != null ? dVar2.f247439d : null;
        contentPlaceholder2.setButtonTitle(iVar != null ? str : null);
        contentPlaceholder2.setButtonOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(8, iVar, this.f247520m));
        return G0.f406611a;
    }
}
