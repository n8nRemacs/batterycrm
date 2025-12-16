package com.google.accompanist.placeholder;

import androidx.compose.animation.core.C20278f0;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.k1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.w0;

/* compiled from: PlaceholderHighlight.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/google/accompanist/placeholder/a;", "Lcom/google/accompanist/placeholder/c;", "Landroidx/compose/ui/graphics/T;", "highlightColor", "Landroidx/compose/animation/core/f0;", "", "animationSpec", "<init>", "(JLandroidx/compose/animation/core/f0;Lkotlin/jvm/internal/w;)V", "placeholder_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class a implements c {

    /* renamed from: b, reason: collision with root package name */
    public final long f342880b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C20278f0<Float> f342881c;

    public a() {
        throw null;
    }

    public a(long j12, C20278f0 c20278f0, C42822w c42822w) {
        this.f342880b = j12;
        this.f342881c = c20278f0;
        new k1(j12, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return T.d(this.f342880b, aVar.f342880b) && L.f(this.f342881c, aVar.f342881c);
    }

    public final int hashCode() {
        T.a aVar = T.f39320b;
        int i12 = w0.f410662c;
        return this.f342881c.hashCode() + (Long.hashCode(this.f342880b) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Fade(highlightColor=");
        H.z(this.f342880b, ", animationSpec=", sb2);
        sb2.append(this.f342881c);
        sb2.append(')');
        return sb2.toString();
    }
}
