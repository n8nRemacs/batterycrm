package com.avito.android.rating_form.custom_params;

import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectItemParamsProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/custom_params/j;", "", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final a f248021a;

    /* compiled from: SelectItemParamsProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/custom_params/j$a;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f248022a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f248023b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Image f248024c;

        public a(@Y61.l String str, @Y61.l String str2, @Y61.l Image image) {
            this.f248022a = str;
            this.f248023b = str2;
            this.f248024c = image;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f248022a, aVar.f248022a) && L.f(this.f248023b, aVar.f248023b) && L.f(this.f248024c, aVar.f248024c);
        }

        public final int hashCode() {
            String str = this.f248022a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f248023b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Image image = this.f248024c;
            return iHashCode2 + (image != null ? image.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ComponentData(title=");
            sb2.append(this.f248022a);
            sb2.append(", price=");
            sb2.append(this.f248023b);
            sb2.append(", image=");
            return AK.c.o(sb2, this.f248024c, ')');
        }
    }

    public j(@Y61.l a aVar) {
        this.f248021a = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && L.f(this.f248021a, ((j) obj).f248021a);
    }

    public final int hashCode() {
        a aVar = this.f248021a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "SelectItemParams(componentData=" + this.f248021a + ')';
    }
}
