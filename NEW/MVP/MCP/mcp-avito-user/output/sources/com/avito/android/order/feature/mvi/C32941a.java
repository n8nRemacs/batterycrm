package com.avito.android.order.feature.mvi;

import P40.a;
import com.avito.android.Z0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.order.feature.mvi.entity.OrderInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OrderActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/order/feature/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LP40/a;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "LP40/c;", "a", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.order.feature.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32941a implements com.avito.android.arch.mvi.a<P40.a, OrderInternalAction, P40.c> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C6247a f209594g = new C6247a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final long f209595h = kotlin.time.g.g(2, DurationUnit.f410634f);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.order.feature.domain.a f209596a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.order.feature.data.a f209597b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f209598c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.a f209599d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z0 f209600e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f209601f;

    /* compiled from: OrderActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/order/feature/mvi/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.order.feature.mvi.a$a, reason: collision with other inner class name */
    public static final class C6247a {
        public /* synthetic */ C6247a(C42822w c42822w) {
            this();
        }

        public C6247a() {
        }
    }

    /* compiled from: OrderActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.order.feature.mvi.a$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f209602a;

        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                ConnectionState connectionState = ConnectionState.f118528b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f209602a = iArr;
        }
    }

    @Inject
    public C32941a(@Y61.k com.avito.android.order.feature.domain.a aVar, @Y61.k com.avito.android.order.feature.data.a aVar2, @com.avito.android.order.feature.di.module.b @Y61.k String str, @Y61.k com.avito.android.clientEventBus.a aVar3, @Y61.k Z0 z02, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f209596a = aVar;
        this.f209597b = aVar2;
        this.f209598c = str;
        this.f209599d = aVar3;
        this.f209600e = z02;
        this.f209601f = interfaceC28373a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0193 -> B:25:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.order.feature.mvi.C32941a r18, kotlinx.coroutines.flow.InterfaceC43172j r19, Y41.a r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.order.feature.mvi.C32941a.c(com.avito.android.order.feature.mvi.a, kotlinx.coroutines.flow.j, Y41.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        InterfaceC43160i interfaceC43160iC = C43175k.C(new j(this, aVar, null), c43197r1);
        Z0 z02 = this.f209600e;
        z02.getClass();
        kotlin.reflect.n<Object> nVar = Z0.f67595D[0];
        return C43175k.N(interfaceC43160iC, ((Boolean) z02.f67600c.a().invoke()).booleanValue() ? C43175k.Y(C43175k.r(kotlinx.coroutines.rx3.y.a(this.f209599d.a())), new C32942b(aVar, this, null, c43197r1)) : d(c43197r1, aVar));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<OrderInternalAction> b(P40.a aVar, P40.c cVar) {
        return e(aVar);
    }

    public final kotlinx.coroutines.flow.internal.l d(C43197r1 c43197r1, Y41.a aVar) {
        return C43175k.Y(C43175k.r(new g(new C43137a0(new h(aVar, null), c43197r1))), new i(this, aVar, null));
    }

    @Y61.k
    public final InterfaceC43160i e(@Y61.k P40.a aVar) {
        C43210w c43210w;
        if (aVar instanceof a.C0829a) {
            return this.f209596a.a();
        }
        if (aVar instanceof a.b) {
            c43210w = new C43210w(new OrderInternalAction.ShouldPollChanged(true));
        } else {
            if (!(aVar instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new OrderInternalAction.ShouldPollChanged(false));
        }
        return c43210w;
    }
}
