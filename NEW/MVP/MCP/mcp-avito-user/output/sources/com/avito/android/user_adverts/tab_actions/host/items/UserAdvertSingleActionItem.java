package com.avito.android.user_adverts.tab_actions.host.items;

import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertActionItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/items/UserAdvertSingleActionItem;", "Lcom/avito/conveyor_item/a;", "Type", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertSingleActionItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f314301b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f314302c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f314303d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f314304e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f314305f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Type f314306g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final DeepLink f314307h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final UserAdvertActionType.Single f314308i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f314309j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserAdvertActionItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/items/UserAdvertSingleActionItem$Type;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f314310b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f314311c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f314312d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f314313e;

        static {
            Type type = new Type("Danger", 0);
            f314310b = type;
            Type type2 = new Type("Default", 1);
            f314311c = type2;
            Type[] typeArr = {type, type2};
            f314312d = typeArr;
            f314313e = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f314312d.clone();
        }
    }

    public UserAdvertSingleActionItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k Type type, @Y61.k DeepLink deepLink, @Y61.k UserAdvertActionType.Single single, boolean z12) {
        this.f314301b = str;
        this.f314302c = str2;
        this.f314303d = str3;
        this.f314304e = str4;
        this.f314305f = str5;
        this.f314306g = type;
        this.f314307h = deepLink;
        this.f314308i = single;
        this.f314309j = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertSingleActionItem)) {
            return false;
        }
        UserAdvertSingleActionItem userAdvertSingleActionItem = (UserAdvertSingleActionItem) obj;
        return L.f(this.f314301b, userAdvertSingleActionItem.f314301b) && L.f(this.f314302c, userAdvertSingleActionItem.f314302c) && L.f(this.f314303d, userAdvertSingleActionItem.f314303d) && L.f(this.f314304e, userAdvertSingleActionItem.f314304e) && L.f(this.f314305f, userAdvertSingleActionItem.f314305f) && this.f314306g == userAdvertSingleActionItem.f314306g && L.f(this.f314307h, userAdvertSingleActionItem.f314307h) && L.f(this.f314308i, userAdvertSingleActionItem.f314308i) && this.f314309j == userAdvertSingleActionItem.f314309j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF289977b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289977b() {
        return this.f314301b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f314309j) + H.d(com.avito.android.actions_sheet.a.e(this.f314307h, (this.f314306g.hashCode() + H.d(H.d(H.d(H.d(this.f314301b.hashCode() * 31, 31, this.f314302c), 31, this.f314303d), 31, this.f314304e), 31, this.f314305f)) * 31, 31), 31, this.f314308i.f312181b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertSingleActionItem(stringId=");
        sb2.append(this.f314301b);
        sb2.append(", advertId=");
        sb2.append(this.f314302c);
        sb2.append(", icon=");
        sb2.append(this.f314303d);
        sb2.append(", actionId=");
        sb2.append(this.f314304e);
        sb2.append(", title=");
        sb2.append(this.f314305f);
        sb2.append(", type=");
        sb2.append(this.f314306g);
        sb2.append(", uri=");
        sb2.append(this.f314307h);
        sb2.append(", actionType=");
        sb2.append(this.f314308i);
        sb2.append(", isLoading=");
        return androidx.appcompat.app.r.x(sb2, this.f314309j, ')');
    }
}
