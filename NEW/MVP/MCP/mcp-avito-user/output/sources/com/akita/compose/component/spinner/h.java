package com.akita.compose.component.spinner;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SpinnerStyle.kt */
@H0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/akita/compose/component/spinner/h;", "", "Landroidx/compose/ui/unit/h;", "size", "Lcom/akita/compose/foundation/p;", "tintColor", "lineThickness", "<init>", "(FLcom/akita/compose/foundation/p;FLkotlin/jvm/internal/w;)V", "a", "spinner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class h {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f62820d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final h f62821e;

    /* renamed from: a, reason: collision with root package name */
    public final float f62822a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f62823b;

    /* renamed from: c, reason: collision with root package name */
    public final float f62824c;

    /* compiled from: SpinnerStyle.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/spinner/h$a;", "", "<init>", "()V", "spinner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        aVar.getClass();
        float f12 = androidx.compose.ui.unit.h.f42851e;
        p.f63635e.getClass();
        p pVar = p.f63636f;
        aVar.getClass();
        f62821e = new h(f12, pVar, f12, null);
    }

    public h(float f12, p pVar, float f13, C42822w c42822w) {
        this.f62822a = f12;
        this.f62823b = pVar;
        this.f62824c = f13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return androidx.compose.ui.unit.h.b(this.f62822a, hVar.f62822a) && L.f(this.f62823b, hVar.f62823b) && androidx.compose.ui.unit.h.b(this.f62824c, hVar.f62824c);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f62824c) + s.b(this.f62823b, Float.hashCode(this.f62822a) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpinnerStyle(size=");
        H.u(this.f62822a, ", tintColor=", sb2);
        sb2.append(this.f62823b);
        sb2.append(", lineThickness=");
        return H.h(')', this.f62824c, sb2);
    }
}
