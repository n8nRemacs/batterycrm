package com.avito.android.mortgage.landing.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.api.model.landing.LandingHeaderAction;
import com.avito.android.mortgage.api.model.landing.LandingHeaderActionType;
import com.avito.android.mortgage.landing.mvi.entity.LandingInternalAction;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LandingActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.landing.mvi.LandingActor$handleActionClicked$1", f = "LandingActor.kt", i = {}, l = {213, JfifUtil.MARKER_RST7}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super LandingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f200087q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f200088r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LandingHeaderAction f200089s;

    /* compiled from: LandingActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.landing.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5918a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f200090a;

        static {
            int[] iArr = new int[LandingHeaderActionType.values().length];
            try {
                iArr[LandingHeaderActionType.COLLAPSE_HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LandingHeaderActionType.NAVIGATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f200090a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LandingHeaderAction landingHeaderAction, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f200089s = landingHeaderAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f200089s, continuation);
        aVar.f200088r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super LandingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        DeepLink link;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f200087q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f200088r;
            LandingHeaderAction landingHeaderAction = this.f200089s;
            LandingHeaderActionType type = landingHeaderAction.getType();
            int i13 = type == null ? -1 : C5918a.f200090a[type.ordinal()];
            if (i13 == 1) {
                LandingInternalAction.CollapseHeader collapseHeader = LandingInternalAction.CollapseHeader.f200171b;
                this.f200087q = 1;
                if (interfaceC43172j.emit(collapseHeader, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i13 == 2 && (link = landingHeaderAction.getLink()) != null) {
                LandingInternalAction.HandleHeaderActionDeeplink handleHeaderActionDeeplink = new LandingInternalAction.HandleHeaderActionDeeplink(link);
                this.f200087q = 2;
                if (interfaceC43172j.emit(handleHeaderActionDeeplink, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
