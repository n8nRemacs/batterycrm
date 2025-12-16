package kotlin.random;

import Y61.k;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PlatformRandom.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/random/c;", "Ljava/util/Random;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class c extends Random {
    private static final long serialVersionUID = 0;

    /* compiled from: PlatformRandom.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/random/c$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // java.util.Random
    public final int next(int i12) {
        throw null;
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        throw null;
    }

    @Override // java.util.Random
    public final void nextBytes(@k byte[] bArr) {
        throw null;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        throw null;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        throw null;
    }

    @Override // java.util.Random
    public final int nextInt() {
        throw null;
    }

    @Override // java.util.Random
    public final long nextLong() {
        throw null;
    }

    @Override // java.util.Random
    public final void setSeed(long j12) {
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    @Override // java.util.Random
    public final int nextInt(int i12) {
        throw null;
    }
}
