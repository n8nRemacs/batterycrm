package com.avito.android.profile_phones.phones_list.actions.items;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ActionItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/actions/items/f;", "Lcom/avito/android/profile_phones/phones_list/actions/items/d;", "<init>", "()V", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<a> f227505b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f227506c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f227505b = cVar;
        this.f227506c = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        PhoneListItem.Action action = aVar2.f227499d;
        hVar.setTitle(action.f228137b);
        if (action.f228138c) {
            hVar.BG();
        } else {
            hVar.jB();
        }
        hVar.c(new e(this, aVar2));
    }

    @Override // com.avito.android.profile_phones.phones_list.actions.items.d
    @k
    public final z<a> h() {
        return this.f227506c;
    }
}
