package k10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealComment;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectedAppealState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lk10/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C42473c extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f405992m = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f405993b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f405994c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f405995d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f405996e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f405997f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList f405998g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ApplicationAppealComment f405999h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f406000i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f406001j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f406002k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f406003l;

    /* compiled from: SelectedAppealState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk10/c$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k10.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42473c(@k String str, @k String str2, @k String str3, @k String str4, @l AttributedText attributedText, @k ArrayList arrayList, @l ApplicationAppealComment applicationAppealComment, @l String str5, @l String str6, @l String str7, boolean z12) {
        this.f405993b = str;
        this.f405994c = str2;
        this.f405995d = str3;
        this.f405996e = str4;
        this.f405997f = attributedText;
        this.f405998g = arrayList;
        this.f405999h = applicationAppealComment;
        this.f406000i = str5;
        this.f406001j = str6;
        this.f406002k = str7;
        this.f406003l = z12;
    }

    public static C42473c a(C42473c c42473c, boolean z12) {
        String str = c42473c.f405993b;
        String str2 = c42473c.f405994c;
        String str3 = c42473c.f405995d;
        String str4 = c42473c.f405996e;
        AttributedText attributedText = c42473c.f405997f;
        ArrayList arrayList = c42473c.f405998g;
        ApplicationAppealComment applicationAppealComment = c42473c.f405999h;
        String str5 = c42473c.f406000i;
        String str6 = c42473c.f406001j;
        String str7 = c42473c.f406002k;
        c42473c.getClass();
        return new C42473c(str, str2, str3, str4, attributedText, arrayList, applicationAppealComment, str5, str6, str7, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42473c)) {
            return false;
        }
        C42473c c42473c = (C42473c) obj;
        return L.f(this.f405993b, c42473c.f405993b) && L.f(this.f405994c, c42473c.f405994c) && L.f(this.f405995d, c42473c.f405995d) && L.f(this.f405996e, c42473c.f405996e) && L.f(this.f405997f, c42473c.f405997f) && L.f(this.f405998g, c42473c.f405998g) && L.f(this.f405999h, c42473c.f405999h) && L.f(this.f406000i, c42473c.f406000i) && L.f(this.f406001j, c42473c.f406001j) && L.f(this.f406002k, c42473c.f406002k) && this.f406003l == c42473c.f406003l;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f405993b.hashCode() * 31, 31, this.f405994c), 31, this.f405995d), 31, this.f405996e);
        AttributedText attributedText = this.f405997f;
        int iG2 = e.g(this.f405998g, (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31);
        ApplicationAppealComment applicationAppealComment = this.f405999h;
        int iHashCode = (iG2 + (applicationAppealComment == null ? 0 : applicationAppealComment.hashCode())) * 31;
        String str = this.f406000i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f406001j;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f406002k;
        return Boolean.hashCode(this.f406003l) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedAppealState(applicationId=");
        sb2.append(this.f405993b);
        sb2.append(", appealId=");
        sb2.append(this.f405994c);
        sb2.append(", iconUrl=");
        sb2.append(this.f405995d);
        sb2.append(", title=");
        sb2.append(this.f405996e);
        sb2.append(", status=");
        sb2.append(this.f405997f);
        sb2.append(", creditInfoFields=");
        sb2.append(this.f405998g);
        sb2.append(", comment=");
        sb2.append(this.f405999h);
        sb2.append(", selectBankButtonTitle=");
        sb2.append(this.f406000i);
        sb2.append(", applicantType=");
        sb2.append(this.f406001j);
        sb2.append(", currentMortgageStage=");
        sb2.append(this.f406002k);
        sb2.append(", isActionLoading=");
        return r.x(sb2, this.f406003l, ')');
    }
}
