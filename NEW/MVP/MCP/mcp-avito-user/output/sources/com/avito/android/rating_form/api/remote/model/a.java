package com.avito.android.rating_form.api.remote.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormCommand.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lcom/avito/android/rating_form/api/remote/model/a$a;", "Lcom/avito/android/rating_form/api/remote/model/a$b;", "Lcom/avito/android/rating_form/api/remote/model/a$c;", "Lcom/avito/android/rating_form/api/remote/model/a$d;", "Lcom/avito/android/rating_form/api/remote/model/a$e;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class a {

    /* compiled from: RatingFormCommand.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0097D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$a;", "Lcom/avito/android/rating_form/api/remote/model/a;", "Lcom/avito/android/rating_form/api/remote/model/a$a$a;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/a$a$a;)V", "Lcom/avito/android/rating_form/api/remote/model/a$a$a;", "getData", "()Lcom/avito/android/rating_form/api/remote/model/a$a$a;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating_form.api.remote.model.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7446a extends a {

        @com.google.gson.annotations.c("data")
        @k
        private final C7447a data;

        @com.google.gson.annotations.c("name")
        @k
        private final String name;

        /* compiled from: RatingFormCommand.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$a$a;", "", "", "stepId", "", "stepSlug", "<init>", "(ILjava/lang/String;)V", "I", "getStepId", "()I", "Ljava/lang/String;", "getStepSlug", "()Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating_form.api.remote.model.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C7447a {

            @com.google.gson.annotations.c("stepId")
            private final int stepId;

            @com.google.gson.annotations.c("stepSlug")
            @l
            private final String stepSlug;

            public C7447a(int i12, @l String str) {
                this.stepId = i12;
                this.stepSlug = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7447a)) {
                    return false;
                }
                C7447a c7447a = (C7447a) obj;
                return this.stepId == c7447a.stepId && L.f(this.stepSlug, c7447a.stepSlug);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.stepId) * 31;
                String str = this.stepSlug;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FinishStepData(stepId=");
                sb2.append(this.stepId);
                sb2.append(", stepSlug=");
                return C22026a.c(sb2, this.stepSlug, ')');
            }
        }

        public C7446a(@k C7447a c7447a) {
            super(null);
            this.data = c7447a;
            this.name = "finishStep";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C7446a) && L.f(this.data, ((C7446a) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        @k
        public final String toString() {
            return "FinishStep(data=" + this.data + ')';
        }
    }

    /* compiled from: RatingFormCommand.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$b;", "Lcom/avito/android/rating_form/api/remote/model/a;", "<init>", "()V", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "a", "b", "Lcom/avito/android/rating_form/api/remote/model/a$b$a;", "Lcom/avito/android/rating_form/api/remote/model/a$b$b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b extends a {

        @com.google.gson.annotations.c("name")
        @k
        private final String name;

        /* compiled from: RatingFormCommand.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$b$a;", "Lcom/avito/android/rating_form/api/remote/model/a$b;", "Lcom/avito/android/rating_form/api/remote/model/a$b$a$a;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/a$b$a$a;)V", "Lcom/avito/android/rating_form/api/remote/model/a$b$a$a;", "getData", "()Lcom/avito/android/rating_form/api/remote/model/a$b$a$a;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating_form.api.remote.model.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C7448a extends b {

            @com.google.gson.annotations.c("data")
            @k
            private final C7449a data;

            /* compiled from: RatingFormCommand.kt */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$b$a$a;", "", "", "categoryId", "catalogId", "", "path", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;)V", "I", "getCategoryId", "()I", "Ljava/lang/Integer;", "getCatalogId", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.rating_form.api.remote.model.a$b$a$a, reason: collision with other inner class name */
            public static final /* data */ class C7449a {

                @com.google.gson.annotations.c("catalogId")
                @l
                private final Integer catalogId;

                @com.google.gson.annotations.c("categoryId")
                private final int categoryId;

                @com.google.gson.annotations.c("path")
                @l
                private final String path;

                public C7449a(int i12, @l Integer num, @l String str) {
                    this.categoryId = i12;
                    this.catalogId = num;
                    this.path = str;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C7449a)) {
                        return false;
                    }
                    C7449a c7449a = (C7449a) obj;
                    return this.categoryId == c7449a.categoryId && L.f(this.catalogId, c7449a.catalogId) && L.f(this.path, c7449a.path);
                }

                public final int hashCode() {
                    int iHashCode = Integer.hashCode(this.categoryId) * 31;
                    Integer num = this.catalogId;
                    int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                    String str = this.path;
                    return iHashCode2 + (str != null ? str.hashCode() : 0);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("NewModelData(categoryId=");
                    sb2.append(this.categoryId);
                    sb2.append(", catalogId=");
                    sb2.append(this.catalogId);
                    sb2.append(", path=");
                    return C22026a.c(sb2, this.path, ')');
                }
            }

            public C7448a(@k C7449a c7449a) {
                super(null);
                this.data = c7449a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7448a) && L.f(this.data, ((C7448a) obj).data);
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            @k
            public final String toString() {
                return "NewModel(data=" + this.data + ')';
            }
        }

        /* compiled from: RatingFormCommand.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$b$b;", "Lcom/avito/android/rating_form/api/remote/model/a$b;", "", "", "Ljava/io/Serializable;", "data", "<init>", "(Ljava/util/Map;)V", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating_form.api.remote.model.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C7450b extends b {

            @com.google.gson.annotations.c("data")
            @k
            private final Map<String, Serializable> data;

            /* JADX WARN: Multi-variable type inference failed */
            public C7450b(@k Map<String, ? extends Serializable> map) {
                super(null);
                this.data = map;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7450b) && L.f(this.data, ((C7450b) obj).data);
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            @k
            public final String toString() {
                return r.w(new StringBuilder("NewSellerData(data="), this.data, ')');
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        private b() {
            super(null);
            this.name = "new";
        }
    }

    /* compiled from: RatingFormCommand.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0097D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$c;", "Lcom/avito/android/rating_form/api/remote/model/a;", "Lcom/avito/android/rating_form/api/remote/model/a$c$a;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/a$c$a;)V", "Lcom/avito/android/rating_form/api/remote/model/a$c$a;", "a", "()Lcom/avito/android/rating_form/api/remote/model/a$c$a;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends a {

        @com.google.gson.annotations.c("data")
        @k
        private final C7451a data;

        @com.google.gson.annotations.c("name")
        @k
        private final String name;

        /* compiled from: RatingFormCommand.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$c$a;", "", "", "score", "<init>", "(J)V", "J", "a", "()J", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating_form.api.remote.model.a$c$a, reason: collision with other inner class name */
        public static final /* data */ class C7451a {

            @com.google.gson.annotations.c("score")
            private final long score;

            public C7451a(long j12) {
                this.score = j12;
            }

            /* renamed from: a, reason: from getter */
            public final long getScore() {
                return this.score;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7451a) && this.score == ((C7451a) obj).score;
            }

            public final int hashCode() {
                return Long.hashCode(this.score);
            }

            @k
            public final String toString() {
                return r.u(new StringBuilder("ScoreData(score="), this.score, ')');
            }
        }

        public c(@k C7451a c7451a) {
            super(null);
            this.data = c7451a;
            this.name = "score";
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C7451a getData() {
            return this.data;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.data, ((c) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        @k
        public final String toString() {
            return "Score(data=" + this.data + ')';
        }
    }

    /* compiled from: RatingFormCommand.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0097D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$d;", "Lcom/avito/android/rating_form/api/remote/model/a;", "Lcom/avito/android/rating_form/api/remote/model/a$d$a;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/a$d$a;)V", "Lcom/avito/android/rating_form/api/remote/model/a$d$a;", "getData", "()Lcom/avito/android/rating_form/api/remote/model/a$d$a;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends a {

        @com.google.gson.annotations.c("data")
        @k
        private final C7452a data;

        @com.google.gson.annotations.c("name")
        @k
        private final String name;

        /* compiled from: RatingFormCommand.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$d$a;", "", "", "Lcom/avito/android/rating_form/api/remote/model/a$d$a$a;", "values", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating_form.api.remote.model.a$d$a, reason: collision with other inner class name */
        public static final /* data */ class C7452a {

            @com.google.gson.annotations.c("values")
            @k
            private final List<C7453a> values;

            /* compiled from: RatingFormCommand.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$d$a$a;", "", "", "path", "", "value", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Z", "getValue", "()Z", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.rating_form.api.remote.model.a$d$a$a, reason: collision with other inner class name */
            public static final /* data */ class C7453a {

                @com.google.gson.annotations.c("path")
                @k
                private final String path;

                @com.google.gson.annotations.c("value")
                private final boolean value;

                public C7453a(@k String str, boolean z12) {
                    this.path = str;
                    this.value = z12;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C7453a)) {
                        return false;
                    }
                    C7453a c7453a = (C7453a) obj;
                    return L.f(this.path, c7453a.path) && this.value == c7453a.value;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.value) + (this.path.hashCode() * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("UpdateStateValue(path=");
                    sb2.append(this.path);
                    sb2.append(", value=");
                    return r.x(sb2, this.value, ')');
                }
            }

            public C7452a(@k List<C7453a> list) {
                this.values = list;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7452a) && L.f(this.values, ((C7452a) obj).values);
            }

            public final int hashCode() {
                return this.values.hashCode();
            }

            @k
            public final String toString() {
                return H.p(new StringBuilder("UpdateStateData(values="), this.values, ')');
            }
        }

        public d(@k C7452a c7452a) {
            super(null);
            this.data = c7452a;
            this.name = "updateState";
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.data, ((d) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateState(data=" + this.data + ')';
        }
    }

    /* compiled from: RatingFormCommand.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0097D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$e;", "Lcom/avito/android/rating_form/api/remote/model/a;", "Lcom/avito/android/rating_form/api/remote/model/a$e$a;", "data", "<init>", "(Lcom/avito/android/rating_form/api/remote/model/a$e$a;)V", "Lcom/avito/android/rating_form/api/remote/model/a$e$a;", "a", "()Lcom/avito/android/rating_form/api/remote/model/a$e$a;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends a {

        @com.google.gson.annotations.c("data")
        @k
        private final AbstractC7454a data;

        @com.google.gson.annotations.c("name")
        @k
        private final String name;

        /* compiled from: RatingFormCommand.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$e$a;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lcom/avito/android/rating_form/api/remote/model/a$e$a$a;", "Lcom/avito/android/rating_form/api/remote/model/a$e$a$b;", "Lcom/avito/android/rating_form/api/remote/model/a$e$a$c;", "Lcom/avito/android/rating_form/api/remote/model/a$e$a$d;", "Lcom/avito/android/rating_form/api/remote/model/a$e$a$e;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.rating_form.api.remote.model.a$e$a, reason: collision with other inner class name */
        public static abstract class AbstractC7454a {

            /* compiled from: RatingFormCommand.kt */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$e$a$a;", "Lcom/avito/android/rating_form/api/remote/model/a$e$a;", "", "fieldId", "", "fieldSlug", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "dataType", "", "value", "<init>", "(ILjava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;Ljava/util/List;)V", "I", "a", "()I", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "getDataType", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.rating_form.api.remote.model.a$e$a$a, reason: collision with other inner class name */
            public static final /* data */ class C7455a extends AbstractC7454a {

                @com.google.gson.annotations.c("dataType")
                @k
                private final RatingFormField.DataType dataType;

                @com.google.gson.annotations.c("fieldId")
                private final int fieldId;

                @com.google.gson.annotations.c("fieldSlug")
                @k
                private final String fieldSlug;

                @com.google.gson.annotations.c("value")
                @k
                private final List<Integer> value;

                public C7455a(int i12, @k String str, @k RatingFormField.DataType dataType, @k List<Integer> list) {
                    super(null);
                    this.fieldId = i12;
                    this.fieldSlug = str;
                    this.dataType = dataType;
                    this.value = list;
                }

                @Override // com.avito.android.rating_form.api.remote.model.a.e.AbstractC7454a
                /* renamed from: a, reason: from getter */
                public final int getFieldId() {
                    return this.fieldId;
                }

                @Override // com.avito.android.rating_form.api.remote.model.a.e.AbstractC7454a
                @k
                /* renamed from: b, reason: from getter */
                public final String getFieldSlug() {
                    return this.fieldSlug;
                }

                @k
                public final List<Integer> c() {
                    return this.value;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C7455a)) {
                        return false;
                    }
                    C7455a c7455a = (C7455a) obj;
                    return this.fieldId == c7455a.fieldId && L.f(this.fieldSlug, c7455a.fieldSlug) && this.dataType == c7455a.dataType && L.f(this.value, c7455a.value);
                }

                public final int hashCode() {
                    return this.value.hashCode() + ((this.dataType.hashCode() + H.d(Integer.hashCode(this.fieldId) * 31, 31, this.fieldSlug)) * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("IntArrayValue(fieldId=");
                    sb2.append(this.fieldId);
                    sb2.append(", fieldSlug=");
                    sb2.append(this.fieldSlug);
                    sb2.append(", dataType=");
                    sb2.append(this.dataType);
                    sb2.append(", value=");
                    return H.p(sb2, this.value, ')');
                }
            }

            /* compiled from: RatingFormCommand.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$e$a$b;", "Lcom/avito/android/rating_form/api/remote/model/a$e$a;", "", "fieldId", "", "fieldSlug", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "dataType", "", "", "value", "<init>", "(ILjava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;Ljava/util/List;)V", "I", "a", "()I", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "getDataType", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.rating_form.api.remote.model.a$e$a$b */
            public static final /* data */ class b extends AbstractC7454a {

                @com.google.gson.annotations.c("dataType")
                @k
                private final RatingFormField.DataType dataType;

                @com.google.gson.annotations.c("fieldId")
                private final int fieldId;

                @com.google.gson.annotations.c("fieldSlug")
                @k
                private final String fieldSlug;

                @com.google.gson.annotations.c("value")
                @k
                private final List<Long> value;

                public b(int i12, @k String str, @k RatingFormField.DataType dataType, @k List<Long> list) {
                    super(null);
                    this.fieldId = i12;
                    this.fieldSlug = str;
                    this.dataType = dataType;
                    this.value = list;
                }

                @Override // com.avito.android.rating_form.api.remote.model.a.e.AbstractC7454a
                /* renamed from: a, reason: from getter */
                public final int getFieldId() {
                    return this.fieldId;
                }

                @Override // com.avito.android.rating_form.api.remote.model.a.e.AbstractC7454a
                @k
                /* renamed from: b, reason: from getter */
                public final String getFieldSlug() {
                    return this.fieldSlug;
                }

                @k
                public final List<Long> c() {
                    return this.value;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.fieldId == bVar.fieldId && L.f(this.fieldSlug, bVar.fieldSlug) && this.dataType == bVar.dataType && L.f(this.value, bVar.value);
                }

                public final int hashCode() {
                    return this.value.hashCode() + ((this.dataType.hashCode() + H.d(Integer.hashCode(this.fieldId) * 31, 31, this.fieldSlug)) * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("LongArrayValue(fieldId=");
                    sb2.append(this.fieldId);
                    sb2.append(", fieldSlug=");
                    sb2.append(this.fieldSlug);
                    sb2.append(", dataType=");
                    sb2.append(this.dataType);
                    sb2.append(", value=");
                    return H.p(sb2, this.value, ')');
                }
            }

            /* compiled from: RatingFormCommand.kt */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$e$a$c;", "Lcom/avito/android/rating_form/api/remote/model/a$e$a;", "", "fieldId", "", "fieldSlug", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "dataType", "", "value", "<init>", "(ILjava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;J)V", "I", "a", "()I", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "getDataType", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "J", "c", "()J", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.rating_form.api.remote.model.a$e$a$c */
            public static final /* data */ class c extends AbstractC7454a {

                @com.google.gson.annotations.c("dataType")
                @k
                private final RatingFormField.DataType dataType;

                @com.google.gson.annotations.c("fieldId")
                private final int fieldId;

                @com.google.gson.annotations.c("fieldSlug")
                @k
                private final String fieldSlug;

                @com.google.gson.annotations.c("value")
                private final long value;

                public c(int i12, @k String str, @k RatingFormField.DataType dataType, long j12) {
                    super(null);
                    this.fieldId = i12;
                    this.fieldSlug = str;
                    this.dataType = dataType;
                    this.value = j12;
                }

                @Override // com.avito.android.rating_form.api.remote.model.a.e.AbstractC7454a
                /* renamed from: a, reason: from getter */
                public final int getFieldId() {
                    return this.fieldId;
                }

                @Override // com.avito.android.rating_form.api.remote.model.a.e.AbstractC7454a
                @k
                /* renamed from: b, reason: from getter */
                public final String getFieldSlug() {
                    return this.fieldSlug;
                }

                /* renamed from: c, reason: from getter */
                public final long getValue() {
                    return this.value;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return this.fieldId == cVar.fieldId && L.f(this.fieldSlug, cVar.fieldSlug) && this.dataType == cVar.dataType && this.value == cVar.value;
                }

                public final int hashCode() {
                    return Long.hashCode(this.value) + ((this.dataType.hashCode() + H.d(Integer.hashCode(this.fieldId) * 31, 31, this.fieldSlug)) * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("LongValue(fieldId=");
                    sb2.append(this.fieldId);
                    sb2.append(", fieldSlug=");
                    sb2.append(this.fieldSlug);
                    sb2.append(", dataType=");
                    sb2.append(this.dataType);
                    sb2.append(", value=");
                    return r.u(sb2, this.value, ')');
                }
            }

            /* compiled from: RatingFormCommand.kt */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$e$a$d;", "Lcom/avito/android/rating_form/api/remote/model/a$e$a;", "", "fieldId", "", "fieldSlug", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "dataType", "", "value", "<init>", "(ILjava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;Ljava/util/List;)V", "I", "a", "()I", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "getDataType", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.rating_form.api.remote.model.a$e$a$d */
            public static final /* data */ class d extends AbstractC7454a {

                @com.google.gson.annotations.c("dataType")
                @k
                private final RatingFormField.DataType dataType;

                @com.google.gson.annotations.c("fieldId")
                private final int fieldId;

                @com.google.gson.annotations.c("fieldSlug")
                @k
                private final String fieldSlug;

                @com.google.gson.annotations.c("value")
                @k
                private final List<String> value;

                public d(int i12, @k String str, @k RatingFormField.DataType dataType, @k List<String> list) {
                    super(null);
                    this.fieldId = i12;
                    this.fieldSlug = str;
                    this.dataType = dataType;
                    this.value = list;
                }

                @Override // com.avito.android.rating_form.api.remote.model.a.e.AbstractC7454a
                /* renamed from: a, reason: from getter */
                public final int getFieldId() {
                    return this.fieldId;
                }

                @Override // com.avito.android.rating_form.api.remote.model.a.e.AbstractC7454a
                @k
                /* renamed from: b, reason: from getter */
                public final String getFieldSlug() {
                    return this.fieldSlug;
                }

                @k
                public final List<String> c() {
                    return this.value;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return this.fieldId == dVar.fieldId && L.f(this.fieldSlug, dVar.fieldSlug) && this.dataType == dVar.dataType && L.f(this.value, dVar.value);
                }

                public final int hashCode() {
                    return this.value.hashCode() + ((this.dataType.hashCode() + H.d(Integer.hashCode(this.fieldId) * 31, 31, this.fieldSlug)) * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("StringArrayValue(fieldId=");
                    sb2.append(this.fieldId);
                    sb2.append(", fieldSlug=");
                    sb2.append(this.fieldSlug);
                    sb2.append(", dataType=");
                    sb2.append(this.dataType);
                    sb2.append(", value=");
                    return H.p(sb2, this.value, ')');
                }
            }

            /* compiled from: RatingFormCommand.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/avito/android/rating_form/api/remote/model/a$e$a$e;", "Lcom/avito/android/rating_form/api/remote/model/a$e$a;", "", "fieldId", "", "fieldSlug", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "dataType", "value", "<init>", "(ILjava/lang/String;Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;Ljava/lang/String;)V", "I", "a", "()I", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "getDataType", "()Lcom/avito/android/rating_form/api/remote/model/RatingFormField$DataType;", "c", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.rating_form.api.remote.model.a$e$a$e, reason: collision with other inner class name */
            public static final /* data */ class C7456e extends AbstractC7454a {

                @com.google.gson.annotations.c("dataType")
                @k
                private final RatingFormField.DataType dataType;

                @com.google.gson.annotations.c("fieldId")
                private final int fieldId;

                @com.google.gson.annotations.c("fieldSlug")
                @k
                private final String fieldSlug;

                @com.google.gson.annotations.c("value")
                @k
                private final String value;

                public C7456e(int i12, @k String str, @k RatingFormField.DataType dataType, @k String str2) {
                    super(null);
                    this.fieldId = i12;
                    this.fieldSlug = str;
                    this.dataType = dataType;
                    this.value = str2;
                }

                @Override // com.avito.android.rating_form.api.remote.model.a.e.AbstractC7454a
                /* renamed from: a, reason: from getter */
                public final int getFieldId() {
                    return this.fieldId;
                }

                @Override // com.avito.android.rating_form.api.remote.model.a.e.AbstractC7454a
                @k
                /* renamed from: b, reason: from getter */
                public final String getFieldSlug() {
                    return this.fieldSlug;
                }

                @k
                /* renamed from: c, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C7456e)) {
                        return false;
                    }
                    C7456e c7456e = (C7456e) obj;
                    return this.fieldId == c7456e.fieldId && L.f(this.fieldSlug, c7456e.fieldSlug) && this.dataType == c7456e.dataType && L.f(this.value, c7456e.value);
                }

                public final int hashCode() {
                    return this.value.hashCode() + ((this.dataType.hashCode() + H.d(Integer.hashCode(this.fieldId) * 31, 31, this.fieldSlug)) * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("StringValue(fieldId=");
                    sb2.append(this.fieldId);
                    sb2.append(", fieldSlug=");
                    sb2.append(this.fieldSlug);
                    sb2.append(", dataType=");
                    sb2.append(this.dataType);
                    sb2.append(", value=");
                    return C22026a.c(sb2, this.value, ')');
                }
            }

            public /* synthetic */ AbstractC7454a(C42822w c42822w) {
                this();
            }

            /* renamed from: a */
            public abstract int getFieldId();

            @k
            /* renamed from: b */
            public abstract String getFieldSlug();

            private AbstractC7454a() {
            }
        }

        public e(@k AbstractC7454a abstractC7454a) {
            super(null);
            this.data = abstractC7454a;
            this.name = "value";
        }

        @k
        /* renamed from: a, reason: from getter */
        public final AbstractC7454a getData() {
            return this.data;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.data, ((e) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        @k
        public final String toString() {
            return "Value(data=" + this.data + ')';
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    private a() {
    }
}
