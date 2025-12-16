package com.avito.beduin.v2.repository.screen_lifecycle;

import androidx.view.InterfaceC22983P;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.beduin.v2.repository.screen_lifecycle.j;
import kotlin.Metadata;

/* compiled from: LifecycleOwnerIdRetriever.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/screen_lifecycle/g;", "Lcom/avito/beduin/v2/repository/screen_lifecycle/f;", "<init>", "()V", "screen-lifecycle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements f {
    @Override // com.avito.beduin.v2.repository.screen_lifecycle.f
    @Y61.k
    public final String a(@Y61.k InterfaceC22983P interfaceC22983P) {
        T0 t02 = interfaceC22983P instanceof T0 ? (T0) interfaceC22983P : null;
        if (t02 != null) {
            return ((j) new P0(t02, new j.a()).a(j.class)).f338315E;
        }
        throw new IllegalStateException(("lifecycle owner must be an instance of ViewModelStoreOwner, but it is " + interfaceC22983P).toString());
    }
}
