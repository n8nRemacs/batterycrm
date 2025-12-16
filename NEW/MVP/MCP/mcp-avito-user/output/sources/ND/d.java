package Nd;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AuctionState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LNd/d;", "", "a", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class d {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f11644i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final d f11645j;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11646a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f11647b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f11648c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f11649d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f11650e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f11651f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f11652g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11653h;

    /* compiled from: AuctionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNd/d$a;", "", "<init>", "()V", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f11645j = new d(true, c42784z0, c42784z0, null, null, null, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(boolean z12, @k List<? extends ParcelableItem> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @l String str, @l String str2, @l AttributedText attributedText, @l String str3, boolean z13) {
        this.f11646a = z12;
        this.f11647b = list;
        this.f11648c = list2;
        this.f11649d = str;
        this.f11650e = str2;
        this.f11651f = attributedText;
        this.f11652g = str3;
        this.f11653h = z13;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public static d a(d dVar, boolean z12, String str, boolean z13, int i12) {
        if ((i12 & 1) != 0) {
            z12 = dVar.f11646a;
        }
        boolean z14 = z12;
        ?? r22 = dVar.f11647b;
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> list = dVar.f11648c;
        String str2 = dVar.f11649d;
        String str3 = dVar.f11650e;
        AttributedText attributedText = dVar.f11651f;
        if ((i12 & 64) != 0) {
            str = dVar.f11652g;
        }
        dVar.getClass();
        return new d(z14, r22, list, str2, str3, attributedText, str, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f11646a == dVar.f11646a && L.f(this.f11647b, dVar.f11647b) && L.f(this.f11648c, dVar.f11648c) && L.f(this.f11649d, dVar.f11649d) && L.f(this.f11650e, dVar.f11650e) && L.f(this.f11651f, dVar.f11651f) && L.f(this.f11652g, dVar.f11652g) && this.f11653h == dVar.f11653h;
    }

    public final int hashCode() {
        int iE2 = H.e(C23088b.a(Boolean.hashCode(this.f11646a) * 31, 31, this.f11647b), 31, this.f11648c);
        String str = this.f11649d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11650e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f11651f;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str3 = this.f11652g;
        return Boolean.hashCode(this.f11653h) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuctionState(showOverlayLoading=");
        sb2.append(this.f11646a);
        sb2.append(", items=");
        sb2.append(this.f11647b);
        sb2.append(", beduinItems=");
        sb2.append(this.f11648c);
        sb2.append(", applyButtonText=");
        sb2.append(this.f11649d);
        sb2.append(", cancelButtonText=");
        sb2.append(this.f11650e);
        sb2.append(", terms=");
        sb2.append(this.f11651f);
        sb2.append(", overlayErrorMessage=");
        sb2.append(this.f11652g);
        sb2.append(", showButtonLoading=");
        return r.x(sb2, this.f11653h, ')');
    }
}
