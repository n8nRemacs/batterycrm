package Pn;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category.ListItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LPn/a;", "", "a", "b", "c", "LPn/a$a;", "LPn/a$b;", "LPn/a$c;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Pn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14813a {

    /* compiled from: CategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPn/a$a;", "LPn/a;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pn.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0862a implements InterfaceC14813a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ListItem f13274a;

        public C0862a(@k ListItem listItem) {
            this.f13274a = listItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0862a) && L.f(this.f13274a, ((C0862a) obj).f13274a);
        }

        public final int hashCode() {
            return this.f13274a.hashCode();
        }

        @k
        public final String toString() {
            return "CategoryClicked(item=" + this.f13274a + ')';
        }
    }

    /* compiled from: CategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPn/a$b;", "LPn/a;", "<init>", "()V", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pn.a$b */
    public static final /* data */ class b implements InterfaceC14813a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13275a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1745671087;
        }

        @k
        public final String toString() {
            return "CloseClicked";
        }
    }

    /* compiled from: CategoryAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPn/a$c;", "LPn/a;", "<init>", "()V", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Pn.a$c */
    public static final /* data */ class c implements InterfaceC14813a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f13276a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1205682593;
        }

        @k
        public final String toString() {
            return "RetryClicked";
        }
    }
}
