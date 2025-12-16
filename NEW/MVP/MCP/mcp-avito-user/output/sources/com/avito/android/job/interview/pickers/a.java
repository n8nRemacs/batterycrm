package com.avito.android.job.interview.pickers;

import Y41.p;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.remote.model.category_parameters.SelectionType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DatePickerDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/picker/k;", SelectionType.TYPE_DAY, SelectionType.TYPE_MONTH, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/picker/k;Lcom/avito/android/lib/design/picker/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a extends N implements p<com.avito.android.lib.design.picker.k<?>, com.avito.android.lib.design.picker.k<?>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f174649l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Picker f174650m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.picker.k<Integer> f174651n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Button f174652o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Picker picker, com.avito.android.lib.design.picker.k<Integer> kVar, Button button) {
        super(2);
        this.f174649l = bVar;
        this.f174650m = picker;
        this.f174651n = kVar;
        this.f174652o = button;
    }

    @Override // Y41.p
    public final G0 invoke(com.avito.android.lib.design.picker.k<?> kVar, com.avito.android.lib.design.picker.k<?> kVar2) {
        b bVar = this.f174649l;
        Picker picker = this.f174650m;
        com.avito.android.lib.design.picker.k<Integer> kVar3 = this.f174651n;
        b.V(bVar, this.f174652o, picker, kVar, kVar2, kVar3);
        return G0.f406611a;
    }
}
