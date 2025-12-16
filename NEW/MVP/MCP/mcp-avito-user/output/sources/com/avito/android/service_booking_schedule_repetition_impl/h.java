package com.avito.android.service_booking_schedule_repetition_impl;

import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.service_booking_schedule_repetition_impl.mvi.entity.ScheduleRepetitionState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceBookingScheduleRepetitionRenderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f277598l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScheduleRepetitionState f277599m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e f277600n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q qVar, ScheduleRepetitionState scheduleRepetitionState, e eVar) {
        super(1);
        this.f277598l = qVar;
        this.f277599m = scheduleRepetitionState;
        this.f277600n = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setImageDrawable(null);
        q qVar = this.f277598l;
        contentPlaceholder2.setTitle(qVar.f277751a.getContext().getString(R.string.sb_schedule_repetition_default_error_title));
        contentPlaceholder2.setSubtitle(this.f277599m.f277710c.k0(this.f277600n.f277592c.f277752b));
        contentPlaceholder2.setButtonTitle(qVar.f277751a.getContext().getString(R.string.error_layout_refresh));
        return G0.f406611a;
    }
}
