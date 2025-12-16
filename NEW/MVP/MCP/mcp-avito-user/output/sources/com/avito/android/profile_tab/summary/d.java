package com.avito.android.profile_tab.summary;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
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
/* loaded from: classes16.dex */
public final class d implements InterfaceC43160i<Dc0.g> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.c f230857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f230858c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f230859b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f230860c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.profile_tab.summary.ProfileSummaryFeatureViewModel$state$2$invoke$$inlined$map$1$2", f = "ProfileSummaryFeatureViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.profile_tab.summary.d$a$a, reason: collision with other inner class name */
        public static final class C7023a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f230861q;

            /* renamed from: r, reason: collision with root package name */
            public int f230862r;

            public C7023a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f230861q = obj;
                this.f230862r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, c cVar) {
            this.f230859b = interfaceC43172j;
            this.f230860c = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r11, @Y61.k kotlin.coroutines.Continuation r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof com.avito.android.profile_tab.summary.d.a.C7023a
                if (r0 == 0) goto L13
                r0 = r12
                com.avito.android.profile_tab.summary.d$a$a r0 = (com.avito.android.profile_tab.summary.d.a.C7023a) r0
                int r1 = r0.f230862r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f230862r = r1
                goto L18
            L13:
                com.avito.android.profile_tab.summary.d$a$a r0 = new com.avito.android.profile_tab.summary.d$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f230861q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f230862r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r12)
                goto Lb0
            L2a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L32:
                kotlin.C42729a0.b(r12)
                Dc0.f r11 = (Dc0.f) r11
                com.avito.android.profile_tab.summary.c r12 = r10.f230860c
                r12.getClass()
                com.avito.android.profile_tab.summary.e r12 = r11.f3277b
                Dc0.f$a r2 = r11.f3279d
                boolean r4 = r2 instanceof Dc0.f.a.d
                if (r4 == 0) goto L47
                Dc0.g$a$d r2 = Dc0.g.a.d.f3294a
                goto L9e
            L47:
                boolean r4 = r2 instanceof Dc0.f.a.c
                if (r4 == 0) goto L4e
                Dc0.g$a$c r2 = Dc0.g.a.c.f3293a
                goto L9e
            L4e:
                boolean r4 = r2 instanceof Dc0.f.a.b
                if (r4 == 0) goto L5f
                Dc0.g$a$b r4 = new Dc0.g$a$b
                Dc0.f$a$b r2 = (Dc0.f.a.b) r2
                com.avito.android.remote.error.ApiError r5 = r2.f3283a
                java.lang.Throwable r2 = r2.f3284b
                r4.<init>(r5, r2)
                r2 = r4
                goto L9e
            L5f:
                boolean r4 = r2 instanceof Dc0.f.a.C0174a
                if (r4 == 0) goto Lb3
                Dc0.f$a$a r2 = (Dc0.f.a.C0174a) r2
                java.util.List<java.lang.String> r4 = r2.f3282c
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                r6 = 10
                int r6 = kotlin.collections.C42745f0.q(r4, r6)
                int r6 = kotlin.collections.P0.f(r6)
                r7 = 16
                if (r6 >= r7) goto L7a
                r6 = r7
            L7a:
                r5.<init>(r6)
                java.util.Iterator r4 = r4.iterator()
            L81:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L99
                java.lang.Object r6 = r4.next()
                r7 = r6
                java.lang.String r7 = (java.lang.String) r7
                Dc0.h r8 = new Dc0.h
                com.avito.android.remote.model.BeduinV2 r9 = r2.f3281b
                r8.<init>(r7, r9)
                r5.put(r6, r8)
                goto L81
            L99:
                Dc0.g$a$a r2 = new Dc0.g$a$a
                r2.<init>(r5)
            L9e:
                Dc0.g r4 = new Dc0.g
                ZS.b r11 = r11.f3278c
                r4.<init>(r12, r11, r2)
                r0.f230862r = r3
                kotlinx.coroutines.flow.j r11 = r10.f230859b
                java.lang.Object r11 = r11.emit(r4, r0)
                if (r11 != r1) goto Lb0
                return r1
            Lb0:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            Lb3:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_tab.summary.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public d(com.avito.android.arch.mvi.c cVar, c cVar2) {
        this.f230857b = cVar;
        this.f230858c = cVar2;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super Dc0.g> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = this.f230857b.collect(new a(interfaceC43172j, this.f230858c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
