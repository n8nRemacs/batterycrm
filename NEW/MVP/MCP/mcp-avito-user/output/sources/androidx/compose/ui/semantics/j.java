package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SemanticsProperties.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/j;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Float> f41754a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Float> f41755b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41756c;

    public j(@Y61.k Y41.a<Float> aVar, @Y61.k Y41.a<Float> aVar2, boolean z12) {
        this.f41754a = aVar;
        this.f41755b = aVar2;
        this.f41756c = z12;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollAxisRange(value=");
        sb2.append(this.f41754a.invoke().floatValue());
        sb2.append(", maxValue=");
        sb2.append(this.f41755b.invoke().floatValue());
        sb2.append(", reverseScrolling=");
        return androidx.appcompat.app.r.x(sb2, this.f41756c, ')');
    }

    public /* synthetic */ j(Y41.a aVar, Y41.a aVar2, boolean z12, int i12, C42822w c42822w) {
        this(aVar, aVar2, (i12 & 4) != 0 ? false : z12);
    }
}
