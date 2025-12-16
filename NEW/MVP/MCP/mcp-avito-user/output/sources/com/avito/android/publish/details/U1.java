package com.avito.android.publish.details;

import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: PublishDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", VoiceInfo.STATE, "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class U1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K1 f233169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SlotType f233170c;

    public U1(K1 k12, SlotType slotType) {
        this.f233169b = k12;
        this.f233170c = slotType;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        if (((P2) obj) instanceof P2.b) {
            PublishDetailsFlowTracker.FlowContext flowContextA = com.avito.android.publish.details.analytics.d.a(this.f233170c);
            if (flowContextA == null) {
                flowContextA = PublishDetailsFlowTracker.FlowContext.f233436b;
            }
            this.f233169b.B9(flowContextA);
        }
    }
}
