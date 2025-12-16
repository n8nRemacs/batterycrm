package com.avito.android.location;

import com.squareup.anvil.annotations.ContributesBinding;
import java.util.HashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: LocationInfoProvider.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location/e;", "Lcom/avito/android/location/d;", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31501e implements InterfaceC31500d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final HashMap<LocationParameter, Boolean> f181740a = new HashMap<>();

    @Inject
    public C31501e() {
    }

    @Override // com.avito.android.location.InterfaceC31500d
    @Y61.l
    public final Boolean a() {
        return this.f181740a.get(LocationParameter.f181708b);
    }

    @Override // com.avito.android.location.InterfaceC31500d
    public final void b(boolean z12) {
        this.f181740a.put(LocationParameter.f181708b, Boolean.valueOf(z12));
    }
}
