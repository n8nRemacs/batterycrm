package com.avito.android.vas_discount.ui.dialog;

import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.vas_discount.remote.model.DiscountResponse;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DiscountPickerViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_discount/ui/dialog/f;", "Landroidx/lifecycle/P0$c;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DiscountResponse f319695a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.vas_discount.business.d f319696b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f319697c;

    @Inject
    public f(@k DiscountResponse discountResponse, @k com.avito.android.vas_discount.business.d dVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f319695a = discountResponse;
        this.f319696b = dVar;
        this.f319697c = interfaceC35745a5;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (!cls.isAssignableFrom(j.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new j(this.f319695a, this.f319696b, this.f319697c);
    }
}
