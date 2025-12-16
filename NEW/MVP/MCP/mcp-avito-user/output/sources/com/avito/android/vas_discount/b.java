package com.avito.android.vas_discount;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DiscountActivityViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_discount/b;", "Landroidx/lifecycle/P0$c;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f319609a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_discount.business.a f319610b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f319611c;

    @Inject
    public b(@Y61.l @com.avito.android.vas_discount.di.c String str, @Y61.k com.avito.android.vas_discount.business.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f319609a = str;
        this.f319610b = aVar;
        this.f319611c = interfaceC35745a5;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(d.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new d(this.f319609a, this.f319610b, this.f319611c);
    }
}
