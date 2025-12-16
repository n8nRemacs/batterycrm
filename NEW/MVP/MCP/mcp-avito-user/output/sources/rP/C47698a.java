package rp;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.deeplink.OrderCallDeeplink;
import com.avito.android.remote.model.UniversalImage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SubmittingSelectModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47698a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f430188a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430189b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final UniversalImage f430190c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<C47699b> f430191d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f430192e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final OrderCallDeeplink f430193f;

    public C47698a(@k String str, @k String str2, @l UniversalImage universalImage, @k List list, @k String str3, @l OrderCallDeeplink orderCallDeeplink) {
        this.f430188a = str;
        this.f430189b = str2;
        this.f430190c = universalImage;
        this.f430191d = list;
        this.f430192e = str3;
        this.f430193f = orderCallDeeplink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47698a)) {
            return false;
        }
        C47698a c47698a = (C47698a) obj;
        return this.f430188a.equals(c47698a.f430188a) && L.f(this.f430189b, c47698a.f430189b) && this.f430190c.equals(c47698a.f430190c) && L.f(this.f430191d, c47698a.f430191d) && L.f(this.f430192e, c47698a.f430192e) && L.f(this.f430193f, c47698a.f430193f);
    }

    public final int hashCode() {
        int iD2 = H.d(H.e(com.avito.android.actions_sheet.a.a(H.d(this.f430188a.hashCode() * 31, 31, this.f430189b), 31, this.f430190c), 31, this.f430191d), 31, this.f430192e);
        OrderCallDeeplink orderCallDeeplink = this.f430193f;
        return iD2 + (orderCallDeeplink == null ? 0 : orderCallDeeplink.hashCode());
    }

    @k
    public final String toString() {
        return "DealSelectItem(id=" + this.f430188a + ", title=" + this.f430189b + ", image=" + this.f430190c + ", descriptions=" + this.f430191d + ", proceedButtonText=" + this.f430192e + ", nextLink=" + this.f430193f + ')';
    }
}
