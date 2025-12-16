package com.avito.android.remote.user_adverts.generated.api.profile_items_api_v_13;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ProfileItemsApiV13Response.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001\u0018B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertCpxPromo;", "", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertCpxPromo$Color;", "color", "Lcom/avito/android/remote/model/Image;", "icon", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertCpxPromo$Color;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertCpxPromo$Color;", "a", "()Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertCpxPromo$Color;", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Color", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserAdvertCpxPromo {

    @c("color")
    @k
    private final Color color;

    @c("icon")
    @k
    private final Image icon;

    @c("text")
    @k
    private final String text;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileItemsApiV13Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/user_adverts/generated/api/profile_items_api_v_13/UserAdvertCpxPromo$Color;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Gray", "Green", "Yellow", "Red", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Color {

        @c("gray")
        public static final Color Gray;

        @c("green")
        public static final Color Green;

        @c("red")
        public static final Color Red;

        @c("yellow")
        public static final Color Yellow;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Color[] f254377b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f254378c;

        static {
            Color color = new Color("Gray", 0, "gray");
            Gray = color;
            Color color2 = new Color("Green", 1, "green");
            Green = color2;
            Color color3 = new Color("Yellow", 2, "yellow");
            Yellow = color3;
            Color color4 = new Color("Red", 3, "red");
            Red = color4;
            Color[] colorArr = {color, color2, color3, color4};
            f254377b = colorArr;
            f254378c = kotlin.enums.c.a(colorArr);
        }

        private Color(String str, int i12, String str2) {
        }

        public static Color valueOf(String str) {
            return (Color) Enum.valueOf(Color.class, str);
        }

        public static Color[] values() {
            return (Color[]) f254377b.clone();
        }
    }

    public UserAdvertCpxPromo(@k Color color, @k Image image, @k String str, @l DeepLink deepLink) {
        this.color = color;
        this.icon = image;
        this.text = str;
        this.uri = deepLink;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Color getColor() {
        return this.color;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Image getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
