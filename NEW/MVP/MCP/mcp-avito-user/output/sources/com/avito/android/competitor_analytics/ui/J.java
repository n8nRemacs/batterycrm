package com.avito.android.competitor_analytics.ui;

import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.avito.android.competitor_analytics.mvi.entity.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: CompetitorAnalyticsFullChart.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class J implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f124635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.g.C3713b f124636c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f124637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22192v1 f124638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Integer> f124639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Float> f124640g;

    /* compiled from: CompetitorAnalyticsFullChart.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.competitor_analytics.ui.CompetitorAnalyticsFullChartKt$CompetitorAnalyticsFullChart$1$2$1$1$1", f = "CompetitorAnalyticsFullChart.kt", i = {0, 1, 1}, l = {97, 107}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "n"}, s = {"L$0", "L$0", "I$0"})
    public static final class a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f124641q;

        /* renamed from: r, reason: collision with root package name */
        public int f124642r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f124643s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f124644t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b.g.C3713b f124645u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f124646v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22192v1 f124647w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Integer> f124648x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Float> f124649y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<kotlin.G0> aVar, b.g.C3713b c3713b, InterfaceC22192v1 interfaceC22192v1, InterfaceC22192v1 interfaceC22192v12, InterfaceC22204y1<Integer> interfaceC22204y1, InterfaceC22204y1<Float> interfaceC22204y12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f124644t = aVar;
            this.f124645u = c3713b;
            this.f124646v = interfaceC22192v1;
            this.f124647w = interfaceC22192v12;
            this.f124648x = interfaceC22204y1;
            this.f124649y = interfaceC22204y12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f124644t, this.f124645u, this.f124646v, this.f124647w, this.f124648x, this.f124649y, continuation);
            aVar.f124643s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
        /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a0 -> B:21:0x00a3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.competitor_analytics.ui.J.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public J(Y41.a<kotlin.G0> aVar, b.g.C3713b c3713b, InterfaceC22192v1 interfaceC22192v1, InterfaceC22192v1 interfaceC22192v12, InterfaceC22204y1<Integer> interfaceC22204y1, InterfaceC22204y1<Float> interfaceC22204y12) {
        this.f124635b = aVar;
        this.f124636c = c3713b;
        this.f124637d = interfaceC22192v1;
        this.f124638e = interfaceC22192v12;
        this.f124639f = interfaceC22204y1;
        this.f124640g = interfaceC22204y12;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    @Y61.l
    public final Object invoke(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objN0 = k12.N0(new a(this.f124635b, this.f124636c, this.f124637d, this.f124638e, this.f124639f, this.f124640g, null), continuation);
        return objN0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN0 : kotlin.G0.f406611a;
    }
}
