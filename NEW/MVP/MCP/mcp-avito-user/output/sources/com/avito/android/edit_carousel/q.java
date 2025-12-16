package com.avito.android.edit_carousel;

import android.content.Context;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import ry.DialogC47939a;
import ty.InterfaceC48739b;

/* compiled from: EditCarouselView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class q extends H implements Y41.l<InterfaceC48739b, G0> {
    public final void f(@Y61.k InterfaceC48739b interfaceC48739b) {
        ActivityC22955m activityC22955mL1;
        v vVar = (v) this.receiver;
        vVar.getClass();
        boolean z12 = interfaceC48739b instanceof InterfaceC48739b.d;
        Context context = vVar.f146549f;
        if (z12) {
            DialogC47939a dialogC47939a = new DialogC47939a(context, context.getString(R.string.extended_profile_carousel_edit_sort_type_picker_title), ((InterfaceC48739b.d) interfaceC48739b).f439693a, new u(vVar));
            com.avito.android.lib.util.g.a(dialogC47939a);
            dialogC47939a.s();
            return;
        }
        if (interfaceC48739b instanceof InterfaceC48739b.c) {
            com.avito.android.lib.util.g.a(new DialogC47939a(context, context.getString(R.string.extended_profile_carousel_edit_name_picker_title), ((InterfaceC48739b.c) interfaceC48739b).f439692a, new t(vVar)));
            return;
        }
        if (interfaceC48739b instanceof InterfaceC48739b.f) {
            com.avito.android.extended_profile_ui_components.p.c(com.avito.android.extended_profile_ui_components.p.f153373a, vVar.f146544a, ((InterfaceC48739b.f) interfaceC48739b).f439695a, vVar.f146548e, null);
            return;
        }
        if (interfaceC48739b instanceof InterfaceC48739b.e) {
            RecyclerView.Adapter adapter = vVar.f146552i.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        boolean z13 = interfaceC48739b instanceof InterfaceC48739b.a;
        EditCarouselFragment editCarouselFragment = vVar.f146547d;
        if (z13) {
            ActivityC22955m activityC22955mL12 = editCarouselFragment.l1();
            if (activityC22955mL12 != null) {
                activityC22955mL12.finish();
                return;
            }
            return;
        }
        if (!(interfaceC48739b instanceof InterfaceC48739b.C12696b) || (activityC22955mL1 = editCarouselFragment.l1()) == null) {
            return;
        }
        activityC22955mL1.setResult(-1);
        activityC22955mL1.finish();
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC48739b interfaceC48739b) {
        f(interfaceC48739b);
        return G0.f406611a;
    }
}
