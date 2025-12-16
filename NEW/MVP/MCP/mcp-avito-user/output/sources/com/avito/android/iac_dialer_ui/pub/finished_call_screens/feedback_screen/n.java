package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.akita.compose.component.accordion.s;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModePeerInfoState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUICallHeaderState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUIFinishedFeedbackScreen.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/finished_call_screens/feedback_screen/n;", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final IacUICallHeaderState f167641a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final IacUIAudioModePeerInfoState f167642b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f167643c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f167644d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<String> f167645e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f167646f;

    public n(@Y61.k IacUICallHeaderState iacUICallHeaderState, @Y61.k IacUIAudioModePeerInfoState iacUIAudioModePeerInfoState, @Y61.l Integer num, boolean z12, @Y61.k List<String> list, @Y61.l Integer num2) {
        this.f167641a = iacUICallHeaderState;
        this.f167642b = iacUIAudioModePeerInfoState;
        this.f167643c = num;
        this.f167644d = z12;
        this.f167645e = list;
        this.f167646f = num2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f167641a, nVar.f167641a) && L.f(this.f167642b, nVar.f167642b) && L.f(this.f167643c, nVar.f167643c) && this.f167644d == nVar.f167644d && L.f(this.f167645e, nVar.f167645e) && L.f(this.f167646f, nVar.f167646f);
    }

    public final int hashCode() {
        int iHashCode = (this.f167642b.hashCode() + (this.f167641a.hashCode() * 31)) * 31;
        Integer num = this.f167643c;
        int iE2 = H.e(r.i((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f167644d), 31, this.f167645e);
        Integer num2 = this.f167646f;
        return iE2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacUIFinishedFeedbackScreenState(callHeader=");
        sb2.append(this.f167641a);
        sb2.append(", peerInfo=");
        sb2.append(this.f167642b);
        sb2.append(", selectedRating=");
        sb2.append(this.f167643c);
        sb2.append(", isRatingClickable=");
        sb2.append(this.f167644d);
        sb2.append(", availableProblems=");
        sb2.append(this.f167645e);
        sb2.append(", selectedProblemIndex=");
        return s.j(sb2, this.f167646f, ')');
    }
}
