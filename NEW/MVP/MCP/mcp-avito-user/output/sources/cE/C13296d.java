package Ce;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoEvidenceRequestState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCe/d;", "", "a", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ce.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C13296d {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f2563i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C13296d f2564j = new C13296d(C42784z0.f406748b, null, false, null, false, null, false, null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f2565a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f2566b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2567c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f2568d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2569e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f2570f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2571g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ApiError f2572h;

    /* compiled from: AutoEvidenceRequestState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCe/d$a;", "", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ce.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C13296d(@k List list, @l String str, boolean z12, @l AttributedText attributedText, boolean z13, @l AttributedText attributedText2, boolean z14, @l ApiError apiError) {
        this.f2565a = list;
        this.f2566b = str;
        this.f2567c = z12;
        this.f2568d = attributedText;
        this.f2569e = z13;
        this.f2570f = attributedText2;
        this.f2571g = z14;
        this.f2572h = apiError;
    }

    public static C13296d a(C13296d c13296d, ArrayList arrayList, String str, boolean z12, AttributedText attributedText, boolean z13, AttributedText attributedText2, boolean z14, ApiError apiError, int i12) {
        List<com.avito.conveyor_item.a> list = (i12 & 1) != 0 ? c13296d.f2565a : arrayList;
        String str2 = (i12 & 2) != 0 ? c13296d.f2566b : str;
        boolean z15 = (i12 & 4) != 0 ? c13296d.f2567c : z12;
        AttributedText attributedText3 = (i12 & 8) != 0 ? c13296d.f2568d : attributedText;
        boolean z16 = (i12 & 16) != 0 ? c13296d.f2569e : z13;
        c13296d.getClass();
        AttributedText attributedText4 = (i12 & 64) != 0 ? c13296d.f2570f : attributedText2;
        boolean z17 = (i12 & 128) != 0 ? c13296d.f2571g : z14;
        ApiError apiError2 = (i12 & 256) != 0 ? c13296d.f2572h : apiError;
        c13296d.getClass();
        return new C13296d(list, str2, z15, attributedText3, z16, attributedText4, z17, apiError2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13296d)) {
            return false;
        }
        C13296d c13296d = (C13296d) obj;
        return L.f(this.f2565a, c13296d.f2565a) && L.f(this.f2566b, c13296d.f2566b) && this.f2567c == c13296d.f2567c && L.f(this.f2568d, c13296d.f2568d) && this.f2569e == c13296d.f2569e && L.f(null, null) && L.f(this.f2570f, c13296d.f2570f) && this.f2571g == c13296d.f2571g && L.f(this.f2572h, c13296d.f2572h);
    }

    public final int hashCode() {
        int iHashCode = this.f2565a.hashCode() * 31;
        String str = this.f2566b;
        int i12 = r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f2567c);
        AttributedText attributedText = this.f2568d;
        int i13 = r.i((i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 961, this.f2569e);
        AttributedText attributedText2 = this.f2570f;
        int i14 = r.i((i13 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31, 31, this.f2571g);
        ApiError apiError = this.f2572h;
        return i14 + (apiError != null ? apiError.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoEvidenceRequestState(mainItems=");
        sb2.append(this.f2565a);
        sb2.append(", submitButtonText=");
        sb2.append(this.f2566b);
        sb2.append(", isSubmitButtonEnable=");
        sb2.append(this.f2567c);
        sb2.append(", bottomDisclaimerText=");
        sb2.append(this.f2568d);
        sb2.append(", showOverlayLoading=");
        sb2.append(this.f2569e);
        sb2.append(", loadingProgress=null, toastSuccess=");
        sb2.append(this.f2570f);
        sb2.append(", submitButtonLoader=");
        sb2.append(this.f2571g);
        sb2.append(", formLoadingError=");
        return AK.c.n(sb2, this.f2572h, ')');
    }
}
