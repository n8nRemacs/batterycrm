package Ep;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import com.avito.android.comfortable_deal.api.model.Call;
import com.avito.android.comfortable_deal.api.model.CurrentStage;
import com.avito.android.comfortable_deal.end_deal.model.EndDealSavedState;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import tp.InterfaceC48699a;

/* compiled from: DealState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEp/d;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final CurrentStage f4332a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f4333b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Call f4334c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f4335d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ActionTransition f4336e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Map<String, StageTransitionField> f4337f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final EndDealSavedState f4338g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final CommentsFilter f4339h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4340i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4341j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4342k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ArrayList f4343l;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@l CurrentStage currentStage, @k List<? extends com.avito.conveyor_item.a> list, @l Call call, @l String str, @l ActionTransition actionTransition, @k Map<String, ? extends StageTransitionField> map, @l EndDealSavedState endDealSavedState, @k CommentsFilter commentsFilter, boolean z12, boolean z13, boolean z14) {
        this.f4332a = currentStage;
        this.f4333b = list;
        this.f4334c = call;
        this.f4335d = str;
        this.f4336e = actionTransition;
        this.f4337f = map;
        this.f4338g = endDealSavedState;
        this.f4339h = commentsFilter;
        this.f4340i = z12;
        this.f4341j = z13;
        this.f4342k = z14;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
            if (!(aVar instanceof InterfaceC48699a) || ((InterfaceC48699a) aVar).getF440969e()) {
                arrayList.add(obj);
            }
        }
        this.f4343l = arrayList;
    }

    public static d a(d dVar, CurrentStage currentStage, List list, Call call, String str, ActionTransition actionTransition, Map map, EndDealSavedState endDealSavedState, CommentsFilter commentsFilter, boolean z12, boolean z13, boolean z14, int i12) {
        CurrentStage currentStage2 = (i12 & 1) != 0 ? dVar.f4332a : currentStage;
        List list2 = (i12 & 2) != 0 ? dVar.f4333b : list;
        Call call2 = (i12 & 4) != 0 ? dVar.f4334c : call;
        String str2 = (i12 & 8) != 0 ? dVar.f4335d : str;
        ActionTransition actionTransition2 = (i12 & 16) != 0 ? dVar.f4336e : actionTransition;
        Map map2 = (i12 & 32) != 0 ? dVar.f4337f : map;
        EndDealSavedState endDealSavedState2 = (i12 & 64) != 0 ? dVar.f4338g : endDealSavedState;
        CommentsFilter commentsFilter2 = (i12 & 128) != 0 ? dVar.f4339h : commentsFilter;
        boolean z15 = (i12 & 256) != 0 ? dVar.f4340i : z12;
        boolean z16 = (i12 & 512) != 0 ? dVar.f4341j : z13;
        boolean z17 = (i12 & 1024) != 0 ? dVar.f4342k : z14;
        dVar.getClass();
        return new d(currentStage2, list2, call2, str2, actionTransition2, map2, endDealSavedState2, commentsFilter2, z15, z16, z17);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4332a == dVar.f4332a && L.f(this.f4333b, dVar.f4333b) && L.f(this.f4334c, dVar.f4334c) && L.f(this.f4335d, dVar.f4335d) && this.f4336e == dVar.f4336e && L.f(this.f4337f, dVar.f4337f) && L.f(this.f4338g, dVar.f4338g) && this.f4339h == dVar.f4339h && this.f4340i == dVar.f4340i && this.f4341j == dVar.f4341j && this.f4342k == dVar.f4342k;
    }

    public final int hashCode() {
        CurrentStage currentStage = this.f4332a;
        int iE2 = H.e((currentStage == null ? 0 : currentStage.hashCode()) * 31, 31, this.f4333b);
        Call call = this.f4334c;
        int iHashCode = (iE2 + (call == null ? 0 : call.hashCode())) * 31;
        String str = this.f4335d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ActionTransition actionTransition = this.f4336e;
        int iC2 = AK.c.c((iHashCode2 + (actionTransition == null ? 0 : actionTransition.hashCode())) * 31, 31, this.f4337f);
        EndDealSavedState endDealSavedState = this.f4338g;
        return Boolean.hashCode(this.f4342k) + r.i(r.i((this.f4339h.hashCode() + ((iC2 + (endDealSavedState != null ? endDealSavedState.hashCode() : 0)) * 31)) * 31, 31, this.f4340i), 31, this.f4341j);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewState(stage=");
        sb2.append(this.f4332a);
        sb2.append(", items=");
        sb2.append(this.f4333b);
        sb2.append(", call=");
        sb2.append(this.f4334c);
        sb2.append(", newNoteComment=");
        sb2.append(this.f4335d);
        sb2.append(", transition=");
        sb2.append(this.f4336e);
        sb2.append(", transitionFields=");
        sb2.append(this.f4337f);
        sb2.append(", endDealSavedState=");
        sb2.append(this.f4338g);
        sb2.append(", commentsFilter=");
        sb2.append(this.f4339h);
        sb2.append(", isLoading=");
        sb2.append(this.f4340i);
        sb2.append(", isError=");
        sb2.append(this.f4341j);
        sb2.append(", isRecallRequestSubmitting=");
        return r.x(sb2, this.f4342k, ')');
    }
}
