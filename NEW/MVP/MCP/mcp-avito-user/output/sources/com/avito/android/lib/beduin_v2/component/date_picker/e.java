package com.avito.android.lib.beduin_v2.component.date_picker;

import com.avito.android.lib.beduin_v2.component.date_picker.a;
import com.avito.beduin.v2.avito.component.date_picker.state.AvitoDatePickerState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DatePickerComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "date", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements Y41.l<Long, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AvitoDatePickerState f175539l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f175540m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AvitoDatePickerState avitoDatePickerState, a aVar) {
        super(1);
        this.f175539l = avitoDatePickerState;
        this.f175540m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Long l12) {
        long jLongValue = l12.longValue();
        Y41.l<ST0.d, G0> lVar = this.f175539l.f334161l;
        if (lVar != null) {
            a.C5183a c5183a = a.f175531q;
            this.f175540m.getClass();
            lVar.invoke(new ST0.d(String.valueOf(jLongValue)));
        }
        return G0.f406611a;
    }
}
