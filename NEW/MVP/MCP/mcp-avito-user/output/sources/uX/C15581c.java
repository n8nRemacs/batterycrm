package Ux;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackType;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeedback;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessAdvertFeedbackState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LUx/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ux.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C15581c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f16788g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C15581c f16789h = new C15581c(null, "", null, null, new C15582d(null, null, null, null, null, false, false, null));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final EarlyAccessFeedback f16790b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f16791c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final EarlyAccessAdvertFeedbackType f16792d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f16793e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C15582d f16794f;

    /* compiled from: EarlyAccessAdvertFeedbackState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUx/c$a;", "", "<init>", "()V", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ux.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C15581c(@l EarlyAccessFeedback earlyAccessFeedback, @k String str, @l EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType, @l String str2, @k C15582d c15582d) {
        this.f16790b = earlyAccessFeedback;
        this.f16791c = str;
        this.f16792d = earlyAccessAdvertFeedbackType;
        this.f16793e = str2;
        this.f16794f = c15582d;
    }

    public static C15581c a(C15581c c15581c, EarlyAccessFeedback earlyAccessFeedback, String str, EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType, String str2, C15582d c15582d, int i12) {
        if ((i12 & 1) != 0) {
            earlyAccessFeedback = c15581c.f16790b;
        }
        EarlyAccessFeedback earlyAccessFeedback2 = earlyAccessFeedback;
        if ((i12 & 2) != 0) {
            str = c15581c.f16791c;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            earlyAccessAdvertFeedbackType = c15581c.f16792d;
        }
        EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType2 = earlyAccessAdvertFeedbackType;
        if ((i12 & 8) != 0) {
            str2 = c15581c.f16793e;
        }
        c15581c.getClass();
        return new C15581c(earlyAccessFeedback2, str3, earlyAccessAdvertFeedbackType2, str2, c15582d);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15581c)) {
            return false;
        }
        C15581c c15581c = (C15581c) obj;
        return L.f(this.f16790b, c15581c.f16790b) && L.f(this.f16791c, c15581c.f16791c) && this.f16792d == c15581c.f16792d && L.f(this.f16793e, c15581c.f16793e) && L.f(this.f16794f, c15581c.f16794f);
    }

    public final int hashCode() {
        EarlyAccessFeedback earlyAccessFeedback = this.f16790b;
        int iD2 = H.d((earlyAccessFeedback == null ? 0 : earlyAccessFeedback.hashCode()) * 31, 31, this.f16791c);
        EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType = this.f16792d;
        int iHashCode = (iD2 + (earlyAccessAdvertFeedbackType == null ? 0 : earlyAccessAdvertFeedbackType.hashCode())) * 31;
        String str = this.f16793e;
        return this.f16794f.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "EarlyAccessAdvertFeedbackState(data=" + this.f16790b + ", advertId=" + this.f16791c + ", feedbackType=" + this.f16792d + ", feedbackText=" + this.f16793e + ", viewState=" + this.f16794f + ')';
    }
}
