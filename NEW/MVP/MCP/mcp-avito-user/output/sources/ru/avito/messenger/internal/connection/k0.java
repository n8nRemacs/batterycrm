package ru.avito.messenger.internal.connection;

import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import com.avito.android.util.InterfaceC35745a5;
import kotlin.Metadata;
import n11.RunnableC44167a;

/* compiled from: MessengerForegroundStateProvider.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lru/avito/messenger/internal/connection/k0;", "Lru/avito/messenger/internal/connection/a;", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onAppForeground$_avito_discouraged_messenger", "()V", "onAppForeground", "onAppBackground$_avito_discouraged_messenger", "onAppBackground", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class k0 implements InterfaceC47748a, InterfaceC22982O {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Boolean> f431362b = com.jakewharton.rxrelay3.b.N0(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f431363c;

    public k0(@Y61.k InterfaceC35745a5 interfaceC35745a5) {
        interfaceC35745a5.e().d(new RunnableC44167a(this, 5));
    }

    @Override // ru.avito.messenger.internal.connection.InterfaceC47748a
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Boolean> a(boolean z12) {
        com.jakewharton.rxrelay3.b<Boolean> bVar = this.f431362b;
        return z12 ? bVar : bVar.q0(1L);
    }

    @Override // ru.avito.messenger.internal.connection.InterfaceC47748a
    /* renamed from: b, reason: from getter */
    public final boolean getF431363c() {
        return this.f431363c;
    }

    @j.k0
    @InterfaceC23042i0(Lifecycle.Event.ON_STOP)
    public final void onAppBackground$_avito_discouraged_messenger() {
        this.f431362b.accept(Boolean.FALSE);
    }

    @j.k0
    @InterfaceC23042i0(Lifecycle.Event.ON_START)
    public final void onAppForeground$_avito_discouraged_messenger() {
        this.f431362b.accept(Boolean.TRUE);
        this.f431363c = true;
    }
}
