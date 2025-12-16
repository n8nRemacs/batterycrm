package gf;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeContact;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectContactMeAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lgf/a;", "", "a", "b", "c", "d", "Lgf/a$a;", "Lgf/a$b;", "Lgf/a$c;", "Lgf/a$d;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC40670a {

    /* compiled from: AutoSelectContactMeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgf/a$a;", "Lgf/a;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gf.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11218a implements InterfaceC40670a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11218a f396668a = new C11218a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11218a);
        }

        public final int hashCode() {
            return -781358352;
        }

        @k
        public final String toString() {
            return "CancelClick";
        }
    }

    /* compiled from: AutoSelectContactMeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgf/a$b;", "Lgf/a;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gf.a$b */
    public static final /* data */ class b implements InterfaceC40670a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AutoSelectContactMeContact f396669a;

        public b(@k AutoSelectContactMeContact autoSelectContactMeContact) {
            this.f396669a = autoSelectContactMeContact;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f396669a, ((b) obj).f396669a);
        }

        public final int hashCode() {
            return this.f396669a.hashCode();
        }

        @k
        public final String toString() {
            return "ContactClicked(contact=" + this.f396669a + ')';
        }
    }

    /* compiled from: AutoSelectContactMeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgf/a$c;", "Lgf/a;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gf.a$c */
    public static final /* data */ class c implements InterfaceC40670a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f396670a;

        public c(@k DeepLink deepLink) {
            this.f396670a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f396670a, ((c) obj).f396670a);
        }

        public final int hashCode() {
            return this.f396670a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeepLinkClicked(deepLink="), this.f396670a, ')');
        }
    }

    /* compiled from: AutoSelectContactMeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgf/a$d;", "Lgf/a;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gf.a$d */
    public static final /* data */ class d implements InterfaceC40670a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f396671a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2004316319;
        }

        @k
        public final String toString() {
            return "OutsideClick";
        }
    }
}
