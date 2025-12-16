package com.avito.android.str_calendar.seller.calandar_parameters.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Date;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StrCalendarParametersInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor", f = "StrCalendarParametersInteractor.kt", i = {0, 0, 0, 0, 0, 2, 2}, l = {270, 276, 280, 282, 299}, m = "handleSubmitParametersLoaded", n = {"this", "$this$handleSubmitParametersLoaded", "advertId", "startDate", "endDate", "$this$handleSubmitParametersLoaded", "warningDialog"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
/* loaded from: classes4.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f286946q;

    /* renamed from: r, reason: collision with root package name */
    public Object f286947r;

    /* renamed from: s, reason: collision with root package name */
    public String f286948s;

    /* renamed from: t, reason: collision with root package name */
    public Date f286949t;

    /* renamed from: u, reason: collision with root package name */
    public Date f286950u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f286951v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f286952w;

    /* renamed from: x, reason: collision with root package name */
    public int f286953x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f286952w = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f286951v = obj;
        this.f286953x |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.b(this.f286952w, null, null, null, null, false, false, false, null, null, this);
    }
}
