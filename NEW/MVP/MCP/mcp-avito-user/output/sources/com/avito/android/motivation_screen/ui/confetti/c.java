package com.avito.android.motivation_screen.ui.confetti;

import Y61.k;
import Y61.l;
import android.graphics.PointF;
import android.widget.FrameLayout;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.random.f;

/* compiled from: ItemInfoConfettiAnimation.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/motivation_screen/ui/confetti/c;", "", "a", "b", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FrameLayout f206417a;

    /* compiled from: ItemInfoConfettiAnimation.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/motivation_screen/ui/confetti/c$a;", "", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return Float.compare(6.0f, 6.0f) == 0;
        }

        public final int hashCode() {
            return Integer.hashCode(3000) + r.d(6.0f, r.e(300, Long.hashCode(0L) * 31, 31), 31);
        }

        @k
        public final String toString() {
            return "Confetti(delay=0, count=300, radius=6.0, duration=3000)";
        }
    }

    /* compiled from: ItemInfoConfettiAnimation.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/motivation_screen/ui/confetti/c$b;", "", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f206418a;

        /* renamed from: b, reason: collision with root package name */
        public final double f206419b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PointF f206420c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PointF f206421d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ArrayList f206422e;

        public b(float f12, double d12, @k PointF pointF, @k PointF pointF2, @k ArrayList arrayList) {
            this.f206418a = f12;
            this.f206419b = d12;
            this.f206420c = pointF;
            this.f206421d = pointF2;
            this.f206422e = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.f206418a, bVar.f206418a) == 0 && Double.compare(this.f206419b, bVar.f206419b) == 0 && this.f206420c.equals(bVar.f206420c) && this.f206421d.equals(bVar.f206421d) && this.f206422e.equals(bVar.f206422e);
        }

        public final int hashCode() {
            return this.f206422e.hashCode() + ((this.f206421d.hashCode() + ((this.f206420c.hashCode() + r.g(e.d(Float.hashCode(this.f206418a) * 31, 31, this.f206419b), 31, 0L)) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DotParameters(scale=");
            sb2.append(this.f206418a);
            sb2.append(", duration=");
            sb2.append(this.f206419b);
            sb2.append(", delay=0, startPoint=");
            sb2.append(this.f206420c);
            sb2.append(", endPoint=");
            sb2.append(this.f206421d);
            sb2.append(", bezierPoints=");
            return e.p(sb2, this.f206422e, ')');
        }
    }

    public c(@k FrameLayout frameLayout) {
        this.f206417a = frameLayout;
    }

    public static double a(double d12, double d13) {
        f.f406882b.getClass();
        return f.f406883c.f(d12, d13);
    }
}
