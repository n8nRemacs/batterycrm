package jB;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.extended_profile_ui_components.ActionsBottomMenuData;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetEditState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjB/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d extends q {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f405501b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f405502c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalWidgetSectionModel.Section f405503d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f405504e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalWidgetBlockView.UniversalWidgetBlockState f405505f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UniversalWidgetBlockView.UniversalWidgetBlockState f405506g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final UniversalWidgetBlockView.UniversalWidgetBlockState f405507h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState f405508i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ActionsBottomMenuData<InterfaceC42227a> f405509j;

    public /* synthetic */ d(boolean z12, String str, UniversalWidgetSectionModel.Section section, boolean z13, UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState, UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState2, UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState3, UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState universalWidgetFourBlocksState, ActionsBottomMenuData actionsBottomMenuData, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? "" : str, section, z13, (i12 & 16) != 0 ? null : universalWidgetBlockState, (i12 & 32) != 0 ? null : universalWidgetBlockState2, (i12 & 64) != 0 ? null : universalWidgetBlockState3, (i12 & 128) != 0 ? null : universalWidgetFourBlocksState, (i12 & 256) != 0 ? null : actionsBottomMenuData);
    }

    public static d a(d dVar, boolean z12, String str, UniversalWidgetSectionModel.Section section, boolean z13, UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState, UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState2, UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState3, UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState universalWidgetFourBlocksState, ActionsBottomMenuData actionsBottomMenuData, int i12) {
        boolean z14 = (i12 & 1) != 0 ? dVar.f405501b : z12;
        String str2 = (i12 & 2) != 0 ? dVar.f405502c : str;
        UniversalWidgetSectionModel.Section section2 = (i12 & 4) != 0 ? dVar.f405503d : section;
        boolean z15 = (i12 & 8) != 0 ? dVar.f405504e : z13;
        UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState4 = (i12 & 16) != 0 ? dVar.f405505f : universalWidgetBlockState;
        UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState5 = (i12 & 32) != 0 ? dVar.f405506g : universalWidgetBlockState2;
        UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState6 = (i12 & 64) != 0 ? dVar.f405507h : universalWidgetBlockState3;
        UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState universalWidgetFourBlocksState2 = (i12 & 128) != 0 ? dVar.f405508i : universalWidgetFourBlocksState;
        ActionsBottomMenuData actionsBottomMenuData2 = (i12 & 256) != 0 ? dVar.f405509j : actionsBottomMenuData;
        dVar.getClass();
        return new d(z14, str2, section2, z15, universalWidgetBlockState4, universalWidgetBlockState5, universalWidgetBlockState6, universalWidgetFourBlocksState2, actionsBottomMenuData2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f405501b == dVar.f405501b && L.f(this.f405502c, dVar.f405502c) && L.f(this.f405503d, dVar.f405503d) && this.f405504e == dVar.f405504e && L.f(this.f405505f, dVar.f405505f) && L.f(this.f405506g, dVar.f405506g) && L.f(this.f405507h, dVar.f405507h) && L.f(this.f405508i, dVar.f405508i) && L.f(this.f405509j, dVar.f405509j);
    }

    public final int hashCode() {
        int i12 = r.i((this.f405503d.hashCode() + H.d(Boolean.hashCode(this.f405501b) * 31, 31, this.f405502c)) * 31, 31, this.f405504e);
        UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState = this.f405505f;
        int iHashCode = (i12 + (universalWidgetBlockState == null ? 0 : universalWidgetBlockState.hashCode())) * 31;
        UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState2 = this.f405506g;
        int iHashCode2 = (iHashCode + (universalWidgetBlockState2 == null ? 0 : universalWidgetBlockState2.hashCode())) * 31;
        UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState3 = this.f405507h;
        int iHashCode3 = (iHashCode2 + (universalWidgetBlockState3 == null ? 0 : universalWidgetBlockState3.hashCode())) * 31;
        UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState universalWidgetFourBlocksState = this.f405508i;
        int iHashCode4 = (iHashCode3 + (universalWidgetFourBlocksState == null ? 0 : universalWidgetFourBlocksState.hashCode())) * 31;
        ActionsBottomMenuData<InterfaceC42227a> actionsBottomMenuData = this.f405509j;
        return iHashCode4 + (actionsBottomMenuData != null ? actionsBottomMenuData.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "UniversalWidgetEditState(isLoading=" + this.f405501b + ", navBarTitle=" + this.f405502c + ", section=" + this.f405503d + ", isVisibleByUser=" + this.f405504e + ", blocks1State=" + this.f405505f + ", blocks2State=" + this.f405506g + ", blocks3State=" + this.f405507h + ", fourBlocksState=" + this.f405508i + ", actionsBottomMenu=" + this.f405509j + ')';
    }

    public d(boolean z12, @k String str, @k UniversalWidgetSectionModel.Section section, boolean z13, @l UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState, @l UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState2, @l UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState3, @l UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState universalWidgetFourBlocksState, @l ActionsBottomMenuData<InterfaceC42227a> actionsBottomMenuData) {
        this.f405501b = z12;
        this.f405502c = str;
        this.f405503d = section;
        this.f405504e = z13;
        this.f405505f = universalWidgetBlockState;
        this.f405506g = universalWidgetBlockState2;
        this.f405507h = universalWidgetBlockState3;
        this.f405508i = universalWidgetFourBlocksState;
        this.f405509j = actionsBottomMenuData;
    }
}
