package com.avito.android.advert_details_items.sellerprofile;

import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.remote.model.AdvertDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertSellerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock;", "sticky", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class C<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f85542b;

    public C(D d12) {
        this.f85542b = d12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List<? extends ContactBar.InfoStickyBlock> list = (List) obj;
        D d12 = this.f85542b;
        AdvertDetails advertDetails = d12.f85554l;
        if (advertDetails != null) {
            d12.f85544b.Oa(list, advertDetails);
        }
    }
}
