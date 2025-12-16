package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.F3;
import androidx.compose.ui.graphics.T;
import com.avito.android.remote.model.text.FontStyleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.w0;

/* compiled from: ComposeThemeColor.kt */
@F3
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/render/compose/j;", "", "Landroidx/compose/ui/graphics/T;", FontStyleKt.LIGHT, "dark", "<init>", "(JJLkotlin/jvm/internal/w;)V", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f338078a;

    /* renamed from: b, reason: collision with root package name */
    public final long f338079b;

    public j(long j12, long j13, C42822w c42822w) {
        this.f338078a = j12;
        this.f338079b = j13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return T.d(this.f338078a, jVar.f338078a) && T.d(this.f338079b, jVar.f338079b);
    }

    public final int hashCode() {
        T.a aVar = T.f39320b;
        int i12 = w0.f410662c;
        return Long.hashCode(this.f338079b) + (Long.hashCode(this.f338078a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComposeThemeColor(light=");
        androidx.compose.foundation.H.z(this.f338078a, ", dark=", sb2);
        sb2.append((Object) T.j(this.f338079b));
        sb2.append(')');
        return sb2.toString();
    }
}
