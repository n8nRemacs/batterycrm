package com.avito.android.vas_planning;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.vas_planning.model.VasPlannerState;
import com.avito.android.vas_planning.model.VasPlanningItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VasPlanningViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/vas_planning/model/VasPlannerState;", VoiceInfo.STATE, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class y extends N implements Y41.l<VasPlannerState, VasPlannerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f322554l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ VasPlanningItem.VasPlanningDateTime f322555m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ org.threeten.bp.g f322556n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t tVar, VasPlanningItem.VasPlanningDateTime vasPlanningDateTime, org.threeten.bp.g gVar) {
        super(1);
        this.f322554l = tVar;
        this.f322555m = vasPlanningDateTime;
        this.f322556n = gVar;
    }

    @Override // Y41.l
    public final VasPlannerState invoke(VasPlannerState vasPlannerState) {
        VasPlannerState vasPlannerState2 = vasPlannerState;
        x xVar = new x(this.f322556n);
        return VasPlannerState.a(vasPlannerState2, t.ke(this.f322554l, vasPlannerState2.f322418b, this.f322555m, xVar), null, 6);
    }
}
