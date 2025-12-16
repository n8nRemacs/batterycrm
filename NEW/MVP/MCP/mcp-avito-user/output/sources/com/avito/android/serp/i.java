package com.avito.android.serp;

import com.avito.android.remote.model.SerpDisplayType;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: SerpItemProcessor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/i;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface i {

    /* compiled from: SerpItemProcessor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static List a(i iVar, List list, SerpDisplayType serpDisplayType, String str, String str2, boolean z12, List list2, int i12) {
            return iVar.c(list, serpDisplayType, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? false : z12, (i12 & 64) != 0 ? C42784z0.f406748b : list2);
        }
    }

    @Y61.k
    C41982q1 a(@Y61.k List list, int i12, @Y61.k SerpDisplayType serpDisplayType);

    @Y61.k
    List b(int i12, @Y61.k List list);

    @Y61.k
    List c(@Y61.k List list, @Y61.k SerpDisplayType serpDisplayType, @Y61.l String str, @Y61.l String str2, boolean z12, @Y61.k List list2);
}
