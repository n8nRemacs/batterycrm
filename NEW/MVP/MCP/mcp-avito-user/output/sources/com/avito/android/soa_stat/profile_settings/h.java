package com.avito.android.soa_stat.profile_settings;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.soa_stat.profile_settings.view.a;
import com.avito.android.util.R0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: SoaStatProfileSettingsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.soa_stat.profile_settings.SoaStatProfileSettingsActivity$collectViewModel$1", f = "SoaStatProfileSettingsActivity.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class h extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f284105q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SoaStatProfileSettingsActivity f284106r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.soa_stat.profile_settings.view.a f284107s;

    /* compiled from: SoaStatProfileSettingsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a implements InterfaceC43172j, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.soa_stat.profile_settings.view.a f284108b;

        public a(com.avito.android.soa_stat.profile_settings.view.a aVar) {
            this.f284108b = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            this.f284108b.b((a.c) obj);
            G0 g02 = G0.f406611a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g02;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new C42801a(2, this.f284108b, com.avito.android.soa_stat.profile_settings.view.a.class, "renderState", "renderState(Lcom/avito/android/soa_stat/profile_settings/view/SoaStatSettingsView$State;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<a.c> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n2 f284109b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f284110b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.soa_stat.profile_settings.SoaStatProfileSettingsActivity$collectViewModel$1$invokeSuspend$$inlined$map$1$2", f = "SoaStatProfileSettingsActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.soa_stat.profile_settings.h$b$a$a, reason: collision with other inner class name */
            public static final class C8479a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f284111q;

                /* renamed from: r, reason: collision with root package name */
                public int f284112r;

                public C8479a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f284111q = obj;
                    this.f284112r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f284110b = interfaceC43172j;
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
                    boolean r0 = r12 instanceof com.avito.android.soa_stat.profile_settings.h.b.a.C8479a
                    if (r0 == 0) goto L13
                    r0 = r12
                    com.avito.android.soa_stat.profile_settings.h$b$a$a r0 = (com.avito.android.soa_stat.profile_settings.h.b.a.C8479a) r0
                    int r1 = r0.f284112r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f284112r = r1
                    goto L18
                L13:
                    com.avito.android.soa_stat.profile_settings.h$b$a$a r0 = new com.avito.android.soa_stat.profile_settings.h$b$a$a
                    r0.<init>(r12)
                L18:
                    java.lang.Object r12 = r0.f284111q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f284112r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r12)
                    goto L7e
                L29:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L31:
                    kotlin.C42729a0.b(r12)
                    Vw0.c r11 = (Vw0.c) r11
                    Vw0.c$a r12 = r11.f17506b
                    boolean r2 = r12 instanceof Vw0.c.a.C1215a
                    if (r2 == 0) goto L48
                    com.avito.android.soa_stat.profile_settings.view.a$c$b r2 = new com.avito.android.soa_stat.profile_settings.view.a$c$b
                    Vw0.c$a$a r12 = (Vw0.c.a.C1215a) r12
                    com.avito.android.remote.error.ApiError r4 = r12.f17507a
                    java.lang.Throwable r12 = r12.f17508b
                    r2.<init>(r4, r12)
                    goto L6c
                L48:
                    boolean r2 = r12 instanceof Vw0.c.a.b
                    if (r2 == 0) goto L5f
                    Vw0.c$a$b r12 = (Vw0.c.a.b) r12
                    com.avito.android.printable_text.PrintableText r5 = r12.f17509a
                    com.avito.android.soa_stat.profile_settings.view.a$c$a r2 = new com.avito.android.soa_stat.profile_settings.view.a$c$a
                    boolean r8 = r12.f17512d
                    boolean r9 = r12.f17513e
                    com.avito.android.remote.model.text.AttributedText r6 = r12.f17510b
                    com.avito.android.remote.model.Image r7 = r12.f17511c
                    r4 = r2
                    r4.<init>(r5, r6, r7, r8, r9)
                    goto L6c
                L5f:
                    boolean r2 = r12 instanceof Vw0.c.a.C1216c
                    if (r2 == 0) goto L66
                    com.avito.android.soa_stat.profile_settings.view.a$c$c r2 = com.avito.android.soa_stat.profile_settings.view.a.c.C8493c.f284236b
                    goto L6c
                L66:
                    boolean r12 = r12 instanceof Vw0.c.a.d
                    if (r12 == 0) goto L81
                    com.avito.android.soa_stat.profile_settings.view.a$c$c r2 = com.avito.android.soa_stat.profile_settings.view.a.c.C8493c.f284236b
                L6c:
                    com.avito.android.analytics.screens.mvi.r r11 = r11.getPerfTrackerParams()
                    r2.setPerfTrackerParams(r11)
                    r0.f284112r = r3
                    kotlinx.coroutines.flow.j r11 = r10.f284110b
                    java.lang.Object r11 = r11.emit(r2, r0)
                    if (r11 != r1) goto L7e
                    return r1
                L7e:
                    kotlin.G0 r11 = kotlin.G0.f406611a
                    return r11
                L81:
                    kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                    r11.<init>()
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.soa_stat.profile_settings.h.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(n2 n2Var) {
            this.f284109b = n2Var;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super a.c> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f284109b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SoaStatProfileSettingsActivity soaStatProfileSettingsActivity, com.avito.android.soa_stat.profile_settings.view.a aVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f284106r = soaStatProfileSettingsActivity;
        this.f284107s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f284106r, this.f284107s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f284105q;
        if (i12 == 0) {
            C42729a0.b(obj);
            SoaStatProfileSettingsActivity soaStatProfileSettingsActivity = this.f284106r;
            InterfaceC43160i interfaceC43160iR = C43175k.r(new b(((l) soaStatProfileSettingsActivity.f284064r.getValue()).getState()));
            R0 r02 = soaStatProfileSettingsActivity.f284063q;
            if (r02 == null) {
                r02 = null;
            }
            InterfaceC43160i interfaceC43160iI = C43175k.I(r02.c(), interfaceC43160iR);
            a aVar = new a(this.f284107s);
            this.f284105q = 1;
            if (interfaceC43160iI.collect(aVar, this) == coroutine_suspended) {
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
