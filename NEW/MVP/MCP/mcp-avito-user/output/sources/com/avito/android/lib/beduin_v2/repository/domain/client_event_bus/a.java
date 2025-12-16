package com.avito.android.lib.beduin_v2.repository.domain.client_event_bus;

import Y41.l;
import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.util.InterfaceC35745a5;
import dV0.C39630a;
import io.reactivex.rxjava3.internal.operators.observable.K0;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;
import mx0.InterfaceC44149a;

/* compiled from: ClientEventBusRepositoryClientImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/clientEventBus/ConnectionState;", "connectionState", "Lio/reactivex/rxjava3/core/E;", "Lmx0/a;", "apply", "(Lcom/avito/android/clientEventBus/ConnectionState;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f176577b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C39630a f176578c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l<Map<String, String>, G0> f176579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f176580e;

    /* compiled from: ClientEventBusRepositoryClientImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.beduin_v2.repository.domain.client_event_bus.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5231a {
        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ConnectionState connectionState = ConnectionState.f118528b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(d dVar, C39630a c39630a, l<? super Map<String, String>, G0> lVar, Y41.a<G0> aVar) {
        this.f176577b = dVar;
        this.f176578c = c39630a;
        this.f176579d = lVar;
        this.f176580e = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int iOrdinal = ((ConnectionState) obj).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            this.f176580e.invoke();
            return U.f403867b;
        }
        d dVar = this.f176577b;
        dVar.getClass();
        C39630a c39630a = this.f176578c;
        K0 k0L0 = dVar.f176583a.b(InterfaceC44149a.class, new mx0.e(c39630a.f393895a, c39630a.f393896b, false, 4, null)).l0(b.f176581b);
        InterfaceC35745a5 interfaceC35745a5 = dVar.f176584b;
        return k0L0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).K(new c(this.f176579d));
    }
}
