package com.avito.android.crm_paid_cvs.view.list_items.range_filter;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.I5;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;

/* compiled from: RangeFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/range_filter/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_paid_cvs/view/list_items/range_filter/i;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final T f130948b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f130949c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Input f130950d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Input f130951e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f130952f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f130953g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public Q<Integer, Integer> f130954h;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f130955b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f130956c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$a$a, reason: collision with other inner class name */
        public static final class C3892a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f130957b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f130958c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.crm_paid_cvs.view.list_items.range_filter.RangeFilterViewImpl$setRangeChanged$$inlined$filter$1$2", f = "RangeFilterView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$a$a$a, reason: collision with other inner class name */
            public static final class C3893a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f130959q;

                /* renamed from: r, reason: collision with root package name */
                public int f130960r;

                public C3893a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f130959q = obj;
                    this.f130960r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C3892a.this.emit(null, this);
                }
            }

            public C3892a(InterfaceC43172j interfaceC43172j, j jVar) {
                this.f130957b = interfaceC43172j;
                this.f130958c = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.crm_paid_cvs.view.list_items.range_filter.j.a.C3892a.C3893a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$a$a$a r0 = (com.avito.android.crm_paid_cvs.view.list_items.range_filter.j.a.C3892a.C3893a) r0
                    int r1 = r0.f130960r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f130960r = r1
                    goto L18
                L13:
                    com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$a$a$a r0 = new com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f130959q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f130960r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    java.lang.Integer r6 = (java.lang.Integer) r6
                    com.avito.android.crm_paid_cvs.view.list_items.range_filter.j r2 = r4.f130958c
                    kotlin.Q<java.lang.Integer, java.lang.Integer> r2 = r2.f130954h
                    A r2 = r2.f406619b
                    boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                    if (r6 != 0) goto L4e
                    r0.f130960r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f130957b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.view.list_items.range_filter.j.a.C3892a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(c cVar, j jVar) {
            this.f130955b = cVar;
            this.f130956c = jVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Integer> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f130955b.collect(new C3892a(interfaceC43172j, this.f130956c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f130962b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f130963c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f130964b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f130965c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.crm_paid_cvs.view.list_items.range_filter.RangeFilterViewImpl$setRangeChanged$$inlined$filter$2$2", f = "RangeFilterView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$b$a$a, reason: collision with other inner class name */
            public static final class C3894a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f130966q;

                /* renamed from: r, reason: collision with root package name */
                public int f130967r;

                public C3894a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f130966q = obj;
                    this.f130967r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, j jVar) {
                this.f130964b = interfaceC43172j;
                this.f130965c = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.crm_paid_cvs.view.list_items.range_filter.j.b.a.C3894a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$b$a$a r0 = (com.avito.android.crm_paid_cvs.view.list_items.range_filter.j.b.a.C3894a) r0
                    int r1 = r0.f130967r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f130967r = r1
                    goto L18
                L13:
                    com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$b$a$a r0 = new com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f130966q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f130967r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    java.lang.Integer r6 = (java.lang.Integer) r6
                    com.avito.android.crm_paid_cvs.view.list_items.range_filter.j r2 = r4.f130965c
                    kotlin.Q<java.lang.Integer, java.lang.Integer> r2 = r2.f130954h
                    B r2 = r2.f406620c
                    boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                    if (r6 != 0) goto L4e
                    r0.f130967r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f130964b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.view.list_items.range_filter.j.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(d dVar, j jVar) {
            this.f130962b = dVar;
            this.f130963c = jVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Integer> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f130962b.collect(new a(interfaceC43172j, this.f130963c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f130969b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f130970c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f130971b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f130972c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.crm_paid_cvs.view.list_items.range_filter.RangeFilterViewImpl$setRangeChanged$$inlined$map$1$2", f = "RangeFilterView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$c$a$a, reason: collision with other inner class name */
            public static final class C3895a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f130973q;

                /* renamed from: r, reason: collision with root package name */
                public int f130974r;

                public C3895a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f130973q = obj;
                    this.f130974r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, j jVar) {
                this.f130971b = interfaceC43172j;
                this.f130972c = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.crm_paid_cvs.view.list_items.range_filter.j.c.a.C3895a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$c$a$a r0 = (com.avito.android.crm_paid_cvs.view.list_items.range_filter.j.c.a.C3895a) r0
                    int r1 = r0.f130974r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f130974r = r1
                    goto L18
                L13:
                    com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$c$a$a r0 = new com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f130973q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f130974r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L59
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                    com.avito.android.crm_paid_cvs.view.list_items.range_filter.j r6 = r4.f130972c
                    java.lang.String r6 = r6.f130952f
                    java.lang.String r5 = r5.toString()
                    java.lang.String r5 = kotlin.text.C43066x.U(r6, r5)
                    java.lang.CharSequence r5 = kotlin.text.C43066x.A0(r5)
                    java.lang.String r5 = r5.toString()
                    java.lang.Integer r5 = kotlin.text.C43066x.y0(r5)
                    r0.f130974r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f130971b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L59
                    return r1
                L59:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.view.list_items.range_filter.j.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i, j jVar) {
            this.f130969b = interfaceC43160i;
            this.f130970c = jVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Integer> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f130969b).collect(new a(interfaceC43172j, this.f130970c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f130976b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f130977c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f130978b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f130979c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.crm_paid_cvs.view.list_items.range_filter.RangeFilterViewImpl$setRangeChanged$$inlined$map$2$2", f = "RangeFilterView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$d$a$a, reason: collision with other inner class name */
            public static final class C3896a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f130980q;

                /* renamed from: r, reason: collision with root package name */
                public int f130981r;

                public C3896a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f130980q = obj;
                    this.f130981r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, j jVar) {
                this.f130978b = interfaceC43172j;
                this.f130979c = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.crm_paid_cvs.view.list_items.range_filter.j.d.a.C3896a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$d$a$a r0 = (com.avito.android.crm_paid_cvs.view.list_items.range_filter.j.d.a.C3896a) r0
                    int r1 = r0.f130981r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f130981r = r1
                    goto L18
                L13:
                    com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$d$a$a r0 = new com.avito.android.crm_paid_cvs.view.list_items.range_filter.j$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f130980q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f130981r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L59
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                    com.avito.android.crm_paid_cvs.view.list_items.range_filter.j r6 = r4.f130979c
                    java.lang.String r6 = r6.f130953g
                    java.lang.String r5 = r5.toString()
                    java.lang.String r5 = kotlin.text.C43066x.U(r6, r5)
                    java.lang.CharSequence r5 = kotlin.text.C43066x.A0(r5)
                    java.lang.String r5 = r5.toString()
                    java.lang.Integer r5 = kotlin.text.C43066x.y0(r5)
                    r0.f130981r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f130978b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L59
                    return r1
                L59:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.view.list_items.range_filter.j.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC43160i interfaceC43160i, j jVar) {
            this.f130976b = interfaceC43160i;
            this.f130977c = jVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Integer> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f130976b).collect(new a(interfaceC43172j, this.f130977c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: RangeFilterView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_paid_cvs.view.list_items.range_filter.RangeFilterViewImpl$setRangeChanged$3", f = "RangeFilterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<Integer, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f130983q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Q<Integer, Integer>, G0> f130985s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.l<? super Q<Integer, Integer>, G0> lVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f130985s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            e eVar = j.this.new e(this.f130985s, continuation);
            eVar.f130983q = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(Integer num, Continuation<? super G0> continuation) {
            return ((e) create(num, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Integer num = (Integer) this.f130983q;
            j jVar = j.this;
            j.B80(jVar, num, null, 2);
            ((com.avito.android.crm_paid_cvs.view.list_items.range_filter.f) this.f130985s).invoke(jVar.f130954h);
            return G0.f406611a;
        }
    }

    /* compiled from: RangeFilterView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_paid_cvs.view.list_items.range_filter.RangeFilterViewImpl$setRangeChanged$6", f = "RangeFilterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<Integer, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f130986q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Q<Integer, Integer>, G0> f130988s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Y41.l<? super Q<Integer, Integer>, G0> lVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f130988s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            f fVar = j.this.new f(this.f130988s, continuation);
            fVar.f130986q = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(Integer num, Continuation<? super G0> continuation) {
            return ((f) create(num, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Integer num = (Integer) this.f130986q;
            j jVar = j.this;
            j.B80(jVar, null, num, 1);
            ((com.avito.android.crm_paid_cvs.view.list_items.range_filter.f) this.f130988s).invoke(jVar.f130954h);
            return G0.f406611a;
        }
    }

    public j(@k View view, @k T t12) {
        super(view);
        this.f130948b = t12;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130949c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.input_from);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f130950d = (Input) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.input_to);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f130951e = (Input) viewFindViewById3;
        this.f130952f = view.getContext().getString(R.string.paid_cvs_from);
        this.f130953g = view.getContext().getString(R.string.paid_cvs_to);
        this.f130954h = new Q<>(null, null);
    }

    public static void B80(j jVar, Integer num, Integer num2, int i12) {
        if ((i12 & 1) != 0) {
            num = jVar.f130954h.f406619b;
        }
        if ((i12 & 2) != 0) {
            num2 = jVar.f130954h.f406620c;
        }
        jVar.getClass();
        jVar.f130954h = new Q<>(num, num2);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.range_filter.i
    public final void I9(@k Q<Integer, Integer> q12) {
        String string;
        String string2;
        this.f130954h = q12;
        Integer num = q12.f406619b;
        String str = "";
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        Input.t(this.f130950d, string, false, 6);
        Integer num2 = q12.f406620c;
        if (num2 != null && (string2 = num2.toString()) != null) {
            str = string2;
        }
        Input.t(this.f130951e, str, false, 6);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.range_filter.i
    public final void Z6(@k Y41.l<? super Q<Integer, Integer>, G0> lVar) {
        C43197r1 c43197r1 = new C43197r1(new e(lVar, null), new a(new c(y.a(n.e(this.f130950d)), this), this));
        T t12 = this.f130948b;
        C43175k.K(c43197r1, t12);
        C43175k.K(new C43197r1(new f(lVar, null), new b(new d(y.a(n.e(this.f130951e)), this), this)), t12);
    }

    @Override // com.avito.android.crm_paid_cvs.view.list_items.range_filter.i
    public final void setTitle(@k String str) {
        I5.a(this.f130949c, str, false);
    }
}
