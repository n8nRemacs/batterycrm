package com.avito.android.rating.user_contacts;

import com.avito.android.rating.user_contacts.UserContactsActivity;
import com.avito.android.rating.user_contacts.mvi.entity.a;
import com.avito.android.rating.user_contacts.mvi.entity.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserContactsActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserContactsActivity f247765l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(UserContactsActivity userContactsActivity) {
        super(0);
        this.f247765l = userContactsActivity;
    }

    @Override // Y41.a
    public final G0 invoke() {
        UserContactsActivity.a aVar = UserContactsActivity.f247653z;
        this.f247765l.a2().accept(new a.e(b.InterfaceC7440b.C7441b.f247815a));
        return G0.f406611a;
    }
}
