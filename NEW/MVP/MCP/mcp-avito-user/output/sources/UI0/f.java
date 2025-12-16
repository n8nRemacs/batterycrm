package Ui0;

import Ui0.InterfaceC15526b;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.referral_contacts.contacts_list.ContactItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReferralContactsUiState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUi0/f;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class f extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<ContactItem> f16569b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f16570c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f16571d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f16572e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f16573f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f16574g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C15525a f16575h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC15526b f16576i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final C15527c f16577j;

    public f() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f a(f fVar, ArrayList arrayList, String str, String str2, C15525a c15525a, InterfaceC15526b interfaceC15526b, C15527c c15527c, int i12) {
        List list = (i12 & 1) != 0 ? fVar.f16569b : arrayList;
        String str3 = (i12 & 2) != 0 ? fVar.f16570c : str;
        String str4 = fVar.f16571d;
        String str5 = fVar.f16572e;
        String str6 = fVar.f16573f;
        String str7 = (i12 & 32) != 0 ? fVar.f16574g : str2;
        C15525a c15525a2 = (i12 & 64) != 0 ? fVar.f16575h : c15525a;
        InterfaceC15526b interfaceC15526b2 = (i12 & 128) != 0 ? fVar.f16576i : interfaceC15526b;
        C15527c c15527c2 = (i12 & 256) != 0 ? fVar.f16577j : c15527c;
        fVar.getClass();
        return new f(list, str3, str4, str5, str6, str7, c15525a2, interfaceC15526b2, c15527c2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f16569b, fVar.f16569b) && L.f(this.f16570c, fVar.f16570c) && L.f(this.f16571d, fVar.f16571d) && L.f(this.f16572e, fVar.f16572e) && L.f(this.f16573f, fVar.f16573f) && L.f(this.f16574g, fVar.f16574g) && L.f(this.f16575h, fVar.f16575h) && L.f(this.f16576i, fVar.f16576i) && L.f(this.f16577j, fVar.f16577j);
    }

    public final int hashCode() {
        int iHashCode = (this.f16576i.hashCode() + ((this.f16575h.hashCode() + H.d(H.d(H.d(H.d(H.d(this.f16569b.hashCode() * 31, 31, this.f16570c), 31, this.f16571d), 31, this.f16572e), 31, this.f16573f), 31, this.f16574g)) * 31)) * 31;
        C15527c c15527c = this.f16577j;
        return iHashCode + (c15527c == null ? 0 : c15527c.hashCode());
    }

    @k
    public final String toString() {
        return "ReferralContactsUiState(contacts=" + this.f16569b + ", predicate=" + this.f16570c + ", toolbarText=" + this.f16571d + ", title=" + this.f16572e + ", subtitle=" + this.f16573f + ", searchBarHint=" + this.f16574g + ", button=" + this.f16575h + ", loadState=" + this.f16576i + ", placeholder=" + this.f16577j + ')';
    }

    public f(@k List<ContactItem> list, @k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k C15525a c15525a, @k InterfaceC15526b interfaceC15526b, @l C15527c c15527c) {
        this.f16569b = list;
        this.f16570c = str;
        this.f16571d = str2;
        this.f16572e = str3;
        this.f16573f = str4;
        this.f16574g = str5;
        this.f16575h = c15525a;
        this.f16576i = interfaceC15526b;
        this.f16577j = c15527c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(List list, String str, String str2, String str3, String str4, String str5, C15525a c15525a, InterfaceC15526b interfaceC15526b, C15527c c15527c, int i12, C42822w c42822w) {
        C15525a c15525a2;
        List list2 = (i12 & 1) != 0 ? C42784z0.f406748b : list;
        String str6 = (i12 & 2) != 0 ? "" : str;
        String str7 = (i12 & 4) != 0 ? "" : str2;
        String str8 = (i12 & 8) != 0 ? "" : str3;
        String str9 = (i12 & 16) != 0 ? "" : str4;
        String str10 = (i12 & 32) == 0 ? str5 : "";
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if ((i12 & 64) != 0) {
            c15525a2 = new C15525a(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        } else {
            c15525a2 = c15525a;
        }
        this(list2, str6, str7, str8, str9, str10, c15525a2, (i12 & 128) != 0 ? InterfaceC15526b.c.f16560a : interfaceC15526b, (i12 & 256) == 0 ? c15527c : null);
    }
}
