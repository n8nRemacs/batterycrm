package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements InterfaceC43160i<SelectBusinessVrfInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f213419b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f213420b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.SelectBusinessVrfActor$process$$inlined$map$1$2", f = "SelectBusinessVrfActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.b$a$a, reason: collision with other inner class name */
        public static final class C6399a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f213421q;

            /* renamed from: r, reason: collision with root package name */
            public int f213422r;

            public C6399a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f213421q = obj;
                this.f213422r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f213420b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.b.a.C6399a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.b$a$a r0 = (com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.b.a.C6399a) r0
                int r1 = r0.f213422r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f213422r = r1
                goto L18
            L13:
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.b$a$a r0 = new com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.b$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f213421q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f213422r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L77
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                com.avito.android.passport.profile_add.merge.domain.MergeFinishInternalAction r6 = (com.avito.android.passport.profile_add.merge.domain.MergeFinishInternalAction) r6
                boolean r7 = r6 instanceof com.avito.android.passport.profile_add.merge.domain.MergeFinishInternalAction.MergeFinishError
                if (r7 == 0) goto L44
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$MergeError r7 = new com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$MergeError
                com.avito.android.passport.profile_add.merge.domain.MergeFinishInternalAction$MergeFinishError r6 = (com.avito.android.passport.profile_add.merge.domain.MergeFinishInternalAction.MergeFinishError) r6
                java.lang.Throwable r6 = r6.f212980b
                r7.<init>(r6)
                goto L6c
            L44:
                boolean r7 = r6 instanceof com.avito.android.passport.profile_add.merge.domain.MergeFinishInternalAction.MergeFinished
                r2 = 0
                if (r7 == 0) goto L54
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$MergeFinished r7 = new com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$MergeFinished
                com.avito.android.passport.profile_add.merge.domain.MergeFinishInternalAction$MergeFinished r6 = (com.avito.android.passport.profile_add.merge.domain.MergeFinishInternalAction.MergeFinished) r6
                com.avito.android.printable_text.PrintableText r6 = r6.f212982b
                r4 = 0
                r7.<init>(r4, r6, r3, r2)
                goto L6c
            L54:
                boolean r7 = r6 instanceof com.avito.android.passport.profile_add.merge.domain.MergeFinishInternalAction.MergeFinishing
                if (r7 == 0) goto L5e
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$Loading r7 = new com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$Loading
                r7.<init>()
                goto L6c
            L5e:
                boolean r7 = r6 instanceof com.avito.android.passport.profile_add.merge.domain.MergeFinishInternalAction.a
                if (r7 == 0) goto L7a
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$OpenDeepLink r7 = new com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$OpenDeepLink
                com.avito.android.passport.profile_add.merge.domain.MergeFinishInternalAction$a r6 = (com.avito.android.passport.profile_add.merge.domain.MergeFinishInternalAction.a) r6
                com.avito.android.deep_linking.links.DeepLink r6 = r6.f212985b
                r4 = 2
                r7.<init>(r6, r2, r4, r2)
            L6c:
                r0.f213422r = r3
                kotlinx.coroutines.flow.j r6 = r5.f213420b
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L77
                return r1
            L77:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            L7a:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public b(InterfaceC43160i interfaceC43160i) {
        this.f213419b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super SelectBusinessVrfInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f213419b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
