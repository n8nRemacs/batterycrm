package gf;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeContact;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectContactMeState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgf/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gf.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C40672c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f396674b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<AutoSelectContactMeContact> f396675c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AutoSelectContactMeContact f396676d;

    public C40672c() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40672c)) {
            return false;
        }
        C40672c c40672c = (C40672c) obj;
        return L.f(this.f396674b, c40672c.f396674b) && L.f(this.f396675c, c40672c.f396675c) && L.f(this.f396676d, c40672c.f396676d);
    }

    public final int hashCode() {
        int iE2 = H.e(this.f396674b.hashCode() * 31, 31, this.f396675c);
        AutoSelectContactMeContact autoSelectContactMeContact = this.f396676d;
        return iE2 + (autoSelectContactMeContact == null ? 0 : autoSelectContactMeContact.hashCode());
    }

    @k
    public final String toString() {
        return "AutoSelectContactMeState(advertId=" + this.f396674b + ", contacts=" + this.f396675c + ", selectedContact=" + this.f396676d + ')';
    }

    public C40672c(String str, List list, AutoSelectContactMeContact autoSelectContactMeContact, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? null : autoSelectContactMeContact);
    }

    public C40672c(@k String str, @k List<AutoSelectContactMeContact> list, @l AutoSelectContactMeContact autoSelectContactMeContact) {
        this.f396674b = str;
        this.f396675c = list;
        this.f396676d = autoSelectContactMeContact;
    }
}
