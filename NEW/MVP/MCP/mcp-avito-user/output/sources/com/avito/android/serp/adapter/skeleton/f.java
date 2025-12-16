package com.avito.android.serp.adapter.skeleton;

import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: SkeletonItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/skeleton/f;", "Lcom/avito/android/serp/adapter/l1;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements l1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f272238b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f272239c = SerpViewType.f268583c;

    /* renamed from: d, reason: collision with root package name */
    public final int f272240d = 1;

    public f(@Y61.k String str) {
        this.f272238b = str;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207394c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269137b() {
        return this.f272240d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270187b() {
        return this.f272238b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF269141f() {
        return this.f272239c;
    }
}
