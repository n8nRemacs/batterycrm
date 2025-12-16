package com.avito.android.job.interview.pickers;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TimePickerDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/lib/design/picker/k;", "", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class i extends N implements Y41.a<List<? extends com.avito.android.lib.design.picker.k<Integer>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TimePickerDialog f174673l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TimePickerDialog timePickerDialog) {
        super(0);
        this.f174673l = timePickerDialog;
    }

    @Override // Y41.a
    public final List<? extends com.avito.android.lib.design.picker.k<Integer>> invoke() {
        return TimePickerDialog.V(this.f174673l, 60);
    }
}
