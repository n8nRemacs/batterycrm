package com.avito.android.publish.details.item_wrapper;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ItemWrapperFactoryImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/item_wrapper/g;", "Lcom/avito/android/publish/details/item_wrapper/f;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.publish.details.item_wrapper.video.f f234785a;

    @Inject
    public g(@k com.avito.android.publish.details.item_wrapper.video.f fVar) {
        this.f234785a = fVar;
    }

    @Override // com.avito.android.publish.details.item_wrapper.f
    @l
    public final e<?> a(@k com.avito.conveyor_item.a aVar) {
        if (aVar instanceof ParameterElement.I) {
            return (e) this.f234785a.get();
        }
        return null;
    }
}
