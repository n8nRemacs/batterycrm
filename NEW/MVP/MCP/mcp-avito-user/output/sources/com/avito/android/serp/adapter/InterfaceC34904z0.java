package com.avito.android.serp.adapter;

import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.SerpDisplayType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: SerpAdvertConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/z0;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC34904z0 {

    /* compiled from: SerpAdvertConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.z0$a */
    public static final class a {
        public static AdvertItem a(InterfaceC34904z0 interfaceC34904z0, SerpAdvert serpAdvert, boolean z12, boolean z13, SerpDisplayType serpDisplayType, String str, int i12, String str2, List list, boolean z14, int i13) {
            return interfaceC34904z0.a(serpAdvert, (i13 & 2) != 0 ? false : z12, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) == 0, (i13 & 32) == 0, (i13 & 64) != 0 ? "" : str, (i13 & 128) != 0 ? -1 : i12, (i13 & 256) != 0 ? "" : str2, (i13 & 512) != 0 ? C42784z0.f406748b : list, (i13 & 1024) != 0 ? false : z14);
        }
    }

    @Y61.k
    AdvertItem a(@Y61.k SerpAdvert serpAdvert, boolean z12, boolean z13, @Y61.k SerpDisplayType serpDisplayType, boolean z14, boolean z15, @Y61.k String str, int i12, @Y61.k String str2, @Y61.k List<String> list, boolean z16);
}
