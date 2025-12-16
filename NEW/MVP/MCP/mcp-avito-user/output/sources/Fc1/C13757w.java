package Fc1;

import kotlin.NoWhenBranchMatchedException;
import ru.uxfeedback.pub.sdk.UxFbTargetPlatform;

/* renamed from: Fc1.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13757w implements InterfaceC13753v4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Cb1.h f5865a;

    /* renamed from: Fc1.w$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5866a;

        static {
            int[] iArr = new int[UxFbTargetPlatform.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5866a = iArr;
        }
    }

    public C13757w(@Y61.k Cb1.h hVar) {
        this.f5865a = hVar;
    }

    @Override // Fc1.InterfaceC13753v4
    public final int a() {
        return this.f5865a.f2309i;
    }

    @Override // Fc1.InterfaceC13753v4
    public final int b() {
        return this.f5865a.f2305e;
    }

    @Override // Fc1.InterfaceC13753v4
    public final boolean c() {
        return this.f5865a.f2301a;
    }

    @Override // Fc1.InterfaceC13753v4
    @Y61.k
    public final String d() {
        return this.f5865a.f2314n;
    }

    @Override // Fc1.InterfaceC13753v4
    public final int e() {
        return this.f5865a.f2303c;
    }

    @Override // Fc1.InterfaceC13753v4
    public final int f() {
        return this.f5865a.f2312l;
    }

    @Override // Fc1.InterfaceC13753v4
    @Y61.k
    public final String g() {
        return this.f5865a.f2317q;
    }

    @Override // Fc1.InterfaceC13753v4
    public final int h() {
        return this.f5865a.f2308h;
    }

    @Override // Fc1.InterfaceC13753v4
    @Y61.k
    public final int i() {
        int i12 = a.f5866a[this.f5865a.f2316p.ordinal()];
        int i13 = 1;
        if (i12 != 1) {
            i13 = 2;
            if (i12 != 2) {
                i13 = 3;
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return i13;
    }

    @Override // Fc1.InterfaceC13753v4
    public final int j() {
        return this.f5865a.f2304d;
    }

    @Override // Fc1.InterfaceC13753v4
    @Y61.k
    public final D4 k() {
        return new D4(this.f5865a.f2307g);
    }

    @Override // Fc1.InterfaceC13753v4
    @Y61.k
    public final D4 l() {
        return new D4(this.f5865a.f2310j);
    }

    @Override // Fc1.InterfaceC13753v4
    public final int m() {
        return this.f5865a.f2311k;
    }

    @Override // Fc1.InterfaceC13753v4
    public final int n() {
        return this.f5865a.f2313m;
    }

    @Override // Fc1.InterfaceC13753v4
    public final boolean o() {
        return this.f5865a.f2302b;
    }

    @Override // Fc1.InterfaceC13753v4
    public final boolean p() {
        return this.f5865a.f2306f;
    }

    @Override // Fc1.InterfaceC13753v4
    public final void a(int i12) {
        this.f5865a.f2313m = i12;
    }
}
