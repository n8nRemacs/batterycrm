package com.avito.android.user_adverts.tab_screens.converters;

import androidx.appcompat.app.r;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.model.UserAdvertsGroupSelectedState;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertsBaseItemDomain;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsGroupsConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/g;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface g {

    /* compiled from: UserAdvertsGroupsConverter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/g$a;", "", "a", "b", "Lcom/avito/android/user_adverts/tab_screens/converters/g$a$a;", "Lcom/avito/android/user_adverts/tab_screens/converters/g$a$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: UserAdvertsGroupsConverter.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/g$a$a;", "Lcom/avito/android/user_adverts/tab_screens/converters/g$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_screens.converters.g$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9789a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f315786a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f315787b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f315788c;

            public C9789a(@Y61.k String str, @Y61.l String str2, boolean z12) {
                this.f315786a = str;
                this.f315787b = str2;
                this.f315788c = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9789a)) {
                    return false;
                }
                C9789a c9789a = (C9789a) obj;
                return L.f(this.f315786a, c9789a.f315786a) && L.f(this.f315787b, c9789a.f315787b) && this.f315788c == c9789a.f315788c;
            }

            public final int hashCode() {
                int iHashCode = this.f315786a.hashCode() * 31;
                String str = this.f315787b;
                return Boolean.hashCode(this.f315788c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AdvertSelected(advertId=");
                sb2.append(this.f315786a);
                sb2.append(", advertShortcut=");
                sb2.append(this.f315787b);
                sb2.append(", isSelected=");
                return r.x(sb2, this.f315788c, ')');
            }
        }

        /* compiled from: UserAdvertsGroupsConverter.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/g$a$b;", "Lcom/avito/android/user_adverts/tab_screens/converters/g$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final UserAdvertsShortcutGroup f315789a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final UserAdvertsGroupSelectedState f315790b;

            public b(@Y61.k UserAdvertsShortcutGroup userAdvertsShortcutGroup, @Y61.k UserAdvertsGroupSelectedState userAdvertsGroupSelectedState) {
                this.f315789a = userAdvertsShortcutGroup;
                this.f315790b = userAdvertsGroupSelectedState;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f315789a, bVar.f315789a) && this.f315790b == bVar.f315790b;
            }

            public final int hashCode() {
                return this.f315790b.hashCode() + (this.f315789a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "GroupSelected(shortcutGroup=" + this.f315789a + ", newState=" + this.f315790b + ')';
            }
        }
    }

    @Y61.k
    UserAdvertsGroupData a(@Y61.k List<? extends UserAdvertsBaseItemDomain> list);

    @Y61.k
    UserAdvertsGroupData b(@Y61.k UserAdvertsGroupData userAdvertsGroupData, @Y61.k a aVar);

    @Y61.k
    UserAdvertsGroupData c(@Y61.k UserAdvertsGroupData userAdvertsGroupData, @Y61.k UserAdvertsGroupData userAdvertsGroupData2);
}
