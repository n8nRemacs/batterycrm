package com.avito.android.advert_core.contactbar;

import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContactBarActionsFactory.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class D extends N implements Y41.l<ContactBar.Button.Target, ContactBar.Button.Target> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f83125l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f83126m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(String str, DeepLink deepLink) {
        super(1);
        this.f83125l = str;
        this.f83126m = deepLink;
    }

    @Override // Y41.l
    public final ContactBar.Button.Target invoke(ContactBar.Button.Target target) {
        return ContactBar.Button.Target.d(target, this.f83125l, this.f83126m, false, 2042);
    }
}
