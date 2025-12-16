package qB0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CpxConfigureLandingState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LqB0/e;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qB0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C47274e extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f429094h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C47274e f429095i = new C47274e(C42784z0.f406748b, null, null, false, null, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f429096b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ButtonAction f429097c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Throwable f429098d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f429099e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C47270a f429100f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f429101g;

    /* compiled from: CpxConfigureLandingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqB0/e$a;", "", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qB0.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C47274e(@k List<? extends com.avito.conveyor_item.a> list, @l ButtonAction buttonAction, @l Throwable th2, boolean z12, @l C47270a c47270a, @l AttributedText attributedText) {
        this.f429096b = list;
        this.f429097c = buttonAction;
        this.f429098d = th2;
        this.f429099e = z12;
        this.f429100f = c47270a;
        this.f429101g = attributedText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Throwable] */
    public static C47274e a(C47274e c47274e, ArrayList arrayList, ApiException apiException, boolean z12, int i12) {
        List list = arrayList;
        if ((i12 & 1) != 0) {
            list = c47274e.f429096b;
        }
        List list2 = list;
        ButtonAction buttonAction = c47274e.f429097c;
        ApiException apiException2 = apiException;
        if ((i12 & 4) != 0) {
            apiException2 = c47274e.f429098d;
        }
        ApiException apiException3 = apiException2;
        if ((i12 & 8) != 0) {
            z12 = c47274e.f429099e;
        }
        C47270a c47270a = c47274e.f429100f;
        AttributedText attributedText = c47274e.f429101g;
        c47274e.getClass();
        return new C47274e(list2, buttonAction, apiException3, z12, c47270a, attributedText);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47274e)) {
            return false;
        }
        C47274e c47274e = (C47274e) obj;
        return L.f(this.f429096b, c47274e.f429096b) && L.f(this.f429097c, c47274e.f429097c) && L.f(this.f429098d, c47274e.f429098d) && this.f429099e == c47274e.f429099e && L.f(this.f429100f, c47274e.f429100f) && L.f(this.f429101g, c47274e.f429101g);
    }

    public final int hashCode() {
        int iHashCode = this.f429096b.hashCode() * 31;
        ButtonAction buttonAction = this.f429097c;
        int iHashCode2 = (iHashCode + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        Throwable th2 = this.f429098d;
        int i12 = r.i((iHashCode2 + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.f429099e);
        C47270a c47270a = this.f429100f;
        int iHashCode3 = (i12 + (c47270a == null ? 0 : c47270a.hashCode())) * 31;
        AttributedText attributedText = this.f429101g;
        return iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CpxConfigureLandingState(items=");
        sb2.append(this.f429096b);
        sb2.append(", nextAction=");
        sb2.append(this.f429097c);
        sb2.append(", error=");
        sb2.append(this.f429098d);
        sb2.append(", isLoading=");
        sb2.append(this.f429099e);
        sb2.append(", navigationBar=");
        sb2.append(this.f429100f);
        sb2.append(", terms=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f429101g, ')');
    }
}
