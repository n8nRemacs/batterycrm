package com.avito.android.select.new_metro.di;

import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.select.new_metro.ItemsHolder;
import com.avito.android.select.new_metro.MetroResponseToItemsConverter;
import com.avito.android.select.new_metro.SelectMetroParams;
import dagger.internal.x;
import dagger.internal.y;
import java.util.List;

/* compiled from: SelectMetroFragmentModule_GetItemsHolder$_avito_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<ItemsHolder> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f266171a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f266172b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f266173c;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f266171a = lVar;
        this.f266172b = lVar2;
        this.f266173c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        SelectMetroParams selectMetroParams = (SelectMetroParams) this.f266171a.f393949a;
        Fragment fragment = (Fragment) this.f266172b.f393949a;
        List list = (List) this.f266173c.f393949a;
        int i12 = l.f266170a;
        return new MetroResponseToItemsConverter(selectMetroParams.f265940b, fragment.getString(R.string.select_metro_all_stations_filter_name), list);
    }
}
