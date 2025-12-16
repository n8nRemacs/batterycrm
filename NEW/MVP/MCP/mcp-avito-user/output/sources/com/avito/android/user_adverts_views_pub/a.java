package com.avito.android.user_adverts_views_pub;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertItemClickListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/a;", "", "a", "b", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: UserAdvertItemClickListener.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/a$a;", "", "a", "b", "c", "d", "Lcom/avito/android/user_adverts_views_pub/a$a$a;", "Lcom/avito/android/user_adverts_views_pub/a$a$b;", "Lcom/avito/android/user_adverts_views_pub/a$a$c;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts_views_pub.a$a, reason: collision with other inner class name */
    public interface InterfaceC9834a {

        /* compiled from: UserAdvertItemClickListener.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/a$a$a;", "Lcom/avito/android/user_adverts_views_pub/a$a;", "Lcom/avito/android/user_adverts_views_pub/a$a$d;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts_views_pub.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9835a implements InterfaceC9834a, d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UserAdvertItem f316728a;

            public C9835a(@k UserAdvertItem userAdvertItem) {
                this.f316728a = userAdvertItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C9835a) && L.f(this.f316728a, ((C9835a) obj).f316728a);
            }

            @Override // com.avito.android.user_adverts_views_pub.a.InterfaceC9834a.d
            @l
            /* renamed from: getDeepLink */
            public final DeepLink getF316729a() {
                return this.f316728a.getF419729p();
            }

            @Override // com.avito.android.user_adverts_views_pub.a.InterfaceC9834a
            @k
            /* renamed from: getItem, reason: from getter */
            public final UserAdvertItem getF316732b() {
                return this.f316728a;
            }

            public final int hashCode() {
                return this.f316728a.hashCode();
            }

            @k
            public final String toString() {
                return "AdvertClick(item=" + this.f316728a + ')';
            }
        }

        /* compiled from: UserAdvertItemClickListener.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/a$a$b;", "Lcom/avito/android/user_adverts_views_pub/a$a;", "Lcom/avito/android/user_adverts_views_pub/a$a$d;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts_views_pub.a$a$b */
        public static final /* data */ class b implements InterfaceC9834a, d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final DeepLink f316729a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UserAdvertItem f316730b;

            public b(@k DeepLink deepLink, @k UserAdvertItem userAdvertItem) {
                this.f316729a = deepLink;
                this.f316730b = userAdvertItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f316729a, bVar.f316729a) && L.f(this.f316730b, bVar.f316730b);
            }

            @Override // com.avito.android.user_adverts_views_pub.a.InterfaceC9834a.d
            @k
            /* renamed from: getDeepLink, reason: from getter */
            public final DeepLink getF316729a() {
                return this.f316729a;
            }

            @Override // com.avito.android.user_adverts_views_pub.a.InterfaceC9834a
            @k
            /* renamed from: getItem, reason: from getter */
            public final UserAdvertItem getF316732b() {
                return this.f316730b;
            }

            public final int hashCode() {
                return this.f316730b.hashCode() + (this.f316729a.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "EditClick(deepLink=" + this.f316729a + ", item=" + this.f316730b + ')';
            }
        }

        /* compiled from: UserAdvertItemClickListener.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/a$a$c;", "Lcom/avito/android/user_adverts_views_pub/a$a;", "Lcom/avito/android/user_adverts_views_pub/a$a$d;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts_views_pub.a$a$c */
        public static final /* data */ class c implements InterfaceC9834a, d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final UserAdvertItem.RightAction f316731a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final UserAdvertItem f316732b;

            public c(@k UserAdvertItem.RightAction rightAction, @k UserAdvertItem userAdvertItem) {
                this.f316731a = rightAction;
                this.f316732b = userAdvertItem;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f316731a, cVar.f316731a) && L.f(this.f316732b, cVar.f316732b);
            }

            @Override // com.avito.android.user_adverts_views_pub.a.InterfaceC9834a.d
            @l
            /* renamed from: getDeepLink */
            public final DeepLink getF316729a() {
                return this.f316731a.getF316658b();
            }

            @Override // com.avito.android.user_adverts_views_pub.a.InterfaceC9834a
            @k
            /* renamed from: getItem, reason: from getter */
            public final UserAdvertItem getF316732b() {
                return this.f316732b;
            }

            public final int hashCode() {
                return this.f316732b.hashCode() + (this.f316731a.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "RightActionClick(action=" + this.f316731a + ", item=" + this.f316732b + ')';
            }
        }

        /* compiled from: UserAdvertItemClickListener.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/a$a$d;", "", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts_views_pub.a$a$d */
        public interface d {
            @l
            /* renamed from: getDeepLink */
            DeepLink getF316729a();
        }

        @k
        /* renamed from: getItem */
        UserAdvertItem getF316732b();
    }

    void K(@k DeepLink deepLink);

    void U3(@k DeepLink deepLink);

    void X(@k InterfaceC9834a interfaceC9834a);

    void u3(@k String str, @l String str2, boolean z12);

    void x3(@k DeepLink deepLink);

    /* compiled from: UserAdvertItemClickListener.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/a$b;", "Lcom/avito/android/user_adverts_views_pub/a;", "<init>", "()V", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {
        @Override // com.avito.android.user_adverts_views_pub.a
        public final void K(@k DeepLink deepLink) {
        }

        @Override // com.avito.android.user_adverts_views_pub.a
        public final void U3(@k DeepLink deepLink) {
        }

        @Override // com.avito.android.user_adverts_views_pub.a
        public final void X(@k InterfaceC9834a interfaceC9834a) {
        }

        @Override // com.avito.android.user_adverts_views_pub.a
        public final void x3(@k DeepLink deepLink) {
        }

        @Override // com.avito.android.user_adverts_views_pub.a
        public final void u3(@k String str, @l String str2, boolean z12) {
        }
    }
}
