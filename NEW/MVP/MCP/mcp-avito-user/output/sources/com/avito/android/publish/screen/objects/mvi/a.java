package com.avito.android.publish.screen.objects.mvi;

import Ee0.C13479a;
import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ObjectFillFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.objects.mvi.ObjectFillFormActor$applyNavigationButtonAction$1", f = "ObjectFillFormActor.kt", i = {}, l = {75, 80}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ObjectFillFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f240180q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f240181r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C13479a f240182s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f240183t;

    /* compiled from: ObjectFillFormActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.screen.objects.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7212a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f240184a;

        static {
            int[] iArr = new int[CategoryPublishStep.Params.NavigationButtonAction.values().length];
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.CONDITIONAL_ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.SET_MANUAL_DATA_ENTRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.EXECUTE_BEDUIN_ACTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.PERFORM_DEEP_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CategoryPublishStep.Params.NavigationButtonAction.CONTINUE_PUBLISH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f240184a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C13479a c13479a, f fVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f240182s = c13479a;
        this.f240183t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f240182s, this.f240183t, continuation);
        aVar.f240181r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ObjectFillFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f240180q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.C42729a0.b(r8)
            goto L5f
        L1b:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f240181r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            Ee0.a r1 = r7.f240182s
            com.avito.android.remote.model.category_parameters.CategoryPublishStep$Params$NavigationButtonAction r4 = r1.f4127a
            r5 = -1
            if (r4 != 0) goto L2b
            r4 = r5
            goto L33
        L2b:
            int[] r6 = com.avito.android.publish.screen.objects.mvi.a.C7212a.f240184a
            int r4 = r4.ordinal()
            r4 = r6[r4]
        L33:
            if (r4 == r5) goto L4e
            r5 = 4
            if (r4 == r5) goto L3c
            r1 = 5
            if (r4 == r1) goto L4e
            goto L5f
        L3c:
            com.avito.android.deep_linking.links.DeepLink r1 = r1.f4129c
            if (r1 == 0) goto L5f
            com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction$OpenDeepLink r2 = new com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction$OpenDeepLink
            r2.<init>(r1)
            r7.f240180q = r3
            java.lang.Object r8 = r8.emit(r2, r7)
            if (r8 != r0) goto L5f
            return r0
        L4e:
            com.avito.android.publish.screen.objects.mvi.f r1 = r7.f240183t
            com.avito.android.publish.screen.objects.domain.a r1 = r1.f240221a
            kotlinx.coroutines.flow.f0 r1 = r1.k1()
            r7.f240180q = r2
            java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r1, r8)
            if (r8 != r0) goto L5f
            return r0
        L5f:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.objects.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
