package com.avito.android.serp.adapter;

import com.avito.android.remote.model.SerpDisplayType;
import com.avito.konveyor.item_visibility_tracker.b;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SerpDataSource.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/G0;", "Lcom/avito/konveyor/item_visibility_tracker/b$c;", "Lcom/avito/android/serp/adapter/l1;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class G0 implements b.c<l1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f268501b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final S0 f268502c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SerpDisplayType f268503d;

    public G0(@Y61.k ArrayList arrayList, @Y61.k S0 s02, @Y61.k SerpDisplayType serpDisplayType) {
        this.f268501b = arrayList;
        this.f268502c = s02;
        this.f268503d = serpDisplayType;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.c
    public final l1 b(int i12) {
        return (l1) this.f268501b.get(i12);
    }

    @Override // UV0.a
    public final int getCount() {
        return this.f268501b.size();
    }

    @Override // UV0.a
    public final Object getItem(int i12) {
        return this.f268502c.a((l1) this.f268501b.get(i12), this.f268503d);
    }

    @Override // UV0.a
    public final boolean isEmpty() {
        return this.f268501b.isEmpty();
    }
}
