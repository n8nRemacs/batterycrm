package com.avito.android.publish.details;

import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.search.Theme;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishDetailsItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/Y0;", "Lcom/avito/android/category_parameters/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Y0 extends com.avito.android.category_parameters.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Set<com.avito.android.category_parameters.e> f233189a;

    @Inject
    public Y0(@Y61.k Set<com.avito.android.category_parameters.e> set) {
        this.f233189a = set;
    }

    @Override // com.avito.android.category_parameters.e
    @Y61.l
    public final com.avito.conveyor_item.a d(@Y61.k CategoryParameter categoryParameter, @Y61.l Theme theme) {
        Iterator<T> it = this.f233189a.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVarD = ((com.avito.android.category_parameters.e) it.next()).d(categoryParameter, theme);
            if (aVarD != null) {
                return aVarD;
            }
        }
        return null;
    }
}
