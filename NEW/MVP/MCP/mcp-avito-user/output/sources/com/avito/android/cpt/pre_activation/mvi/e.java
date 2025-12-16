package com.avito.android.cpt.pre_activation.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.cpt.pre_activation.mvi.entity.PreActivationInternalAction;
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
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements InterfaceC43160i<InterfaceC43160i<? extends PreActivationInternalAction>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f126726b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f126727b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.cpt.pre_activation.mvi.PreActivationBootstrap$observeMassActivationClosure$$inlined$mapNotNull$1$2", f = "PreActivationBootstrap.kt", i = {}, l = {230}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.cpt.pre_activation.mvi.e$a$a, reason: collision with other inner class name */
        public static final class C3777a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f126728q;

            /* renamed from: r, reason: collision with root package name */
            public int f126729r;

            public C3777a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f126728q = obj;
                this.f126729r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f126727b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                r0 = 1
                boolean r1 = r7 instanceof com.avito.android.cpt.pre_activation.mvi.e.a.C3777a
                if (r1 == 0) goto L14
                r1 = r7
                com.avito.android.cpt.pre_activation.mvi.e$a$a r1 = (com.avito.android.cpt.pre_activation.mvi.e.a.C3777a) r1
                int r2 = r1.f126729r
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L14
                int r2 = r2 - r3
                r1.f126729r = r2
                goto L19
            L14:
                com.avito.android.cpt.pre_activation.mvi.e$a$a r1 = new com.avito.android.cpt.pre_activation.mvi.e$a$a
                r1.<init>(r7)
            L19:
                java.lang.Object r7 = r1.f126728q
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r1.f126729r
                if (r3 == 0) goto L31
                if (r3 != r0) goto L29
                kotlin.C42729a0.b(r7)
                goto L63
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                kv.a r6 = (kv.C43501a) r6
                Ju.c r6 = r6.f413261b
                boolean r7 = r6 instanceof com.avito.android.cpt.mass_activation.deeplink.CptMassActivationEstimateLink.b.c
                if (r7 == 0) goto L55
                com.avito.android.cpt.pre_activation.mvi.entity.PreActivationInternalAction$SetResult r7 = new com.avito.android.cpt.pre_activation.mvi.entity.PreActivationInternalAction$SetResult
                com.avito.android.cpt.mass_activation.deeplink.CptMassActivationEstimateLink$b$c r6 = (com.avito.android.cpt.mass_activation.deeplink.CptMassActivationEstimateLink.b.c) r6
                com.avito.android.deep_linking.links.DeepLink r6 = r6.f126492b
                r7.<init>(r6)
                r6 = 2
                com.avito.android.cpt.pre_activation.mvi.entity.PreActivationInternalAction[] r6 = new com.avito.android.cpt.pre_activation.mvi.entity.PreActivationInternalAction[r6]
                r3 = 0
                r6[r3] = r7
                com.avito.android.cpt.pre_activation.mvi.entity.PreActivationInternalAction$CloseScreen r7 = com.avito.android.cpt.pre_activation.mvi.entity.PreActivationInternalAction.CloseScreen.f126731b
                r6[r0] = r7
                kotlinx.coroutines.flow.v r7 = new kotlinx.coroutines.flow.v
                r7.<init>(r6)
                goto L56
            L55:
                r7 = 0
            L56:
                if (r7 == 0) goto L63
                r1.f126729r = r0
                kotlinx.coroutines.flow.j r6 = r5.f126727b
                java.lang.Object r6 = r6.emit(r7, r1)
                if (r6 != r2) goto L63
                return r2
            L63:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpt.pre_activation.mvi.e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public e(d dVar) {
        this.f126726b = dVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC43160i<? extends PreActivationInternalAction>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f126726b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
