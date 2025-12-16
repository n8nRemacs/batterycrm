package com.avito.android.profile_phones.phone_action;

import kotlin.Metadata;

/* compiled from: PhoneActionFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/g;", "Lru/avito/component/toolbar/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements ru.avito.component.toolbar.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhoneActionFragment f227298b;

    public g(PhoneActionFragment phoneActionFragment) {
        this.f227298b = phoneActionFragment;
    }

    @Override // ru.avito.component.toolbar.a
    public final void R() {
        com.avito.android.profile_phones.phone_action.view_model.a aVar = this.f227298b.f227256s0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.t3();
    }

    @Override // ru.avito.component.toolbar.a
    public final void u() {
    }
}
