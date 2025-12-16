package Ay;

import Ay.InterfaceC13103a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditTextFieldOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LAy/c;", "", "a", "b", "LAy/c$a;", "LAy/c$b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface c {

    /* compiled from: EditTextFieldOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAy/c$a;", "LAy/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f753a;

        public a(boolean z12) {
            this.f753a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f753a == ((a) obj).f753a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f753a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("LeaveEditTextFieldScreen(hasChanged="), this.f753a, ')');
        }
    }

    /* compiled from: EditTextFieldOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAy/c$b;", "LAy/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f754a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC13103a.g f755b;

        public b(@k Throwable th2, @k InterfaceC13103a.g gVar) {
            this.f754a = th2;
            this.f755b = gVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f754a, bVar.f754a) && this.f755b.equals(bVar.f755b);
        }

        public final int hashCode() {
            return this.f755b.f741a.hashCode() + (this.f754a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f754a + ", action=" + this.f755b + ')';
        }
    }
}
