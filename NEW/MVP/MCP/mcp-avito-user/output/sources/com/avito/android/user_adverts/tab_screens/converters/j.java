package com.avito.android.user_adverts.tab_screens.converters;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertsBaseItemDomain;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserItemConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/j;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface j {

    /* compiled from: UserItemConverter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/j$a;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final UserAdvertActionsInfoDomain f315796a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f315797b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<UserAdvertsBaseItemDomain> f315798c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final InterfaceC9790a f315799d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f315800e;

        /* compiled from: UserItemConverter.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/j$a$a;", "", "a", "b", "c", "Lcom/avito/android/user_adverts/tab_screens/converters/j$a$a$a;", "Lcom/avito/android/user_adverts/tab_screens/converters/j$a$a$b;", "Lcom/avito/android/user_adverts/tab_screens/converters/j$a$a$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_screens.converters.j$a$a, reason: collision with other inner class name */
        public interface InterfaceC9790a {

            /* compiled from: UserItemConverter.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/j$a$a$a;", "Lcom/avito/android/user_adverts/tab_screens/converters/j$a$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.user_adverts.tab_screens.converters.j$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C9791a implements InterfaceC9790a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final UserAdvertsGroupData f315801a;

                public C9791a(@Y61.k UserAdvertsGroupData userAdvertsGroupData) {
                    this.f315801a = userAdvertsGroupData;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C9791a) && L.f(this.f315801a, ((C9791a) obj).f315801a);
                }

                public final int hashCode() {
                    return this.f315801a.f312182b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "Multiple(groupData=" + this.f315801a + ')';
                }
            }

            /* compiled from: UserItemConverter.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/j$a$a$b;", "Lcom/avito/android/user_adverts/tab_screens/converters/j$a$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.user_adverts.tab_screens.converters.j$a$a$b */
            public static final /* data */ class b implements InterfaceC9790a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final b f315802a = new b();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 1432658063;
                }

                @Y61.k
                public final String toString() {
                    return "None";
                }
            }

            /* compiled from: UserItemConverter.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/j$a$a$c;", "Lcom/avito/android/user_adverts/tab_screens/converters/j$a$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.user_adverts.tab_screens.converters.j$a$a$c */
            public static final /* data */ class c implements InterfaceC9790a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final String f315803a;

                /* renamed from: b, reason: collision with root package name */
                public final boolean f315804b;

                public c(@Y61.k String str, boolean z12) {
                    this.f315803a = str;
                    this.f315804b = z12;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return L.f(this.f315803a, cVar.f315803a) && this.f315804b == cVar.f315804b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f315804b) + (this.f315803a.hashCode() * 31);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Single(advertId=");
                    sb2.append(this.f315803a);
                    sb2.append(", isLoading=");
                    return r.x(sb2, this.f315804b, ')');
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.l UserAdvertActionsInfoDomain userAdvertActionsInfoDomain, @Y61.k String str, @Y61.k List<? extends UserAdvertsBaseItemDomain> list, @Y61.k InterfaceC9790a interfaceC9790a, boolean z12) {
            this.f315796a = userAdvertActionsInfoDomain;
            this.f315797b = str;
            this.f315798c = list;
            this.f315799d = interfaceC9790a;
            this.f315800e = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f315796a, aVar.f315796a) && L.f(this.f315797b, aVar.f315797b) && L.f(this.f315798c, aVar.f315798c) && L.f(this.f315799d, aVar.f315799d) && this.f315800e == aVar.f315800e;
        }

        public final int hashCode() {
            UserAdvertActionsInfoDomain userAdvertActionsInfoDomain = this.f315796a;
            return Boolean.hashCode(this.f315800e) + ((this.f315799d.hashCode() + H.e(H.d((userAdvertActionsInfoDomain == null ? 0 : userAdvertActionsInfoDomain.hashCode()) * 31, 31, this.f315797b), 31, this.f315798c)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputData(actionsInfo=");
            sb2.append(this.f315796a);
            sb2.append(", tabShortcut=");
            sb2.append(this.f315797b);
            sb2.append(", items=");
            sb2.append(this.f315798c);
            sb2.append(", selectionMode=");
            sb2.append(this.f315799d);
            sb2.append(", hasNextPage=");
            return r.x(sb2, this.f315800e, ')');
        }
    }

    @Y61.k
    ArrayList a(@Y61.k a aVar);
}
