package vI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import uI.C48901b;
import uI.C48904e;

/* compiled from: HistoricalSuggestsAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LvI/a;", "", "a", "b", "c", "d", "e", "LvI/a$a;", "LvI/a$b;", "LvI/a$c;", "LvI/a$d;", "LvI/a$e;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC49216a {

    /* compiled from: HistoricalSuggestsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvI/a$a;", "LvI/a;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vI.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12761a implements InterfaceC49216a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C48904e f440648a;

        public C12761a(@k C48904e c48904e) {
            this.f440648a = c48904e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12761a) && L.f(this.f440648a, ((C12761a) obj).f440648a);
        }

        public final int hashCode() {
            return this.f440648a.hashCode();
        }

        @k
        public final String toString() {
            return "ExpandBlock(block=" + this.f440648a + ')';
        }
    }

    /* compiled from: HistoricalSuggestsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvI/a$b;", "LvI/a;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vI.a$b */
    public static final /* data */ class b implements InterfaceC49216a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Long f440649a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f440650b;

        public b(@l Long l12, boolean z12) {
            this.f440649a = l12;
            this.f440650b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f440649a, bVar.f440649a) && this.f440650b == bVar.f440650b;
        }

        public final int hashCode() {
            Long l12 = this.f440649a;
            return Boolean.hashCode(this.f440650b) + ((l12 == null ? 0 : l12.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadData(categoryId=");
            sb2.append(this.f440649a);
            sb2.append(", isPublish=");
            return r.x(sb2, this.f440650b, ')');
        }
    }

    /* compiled from: HistoricalSuggestsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvI/a$c;", "LvI/a;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vI.a$c */
    public static final /* data */ class c implements InterfaceC49216a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C48901b f440651a;

        public c(@k C48901b c48901b) {
            this.f440651a = c48901b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f440651a, ((c) obj).f440651a);
        }

        public final int hashCode() {
            return this.f440651a.hashCode();
        }

        @k
        public final String toString() {
            return "SelectAddress(suggestion=" + this.f440651a + ')';
        }
    }

    /* compiled from: HistoricalSuggestsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvI/a$d;", "LvI/a;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vI.a$d */
    public static final /* data */ class d implements InterfaceC49216a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AddressParameter.Value f440652a;

        public d(@k AddressParameter.Value value) {
            this.f440652a = value;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f440652a, ((d) obj).f440652a);
        }

        public final int hashCode() {
            return this.f440652a.hashCode();
        }

        @k
        public final String toString() {
            return "SelectAddressValue(address=" + this.f440652a + ')';
        }
    }

    /* compiled from: HistoricalSuggestsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LvI/a$e;", "LvI/a;", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vI.a$e */
    public static final /* data */ class e implements InterfaceC49216a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f440653a;

        public e(boolean z12) {
            this.f440653a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f440653a == ((e) obj).f440653a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f440653a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ShowUi(isShow="), this.f440653a, ')');
        }
    }
}
