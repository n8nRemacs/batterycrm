package com.avito.android.mortgage.sign.draw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import androidx.compose.ui.graphics.C22277p;
import androidx.compose.ui.graphics.C22315w;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DrawElement.kt */
@F3
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/sign/draw/b;", "", "a", "b", "Lcom/avito/android/mortgage/sign/draw/b$a;", "Lcom/avito/android/mortgage/sign/draw/b$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: DrawElement.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sign/draw/b$a;", "Lcom/avito/android/mortgage/sign/draw/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @F3
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<c> f203622a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k List<? extends c> list) {
            this.f203622a = list;
        }

        @Override // com.avito.android.mortgage.sign.draw.b
        @k
        public final String a() {
            return AK.c.k("<path d=\"", C42745f0.O(this.f203622a, " ", null, null, com.avito.android.mortgage.sign.draw.a.f203621l, 30), "\" stroke=\"black\" stroke-width=\"4\" fill=\"transparent\" />");
        }

        @Override // com.avito.android.mortgage.sign.draw.b
        @k
        public final C22277p b() {
            C22277p c22277pA = C22315w.a();
            Iterator<T> it = this.f203622a.iterator();
            while (it.hasNext()) {
                ((c) it.next()).b(c22277pA);
            }
            return c22277pA;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f203622a, ((a) obj).f203622a);
        }

        public final int hashCode() {
            return this.f203622a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Path(actions="), this.f203622a, ')');
        }
    }

    /* compiled from: DrawElement.kt */
    @F3
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sign/draw/b$b;", "Lcom/avito/android/mortgage/sign/draw/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.sign.draw.b$b, reason: collision with other inner class name */
    public static final /* data */ class C6070b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final float f203623a;

        /* renamed from: b, reason: collision with root package name */
        public final float f203624b;

        public C6070b(float f12, float f13) {
            this.f203623a = f12;
            this.f203624b = f13;
        }

        @Override // com.avito.android.mortgage.sign.draw.b
        @k
        public final String a() {
            StringBuilder sb2 = new StringBuilder("<circle cx=\"");
            sb2.append(this.f203623a);
            sb2.append("\" cy=\"");
            return G.d(this.f203624b, "\" r=\"4\" fill=\"black\" />", sb2);
        }

        @Override // com.avito.android.mortgage.sign.draw.b
        @k
        public final C22277p b() {
            C22277p c22277pA = C22315w.a();
            float f12 = this.f203623a;
            float f13 = this.f203624b;
            c22277pA.i(f12, f13);
            c22277pA.r(f12, f13);
            return c22277pA;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6070b)) {
                return false;
            }
            C6070b c6070b = (C6070b) obj;
            return Float.compare(this.f203623a, c6070b.f203623a) == 0 && Float.compare(this.f203624b, c6070b.f203624b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f203624b) + (Float.hashCode(this.f203623a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Point(x=");
            sb2.append(this.f203623a);
            sb2.append(", y=");
            return r.k(')', this.f203624b, sb2);
        }
    }

    @k
    String a();

    @k
    C22277p b();
}
