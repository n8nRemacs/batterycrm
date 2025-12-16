package com.avito.android.profile_phones.phone_action.view_model;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.profile_phones.phone_action.PhoneParcelableEntity;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneActionCode;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import sb0.InterfaceC48146a;
import tb0.InterfaceC48640a;

/* compiled from: PhoneActionViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phone_action/view_model/b;", "Landroidx/lifecycle/P0$c;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f227316a;

    /* renamed from: b, reason: collision with root package name */
    public final int f227317b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<PhoneParcelableEntity> f227318c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PhoneActionCode f227319d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC48640a f227320e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC48146a f227321f;

    @Inject
    public b(int i12, @k PhoneActionCode phoneActionCode, @k String str, @k List list, @k InterfaceC48146a interfaceC48146a, @k InterfaceC48640a interfaceC48640a) {
        this.f227316a = str;
        this.f227317b = i12;
        this.f227318c = list;
        this.f227319d = phoneActionCode;
        this.f227320e = interfaceC48640a;
        this.f227321f = interfaceC48146a;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (!cls.isAssignableFrom(d.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        List<PhoneParcelableEntity> list = this.f227318c;
        InterfaceC48640a interfaceC48640a = this.f227320e;
        String str = this.f227316a;
        return new d(this.f227317b, this.f227319d, str, list, this.f227321f, interfaceC48640a);
    }
}
