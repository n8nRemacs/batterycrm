package io.ktor.serialization.kotlinx.json;

import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.utils.io.InterfaceC41649d1;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.serialization.KSerializer;

/* compiled from: Collect.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/B", "Lkotlinx/coroutines/flow/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g implements InterfaceC43172j<Object> {

    /* renamed from: b, reason: collision with root package name */
    public int f400355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41649d1 f400356c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.ktor.serialization.kotlinx.json.a f400357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f400358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ KSerializer f400359f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Charset f400360g;

    /* compiled from: Collect.kt */
    @s0
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1", f = "KotlinxSerializationJsonExtensions.kt", i = {0, 0, 1}, l = {124, 127}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f400361q;

        /* renamed from: r, reason: collision with root package name */
        public int f400362r;

        /* renamed from: t, reason: collision with root package name */
        public g f400364t;

        /* renamed from: u, reason: collision with root package name */
        public Object f400365u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f400361q = obj;
            this.f400362r |= BeduinInputModel.MIN_TEXT_VERSION;
            return g.this.emit(null, this);
        }
    }

    public g(InterfaceC41649d1 interfaceC41649d1, io.ktor.serialization.kotlinx.json.a aVar, j jVar, KSerializer kSerializer, Charset charset) {
        this.f400356c = interfaceC41649d1;
        this.f400357d = aVar;
        this.f400358e = jVar;
        this.f400359f = kSerializer;
        this.f400360g = charset;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.serialization.kotlinx.json.g.a
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.serialization.kotlinx.json.g$a r0 = (io.ktor.serialization.kotlinx.json.g.a) r0
            int r1 = r0.f400362r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f400362r = r1
            goto L18
        L13:
            io.ktor.serialization.kotlinx.json.g$a r0 = new io.ktor.serialization.kotlinx.json.g$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f400361q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f400362r
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L37
            if (r2 != r4) goto L2f
            io.ktor.serialization.kotlinx.json.g r7 = r0.f400364t
            kotlin.C42729a0.b(r8)
            goto L9a
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r7 = r0.f400365u
            io.ktor.serialization.kotlinx.json.g r2 = r0.f400364t
            kotlin.C42729a0.b(r8)
            goto L60
        L3f:
            kotlin.C42729a0.b(r8)
            int r8 = r6.f400355b
            int r2 = r8 + 1
            r6.f400355b = r2
            if (r8 < 0) goto La2
            if (r8 <= 0) goto L63
            io.ktor.serialization.kotlinx.json.a r8 = r6.f400357d
            byte[] r8 = r8.f400346c
            r0.f400364t = r6
            r0.f400365u = r7
            r0.f400362r = r3
            io.ktor.utils.io.d1 r2 = r6.f400356c
            java.lang.Object r8 = io.ktor.utils.io.C41655f1.a(r2, r8, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r2 = r6
        L60:
            r8 = r7
            r7 = r2
            goto L65
        L63:
            r8 = r7
            r7 = r6
        L65:
            io.ktor.serialization.kotlinx.json.j r2 = r7.f400358e
            kotlinx.serialization.json.a r2 = r2.f400381a
            kotlinx.serialization.KSerializer r3 = r7.f400359f
            java.lang.String r8 = r2.c(r3, r8)
            java.nio.charset.Charset r2 = kotlin.text.C43047d.f410589b
            java.nio.charset.Charset r3 = r7.f400360g
            boolean r5 = kotlin.jvm.internal.L.f(r3, r2)
            if (r5 == 0) goto L7e
            byte[] r8 = r8.getBytes(r2)
            goto L8a
        L7e:
            java.nio.charset.CharsetEncoder r2 = r3.newEncoder()
            int r3 = r8.length()
            byte[] r8 = W31.a.c(r2, r8, r3)
        L8a:
            r0.f400364t = r7
            r2 = 0
            r0.f400365u = r2
            r0.f400362r = r4
            io.ktor.utils.io.d1 r2 = r7.f400356c
            java.lang.Object r8 = io.ktor.utils.io.C41655f1.a(r2, r8, r0)
            if (r8 != r1) goto L9a
            return r1
        L9a:
            io.ktor.utils.io.d1 r7 = r7.f400356c
            r7.flush()
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        La2:
            java.lang.ArithmeticException r7 = new java.lang.ArithmeticException
            java.lang.String r8 = "Index overflow has happened"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.json.g.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
