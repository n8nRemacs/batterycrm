package com.avito.android.universal_map.map.mvi.actor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
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
import rG0.AbstractC47541a;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements InterfaceC43160i<List<? extends AbstractC47541a>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43197r1 f305392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f305393c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.a f305394d;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f305395b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f305396c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.a f305397d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.actor.UniversalMapActor$process$$inlined$map$1$2", f = "UniversalMapActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.universal_map.map.mvi.actor.n$a$a, reason: collision with other inner class name */
        public static final class C9374a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f305398q;

            /* renamed from: r, reason: collision with root package name */
            public int f305399r;

            public C9374a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f305398q = obj;
                this.f305399r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, m mVar, Y41.a aVar) {
            this.f305395b = interfaceC43172j;
            this.f305396c = mVar;
            this.f305397d = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                r0 = 1
                boolean r1 = r8 instanceof com.avito.android.universal_map.map.mvi.actor.n.a.C9374a
                if (r1 == 0) goto L14
                r1 = r8
                com.avito.android.universal_map.map.mvi.actor.n$a$a r1 = (com.avito.android.universal_map.map.mvi.actor.n.a.C9374a) r1
                int r2 = r1.f305399r
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L14
                int r2 = r2 - r3
                r1.f305399r = r2
                goto L19
            L14:
                com.avito.android.universal_map.map.mvi.actor.n$a$a r1 = new com.avito.android.universal_map.map.mvi.actor.n$a$a
                r1.<init>(r8)
            L19:
                java.lang.Object r8 = r1.f305398q
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r1.f305399r
                if (r3 == 0) goto L32
                if (r3 != r0) goto L2a
                kotlin.C42729a0.b(r8)
                goto Lbc
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L32:
                kotlin.C42729a0.b(r8)
                rG0.a r7 = (rG0.AbstractC47541a) r7
                Y41.a r8 = r6.f305397d
                java.lang.Object r8 = r8.invoke()
                com.avito.android.universal_map.map.mvi.entity.e r8 = (com.avito.android.universal_map.map.mvi.entity.e) r8
                com.avito.android.universal_map.map.mvi.actor.m r3 = r6.f305396c
                r3.getClass()
                boolean r3 = r7 instanceof rG0.AbstractC47541a.b.f
                if (r3 == 0) goto L93
                com.avito.android.universal_map.map.mvi.entity.MapState r8 = r8.f305599f
                com.avito.android.universal_map.map.mvi.entity.MapState$a r8 = r8.f305453f
                java.util.Set<com.avito.android.universal_map.map.common.marker.Marker> r8 = r8.f305459b
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.Iterator r8 = r8.iterator()
            L54:
                boolean r3 = r8.hasNext()
                if (r3 == 0) goto L71
                java.lang.Object r3 = r8.next()
                r4 = r3
                com.avito.android.universal_map.map.common.marker.Marker r4 = (com.avito.android.universal_map.map.common.marker.Marker) r4
                r5 = r7
                rG0.a$b$f r5 = (rG0.AbstractC47541a.b.f) r5
                java.lang.String r5 = r5.f429681a
                java.lang.String r4 = r4.getF304921a()
                boolean r4 = kotlin.jvm.internal.L.f(r5, r4)
                if (r4 == 0) goto L54
                goto L72
            L71:
                r3 = 0
            L72:
                com.avito.android.universal_map.map.common.marker.Marker r3 = (com.avito.android.universal_map.map.common.marker.Marker) r3
                boolean r7 = r3 instanceof com.avito.android.universal_map.map.common.marker.Marker.a
                if (r7 == 0) goto L80
                rG0.a$b$b r7 = new rG0.a$b$b
                com.avito.android.universal_map.map.common.marker.Marker$a r3 = (com.avito.android.universal_map.map.common.marker.Marker.a) r3
                r7.<init>(r3)
                goto L8e
            L80:
                boolean r7 = r3 instanceof com.avito.android.universal_map.map.common.marker.Marker.Pin
                if (r7 == 0) goto L8c
                rG0.a$b$h r7 = new rG0.a$b$h
                com.avito.android.universal_map.map.common.marker.Marker$Pin r3 = (com.avito.android.universal_map.map.common.marker.Marker.Pin) r3
                r7.<init>(r3)
                goto L8e
            L8c:
                rG0.a$b$l r7 = rG0.AbstractC47541a.b.l.f429688a
            L8e:
                java.util.List r7 = java.util.Collections.singletonList(r7)
                goto Lb1
            L93:
                boolean r8 = r7 instanceof rG0.AbstractC47541a.f
                if (r8 == 0) goto Lad
                r7 = 3
                rG0.a[] r7 = new rG0.AbstractC47541a[r7]
                rG0.a$a$a r8 = rG0.AbstractC47541a.AbstractC12359a.C12360a.f429672a
                r3 = 0
                r7[r3] = r8
                rG0.a$b$i r8 = rG0.AbstractC47541a.b.i.f429685a
                r7[r0] = r8
                rG0.a$b$a r8 = rG0.AbstractC47541a.b.C12361a.f429676a
                r3 = 2
                r7[r3] = r8
                java.util.List r7 = kotlin.collections.C42745f0.U(r7)
                goto Lb1
            Lad:
                java.util.List r7 = java.util.Collections.singletonList(r7)
            Lb1:
                r1.f305399r = r0
                kotlinx.coroutines.flow.j r8 = r6.f305395b
                java.lang.Object r7 = r8.emit(r7, r1)
                if (r7 != r2) goto Lbc
                return r2
            Lbc:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.actor.n.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public n(C43197r1 c43197r1, m mVar, Y41.a aVar) {
        this.f305392b = c43197r1;
        this.f305393c = mVar;
        this.f305394d = aVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super List<? extends AbstractC47541a>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f305392b.collect(new a(interfaceC43172j, this.f305393c, this.f305394d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
