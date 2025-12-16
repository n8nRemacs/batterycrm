package com.avito.android.advert.item.select.controls;

import com.avito.android.advert.item.Z0;
import com.avito.android.advert_core.advert.b;
import com.avito.android.component.advert_contact_bar.ContactBar;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k extends N implements Y41.l<ContactBar.Button.Target, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f79417l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar) {
        super(1);
        this.f79417l = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContactBar.Button.Target target) {
        ContactBar.Button.Target target2 = target;
        Z0 z02 = this.f79417l.f79414c;
        if (z02 != null) {
            b.a.a(z02, target2.f125076d, null, 6);
        }
        return G0.f406611a;
    }
}
