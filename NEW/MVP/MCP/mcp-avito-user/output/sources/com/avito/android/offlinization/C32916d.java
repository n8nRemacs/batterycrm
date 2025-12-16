package com.avito.android.offlinization;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OfflineInfoExtractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/offlinization/d;", "", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.offlinization.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32916d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<j> f208579a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<j> f208580b;

    public C32916d() {
        this(null, null, 3, null);
    }

    public C32916d(List list, List list2, int i12, C42822w c42822w) {
        list = (i12 & 1) != 0 ? new ArrayList() : list;
        list2 = (i12 & 2) != 0 ? new ArrayList() : list2;
        this.f208579a = list;
        this.f208580b = list2;
    }
}
