package com.avito.android.str_calendar.seller.calandar_parameters.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCalendarParametersInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.domain.StrCalendarParametersInteractor", f = "StrCalendarParametersInteractor.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {316, 317, 320, 333}, m = "handleSubmitParametersError", n = {"this", "$this$handleSubmitParametersError", "error", "this", "$this$handleSubmitParametersError", "error", "this", "$this$handleSubmitParametersError", "error"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f286937q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f286938r;

    /* renamed from: s, reason: collision with root package name */
    public ApiError f286939s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f286940t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f286941u;

    /* renamed from: v, reason: collision with root package name */
    public int f286942v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f286941u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f286940t = obj;
        this.f286942v |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.a(this.f286941u, null, null, this);
    }
}
