package gB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureAdvanceState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LgB0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gB0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C40568c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f396372i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final C40568c f396373j = new C40568c(C42784z0.f406748b, null, null, null, null, false, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f396374b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ButtonAction f396375c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ButtonAction f396376d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f396377e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ApiError f396378f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f396379g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f396380h;

    /* compiled from: CprConfigureAdvanceState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LgB0/c$a;", "", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gB0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40568c(@k List<? extends com.avito.conveyor_item.a> list, @l ButtonAction buttonAction, @l ButtonAction buttonAction2, @l String str, @l ApiError apiError, boolean z12, @l AttributedText attributedText) {
        this.f396374b = list;
        this.f396375c = buttonAction;
        this.f396376d = buttonAction2;
        this.f396377e = str;
        this.f396378f = apiError;
        this.f396379g = z12;
        this.f396380h = attributedText;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public static C40568c a(C40568c c40568c, String str, ApiError apiError, boolean z12, int i12) {
        ?? r12 = c40568c.f396374b;
        ButtonAction buttonAction = c40568c.f396375c;
        ButtonAction buttonAction2 = c40568c.f396376d;
        if ((i12 & 8) != 0) {
            str = c40568c.f396377e;
        }
        String str2 = str;
        if ((i12 & 16) != 0) {
            apiError = c40568c.f396378f;
        }
        ApiError apiError2 = apiError;
        if ((i12 & 32) != 0) {
            z12 = c40568c.f396379g;
        }
        AttributedText attributedText = c40568c.f396380h;
        c40568c.getClass();
        return new C40568c(r12, buttonAction, buttonAction2, str2, apiError2, z12, attributedText);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40568c)) {
            return false;
        }
        C40568c c40568c = (C40568c) obj;
        return L.f(this.f396374b, c40568c.f396374b) && L.f(this.f396375c, c40568c.f396375c) && L.f(this.f396376d, c40568c.f396376d) && L.f(this.f396377e, c40568c.f396377e) && L.f(this.f396378f, c40568c.f396378f) && this.f396379g == c40568c.f396379g && L.f(this.f396380h, c40568c.f396380h);
    }

    public final int hashCode() {
        int iHashCode = this.f396374b.hashCode() * 31;
        ButtonAction buttonAction = this.f396375c;
        int iHashCode2 = (iHashCode + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        ButtonAction buttonAction2 = this.f396376d;
        int iHashCode3 = (iHashCode2 + (buttonAction2 == null ? 0 : buttonAction2.hashCode())) * 31;
        String str = this.f396377e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ApiError apiError = this.f396378f;
        int i12 = r.i((iHashCode4 + (apiError == null ? 0 : apiError.hashCode())) * 31, 31, this.f396379g);
        AttributedText attributedText = this.f396380h;
        return i12 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CprConfigureAdvanceState(items=");
        sb2.append(this.f396374b);
        sb2.append(", toolbarAction=");
        sb2.append(this.f396375c);
        sb2.append(", nextAction=");
        sb2.append(this.f396376d);
        sb2.append(", advance=");
        sb2.append(this.f396377e);
        sb2.append(", error=");
        sb2.append(this.f396378f);
        sb2.append(", isLoading=");
        sb2.append(this.f396379g);
        sb2.append(", rules=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f396380h, ')');
    }
}
