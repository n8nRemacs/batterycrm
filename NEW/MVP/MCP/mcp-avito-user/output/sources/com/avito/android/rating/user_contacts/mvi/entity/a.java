package com.avito.android.rating.user_contacts.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.rating.user_contacts.adapter.contact.ContactItem;
import com.avito.android.rating.user_contacts.mvi.entity.b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserContactsAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/rating/user_contacts/mvi/entity/a$a;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a$b;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a$c;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a$d;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a$e;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a$f;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: UserContactsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/a$a;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.rating.user_contacts.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7439a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ContactItem f247801a;

        public C7439a(@k ContactItem contactItem) {
            this.f247801a = contactItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C7439a) && L.f(this.f247801a, ((C7439a) obj).f247801a);
        }

        public final int hashCode() {
            return this.f247801a.hashCode();
        }

        @k
        public final String toString() {
            return "ItemInfoClicked(item=" + this.f247801a + ')';
        }
    }

    /* compiled from: UserContactsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/a$b;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ContactItem f247802a;

        /* renamed from: b, reason: collision with root package name */
        public final int f247803b;

        public b(@k ContactItem contactItem, int i12) {
            this.f247802a = contactItem;
            this.f247803b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f247802a, bVar.f247802a) && this.f247803b == bVar.f247803b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f247803b) + (this.f247802a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemRatingClicked(item=");
            sb2.append(this.f247802a);
            sb2.append(", rating=");
            return r.t(sb2, this.f247803b, ')');
        }
    }

    /* compiled from: UserContactsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/a$c;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ContactItem f247804a;

        public c(@k ContactItem contactItem) {
            this.f247804a = contactItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f247804a, ((c) obj).f247804a);
        }

        public final int hashCode() {
            return this.f247804a.hashCode();
        }

        @k
        public final String toString() {
            return "ItemRemoveClicked(item=" + this.f247804a + ')';
        }
    }

    /* compiled from: UserContactsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/a$d;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f247805a = new d();
    }

    /* compiled from: UserContactsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/a$e;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final b.InterfaceC7440b f247806a;

        public e(@k b.InterfaceC7440b interfaceC7440b) {
            this.f247806a = interfaceC7440b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f247806a, ((e) obj).f247806a);
        }

        public final int hashCode() {
            return this.f247806a.hashCode();
        }

        @k
        public final String toString() {
            return "ReloadContactList(loadingProgressType=" + this.f247806a + ')';
        }
    }

    /* compiled from: UserContactsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/a$f;", "Lcom/avito/android/rating/user_contacts/mvi/entity/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f247807a = new f();
    }
}
