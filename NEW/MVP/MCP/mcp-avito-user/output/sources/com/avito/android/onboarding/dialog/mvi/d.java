package com.avito.android.onboarding.dialog.mvi;

import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogInternalAction;
import com.avito.android.remote.model.onboarding.ButtonAction;
import com.avito.android.remote.model.onboarding.RequestType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OnboardingDialogActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.onboarding.dialog.mvi.OnboardingDialogActor$process$4", f = "OnboardingDialogActor.kt", i = {4}, l = {83, 91, 107, 120, 137, 138, 141, 146, 150}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OnboardingDialogInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f208879q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f208880r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C40.a f208881s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f208882t;

    /* compiled from: OnboardingDialogActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f208883a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f208884b;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.CV_SET_READY_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.DEACTIVATE_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f208883a = iArr;
            int[] iArr2 = new int[ButtonAction.values().length];
            try {
                iArr2[ButtonAction.GO_TO_URI.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ButtonAction.SEND_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonAction.HANDLE_URI_AND_NEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonAction.NEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ButtonAction.CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f208884b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C40.a aVar, h hVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f208881s = aVar;
        this.f208882t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f208881s, this.f208882t, continuation);
        dVar.f208880r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super OnboardingDialogInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0195  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.dialog.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
