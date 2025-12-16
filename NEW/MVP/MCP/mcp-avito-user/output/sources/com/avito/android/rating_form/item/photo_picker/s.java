package com.avito.android.rating_form.item.photo_picker;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingSellerFormImageUploadParamsStorage.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/s;", "Lcom/avito/android/rating_form/item/photo_picker/r;", "<init>", "()V", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f248559a = new LinkedHashMap();

    /* compiled from: RatingSellerFormImageUploadParamsStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/s$a;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f248560a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Map<String, Object> f248561b;

        public a(@Y61.k String str, @Y61.k Map<String, ? extends Object> map) {
            this.f248560a = str;
            this.f248561b = map;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f248560a, aVar.f248560a) && L.f(this.f248561b, aVar.f248561b);
        }

        public final int hashCode() {
            return this.f248561b.hashCode() + (this.f248560a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RatingFormImageUploadParams(fid=");
            sb2.append(this.f248560a);
            sb2.append(", customParams=");
            return androidx.appcompat.app.r.w(sb2, this.f248561b, ')');
        }
    }

    @Inject
    public s() {
    }

    @Override // com.avito.android.rating_form.item.photo_picker.r
    public final void a(@Y61.k String str, @Y61.k String str2, @Y61.k Map<String, ? extends Object> map) {
        this.f248559a.put(str, new a(str2, map));
    }

    @Override // com.avito.android.rating_form.item.photo_picker.r
    @Y61.l
    public final a b(@Y61.k String str) {
        return (a) this.f248559a.get(str);
    }
}
