package Yn;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryItemsAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LYn/a;", "", "a", "b", "LYn/a$a;", "LYn/a$b;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC18301a {

    /* compiled from: CategoryItemsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYn/a$a;", "LYn/a;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yn.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1403a implements InterfaceC18301a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f19648a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f19649b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f19650c;

        public C1403a(@k String str, boolean z12, @k DeepLink deepLink) {
            this.f19648a = str;
            this.f19649b = z12;
            this.f19650c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1403a)) {
                return false;
            }
            C1403a c1403a = (C1403a) obj;
            return L.f(this.f19648a, c1403a.f19648a) && this.f19649b == c1403a.f19649b && L.f(this.f19650c, c1403a.f19650c);
        }

        public final int hashCode() {
            return this.f19650c.hashCode() + r.i(this.f19648a.hashCode() * 31, 31, this.f19649b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnItemClick(itemId=");
            sb2.append(this.f19648a);
            sb2.append(", isEnabled=");
            sb2.append(this.f19649b);
            sb2.append(", editDeepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f19650c, ')');
        }
    }

    /* compiled from: CategoryItemsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYn/a$b;", "LYn/a;", "<init>", "()V", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yn.a$b */
    public static final /* data */ class b implements InterfaceC18301a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f19651a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1988793284;
        }

        @k
        public final String toString() {
            return "ScrolledToBottom";
        }
    }
}
