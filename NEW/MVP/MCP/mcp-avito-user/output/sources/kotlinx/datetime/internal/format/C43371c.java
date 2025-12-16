package kotlinx.datetime.internal.format;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: FormatStructure.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/c;", "T", "Lkotlinx/datetime/internal/format/t;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.datetime.internal.format.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43371c<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f412516a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f412517b;

    public C43371c(@Y61.k h hVar, @Y61.k ArrayList arrayList) {
        this.f412516a = hVar;
        this.f412517b = arrayList;
    }

    @Override // kotlinx.datetime.internal.format.o
    @Y61.k
    public final J51.e<T> b() {
        return this.f412516a.b();
    }

    @Override // kotlinx.datetime.internal.format.o
    @Y61.k
    public final kotlinx.datetime.internal.format.parser.v<T> c() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        kotlin.collections.builders.b bVarT = C42745f0.t();
        bVarT.add(this.f412516a.c());
        Iterator it = this.f412517b.iterator();
        while (it.hasNext()) {
            bVarT.add(((o) it.next()).c());
        }
        return new kotlinx.datetime.internal.format.parser.v<>(c42784z0, C42745f0.p(bVarT));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof C43371c) {
            C43371c c43371c = (C43371c) obj;
            if (this.f412516a.equals(c43371c.f412516a) && this.f412517b.equals(c43371c.f412517b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f412517b.hashCode() + (this.f412516a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("AlternativesParsing("), this.f412517b, ')');
    }
}
