package com.avito.android.serp.adapter.skeleton;

import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: SkeletonSectionTabsItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/skeleton/j;", "Lcom/avito/android/serp/adapter/l1;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements l1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f272242b = SerpViewType.f268585e;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f272243c = "skeleton_section_tabs";

    /* renamed from: d, reason: collision with root package name */
    public final int f272244d = 6;

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78348b() {
        return this.f272244d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF156510b() {
        return this.f272243c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78356j() {
        return this.f272242b;
    }
}
