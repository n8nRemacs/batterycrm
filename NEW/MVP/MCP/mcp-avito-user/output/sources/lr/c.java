package Lr;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CptActivationState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LLr/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f10137h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final c f10138i = new c(true, null, C42784z0.f406748b, null, new NoMatchLink(), null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10139b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f10140c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f10141d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ButtonAction f10142e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f10143f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f10144g;

    /* compiled from: CptActivationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLr/c$a;", "", "<init>", "()V", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z12, @l Throwable th2, @k List<? extends com.avito.conveyor_item.a> list, @l ButtonAction buttonAction, @k DeepLink deepLink, @l AttributedText attributedText) {
        this.f10139b = z12;
        this.f10140c = th2;
        this.f10141d = list;
        this.f10142e = buttonAction;
        this.f10143f = deepLink;
        this.f10144g = attributedText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Throwable] */
    public static c a(c cVar, boolean z12, ApiException apiException, List list, ButtonAction buttonAction, DeepLink deepLink, AttributedText attributedText, int i12) {
        if ((i12 & 1) != 0) {
            z12 = cVar.f10139b;
        }
        boolean z13 = z12;
        ApiException apiException2 = apiException;
        if ((i12 & 2) != 0) {
            apiException2 = cVar.f10140c;
        }
        ApiException apiException3 = apiException2;
        if ((i12 & 4) != 0) {
            list = cVar.f10141d;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            buttonAction = cVar.f10142e;
        }
        ButtonAction buttonAction2 = buttonAction;
        if ((i12 & 16) != 0) {
            deepLink = cVar.f10143f;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 32) != 0) {
            attributedText = cVar.f10144g;
        }
        cVar.getClass();
        return new c(z13, apiException3, list2, buttonAction2, deepLink2, attributedText);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10139b == cVar.f10139b && L.f(this.f10140c, cVar.f10140c) && L.f(this.f10141d, cVar.f10141d) && L.f(this.f10142e, cVar.f10142e) && L.f(this.f10143f, cVar.f10143f) && L.f(this.f10144g, cVar.f10144g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f10139b) * 31;
        Throwable th2 = this.f10140c;
        int iE2 = H.e((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.f10141d);
        ButtonAction buttonAction = this.f10142e;
        int iE3 = com.avito.android.actions_sheet.a.e(this.f10143f, (iE2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31, 31);
        AttributedText attributedText = this.f10144g;
        return iE3 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CptActivationState(isLoading=");
        sb2.append(this.f10139b);
        sb2.append(", error=");
        sb2.append(this.f10140c);
        sb2.append(", items=");
        sb2.append(this.f10141d);
        sb2.append(", button=");
        sb2.append(this.f10142e);
        sb2.append(", nextPageDeeplink=");
        sb2.append(this.f10143f);
        sb2.append(", agreement=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f10144g, ')');
    }
}
