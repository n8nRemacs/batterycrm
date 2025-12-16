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
public final class g implements InterfaceC43160i<SelectBusinessVrfInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f213453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f213454c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f213455b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f213456c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.SelectBusinessVrfBootstrap$handleDeeplinkResult$$inlined$map$1$2", f = "SelectBusinessVrfBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.g$a$a, reason: collision with other inner class name */
        public static final class C6401a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f213457q;

            /* renamed from: r, reason: collision with root package name */
            public int f213458r;

            public C6401a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f213457q = obj;
                this.f213458r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, i iVar) {
            this.f213455b = interfaceC43172j;
            this.f213456c = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.g.a.C6401a
                if (r0 == 0) goto L13
                r0 = r9
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.g$a$a r0 = (com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.g.a.C6401a) r0
                int r1 = r0.f213458r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f213458r = r1
                goto L18
            L13:
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.g$a$a r0 = new com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.g$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f213457q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f213458r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r9)
                goto L7c
            L29:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L31:
                kotlin.C42729a0.b(r9)
                kv.a r8 = (kv.C43501a) r8
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.i r9 = r7.f213456c
                r9.getClass()
                com.avito.android.deeplink_handler.handler.bundle.a r9 = r8.f413260a
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$MergeFinished r2 = new com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$MergeFinished
                r4 = 0
                r5 = 0
                r2.<init>(r5, r4)
                Ju.c r8 = r8.f413261b
                boolean r6 = r8 instanceof com.avito.android.deep_linking.links.InterfaceC29684j
                if (r6 == 0) goto L5e
                boolean r9 = r8 instanceof com.avito.android.deep_linking.links.InterfaceC29684j.b
                if (r9 == 0) goto L51
                com.avito.android.deep_linking.links.j$b r8 = (com.avito.android.deep_linking.links.InterfaceC29684j.b) r8
                goto L52
            L51:
                r8 = r5
            L52:
                if (r8 == 0) goto L71
                com.avito.android.printable_text.PrintableText r8 = r8.f134007c
                if (r8 == 0) goto L71
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$MergeFinished r2 = new com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$MergeFinished
                r2.<init>(r4, r8, r3, r5)
                goto L71
            L5e:
                boolean r8 = r8 instanceof com.avito.android.beduin.v2.page.m
                if (r8 == 0) goto L71
                java.lang.String r8 = "REQ_KEY_DUPLICATION_FINISH"
                java.lang.String r9 = r9.f134521b
                boolean r8 = kotlin.jvm.internal.L.f(r9, r8)
                if (r8 == 0) goto L71
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$MergeFinished r2 = new com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction$MergeFinished
                r2.<init>(r5, r3)
            L71:
                r0.f213458r = r3
                kotlinx.coroutines.flow.j r8 = r7.f213455b
                java.lang.Object r8 = r8.emit(r2, r0)
                if (r8 != r1) goto L7c
                return r1
            L7c:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public g(f fVar, i iVar) {
        this.f213453b = fVar;
        this.f213454c = iVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super SelectBusinessVrfInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f213453b.collect(new a(interfaceC43172j, this.f213454c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
