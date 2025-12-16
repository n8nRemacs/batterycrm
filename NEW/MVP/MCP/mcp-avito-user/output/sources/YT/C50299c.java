package yt;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.ui.JsxActualizationBottomSheetResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: JsxActualizationBottomSheetState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyt/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_cv-actualization-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yt.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C50299c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f443560b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final JsxActualizationBottomSheetResult f443561c;

    /* JADX WARN: Multi-variable type inference failed */
    public C50299c() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50299c)) {
            return false;
        }
        C50299c c50299c = (C50299c) obj;
        return this.f443560b == c50299c.f443560b && L.f(this.f443561c, c50299c.f443561c);
    }

    public final int hashCode() {
        return this.f443561c.hashCode() + (Boolean.hashCode(this.f443560b) * 31);
    }

    @k
    public final String toString() {
        return "JsxActualizationBottomSheetState(isPrimaryButtonEnabled=" + this.f443560b + ", closeResult=" + this.f443561c + ')';
    }

    public /* synthetic */ C50299c(boolean z12, JsxActualizationBottomSheetResult jsxActualizationBottomSheetResult, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? true : z12, (i12 & 2) != 0 ? JsxActualizationBottomSheetResult.Dismiss.f131554b : jsxActualizationBottomSheetResult);
    }

    public C50299c(boolean z12, @k JsxActualizationBottomSheetResult jsxActualizationBottomSheetResult) {
        this.f443560b = z12;
        this.f443561c = jsxActualizationBottomSheetResult;
    }
}
