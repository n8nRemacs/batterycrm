package io.ktor.serialization.kotlinx;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.http.C41524i;
import io.ktor.http.content.p;
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
public final class f implements InterfaceC43160i<p> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43187o f400319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C41524i f400320c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Charset f400321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U31.b f400322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f400323f;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f400324b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C41524i f400325c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Charset f400326d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ U31.b f400327e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Object f400328f;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", i = {}, l = {224, 223}, m = "emit", n = {}, s = {})
        /* renamed from: io.ktor.serialization.kotlinx.f$a$a, reason: collision with other inner class name */
        public static final class C11419a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f400329q;

            /* renamed from: r, reason: collision with root package name */
            public int f400330r;

            /* renamed from: s, reason: collision with root package name */
            public InterfaceC43172j f400331s;

            public C11419a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f400329q = obj;
                this.f400330r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C41524i c41524i, Charset charset, U31.b bVar, Object obj) {
            this.f400324b = interfaceC43172j;
            this.f400325c = c41524i;
            this.f400326d = charset;
            this.f400327e = bVar;
            this.f400328f = obj;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r9, @Y61.k kotlin.coroutines.Continuation r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof io.ktor.serialization.kotlinx.f.a.C11419a
                if (r0 == 0) goto L13
                r0 = r10
                io.ktor.serialization.kotlinx.f$a$a r0 = (io.ktor.serialization.kotlinx.f.a.C11419a) r0
                int r1 = r0.f400330r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f400330r = r1
                goto L18
            L13:
                io.ktor.serialization.kotlinx.f$a$a r0 = new io.ktor.serialization.kotlinx.f$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f400329q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f400330r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.C42729a0.b(r10)
                goto L63
            L2c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L34:
                kotlinx.coroutines.flow.j r9 = r0.f400331s
                kotlin.C42729a0.b(r10)
                goto L57
            L3a:
                kotlin.C42729a0.b(r10)
                io.ktor.serialization.kotlinx.k r9 = (io.ktor.serialization.kotlinx.k) r9
                kotlinx.coroutines.flow.j r10 = r8.f400324b
                r0.f400331s = r10
                r0.f400330r = r4
                U31.b r2 = r8.f400327e
                java.lang.Object r4 = r8.f400328f
                io.ktor.http.i r5 = r8.f400325c
                java.nio.charset.Charset r6 = r8.f400326d
                io.ktor.http.content.f r9 = r9.b(r5, r6, r2, r4)
                if (r9 != r1) goto L54
                return r1
            L54:
                r7 = r10
                r10 = r9
                r9 = r7
            L57:
                r2 = 0
                r0.f400331s = r2
                r0.f400330r = r3
                java.lang.Object r9 = r9.emit(r10, r0)
                if (r9 != r1) goto L63
                return r1
            L63:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.serialization.kotlinx.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public f(C43187o c43187o, C41524i c41524i, Charset charset, U31.b bVar, Object obj) {
        this.f400319b = c43187o;
        this.f400320c = c41524i;
        this.f400321d = charset;
        this.f400322e = bVar;
        this.f400323f = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super p> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f400319b.collect(new a(interfaceC43172j, this.f400320c, this.f400321d, this.f400322e, this.f400323f), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
