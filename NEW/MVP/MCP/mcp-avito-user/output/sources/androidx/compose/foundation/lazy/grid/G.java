package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.AbstractC20735o;
import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: LazyGridIntervalContent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/G;", "Landroidx/compose/foundation/lazy/layout/o$a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G implements AbstractC20735o.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Integer, Object> f28991a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Z, Integer, C20664c> f28992b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, Object> f28993c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C22096n f28994d;

    public G(@Y61.l Y41.l lVar, @Y61.k Y41.p pVar, @Y61.k Y41.l lVar2, @Y61.k C22096n c22096n) {
        this.f28991a = lVar;
        this.f28992b = pVar;
        this.f28993c = lVar2;
        this.f28994d = c22096n;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC20735o.a
    @Y61.l
    public final Y41.l<Integer, Object> getKey() {
        return this.f28991a;
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC20735o.a
    @Y61.k
    public final Y41.l<Integer, Object> getType() {
        return this.f28993c;
    }
}
