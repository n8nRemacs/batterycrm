package jy;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.edit_address.entity.AddressCoordinates;
import com.avito.android.edit_address.entity.AddressDaysArray;
import com.avito.android.edit_address.entity.AddressWorkSchedule;
import com.avito.android.profile_settings_extended.entity.CommonValueId;
import com.avito.android.util.C35755b0;
import dy.InterfaceC39826b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EditAddressState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljy/d;", "", "a", "b", "c", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jy.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C42446d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final b f405933c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C42446d f405934d;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f405935a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f405936b;

    /* compiled from: EditAddressState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljy/d$b;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.d$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        C42822w c42822w = null;
        f405933c = new b(c42822w);
        C42784z0 c42784z0 = C42784z0.f406748b;
        f405934d = new C42446d(new c(c42784z0, false, 2, c42822w), new a(new CommonValueId("", ""), null, null, null, null, c42784z0, false, false, 222, null));
    }

    public C42446d(@k c cVar, @k a aVar) {
        this.f405935a = cVar;
        this.f405936b = aVar;
    }

    public static C42446d a(C42446d c42446d, c cVar) {
        a aVar = c42446d.f405936b;
        c42446d.getClass();
        return new C42446d(cVar, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42446d)) {
            return false;
        }
        C42446d c42446d = (C42446d) obj;
        return L.f(this.f405935a, c42446d.f405935a) && L.f(this.f405936b, c42446d.f405936b);
    }

    public final int hashCode() {
        return this.f405936b.hashCode() + (this.f405935a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "EditAddressState(screenState=" + this.f405935a + ", data=" + this.f405936b + ')';
    }

    /* compiled from: EditAddressState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/d$c;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.d$c */
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<InterfaceC39826b> f405945a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f405946b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@k List<? extends InterfaceC39826b> list, boolean z12) {
            this.f405945a = list;
            this.f405946b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f405945a, cVar.f405945a) && this.f405946b == cVar.f405946b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f405946b) + (this.f405945a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScreenState(items=");
            sb2.append(this.f405945a);
            sb2.append(", isButtonLoading=");
            return r.x(sb2, this.f405946b, ')');
        }

        public /* synthetic */ c(List list, boolean z12, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? false : z12);
        }
    }

    /* compiled from: EditAddressState.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljy/d$a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jy.d$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CommonValueId f405937a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f405938b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AddressCoordinates f405939c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f405940d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f405941e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<AddressWorkSchedule> f405942f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f405943g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f405944h;

        public a(@k CommonValueId commonValueId, @l String str, @l AddressCoordinates addressCoordinates, @l String str2, @l String str3, @k List<AddressWorkSchedule> list, boolean z12, boolean z13) {
            this.f405937a = commonValueId;
            this.f405938b = str;
            this.f405939c = addressCoordinates;
            this.f405940d = str2;
            this.f405941e = str3;
            this.f405942f = list;
            this.f405943g = z12;
            this.f405944h = z13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, String str, AddressCoordinates addressCoordinates, ArrayList arrayList, boolean z12, boolean z13, int i12) {
            if ((i12 & 2) != 0) {
                str = aVar.f405938b;
            }
            String str2 = str;
            if ((i12 & 4) != 0) {
                addressCoordinates = aVar.f405939c;
            }
            AddressCoordinates addressCoordinates2 = addressCoordinates;
            String str3 = (i12 & 8) != 0 ? aVar.f405940d : null;
            String str4 = (i12 & 16) != 0 ? aVar.f405941e : null;
            List list = arrayList;
            if ((i12 & 32) != 0) {
                list = aVar.f405942f;
            }
            List list2 = list;
            if ((i12 & 64) != 0) {
                z12 = aVar.f405943g;
            }
            boolean z14 = z12;
            if ((i12 & 128) != 0) {
                z13 = aVar.f405944h;
            }
            return new a(aVar.f405937a, str2, addressCoordinates2, str3, str4, list2, z14, z13);
        }

        @k
        public final ArrayList b() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = this.f405942f.iterator();
            while (it.hasNext()) {
                AddressDaysArray addressDaysArray = ((AddressWorkSchedule) it.next()).f145897d;
                if (addressDaysArray != null) {
                    linkedHashSet.addAll(addressDaysArray.c());
                }
            }
            return C35755b0.a(linkedHashSet);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f405937a, aVar.f405937a) && L.f(this.f405938b, aVar.f405938b) && L.f(this.f405939c, aVar.f405939c) && L.f(this.f405940d, aVar.f405940d) && L.f(this.f405941e, aVar.f405941e) && L.f(this.f405942f, aVar.f405942f) && this.f405943g == aVar.f405943g && this.f405944h == aVar.f405944h;
        }

        public final int hashCode() {
            int iHashCode = this.f405937a.hashCode() * 31;
            String str = this.f405938b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AddressCoordinates addressCoordinates = this.f405939c;
            int iHashCode3 = (iHashCode2 + (addressCoordinates == null ? 0 : addressCoordinates.hashCode())) * 31;
            String str2 = this.f405940d;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f405941e;
            return Boolean.hashCode(this.f405944h) + r.i(H.e((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f405942f), 31, this.f405943g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddressData(id=");
            sb2.append(this.f405937a);
            sb2.append(", formattedAddress=");
            sb2.append(this.f405938b);
            sb2.append(", coordinates=");
            sb2.append(this.f405939c);
            sb2.append(", entrance=");
            sb2.append(this.f405940d);
            sb2.append(", comment=");
            sb2.append(this.f405941e);
            sb2.append(", schedule=");
            sb2.append(this.f405942f);
            sb2.append(", withScheduleValidation=");
            sb2.append(this.f405943g);
            sb2.append(", withLocationValidation=");
            return r.x(sb2, this.f405944h, ')');
        }

        public /* synthetic */ a(CommonValueId commonValueId, String str, AddressCoordinates addressCoordinates, String str2, String str3, List list, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(commonValueId, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : addressCoordinates, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, list, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? false : z13);
        }
    }
}
