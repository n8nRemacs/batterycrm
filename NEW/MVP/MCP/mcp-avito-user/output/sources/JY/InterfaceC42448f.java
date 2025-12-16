package jy;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.edit_address.entity.TimeInterval;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditAddressAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Ljy/f;", "Ljy/a;", "a", "b", "c", "d", "Ljy/f$a;", "Ljy/f$b;", "Ljy/f$c;", "Ljy/f$d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jy.f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC42448f extends InterfaceC42443a {

    /* compiled from: EditAddressAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/f$a;", "Ljy/f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.f$a */
    public static final /* data */ class a implements InterfaceC42448f {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final TimeInterval f405954a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f405955b;

        public a(@l TimeInterval timeInterval, @k String str) {
            this.f405954a = timeInterval;
            this.f405955b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f405954a, aVar.f405954a) && L.f(this.f405955b, aVar.f405955b);
        }

        public final int hashCode() {
            TimeInterval timeInterval = this.f405954a;
            return this.f405955b.hashCode() + ((timeInterval == null ? 0 : timeInterval.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BreakTimeIntervalPicked(selectedInterval=");
            sb2.append(this.f405954a);
            sb2.append(", scheduleId=");
            return C22026a.c(sb2, this.f405955b, ')');
        }
    }

    /* compiled from: EditAddressAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/f$b;", "Ljy/f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.f$b */
    public static final /* data */ class b implements InterfaceC42448f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AddressParameter.Value f405956a;

        public b(@k AddressParameter.Value value) {
            this.f405956a = value;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f405956a, ((b) obj).f405956a);
        }

        public final int hashCode() {
            return this.f405956a.hashCode();
        }

        @k
        public final String toString() {
            return "LocationPicked(address=" + this.f405956a + ')';
        }
    }

    /* compiled from: EditAddressAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/f$c;", "Ljy/f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.f$c */
    public static final /* data */ class c implements InterfaceC42448f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<Integer> f405957a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f405958b;

        public c(@k List<Integer> list, @k String str) {
            this.f405957a = list;
            this.f405958b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f405957a, cVar.f405957a) && L.f(this.f405958b, cVar.f405958b);
        }

        public final int hashCode() {
            return this.f405958b.hashCode() + (this.f405957a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDaysPicked(days=");
            sb2.append(this.f405957a);
            sb2.append(", scheduleId=");
            return C22026a.c(sb2, this.f405958b, ')');
        }
    }

    /* compiled from: EditAddressAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/f$d;", "Ljy/f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.f$d */
    public static final /* data */ class d implements InterfaceC42448f {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final TimeInterval f405959a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f405960b;

        public d(@l TimeInterval timeInterval, @k String str) {
            this.f405959a = timeInterval;
            this.f405960b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f405959a, dVar.f405959a) && L.f(this.f405960b, dVar.f405960b);
        }

        public final int hashCode() {
            TimeInterval timeInterval = this.f405959a;
            return this.f405960b.hashCode() + ((timeInterval == null ? 0 : timeInterval.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WorkTimeIntervalPicked(selectedInterval=");
            sb2.append(this.f405959a);
            sb2.append(", scheduleId=");
            return C22026a.c(sb2, this.f405960b, ')');
        }
    }
}
