package com.avito.android.user_adverts_views_pub;

import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertItem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0017\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem;", "Lcom/avito/conveyor_item/a;", "LwJ0/f;", "a", "b", "c", "d", "e", "CpxPromoWidget", "g", "h", "i", "j", "k", "l", "RightAction", "m", "n", "o", "p", "Status", "q", "r", "s", "t", "u", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UserAdvertItem extends com.avito.conveyor_item.a, wJ0.f {

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$CpxPromoWidget;", "", "Color", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CpxPromoWidget {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Color f316639a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Image f316640b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f316641c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final DeepLink f316642d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UserAdvertItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$CpxPromoWidget$Color;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Color {

            /* renamed from: b, reason: collision with root package name */
            public static final Color f316643b;

            /* renamed from: c, reason: collision with root package name */
            public static final Color f316644c;

            /* renamed from: d, reason: collision with root package name */
            public static final Color f316645d;

            /* renamed from: e, reason: collision with root package name */
            public static final Color f316646e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ Color[] f316647f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f316648g;

            static {
                Color color = new Color("GRAY", 0);
                f316643b = color;
                Color color2 = new Color("GREEN", 1);
                f316644c = color2;
                Color color3 = new Color("YELLOW", 2);
                f316645d = color3;
                Color color4 = new Color("RED", 3);
                f316646e = color4;
                Color[] colorArr = {color, color2, color3, color4};
                f316647f = colorArr;
                f316648g = kotlin.enums.c.a(colorArr);
            }

            public Color() {
                throw null;
            }

            public static Color valueOf(String str) {
                return (Color) Enum.valueOf(Color.class, str);
            }

            public static Color[] values() {
                return (Color[]) f316647f.clone();
            }
        }

        public CpxPromoWidget(@Y61.k Color color, @Y61.k Image image, @Y61.k String str, @Y61.l DeepLink deepLink) {
            this.f316639a = color;
            this.f316640b = image;
            this.f316641c = str;
            this.f316642d = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CpxPromoWidget)) {
                return false;
            }
            CpxPromoWidget cpxPromoWidget = (CpxPromoWidget) obj;
            return this.f316639a == cpxPromoWidget.f316639a && L.f(this.f316640b, cpxPromoWidget.f316640b) && L.f(this.f316641c, cpxPromoWidget.f316641c) && L.f(this.f316642d, cpxPromoWidget.f316642d);
        }

        public final int hashCode() {
            int iD2 = H.d(com.avito.android.actions_sheet.a.g(this.f316640b, this.f316639a.hashCode() * 31, 31), 31, this.f316641c);
            DeepLink deepLink = this.f316642d;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CpxPromoWidget(color=");
            sb2.append(this.f316639a);
            sb2.append(", icon=");
            sb2.append(this.f316640b);
            sb2.append(", text=");
            sb2.append(this.f316641c);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f316642d, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction;", "", "Button", "a", "b", "Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction$Button;", "Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction$a;", "Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction$b;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RightAction {

        /* compiled from: UserAdvertItem.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction$Button;", "Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction;", "Style", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button implements RightAction {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f316649a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Style f316650b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final DeepLink f316651c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f316652d;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: UserAdvertItem.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction$Button$Style;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Style {

                /* renamed from: b, reason: collision with root package name */
                public static final Style f316653b;

                /* renamed from: c, reason: collision with root package name */
                public static final Style f316654c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ Style[] f316655d;

                /* renamed from: e, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f316656e;

                static {
                    Style style = new Style("Primary", 0);
                    f316653b = style;
                    Style style2 = new Style("Secondary", 1);
                    f316654c = style2;
                    Style[] styleArr = {style, style2};
                    f316655d = styleArr;
                    f316656e = kotlin.enums.c.a(styleArr);
                }

                public Style() {
                    throw null;
                }

                public static Style valueOf(String str) {
                    return (Style) Enum.valueOf(Style.class, str);
                }

                public static Style[] values() {
                    return (Style[]) f316655d.clone();
                }
            }

            public Button(@Y61.k String str, @Y61.k Style style, @Y61.k DeepLink deepLink, @Y61.k String str2) {
                this.f316649a = str;
                this.f316650b = style;
                this.f316651c = deepLink;
                this.f316652d = str2;
            }

            @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.RightAction
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final String getF316663d() {
                return this.f316652d;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return L.f(this.f316649a, button.f316649a) && this.f316650b == button.f316650b && L.f(this.f316651c, button.f316651c) && L.f(this.f316652d, button.f316652d);
            }

            @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.RightAction
            @Y61.k
            /* renamed from: getDeepLink, reason: from getter */
            public final DeepLink getF316658b() {
                return this.f316651c;
            }

            public final int hashCode() {
                return this.f316652d.hashCode() + com.avito.android.actions_sheet.a.e(this.f316651c, (this.f316650b.hashCode() + (this.f316649a.hashCode() * 31)) * 31, 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Button(title=");
                sb2.append(this.f316649a);
                sb2.append(", style=");
                sb2.append(this.f316650b);
                sb2.append(", deepLink=");
                sb2.append(this.f316651c);
                sb2.append(", actionSlug=");
                return C22026a.c(sb2, this.f316652d, ')');
            }
        }

        /* compiled from: UserAdvertItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction$a;", "Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements RightAction {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f316657a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f316658b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f316659c;

            public a(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k String str2) {
                this.f316657a = str;
                this.f316658b = deepLink;
                this.f316659c = str2;
            }

            @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.RightAction
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final String getF316663d() {
                return this.f316659c;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f316657a, aVar.f316657a) && L.f(this.f316658b, aVar.f316658b) && L.f(this.f316659c, aVar.f316659c);
            }

            @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.RightAction
            @Y61.k
            /* renamed from: getDeepLink, reason: from getter */
            public final DeepLink getF316658b() {
                return this.f316658b;
            }

            public final int hashCode() {
                return this.f316659c.hashCode() + com.avito.android.actions_sheet.a.e(this.f316658b, this.f316657a.hashCode() * 31, 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Icon(name=");
                sb2.append(this.f316657a);
                sb2.append(", deepLink=");
                sb2.append(this.f316658b);
                sb2.append(", actionSlug=");
                return C22026a.c(sb2, this.f316659c, ')');
            }
        }

        /* compiled from: UserAdvertItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction$b;", "Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$RightAction;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements RightAction {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f316660a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f316661b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f316662c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f316663d;

            public b(@Y61.k String str, @Y61.k String str2, boolean z12) {
                this.f316660a = str;
                this.f316661b = str2;
                this.f316662c = z12;
                this.f316663d = str2;
            }

            @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.RightAction
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final String getF316663d() {
                return this.f316663d;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f316660a, bVar.f316660a) && L.f(this.f316661b, bVar.f316661b) && this.f316662c == bVar.f316662c;
            }

            @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.RightAction
            @Y61.l
            /* renamed from: getDeepLink */
            public final DeepLink getF316658b() {
                return null;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f316662c) + H.d(this.f316660a.hashCode() * 31, 31, this.f316661b);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("More(name=");
                sb2.append(this.f316660a);
                sb2.append(", slug=");
                sb2.append(this.f316661b);
                sb2.append(", isLoading=");
                return androidx.appcompat.app.r.x(sb2, this.f316662c, ')');
            }
        }

        @Y61.k
        /* renamed from: a */
        String getF316663d();

        @Y61.l
        /* renamed from: getDeepLink */
        DeepLink getF316658b();
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$Status;", "", "Type", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Status {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316664a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UserAdvertItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$Status$Type;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final Type f316665b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Type[] f316666c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f316667d;

            static {
                Type type = new Type("Discount", 0);
                f316665b = type;
                Type[] typeArr = {type};
                f316666c = typeArr;
                f316667d = kotlin.enums.c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f316666c.clone();
            }
        }

        public Status(@Y61.k String str) {
            Type type = Type.f316665b;
            this.f316664a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            status.getClass();
            Type type = Type.f316665b;
            return L.f(this.f316664a, status.f316664a);
        }

        public final int hashCode() {
            return this.f316664a.hashCode() + (Type.f316665b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Status(type=");
            sb2.append(Type.f316665b);
            sb2.append(", description=");
            return C22026a.c(sb2, this.f316664a, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$a;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Set<String> f316668a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f316669b;

        public a(@Y61.k Set<String> set, boolean z12) {
            this.f316668a = set;
            this.f316669b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f316668a, aVar.f316668a) && this.f316669b == aVar.f316669b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f316669b) + (this.f316668a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionBlock(actions=");
            sb2.append(this.f316668a);
            sb2.append(", isSelected=");
            return androidx.appcompat.app.r.x(sb2, this.f316669b, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$b;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316670a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f316671b;

        public b(@Y61.k String str, @Y61.k DeepLink deepLink) {
            this.f316670a = str;
            this.f316671b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f316670a, bVar.f316670a) && L.f(this.f316671b, bVar.f316671b);
        }

        public final int hashCode() {
            return this.f316671b.hashCode() + (this.f316670a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionButton(title=");
            sb2.append(this.f316670a);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f316671b, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$c;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316672a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f316673b;

        public c(@Y61.k String str, @Y61.k String str2) {
            this.f316672a = str;
            this.f316673b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f316672a, cVar.f316672a) && L.f(this.f316673b, cVar.f316673b);
        }

        public final int hashCode() {
            return this.f316673b.hashCode() + (this.f316672a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddressesAdditionalInfo(delimiter=");
            sb2.append(this.f316672a);
            sb2.append(", content=");
            return C22026a.c(sb2, this.f316673b, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$d;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        @Y61.k
        /* renamed from: getTitle */
        String getF316697a();

        @Y61.l
        /* renamed from: getUniversalBackgroundColor */
        UniversalColor getF316699c();

        @Y61.k
        /* renamed from: getUniversalTitleColor */
        UniversalColor getF316698b();
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$e;", "", "a", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316674a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f316675b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final a f316676c;

        /* compiled from: UserAdvertItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$e$a;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            public final float f316677a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final UniversalColor f316678b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final UniversalColor f316679c;

            public a(float f12, @Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2) {
                this.f316677a = f12;
                this.f316678b = universalColor;
                this.f316679c = universalColor2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Float.compare(this.f316677a, aVar.f316677a) == 0 && L.f(this.f316678b, aVar.f316678b) && L.f(this.f316679c, aVar.f316679c);
            }

            public final int hashCode() {
                return this.f316679c.hashCode() + com.avito.android.actions_sheet.a.i(this.f316678b, Float.hashCode(this.f316677a) * 31, 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Progressbar(percentage=");
                sb2.append(this.f316677a);
                sb2.append(", color=");
                sb2.append(this.f316678b);
                sb2.append(", colorBackground=");
                return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f316679c, ')');
            }
        }

        public e(@Y61.k String str, @Y61.l String str2, @Y61.l a aVar) {
            this.f316674a = str;
            this.f316675b = str2;
            this.f316676c = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f316674a, eVar.f316674a) && L.f(this.f316675b, eVar.f316675b) && L.f(this.f316676c, eVar.f316676c);
        }

        public final int hashCode() {
            int iHashCode = this.f316674a.hashCode() * 31;
            String str = this.f316675b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.f316676c;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ContactsBbl(title=" + this.f316674a + ", titleColor=" + this.f316675b + ", progressbar=" + this.f316676c + ')';
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f {
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$g;", "Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$d;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316680a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f316681b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f316682c;

        public g(@Y61.k String str, @Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2) {
            this.f316680a = str;
            this.f316681b = universalColor;
            this.f316682c = universalColor2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f316680a, gVar.f316680a) && L.f(this.f316681b, gVar.f316681b) && L.f(this.f316682c, gVar.f316682c);
        }

        @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.d
        @Y61.k
        /* renamed from: getTitle, reason: from getter */
        public final String getF316697a() {
            return this.f316680a;
        }

        @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.d
        @Y61.k
        /* renamed from: getUniversalBackgroundColor, reason: from getter */
        public final UniversalColor getF316699c() {
            return this.f316682c;
        }

        @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.d
        @Y61.k
        /* renamed from: getUniversalTitleColor, reason: from getter */
        public final UniversalColor getF316698b() {
            return this.f316681b;
        }

        public final int hashCode() {
            return this.f316682c.hashCode() + com.avito.android.actions_sheet.a.i(this.f316681b, this.f316680a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FashionBadge(title=");
            sb2.append(this.f316680a);
            sb2.append(", universalTitleColor=");
            sb2.append(this.f316681b);
            sb2.append(", universalBackgroundColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f316682c, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$h;", "", "a", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316683a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f316684b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f316685c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final a f316686d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final DeepLink f316687e;

        /* compiled from: UserAdvertItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$h$a;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f316688a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f316689b;

            public a(@Y61.k String str, @Y61.k String str2) {
                this.f316688a = str;
                this.f316689b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f316688a, aVar.f316688a) && L.f(this.f316689b, aVar.f316689b);
            }

            public final int hashCode() {
                return this.f316689b.hashCode() + (this.f316688a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Onboarding(title=");
                sb2.append(this.f316688a);
                sb2.append(", subtitle=");
                return C22026a.c(sb2, this.f316689b, ')');
            }
        }

        public h(@Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.l a aVar, @Y61.l DeepLink deepLink2) {
            this.f316683a = str;
            this.f316684b = str2;
            this.f316685c = deepLink;
            this.f316686d = aVar;
            this.f316687e = deepLink2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f316683a, hVar.f316683a) && L.f(this.f316684b, hVar.f316684b) && L.f(this.f316685c, hVar.f316685c) && L.f(this.f316686d, hVar.f316686d) && L.f(this.f316687e, hVar.f316687e);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f316685c, H.d(this.f316683a.hashCode() * 31, 31, this.f316684b), 31);
            a aVar = this.f316686d;
            int iHashCode = (iE2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            DeepLink deepLink = this.f316687e;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LinkedAdvertisementsInfo(title=");
            sb2.append(this.f316683a);
            sb2.append(", count=");
            sb2.append(this.f316684b);
            sb2.append(", deeplink=");
            sb2.append(this.f316685c);
            sb2.append(", onboarding=");
            sb2.append(this.f316686d);
            sb2.append(", copyDeeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f316687e, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$i;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316690a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f316691b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final DeepLink f316692c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Long f316693d;

        public i(@Y61.k String str, @Y61.l String str2, @Y61.l DeepLink deepLink, @Y61.l Long l12) {
            this.f316690a = str;
            this.f316691b = str2;
            this.f316692c = deepLink;
            this.f316693d = l12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f316690a, iVar.f316690a) && L.f(this.f316691b, iVar.f316691b) && L.f(this.f316692c, iVar.f316692c) && L.f(this.f316693d, iVar.f316693d);
        }

        public final int hashCode() {
            int iHashCode = this.f316690a.hashCode() * 31;
            String str = this.f316691b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.f316692c;
            int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Long l12 = this.f316693d;
            return iHashCode3 + (l12 != null ? l12.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LiquidityStatus(statusText=");
            sb2.append(this.f316690a);
            sb2.append(", statusTextColor=");
            sb2.append(this.f316691b);
            sb2.append(", deeplink=");
            sb2.append(this.f316692c);
            sb2.append(", finishTime=");
            return androidx.media3.exoplayer.analytics.m.m(sb2, this.f316693d, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$j;", "Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$d;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316694a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f316695b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final UniversalColor f316696c;

        public j(@Y61.k String str, @Y61.k UniversalColor universalColor, @Y61.l UniversalColor universalColor2) {
            this.f316694a = str;
            this.f316695b = universalColor;
            this.f316696c = universalColor2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.f316694a, jVar.f316694a) && L.f(this.f316695b, jVar.f316695b) && L.f(this.f316696c, jVar.f316696c);
        }

        @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.d
        @Y61.k
        /* renamed from: getTitle, reason: from getter */
        public final String getF316697a() {
            return this.f316694a;
        }

        @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.d
        @Y61.l
        /* renamed from: getUniversalBackgroundColor, reason: from getter */
        public final UniversalColor getF316699c() {
            return this.f316696c;
        }

        @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.d
        @Y61.k
        /* renamed from: getUniversalTitleColor, reason: from getter */
        public final UniversalColor getF316698b() {
            return this.f316695b;
        }

        public final int hashCode() {
            int i12 = com.avito.android.actions_sheet.a.i(this.f316695b, this.f316694a.hashCode() * 31, 31);
            UniversalColor universalColor = this.f316696c;
            return i12 + (universalColor == null ? 0 : universalColor.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PriceBadge(title=");
            sb2.append(this.f316694a);
            sb2.append(", universalTitleColor=");
            sb2.append(this.f316695b);
            sb2.append(", universalBackgroundColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f316696c, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$k;", "Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$d;", "a", "b", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316697a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f316698b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final UniversalColor f316699c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final b f316700d;

        /* compiled from: UserAdvertItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$k$a;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f316701a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final DeepLink f316702b;

            public a(@Y61.k String str, @Y61.l DeepLink deepLink) {
                this.f316701a = str;
                this.f316702b = deepLink;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f316701a, aVar.f316701a) && L.f(this.f316702b, aVar.f316702b);
            }

            public final int hashCode() {
                int iHashCode = this.f316701a.hashCode() * 31;
                DeepLink deepLink = this.f316702b;
                return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Button(text=");
                sb2.append(this.f316701a);
                sb2.append(", link=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f316702b, ')');
            }
        }

        /* compiled from: UserAdvertItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$k$b;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f316703a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f316704b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final a f316705c;

            public b(@Y61.k String str, @Y61.k String str2, @Y61.l a aVar) {
                this.f316703a = str;
                this.f316704b = str2;
                this.f316705c = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f316703a, bVar.f316703a) && L.f(this.f316704b, bVar.f316704b) && L.f(this.f316705c, bVar.f316705c);
            }

            public final int hashCode() {
                int iD2 = H.d(this.f316703a.hashCode() * 31, 31, this.f316704b);
                a aVar = this.f316705c;
                return iD2 + (aVar == null ? 0 : aVar.hashCode());
            }

            @Y61.k
            public final String toString() {
                return "Tooltip(title=" + this.f316703a + ", text=" + this.f316704b + ", button=" + this.f316705c + ')';
            }
        }

        public k(@Y61.k String str, @Y61.k UniversalColor universalColor, @Y61.l UniversalColor universalColor2, @Y61.l b bVar) {
            this.f316697a = str;
            this.f316698b = universalColor;
            this.f316699c = universalColor2;
            this.f316700d = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f316697a, kVar.f316697a) && L.f(this.f316698b, kVar.f316698b) && L.f(this.f316699c, kVar.f316699c) && L.f(this.f316700d, kVar.f316700d);
        }

        @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.d
        @Y61.k
        /* renamed from: getTitle, reason: from getter */
        public final String getF316697a() {
            return this.f316697a;
        }

        @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.d
        @Y61.l
        /* renamed from: getUniversalBackgroundColor, reason: from getter */
        public final UniversalColor getF316699c() {
            return this.f316699c;
        }

        @Override // com.avito.android.user_adverts_views_pub.UserAdvertItem.d
        @Y61.k
        /* renamed from: getUniversalTitleColor, reason: from getter */
        public final UniversalColor getF316698b() {
            return this.f316698b;
        }

        public final int hashCode() {
            int i12 = com.avito.android.actions_sheet.a.i(this.f316698b, this.f316697a.hashCode() * 31, 31);
            UniversalColor universalColor = this.f316699c;
            int iHashCode = (i12 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            b bVar = this.f316700d;
            return iHashCode + (bVar != null ? bVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "RealtyBadge(title=" + this.f316697a + ", universalTitleColor=" + this.f316698b + ", universalBackgroundColor=" + this.f316699c + ", tooltipModel=" + this.f316700d + ')';
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$l;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316706a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UniversalColor f316707b;

        public l(@Y61.k String str, @Y61.k UniversalColor universalColor) {
            this.f316706a = str;
            this.f316707b = universalColor;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f316706a, lVar.f316706a) && L.f(this.f316707b, lVar.f316707b);
        }

        public final int hashCode() {
            return this.f316707b.hashCode() + (this.f316706a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RealtyLeadgen(text=");
            sb2.append(this.f316706a);
            sb2.append(", textColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f316707b, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$m;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f316708a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AttributedText f316709b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final DeepLink f316710c;

        public m(boolean z12, @Y61.k AttributedText attributedText, @Y61.l DeepLink deepLink) {
            this.f316708a = z12;
            this.f316709b = attributedText;
            this.f316710c = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.f316708a == mVar.f316708a && L.f(this.f316709b, mVar.f316709b) && L.f(this.f316710c, mVar.f316710c);
        }

        public final int hashCode() {
            int iB2 = com.avito.android.actions_sheet.a.b(Boolean.hashCode(this.f316708a) * 31, 31, this.f316709b);
            DeepLink deepLink = this.f316710c;
            return iB2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchPosition(blinking=");
            sb2.append(this.f316708a);
            sb2.append(", text=");
            sb2.append(this.f316709b);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f316710c, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$n;", "", "<init>", "()V", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f316711a = new n();
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$o;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f316712a;

        public o(@Y61.l AttributedText attributedText) {
            this.f316712a = attributedText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f316712a, ((o) obj).f316712a);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f316712a;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("Space(badge="), this.f316712a, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$p;", "", "a", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final a f316713a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final a f316714b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final a f316715c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Double f316716d;

        /* compiled from: UserAdvertItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$p$a;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            public final int f316717a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Integer f316718b;

            public a(int i12, @Y61.l Integer num) {
                this.f316717a = i12;
                this.f316718b = num;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f316717a == aVar.f316717a && L.f(this.f316718b, aVar.f316718b);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.f316717a) * 31;
                Integer num = this.f316718b;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Counters(total=");
                sb2.append(this.f316717a);
                sb2.append(", today=");
                return com.akita.compose.component.accordion.s.j(sb2, this.f316718b, ')');
            }
        }

        public p(@Y61.l a aVar, @Y61.l a aVar2, @Y61.l a aVar3, @Y61.l Double d12) {
            this.f316713a = aVar;
            this.f316714b = aVar2;
            this.f316715c = aVar3;
            this.f316716d = d12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return L.f(this.f316713a, pVar.f316713a) && L.f(this.f316714b, pVar.f316714b) && L.f(this.f316715c, pVar.f316715c) && L.f(this.f316716d, pVar.f316716d);
        }

        public final int hashCode() {
            a aVar = this.f316713a;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            a aVar2 = this.f316714b;
            int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            a aVar3 = this.f316715c;
            int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
            Double d12 = this.f316716d;
            return iHashCode3 + (d12 != null ? d12.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Stats(views=");
            sb2.append(this.f316713a);
            sb2.append(", favorites=");
            sb2.append(this.f316714b);
            sb2.append(", contacts=");
            sb2.append(this.f316715c);
            sb2.append(", viewsToContactsConversion=");
            return com.avito.android.authorization.auto_recovery.phone_confirm.b.h(sb2, this.f316716d, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$q;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316719a;

        public q(@Y61.k String str) {
            this.f316719a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f316719a, ((q) obj).f316719a);
        }

        public final int hashCode() {
            return this.f316719a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("TimeToLive(description="), this.f316719a, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$r;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316720a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f316721b;

        public r(@Y61.k String str, @Y61.k DeepLink deepLink) {
            this.f316720a = str;
            this.f316721b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return L.f(this.f316720a, rVar.f316720a) && L.f(this.f316721b, rVar.f316721b);
        }

        public final int hashCode() {
            return this.f316721b.hashCode() + (this.f316720a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Tip(title=");
            sb2.append(this.f316720a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f316721b, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$s;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s {

        /* renamed from: a, reason: collision with root package name */
        public final long f316722a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f316723b;

        public s(long j12, @Y61.l String str) {
            this.f316722a = j12;
            this.f316723b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.f316722a == sVar.f316722a && L.f(this.f316723b, sVar.f316723b);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f316722a) * 31;
            String str = this.f316723b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VacancyRostrud(status=");
            sb2.append(this.f316722a);
            sb2.append(", statusTitle=");
            return C22026a.c(sb2, this.f316723b, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$t;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f316724a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f316725b;

        public t(@Y61.k String str, @Y61.l String str2) {
            this.f316724a = str;
            this.f316725b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return L.f(this.f316724a, tVar.f316724a) && L.f(this.f316725b, tVar.f316725b);
        }

        public final int hashCode() {
            int iHashCode = this.f316724a.hashCode() * 31;
            String str = this.f316725b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VerificationStatus(statusText=");
            sb2.append(this.f316724a);
            sb2.append(", statusTextColor=");
            return C22026a.c(sb2, this.f316725b, ')');
        }
    }

    /* compiled from: UserAdvertItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/UserAdvertItem$u;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Uri f316726a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Image f316727b;

        public u(@Y61.k Uri uri, @Y61.l Image image) {
            this.f316726a = uri;
            this.f316727b = image;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return L.f(this.f316726a, uVar.f316726a) && L.f(this.f316727b, uVar.f316727b);
        }

        public final int hashCode() {
            int iHashCode = this.f316726a.hashCode() * 31;
            Image image = this.f316727b;
            return iHashCode + (image == null ? 0 : image.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Video(videoUrl=");
            sb2.append(this.f316726a);
            sb2.append(", previewImage=");
            return AK.c.o(sb2, this.f316727b, ')');
        }
    }

    @Y61.l
    /* renamed from: B */
    g getF419737x();

    @Y61.l
    /* renamed from: B1 */
    CpxPromoWidget getF393798Q();

    @Y61.l
    /* renamed from: C */
    a getF393785D();

    @Y61.l
    /* renamed from: D */
    q getF419724k();

    @Y61.l
    /* renamed from: E */
    String getF419726m();

    @Y61.l
    /* renamed from: E1 */
    String getF419713C();

    @Y61.l
    /* renamed from: F */
    String getF419714D();

    @Y61.l
    /* renamed from: F0 */
    String getF393797P();

    /* renamed from: G */
    boolean getF419728o();

    @Y61.l
    /* renamed from: G1 */
    t getF419734u();

    @Y61.l
    /* renamed from: H */
    r getF393808k();

    @Y61.l
    /* renamed from: J0 */
    b getF393793L();

    @Y61.l
    /* renamed from: M1 */
    k getF419733t();

    @Y61.l
    /* renamed from: N1 */
    c getF393789H();

    @Y61.l
    /* renamed from: O1 */
    m getF393794M();

    @Y61.l
    /* renamed from: U */
    o getF393796O();

    @Y61.l
    /* renamed from: U0 */
    s getF393791J();

    @Y61.l
    /* renamed from: W1 */
    e getF393790I();

    @Y61.l
    /* renamed from: X0 */
    p getF419722i();

    @Y61.l
    /* renamed from: Z1 */
    String getF419711A();

    @Y61.l
    /* renamed from: a2 */
    h getF419736w();

    @Y61.l
    /* renamed from: c1 */
    AttributedText getF419720g();

    /* renamed from: f1 */
    boolean getF419730q();

    @Y61.l
    /* renamed from: g1 */
    String getF419725l();

    @Y61.k
    /* renamed from: getAdvertId */
    String getF419716c();

    @Y61.l
    /* renamed from: getDeepLink */
    DeepLink getF419729p();

    @Y61.l
    /* renamed from: getImage */
    Image getF419718e();

    @Y61.l
    /* renamed from: getPrice */
    String getF419719f();

    @Y61.l
    /* renamed from: getStatus */
    Status getF419731r();

    @Y61.k
    /* renamed from: getTitle */
    String getF419717d();

    /* renamed from: h2 */
    boolean getF419738y();

    @Y61.l
    /* renamed from: j */
    String getF393788G();

    @Y61.l
    /* renamed from: k */
    String getF419721h();

    @Y61.l
    /* renamed from: m2 */
    j getF419732s();

    @Y61.l
    /* renamed from: n0 */
    i getF419735v();

    @Y61.l
    /* renamed from: n1 */
    RightAction getF393795N();

    @Y61.l
    /* renamed from: r */
    AttributedText getF20864f();

    @Y61.l
    /* renamed from: r1 */
    l getF419727n();

    @Y61.l
    /* renamed from: u */
    u getF419739z();

    @Y61.l
    Map<String, Image> u0();

    @Y61.l
    /* renamed from: w */
    DeepLink getF419712B();
}
