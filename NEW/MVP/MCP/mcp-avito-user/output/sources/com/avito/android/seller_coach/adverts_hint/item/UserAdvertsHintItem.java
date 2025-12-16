package com.avito.android.seller_coach.adverts_hint.item;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsHintItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/item/UserAdvertsHintItem;", "Lcom/avito/conveyor_item/a;", "BackgroundColor", "Type", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UserAdvertsHintItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f267209b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f267210c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f267211d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f267212e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Type f267213f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f267214g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final BackgroundColor f267215h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final List<String> f267216i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserAdvertsHintItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/item/UserAdvertsHintItem$BackgroundColor;", "", "a", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BackgroundColor {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f267217c;

        /* renamed from: d, reason: collision with root package name */
        public static final BackgroundColor f267218d;

        /* renamed from: e, reason: collision with root package name */
        public static final BackgroundColor f267219e;

        /* renamed from: f, reason: collision with root package name */
        public static final BackgroundColor f267220f;

        /* renamed from: g, reason: collision with root package name */
        public static final BackgroundColor f267221g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ BackgroundColor[] f267222h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f267223i;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f267224b;

        /* compiled from: UserAdvertsHintItem.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/item/UserAdvertsHintItem$BackgroundColor$a;", "", "<init>", "()V", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            BackgroundColor backgroundColor = new BackgroundColor("BACKGROUND_CONTENT", 0, "content");
            f267218d = backgroundColor;
            BackgroundColor backgroundColor2 = new BackgroundColor("BACKGROUND_MONEY", 1, "price");
            f267219e = backgroundColor2;
            BackgroundColor backgroundColor3 = new BackgroundColor("BACKGROUND_TRANSACTION", 2, PluralsKeys.OTHER);
            f267220f = backgroundColor3;
            BackgroundColor backgroundColor4 = new BackgroundColor("BACKGROUND_VERIFICATION", 3, "profile");
            f267221g = backgroundColor4;
            BackgroundColor[] backgroundColorArr = {backgroundColor, backgroundColor2, backgroundColor3, backgroundColor4};
            f267222h = backgroundColorArr;
            f267223i = c.a(backgroundColorArr);
            f267217c = new a(null);
        }

        public BackgroundColor(String str, int i12, String str2) {
            this.f267224b = str2;
        }

        public static BackgroundColor valueOf(String str) {
            return (BackgroundColor) Enum.valueOf(BackgroundColor.class, str);
        }

        public static BackgroundColor[] values() {
            return (BackgroundColor[]) f267222h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserAdvertsHintItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/item/UserAdvertsHintItem$Type;", "", "a", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f267225c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f267226d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f267227e;

        /* renamed from: f, reason: collision with root package name */
        public static final Type f267228f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ Type[] f267229g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f267230h;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f267231b;

        /* compiled from: UserAdvertsHintItem.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/seller_coach/adverts_hint/item/UserAdvertsHintItem$Type$a;", "", "<init>", "()V", "_avito_seller-coach_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            Type type = new Type("SIMPLE", 0, "simple");
            f267226d = type;
            Type type2 = new Type("WITH_ITEMS", 1, "by_items");
            f267227e = type2;
            Type type3 = new Type("COMMON", 2, "common");
            f267228f = type3;
            Type[] typeArr = {type, type2, type3};
            f267229g = typeArr;
            f267230h = c.a(typeArr);
            f267225c = new a(null);
        }

        public Type(String str, int i12, String str2) {
            this.f267231b = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f267229g.clone();
        }
    }

    public UserAdvertsHintItem(@k String str, @k String str2, @k String str3, @k String str4, @k Type type, @k String str5, @k BackgroundColor backgroundColor, @l List<String> list) {
        this.f267209b = str;
        this.f267210c = str2;
        this.f267211d = str3;
        this.f267212e = str4;
        this.f267213f = type;
        this.f267214g = str5;
        this.f267215h = backgroundColor;
        this.f267216i = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertsHintItem)) {
            return false;
        }
        UserAdvertsHintItem userAdvertsHintItem = (UserAdvertsHintItem) obj;
        return L.f(this.f267209b, userAdvertsHintItem.f267209b) && L.f(this.f267210c, userAdvertsHintItem.f267210c) && L.f(this.f267211d, userAdvertsHintItem.f267211d) && L.f(this.f267212e, userAdvertsHintItem.f267212e) && this.f267213f == userAdvertsHintItem.f267213f && L.f(this.f267214g, userAdvertsHintItem.f267214g) && this.f267215h == userAdvertsHintItem.f267215h && L.f(this.f267216i, userAdvertsHintItem.f267216i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272437b() {
        return getF2073b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF2073b() {
        return this.f267209b;
    }

    public final int hashCode() {
        int iHashCode = (this.f267215h.hashCode() + H.d((this.f267213f.hashCode() + H.d(H.d(H.d(this.f267209b.hashCode() * 31, 31, this.f267210c), 31, this.f267211d), 31, this.f267212e)) * 31, 31, this.f267214g)) * 31;
        List<String> list = this.f267216i;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsHintItem(stringId=");
        sb2.append(this.f267209b);
        sb2.append(", title=");
        sb2.append(this.f267210c);
        sb2.append(", description=");
        sb2.append(this.f267211d);
        sb2.append(", headerText=");
        sb2.append(this.f267212e);
        sb2.append(", type=");
        sb2.append(this.f267213f);
        sb2.append(", slug=");
        sb2.append(this.f267214g);
        sb2.append(", color=");
        sb2.append(this.f267215h);
        sb2.append(", itemsIds=");
        return H.p(sb2, this.f267216i, ')');
    }
}
