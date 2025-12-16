package com.avito.android.passport.profile_add.merge.domain;

import Y41.p;
import Y61.l;
import com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink;
import com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PassportAccountsMergeInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.merge.domain.PassportAccountsMergeInteractorImpl$getBusinessVrfData$1", f = "PassportAccountsMergeInteractor.kt", i = {0, 1, 2}, l = {199, 201, 202, 207, 224, 233}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super SelectBusinessVrfInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f213019q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f213020r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PassportSelectBusinessVrfLink.Flow f213021s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f213022t;

    /* compiled from: PassportAccountsMergeInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f213023a;

        static {
            int[] iArr = new int[PassportSelectBusinessVrfLink.Flow.values().length];
            try {
                PassportSelectBusinessVrfLink.Flow flow = PassportSelectBusinessVrfLink.Flow.f211124b;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f213023a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PassportSelectBusinessVrfLink.Flow flow, b bVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f213021s = flow;
        this.f213022t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f213021s, this.f213022t, continuation);
        cVar.f213020r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectBusinessVrfInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.merge.domain.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
