package KA;

import KA.a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.extended_profile_selection_create.image.ExtendedProfileSetSelectionImageConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSetSelectionNameOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LKA/b;", "", "a", "b", "c", "LKA/b$a;", "LKA/b$b;", "LKA/b$c;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: ExtendedProfileSetSelectionNameOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKA/b$a;", "LKA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ExtendedProfileSetSelectionImageConfig f9339a;

        public a(@k ExtendedProfileSetSelectionImageConfig extendedProfileSetSelectionImageConfig) {
            this.f9339a = extendedProfileSetSelectionImageConfig;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f9339a, ((a) obj).f9339a);
        }

        public final int hashCode() {
            return this.f9339a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenSetSelectionNameScreen(config=" + this.f9339a + ')';
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKA/b$b;", "LKA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KA.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0559b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f9340a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a.C0558a f9341b;

        public C0559b(@k Throwable th2, @k a.C0558a c0558a) {
            this.f9340a = th2;
            this.f9341b = c0558a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0559b)) {
                return false;
            }
            C0559b c0559b = (C0559b) obj;
            return L.f(this.f9340a, c0559b.f9340a) && L.f(this.f9341b, c0559b.f9341b);
        }

        public final int hashCode() {
            int iHashCode = this.f9340a.hashCode() * 31;
            this.f9341b.getClass();
            return 1465398598 + iHashCode;
        }

        @k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f9340a + ", action=" + this.f9341b + ')';
        }
    }

    /* compiled from: ExtendedProfileSetSelectionNameOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKA/b$c;", "LKA/b;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9342a;

        public c(@k String str) {
            this.f9342a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f9342a, ((c) obj).f9342a);
        }

        public final int hashCode() {
            return this.f9342a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToastBar(message="), this.f9342a, ')');
        }
    }
}
