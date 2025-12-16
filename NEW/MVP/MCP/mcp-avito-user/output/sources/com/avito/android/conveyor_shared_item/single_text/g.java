package com.avito.android.conveyor_shared_item.single_text;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SpannedSingleTextItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/conveyor_shared_item/single_text/g;", "Lcom/avito/android/conveyor_shared_item/single_text/a;", "Lcom/avito/android/serp/adapter/l1;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements a, l1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f126165b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f126166c;

    /* renamed from: d, reason: collision with root package name */
    public final int f126167d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f126168e;

    public g(String str, String str2, int i12, SerpViewType serpViewType, int i13, C42822w c42822w) {
        str2 = (i13 & 2) != 0 ? UUID.randomUUID().toString() : str2;
        serpViewType = (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType;
        this.f126165b = str;
        this.f126166c = str2;
        this.f126167d = i12;
        this.f126168e = serpViewType;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF126167d() {
        return this.f126167d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF126166c() {
        return this.f126166c;
    }

    @Override // com.avito.android.conveyor_shared_item.single_text.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF126165b() {
        return this.f126165b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF126168e() {
        return this.f126168e;
    }
}
