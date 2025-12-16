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
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardActor$process$2", f = "CheckerboardActor.kt", i = {0}, l = {49, 54, 69}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.realty_agency.checkerboard.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34227c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251237q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f251238r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC19559a f251239s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C19563e f251240t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34225a f251241u;

    /* compiled from: CheckerboardActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.realty_agency.checkerboard.mvi.c$a */
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
    public C34227c(InterfaceC19559a interfaceC19559a, C19563e c19563e, C34225a c34225a, Continuation<? super C34227c> continuation) {
        super(2, continuation);
        this.f251239s = interfaceC19559a;
        this.f251240t = c19563e;
        this.f251241u = c34225a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34227c c34227c = new C34227c(this.f251239s, this.f251240t, this.f251241u, continuation);
        c34227c.f251238r = obj;
        return c34227c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34227c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251237q;
        InterfaceC19559a interfaceC19559a = this.f251239s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f251238r;
            InterfaceC19561c.g gVar = new InterfaceC19561c.g(((InterfaceC19559a.i) interfaceC19559a).f20412a);
            this.f251238r = interfaceC43172j;
            this.f251237q = 1;
            if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f251238r;
            C42729a0.b(obj);
        }
        C19563e c19563e = this.f251240t;
        int iOrdinal = c19563e.f20460c.ordinal();
        C34225a c34225a = this.f251241u;
        if (iOrdinal == 0) {
            InterfaceC43160i<InterfaceC19561c> interfaceC43160iA = c34225a.f251227a.a(c19563e.f20462e, 1L, c19563e.f20466i, c19563e.f20465h, ((InterfaceC19559a.i) interfaceC19559a).f20412a);
            this.f251238r = null;
            this.f251237q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (iOrdinal == 1) {
            Long l12 = c19563e.f20462e;
            if (l12 == null) {
                return G0.f406611a;
            }
            long jLongValue = l12.longValue();
            Long l13 = c19563e.f20463f;
            if (l13 == null) {
                return G0.f406611a;
            }
            long jLongValue2 = l13.longValue();
            InterfaceC43160i<InterfaceC19561c> interfaceC43160iB = c34225a.f251227a.b(jLongValue, jLongValue2, c34225a.f251231e.b(jLongValue2).getName(), ((InterfaceC19559a.i) interfaceC19559a).f20412a);
            this.f251238r = null;
            this.f251237q = 3;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
