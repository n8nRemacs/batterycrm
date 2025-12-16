package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22315w;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import l0.n;

/* compiled from: OutlineResolver.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/L1;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f41154a = true;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Outline f41155b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.graphics.D0 f41156c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C22277p f41157d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Path f41158e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41159f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41160g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Path f41161h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public l0.l f41162i;

    /* renamed from: j, reason: collision with root package name */
    public float f41163j;

    /* renamed from: k, reason: collision with root package name */
    public long f41164k;

    /* renamed from: l, reason: collision with root package name */
    public long f41165l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f41166m;

    public L1() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f41155b = outline;
        l0.g.f413384b.getClass();
        this.f41164k = 0L;
        l0.n.f413402b.getClass();
        this.f41165l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k androidx.compose.ui.graphics.M r14) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.L1.a(androidx.compose.ui.graphics.M):void");
    }

    @Y61.l
    public final Outline b() {
        e();
        if (this.f41166m && this.f41154a) {
            return this.f41155b;
        }
        return null;
    }

    public final boolean c(long j12) {
        androidx.compose.ui.graphics.D0 d02;
        if (this.f41166m && (d02 = this.f41156c) != null) {
            return C22485i2.a(d02, Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
        }
        return true;
    }

    public final boolean d(@Y61.l androidx.compose.ui.graphics.D0 d02, float f12, boolean z12, float f13, long j12) {
        this.f41155b.setAlpha(f12);
        boolean zF2 = kotlin.jvm.internal.L.f(this.f41156c, d02);
        boolean z13 = !zF2;
        if (!zF2) {
            this.f41156c = d02;
            this.f41159f = true;
        }
        this.f41165l = j12;
        boolean z14 = d02 != null && (z12 || f13 > 0.0f);
        if (this.f41166m != z14) {
            this.f41166m = z14;
            this.f41159f = true;
        }
        return z13;
    }

    public final void e() {
        if (this.f41159f) {
            l0.g.f413384b.getClass();
            this.f41164k = 0L;
            this.f41163j = 0.0f;
            this.f41158e = null;
            this.f41159f = false;
            this.f41160g = false;
            androidx.compose.ui.graphics.D0 d02 = this.f41156c;
            Outline outline = this.f41155b;
            if (d02 == null || !this.f41166m || Float.intBitsToFloat((int) (this.f41165l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.f41165l & 4294967295L)) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f41154a = true;
            if (d02 instanceof D0.b) {
                l0.j jVar = ((D0.b) d02).f39222a;
                long jFloatToRawIntBits = Float.floatToRawIntBits(jVar.f413390a);
                float f12 = jVar.f413391b;
                this.f41164k = (jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
                float f13 = jVar.f413392c;
                float f14 = jVar.f413390a;
                float f15 = jVar.f413393d;
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(f13 - f14);
                n.a aVar = l0.n.f413402b;
                this.f41165l = (Float.floatToRawIntBits(f15 - f12) & 4294967295L) | (jFloatToRawIntBits2 << 32);
                outline.setRect(Math.round(f14), Math.round(f12), Math.round(f13), Math.round(f15));
                return;
            }
            if (!(d02 instanceof D0.c)) {
                if (d02 instanceof D0.a) {
                    f(((D0.a) d02).f39221a);
                    return;
                }
                return;
            }
            l0.l lVar = ((D0.c) d02).f39223a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (lVar.f413398e >> 32));
            float f16 = lVar.f413394a;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(f16);
            float f17 = lVar.f413395b;
            this.f41164k = (jFloatToRawIntBits3 << 32) | (Float.floatToRawIntBits(f17) & 4294967295L);
            float fC2 = lVar.c();
            float fB2 = lVar.b();
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC2);
            n.a aVar2 = l0.n.f413402b;
            this.f41165l = (Float.floatToRawIntBits(fB2) & 4294967295L) | (jFloatToRawIntBits4 << 32);
            if (l0.m.c(lVar)) {
                this.f41155b.setRoundRect(Math.round(f16), Math.round(f17), Math.round(lVar.f413396c), Math.round(lVar.f413397d), fIntBitsToFloat);
                this.f41163j = fIntBitsToFloat;
                return;
            }
            C22277p c22277pA = this.f41157d;
            if (c22277pA == null) {
                c22277pA = C22315w.a();
                this.f41157d = c22277pA;
            }
            c22277pA.reset();
            Path.b(c22277pA, lVar);
            f(c22277pA);
        }
    }

    public final void f(Path path) {
        int i12 = Build.VERSION.SDK_INT;
        Outline outline = this.f41155b;
        if (i12 > 28 || path.j()) {
            if (i12 >= 30) {
                M1.f41171a.a(outline, path);
            } else {
                if (!(path instanceof C22277p)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((C22277p) path).f39716a);
            }
            this.f41160g = !outline.canClip();
        } else {
            this.f41154a = false;
            outline.setEmpty();
            this.f41160g = true;
        }
        this.f41158e = path;
    }
}
