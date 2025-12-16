package LM0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.inn.list.select.SelectItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmRequisitesAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LLM0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LLM0/a$a;", "LLM0/a$b;", "LLM0/a$c;", "LLM0/a$d;", "LLM0/a$e;", "LLM0/a$f;", "LLM0/a$g;", "LLM0/a$h;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: ConfirmRequisitesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLM0/a$a;", "LLM0/a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: LM0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0611a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0611a f9924a = new C0611a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0611a);
        }

        public final int hashCode() {
            return -1661679457;
        }

        @k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: ConfirmRequisitesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLM0/a$b;", "LLM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9925a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ParcelableEntity<String>> f9926b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@k String str, @k List<? extends ParcelableEntity<String>> list) {
            this.f9925a = str;
            this.f9926b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f9925a, bVar.f9925a) && L.f(this.f9926b, bVar.f9926b);
        }

        public final int hashCode() {
            return this.f9926b.hashCode() + (this.f9925a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetItemSelect(requestId=");
            sb2.append(this.f9925a);
            sb2.append(", selectedItems=");
            return H.p(sb2, this.f9926b, ')');
        }
    }

    /* compiled from: ConfirmRequisitesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLM0/a$c;", "LLM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ButtonItem f9927a;

        public c(@k ButtonItem buttonItem) {
            this.f9927a = buttonItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f9927a, ((c) obj).f9927a);
        }

        public final int hashCode() {
            return this.f9927a.hashCode();
        }

        @k
        public final String toString() {
            return "ButtonClick(item=" + this.f9927a + ')';
        }
    }

    /* compiled from: ConfirmRequisitesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLM0/a$d;", "LLM0/a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {
    }

    /* compiled from: ConfirmRequisitesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLM0/a$e;", "LLM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f9928a;

        public e(@k DeepLink deepLink) {
            this.f9928a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f9928a, ((e) obj).f9928a);
        }

        public final int hashCode() {
            return this.f9928a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClick(deeplink="), this.f9928a, ')');
        }
    }

    /* compiled from: ConfirmRequisitesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLM0/a$f;", "LLM0/a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements a {
    }

    /* compiled from: ConfirmRequisitesAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLM0/a$g;", "LLM0/a;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f9929a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1232212930;
        }

        @k
        public final String toString() {
            return "RetryClick";
        }
    }

    /* compiled from: ConfirmRequisitesAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLM0/a$h;", "LLM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SelectItem f9930a;

        public h(@k SelectItem selectItem) {
            this.f9930a = selectItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f9930a, ((h) obj).f9930a);
        }

        public final int hashCode() {
            return this.f9930a.hashCode();
        }

        @k
        public final String toString() {
            return "SelectItemClick(item=" + this.f9930a + ')';
        }
    }
}
