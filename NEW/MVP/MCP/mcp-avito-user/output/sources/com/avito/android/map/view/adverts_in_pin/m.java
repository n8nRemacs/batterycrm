package com.avito.android.map.view.adverts_in_pin;

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
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements InterfaceC43160i<G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f185436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f185437c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f185438b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f185439c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.map.view.adverts_in_pin.AdvertsInPinViewImpl$special$$inlined$map$4$2", f = "AdvertsInPinView.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.map.view.adverts_in_pin.m$a$a, reason: collision with other inner class name */
        public static final class C5444a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f185440q;

            /* renamed from: r, reason: collision with root package name */
            public int f185441r;

            public C5444a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f185440q = obj;
                this.f185441r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, f fVar) {
            this.f185438b = interfaceC43172j;
            this.f185439c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, @Y61.k kotlin.coroutines.Continuation r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.avito.android.map.view.adverts_in_pin.m.a.C5444a
                if (r0 == 0) goto L13
                r0 = r11
                com.avito.android.map.view.adverts_in_pin.m$a$a r0 = (com.avito.android.map.view.adverts_in_pin.m.a.C5444a) r0
                int r1 = r0.f185441r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f185441r = r1
                goto L18
            L13:
                com.avito.android.map.view.adverts_in_pin.m$a$a r0 = new com.avito.android.map.view.adverts_in_pin.m$a$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.f185440q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f185441r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r11)
                goto Lc9
            L2a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L32:
                kotlin.C42729a0.b(r11)
                java.lang.String r10 = (java.lang.String) r10
                int r11 = r10.hashCode()
                r2 = -1939100487(0xffffffff8c6bacb9, float:-1.8155718E-31)
                r4 = 0
                com.avito.android.map.view.adverts_in_pin.f r5 = r9.f185439c
                if (r11 == r2) goto La5
                r2 = -1217487446(0xffffffffb76e9daa, float:-1.42226145E-5)
                if (r11 == r2) goto L70
                r2 = 1880183383(0x70115257, float:1.7989948E29)
                if (r11 == r2) goto L4f
                goto Lbc
            L4f:
                java.lang.String r11 = "collapsed"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L59
                goto Lbc
            L59:
                android.view.View r10 = r5.f185400q
                if (r10 != 0) goto L5e
                r10 = r4
            L5e:
                com.avito.android.util.D6.w(r10)
                Y41.l<? super bY.b, kotlin.G0> r10 = r5.f185394k
                if (r10 != 0) goto L66
                goto L67
            L66:
                r4 = r10
            L67:
                bY.b$v r10 = new bY.b$v
                r10.<init>(r11)
                r4.invoke(r10)
                goto Lbc
            L70:
                java.lang.String r11 = "hidden"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L79
                goto Lbc
            L79:
                Y41.l<? super bY.b, kotlin.G0> r10 = r5.f185394k
                if (r10 != 0) goto L7e
                r10 = r4
            L7e:
                bY.b$j r2 = new bY.b$j
                com.avito.android.floating_views.FloatingViewsPresenter$Subscriber$b$b r6 = new com.avito.android.floating_views.FloatingViewsPresenter$Subscriber$b$b
                com.avito.android.floating_views.FloatingViewsPresenter$Subscriber$DisplayMode r7 = com.avito.android.floating_views.FloatingViewsPresenter.Subscriber.DisplayMode.f158442c
                r8 = 0
                r6.<init>(r7, r8, r3)
                r2.<init>(r6, r3)
                r10.invoke(r2)
                android.view.View r10 = r5.f185400q
                if (r10 != 0) goto L93
                r10 = r4
            L93:
                com.avito.android.util.D6.w(r10)
                Y41.l<? super bY.b, kotlin.G0> r10 = r5.f185394k
                if (r10 != 0) goto L9b
                goto L9c
            L9b:
                r4 = r10
            L9c:
                bY.b$v r10 = new bY.b$v
                r10.<init>(r11)
                r4.invoke(r10)
                goto Lbc
            La5:
                java.lang.String r11 = "expanded"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto Lae
                goto Lbc
            Lae:
                Y41.l<? super bY.b, kotlin.G0> r10 = r5.f185394k
                if (r10 != 0) goto Lb3
                goto Lb4
            Lb3:
                r4 = r10
            Lb4:
                bY.b$v r10 = new bY.b$v
                r10.<init>(r11)
                r4.invoke(r10)
            Lbc:
                kotlin.G0 r10 = kotlin.G0.f406611a
                r0.f185441r = r3
                kotlinx.coroutines.flow.j r11 = r9.f185438b
                java.lang.Object r10 = r11.emit(r10, r0)
                if (r10 != r1) goto Lc9
                return r1
            Lc9:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map.view.adverts_in_pin.m.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public m(InterfaceC43160i interfaceC43160i, f fVar) {
        this.f185436b = interfaceC43160i;
        this.f185437c = fVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super G0> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f185436b).collect(new a(interfaceC43172j, this.f185437c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
