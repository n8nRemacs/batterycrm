package com.avito.android.developments_catalog.residential_complex_search.mvi;

import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ResidentialComplexState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/o;", "", "a", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f139232b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final o f139233c = new o(new UV0.c(C42784z0.f406748b));

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final UV0.c<TV0.a> f139234a;

    /* compiled from: ResidentialComplexState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/o$a;", "", "<init>", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public o(@Y61.k UV0.c<TV0.a> cVar) {
        this.f139234a = cVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && L.f(this.f139234a, ((o) obj).f139234a);
    }

    public final int hashCode() {
        return this.f139234a.f16399b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "ResidentialComplexViewState(suggestions=" + this.f139234a + ')';
    }
}
