package jN;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.imv_services.ImvServicesFeedback;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvServicesDialogAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LjN/a;", "", "a", "b", "LjN/a$a;", "LjN/a$b;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jN.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC42286a {

    /* compiled from: ImvServicesDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjN/a$a;", "LjN/a;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jN.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11562a implements InterfaceC42286a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f405585a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f405586b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Float f405587c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ImvServicesFeedback f405588d;

        public C11562a(@l ImvServicesFeedback imvServicesFeedback, @l Float f12, @l Integer num, @k String str) {
            this.f405585a = num;
            this.f405586b = str;
            this.f405587c = f12;
            this.f405588d = imvServicesFeedback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11562a)) {
                return false;
            }
            C11562a c11562a = (C11562a) obj;
            return L.f(this.f405585a, c11562a.f405585a) && L.f(this.f405586b, c11562a.f405586b) && L.f(this.f405587c, c11562a.f405587c) && L.f(this.f405588d, c11562a.f405588d);
        }

        public final int hashCode() {
            Integer num = this.f405585a;
            int iD2 = H.d((num == null ? 0 : num.hashCode()) * 31, 31, this.f405586b);
            Float f12 = this.f405587c;
            int iHashCode = (iD2 + (f12 == null ? 0 : f12.hashCode())) * 31;
            ImvServicesFeedback imvServicesFeedback = this.f405588d;
            return iHashCode + (imvServicesFeedback != null ? imvServicesFeedback.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OnFeedbackNegativeButtonClicked(answerId=" + this.f405585a + ", serviceName=" + this.f405586b + ", priceOrigin=" + this.f405587c + ", feedback=" + this.f405588d + ')';
        }
    }

    /* compiled from: ImvServicesDialogAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjN/a$b;", "LjN/a;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jN.a$b */
    public static final /* data */ class b implements InterfaceC42286a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f405589a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f405590b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Float f405591c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ImvServicesFeedback f405592d;

        public b(@l ImvServicesFeedback imvServicesFeedback, @l Float f12, @l Integer num, @k String str) {
            this.f405589a = num;
            this.f405590b = str;
            this.f405591c = f12;
            this.f405592d = imvServicesFeedback;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f405589a, bVar.f405589a) && L.f(this.f405590b, bVar.f405590b) && L.f(this.f405591c, bVar.f405591c) && L.f(this.f405592d, bVar.f405592d);
        }

        public final int hashCode() {
            Integer num = this.f405589a;
            int iD2 = H.d((num == null ? 0 : num.hashCode()) * 31, 31, this.f405590b);
            Float f12 = this.f405591c;
            int iHashCode = (iD2 + (f12 == null ? 0 : f12.hashCode())) * 31;
            ImvServicesFeedback imvServicesFeedback = this.f405592d;
            return iHashCode + (imvServicesFeedback != null ? imvServicesFeedback.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OnFeedbackPositiveButtonClicked(answerId=" + this.f405589a + ", serviceName=" + this.f405590b + ", priceOrigin=" + this.f405591c + ", feedback=" + this.f405592d + ')';
        }
    }
}
