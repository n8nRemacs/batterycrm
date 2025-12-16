package com.avito.android.profile.pro.impl.screen;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: ProfileTabSummaryParamsProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/H;", "Lcom/avito/android/profile_tab/summary/domain/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class H implements com.avito.android.profile_tab.summary.domain.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final D f222853a;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<com.avito.android.profile_tab.summary.e> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n2 f222854b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ H f222855c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile.pro.impl.screen.H$a$a, reason: collision with other inner class name */
        public static final class C6738a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f222856b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ H f222857c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileTabSummaryParamsProvider$paramsInfo$$inlined$map$1$2", f = "ProfileTabSummaryParamsProvider.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile.pro.impl.screen.H$a$a$a, reason: collision with other inner class name */
            public static final class C6739a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f222858q;

                /* renamed from: r, reason: collision with root package name */
                public int f222859r;

                public C6739a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f222858q = obj;
                    this.f222859r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C6738a.this.emit(null, this);
                }
            }

            public C6738a(InterfaceC43172j interfaceC43172j, H h12) {
                this.f222856b = interfaceC43172j;
                this.f222857c = h12;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference failed for: r2v4, types: [com.avito.android.profile_tab.summary.e$a] */
            /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.List] */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.profile.pro.impl.screen.H.a.C6738a.C6739a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.profile.pro.impl.screen.H$a$a$a r0 = (com.avito.android.profile.pro.impl.screen.H.a.C6738a.C6739a) r0
                    int r1 = r0.f222859r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f222859r = r1
                    goto L18
                L13:
                    com.avito.android.profile.pro.impl.screen.H$a$a$a r0 = new com.avito.android.profile.pro.impl.screen.H$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f222858q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f222859r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L70
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    D90.d r5 = (D90.d) r5
                    com.avito.android.profile.pro.impl.screen.H r6 = r4.f222857c
                    r6.getClass()
                    boolean r6 = r5.f3062b
                    if (r6 == 0) goto L42
                    com.avito.android.profile_tab.summary.e$b r5 = com.avito.android.profile_tab.summary.e.b.f230870a
                    goto L65
                L42:
                    java.lang.String r6 = r5.f3063c
                    if (r6 == 0) goto L49
                    com.avito.android.profile_tab.summary.e$b r5 = com.avito.android.profile_tab.summary.e.b.f230870a
                    goto L65
                L49:
                    com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams r5 = r5.f3071k
                    java.lang.String r6 = r5.f222674b
                    if (r6 == 0) goto L63
                    java.lang.Object r6 = r5.f222678f
                    r2 = r6
                    java.util.Collection r2 = (java.util.Collection) r2
                    boolean r2 = r2.isEmpty()
                    if (r2 != 0) goto L63
                    com.avito.android.profile_tab.summary.e$a r2 = new com.avito.android.profile_tab.summary.e$a
                    java.lang.String r5 = r5.f222674b
                    r2.<init>(r6, r5)
                    r5 = r2
                    goto L65
                L63:
                    com.avito.android.profile_tab.summary.e$b r5 = com.avito.android.profile_tab.summary.e.b.f230870a
                L65:
                    r0.f222859r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f222856b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L70
                    return r1
                L70:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.pro.impl.screen.H.a.C6738a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(n2 n2Var, H h12) {
            this.f222854b = n2Var;
            this.f222855c = h12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super com.avito.android.profile_tab.summary.e> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f222854b.collect(new C6738a(interfaceC43172j, this.f222855c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public H(@Y61.k D d12) {
        this.f222853a = d12;
    }

    @Override // com.avito.android.profile_tab.summary.domain.b
    @Y61.k
    public final InterfaceC43160i<com.avito.android.profile_tab.summary.e> a() {
        return C43175k.r(new a(this.f222853a.getState(), this));
    }
}
