package com.avito.android.category_items_tree.screens.items_screen;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryItemType.kt */
@H0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/a;", "", "a", "b", "c", "d", "Lcom/avito/android/category_items_tree/screens/items_screen/a$b;", "Lcom/avito/android/category_items_tree/screens/items_screen/a$c;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CategoryItemType.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/a$a;", "", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.category_items_tree.screens.items_screen.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3406a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f116800a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f116801b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f116802c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f116803d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f116804e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f116805f;

        public C3406a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6) {
            this.f116800a = str;
            this.f116801b = str2;
            this.f116802c = str3;
            this.f116803d = str4;
            this.f116804e = str5;
            this.f116805f = str6;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3406a)) {
                return false;
            }
            C3406a c3406a = (C3406a) obj;
            return L.f(this.f116800a, c3406a.f116800a) && L.f(this.f116801b, c3406a.f116801b) && L.f(this.f116802c, c3406a.f116802c) && L.f(this.f116803d, c3406a.f116803d) && L.f(this.f116804e, c3406a.f116804e) && L.f(this.f116805f, c3406a.f116805f);
        }

        public final int hashCode() {
            String str = this.f116800a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f116801b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f116802c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f116803d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f116804e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f116805f;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdditionalInfoModel(enabledValue=");
            sb2.append(this.f116800a);
            sb2.append(", views=");
            sb2.append(this.f116801b);
            sb2.append(", favorites=");
            sb2.append(this.f116802c);
            sb2.append(", contacts=");
            sb2.append(this.f116803d);
            sb2.append(", badgeText=");
            sb2.append(this.f116804e);
            sb2.append(", iconUrl=");
            return C22026a.c(sb2, this.f116805f, ')');
        }
    }

    /* compiled from: CategoryItemType.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/a$b;", "Lcom/avito/android/category_items_tree/screens/items_screen/a;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f116806a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f116807b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final d f116808c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f116809d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f116810e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final DeepLink f116811f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final C3406a f116812g;

        public b(@Y61.k String str, @Y61.k String str2, @Y61.k d dVar, @Y61.k String str3, boolean z12, @Y61.k DeepLink deepLink, @Y61.k C3406a c3406a) {
            this.f116806a = str;
            this.f116807b = str2;
            this.f116808c = dVar;
            this.f116809d = str3;
            this.f116810e = z12;
            this.f116811f = deepLink;
            this.f116812g = c3406a;
        }

        @Override // com.avito.android.category_items_tree.screens.items_screen.a
        @Y61.k
        public final String d() {
            return "category_items_item_type";
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f116806a, bVar.f116806a) && L.f(this.f116807b, bVar.f116807b) && L.f(this.f116808c, bVar.f116808c) && L.f(this.f116809d, bVar.f116809d) && this.f116810e == bVar.f116810e && L.f(this.f116811f, bVar.f116811f) && L.f(this.f116812g, bVar.f116812g);
        }

        @Override // com.avito.android.category_items_tree.screens.items_screen.a
        @Y61.k
        /* renamed from: getId, reason: from getter */
        public final String getF116806a() {
            return this.f116806a;
        }

        public final int hashCode() {
            return this.f116812g.hashCode() + com.avito.android.actions_sheet.a.e(this.f116811f, r.i(H.d((this.f116808c.hashCode() + H.d(this.f116806a.hashCode() * 31, 31, this.f116807b)) * 31, 31, this.f116809d), 31, this.f116810e), 31);
        }

        @Y61.k
        public final String toString() {
            return "CategoryItemData(id=" + this.f116806a + ", name=" + this.f116807b + ", price=" + this.f116808c + ", imageUrl=" + this.f116809d + ", isEnabled=" + this.f116810e + ", editDeeplink=" + this.f116811f + ", additionalInfo=" + this.f116812g + ')';
        }
    }

    /* compiled from: CategoryItemType.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/a$c;", "Lcom/avito/android/category_items_tree/screens/items_screen/a;", "<init>", "()V", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f116813a = new c();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final String f116814b = "category_items_loader_id";

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final String f116815c = "category_items_loader_type";

        @Override // com.avito.android.category_items_tree.screens.items_screen.a
        @Y61.k
        public final String d() {
            return f116815c;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // com.avito.android.category_items_tree.screens.items_screen.a
        @Y61.k
        /* renamed from: getId */
        public final String getF116806a() {
            return f116814b;
        }

        public final int hashCode() {
            return -1501440011;
        }

        @Y61.k
        public final String toString() {
            return "Loader";
        }
    }

    /* compiled from: CategoryItemType.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/screens/items_screen/a$d;", "", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f116816a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f116817b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f116818c;

        public d(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
            this.f116816a = str;
            this.f116817b = str2;
            this.f116818c = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f116816a, dVar.f116816a) && L.f(this.f116817b, dVar.f116817b) && L.f(this.f116818c, dVar.f116818c);
        }

        public final int hashCode() {
            int iHashCode = this.f116816a.hashCode() * 31;
            String str = this.f116817b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f116818c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PriceModel(current=");
            sb2.append(this.f116816a);
            sb2.append(", old=");
            sb2.append(this.f116817b);
            sb2.append(", discount=");
            return C22026a.c(sb2, this.f116818c, ')');
        }
    }

    @Y61.k
    String d();

    @Y61.k
    /* renamed from: getId */
    String getF116806a();
}
