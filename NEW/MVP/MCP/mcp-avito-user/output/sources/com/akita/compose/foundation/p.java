package com.akita.compose.foundation;

import androidx.compose.foundation.H;
import androidx.compose.runtime.A;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.graphics.T;
import com.avito.android.remote.model.text.FontStyleKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.w0;

/* compiled from: ThemeColor.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\b¨\u0006\n"}, d2 = {"Lcom/akita/compose/foundation/p;", "", "Landroidx/compose/ui/graphics/T;", FontStyleKt.LIGHT, "dark", "<init>", "(JJLkotlin/jvm/internal/w;)V", "color", "(JLkotlin/jvm/internal/w;)V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class p {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f63635e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final p f63636f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final p f63637g;

    /* renamed from: a, reason: collision with root package name */
    public final long f63638a;

    /* renamed from: b, reason: collision with root package name */
    public final long f63639b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f63640c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63641d;

    /* compiled from: ThemeColor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/foundation/p$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        T.a aVar = T.f39320b;
        aVar.getClass();
        f63636f = q.a(T.f39330l);
        aVar.getClass();
        f63637g = q.a(T.f39329k);
    }

    public p(long j12, long j13, C42822w c42822w) {
        this.f63638a = j12;
        this.f63639b = j13;
        this.f63640c = j12 == 16 && j13 == 16;
        this.f63641d = (j12 == 16 && j13 == 16) ? false : true;
    }

    @Y61.k
    public final p a(float f12) {
        return new p(T.c(this.f63638a, f12), T.c(this.f63639b, f12), null);
    }

    public final long b(boolean z12) {
        if (z12) {
            return this.f63639b;
        }
        if (z12) {
            throw new NoWhenBranchMatchedException();
        }
        return this.f63638a;
    }

    @InterfaceC22132o
    public final long c(@Y61.l A a12) {
        a12.C(692846991);
        long jB2 = b(((Boolean) a12.o(b.f63571a)).booleanValue());
        a12.h();
        return jB2;
    }

    @Y61.k
    public final p d(@Y61.l p pVar) {
        if (pVar == null) {
            return this;
        }
        long j12 = pVar.f63638a;
        if (j12 == 16) {
            j12 = this.f63638a;
        }
        long j13 = j12;
        long j14 = pVar.f63639b;
        if (j14 == 16) {
            j14 = this.f63639b;
        }
        return new p(j13, j14, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return T.d(this.f63638a, pVar.f63638a) && T.d(this.f63639b, pVar.f63639b);
    }

    public final int hashCode() {
        T.a aVar = T.f39320b;
        int i12 = w0.f410662c;
        return Long.hashCode(this.f63639b) + (Long.hashCode(this.f63638a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThemeColor(light=");
        H.z(this.f63638a, ", dark=", sb2);
        sb2.append((Object) T.j(this.f63639b));
        sb2.append(')');
        return sb2.toString();
    }

    public p(long j12, C42822w c42822w) {
        this(j12, j12, null);
    }
}
