package com.avito.android.orderBeduinV2.mvi;

import U40.a;
import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction;
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
import kotlinx.coroutines.rx3.y;

/* compiled from: OrderActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LU40/a;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "LU40/c;", "a", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<U40.a, OrderInternalAction, U40.c> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C6261a f209834f = new C6261a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final long f209835g = kotlin.time.g.g(2, DurationUnit.f410634f);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.orderBeduinV2.mvi.domain.a f209836a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.order.feature.data.a f209837b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f209838c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.clientEventBus.a f209839d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dD.b f209840e;

    /* compiled from: OrderActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.orderBeduinV2.mvi.a$a, reason: collision with other inner class name */
    public static final class C6261a {
        public /* synthetic */ C6261a(C42822w c42822w) {
            this();
        }

        public C6261a() {
        }
    }

    /* compiled from: OrderActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f209841a;

        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                ConnectionState connectionState = ConnectionState.f118528b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f209841a = iArr;
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.orderBeduinV2.mvi.domain.a aVar, @Y61.k com.avito.android.order.feature.data.a aVar2, @com.avito.android.order.feature.di.module.b @Y61.k String str, @Y61.k com.avito.android.clientEventBus.a aVar3, @Y61.k dD.b bVar) {
        this.f209836a = aVar;
        this.f209837b = aVar2;
        this.f209838c = str;
        this.f209839d = aVar3;
        this.f209840e = bVar;
    }

    public static final InterfaceC43160i c(a aVar, C43197r1 c43197r1, Y41.a aVar2) {
        dD.b bVar = aVar.f209840e;
        bVar.getClass();
        kotlin.reflect.n<Object> nVar = dD.b.f393739f[1];
        return !((Boolean) bVar.f393741c.a().invoke()).booleanValue() ? C43175k.w() : C43175k.Y(C43175k.r(new g(new C43137a0(new h(aVar2, null), c43197r1))), new i(aVar, aVar2, null));
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
    public static final java.lang.Object d(com.avito.android.orderBeduinV2.mvi.a r18, kotlinx.coroutines.flow.InterfaceC43172j r19, Y41.a r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.orderBeduinV2.mvi.a.d(com.avito.android.orderBeduinV2.mvi.a, kotlinx.coroutines.flow.j, Y41.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.C(new j(this, aVar, null), c43197r1), C43175k.Y(C43175k.r(y.a(this.f209839d.a())), new com.avito.android.orderBeduinV2.mvi.b(aVar, this, null, c43197r1)));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<OrderInternalAction> b(U40.a aVar, U40.c cVar) {
        return e(aVar);
    }

    @Y61.k
    public final InterfaceC43160i e(@Y61.k U40.a aVar) {
        C43210w c43210w;
        if (aVar instanceof a.f) {
            return new C43210w(new OrderInternalAction.ShouldPollChanged(true));
        }
        if (aVar instanceof a.g) {
            return new C43210w(new OrderInternalAction.ShouldPollChanged(false));
        }
        if (aVar instanceof a.h) {
            c43210w = new C43210w(new OrderInternalAction.HandleBeduinState(((a.h) aVar).f16167a));
        } else {
            if (!(aVar instanceof a.C1096a)) {
                if (aVar.equals(a.e.f16164a)) {
                    return this.f209836a.a();
                }
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new OrderInternalAction.HandleBeduinEvent(((a.C1096a) aVar).f16163a));
        }
        return c43210w;
    }
}
