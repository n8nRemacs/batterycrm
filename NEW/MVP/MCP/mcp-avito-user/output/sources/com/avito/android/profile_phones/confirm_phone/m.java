package com.avito.android.profile_phones.confirm_phone;

import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConfirmPhoneViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/confirm_phone/m;", "Landroidx/lifecycle/a;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f227060d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.code_confirmation.code_confirmation.phone_confirm.b f227061e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.code_confirmation.code_confirmation.phone_confirm.f f227062f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_phones.validation.d f227063g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f227064h;

    @Inject
    public m(@Y61.k k kVar, @Y61.k com.avito.android.code_confirmation.code_confirmation.phone_confirm.b bVar, @Y61.k com.avito.android.code_confirmation.code_confirmation.phone_confirm.f fVar, @Y61.k com.avito.android.profile_phones.validation.d dVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC23487e interfaceC23487e) {
        super(interfaceC23487e, null);
        this.f227060d = kVar;
        this.f227061e = bVar;
        this.f227062f = fVar;
        this.f227063g = dVar;
        this.f227064h = interfaceC35745a5;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(o.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new o(this.f227060d, this.f227061e, this.f227063g, this.f227062f, this.f227064h, c23060r0);
    }
}
