package com.avito.android.job.interview.pickers;

import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TimePickerDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TimePickerDialog f174669l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TimePickerDialog timePickerDialog) {
        super(0);
        this.f174669l = timePickerDialog;
    }

    @Override // Y41.a
    public final G0 invoke() {
        TimePickerDialog timePickerDialog = this.f174669l;
        D6.h(timePickerDialog.f174644L);
        timePickerDialog.f174644L.setText(timePickerDialog.f174640H);
        return G0.f406611a;
    }
}
