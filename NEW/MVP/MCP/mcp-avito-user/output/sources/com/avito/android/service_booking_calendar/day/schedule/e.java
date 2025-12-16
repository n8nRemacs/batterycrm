package com.avito.android.service_booking_calendar.day.schedule;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DayScheduleFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.service_booking_calendar.day.schedule.DayScheduleFragment", f = "DayScheduleFragment.kt", i = {0}, l = {166}, m = "observeItemPresenters", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public DayScheduleFragment f275374q;

    /* renamed from: r, reason: collision with root package name */
    public Iterator f275375r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f275376s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ DayScheduleFragment f275377t;

    /* renamed from: u, reason: collision with root package name */
    public int f275378u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DayScheduleFragment dayScheduleFragment, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f275377t = dayScheduleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f275376s = obj;
        this.f275378u |= BeduinInputModel.MIN_TEXT_VERSION;
        return DayScheduleFragment.q5(this.f275377t, null, this);
    }
}
