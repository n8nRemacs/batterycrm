package com.avito.android.category;

import com.avito.android.remote.model.Location;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C0;

/* compiled from: CategoryFlowInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/d;", "", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d {

    /* compiled from: CategoryFlowInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    kotlinx.coroutines.flow.internal.l a(@Y61.l Location location, @Y61.l String str);

    @Y61.k
    C0 b(@Y61.k Location location, @Y61.l String str, @Y61.l Map map);
}
