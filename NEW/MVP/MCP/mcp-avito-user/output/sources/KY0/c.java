package Ky0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_calendar.common.models.UpdatedParametersInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LastMinuteOfferOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LKy0/c;", "", "a", "b", "c", "LKy0/c$a;", "LKy0/c$b;", "LKy0/c$c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: LastMinuteOfferOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKy0/c$a;", "LKy0/c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f9736a;

        public a(boolean z12) {
            this.f9736a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f9736a == ((a) obj).f9736a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f9736a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ClearFocus(isKeyboardVisible="), this.f9736a, ')');
        }
    }

    /* compiled from: LastMinuteOfferOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKy0/c$b;", "LKy0/c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f9737a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final UpdatedParametersInfo f9738b;

        public b(boolean z12, @l UpdatedParametersInfo updatedParametersInfo) {
            this.f9737a = z12;
            this.f9738b = updatedParametersInfo;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9737a == bVar.f9737a && L.f(this.f9738b, bVar.f9738b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f9737a) * 31;
            UpdatedParametersInfo updatedParametersInfo = this.f9738b;
            return iHashCode + (updatedParametersInfo == null ? 0 : updatedParametersInfo.hashCode());
        }

        @k
        public final String toString() {
            return "CloseScreen(updateCalendar=" + this.f9737a + ", updatedParametersInfo=" + this.f9738b + ')';
        }
    }

    /* compiled from: LastMinuteOfferOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKy0/c$c;", "LKy0/c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ky0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0601c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f9739a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f9740b;

        public C0601c(@k PrintableText printableText, @k f fVar) {
            this.f9739a = printableText;
            this.f9740b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0601c)) {
                return false;
            }
            C0601c c0601c = (C0601c) obj;
            return L.f(this.f9739a, c0601c.f9739a) && L.f(this.f9740b, c0601c.f9740b);
        }

        public final int hashCode() {
            return this.f9740b.hashCode() + (this.f9739a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowToast(text=" + this.f9739a + ", type=" + this.f9740b + ')';
        }
    }
}
