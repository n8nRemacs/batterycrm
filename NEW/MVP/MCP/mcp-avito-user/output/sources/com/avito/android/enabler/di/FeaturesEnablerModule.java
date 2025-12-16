package com.avito.android.enabler.di;

import X41.n;
import Y61.k;
import android.content.Context;
import com.avito.android.enabler.CachedTogglesStorage;
import com.avito.android.enabler.PreferencesTogglesCache;
import com.avito.android.enabler.TogglesStorage;
import com.avito.android.util.C;
import h31.h;
import h31.i;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: FeaturesEnablerModule.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/enabler/di/FeaturesEnablerModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/avito/android/util/C;", "buildInfo", "Lcom/avito/android/enabler/TogglesStorage;", "provideTogglesStorage", "(Landroid/content/Context;Lcom/avito/android/util/C;)Lcom/avito/android/enabler/TogglesStorage;", "_common_features-enabler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h
/* loaded from: classes13.dex */
public final class FeaturesEnablerModule {

    @k
    public static final FeaturesEnablerModule INSTANCE = new FeaturesEnablerModule();

    private FeaturesEnablerModule() {
    }

    @i
    @n
    @Singleton
    @k
    public static final TogglesStorage provideTogglesStorage(@k Context context, @k C buildInfo) {
        return new CachedTogglesStorage(new PreferencesTogglesCache(context), buildInfo.a());
    }
}
