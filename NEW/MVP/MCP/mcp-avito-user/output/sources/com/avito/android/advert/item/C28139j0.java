package com.avito.android.advert.item;

import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.deep_linking.links.RecallMeLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "targetButton", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.j0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28139j0 extends kotlin.jvm.internal.N implements Y41.l<ContactBar.Button.Target, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f77194l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28139j0(C28136i0 c28136i0) {
        super(1);
        this.f77194l = c28136i0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(ContactBar.Button.Target target) {
        AdvertDetails advertDetailsN2;
        ContactBar.Button.Target target2 = target;
        C28136i0 c28136i0 = this.f77194l;
        b.a.a(c28136i0.f76334c0, target2.f125076d, null, null, 6);
        if ((target2.f125076d instanceof RecallMeLink) && (advertDetailsN2 = c28136i0.n2()) != null) {
            c28136i0.f76370o0.a(advertDetailsN2);
        }
        return kotlin.G0.f406611a;
    }
}
