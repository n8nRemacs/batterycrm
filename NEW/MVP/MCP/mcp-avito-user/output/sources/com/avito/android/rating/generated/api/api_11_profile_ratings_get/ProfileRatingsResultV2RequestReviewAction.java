package com.avito.android.rating.generated.api.api_11_profile_ratings_get;

import Hg0.C;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: Api11ProfileRatingsGetResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0015B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ProfileRatingsResultV2RequestReviewAction;", "", "", "title", "LHg0/C;", "toast", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ProfileRatingsResultV2RequestReviewAction$Type;", "type", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;LHg0/C;Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ProfileRatingsResultV2RequestReviewAction$Type;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LHg0/C;", "getToast", "()LHg0/C;", "Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ProfileRatingsResultV2RequestReviewAction$Type;", "b", "()Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ProfileRatingsResultV2RequestReviewAction$Type;", "c", "Type", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileRatingsResultV2RequestReviewAction {

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("toast")
    @l
    private final C toast;

    @com.google.gson.annotations.c("type")
    @l
    private final Type type;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final String uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api11ProfileRatingsGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating/generated/api/api_11_profile_ratings_get/ProfileRatingsResultV2RequestReviewAction$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Reload", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @com.google.gson.annotations.c("reload")
        public static final Type Reload;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f247582c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f247583d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f247584b;

        static {
            Type type = new Type("Reload", 0, "reload");
            Reload = type;
            Type[] typeArr = {type};
            f247582c = typeArr;
            f247583d = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
            this.f247584b = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f247582c.clone();
        }
    }

    public ProfileRatingsResultV2RequestReviewAction(@k String str, @l C c12, @l Type type, @k String str2) {
        this.title = str;
        this.toast = c12;
        this.type = type;
        this.uri = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getUri() {
        return this.uri;
    }
}
