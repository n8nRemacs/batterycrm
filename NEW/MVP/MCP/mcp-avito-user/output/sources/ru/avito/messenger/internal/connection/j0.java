package ru.avito.messenger.internal.connection;

import Oq.InterfaceC14725a;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.LinkedHashMap;
import k91.AbstractC42548f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.C47740g0;
import ru.avito.messenger.InterfaceC47734d0;
import ru.avito.messenger.internal.connection.InterfaceC47751d;
import ru.avito.messenger.internal.connection.MessengerSocketTerminationException;

/* compiled from: MessengerConnectionHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_messenger"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class j0 {

    /* compiled from: MessengerConnectionHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "refreshed", "Lru/avito/messenger/internal/connection/d$b;", "apply", "(Z)Lru/avito/messenger/internal/connection/d$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431354b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC42548f f431355c;

        public a(String str, AbstractC42548f abstractC42548f) {
            this.f431354b = str;
            this.f431355c = abstractC42548f;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((Boolean) obj).booleanValue() ? new InterfaceC47751d.b.c(true, null, this.f431354b, 2, null) : new InterfaceC47751d.b.c(true, this.f431355c, null);
        }
    }

    /* compiled from: MessengerConnectionHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "refreshed", "Lru/avito/messenger/internal/connection/d$b;", "apply", "(Z)Lru/avito/messenger/internal/connection/d$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431356b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC42548f f431357c;

        public b(String str, AbstractC42548f abstractC42548f) {
            this.f431356b = str;
            this.f431357c = abstractC42548f;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                return new InterfaceC47751d.b.c(true, null, this.f431356b, 2, null);
            }
            return new InterfaceC47751d.b.c(true, this.f431357c, this.f431356b);
        }
    }

    /* compiled from: MessengerConnectionHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f431358b;

        public c(Y41.l lVar) {
            this.f431358b = lVar;
        }

        @Override // l41.o
        public final /* synthetic */ Object apply(Object obj) {
            return this.f431358b.invoke(obj);
        }
    }

    @j.k0
    @Y61.k
    public static final io.reactivex.rxjava3.core.I<InterfaceC47751d.b> a(@Y61.k AbstractC42548f abstractC42548f, @Y61.k ru.avito.messenger.j0 j0Var, @Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k InterfaceC14725a interfaceC14725a, @Y61.k C47740g0 c47740g0, boolean z12, @Y61.k InterfaceC47734d0 interfaceC47734d0) {
        Throwable unknown;
        Integer f406146b;
        boolean z13 = abstractC42548f instanceof AbstractC42548f.e;
        if (z13) {
            unknown = new MessengerSocketTerminationException.UnauthorizedError(((AbstractC42548f.e) abstractC42548f).f406145c);
        } else if (abstractC42548f instanceof AbstractC42548f.c) {
            unknown = new MessengerSocketTerminationException.ForbiddenError(((AbstractC42548f.c) abstractC42548f).f406140b);
        } else if (abstractC42548f instanceof AbstractC42548f.a) {
            unknown = new MessengerSocketTerminationException.ClosedByUser();
        } else if (abstractC42548f instanceof AbstractC42548f.d) {
            unknown = new MessengerSocketTerminationException.NetworkError(((AbstractC42548f.d) abstractC42548f).f406142b);
        } else {
            if (!(abstractC42548f instanceof AbstractC42548f.C11606f)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC42548f.C11606f c11606f = (AbstractC42548f.C11606f) abstractC42548f;
            unknown = new MessengerSocketTerminationException.Unknown(c11606f.f406147c, c11606f.f406148d);
        }
        LinkedHashMap linkedHashMapJ = P0.j(new kotlin.Q("session", str), new kotlin.Q(SearchParamsConverterKt.SOURCE, str2));
        Integer f406146b2 = abstractC42548f.getF406146b();
        if (f406146b2 != null) {
            org.webrtc.h.i(f406146b2, "code", linkedHashMapJ);
        }
        if (str3 != null) {
            linkedHashMapJ.put("sequenceId", str3);
        }
        G0 g02 = G0.f406611a;
        InterfaceC14725a.C0808a.a(interfaceC14725a, unknown, linkedHashMapJ, 2);
        if (str.length() <= 0 || !z13) {
            return (str3 == null || (f406146b = abstractC42548f.getF406146b()) == null || f406146b.intValue() != 3410) ? abstractC42548f instanceof AbstractC42548f.d ? interfaceC47734d0.a().r(new b(str3, abstractC42548f)) : io.reactivex.rxjava3.core.I.q(new InterfaceC47751d.b.c(true, abstractC42548f, str3)) : io.reactivex.rxjava3.core.I.q(new InterfaceC47751d.b.c(true, abstractC42548f, null));
        }
        return (!z12 || System.currentTimeMillis() - c47740g0.f430745a.get() >= 15000) ? j0Var.a(str, str2).u(new com.avito.android.analytics.clickstream.I(5)).r(new a(str3, abstractC42548f)) : io.reactivex.rxjava3.core.I.q(new InterfaceC47751d.b.c(true, abstractC42548f, null));
    }
}
