package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header;

import Y41.q;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.cyclic_gallery_widget.image_carousel.i;
import com.avito.android.cyclic_gallery_widget.image_carousel.p;
import com.avito.android.di.C29972i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;

/* compiled from: DevelopmentTooltipHeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development_tooltip_header/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development_tooltip_header/h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f138366h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f138367b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f138368c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f138369d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public p f138370e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public C43238h f138371f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> f138372g;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<com.avito.android.cyclic_gallery_widget.image_carousel.i> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f138373b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$a$a, reason: collision with other inner class name */
        public static final class C4175a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f138374b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.DevelopmentTooltipHeaderItemViewImpl$setOnCarouselImageItemClickListener$$inlined$filter$1$2", f = "DevelopmentTooltipHeaderItemView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$a$a$a, reason: collision with other inner class name */
            public static final class C4176a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f138375q;

                /* renamed from: r, reason: collision with root package name */
                public int f138376r;

                public C4176a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f138375q = obj;
                    this.f138376r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C4175a.this.emit(null, this);
                }
            }

            public C4175a(InterfaceC43172j interfaceC43172j) {
                this.f138374b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i.a.C4175a.C4176a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$a$a$a r0 = (com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i.a.C4175a.C4176a) r0
                    int r1 = r0.f138376r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f138376r = r1
                    goto L18
                L13:
                    com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$a$a$a r0 = new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f138375q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f138376r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    com.avito.android.cyclic_gallery_widget.image_carousel.i r6 = (com.avito.android.cyclic_gallery_widget.image_carousel.i) r6
                    boolean r6 = r6 instanceof com.avito.android.cyclic_gallery_widget.image_carousel.i.e
                    if (r6 == 0) goto L46
                    r0.f138376r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f138374b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i.a.C4175a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC43160i interfaceC43160i) {
            this.f138373b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super com.avito.android.cyclic_gallery_widget.image_carousel.i> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f138373b).collect(new C4175a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<i.e> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f138378b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f138379b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.DevelopmentTooltipHeaderItemViewImpl$setOnCarouselImageItemClickListener$$inlined$map$1$2", f = "DevelopmentTooltipHeaderItemView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$b$a$a, reason: collision with other inner class name */
            public static final class C4177a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f138380q;

                /* renamed from: r, reason: collision with root package name */
                public int f138381r;

                public C4177a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f138380q = obj;
                    this.f138381r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f138379b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i.b.a.C4177a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$b$a$a r0 = (com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i.b.a.C4177a) r0
                    int r1 = r0.f138381r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f138381r = r1
                    goto L18
                L13:
                    com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$b$a$a r0 = new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f138380q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f138381r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.cyclic_gallery_widget.image_carousel.i r5 = (com.avito.android.cyclic_gallery_widget.image_carousel.i) r5
                    com.avito.android.cyclic_gallery_widget.image_carousel.i$e r5 = (com.avito.android.cyclic_gallery_widget.image_carousel.i.e) r5
                    r0.f138381r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f138379b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(a aVar) {
            this.f138378b = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super i.e> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f138378b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f138383b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f138384b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.DevelopmentTooltipHeaderItemViewImpl$setOnCarouselImageItemClickListener$$inlined$map$2$2", f = "DevelopmentTooltipHeaderItemView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$c$a$a, reason: collision with other inner class name */
            public static final class C4178a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f138385q;

                /* renamed from: r, reason: collision with root package name */
                public int f138386r;

                public C4178a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f138385q = obj;
                    this.f138386r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f138384b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i.c.a.C4178a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$c$a$a r0 = (com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i.c.a.C4178a) r0
                    int r1 = r0.f138386r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f138386r = r1
                    goto L18
                L13:
                    com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$c$a$a r0 = new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f138385q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f138386r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.cyclic_gallery_widget.image_carousel.i$e r5 = (com.avito.android.cyclic_gallery_widget.image_carousel.i.e) r5
                    int r5 = r5.f132022a
                    java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
                    r0.f138386r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f138384b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.i.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(b bVar) {
            this.f138383b = bVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super Integer> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f138383b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: DevelopmentTooltipHeaderItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(I)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.DevelopmentTooltipHeaderItemViewImpl$setOnCarouselImageItemClickListener$4", f = "DevelopmentTooltipHeaderItemView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<Integer, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f138388q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a<G0> aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f138388q = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new d(this.f138388q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(Integer num, Continuation<? super G0> continuation) {
            return ((d) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f138388q.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: DevelopmentTooltipHeaderItemView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "", "e", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.DevelopmentTooltipHeaderItemViewImpl$setOnCarouselImageItemClickListener$5", f = "DevelopmentTooltipHeaderItemView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements q<InterfaceC43172j<? super Integer>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f138389q;

        public e() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Integer> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            e eVar = new e(3, continuation);
            eVar.f138389q = th2;
            return eVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.a("DevelopmentSearchResultItem", "Click image error", this.f138389q);
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        this.f138367b = view.getContext();
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f138368c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f138369d = (TextView) viewFindViewById2;
        com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f138372g = cVar;
        com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di.a.a().a((com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di.b) C29972i.a(C29972i.b(view), com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.di.b.class), view, cVar).a(this);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.h
    public final void I10(@k PrintableText printableText) {
        I5.a(this.f138369d, printableText.Y4(this.f138367b), false);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.h
    public final void K5(@k List<Image> list) {
        p pVar = this.f138370e;
        if (pVar == null) {
            pVar = null;
        }
        List<Image> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.avito.android.image_loader.b.b((Image) it.next()));
        }
        int i12 = p.f132065v;
        pVar.g(arrayList, false);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.h
    public final void a(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(29, aVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.h
    public final void b(@k String str) {
        I5.a(this.f138368c, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.itemView.setOnClickListener(null);
        C43238h c43238h = this.f138371f;
        Q0.d((c43238h != null ? c43238h : null).f411905b);
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_header.h
    public final void kW(@k Y41.a<G0> aVar) {
        C43238h c43238h = this.f138371f;
        if (c43238h == null) {
            c43238h = null;
        }
        Q0.d(c43238h.f411905b);
        C43152f0 c43152f0 = new C43152f0(new C43197r1(new d(aVar, null), new c(new b(new a(y.a(this.f138372g))))), new e(3, null));
        C43238h c43238h2 = this.f138371f;
        C43175k.K(c43152f0, c43238h2 != null ? c43238h2 : null);
    }
}
