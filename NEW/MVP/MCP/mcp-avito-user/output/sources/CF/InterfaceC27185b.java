package cf;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import bf.C25641a;
import com.avito.android.auto_select.confirmation_dialog.ui.models.AutoSelectConfirmationDialogContent;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectBookingInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcf/b;", "", "a", "b", "c", "d", "e", "Lcf/b$a;", "Lcf/b$b;", "Lcf/b$c;", "Lcf/b$d;", "Lcf/b$e;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cf.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC27185b {

    /* compiled from: AutoSelectBookingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf/b$a;", "Lcf/b;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cf.b$a */
    public static final /* data */ class a implements InterfaceC27185b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C25641a f58068a;

        public a(@k C25641a c25641a) {
            this.f58068a = c25641a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f58068a, ((a) obj).f58068a);
        }

        public final int hashCode() {
            return this.f58068a.hashCode();
        }

        @k
        public final String toString() {
            return "CancelBookingSucceeded(result=" + this.f58068a + ')';
        }
    }

    /* compiled from: AutoSelectBookingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf/b$b;", "Lcf/b;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cf.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2053b implements InterfaceC27185b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f58069a;

        public C2053b() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2053b) && this.f58069a == ((C2053b) obj).f58069a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f58069a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CloseDialog(isReloadOnClose="), this.f58069a, ')');
        }

        public C2053b(boolean z12) {
            this.f58069a = z12;
        }

        public /* synthetic */ C2053b(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }

    /* compiled from: AutoSelectBookingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf/b$c;", "Lcf/b;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cf.b$c */
    public static final /* data */ class c implements InterfaceC27185b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f58070a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AutoSelectConfirmationDialogContent f58071b;

        public c(@k String str, @k AutoSelectConfirmationDialogContent autoSelectConfirmationDialogContent) {
            this.f58070a = str;
            this.f58071b = autoSelectConfirmationDialogContent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f58070a, cVar.f58070a) && L.f(this.f58071b, cVar.f58071b);
        }

        public final int hashCode() {
            return this.f58071b.hashCode() + (this.f58070a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ContentLoaded(itemId=" + this.f58070a + ", data=" + this.f58071b + ')';
        }
    }

    /* compiled from: AutoSelectBookingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf/b$d;", "Lcf/b;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cf.b$d */
    public static final /* data */ class d implements InterfaceC27185b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ApiError f58072a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f58073b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f58074c;

        public d() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f58072a, dVar.f58072a) && L.f(this.f58073b, dVar.f58073b) && L.f(this.f58074c, dVar.f58074c);
        }

        public final int hashCode() {
            ApiError apiError = this.f58072a;
            int iHashCode = (apiError == null ? 0 : apiError.hashCode()) * 31;
            Throwable th2 = this.f58073b;
            return this.f58074c.hashCode() + ((iHashCode + (th2 != null ? th2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorOccurred(error=");
            sb2.append(this.f58072a);
            sb2.append(", cause=");
            sb2.append(this.f58073b);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f58074c, ')');
        }

        public d(ApiError apiError, Throwable th2, String str, int i12, C42822w c42822w) {
            apiError = (i12 & 1) != 0 ? null : apiError;
            th2 = (i12 & 2) != 0 ? null : th2;
            if ((i12 & 4) != 0 && (apiError == null || (str = z.i(apiError)) == null)) {
                str = z.l(th2);
            }
            this.f58072a = apiError;
            this.f58073b = th2;
            this.f58074c = str;
        }
    }

    /* compiled from: AutoSelectBookingInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcf/b$e;", "Lcf/b;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cf.b$e */
    public static final class e implements InterfaceC27185b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f58075a = new e();
    }
}
