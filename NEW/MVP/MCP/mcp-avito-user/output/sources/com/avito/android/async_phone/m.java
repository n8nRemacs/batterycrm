package com.avito.android.async_phone;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.SerpScreen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.InterfaceC28489k;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AsyncPhoneTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/m;", "Lcom/avito/android/async_phone/l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.o f92231a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public InterfaceC28489k f92232b;

    @Inject
    public m(@Y61.k InterfaceC28481c interfaceC28481c, @Y61.k Screen screen, @Y61.k com.avito.android.analytics.screens.r rVar) {
        this.f92231a = interfaceC28481c.b(screen, rVar).a();
    }

    @Override // com.avito.android.async_phone.l
    public final void a() {
        SerpScreen.f90483d.getClass();
        com.avito.android.analytics.screens.tracker.P pE2 = this.f92231a.e(SerpScreen.f90484e);
        pE2.start();
        this.f92232b = pE2;
    }

    @Override // com.avito.android.async_phone.l
    public final void b() {
        InterfaceC28489k interfaceC28489k = this.f92232b;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, J.b.f90385a, 0L, 5);
        }
        this.f92232b = null;
    }

    @Override // com.avito.android.async_phone.l
    public final void c(@Y61.k ApiError apiError) {
        InterfaceC28489k interfaceC28489k = this.f92232b;
        if (interfaceC28489k != null) {
            InterfaceC28489k.a.a(interfaceC28489k, null, new J.a(apiError), 0L, 4);
        }
        this.f92232b = null;
    }
}
