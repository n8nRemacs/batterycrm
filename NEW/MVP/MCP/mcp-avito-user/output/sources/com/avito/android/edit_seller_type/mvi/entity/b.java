package com.avito.android.edit_seller_type.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.edit_seller_type.mvi.entity.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditSellerTypeOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/b;", "", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/edit_seller_type/mvi/entity/b$a;", "Lcom/avito/android/edit_seller_type/mvi/entity/b$b;", "Lcom/avito/android/edit_seller_type/mvi/entity/b$c;", "Lcom/avito/android/edit_seller_type/mvi/entity/b$d;", "Lcom/avito/android/edit_seller_type/mvi/entity/b$e;", "Lcom/avito/android/edit_seller_type/mvi/entity/b$f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: EditSellerTypeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/b$a;", "Lcom/avito/android/edit_seller_type/mvi/entity/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f146799a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -158258925;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: EditSellerTypeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/b$b;", "Lcom/avito/android/edit_seller_type/mvi/entity/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.edit_seller_type.mvi.entity.b$b, reason: collision with other inner class name */
    public static final /* data */ class C4272b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C4272b f146800a = new C4272b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C4272b);
        }

        public final int hashCode() {
            return 1985547405;
        }

        @k
        public final String toString() {
            return "DismissDialog";
        }
    }

    /* compiled from: EditSellerTypeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/b$c;", "Lcom/avito/android/edit_seller_type/mvi/entity/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f146801a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c.f f146802b;

        public c(@k String str, @k c.f fVar) {
            this.f146801a = str;
            this.f146802b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f146801a, cVar.f146801a) && L.f(this.f146802b, cVar.f146802b);
        }

        public final int hashCode() {
            return this.f146802b.hashCode() + (this.f146801a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "FinishWithResult(title=" + this.f146801a + ", result=" + this.f146802b + ')';
        }
    }

    /* compiled from: EditSellerTypeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/b$d;", "Lcom/avito/android/edit_seller_type/mvi/entity/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final c.a f146803a;

        public d(@k c.a aVar) {
            this.f146803a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f146803a, ((d) obj).f146803a);
        }

        public final int hashCode() {
            return this.f146803a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenConfirmationDialog(confirmDialogState=" + this.f146803a + ')';
        }
    }

    /* compiled from: EditSellerTypeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/b$e;", "Lcom/avito/android/edit_seller_type/mvi/entity/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f146804a;

        public e(@k DeepLink deepLink) {
            this.f146804a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f146804a, ((e) obj).f146804a);
        }

        public final int hashCode() {
            return this.f146804a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f146804a, ')');
        }
    }

    /* compiled from: EditSellerTypeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_seller_type/mvi/entity/b$f;", "Lcom/avito/android/edit_seller_type/mvi/entity/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowErrorMessage(message=null)";
        }
    }
}
