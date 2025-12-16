package m10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage.api.model.CheckboxMeta;
import com.avito.android.remote.model.text.AttributedText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SendingConfirmState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lm10/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m10.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C43861c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f414261h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C43861c f414262i = new C43861c("", "", null, P0.c(), null, false);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414263b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f414264c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f414265d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<String, CheckboxMeta> f414266e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f414267f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f414268g;

    /* compiled from: SendingConfirmState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm10/c$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m10.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43861c(@k String str, @k String str2, @l String str3, @k Map<String, CheckboxMeta> map, @l AttributedText attributedText, boolean z12) {
        this.f414263b = str;
        this.f414264c = str2;
        this.f414265d = str3;
        this.f414266e = map;
        this.f414267f = attributedText;
        this.f414268g = z12;
    }

    public static C43861c a(C43861c c43861c, String str, String str2, String str3, Map map, AttributedText attributedText, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            str = c43861c.f414263b;
        }
        String str4 = str;
        if ((i12 & 2) != 0) {
            str2 = c43861c.f414264c;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = c43861c.f414265d;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            map = c43861c.f414266e;
        }
        Map map2 = map;
        if ((i12 & 16) != 0) {
            attributedText = c43861c.f414267f;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 32) != 0) {
            z12 = c43861c.f414268g;
        }
        c43861c.getClass();
        return new C43861c(str4, str5, str6, map2, attributedText2, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43861c)) {
            return false;
        }
        C43861c c43861c = (C43861c) obj;
        return L.f(this.f414263b, c43861c.f414263b) && L.f(this.f414264c, c43861c.f414264c) && L.f(this.f414265d, c43861c.f414265d) && L.f(this.f414266e, c43861c.f414266e) && L.f(this.f414267f, c43861c.f414267f) && this.f414268g == c43861c.f414268g;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f414263b.hashCode() * 31, 31, this.f414264c);
        String str = this.f414265d;
        int iC2 = AK.c.c((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f414266e);
        AttributedText attributedText = this.f414267f;
        return Boolean.hashCode(this.f414268g) + ((iC2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendingConfirmState(applicationId=");
        sb2.append(this.f414263b);
        sb2.append(", applicationStage=");
        sb2.append(this.f414264c);
        sb2.append(", description=");
        sb2.append(this.f414265d);
        sb2.append(", checkboxes=");
        sb2.append(this.f414266e);
        sb2.append(", disclaimer=");
        sb2.append(this.f414267f);
        sb2.append(", isConfirmButtonLoading=");
        return r.x(sb2, this.f414268g, ')');
    }
}
