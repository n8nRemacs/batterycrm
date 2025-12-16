package com.avito.android.travel_search.generated.api.api_1_travel_search_favorites_header_post;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.category_parameters.GuestsSelectParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import tF0.g;

/* compiled from: Api1TravelSearchFavoritesHeaderPostResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/Widget;", "", "LtF0/g;", Navigation.CONFIG, "", "layout", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/Widget$Type;", "type", "<init>", "(LtF0/g;Ljava/lang/String;Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/Widget$Type;)V", "LtF0/g;", "a", "()LtF0/g;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/Widget$Type;", "c", "()Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/Widget$Type;", "Type", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Widget {

    @c(Navigation.CONFIG)
    @k
    private final g config;

    @c("layout")
    @l
    private final String layout;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1TravelSearchFavoritesHeaderPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/travel_search/generated/api/api_1_travel_search_favorites_header_post/Widget$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "FormattedDate", "GuestsSelect", "RadioSelect", "Group", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c(DateRangeParameter.FormattedDateParameter.TYPE)
        public static final Type FormattedDate;

        @c("group")
        public static final Type Group;

        @c(GuestsSelectParameter.TYPE)
        public static final Type GuestsSelect;

        @c("radioSelect")
        public static final Type RadioSelect;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f303118b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f303119c;

        static {
            Type type = new Type("FormattedDate", 0, DateRangeParameter.FormattedDateParameter.TYPE);
            FormattedDate = type;
            Type type2 = new Type("GuestsSelect", 1, GuestsSelectParameter.TYPE);
            GuestsSelect = type2;
            Type type3 = new Type("RadioSelect", 2, "radioSelect");
            RadioSelect = type3;
            Type type4 = new Type("Group", 3, "group");
            Group = type4;
            Type[] typeArr = {type, type2, type3, type4};
            f303118b = typeArr;
            f303119c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f303118b.clone();
        }
    }

    public Widget(@k g gVar, @l String str, @k Type type) {
        this.config = gVar;
        this.layout = str;
        this.type = type;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final g getConfig() {
        return this.config;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getLayout() {
        return this.layout;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
