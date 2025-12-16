package com.avito.android.rating.user_contacts.adapter.contact;

import com.avito.android.rating.user_contacts.mvi.entity.a;
import kotlin.Metadata;

/* compiled from: ContactItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "rating", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f247696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContactItem f247697c;

    public e(h hVar, ContactItem contactItem) {
        this.f247696b = hVar;
        this.f247697c = contactItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        h hVar = this.f247696b;
        hVar.f247702b.invoke(new a.b(this.f247697c, iIntValue));
    }
}
