package com.avito.android.user_adverts.tab_screens.converters;

import androidx.appcompat.app.r;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain;
import dJ0.C39589a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/d;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface d {

    /* compiled from: UserAdvertConverter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/d$a;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f315771a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UserAdvertItemDomain f315772b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InterfaceC9787a f315773c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final UserAdvertActionsInfoDomain f315774d;

        /* compiled from: UserAdvertConverter.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/d$a$a;", "", "a", "b", "c", "Lcom/avito/android/user_adverts/tab_screens/converters/d$a$a$a;", "Lcom/avito/android/user_adverts/tab_screens/converters/d$a$a$b;", "Lcom/avito/android/user_adverts/tab_screens/converters/d$a$a$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_screens.converters.d$a$a, reason: collision with other inner class name */
        public interface InterfaceC9787a {

            /* compiled from: UserAdvertConverter.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/d$a$a$a;", "Lcom/avito/android/user_adverts/tab_screens/converters/d$a$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.user_adverts.tab_screens.converters.d$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C9788a implements InterfaceC9787a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final UserAdvertsGroupData f315775a;

                public C9788a(@Y61.k UserAdvertsGroupData userAdvertsGroupData) {
                    this.f315775a = userAdvertsGroupData;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C9788a) && L.f(this.f315775a, ((C9788a) obj).f315775a);
                }

                public final int hashCode() {
                    return this.f315775a.f312182b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "Multiple(groupData=" + this.f315775a + ')';
                }
            }

            /* compiled from: UserAdvertConverter.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/d$a$a$b;", "Lcom/avito/android/user_adverts/tab_screens/converters/d$a$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.user_adverts.tab_screens.converters.d$a$a$b */
            public static final /* data */ class b implements InterfaceC9787a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final b f315776a = new b();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 1649379664;
                }

                @Y61.k
                public final String toString() {
                    return "None";
                }
            }

            /* compiled from: UserAdvertConverter.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/converters/d$a$a$c;", "Lcom/avito/android/user_adverts/tab_screens/converters/d$a$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.user_adverts.tab_screens.converters.d$a$a$c */
            public static final /* data */ class c implements InterfaceC9787a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final String f315777a;

                /* renamed from: b, reason: collision with root package name */
                public final boolean f315778b;

                public c(@Y61.k String str, boolean z12) {
                    this.f315777a = str;
                    this.f315778b = z12;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return L.f(this.f315777a, cVar.f315777a) && this.f315778b == cVar.f315778b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f315778b) + (this.f315777a.hashCode() * 31);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Single(advertId=");
                    sb2.append(this.f315777a);
                    sb2.append(", isLoading=");
                    return r.x(sb2, this.f315778b, ')');
                }
            }
        }

        public a(@Y61.k String str, @Y61.k UserAdvertItemDomain userAdvertItemDomain, @Y61.k InterfaceC9787a interfaceC9787a, @Y61.l UserAdvertActionsInfoDomain userAdvertActionsInfoDomain) {
            this.f315771a = str;
            this.f315772b = userAdvertItemDomain;
            this.f315773c = interfaceC9787a;
            this.f315774d = userAdvertActionsInfoDomain;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f315771a, aVar.f315771a) && L.f(this.f315772b, aVar.f315772b) && L.f(this.f315773c, aVar.f315773c) && L.f(this.f315774d, aVar.f315774d);
        }

        public final int hashCode() {
            int iHashCode = (this.f315773c.hashCode() + ((this.f315772b.hashCode() + (this.f315771a.hashCode() * 31)) * 31)) * 31;
            UserAdvertActionsInfoDomain userAdvertActionsInfoDomain = this.f315774d;
            return iHashCode + (userAdvertActionsInfoDomain == null ? 0 : userAdvertActionsInfoDomain.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "InputData(tabShortcut=" + this.f315771a + ", item=" + this.f315772b + ", selectionMode=" + this.f315773c + ", actionsInfo=" + this.f315774d + ')';
        }
    }

    @Y61.k
    C39589a a(@Y61.k a aVar);
}
