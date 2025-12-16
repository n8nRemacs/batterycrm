package com.avito.android.ab_tests;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import u3.C48777a;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ab_tests.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27650m implements InterfaceC43160i<Map<String, ? extends C48777a>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f67998b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.ab_tests.m$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f67999b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.ab_tests.AbTestsReloadTask$loadWithContracts$$inlined$map$1$2", f = "AbTestsReloadTask.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.ab_tests.m$a$a, reason: collision with other inner class name */
        public static final class C2129a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f68000q;

            /* renamed from: r, reason: collision with root package name */
            public int f68001r;

            public C2129a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f68000q = obj;
                this.f68001r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f67999b = interfaceC43172j;
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
                boolean r0 = r11 instanceof com.avito.android.ab_tests.C27650m.a.C2129a
                if (r0 == 0) goto L13
                r0 = r11
                com.avito.android.ab_tests.m$a$a r0 = (com.avito.android.ab_tests.C27650m.a.C2129a) r0
                int r1 = r0.f68001r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f68001r = r1
                goto L18
            L13:
                com.avito.android.ab_tests.m$a$a r0 = new com.avito.android.ab_tests.m$a$a
                r0.<init>(r11)
            L18:
                java.lang.Object r11 = r0.f68000q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f68001r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r11)
                goto Laa
            L2a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L32:
                kotlin.C42729a0.b(r11)
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r11 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r11 == 0) goto Lad
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                java.util.Map r10 = (java.util.Map) r10
                java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
                int r2 = r10.size()
                int r2 = kotlin.collections.P0.f(r2)
                r11.<init>(r2)
                java.util.Set r10 = r10.entrySet()
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.Iterator r10 = r10.iterator()
            L5a:
                boolean r2 = r10.hasNext()
                if (r2 == 0) goto L9f
                java.lang.Object r2 = r10.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r4 = r2.getKey()
                java.lang.Object r2 = r2.getValue()
                Vj0.a r2 = (Vj0.C15687a) r2
                u3.a r5 = new u3.a
                java.lang.String r6 = r2.getTestGroup()
                u3.e r7 = new u3.e
                Vj0.a$a r8 = r2.getAnalyticParams()
                java.lang.String r8 = r8.getAb()
                if (r8 != 0) goto L84
                java.lang.String r8 = ""
            L84:
                Vj0.a$a r2 = r2.getAnalyticParams()
                java.lang.Boolean r2 = r2.getDefaultEvent()
                if (r2 == 0) goto L93
                boolean r2 = r2.booleanValue()
                goto L94
            L93:
                r2 = 0
            L94:
                r7.<init>(r8, r2)
                r2 = 0
                r5.<init>(r6, r7, r2)
                r11.put(r4, r5)
                goto L5a
            L9f:
                r0.f68001r = r3
                kotlinx.coroutines.flow.j r10 = r9.f67999b
                java.lang.Object r10 = r10.emit(r11, r0)
                if (r10 != r1) goto Laa
                return r1
            Laa:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            Lad:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Failed to load AB tests config with response "
                r0.<init>(r1)
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                r11.<init>(r10)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.ab_tests.C27650m.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C27650m(InterfaceC43160i interfaceC43160i) {
        this.f67998b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Map<String, ? extends C48777a>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f67998b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
