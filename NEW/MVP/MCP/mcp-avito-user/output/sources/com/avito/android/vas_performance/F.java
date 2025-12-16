package com.avito.android.vas_performance;

import Zx.C19616a;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.vas_performance.screens.applied_services.ui.AppliedServicesActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VasPerformanceIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/F;", "Lcom/avito/android/vas_performance/E;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class F implements E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f319848a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C19616a f319849b;

    @Inject
    public F(@Y61.k Context context, @Y61.k C19616a c19616a) {
        this.f319848a = context;
        this.f319849b = c19616a;
    }

    @Override // com.avito.android.vas_performance.E
    @Y61.k
    public final Intent a(@Y61.k String str) {
        C19616a c19616a = this.f319849b;
        c19616a.getClass();
        kotlin.reflect.n<Object> nVar = C19616a.f20576q[3];
        return new Intent(this.f319848a, (Class<?>) AppliedServicesActivity.class).putExtra("advert_id", str).putExtra("use_mvi_version", ((Boolean) c19616a.f20580e.a().invoke()).booleanValue());
    }
}
