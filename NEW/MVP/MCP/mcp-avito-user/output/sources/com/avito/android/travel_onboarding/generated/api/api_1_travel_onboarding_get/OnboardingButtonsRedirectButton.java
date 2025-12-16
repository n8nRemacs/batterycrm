package com.avito.android.travel_onboarding.generated.api.api_1_travel_onboarding_get;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api1TravelOnboardingGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsRedirectButton;", "", "", "analyticsActionType", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "subtitle", "title", "Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsRedirectButton$Type;", "type", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsRedirectButton$Type;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "c", "d", "Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsRedirectButton$Type;", "e", "()Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsRedirectButton$Type;", "Type", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OnboardingButtonsRedirectButton {

    @c("analyticsActionType")
    @k
    private final String analyticsActionType;

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1TravelOnboardingGetResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/travel_onboarding/generated/api/api_1_travel_onboarding_get/OnboardingButtonsRedirectButton$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Primary", "Secondary", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("primary")
        public static final Type Primary;

        @c("secondary")
        public static final Type Secondary;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f302281b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f302282c;

        static {
            Type type = new Type("Primary", 0, "primary");
            Primary = type;
            Type type2 = new Type("Secondary", 1, "secondary");
            Secondary = type2;
            Type[] typeArr = {type, type2};
            f302281b = typeArr;
            f302282c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f302281b.clone();
        }
    }

    public OnboardingButtonsRedirectButton(@k String str, @k DeepLink deepLink, @l String str2, @k String str3, @k Type type) {
        this.analyticsActionType = str;
        this.deeplink = deepLink;
        this.subtitle = str2;
        this.title = str3;
        this.type = type;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getAnalyticsActionType() {
        return this.analyticsActionType;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
