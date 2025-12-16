package com.avito.android.enabler;

import Y61.k;
import Y61.l;
import com.avito.android.enabler.model.RemoteToggles;
import kotlin.Metadata;

/* compiled from: TogglesStorage.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/enabler/CachedTogglesStorage;", "Lcom/avito/android/enabler/TogglesStorage;", "Lcom/avito/android/enabler/PersistentTogglesCache;", "cache", "", "currentVersionCode", "<init>", "(Lcom/avito/android/enabler/PersistentTogglesCache;I)V", "Lcom/avito/android/enabler/model/RemoteToggles;", "remoteToggles", "Lkotlin/G0;", "store", "(Lcom/avito/android/enabler/model/RemoteToggles;)V", "", "key", "", "getFeatureValue", "(Ljava/lang/String;)Ljava/lang/Boolean;", "Lcom/avito/android/enabler/PersistentTogglesCache;", "I", "getHasCacheForCurrentVersion", "()Z", "hasCacheForCurrentVersion", "_common_features-enabler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CachedTogglesStorage implements TogglesStorage {

    @k
    private final PersistentTogglesCache cache;
    private final int currentVersionCode;

    public CachedTogglesStorage(@k PersistentTogglesCache persistentTogglesCache, int i12) {
        this.cache = persistentTogglesCache;
        this.currentVersionCode = i12;
        if (persistentTogglesCache.getSavedVersion() < i12) {
            persistentTogglesCache.drop();
        }
    }

    @Override // com.avito.android.enabler.TogglesStorage
    public boolean getHasCacheForCurrentVersion() {
        return this.cache.getSavedVersion() == this.currentVersionCode;
    }

    @Override // com.avito.android.enabler.TogglesStorage
    public void store(@k RemoteToggles remoteToggles) {
        this.cache.saveToggles(remoteToggles);
        this.cache.setSavedVersion(this.currentVersionCode);
    }

    @Override // com.avito.android.enabler.TogglesStorage
    @l
    public Boolean getFeatureValue(@k String key) {
        return this.cache.getToggle(key);
    }
}
