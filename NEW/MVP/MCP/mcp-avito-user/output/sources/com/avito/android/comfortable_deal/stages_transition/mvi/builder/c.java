package com.avito.android.comfortable_deal.stages_transition.mvi.builder;

import Y41.l;
import com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StagesTransitionStateBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class c extends N implements l<StageTransitionField, StageTransitionField> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f122974l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(1);
        this.f122974l = str;
    }

    @Override // Y41.l
    public final StageTransitionField invoke(StageTransitionField stageTransitionField) {
        return new StageTransitionField.Input(this.f122974l);
    }
}
