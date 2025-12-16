package rO0;

import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.virtual_deal_room_reference_category.client_add.model.ClientAddSaveResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientAddInternalAction.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"LrO0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "LrO0/b$a;", "LrO0/b$b;", "LrO0/b$c;", "LrO0/b$d;", "LrO0/b$e;", "LrO0/b$f;", "LrO0/b$g;", "LrO0/b$h;", "LrO0/b$i;", "LrO0/b$j;", "LrO0/b$k;", "LrO0/b$l;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rO0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC47578b {

    /* compiled from: ClientAddInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrO0/b$a;", "LrO0/b;", "<init>", "()V", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.b$a */
    public static final /* data */ class a implements InterfaceC47578b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f429782a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2125595819;
        }

        @Y61.k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ClientAddInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/b$b;", "LrO0/b;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12373b implements InterfaceC47578b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f429783a;

        public C12373b(@Y61.k PrintableText printableText) {
            this.f429783a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12373b) && L.f(this.f429783a, ((C12373b) obj).f429783a);
        }

        public final int hashCode() {
            return this.f429783a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("EmailError(errorText="), this.f429783a, ')');
        }
    }

    /* compiled from: ClientAddInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/b$c;", "LrO0/b;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.b$c */
    public static final /* data */ class c implements InterfaceC47578b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f429784a;

        public c(@Y61.k String str) {
            this.f429784a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f429784a, ((c) obj).f429784a);
        }

        public final int hashCode() {
            return this.f429784a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("EmailInput(text="), this.f429784a, ')');
        }
    }

    /* compiled from: ClientAddInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/b$d;", "LrO0/b;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.b$d */
    public static final /* data */ class d implements InterfaceC47578b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f429785a;

        public d(@Y61.k PrintableText printableText) {
            this.f429785a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f429785a, ((d) obj).f429785a);
        }

        public final int hashCode() {
            return this.f429785a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("NameError(errorText="), this.f429785a, ')');
        }
    }

    /* compiled from: ClientAddInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/b$e;", "LrO0/b;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.b$e */
    public static final /* data */ class e implements InterfaceC47578b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f429786a;

        public e(@Y61.k String str) {
            this.f429786a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f429786a, ((e) obj).f429786a);
        }

        public final int hashCode() {
            return this.f429786a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("NameInput(text="), this.f429786a, ')');
        }
    }

    /* compiled from: ClientAddInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/b$f;", "LrO0/b;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.b$f */
    public static final /* data */ class f implements InterfaceC47578b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f429787a;

        public f(@Y61.k PrintableText printableText) {
            this.f429787a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f429787a, ((f) obj).f429787a);
        }

        public final int hashCode() {
            return this.f429787a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("PhoneError(errorText="), this.f429787a, ')');
        }
    }

    /* compiled from: ClientAddInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/b$g;", "LrO0/b;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.b$g */
    public static final /* data */ class g implements InterfaceC47578b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f429788a;

        public g(@Y61.k String str) {
            this.f429788a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f429788a, ((g) obj).f429788a);
        }

        public final int hashCode() {
            return this.f429788a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhoneInput(text="), this.f429788a, ')');
        }
    }

    /* compiled from: ClientAddInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/b$h;", "LrO0/b;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.b$h */
    public static final /* data */ class h implements InterfaceC47578b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f429789a;

        public h(@Y61.k ApiError apiError) {
            this.f429789a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f429789a, ((h) obj).f429789a);
        }

        public final int hashCode() {
            return this.f429789a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("SaveFailure(error="), this.f429789a, ')');
        }
    }

    /* compiled from: ClientAddInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/b$i;", "LrO0/b;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.b$i */
    public static final /* data */ class i implements InterfaceC47578b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ClientAddSaveResult.Saved f429790a;

        public i(@Y61.k ClientAddSaveResult.Saved saved) {
            this.f429790a = saved;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f429790a, ((i) obj).f429790a);
        }

        public final int hashCode() {
            return this.f429790a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SaveSuccess(saveResult=" + this.f429790a + ')';
        }
    }

    /* compiled from: ClientAddInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrO0/b$j;", "LrO0/b;", "<init>", "()V", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.b$j */
    public static final /* data */ class j implements InterfaceC47578b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f429791a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1917067943;
        }

        @Y61.k
        public final String toString() {
            return "Saving";
        }
    }

    /* compiled from: ClientAddInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/b$k;", "LrO0/b;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.b$k */
    public static final /* data */ class k implements InterfaceC47578b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f429792a;

        public k(@Y61.k PrintableText printableText) {
            this.f429792a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f429792a, ((k) obj).f429792a);
        }

        public final int hashCode() {
            return this.f429792a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("SurnameError(errorText="), this.f429792a, ')');
        }
    }

    /* compiled from: ClientAddInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/b$l;", "LrO0/b;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.b$l */
    public static final /* data */ class l implements InterfaceC47578b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f429793a;

        public l(@Y61.k String str) {
            this.f429793a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f429793a, ((l) obj).f429793a);
        }

        public final int hashCode() {
            return this.f429793a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SurnameInput(text="), this.f429793a, ')');
        }
    }
}
