package com.avito.android.rating_form.step.mvi;

import ch0.C27195a;
import com.avito.android.rating_form.C34198a;
import com.avito.android.rating_form.StepIdentifier;
import com.avito.android.rating_form.step.RatingFormStepArguments;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import hh0.C40940b;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormStepBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/step/mvi/s;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class s implements com.avito.android.arch.mvi.b<RatingFormStepInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RatingFormStepArguments f249689a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.item.photo_picker.m f249690b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.i f249691c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.interactor.i f249692d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.j f249693e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.step.f f249694f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.m f249695g;

    /* compiled from: RatingFormStepBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepBootstrap$produce$1", f = "RatingFormStepBootstrap.kt", i = {0, 1}, l = {56, 57, 68, 69, 71}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f249696q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f249697r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = s.this.new a(continuation);
            aVar.f249697r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.mvi.s.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public s(@Y61.k com.avito.android.rating_form.y yVar, @Y61.k RatingFormStepArguments ratingFormStepArguments, @Y61.k com.avito.android.rating_form.item.photo_picker.m mVar, @Y61.k com.avito.android.rating_form.i iVar, @Y61.k com.avito.android.rating_form.interactor.i iVar2, @Y61.k com.avito.android.photo_cache.j jVar, @Y61.k com.avito.android.rating_form.step.f fVar) {
        this.f249689a = ratingFormStepArguments;
        this.f249690b = mVar;
        this.f249691c = iVar;
        this.f249692d = iVar2;
        this.f249693e = jVar;
        this.f249694f = fVar;
        this.f249695g = yVar.b(ratingFormStepArguments.f249115c);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0085 -> B:27:0x0086). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.rating_form.step.mvi.s r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof com.avito.android.rating_form.step.mvi.o
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.rating_form.step.mvi.o r0 = (com.avito.android.rating_form.step.mvi.o) r0
            int r1 = r0.f249667u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249667u = r1
            goto L18
        L13:
            com.avito.android.rating_form.step.mvi.o r0 = new com.avito.android.rating_form.step.mvi.o
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f249665s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f249667u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.Iterator r9 = r0.f249664r
            com.avito.android.rating_form.step.mvi.s r2 = r0.f249663q
            kotlin.C42729a0.b(r10)
            goto L86
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.C42729a0.b(r10)
            com.avito.android.rating_form.step.RatingFormStepArguments r10 = r9.f249689a
            com.avito.android.rating_form.StepIdentifier r10 = r10.f249116d
            com.avito.android.rating_form.m r2 = r9.f249695g
            java.util.ArrayList r10 = r2.y(r10)
            if (r10 == 0) goto L88
            java.util.Iterator r10 = r10.iterator()
            r8 = r10
            r10 = r9
            r9 = r8
        L4b:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r9.next()
            com.avito.android.rating_form.api.remote.model.RatingFormField r2 = (com.avito.android.rating_form.api.remote.model.RatingFormField) r2
            java.util.List r4 = r2.l()
            boolean r5 = com.avito.android.util.O2.a(r4)
            if (r5 == 0) goto L4b
            com.avito.android.rating_form.api.remote.model.RatingFormField$EntityType r5 = r2.getEntityType()
            com.avito.android.rating_form.api.remote.model.RatingFormField$EntityType r6 = com.avito.android.rating_form.api.remote.model.RatingFormField.EntityType.FILES
            if (r5 != r6) goto L4b
            com.avito.android.rating_form.step.f r5 = r10.f249694f
            com.avito.android.rating_form.FieldIdentifier r6 = new com.avito.android.rating_form.FieldIdentifier
            int r7 = r2.getId()
            java.lang.String r2 = r2.getSlug()
            r6.<init>(r7, r2)
            r0.f249663q = r10
            r0.f249664r = r9
            r0.f249667u = r3
            java.lang.Object r2 = r5.a(r6, r4, r0)
            if (r2 != r1) goto L85
            goto L8a
        L85:
            r2 = r10
        L86:
            r10 = r2
            goto L4b
        L88:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.mvi.s.c(com.avito.android.rating_form.step.mvi.s, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static RatingFormStepInternalAction.ButtonList d(s sVar, boolean z12) {
        RatingFormStepArguments ratingFormStepArguments = sVar.f249689a;
        StepIdentifier stepIdentifier = ratingFormStepArguments.f249116d;
        com.avito.android.rating_form.m mVar = sVar.f249695g;
        List<C34198a> listT = mVar.t(stepIdentifier);
        return new RatingFormStepInternalAction.ButtonList(new C40940b(com.avito.android.rating_form.step.d.a(listT, z12, true), mVar.s(ratingFormStepArguments.f249116d), true));
    }

    public static RatingFormStepInternalAction.FinishButton e(s sVar, boolean z12) {
        RatingFormStepArguments ratingFormStepArguments = sVar.f249689a;
        StepIdentifier stepIdentifier = ratingFormStepArguments.f249116d;
        com.avito.android.rating_form.m mVar = sVar.f249695g;
        return new RatingFormStepInternalAction.FinishButton(new C27195a(mVar.s(ratingFormStepArguments.f249116d), true, z12, true, mVar.q(stepIdentifier)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<RatingFormStepInternalAction> a() {
        return C43175k.N(C43175k.B(new r(this, null), kotlinx.coroutines.rx3.y.a(this.f249693e.b())), C43175k.B(new q(this, null), C43175k.b(this.f249694f.f249480h)), C43175k.B(new p(this, null), this.f249692d.getF248219h()), C43175k.G(new a(null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
