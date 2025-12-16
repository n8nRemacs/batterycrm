package com.avito.android.avl_entry.impl.ui.external_item;

import Kg.InterfaceC14312a;
import android.os.Parcelable;
import com.avito.android.util.Kundle;
import kotlin.Metadata;

/* compiled from: ShortVideosItemStateProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/external_item/i;", "LKg/a;", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements InterfaceC14312a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public Kundle f98549a;

    @Override // Kg.InterfaceC14312a
    @Y61.l
    public final Parcelable a(@Y61.k String str) {
        return this.f98549a.d(str);
    }

    @Override // Kg.InterfaceC14312a
    public final void b(@Y61.k Parcelable parcelable, @Y61.k String str) {
        this.f98549a.j(parcelable, str);
    }
}
