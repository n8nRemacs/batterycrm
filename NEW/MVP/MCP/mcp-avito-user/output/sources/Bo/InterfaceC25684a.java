package bo;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TreeAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lbo/a;", "", "a", "Lbo/a$a;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bo.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC25684a {

    /* compiled from: TreeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbo/a$a;", "Lbo/a;", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bo.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2015a implements InterfaceC25684a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57441a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f57442b;

        /* renamed from: c, reason: collision with root package name */
        public final int f57443c;

        public C2015a(@k String str, @k String str2, int i12) {
            this.f57441a = str;
            this.f57442b = str2;
            this.f57443c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2015a)) {
                return false;
            }
            C2015a c2015a = (C2015a) obj;
            return L.f(this.f57441a, c2015a.f57441a) && L.f(this.f57442b, c2015a.f57442b) && this.f57443c == c2015a.f57443c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57443c) + H.d(this.f57441a.hashCode() * 31, 31, this.f57442b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TreeItemClick(title=");
            sb2.append(this.f57441a);
            sb2.append(", categoryId=");
            sb2.append(this.f57442b);
            sb2.append(", level=");
            return r.t(sb2, this.f57443c, ')');
        }
    }
}
