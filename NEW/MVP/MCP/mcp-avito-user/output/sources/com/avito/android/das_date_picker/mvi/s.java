package com.avito.android.das_date_picker.mvi;

import com.avito.android.das_date_picker.model.DasCalendarInitParameters;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarInternalAction;
import com.avito.android.das_date_picker.mvi.entity.DasCalendarState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DasCalendarReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class s extends N implements Y41.a<DasCalendarState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DasCalendarInternalAction f132457l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DasCalendarState f132458m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(DasCalendarInternalAction dasCalendarInternalAction, DasCalendarState dasCalendarState) {
        super(0);
        this.f132457l = dasCalendarInternalAction;
        this.f132458m = dasCalendarState;
    }

    @Override // Y41.a
    public final DasCalendarState invoke() {
        DasCalendarInternalAction.Init init = (DasCalendarInternalAction.Init) this.f132457l;
        DasCalendarInitParameters dasCalendarInitParameters = init.f132375b;
        return DasCalendarState.a(this.f132458m, init.f132376c, dasCalendarInitParameters.f132350b, dasCalendarInitParameters.f132351c, dasCalendarInitParameters.f132352d, null, null, null, null, 240);
    }
}
