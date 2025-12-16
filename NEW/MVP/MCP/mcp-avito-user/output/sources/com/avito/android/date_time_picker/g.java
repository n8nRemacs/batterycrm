package com.avito.android.date_time_picker;

import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TimePickerDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TimePickerDialog f132674l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TimePickerDialog timePickerDialog) {
        super(0);
        this.f132674l = timePickerDialog;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Button button = this.f132674l.f132624N;
        if (button == null) {
            button = null;
        }
        D6.h(button);
        return G0.f406611a;
    }
}
