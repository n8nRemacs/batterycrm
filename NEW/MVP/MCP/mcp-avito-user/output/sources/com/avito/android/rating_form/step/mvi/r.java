package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RatingFormStepBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/photo_cache/q;", "uploadingState", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "<anonymous>", "(Lcom/avito/android/photo_cache/q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepBootstrap$observePhotoEvents$1", f = "RatingFormStepBootstrap.kt", i = {1}, l = {165, 177, 183}, m = "invokeSuspend", n = {"imageFieldIdentifier"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class r extends SuspendLambda implements Y41.p<com.avito.android.photo_cache.q, Continuation<? super InterfaceC43160i<? extends RatingFormStepInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f249685q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f249686r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f249687s;

    /* compiled from: RatingFormStepBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f249688b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return C42784z0.f406748b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f249687s = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f249687s, continuation);
        rVar.f249686r = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(com.avito.android.photo_cache.q qVar, Continuation<? super InterfaceC43160i<? extends RatingFormStepInternalAction>> continuation) {
        return ((r) create(qVar, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0194  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.mvi.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
