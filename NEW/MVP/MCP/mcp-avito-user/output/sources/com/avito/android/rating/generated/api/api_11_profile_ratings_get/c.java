package com.avito.android.rating.generated.api.api_11_profile_ratings_get;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c;", "", "a", "b", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c$a;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c$b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c {

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c$a;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c;", "Lcom/avito/android/remote/model/Image;", "api", "<init>", "(Lcom/avito/android/remote/model/Image;)V", "Lcom/avito/android/remote/model/Image;", "a", "()Lcom/avito/android/remote/model/Image;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        @com.google.gson.annotations.c("api")
        @k
        private final Image api;

        public a(@k Image image) {
            this.api = image;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final Image getApi() {
            return this.api;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.api, ((a) obj).api);
        }

        public final int hashCode() {
            return this.api.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.o(new StringBuilder("Api(api="), this.api, ')');
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c$b;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/c;", "", "web", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        @com.google.gson.annotations.c("web")
        @k
        private final String web;

        public b(@k String str) {
            this.web = str;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final String getWeb() {
            return this.web;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.web, ((b) obj).web);
        }

        public final int hashCode() {
            return this.web.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Web(web="), this.web, ')');
        }
    }
}
