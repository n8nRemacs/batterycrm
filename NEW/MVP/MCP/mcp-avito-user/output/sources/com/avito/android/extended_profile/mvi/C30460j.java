package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import oB.C44616b;

/* compiled from: ExtendedProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$handleWidgetAction$6", f = "ExtendedProfileActor.kt", i = {}, l = {460}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile.mvi.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30460j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150318q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f150319r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C30451a f150320s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ oB.k f150321t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30460j(C30451a c30451a, Continuation continuation, oB.k kVar) {
        super(2, continuation);
        this.f150320s = c30451a;
        this.f150321t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30460j c30460j = new C30460j(this.f150320s, continuation, this.f150321t);
        c30460j.f150319r = obj;
        return c30460j;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30460j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150318q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f150319r;
            this.f150320s.f150087u.c(eA.f.f395009c);
            C44616b c44616b = (C44616b) this.f150321t;
            ExtendedProfileInternalAction.OpenGallery openGallery = new ExtendedProfileInternalAction.OpenGallery(c44616b.f419504b, c44616b.f419505c);
            this.f150318q = 1;
            if (interfaceC43172j.emit(openGallery, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
