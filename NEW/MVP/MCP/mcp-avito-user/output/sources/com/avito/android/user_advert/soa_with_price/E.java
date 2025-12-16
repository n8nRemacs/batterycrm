package com.avito.android.user_advert.soa_with_price;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.remote.model.my_advert.CloseReason;
import com.avito.android.util.InterfaceC35745a5;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SoaWithPriceViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/E;", "Landroidx/lifecycle/P0$c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class E implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<CloseReason> f311836a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f311837b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final k f311838c;

    public E(@Y61.k List<CloseReason> list, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k k kVar) {
        this.f311836a = list;
        this.f311837b = interfaceC35745a5;
        this.f311838c = kVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(D.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new D(this.f311836a, this.f311837b, this.f311838c);
    }
}
