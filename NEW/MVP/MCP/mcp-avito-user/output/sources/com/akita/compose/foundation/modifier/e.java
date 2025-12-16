package com.akita.compose.foundation.modifier;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.akita.compose.foundation.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Shadow.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/akita/compose/foundation/modifier/e;", "", "Landroidx/compose/ui/unit/h;", "dx", "dy", "blur", "Lcom/akita/compose/foundation/p;", "color", "<init>", "(FFFLcom/akita/compose/foundation/p;Lkotlin/jvm/internal/w;)V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f63615e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final e f63616f = new e(0.0f, 0.0f, 0.0f, null, 15, null);

    /* renamed from: a, reason: collision with root package name */
    public final float f63617a;

    /* renamed from: b, reason: collision with root package name */
    public final float f63618b;

    /* renamed from: c, reason: collision with root package name */
    public final float f63619c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final p f63620d;

    /* compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/foundation/modifier/e$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e(float f12, float f13, float f14, p pVar, int i12, C42822w c42822w) {
        float f15 = (i12 & 1) != 0 ? d.f63611a : f12;
        float f16 = (i12 & 2) != 0 ? d.f63611a : f13;
        float f17 = (i12 & 4) != 0 ? d.f63611a : f14;
        if ((i12 & 8) != 0) {
            p.f63635e.getClass();
            pVar = p.f63637g;
        }
        this(f15, f16, f17, pVar, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.b(this.f63617a, eVar.f63617a) && h.b(this.f63618b, eVar.f63618b) && h.b(this.f63619c, eVar.f63619c) && L.f(this.f63620d, eVar.f63620d);
    }

    public final int hashCode() {
        h.a aVar = h.f42849c;
        return this.f63620d.hashCode() + r.d(this.f63619c, r.d(this.f63618b, Float.hashCode(this.f63617a) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowParams(dx=");
        H.u(this.f63617a, ", dy=", sb2);
        H.u(this.f63618b, ", blur=", sb2);
        H.u(this.f63619c, ", color=", sb2);
        sb2.append(this.f63620d);
        sb2.append(')');
        return sb2.toString();
    }

    public e(float f12, float f13, float f14, p pVar, C42822w c42822w) {
        this.f63617a = f12;
        this.f63618b = f13;
        this.f63619c = f14;
        this.f63620d = pVar;
    }
}
