package com.avito.android.rating.generated.api.api_11_profile_ratings_get;

import Hg0.C13988a;
import Hg0.z;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$a;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$b;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$c;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$d;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$e;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$f;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$g;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$h;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$i;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$j;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$k;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$l;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$a;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "LHg0/i;", "lengthValidation", "", "title", "<init>", "(LHg0/i;Ljava/lang/String;)V", "LHg0/i;", "a", "()LHg0/i;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        @com.google.gson.annotations.c("lengthValidation")
        @Y61.l
        private final Hg0.i lengthValidation;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public a(@Y61.l Hg0.i iVar, @Y61.k String str) {
            this.lengthValidation = iVar;
            this.title = str;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final Hg0.i getLengthValidation() {
            return this.lengthValidation;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$b;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "", "actions", "Lcom/avito/android/deep_linking/links/DeepLink;", "analyticsAction", "", "header", "title", "<init>", "(Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.generated.api.api_11_profile_ratings_get.b$b, reason: collision with other inner class name */
    public static final class C7426b implements b {

        @com.google.gson.annotations.c("actions")
        @Y61.k
        private final List<b> actions;

        @com.google.gson.annotations.c("analyticsAction")
        @Y61.l
        private final DeepLink analyticsAction;

        @com.google.gson.annotations.c("header")
        @Y61.l
        private final String header;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public C7426b(@Y61.k List<? extends b> list, @Y61.l DeepLink deepLink, @Y61.l String str, @Y61.k String str2) {
            this.actions = list;
            this.analyticsAction = deepLink;
            this.header = str;
            this.title = str2;
        }

        @Y61.k
        public final List<b> a() {
            return this.actions;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final DeepLink getAnalyticsAction() {
            return this.analyticsAction;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$c;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "LHg0/h;", "buttons", "Lcom/avito/android/remote/model/text/AttributedText;", "content", "", "title", "<init>", "(LHg0/h;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "LHg0/h;", "a", "()LHg0/h;", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        @com.google.gson.annotations.c("buttons")
        @Y61.k
        private final Hg0.h buttons;

        @com.google.gson.annotations.c("content")
        @Y61.l
        private final AttributedText content;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public c(@Y61.k Hg0.h hVar, @Y61.l AttributedText attributedText, @Y61.k String str) {
            this.buttons = hVar;
            this.content = attributedText;
            this.title = str;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final Hg0.h getButtons() {
            return this.buttons;
        }

        @Y61.l
        /* renamed from: b, reason: from getter */
        public final AttributedText getContent() {
            return this.content;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$d;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements b {

        @com.google.gson.annotations.c("link")
        @Y61.k
        private final DeepLink link;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public d(@Y61.k DeepLink deepLink, @Y61.k String str) {
            this.link = deepLink;
            this.title = str;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final DeepLink getLink() {
            return this.link;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B0\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR+\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$e;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "", "", "", "LX41/o;", "params", "title", "urlPath", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements b {

        @com.google.gson.annotations.c("params")
        @Y61.k
        private final Map<String, Object> params;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        @com.google.gson.annotations.c("urlPath")
        @Y61.k
        private final String urlPath;

        public e(@Y61.k Map<String, Object> map, @Y61.k String str, @Y61.k String str2) {
            this.params = map;
            this.title = str;
            this.urlPath = str2;
        }

        @Y61.k
        public final Map<String, Object> a() {
            return this.params;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getUrlPath() {
            return this.urlPath;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$f;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "", "title", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements b {

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public f(@Y61.k String str) {
            this.title = str;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B:\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0004\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR+\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$g;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "LHg0/a;", "confirmDialog", "", "", "", "LX41/o;", "params", "requestUrl", "title", "<init>", "(LHg0/a;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "LHg0/a;", "a", "()LHg0/a;", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "Ljava/lang/String;", "getRequestUrl", "()Ljava/lang/String;", "c", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements b {

        @com.google.gson.annotations.c("confirmDialog")
        @Y61.l
        private final C13988a confirmDialog;

        @com.google.gson.annotations.c("params")
        @Y61.k
        private final Map<String, Object> params;

        @com.google.gson.annotations.c("requestUrl")
        @Y61.k
        private final String requestUrl;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public g(@Y61.l C13988a c13988a, @Y61.k Map<String, Object> map, @Y61.k String str, @Y61.k String str2) {
            this.confirmDialog = c13988a;
            this.params = map;
            this.requestUrl = str;
            this.title = str2;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final C13988a getConfirmDialog() {
            return this.confirmDialog;
        }

        @Y61.k
        public final Map<String, Object> b() {
            return this.params;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B0\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR+\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$h;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "", "", "", "LX41/o;", "params", "requestUrl", "title", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "Ljava/lang/String;", "getRequestUrl", "()Ljava/lang/String;", "getTitle", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements b {

        @com.google.gson.annotations.c("params")
        @Y61.k
        private final Map<String, Object> params;

        @com.google.gson.annotations.c("requestUrl")
        @Y61.k
        private final String requestUrl;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public h(@Y61.k Map<String, Object> map, @Y61.k String str, @Y61.k String str2) {
            this.params = map;
            this.requestUrl = str;
            this.title = str2;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$i;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "LHg0/a;", "confirmDialog", "", "title", "<init>", "(LHg0/a;Ljava/lang/String;)V", "LHg0/a;", "a", "()LHg0/a;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements b {

        @com.google.gson.annotations.c("confirmDialog")
        @Y61.l
        private final C13988a confirmDialog;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        public i(@Y61.l C13988a c13988a, @Y61.k String str) {
            this.confirmDialog = c13988a;
            this.title = str;
        }

        @Y61.l
        /* renamed from: a, reason: from getter */
        public final C13988a getConfirmDialog() {
            return this.confirmDialog;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$j;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "LHg0/z;", "button", "", ChannelContext.Item.PLACEHOLDER, "title", "", "LHg0/i;", "validations", "<init>", "(LHg0/z;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "LHg0/z;", "a", "()LHg0/z;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements b {

        @com.google.gson.annotations.c("button")
        @Y61.k
        private final z button;

        @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
        @Y61.k
        private final String placeholder;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        @com.google.gson.annotations.c("validations")
        @Y61.k
        private final List<Hg0.i> validations;

        public j(@Y61.k z zVar, @Y61.k String str, @Y61.k String str2, @Y61.k List<Hg0.i> list) {
            this.button = zVar;
            this.placeholder = str;
            this.title = str2;
            this.validations = list;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final z getButton() {
            return this.button;
        }

        @Y61.k
        /* renamed from: b, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Y61.k
        public final List<Hg0.i> d() {
            return this.validations;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BR\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R-\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$k;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "", "header", "", "", "LX41/o;", "params", ChannelContext.Item.PLACEHOLDER, "title", "urlPath", "", "LHg0/i;", "validations", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getPlaceholder", "getTitle", "getUrlPath", "Ljava/util/List;", "getValidations", "()Ljava/util/List;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements b {

        @com.google.gson.annotations.c("header")
        @Y61.l
        private final String header;

        @com.google.gson.annotations.c("params")
        @Y61.l
        private final Map<String, Object> params;

        @com.google.gson.annotations.c(ChannelContext.Item.PLACEHOLDER)
        @Y61.k
        private final String placeholder;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        @com.google.gson.annotations.c("urlPath")
        @Y61.k
        private final String urlPath;

        @com.google.gson.annotations.c("validations")
        @Y61.k
        private final List<Hg0.i> validations;

        public k(@Y61.l String str, @Y61.l Map<String, Object> map, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k List<Hg0.i> list) {
            this.header = str;
            this.params = map;
            this.placeholder = str2;
            this.title = str3;
            this.urlPath = str4;
            this.validations = list;
        }
    }

    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b$l;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f247590a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 97488510;
        }

        @Y61.k
        public final String toString() {
            return "Unknown";
        }
    }
}
