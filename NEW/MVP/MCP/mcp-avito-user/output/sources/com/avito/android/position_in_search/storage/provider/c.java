package com.avito.android.position_in_search.storage.provider;

import AK0.l;
import Y61.k;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.position_in_search.storage.h;
import com.avito.android.util.R0;
import kotlin.Metadata;

/* compiled from: SearchPositionStorageProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/storage/provider/c;", "", "a", "b", "_avito_position-in-search_storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: SearchPositionStorageProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/storage/provider/c$a;", "Lcom/avito/android/di/h;", "_avito_position-in-search_storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends InterfaceC29971h {
        @k
        R0 c();

        @k
        l r();
    }

    /* compiled from: SearchPositionStorageProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/storage/provider/c$b;", "", "_avito_position-in-search_storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @k
        c a(@k a aVar);
    }

    @k
    com.avito.android.position_in_search.storage.a a();

    @k
    h b();

    @k
    com.avito.android.position_in_search.storage.e c();
}
