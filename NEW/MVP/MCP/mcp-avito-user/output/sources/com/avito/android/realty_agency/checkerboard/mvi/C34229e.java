package com.avito.android.realty_agency.checkerboard.mvi;

import Zh0.C19563e;
import Zh0.InterfaceC19559a;
import Zh0.InterfaceC19561c;
import com.avito.android.realty_agency.checkerboard.mvi.entity.MainContentTab;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CheckerboardActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LZh0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardActor$process$4", f = "CheckerboardActor.kt", i = {0}, l = {98, 102, 114}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.realty_agency.checkerboard.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34229e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251246q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f251247r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC19559a f251248s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C19563e f251249t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34225a f251250u;

    /* compiled from: CheckerboardActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.realty_agency.checkerboard.mvi.e$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MainContentTab.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MainContentTab mainContentTab = MainContentTab.f251251b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34229e(InterfaceC19559a interfaceC19559a, C19563e c19563e, C34225a c34225a, Continuation<? super C34229e> continuation) {
        super(2, continuation);
        this.f251248s = interfaceC19559a;
        this.f251249t = c19563e;
        this.f251250u = c34225a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34229e c34229e = new C34229e(this.f251248s, this.f251249t, this.f251250u, continuation);
        c34229e.f251247r = obj;
        return c34229e;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34229e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Long l12;
        Long l13;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251246q;
        InterfaceC19559a interfaceC19559a = this.f251248s;
        C19563e c19563e = this.f251249t;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f251247r;
            MainContentTab mainContentTab = ((InterfaceC19559a.e) interfaceC19559a).f20407a;
            if (mainContentTab == c19563e.f20460c) {
                return G0.f406611a;
            }
            InterfaceC19561c.s sVar = new InterfaceC19561c.s(mainContentTab);
            this.f251247r = interfaceC43172j;
            this.f251246q = 1;
            if (interfaceC43172j.emit(sVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f251247r;
            C42729a0.b(obj);
        }
        int iOrdinal = ((InterfaceC19559a.e) interfaceC19559a).f20407a.ordinal();
        C34225a c34225a = this.f251250u;
        if (iOrdinal == 0) {
            InterfaceC43160i<InterfaceC19561c> interfaceC43160iA = c34225a.f251227a.a(c19563e.f20462e, 1L, c19563e.f20466i, c19563e.f20465h, c19563e.f20459b);
            this.f251247r = null;
            this.f251246q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (iOrdinal == 1 && (l12 = c19563e.f20462e) != null && (l13 = c19563e.f20463f) != null) {
            InterfaceC43160i<InterfaceC19561c> interfaceC43160iB = c34225a.f251227a.b(l12.longValue(), l13.longValue(), c34225a.f251231e.b(l13.longValue()).getName(), c19563e.f20459b);
            this.f251247r = null;
            this.f251246q = 3;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
