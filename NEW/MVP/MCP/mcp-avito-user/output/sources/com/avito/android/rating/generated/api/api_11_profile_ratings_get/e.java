package com.avito.android.rating.generated.api.api_11_profile_ratings_get;

import Hg0.y;
import Y61.k;
import Y61.l;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/e;", "", "a", "b", "c", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/e$a;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/e$b;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/e$c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface e {

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/e$a;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/e;", "", "analyticsParamName", "label", "paramName", "", "selected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e {

        @com.google.gson.annotations.c("analyticsParamName")
        @l
        private final String analyticsParamName;

        @com.google.gson.annotations.c("label")
        @k
        private final String label;

        @com.google.gson.annotations.c("paramName")
        @k
        private final String paramName;

        @com.google.gson.annotations.c("selected")
        @l
        private final Boolean selected;

        public a(@l String str, @k String str2, @k String str3, @l Boolean bool) {
            this.analyticsParamName = str;
            this.label = str2;
            this.paramName = str3;
            this.selected = bool;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getAnalyticsParamName() {
            return this.analyticsParamName;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getParamName() {
            return this.paramName;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Boolean getSelected() {
            return this.selected;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/e$b;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/e;", "", "analyticsParamName", "", "LHg0/y;", "options", "paramName", "selectedOption", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "d", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements e {

        @com.google.gson.annotations.c("analyticsParamName")
        @l
        private final String analyticsParamName;

        @com.google.gson.annotations.c("options")
        @k
        private final List<y> options;

        @com.google.gson.annotations.c("paramName")
        @k
        private final String paramName;

        @com.google.gson.annotations.c("selectedOption")
        @l
        private final String selectedOption;

        public b(@l String str, @k List<y> list, @k String str2, @l String str3) {
            this.analyticsParamName = str;
            this.options = list;
            this.paramName = str2;
            this.selectedOption = str3;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getAnalyticsParamName() {
            return this.analyticsParamName;
        }

        @k
        public final List<y> b() {
            return this.options;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getParamName() {
            return this.paramName;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getSelectedOption() {
            return this.selectedOption;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/e$c;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/e;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f247593a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 508350440;
        }

        @k
        public final String toString() {
            return "Unknown";
        }
    }
}
