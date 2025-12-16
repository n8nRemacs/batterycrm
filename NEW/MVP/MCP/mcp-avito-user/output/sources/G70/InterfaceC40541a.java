package g70;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PersonalFiltersChangeDialogAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lg70/a;", "", "a", "b", "Lg70/a$a;", "Lg70/a$b;", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g70.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC40541a {

    /* compiled from: PersonalFiltersChangeDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg70/a$a;", "Lg70/a;", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g70.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11192a implements InterfaceC40541a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f396323a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f396324b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f396325c;

        public C11192a(boolean z12, @k LinkedHashMap linkedHashMap, @k DeepLink deepLink) {
            this.f396323a = z12;
            this.f396324b = linkedHashMap;
            this.f396325c = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11192a)) {
                return false;
            }
            C11192a c11192a = (C11192a) obj;
            return this.f396323a == c11192a.f396323a && this.f396324b.equals(c11192a.f396324b) && L.f(this.f396325c, c11192a.f396325c);
        }

        public final int hashCode() {
            return this.f396325c.hashCode() + ((this.f396324b.hashCode() + (Boolean.hashCode(this.f396323a) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ApplyButtonClicked(disableUpdateTracking=");
            sb2.append(this.f396323a);
            sb2.append(", params=");
            sb2.append(this.f396324b);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f396325c, ')');
        }
    }

    /* compiled from: PersonalFiltersChangeDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg70/a$b;", "Lg70/a;", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: g70.a$b */
    public static final /* data */ class b implements InterfaceC40541a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f396326a;

        public b(boolean z12) {
            this.f396326a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f396326a == ((b) obj).f396326a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f396326a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("LeaveAsIsButtonClicked(disableUpdateTracking="), this.f396326a, ')');
        }
    }
}
