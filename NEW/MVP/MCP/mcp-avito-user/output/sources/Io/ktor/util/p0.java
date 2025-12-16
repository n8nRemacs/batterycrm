package io.ktor.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43135f1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.InterfaceC43123w;

/* compiled from: Nonce.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final List<String> f400496a = C42745f0.U("NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C43108m f400497b = kotlinx.coroutines.channels.A.a(1024, null, null, 6);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final N0 f400498c = C43259k.c(kotlinx.coroutines.D0.f410691b, C43262l0.f411947c.plus(C43135f1.f411090b).plus(new kotlinx.coroutines.S("nonce-generator")), CoroutineStart.f410681c, new a(2, null));

    /* compiled from: Nonce.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.util.NonceKt$nonceGeneratorJob$1", f = "Nonce.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {76}, m = "invokeSuspend", n = {"seedChannel", "previousRoundNonceList", "secureInstance", "weakRandom", "secureBytes", "weakBytes", "randomNonceList", "lastReseed", "index"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0"})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public int f400499A;

        /* renamed from: q, reason: collision with root package name */
        public InterfaceC43123w f400500q;

        /* renamed from: r, reason: collision with root package name */
        public ArrayList f400501r;

        /* renamed from: s, reason: collision with root package name */
        public SecureRandom f400502s;

        /* renamed from: t, reason: collision with root package name */
        public SecureRandom f400503t;

        /* renamed from: u, reason: collision with root package name */
        public byte[] f400504u;

        /* renamed from: v, reason: collision with root package name */
        public byte[] f400505v;

        /* renamed from: w, reason: collision with root package name */
        public List f400506w;

        /* renamed from: x, reason: collision with root package name */
        public long f400507x;

        /* renamed from: y, reason: collision with root package name */
        public int f400508y;

        /* renamed from: z, reason: collision with root package name */
        public int f400509z;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(2, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00c6 A[Catch: all -> 0x0035, LOOP:1: B:27:0x00c4->B:28:0x00c6, LOOP_END, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0024, B:38:0x013c, B:35:0x0118, B:39:0x013f, B:41:0x014e, B:26:0x00bb, B:28:0x00c6, B:29:0x00cf, B:31:0x00db, B:33:0x00ec, B:32:0x00e9), top: B:52:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00db A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0024, B:38:0x013c, B:35:0x0118, B:39:0x013f, B:41:0x014e, B:26:0x00bb, B:28:0x00c6, B:29:0x00cf, B:31:0x00db, B:33:0x00ec, B:32:0x00e9), top: B:52:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e9 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0024, B:38:0x013c, B:35:0x0118, B:39:0x013f, B:41:0x014e, B:26:0x00bb, B:28:0x00c6, B:29:0x00cf, B:31:0x00db, B:33:0x00ec, B:32:0x00e9), top: B:52:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0118 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0024, B:38:0x013c, B:35:0x0118, B:39:0x013f, B:41:0x014e, B:26:0x00bb, B:28:0x00c6, B:29:0x00cf, B:31:0x00db, B:33:0x00ec, B:32:0x00e9), top: B:52:0x0024 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x013f A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x0024, B:38:0x013c, B:35:0x0118, B:39:0x013f, B:41:0x014e, B:26:0x00bb, B:28:0x00c6, B:29:0x00cf, B:31:0x00db, B:33:0x00ec, B:32:0x00e9), top: B:52:0x0024 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0139 -> B:38:0x013c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r25) throws java.security.NoSuchAlgorithmException {
            /*
                Method dump skipped, instructions count: 378
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.p0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final SecureRandom a(String str) {
        try {
            return str != null ? SecureRandom.getInstance(str) : new SecureRandom();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
