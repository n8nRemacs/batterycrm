package androidx.compose.material3;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.p9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21791p9 implements InterfaceC43160i<androidx.compose.foundation.interaction.j> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f37030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C21814q9 f37031c;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.p9$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f37032b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C21814q9 f37033c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
        /* renamed from: androidx.compose.material3.p9$a$a, reason: collision with other inner class name */
        public static final class C1649a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f37034q;

            /* renamed from: r, reason: collision with root package name */
            public int f37035r;

            public C1649a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f37034q = obj;
                this.f37035r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C21814q9 c21814q9) {
            this.f37032b = interfaceC43172j;
            this.f37033c = c21814q9;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r11, @Y61.k kotlin.coroutines.Continuation r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof androidx.compose.material3.C21791p9.a.C1649a
                if (r0 == 0) goto L13
                r0 = r12
                androidx.compose.material3.p9$a$a r0 = (androidx.compose.material3.C21791p9.a.C1649a) r0
                int r1 = r0.f37035r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f37035r = r1
                goto L18
            L13:
                androidx.compose.material3.p9$a$a r0 = new androidx.compose.material3.p9$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f37034q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f37035r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r12)
                goto L8c
            L29:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L31:
                kotlin.C42729a0.b(r12)
                androidx.compose.foundation.interaction.j r11 = (androidx.compose.foundation.interaction.j) r11
                boolean r12 = r11 instanceof androidx.compose.foundation.interaction.o.b
                androidx.compose.material3.q9 r2 = r10.f37033c
                java.util.LinkedHashMap r4 = r2.f37174b
                if (r12 == 0) goto L54
                r12 = r11
                androidx.compose.foundation.interaction.o$b r12 = (androidx.compose.foundation.interaction.o.b) r12
                androidx.compose.foundation.interaction.o$b r5 = new androidx.compose.foundation.interaction.o$b
                long r6 = r12.f28149a
                long r8 = r2.f37173a
                long r6 = l0.g.i(r6, r8)
                r12 = 0
                r5.<init>(r6, r12)
                r4.put(r11, r5)
                r11 = r5
                goto L81
            L54:
                boolean r12 = r11 instanceof androidx.compose.foundation.interaction.o.a
                if (r12 == 0) goto L6b
                androidx.compose.foundation.interaction.o$a r11 = (androidx.compose.foundation.interaction.o.a) r11
                androidx.compose.foundation.interaction.o$b r12 = r11.f28148a
                java.lang.Object r12 = r4.remove(r12)
                androidx.compose.foundation.interaction.o$b r12 = (androidx.compose.foundation.interaction.o.b) r12
                if (r12 != 0) goto L65
                goto L81
            L65:
                androidx.compose.foundation.interaction.o$a r11 = new androidx.compose.foundation.interaction.o$a
                r11.<init>(r12)
                goto L81
            L6b:
                boolean r12 = r11 instanceof androidx.compose.foundation.interaction.o.c
                if (r12 == 0) goto L81
                androidx.compose.foundation.interaction.o$c r11 = (androidx.compose.foundation.interaction.o.c) r11
                androidx.compose.foundation.interaction.o$b r12 = r11.f28150a
                java.lang.Object r12 = r4.remove(r12)
                androidx.compose.foundation.interaction.o$b r12 = (androidx.compose.foundation.interaction.o.b) r12
                if (r12 != 0) goto L7c
                goto L81
            L7c:
                androidx.compose.foundation.interaction.o$c r11 = new androidx.compose.foundation.interaction.o$c
                r11.<init>(r12)
            L81:
                r0.f37035r = r3
                kotlinx.coroutines.flow.j r12 = r10.f37032b
                java.lang.Object r11 = r12.emit(r11, r0)
                if (r11 != r1) goto L8c
                return r1
            L8c:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21791p9.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C21791p9(InterfaceC43160i interfaceC43160i, C21814q9 c21814q9) {
        this.f37030b = interfaceC43160i;
        this.f37031c = c21814q9;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super androidx.compose.foundation.interaction.j> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f37030b.collect(new a(interfaceC43172j, this.f37031c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
