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

/* compiled from: CategoryListInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lvn0/b;", "", "a", "b", "c", "d", "e", "f", "Lvn0/b$a;", "Lvn0/b$b;", "Lvn0/b$c;", "Lvn0/b$d;", "Lvn0/b$e;", "Lvn0/b$f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vn0.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49357b {

    /* compiled from: CategoryListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvn0/b$a;", "Lvn0/b;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.b$a */
    public static final class a implements InterfaceC49357b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f440951a = new a();
    }

    /* compiled from: CategoryListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvn0/b$b;", "Lvn0/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12789b implements InterfaceC49357b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f440952a;

        public C12789b(@k String str) {
            this.f440952a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12789b) && L.f(this.f440952a, ((C12789b) obj).f440952a);
        }

        public final int hashCode() {
            return this.f440952a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FilterList(query="), this.f440952a, ')');
        }
    }

    /* compiled from: CategoryListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvn0/b$c;", "Lvn0/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.b$c */
    public static final /* data */ class c implements InterfaceC49357b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f440953a;

        public c(@k DeepLink deepLink) {
            this.f440953a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f440953a, ((c) obj).f440953a);
        }

        public final int hashCode() {
            return this.f440953a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowLink(deepLink="), this.f440953a, ')');
        }
    }

    /* compiled from: CategoryListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvn0/b$d;", "Lvn0/b;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.b$d */
    public static final class d implements InterfaceC49357b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f440954a = new d();
    }

    /* compiled from: CategoryListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvn0/b$e;", "Lvn0/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.b$e */
    public static final /* data */ class e implements InterfaceC49357b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CategoryListItem f440955a;

        public e(@k CategoryListItem categoryListItem) {
            this.f440955a = categoryListItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f440955a, ((e) obj).f440955a);
        }

        public final int hashCode() {
            return this.f440955a.hashCode();
        }

        @k
        public final String toString() {
            return "ItemClicked(item=" + this.f440955a + ')';
        }
    }

    /* compiled from: CategoryListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvn0/b$f;", "Lvn0/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vn0.b$f */
    public static final /* data */ class f implements InterfaceC49357b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f440956a;

        public f(boolean z12) {
            this.f440956a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f440956a == ((f) obj).f440956a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f440956a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("KeyboardVisibilityChanged(isVisible="), this.f440956a, ')');
        }
    }
}
