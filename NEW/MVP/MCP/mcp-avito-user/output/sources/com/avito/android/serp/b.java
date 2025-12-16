package com.avito.android.serp;

import com.avito.android.remote.model.SerpElement;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;

/* compiled from: BaseSerpItemConverter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/b;", "Lcom/avito/android/remote/model/SerpElement;", "T", "Lcom/avito/android/serp/adapter/l1;", "V", "", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b<T extends SerpElement, V extends l1> {

    /* compiled from: BaseSerpItemConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    Class<? extends T> a();

    @Y61.l
    l1 b(SerpElement serpElement, @Y61.l String str, @Y61.l String str2, int i12);
}
