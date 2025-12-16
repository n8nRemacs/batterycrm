package com.avito.android.advert.item.safedeal;

import android.os.Bundle;
import androidx.core.os.C22777e;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.component.advert_contact_bar.ContactBar;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertSafeDealPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "button", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.safedeal.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28177e extends kotlin.jvm.internal.N implements Y41.l<ContactBar.Button.Target, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28180h f78798l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28177e(C28180h c28180h) {
        super(1);
        this.f78798l = c28180h;
    }

    @Override // Y41.l
    public final G0 invoke(ContactBar.Button.Target target) {
        ContactBar.Button.Target target2 = target;
        String str = target2.f125084l;
        Bundle bundleB = str != null ? C22777e.b(new kotlin.Q("componentId", str)) : null;
        Z0 z02 = this.f78798l.f78842w;
        if (z02 != null) {
            InterfaceC28173a.InterfaceC2325a.C2326a.a(z02, target2.f125076d, bundleB, 4);
        }
        return G0.f406611a;
    }
}
