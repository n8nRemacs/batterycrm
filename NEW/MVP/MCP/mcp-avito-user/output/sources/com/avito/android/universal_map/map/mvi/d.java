package com.avito.android.universal_map.map.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
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
/* loaded from: classes4.dex */
public final class d implements InterfaceC43160i<UniversalMapInternalAction.MapViewInternalAction.FocusOnRegionChanged> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f305439b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f305440b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.universal_map.map.mvi.UniversalMapBootstrap$focusOnRegionActionHandler$$inlined$map$1$2", f = "UniversalMapBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.universal_map.map.mvi.d$a$a, reason: collision with other inner class name */
        public static final class C9377a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f305441q;

            /* renamed from: r, reason: collision with root package name */
            public int f305442r;

            public C9377a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f305441q = obj;
                this.f305442r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f305440b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.universal_map.map.mvi.d.a.C9377a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.universal_map.map.mvi.d$a$a r0 = (com.avito.android.universal_map.map.mvi.d.a.C9377a) r0
                int r1 = r0.f305442r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f305442r = r1
                goto L18
            L13:
                com.avito.android.universal_map.map.mvi.d$a$a r0 = new com.avito.android.universal_map.map.mvi.d$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f305441q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f305442r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L5b
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                com.avito.android.map_core.beduin.BeduinFocusOnRegionAction r6 = (com.avito.android.map_core.beduin.BeduinFocusOnRegionAction) r6
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$FocusOnRegionChanged r7 = new com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$FocusOnRegionChanged
                com.avito.android.avito_map.AvitoMapBounds r2 = new com.avito.android.avito_map.AvitoMapBounds
                com.avito.android.remote.model.Coordinates r4 = r6.getTopLeft()
                com.avito.android.avito_map.AvitoMapPoint r4 = com.avito.android.universal_map.map.util.b.b(r4)
                com.avito.android.remote.model.Coordinates r6 = r6.getBottomRight()
                com.avito.android.avito_map.AvitoMapPoint r6 = com.avito.android.universal_map.map.util.b.b(r6)
                r2.<init>(r4, r6)
                r7.<init>(r2)
                r0.f305442r = r3
                kotlinx.coroutines.flow.j r6 = r5.f305440b
                java.lang.Object r6 = r6.emit(r7, r0)
                if (r6 != r1) goto L5b
                return r1
            L5b:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map.mvi.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public d(InterfaceC43160i interfaceC43160i) {
        this.f305439b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super UniversalMapInternalAction.MapViewInternalAction.FocusOnRegionChanged> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f305439b).collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
