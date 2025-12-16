package com.avito.android.rating_form.custom_params;

import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectParamsProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/custom_params/m;", "", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final a f248027a;

    /* compiled from: SelectParamsProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/custom_params/m$a;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Boolean f248028a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f248029b;

        public a(@Y61.l Integer num, @Y61.l Boolean bool) {
            this.f248028a = bool;
            this.f248029b = num;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f248028a, aVar.f248028a) && L.f(this.f248029b, aVar.f248029b);
        }

        public final int hashCode() {
            Boolean bool = this.f248028a;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Integer num = this.f248029b;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchInfo(disabled=");
            sb2.append(this.f248028a);
            sb2.append(", showAt=");
            return s.j(sb2, this.f248029b, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && L.f(this.f248027a, ((m) obj).f248027a);
    }

    public final int hashCode() {
        a aVar = this.f248027a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "SelectParams(searchInfo=" + this.f248027a + ')';
    }

    public m(@Y61.l a aVar) {
        this.f248027a = aVar;
    }

    public /* synthetic */ m(a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : aVar);
    }
}
