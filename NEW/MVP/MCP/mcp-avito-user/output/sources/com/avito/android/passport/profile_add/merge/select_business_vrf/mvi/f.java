package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements InterfaceC43160i<C43501a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43197r1 f213446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f213447c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f213448b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f213449c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.SelectBusinessVrfBootstrap$handleDeeplinkResult$$inlined$filter$1$2", f = "SelectBusinessVrfBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.f$a$a, reason: collision with other inner class name */
        public static final class C6400a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f213450q;

            /* renamed from: r, reason: collision with root package name */
            public int f213451r;

            public C6400a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f213450q = obj;
                this.f213451r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, i iVar) {
            this.f213448b = interfaceC43172j;
            this.f213449c = iVar;
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
                boolean r0 = r7 instanceof com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.f.a.C6400a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.f$a$a r0 = (com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.f.a.C6400a) r0
                int r1 = r0.f213451r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f213451r = r1
                goto L18
            L13:
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.f$a$a r0 = new com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.f$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f213450q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f213451r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L5d
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                r7 = r6
                kv.a r7 = (kv.C43501a) r7
                com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.i r2 = r5.f213449c
                r2.getClass()
                com.avito.android.deeplink_handler.handler.bundle.a r2 = r7.f413260a
                Ju.c r7 = r7.f413261b
                boolean r4 = r7 instanceof com.avito.android.deep_linking.links.InterfaceC29684j
                if (r4 != 0) goto L52
                boolean r7 = r7 instanceof com.avito.android.beduin.v2.page.m
                if (r7 == 0) goto L5d
                java.lang.String r7 = "REQ_KEY_DUPLICATION_FINISH"
                java.lang.String r2 = r2.f134521b
                boolean r7 = kotlin.jvm.internal.L.f(r2, r7)
                if (r7 == 0) goto L5d
            L52:
                r0.f213451r = r3
                kotlinx.coroutines.flow.j r7 = r5.f213448b
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L5d
                return r1
            L5d:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public f(C43197r1 c43197r1, i iVar) {
        this.f213446b = c43197r1;
        this.f213447c = iVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super C43501a> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f213446b.collect(new a(interfaceC43172j, this.f213447c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
