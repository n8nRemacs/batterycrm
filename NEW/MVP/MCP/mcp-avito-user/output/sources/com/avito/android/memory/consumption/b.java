package com.avito.android.memory.consumption;

import androidx.view.C23050m0;
import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.memory.consumption.f;
import com.avito.android.memory.consumption.m;
import com.avito.android.util.C;
import kotlin.Metadata;

/* compiled from: AppMemoryTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/memory/consumption/b;", "Lcom/avito/android/memory/consumption/a;", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C f186107a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f186108b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I1 f186109c;

    public b(@Y61.k C c12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k D d12, @Y61.k I1 i12) {
        this.f186107a = c12;
        this.f186108b = interfaceC28373a;
        this.f186109c = i12;
    }

    @Override // com.avito.android.memory.consumption.a
    public final void a(@Y61.k C23050m0 c23050m0) {
        new f(this.f186108b, m.a.f186137a).d(new f.a(c23050m0, this.f186109c, this.f186107a, new h(null, 1, null), false));
    }
}
