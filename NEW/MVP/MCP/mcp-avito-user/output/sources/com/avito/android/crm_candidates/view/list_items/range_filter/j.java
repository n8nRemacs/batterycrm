package com.avito.android.crm_candidates.view.list_items.range_filter;

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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/range_filter/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_candidates/view/list_items/range_filter/i;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final T f130196b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f130197c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Input f130198d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Input f130199e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f130200f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f130201g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public Q<Long, Long> f130202h;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<Long> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f130203b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f130204c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.crm_candidates.view.list_items.range_filter.j$a$a, reason: collision with other inner class name */
        public static final class C3866a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f130205b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f130206c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.crm_candidates.view.list_items.range_filter.RangeFilterViewImpl$setRangeChanged$$inlined$filter$1$2", f = "RangeFilterView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.crm_candidates.view.list_items.range_filter.j$a$a$a, reason: collision with other inner class name */
            public static final class C3867a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f130207q;

                /* renamed from: r, reason: collision with root package name */
                public int f130208r;

                public C3867a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f130207q = obj;
                    this.f130208r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C3866a.this.emit(null, this);
                }
            }

            public C3866a(InterfaceC43172j interfaceC43172j, j jVar) {
                this.f130205b = interfaceC43172j;
                this.f130206c = jVar;
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
                    boolean r0 = r6 instanceof com.avito.android.crm_candidates.view.list_items.range_filter.j.a.C3866a.C3867a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.crm_candidates.view.list_items.range_filter.j$a$a$a r0 = (com.avito.android.crm_candidates.view.list_items.range_filter.j.a.C3866a.C3867a) r0
                    int r1 = r0.f130208r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f130208r = r1
                    goto L18
                L13:
                    com.avito.android.crm_candidates.view.list_items.range_filter.j$a$a$a r0 = new com.avito.android.crm_candidates.view.list_items.range_filter.j$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f130207q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f130208r
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
                    java.lang.Long r6 = (java.lang.Long) r6
                    com.avito.android.crm_candidates.view.list_items.range_filter.j r2 = r4.f130206c
                    kotlin.Q<java.lang.Long, java.lang.Long> r2 = r2.f130202h
                    A r2 = r2.f406619b
                    boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                    if (r6 != 0) goto L4e
                    r0.f130208r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f130205b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.view.list_items.range_filter.j.a.C3866a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(c cVar, j jVar) {
            this.f130203b = cVar;
            this.f130204c = jVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Long> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f130203b.collect(new C3866a(interfaceC43172j, this.f130204c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<Long> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f130210b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f130211c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f130212b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f130213c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.crm_candidates.view.list_items.range_filter.RangeFilterViewImpl$setRangeChanged$$inlined$filter$2$2", f = "RangeFilterView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.crm_candidates.view.list_items.range_filter.j$b$a$a, reason: collision with other inner class name */
            public static final class C3868a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f130214q;

                /* renamed from: r, reason: collision with root package name */
                public int f130215r;

                public C3868a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f130214q = obj;
                    this.f130215r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, j jVar) {
                this.f130212b = interfaceC43172j;
                this.f130213c = jVar;
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
                    boolean r0 = r6 instanceof com.avito.android.crm_candidates.view.list_items.range_filter.j.b.a.C3868a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.crm_candidates.view.list_items.range_filter.j$b$a$a r0 = (com.avito.android.crm_candidates.view.list_items.range_filter.j.b.a.C3868a) r0
                    int r1 = r0.f130215r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f130215r = r1
                    goto L18
                L13:
                    com.avito.android.crm_candidates.view.list_items.range_filter.j$b$a$a r0 = new com.avito.android.crm_candidates.view.list_items.range_filter.j$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f130214q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f130215r
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
                    java.lang.Long r6 = (java.lang.Long) r6
                    com.avito.android.crm_candidates.view.list_items.range_filter.j r2 = r4.f130213c
                    kotlin.Q<java.lang.Long, java.lang.Long> r2 = r2.f130202h
                    B r2 = r2.f406620c
                    boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                    if (r6 != 0) goto L4e
                    r0.f130215r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f130212b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.view.list_items.range_filter.j.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(d dVar, j jVar) {
            this.f130210b = dVar;
            this.f130211c = jVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Long> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f130210b.collect(new a(interfaceC43172j, this.f130211c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<Long> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f130217b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f130218c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f130219b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f130220c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.crm_candidates.view.list_items.range_filter.RangeFilterViewImpl$setRangeChanged$$inlined$map$1$2", f = "RangeFilterView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.crm_candidates.view.list_items.range_filter.j$c$a$a, reason: collision with other inner class name */
            public static final class C3869a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f130221q;

                /* renamed from: r, reason: collision with root package name */
                public int f130222r;

                public C3869a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f130221q = obj;
                    this.f130222r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, j jVar) {
                this.f130219b = interfaceC43172j;
                this.f130220c = jVar;
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
                    boolean r0 = r6 instanceof com.avito.android.crm_candidates.view.list_items.range_filter.j.c.a.C3869a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.crm_candidates.view.list_items.range_filter.j$c$a$a r0 = (com.avito.android.crm_candidates.view.list_items.range_filter.j.c.a.C3869a) r0
                    int r1 = r0.f130222r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f130222r = r1
                    goto L18
                L13:
                    com.avito.android.crm_candidates.view.list_items.range_filter.j$c$a$a r0 = new com.avito.android.crm_candidates.view.list_items.range_filter.j$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f130221q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f130222r
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
                    com.avito.android.crm_candidates.view.list_items.range_filter.j r6 = r4.f130220c
                    java.lang.String r6 = r6.f130200f
                    java.lang.String r5 = r5.toString()
                    java.lang.String r5 = kotlin.text.C43066x.U(r6, r5)
                    java.lang.CharSequence r5 = kotlin.text.C43066x.A0(r5)
                    java.lang.String r5 = r5.toString()
                    java.lang.Long r5 = kotlin.text.C43066x.z0(r5)
                    r0.f130222r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f130219b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L59
                    return r1
                L59:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.view.list_items.range_filter.j.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i, j jVar) {
            this.f130217b = interfaceC43160i;
            this.f130218c = jVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Long> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f130217b).collect(new a(interfaceC43172j, this.f130218c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<Long> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f130224b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f130225c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f130226b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f130227c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.crm_candidates.view.list_items.range_filter.RangeFilterViewImpl$setRangeChanged$$inlined$map$2$2", f = "RangeFilterView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.crm_candidates.view.list_items.range_filter.j$d$a$a, reason: collision with other inner class name */
            public static final class C3870a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f130228q;

                /* renamed from: r, reason: collision with root package name */
                public int f130229r;

                public C3870a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f130228q = obj;
                    this.f130229r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, j jVar) {
                this.f130226b = interfaceC43172j;
                this.f130227c = jVar;
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
                    boolean r0 = r6 instanceof com.avito.android.crm_candidates.view.list_items.range_filter.j.d.a.C3870a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.crm_candidates.view.list_items.range_filter.j$d$a$a r0 = (com.avito.android.crm_candidates.view.list_items.range_filter.j.d.a.C3870a) r0
                    int r1 = r0.f130229r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f130229r = r1
                    goto L18
                L13:
                    com.avito.android.crm_candidates.view.list_items.range_filter.j$d$a$a r0 = new com.avito.android.crm_candidates.view.list_items.range_filter.j$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f130228q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f130229r
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
                    com.avito.android.crm_candidates.view.list_items.range_filter.j r6 = r4.f130227c
                    java.lang.String r6 = r6.f130201g
                    java.lang.String r5 = r5.toString()
                    java.lang.String r5 = kotlin.text.C43066x.U(r6, r5)
                    java.lang.CharSequence r5 = kotlin.text.C43066x.A0(r5)
                    java.lang.String r5 = r5.toString()
                    java.lang.Long r5 = kotlin.text.C43066x.z0(r5)
                    r0.f130229r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f130226b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L59
                    return r1
                L59:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.view.list_items.range_filter.j.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC43160i interfaceC43160i, j jVar) {
            this.f130224b = interfaceC43160i;
            this.f130225c = jVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Long> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f130224b).collect(new a(interfaceC43172j, this.f130225c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: RangeFilterView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lkotlin/G0;", "<anonymous>", "(J)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_candidates.view.list_items.range_filter.RangeFilterViewImpl$setRangeChanged$3", f = "RangeFilterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<Long, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f130231q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Q<Long, Long>, G0> f130233s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Y41.l<? super Q<Long, Long>, G0> lVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f130233s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            e eVar = j.this.new e(this.f130233s, continuation);
            eVar.f130231q = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(Long l12, Continuation<? super G0> continuation) {
            return ((e) create(l12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Long l12 = (Long) this.f130231q;
            j jVar = j.this;
            j.B80(jVar, l12, null, 2);
            ((com.avito.android.crm_candidates.view.list_items.range_filter.f) this.f130233s).invoke(jVar.f130202h);
            return G0.f406611a;
        }
    }

    /* compiled from: RangeFilterView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "Lkotlin/G0;", "<anonymous>", "(J)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_candidates.view.list_items.range_filter.RangeFilterViewImpl$setRangeChanged$6", f = "RangeFilterView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<Long, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f130234q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Q<Long, Long>, G0> f130236s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Y41.l<? super Q<Long, Long>, G0> lVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f130236s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            f fVar = j.this.new f(this.f130236s, continuation);
            fVar.f130234q = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(Long l12, Continuation<? super G0> continuation) {
            return ((f) create(l12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Long l12 = (Long) this.f130234q;
            j jVar = j.this;
            j.B80(jVar, null, l12, 1);
            ((com.avito.android.crm_candidates.view.list_items.range_filter.f) this.f130236s).invoke(jVar.f130202h);
            return G0.f406611a;
        }
    }

    public j(@k View view, @k T t12) {
        super(view);
        this.f130196b = t12;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130197c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.input_from);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f130198d = (Input) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.input_to);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        this.f130199e = (Input) viewFindViewById3;
        this.f130200f = view.getContext().getString(R.string.crm_from);
        this.f130201g = view.getContext().getString(R.string.crm_to);
        this.f130202h = new Q<>(null, null);
    }

    public static void B80(j jVar, Long l12, Long l13, int i12) {
        if ((i12 & 1) != 0) {
            l12 = jVar.f130202h.f406619b;
        }
        if ((i12 & 2) != 0) {
            l13 = jVar.f130202h.f406620c;
        }
        jVar.getClass();
        jVar.f130202h = new Q<>(l12, l13);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.range_filter.i
    public final void I9(@k Q<Long, Long> q12) {
        String string;
        String string2;
        this.f130202h = q12;
        Long l12 = q12.f406619b;
        String str = "";
        if (l12 == null || (string = l12.toString()) == null) {
            string = "";
        }
        Input.t(this.f130198d, string, false, 6);
        Long l13 = q12.f406620c;
        if (l13 != null && (string2 = l13.toString()) != null) {
            str = string2;
        }
        Input.t(this.f130199e, str, false, 6);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.range_filter.i
    public final void Z6(@k Y41.l<? super Q<Long, Long>, G0> lVar) {
        C43197r1 c43197r1 = new C43197r1(new e(lVar, null), new a(new c(y.a(n.e(this.f130198d)), this), this));
        T t12 = this.f130196b;
        C43175k.K(c43197r1, t12);
        C43175k.K(new C43197r1(new f(lVar, null), new b(new d(y.a(n.e(this.f130199e)), this), this)), t12);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.range_filter.i
    public final void setTitle(@k String str) {
        I5.a(this.f130197c, str, false);
    }
}
