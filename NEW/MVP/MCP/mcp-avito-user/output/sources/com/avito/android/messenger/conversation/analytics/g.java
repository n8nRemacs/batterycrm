package com.avito.android.messenger.conversation.analytics;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC22983P;
import com.avito.android.analytics.screens.J;
import com.avito.android.memory.consumption.f;
import kotlin.Metadata;

/* compiled from: MessageListComposeTracker.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/analytics/g;", "Lcom/avito/android/analytics/screens/compose/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements com.avito.android.analytics.screens.compose.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f189337b;

    public g(@k b bVar) {
        this.f189337b = bVar;
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void g(@k com.avito.android.analytics.screens.tracker.fps.h hVar) {
        this.f189337b.p(hVar);
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void m(@k String str) {
        this.f189337b.m();
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void n(@k String str, @k J j12, @l Integer num) {
        boolean zEquals = j12.equals(J.b.f90385a);
        b bVar = this.f189337b;
        if (zEquals) {
            bVar.o();
        } else if (j12 instanceof J.a) {
            bVar.i();
        }
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void d() {
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void e() {
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void f() {
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void l() {
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void a(long j12) {
    }

    @Override // com.avito.android.analytics.screens.compose.a
    public final void c(@k InterfaceC22983P interfaceC22983P, @k f.a aVar) {
    }
}
