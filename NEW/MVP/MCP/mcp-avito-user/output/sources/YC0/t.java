package yc0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.phones.PhoneValue;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lyc0/t;", "Lyc0/D;", "a", "b", "c", "d", "e", "f", "Lyc0/t$a;", "Lyc0/t$b;", "Lyc0/t$c;", "Lyc0/t$d;", "Lyc0/t$e;", "Lyc0/t$f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface t extends D {

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/t$a;", "Lyc0/t;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements t {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443339a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f443340b;

        public a(@Y61.k String str, @Y61.k String str2) {
            this.f443339a = str;
            this.f443340b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f443339a, aVar.f443339a) && L.f(this.f443340b, aVar.f443340b);
        }

        public final int hashCode() {
            return this.f443340b.hashCode() + (this.f443339a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnPhoneAddedForReplacement(phone=");
            sb2.append(this.f443339a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f443340b, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/t$b;", "Lyc0/t;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements t {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PhoneValue f443341a;

        public b(@Y61.k PhoneValue phoneValue) {
            this.f443341a = phoneValue;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443341a, ((b) obj).f443341a);
        }

        public final int hashCode() {
            return this.f443341a.f229694b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnPhoneReplacementAction(phoneToBeReplaced=" + this.f443341a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/t$c;", "Lyc0/t;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements t {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443342a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f443343b;

        public c(@Y61.k String str, @Y61.k String str2) {
            this.f443342a = str;
            this.f443343b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f443342a, cVar.f443342a) && L.f(this.f443343b, cVar.f443343b);
        }

        public final int hashCode() {
            return this.f443343b.hashCode() + (this.f443342a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnRetryAddPhoneClicked(phone=");
            sb2.append(this.f443342a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f443343b, ')');
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/t$d;", "Lyc0/t;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements t {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f443344a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f443345b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final PhoneValue f443346c;

        public d(@Y61.k String str, @Y61.k String str2, @Y61.k PhoneValue phoneValue) {
            this.f443344a = str;
            this.f443345b = str2;
            this.f443346c = phoneValue;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f443344a, dVar.f443344a) && L.f(this.f443345b, dVar.f443345b) && L.f(this.f443346c, dVar.f443346c);
        }

        public final int hashCode() {
            return this.f443346c.f229694b.hashCode() + H.d(this.f443344a.hashCode() * 31, 31, this.f443345b);
        }

        @Y61.k
        public final String toString() {
            return "OnRetryReplacePhoneClicked(phone=" + this.f443344a + ", message=" + this.f443345b + ", phoneToBeReplaced=" + this.f443346c + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/t$e;", "Lyc0/t;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements t {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PhoneValue f443347a;

        public e(@Y61.k PhoneValue phoneValue) {
            this.f443347a = phoneValue;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f443347a, ((e) obj).f443347a);
        }

        public final int hashCode() {
            return this.f443347a.f229694b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PhoneWidgetClick(phoneValue=" + this.f443347a + ')';
        }
    }

    /* compiled from: ExtendedProfileSettingsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/t$f;", "Lyc0/t;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements t {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PhoneValue f443348a;

        public f(@Y61.k PhoneValue phoneValue) {
            this.f443348a = phoneValue;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f443348a, ((f) obj).f443348a);
        }

        public final int hashCode() {
            return this.f443348a.f229694b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PhoneWidgetMoreButtonClick(phoneValue=" + this.f443348a + ')';
        }
    }
}
