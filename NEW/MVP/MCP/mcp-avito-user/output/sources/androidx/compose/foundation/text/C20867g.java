package androidx.compose.foundation.text;

import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.unit.y;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextAutoSize.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/g;", "Landroidx/compose/foundation/text/S1;", "Landroidx/compose/ui/unit/y;", "minFontSize", "maxFontSize", "stepSize", "<init>", "(JJJLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20867g implements S1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f30710a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30711b;

    /* renamed from: c, reason: collision with root package name */
    public final long f30712c;

    public C20867g(long j12, long j13, long j14, C42822w c42822w) {
        this.f30710a = j12;
        this.f30711b = j13;
        this.f30712c = j14;
        androidx.compose.ui.unit.y.f42874b.getClass();
        long j15 = androidx.compose.ui.unit.y.f42876d;
        if (androidx.compose.ui.unit.y.b(j12, j15)) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (androidx.compose.ui.unit.y.b(j13, j15)) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (androidx.compose.ui.unit.y.b(j14, j15)) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (androidx.compose.ui.unit.A.b(androidx.compose.ui.unit.y.c(j12), androidx.compose.ui.unit.y.c(j13))) {
            androidx.compose.ui.unit.z.b(j12, j13);
            if (Float.compare(androidx.compose.ui.unit.y.d(j12), androidx.compose.ui.unit.y.d(j13)) > 0) {
                this.f30710a = j13;
            }
        }
        long jC2 = androidx.compose.ui.unit.y.c(j14);
        androidx.compose.ui.unit.A.f42832b.getClass();
        if (androidx.compose.ui.unit.A.b(jC2, androidx.compose.ui.unit.A.f42833c)) {
            long jF2 = androidx.compose.ui.unit.z.f(4294967296L, 1.0E-4f);
            androidx.compose.ui.unit.z.b(j14, jF2);
            if (Float.compare(androidx.compose.ui.unit.y.d(j14), androidx.compose.ui.unit.y.d(jF2)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (androidx.compose.ui.unit.y.d(this.f30710a) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (androidx.compose.ui.unit.y.d(j13) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }

    public static boolean b(androidx.compose.ui.text.o0 o0Var) {
        int i12 = o0Var.f42526a.f42511f;
        androidx.compose.ui.text.style.s.f42720b.getClass();
        boolean z12 = true;
        boolean zA2 = androidx.compose.ui.text.style.s.a(i12, androidx.compose.ui.text.style.s.f42721c) ? true : androidx.compose.ui.text.style.s.a(i12, androidx.compose.ui.text.style.s.f42723e);
        boolean zT2 = false;
        long j12 = o0Var.f42528c;
        androidx.compose.ui.text.G g12 = o0Var.f42527b;
        if (!zA2) {
            int i13 = androidx.compose.ui.text.style.s.f42724f;
            boolean zA3 = androidx.compose.ui.text.style.s.a(i12, i13) ? true : androidx.compose.ui.text.style.s.a(i12, androidx.compose.ui.text.style.s.f42725g) ? true : androidx.compose.ui.text.style.s.a(i12, androidx.compose.ui.text.style.s.f42722d);
            androidx.compose.ui.text.n0 n0Var = o0Var.f42526a;
            if (!zA3) {
                throw new IllegalArgumentException("TextOverflow type " + ((Object) androidx.compose.ui.text.style.s.b(n0Var.f42511f)) + " is not supported.");
            }
            int i14 = g12.f41921f;
            if (i14 != 0) {
                if (i14 != 1) {
                    int i15 = n0Var.f42511f;
                    if (androidx.compose.ui.text.style.s.a(i15, i13) ? true : androidx.compose.ui.text.style.s.a(i15, androidx.compose.ui.text.style.s.f42725g)) {
                        if (((int) (j12 >> 32)) >= g12.f41919d && !o0Var.d()) {
                            z12 = false;
                        }
                        zT2 = z12;
                    } else if (androidx.compose.ui.text.style.s.a(i15, androidx.compose.ui.text.style.s.f42722d)) {
                        int i16 = g12.f41921f - 1;
                        g12.o(i16);
                        ArrayList arrayList = g12.f41923h;
                        zT2 = ((androidx.compose.ui.text.M) arrayList.get(androidx.compose.ui.text.J.b(i16, arrayList))).f41932a.t(i16);
                    }
                } else {
                    g12.o(0);
                    ArrayList arrayList2 = g12.f41923h;
                    zT2 = ((androidx.compose.ui.text.M) arrayList2.get(androidx.compose.ui.text.J.b(0, arrayList2))).f41932a.t(0);
                }
            }
        } else if (((int) (j12 >> 32)) < g12.f41919d || o0Var.d()) {
            return true;
        }
        return zT2;
    }

    @Override // androidx.compose.foundation.text.S1
    public final long a(@Y61.k androidx.compose.foundation.text.modifiers.s sVar, long j12, @Y61.k C22602e c22602e) {
        float fA02 = sVar.A0(this.f30712c);
        float fA03 = sVar.A0(this.f30710a);
        float fA04 = sVar.A0(this.f30711b);
        float f12 = 2;
        float f13 = (fA03 + fA04) / f12;
        float f14 = fA03;
        float f15 = fA04;
        while (f15 - f14 >= fA02) {
            if (b(sVar.e1(j12, sVar.o(f13)))) {
                f15 = f13;
            } else {
                f14 = f13;
            }
            f13 = (f14 + f15) / f12;
        }
        float fFloor = (((float) Math.floor((f14 - fA03) / fA02)) * fA02) + fA03;
        float f16 = fA02 + fFloor;
        if (f16 <= fA04 && !b(sVar.e1(j12, sVar.o(f16)))) {
            fFloor = f16;
        }
        return sVar.o(fFloor);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C20867g)) {
            return false;
        }
        C20867g c20867g = (C20867g) obj;
        return androidx.compose.ui.unit.y.b(c20867g.f30710a, this.f30710a) && androidx.compose.ui.unit.y.b(c20867g.f30711b, this.f30711b) && androidx.compose.ui.unit.y.b(c20867g.f30712c, this.f30712c);
    }

    @Override // androidx.compose.foundation.text.S1
    public final int hashCode() {
        y.a aVar = androidx.compose.ui.unit.y.f42874b;
        return Long.hashCode(this.f30712c) + androidx.appcompat.app.r.g(Long.hashCode(this.f30710a) * 31, 31, this.f30711b);
    }
}
