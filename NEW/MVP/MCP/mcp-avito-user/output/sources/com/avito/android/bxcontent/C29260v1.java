package com.avito.android.bxcontent;

import com.avito.android.advertising.adapter.items.buzzoola.video.CommercialVideoStates;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.v1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29260v1 implements InterfaceC43160i<InterfaceC29127b.B0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f113045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C29240o1 f113046c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.video_snippets.g f113047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CommercialVideoStates f113048e;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.v1$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f113049b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C29240o1 f113050c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.video_snippets.g f113051d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ CommercialVideoStates f113052e;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.bxcontent.BxContentViewImpl$special$$inlined$map$1$2", f = "BxContentView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.bxcontent.v1$a$a, reason: collision with other inner class name */
        public static final class C3317a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f113053q;

            /* renamed from: r, reason: collision with root package name */
            public int f113054r;

            public C3317a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f113053q = obj;
                this.f113054r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C29240o1 c29240o1, com.avito.android.video_snippets.g gVar, CommercialVideoStates commercialVideoStates) {
            this.f113049b = interfaceC43172j;
            this.f113050c = c29240o1;
            this.f113051d = gVar;
            this.f113052e = commercialVideoStates;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r14, @Y61.k kotlin.coroutines.Continuation r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof com.avito.android.bxcontent.C29260v1.a.C3317a
                if (r0 == 0) goto L13
                r0 = r15
                com.avito.android.bxcontent.v1$a$a r0 = (com.avito.android.bxcontent.C29260v1.a.C3317a) r0
                int r1 = r0.f113054r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f113054r = r1
                goto L18
            L13:
                com.avito.android.bxcontent.v1$a$a r0 = new com.avito.android.bxcontent.v1$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f113053q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f113054r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r15)
                goto Lb7
            L2a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L32:
                kotlin.C42729a0.b(r15)
                kotlin.G0 r14 = (kotlin.G0) r14
                com.avito.android.bxcontent.mvi.entity.b$B0 r14 = new com.avito.android.bxcontent.mvi.entity.b$B0
                com.avito.android.bxcontent.o1 r15 = r13.f113050c
                com.avito.android.scroll_tracker.h r2 = r15.f112729i0
                r2.getClass()
                com.avito.android.scroll_tracker.h$a r4 = new com.avito.android.scroll_tracker.h$a
                com.avito.android.map_core.utils.IgnoreTopPaddingTouchScrollDirectionAwareRecyclerView r15 = r15.f112681O
                int r5 = r15.getChildCount()
                r6 = 0
                r7 = r6
            L4a:
                r8 = -1
                com.avito.android.serp.adapter.skeleton.ScrollUnpredictiveGridLayoutManager r9 = r2.f261719b
                if (r7 >= r5) goto L66
                android.view.View r10 = r15.getChildAt(r7)
                if (r10 == 0) goto L63
                boolean r11 = r2.l(r10, r15)
                if (r11 == 0) goto L63
                r9.getClass()
                int r5 = androidx.recyclerview.widget.RecyclerView.m.t0(r10)
                goto L67
            L63:
                int r7 = r7 + 1
                goto L4a
            L66:
                r5 = r8
            L67:
                int r7 = r15.getChildCount()
                kotlin.ranges.l r6 = kotlin.ranges.s.r(r6, r7)
                kotlin.ranges.j r6 = kotlin.ranges.s.o(r6)
                int r7 = r6.f406905b
                int r10 = r6.f406906c
                int r6 = r6.f406907d
                if (r6 <= 0) goto L7d
                if (r7 <= r10) goto L81
            L7d:
                if (r6 >= 0) goto L99
                if (r10 > r7) goto L99
            L81:
                android.view.View r11 = r15.getChildAt(r7)
                if (r11 == 0) goto L95
                boolean r12 = r2.l(r11, r15)
                if (r12 == 0) goto L95
                r9.getClass()
                int r8 = androidx.recyclerview.widget.RecyclerView.m.t0(r11)
                goto L99
            L95:
                if (r7 == r10) goto L99
                int r7 = r7 + r6
                goto L81
            L99:
                r4.<init>(r5, r8)
                com.avito.android.video_snippets.g r15 = r13.f113051d
                java.util.LinkedHashMap r15 = r15.getF326071c()
                boolean r15 = r15.isEmpty()
                r15 = r15 ^ r3
                com.avito.android.advertising.adapter.items.buzzoola.video.CommercialVideoStates r2 = r13.f113052e
                r14.<init>(r4, r15, r2)
                r0.f113054r = r3
                kotlinx.coroutines.flow.j r15 = r13.f113049b
                java.lang.Object r14 = r15.emit(r14, r0)
                if (r14 != r1) goto Lb7
                return r1
            Lb7:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.C29260v1.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C29260v1(InterfaceC43160i interfaceC43160i, C29240o1 c29240o1, com.avito.android.video_snippets.g gVar, CommercialVideoStates commercialVideoStates) {
        this.f113045b = interfaceC43160i;
        this.f113046c = c29240o1;
        this.f113047d = gVar;
        this.f113048e = commercialVideoStates;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC29127b.B0> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f113045b).collect(new a(interfaceC43172j, this.f113046c, this.f113047d, this.f113048e), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
