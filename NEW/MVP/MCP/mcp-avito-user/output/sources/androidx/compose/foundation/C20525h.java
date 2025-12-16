package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.unit.u;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import l0.g;

/* compiled from: AndroidOverscroll.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/h;", "Landroidx/compose/foundation/M1;", "Landroid/content/Context;", "context", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/graphics/T;", "glowColor", "Landroidx/compose/foundation/layout/T1;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Landroidx/compose/ui/unit/d;JLandroidx/compose/foundation/layout/T1;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20525h implements M1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f28106a;

    /* renamed from: b, reason: collision with root package name */
    public long f28107b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final T0 f28108c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<kotlin.G0> f28109d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28110e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28111f;

    /* renamed from: g, reason: collision with root package name */
    public long f28112g;

    /* renamed from: h, reason: collision with root package name */
    public long f28113h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AbstractC22425n f28114i;

    /* compiled from: AndroidOverscroll.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", i = {1, 1}, l = {688, 720}, m = "applyToFling-BMRW4eQ", n = {"this", "remainingVelocity"}, s = {"L$0", "J$0"})
    /* renamed from: androidx.compose.foundation.h$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public C20525h f28115q;

        /* renamed from: r, reason: collision with root package name */
        public long f28116r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f28117s;

        /* renamed from: u, reason: collision with root package name */
        public int f28119u;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f28117s = obj;
            this.f28119u |= BeduinInputModel.MIN_TEXT_VERSION;
            return C20525h.this.P(0L, null, this);
        }
    }

    public C20525h(Context context, androidx.compose.ui.unit.d dVar, long j12, androidx.compose.foundation.layout.T1 t12, C42822w c42822w) {
        this.f28106a = dVar;
        l0.g.f413384b.getClass();
        this.f28107b = l0.g.f413386d;
        T0 t02 = new T0(context, androidx.compose.ui.graphics.V.j(j12));
        this.f28108c = t02;
        this.f28109d = C22126m3.f(kotlin.G0.f406611a, C22126m3.h());
        this.f28110e = true;
        l0.n.f413402b.getClass();
        this.f28112g = 0L;
        this.f28113h = -1L;
        androidx.compose.ui.input.pointer.g0 g0VarB = androidx.compose.ui.input.pointer.Z.b(new C20528i(this));
        this.f28114i = Build.VERSION.SDK_INT >= 31 ? new g2(g0VarB, this, t02) : new C20533j1(g0VarB, this, t02, t12);
    }

    @Override // androidx.compose.foundation.M1
    @Y61.k
    public final InterfaceC22419k N() {
        return this.f28114i;
    }

    @Override // androidx.compose.foundation.M1
    public final boolean O() {
        T0 t02 = this.f28108c;
        EdgeEffect edgeEffect = t02.f26859d;
        if (edgeEffect != null) {
            R0.f26833a.getClass();
            if (R0.b(edgeEffect) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = t02.f26860e;
        if (edgeEffect2 != null) {
            R0.f26833a.getClass();
            if (R0.b(edgeEffect2) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = t02.f26861f;
        if (edgeEffect3 != null) {
            R0.f26833a.getClass();
            if (R0.b(edgeEffect3) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = t02.f26862g;
        if (edgeEffect4 == null) {
            return false;
        }
        R0.f26833a.getClass();
        return R0.b(edgeEffect4) != 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // androidx.compose.foundation.M1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(long r16, @Y61.k Y41.p<? super androidx.compose.ui.unit.B, ? super kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.B>, ? extends java.lang.Object> r18, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r19) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C20525h.P(long, Y41.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141 A[PHI: r12
  0x0141: PHI (r12v11 float) = (r12v10 float), (r12v14 float) binds: [B:72:0x016f, B:61:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.foundation.M1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long Q(long r22, int r24, @Y61.k Y41.l<? super l0.g, l0.g> r25) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C20525h.Q(long, int, Y41.l):long");
    }

    public final void a() {
        boolean z12;
        T0 t02 = this.f28108c;
        EdgeEffect edgeEffect = t02.f26859d;
        boolean z13 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z12 = !edgeEffect.isFinished();
        } else {
            z12 = false;
        }
        EdgeEffect edgeEffect2 = t02.f26860e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z12 = !edgeEffect2.isFinished() || z12;
        }
        EdgeEffect edgeEffect3 = t02.f26861f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z12 = !edgeEffect3.isFinished() || z12;
        }
        EdgeEffect edgeEffect4 = t02.f26862g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z12) {
                z13 = false;
            }
            z12 = z13;
        }
        if (z12) {
            c();
        }
    }

    public final long b() {
        long jB2 = this.f28107b;
        if ((9223372034707292159L & jB2) == 9205357640488583168L) {
            jB2 = l0.o.b(this.f28112g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB2 >> 32)) / Float.intBitsToFloat((int) (this.f28112g >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 & 4294967295L)) / Float.intBitsToFloat((int) (this.f28112g & 4294967295L));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        g.a aVar = l0.g.f413384b;
        return jFloatToRawIntBits;
    }

    public final void c() {
        if (this.f28110e) {
            ((C22082i3) this.f28109d).setValue(kotlin.G0.f406611a);
        }
    }

    public final float d(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() >> 32));
        int i12 = (int) (j12 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i12) / Float.intBitsToFloat((int) (this.f28112g & 4294967295L));
        EdgeEffect edgeEffectB = this.f28108c.b();
        R0.f26833a.getClass();
        return R0.b(edgeEffectB) == 0.0f ? Float.intBitsToFloat((int) (this.f28112g & 4294967295L)) * (-R0.d(edgeEffectB, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) : Float.intBitsToFloat(i12);
    }

    public final float e(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() & 4294967295L));
        int i12 = (int) (j12 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i12) / Float.intBitsToFloat((int) (this.f28112g >> 32));
        EdgeEffect edgeEffectC = this.f28108c.c();
        R0.f26833a.getClass();
        return R0.b(edgeEffectC) == 0.0f ? Float.intBitsToFloat((int) (this.f28112g >> 32)) * R0.d(edgeEffectC, fIntBitsToFloat2, 1 - fIntBitsToFloat) : Float.intBitsToFloat(i12);
    }

    public final float f(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() & 4294967295L));
        int i12 = (int) (j12 >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i12) / Float.intBitsToFloat((int) (this.f28112g >> 32));
        EdgeEffect edgeEffectD = this.f28108c.d();
        R0.f26833a.getClass();
        return R0.b(edgeEffectD) == 0.0f ? Float.intBitsToFloat((int) (this.f28112g >> 32)) * (-R0.d(edgeEffectD, -fIntBitsToFloat2, fIntBitsToFloat)) : Float.intBitsToFloat(i12);
    }

    public final float g(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() >> 32));
        int i12 = (int) (j12 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i12) / Float.intBitsToFloat((int) (this.f28112g & 4294967295L));
        EdgeEffect edgeEffectE = this.f28108c.e();
        R0.f26833a.getClass();
        return R0.b(edgeEffectE) == 0.0f ? Float.intBitsToFloat((int) (this.f28112g & 4294967295L)) * R0.d(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat) : Float.intBitsToFloat(i12);
    }

    public final void h(long j12) {
        long j13 = this.f28112g;
        l0.n.f413402b.getClass();
        boolean zB2 = l0.n.b(j13, 0L);
        boolean zB3 = l0.n.b(j12, this.f28112g);
        this.f28112g = j12;
        if (!zB3) {
            long jB2 = (kotlin.math.b.b(Float.intBitsToFloat((int) (j12 & 4294967295L))) & 4294967295L) | (kotlin.math.b.b(Float.intBitsToFloat((int) (j12 >> 32))) << 32);
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
            T0 t02 = this.f28108c;
            t02.f26858c = jB2;
            EdgeEffect edgeEffect = t02.f26859d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jB2 >> 32), (int) (jB2 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = t02.f26860e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jB2 >> 32), (int) (jB2 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = t02.f26861f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jB2 & 4294967295L), (int) (jB2 >> 32));
            }
            EdgeEffect edgeEffect4 = t02.f26862g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jB2 & 4294967295L), (int) (jB2 >> 32));
            }
            EdgeEffect edgeEffect5 = t02.f26863h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jB2 >> 32), (int) (jB2 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = t02.f26864i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jB2 >> 32), (int) (jB2 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = t02.f26865j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jB2 & 4294967295L), (int) (jB2 >> 32));
            }
            EdgeEffect edgeEffect8 = t02.f26866k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jB2), (int) (jB2 >> 32));
            }
        }
        if (zB2 || zB3) {
            return;
        }
        a();
    }
}
