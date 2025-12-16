package com.avito.android.beduin.common.local_deeplink;

import Y61.k;
import com.avito.android.util.architecture_components.D;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinLocalDeeplinkProcessor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/local_deeplink/f;", "Lcom/avito/android/beduin/common/local_deeplink/e;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final D<a> f103429a = new D<>();

    @Inject
    public f() {
    }

    @Override // com.avito.android.beduin.common.local_deeplink.e
    /* renamed from: a, reason: from getter */
    public final D getF103429a() {
        return this.f103429a;
    }

    @Override // com.avito.android.beduin.common.local_deeplink.e
    public final void b(@k a aVar) {
        this.f103429a.postValue(aVar);
    }
}
