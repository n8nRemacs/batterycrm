package Xg;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GenericGF.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LXg/a;", "", "a", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xg.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17004a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C1345a f19008d = new C1345a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C17004a f19009e = new C17004a();

    /* renamed from: a, reason: collision with root package name */
    @k
    public final int[] f19010a = new int[256];

    /* renamed from: b, reason: collision with root package name */
    @k
    public final int[] f19011b = new int[256];

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C17005b f19012c;

    /* compiled from: GenericGF.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXg/a$a;", "", "<init>", "()V", "_avito_barcode-encoder_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xg.a$a, reason: collision with other inner class name */
    public static final class C1345a {
        public /* synthetic */ C1345a(C42822w c42822w) {
            this();
        }

        public C1345a() {
        }
    }

    public C17004a() {
        int i12 = 1;
        for (int i13 = 0; i13 < 256; i13++) {
            this.f19010a[i13] = i12;
            i12 *= 2;
            if (i12 >= 256) {
                i12 = (i12 ^ 285) & 255;
            }
        }
        for (int i14 = 0; i14 < 255; i14++) {
            this.f19011b[this.f19010a[i14]] = i14;
        }
        this.f19012c = new C17005b(this, new int[]{0});
        new C17005b(this, new int[]{1});
    }

    public final int a(int i12, int i13) {
        if (i12 == 0 || i13 == 0) {
            return 0;
        }
        int[] iArr = this.f19011b;
        return this.f19010a[(iArr[i12] + iArr[i13]) % 255];
    }

    @k
    public final String toString() {
        return "GF(0x" + Integer.toHexString(285) + ",256)";
    }
}
