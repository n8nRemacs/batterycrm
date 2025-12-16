package io.ktor.serialization;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.W0;
import java.nio.charset.Charset;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43187o;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43187o f400279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Charset f400280c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U31.b f400281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W0 f400282e;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f400283b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Charset f400284c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ U31.b f400285d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ W0 f400286e;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2", f = "ContentConverter.kt", i = {}, l = {224, 223}, m = "emit", n = {}, s = {})
        /* renamed from: io.ktor.serialization.d$a$a, reason: collision with other inner class name */
        public static final class C11417a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f400287q;

            /* renamed from: r, reason: collision with root package name */
            public int f400288r;

            /* renamed from: s, reason: collision with root package name */
            public InterfaceC43172j f400289s;

            public C11417a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f400287q = obj;
                this.f400288r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, Charset charset, U31.b bVar, W0 w02) {
            this.f400283b = interfaceC43172j;
            this.f400284c = charset;
            this.f400285d = bVar;
            this.f400286e = w02;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof io.ktor.serialization.d.a.C11417a
                if (r0 == 0) goto L13
                r0 = r9
                io.ktor.serialization.d$a$a r0 = (io.ktor.serialization.d.a.C11417a) r0
                int r1 = r0.f400288r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f400288r = r1
                goto L18
            L13:
                io.ktor.serialization.d$a$a r0 = new io.ktor.serialization.d$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f400287q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f400288r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C42729a0.b(r9)
                goto L61
            L2c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L34:
                kotlinx.coroutines.flow.j r8 = r0.f400289s
                kotlin.C42729a0.b(r9)
                goto L55
            L3a:
                kotlin.C42729a0.b(r9)
                io.ktor.serialization.c r8 = (io.ktor.serialization.c) r8
                kotlinx.coroutines.flow.j r9 = r7.f400283b
                r0.f400289s = r9
                r0.f400288r = r4
                U31.b r2 = r7.f400285d
                io.ktor.utils.io.W0 r4 = r7.f400286e
                java.nio.charset.Charset r5 = r7.f400284c
                java.lang.Object r8 = r8.a(r5, r2, r4, r0)
                if (r8 != r1) goto L52
                return r1
            L52:
                r6 = r9
                r9 = r8
                r8 = r6
            L55:
                r2 = 0
                r0.f400289s = r2
                r0.f400288r = r3
                java.lang.Object r8 = r8.emit(r9, r0)
                if (r8 != r1) goto L61
                return r1
            L61:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public d(C43187o c43187o, Charset charset, U31.b bVar, W0 w02) {
        this.f400279b = c43187o;
        this.f400280c = charset;
        this.f400281d = bVar;
        this.f400282e = w02;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super Object> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = this.f400279b.collect(new a(interfaceC43172j, this.f400280c, this.f400281d, this.f400282e), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
