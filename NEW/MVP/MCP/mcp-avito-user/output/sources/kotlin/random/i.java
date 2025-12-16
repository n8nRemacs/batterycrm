package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: XorWowRandom.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/random/i;", "Lkotlin/random/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i extends f implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f406885d;

    /* renamed from: e, reason: collision with root package name */
    public int f406886e;

    /* renamed from: f, reason: collision with root package name */
    public int f406887f;

    /* renamed from: g, reason: collision with root package name */
    public int f406888g;

    /* renamed from: h, reason: collision with root package name */
    public int f406889h;

    /* renamed from: i, reason: collision with root package name */
    public int f406890i;

    /* compiled from: XorWowRandom.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/random/i$a;", "", "<init>", "()V", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Override // kotlin.random.f
    public final int a(int i12) {
        return ((-i12) >> 31) & (i() >>> (32 - i12));
    }

    @Override // kotlin.random.f
    public final int i() {
        int i12 = this.f406885d;
        int i13 = i12 ^ (i12 >>> 2);
        this.f406885d = this.f406886e;
        this.f406886e = this.f406887f;
        this.f406887f = this.f406888g;
        int i14 = this.f406889h;
        this.f406888g = i14;
        int i15 = ((i13 ^ (i13 << 1)) ^ i14) ^ (i14 << 4);
        this.f406889h = i15;
        int i16 = this.f406890i + 362437;
        this.f406890i = i16;
        return i15 + i16;
    }
}
