package vn0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rubricator.list.category.model.CategoryListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryListAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lvn0/a;", "", "a", "b", "c", "d", "e", "f", "Lvn0/a$a;", "Lvn0/a$b;", "Lvn0/a$c;", "Lvn0/a$d;", "Lvn0/a$e;", "Lvn0/a$f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vn0.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49356a {

    /* compiled from: CategoryListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvn0/a$a;", "Lvn0/a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.a$a, reason: collision with other inner class name */
    public static final class C12788a implements InterfaceC49356a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12788a f440945a = new C12788a();
    }

    /* compiled from: CategoryListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvn0/a$b;", "Lvn0/a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.a$b */
    public static final class b implements InterfaceC49356a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f440946a = new b();
    }

    /* compiled from: CategoryListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvn0/a$c;", "Lvn0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.a$c */
    public static final /* data */ class c implements InterfaceC49356a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f440947a;

        public c(@k String str) {
            this.f440947a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f440947a, ((c) obj).f440947a);
        }

        public final int hashCode() {
            return this.f440947a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FilterList(query="), this.f440947a, ')');
        }
    }

    /* compiled from: CategoryListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvn0/a$d;", "Lvn0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.a$d */
    public static final /* data */ class d implements InterfaceC49356a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440948a;

        public d(@k DeepLink deepLink) {
            this.f440948a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f440948a, ((d) obj).f440948a);
        }

        public final int hashCode() {
            return this.f440948a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowLink(link="), this.f440948a, ')');
        }
    }

    /* compiled from: CategoryListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvn0/a$e;", "Lvn0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.a$e */
    public static final /* data */ class e implements InterfaceC49356a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CategoryListItem f440949a;

        public e(@k CategoryListItem categoryListItem) {
            this.f440949a = categoryListItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f440949a, ((e) obj).f440949a);
        }

        public final int hashCode() {
            return this.f440949a.hashCode();
        }

        @k
        public final String toString() {
            return "ItemClicked(item=" + this.f440949a + ')';
        }
    }

    /* compiled from: CategoryListAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvn0/a$f;", "Lvn0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.a$f */
    public static final /* data */ class f implements InterfaceC49356a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f440950a;

        public f(boolean z12) {
            this.f440950a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f440950a == ((f) obj).f440950a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f440950a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("KeyboardVisibilityChanged(isVisible="), this.f440950a, ')');
        }
    }
}
