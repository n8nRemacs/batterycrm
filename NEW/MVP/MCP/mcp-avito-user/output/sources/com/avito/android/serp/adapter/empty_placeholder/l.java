package com.avito.android.serp.adapter.empty_placeholder;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmptyPlaceholderItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/empty_placeholder/l;", "LTV0/e;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface l extends TV0.e {

    /* compiled from: EmptyPlaceholderItemView.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/empty_placeholder/l$a;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f269915a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Y41.a<G0> f269916b;

        public a(@Y61.k String str, @Y61.l Y41.a<G0> aVar) {
            this.f269915a = str;
            this.f269916b = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f269915a, aVar.f269915a) && L.f(this.f269916b, aVar.f269916b);
        }

        public final int hashCode() {
            int iHashCode = this.f269915a.hashCode() * 31;
            Y41.a<G0> aVar = this.f269916b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(text=");
            sb2.append(this.f269915a);
            sb2.append(", listener=");
            return r.v(sb2, this.f269916b, ')');
        }
    }

    /* compiled from: EmptyPlaceholderItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    void f(@Y61.k String str);

    void h2(@Y61.k List<a> list);

    void setTitle(@Y61.k String str);
}
