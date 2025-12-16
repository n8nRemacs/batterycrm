package com.avito.android.job.interview.pickers;

import Y41.p;
import com.avito.android.lib.design.picker.Picker;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: TimePickerDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/picker/k;", "leftInterval", "rightInterval", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/picker/k;Lcom/avito/android/lib/design/picker/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements p<com.avito.android.lib.design.picker.k<?>, com.avito.android.lib.design.picker.k<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.picker.k<?> f174665l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.picker.k<?> f174666m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ TimePickerDialog f174667n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Picker f174668o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TimePickerDialog timePickerDialog, Picker picker, com.avito.android.lib.design.picker.k kVar, com.avito.android.lib.design.picker.k kVar2) {
        super(2);
        this.f174665l = kVar;
        this.f174666m = kVar2;
        this.f174667n = timePickerDialog;
        this.f174668o = picker;
    }

    @Override // Y41.p
    public final G0 invoke(com.avito.android.lib.design.picker.k<?> kVar, com.avito.android.lib.design.picker.k<?> kVar2) {
        com.avito.android.lib.design.picker.k<?> kVar3 = kVar;
        com.avito.android.lib.design.picker.k<?> kVar4 = kVar2;
        if (L.f(kVar3, this.f174665l) && L.f(kVar4, this.f174666m)) {
            Picker picker = this.f174668o;
            TimePickerDialog timePickerDialog = this.f174667n;
            TimePickerDialog.W(timePickerDialog, picker, kVar3, kVar4);
            picker.f();
            picker.setOnSelection(new c(timePickerDialog, picker));
        }
        return G0.f406611a;
    }
}
