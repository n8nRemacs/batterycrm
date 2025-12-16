package com.avito.android.bxcontent.mvi.entity;

import androidx.compose.foundation.H;
import com.avito.android.serp.adapter.l1;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/s;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class s {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f112419b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final s f112420c = new s(P0.c());

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f112421a;

    /* compiled from: BxContentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/s$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static s a() {
            return s.f112420c;
        }

        public a() {
        }
    }

    public s(@Y61.k Map<String, ? extends List<? extends l1>> map) {
        this.f112421a = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.util.List<com.avito.android.serp.adapter.l1>>] */
    @Y61.k
    public final Map<String, List<l1>> a() {
        return this.f112421a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f112421a.equals(((s) obj).f112421a);
    }

    public final int hashCode() {
        return this.f112421a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.n(new StringBuilder("FeaturedWidgetState(tabNameToItems="), this.f112421a, ')');
    }
}
