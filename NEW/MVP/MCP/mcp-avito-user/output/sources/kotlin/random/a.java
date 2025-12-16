package kotlin.random;

import Y61.k;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformRandom.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/random/a;", "Lkotlin/random/f;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class a extends f {
    @Override // kotlin.random.f
    public final int a(int i12) {
        return ((-i12) >> 31) & (p().nextInt() >>> (32 - i12));
    }

    @Override // kotlin.random.f
    public final boolean b() {
        return p().nextBoolean();
    }

    @Override // kotlin.random.f
    @k
    public final byte[] d(@k byte[] bArr) {
        p().nextBytes(bArr);
        return bArr;
    }

    @Override // kotlin.random.f
    public final double e() {
        return p().nextDouble();
    }

    @Override // kotlin.random.f
    public final float h() {
        return p().nextFloat();
    }

    @Override // kotlin.random.f
    public final int i() {
        return p().nextInt();
    }

    @Override // kotlin.random.f
    public final int k(int i12) {
        return p().nextInt(i12);
    }

    @Override // kotlin.random.f
    public final long m() {
        return p().nextLong();
    }

    @k
    public abstract Random p();
}
