package com.avito.android.guests_selector.mvi;

import Y41.p;
import com.avito.android.guests_selector.mvi.entity.GuestsSelectorInternalAction;
import com.avito.android.guests_selector.mvi.entity.state.entity.ActivePageType;
import com.huawei.hms.adapter.internal.AvailableCode;
import gI.InterfaceC40585a;
import hI.C40827a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GuestsSelectorActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/guests_selector/mvi/entity/GuestsSelectorInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.guests_selector.mvi.GuestsSelectorActor$process$1", f = "GuestsSelectorActor.kt", i = {3}, l = {AvailableCode.ERROR_NO_ACTIVITY, 30, 35, 48, 49, 60, 71, 75, 80, 85}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super GuestsSelectorInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f161521q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f161522r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40585a f161523s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40827a f161524t;

    /* compiled from: GuestsSelectorActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.guests_selector.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C4735a {
        static {
            int[] iArr = new int[ActivePageType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActivePageType activePageType = ActivePageType.f161554b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC40585a interfaceC40585a, C40827a c40827a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f161523s = interfaceC40585a;
        this.f161524t = c40827a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f161523s, this.f161524t, continuation);
        aVar.f161522r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super GuestsSelectorInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0144 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.guests_selector.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
