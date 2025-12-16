package TM0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.verification.verification_form_builder.FormBuilderScreenData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormBuilderAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LTM0/a;", "", "a", "b", "c", "d", "e", "f", "g", "LTM0/a$a;", "LTM0/a$b;", "LTM0/a$c;", "LTM0/a$d;", "LTM0/a$e;", "LTM0/a$f;", "LTM0/a$g;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: FormBuilderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTM0/a$a;", "LTM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: TM0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1065a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final FormBuilderScreenData.Button f15610a;

        public C1065a(@k FormBuilderScreenData.Button button) {
            this.f15610a = button;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1065a) && L.f(this.f15610a, ((C1065a) obj).f15610a);
        }

        public final int hashCode() {
            return this.f15610a.hashCode();
        }

        @k
        public final String toString() {
            return "ButtonClick(button=" + this.f15610a + ')';
        }
    }

    /* compiled from: FormBuilderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTM0/a$b;", "LTM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f15611a;

        public b(@k DeepLink deepLink) {
            this.f15611a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f15611a, ((b) obj).f15611a);
        }

        public final int hashCode() {
            return this.f15611a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClick(deeplink="), this.f15611a, ')');
        }
    }

    /* compiled from: FormBuilderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTM0/a$c;", "LTM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f15612a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15613b;

        public c(@k DeepLink deepLink, boolean z12) {
            this.f15612a = deepLink;
            this.f15613b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f15612a, cVar.f15612a) && this.f15613b == cVar.f15613b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f15613b) + (this.f15612a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeeplinkLoading(link=");
            sb2.append(this.f15612a);
            sb2.append(", isLoading=");
            return r.x(sb2, this.f15613b, ')');
        }
    }

    /* compiled from: FormBuilderAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTM0/a$d;", "LTM0/a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f15614a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1201637085;
        }

        @k
        public final String toString() {
            return "HomeClick";
        }
    }

    /* compiled from: FormBuilderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTM0/a$e;", "LTM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.conveyor_item.a f15615a;

        public e(@k com.avito.conveyor_item.a aVar) {
            this.f15615a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f15615a, ((e) obj).f15615a);
        }

        public final int hashCode() {
            return this.f15615a.hashCode();
        }

        @k
        public final String toString() {
            return "ItemClick(item=" + this.f15615a + ')';
        }
    }

    /* compiled from: FormBuilderAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTM0/a$f;", "LTM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f15616a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ParcelableEntity<String>> f15617b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(@k String str, @k List<? extends ParcelableEntity<String>> list) {
            this.f15616a = str;
            this.f15617b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f15616a, fVar.f15616a) && L.f(this.f15617b, fVar.f15617b);
        }

        public final int hashCode() {
            return this.f15617b.hashCode() + (this.f15616a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnSelected(requestId=");
            sb2.append(this.f15616a);
            sb2.append(", selectedItems=");
            return H.p(sb2, this.f15617b, ')');
        }
    }

    /* compiled from: FormBuilderAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTM0/a$g;", "LTM0/a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f15618a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1296172876;
        }

        @k
        public final String toString() {
            return "RetryClick";
        }
    }
}
