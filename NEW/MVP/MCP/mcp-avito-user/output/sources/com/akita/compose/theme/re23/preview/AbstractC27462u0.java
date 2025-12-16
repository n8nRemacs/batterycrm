package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.InterfaceC22196w1;
import com.akita.compose.component.chips.C27332a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ComponentPreviewContainer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/akita/compose/theme/re23/preview/u0;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/akita/compose/theme/re23/preview/u0$a;", "Lcom/akita/compose/theme/re23/preview/u0$b;", "Lcom/akita/compose/theme/re23/preview/u0$c;", "Lcom/akita/compose/theme/re23/preview/u0$d;", "re23_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.akita.compose.theme.re23.preview.u0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC27462u0 {

    /* compiled from: ComponentPreviewContainer.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/theme/re23/preview/u0$a;", "Lcom/akita/compose/theme/re23/preview/u0;", "re23_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.u0$a */
    public static final class a extends AbstractC27462u0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f65851a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Y41.a<kotlin.G0> f65852b;

        public a(@Y61.k String str, @Y61.k Y41.a<kotlin.G0> aVar) {
            super(null);
            this.f65851a = str;
            this.f65852b = aVar;
        }
    }

    /* compiled from: ComponentPreviewContainer.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/theme/re23/preview/u0$c;", "Lcom/akita/compose/theme/re23/preview/u0;", "re23_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.u0$c */
    public static final class c extends AbstractC27462u0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f65864a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65865b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65866c;

        /* renamed from: d, reason: collision with root package name */
        public final int f65867d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22196w1 f65868e;

        public /* synthetic */ c(String str, int i12, int i13, int i14, int i15, int i16, C42822w c42822w) {
            this(str, (i16 & 2) != 0 ? 0 : i12, (i16 & 4) != 0 ? 1 : i13, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? Integer.MAX_VALUE : i15);
        }

        public c(@Y61.k String str, int i12, int i13, int i14, int i15) {
            super(null);
            this.f65864a = str;
            this.f65865b = i13;
            this.f65866c = i14;
            this.f65867d = i15;
            this.f65868e = androidx.compose.runtime.U2.a(i12);
        }
    }

    /* compiled from: ComponentPreviewContainer.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/theme/re23/preview/u0$d;", "Lcom/akita/compose/theme/re23/preview/u0;", "re23_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.u0$d */
    public static final class d extends AbstractC27462u0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f65869a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f65870b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Boolean, kotlin.G0> f65871c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k String str, boolean z12, @Y61.k Y41.l<? super Boolean, kotlin.G0> lVar) {
            super(null);
            this.f65869a = str;
            this.f65870b = z12;
            this.f65871c = lVar;
        }
    }

    public /* synthetic */ AbstractC27462u0(C42822w c42822w) {
        this();
    }

    /* compiled from: ComponentPreviewContainer.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/theme/re23/preview/u0$b;", "", "T", "Lcom/akita/compose/theme/re23/preview/u0;", "re23_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.theme.re23.preview.u0$b */
    public static final class b<T extends Enum<T>> extends AbstractC27462u0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f65853a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlin.enums.a<T> f65854b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.flow.Z1<T> f65855c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final a f65856d;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.akita.compose.theme.re23.preview.u0$b$a */
        public static final class a implements InterfaceC43160i<List<? extends C27332a>> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f65857b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f65858c;

            /* compiled from: Emitters.kt */
            @kotlin.jvm.internal.s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.akita.compose.theme.re23.preview.u0$b$a$a, reason: collision with other inner class name */
            public static final class C2112a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f65859b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b f65860c;

                /* compiled from: Emitters.kt */
                @kotlin.jvm.internal.s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.akita.compose.theme.re23.preview.ComponentPreviewControl$Chips$special$$inlined$map$1$2", f = "ComponentPreviewContainer.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                /* renamed from: com.akita.compose.theme.re23.preview.u0$b$a$a$a, reason: collision with other inner class name */
                public static final class C2113a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f65861q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f65862r;

                    public C2113a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f65861q = obj;
                        this.f65862r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C2112a.this.emit(null, this);
                    }
                }

                public C2112a(InterfaceC43172j interfaceC43172j, b bVar) {
                    this.f65859b = interfaceC43172j;
                    this.f65860c = bVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r17, @Y61.k kotlin.coroutines.Continuation r18) {
                    /*
                        r16 = this;
                        r0 = r16
                        r1 = r18
                        boolean r2 = r1 instanceof com.akita.compose.theme.re23.preview.AbstractC27462u0.b.a.C2112a.C2113a
                        if (r2 == 0) goto L17
                        r2 = r1
                        com.akita.compose.theme.re23.preview.u0$b$a$a$a r2 = (com.akita.compose.theme.re23.preview.AbstractC27462u0.b.a.C2112a.C2113a) r2
                        int r3 = r2.f65862r
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r5 = r3 & r4
                        if (r5 == 0) goto L17
                        int r3 = r3 - r4
                        r2.f65862r = r3
                        goto L1c
                    L17:
                        com.akita.compose.theme.re23.preview.u0$b$a$a$a r2 = new com.akita.compose.theme.re23.preview.u0$b$a$a$a
                        r2.<init>(r1)
                    L1c:
                        java.lang.Object r1 = r2.f65861q
                        java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r4 = r2.f65862r
                        r5 = 1
                        if (r4 == 0) goto L35
                        if (r4 != r5) goto L2d
                        kotlin.C42729a0.b(r1)
                        goto L81
                    L2d:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L35:
                        kotlin.C42729a0.b(r1)
                        r1 = r17
                        java.lang.Enum r1 = (java.lang.Enum) r1
                        com.akita.compose.theme.re23.preview.u0$b r4 = r0.f65860c
                        kotlin.enums.a<T extends java.lang.Enum<T>> r4 = r4.f65854b
                        java.util.ArrayList r6 = new java.util.ArrayList
                        r7 = 10
                        int r7 = kotlin.collections.C42745f0.q(r4, r7)
                        r6.<init>(r7)
                        java.util.Iterator r4 = r4.iterator()
                    L4f:
                        boolean r7 = r4.hasNext()
                        if (r7 == 0) goto L76
                        java.lang.Object r7 = r4.next()
                        java.lang.Enum r7 = (java.lang.Enum) r7
                        com.akita.compose.component.chips.a r15 = new com.akita.compose.component.chips.a
                        java.lang.String r9 = r7.name()
                        boolean r10 = r7.equals(r1)
                        r12 = 0
                        r13 = 0
                        r11 = 0
                        r14 = 28
                        r7 = 0
                        r8 = r15
                        r5 = r15
                        r15 = r7
                        r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                        r6.add(r5)
                        r5 = 1
                        goto L4f
                    L76:
                        r2.f65862r = r5
                        kotlinx.coroutines.flow.j r1 = r0.f65859b
                        java.lang.Object r1 = r1.emit(r6, r2)
                        if (r1 != r3) goto L81
                        return r3
                    L81:
                        kotlin.G0 r1 = kotlin.G0.f406611a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.theme.re23.preview.AbstractC27462u0.b.a.C2112a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public a(InterfaceC43160i interfaceC43160i, b bVar) {
                this.f65857b = interfaceC43160i;
                this.f65858c = bVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super List<? extends C27332a>> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f65857b.collect(new C2112a(interfaceC43172j, this.f65858c), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
            }
        }

        public /* synthetic */ b(String str, kotlin.enums.a aVar, Enum r32, int i12, C42822w c42822w) {
            this(str, aVar, (i12 & 4) != 0 ? (Enum) C42745f0.E(aVar) : r32);
        }

        public b(@Y61.k String str, @Y61.k kotlin.enums.a<T> aVar, @Y61.k T t12) {
            super(null);
            this.f65853a = str;
            this.f65854b = aVar;
            kotlinx.coroutines.flow.Z1<T> z1A = kotlinx.coroutines.flow.p2.a(t12);
            this.f65855c = z1A;
            this.f65856d = new a(z1A, this);
        }
    }

    public AbstractC27462u0() {
    }
}
