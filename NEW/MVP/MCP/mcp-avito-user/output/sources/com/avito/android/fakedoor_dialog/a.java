package com.avito.android.fakedoor_dialog;

import D90.a;
import Y41.p;
import android.view.View;
import com.avito.android.fakedoor_dialog.FakeDoorDialogFragment;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.profile.pro.impl.screen.item.dashboard_stats.StatsItem;
import com.avito.android.profile.pro.impl.screen.item.dashboard_stats.h;
import com.avito.android.select.SegmentedControlRedesign;
import com.my.target.E;
import h11.InterfaceC40761a;
import hy.C41191c;
import hy.C41194f;
import iR.C41336a;
import java.util.ArrayList;
import kotlin.G0;
import mC.InterfaceC43943a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f155104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f155105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f155106d;

    public /* synthetic */ a(int i12, int i13, Object obj) {
        this.f155104b = i13;
        this.f155106d = obj;
        this.f155105c = i12;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z12 = true;
        int i12 = this.f155105c;
        Object obj = this.f155106d;
        switch (this.f155104b) {
            case 0:
                FakeDoorDialogFragment.a aVar = FakeDoorDialogFragment.f155081o0;
                C41336a.C11375a.a();
                ((d) ((FakeDoorDialogFragment) obj).f155085j0.getValue()).accept(new InterfaceC43943a.C11817a(i12));
                break;
            case 1:
                ((com.avito.android.inline_filters.dialog.location_group.adapter.e) obj).f171740c.invoke(Integer.valueOf(i12));
                break;
            case 2:
                ((com.avito.android.inline_filters.dialog.location_group.adapter.select_with_title.e) obj).f171770c.invoke(Integer.valueOf(i12));
                break;
            case 3:
                ((com.avito.android.lib.design.item_color_picker.b) obj).f179473c.d(i12);
                break;
            case 4:
                h hVar = (h) obj;
                ArrayList arrayList = hVar.f223175c;
                hVar.f223176d.invoke(new a.f(((StatsItem) arrayList.get(i12)).f223161i, ((StatsItem) arrayList.get(i12)).f223156d));
                break;
            case 5:
                ((com.avito.android.rating_ui.aspects.view.a) obj).f249899c.e(i12, true, false);
                break;
            case 6:
                int i13 = SegmentedControlRedesign.f264969h;
                SegmentedControlRedesign segmentedControlRedesign = (SegmentedControlRedesign) obj;
                segmentedControlRedesign.e(i12, true);
                p<? super Integer, ? super CharSequence, G0> pVar = segmentedControlRedesign.f264975g;
                if (pVar != null) {
                    pVar.invoke(Integer.valueOf(i12), ((SegmentedControl.c) segmentedControlRedesign.f264970b.get(i12)).f180221a);
                    break;
                }
                break;
            case 7:
                com.avito.android.short_term_rent.view.components.toggle_v2.e eVar = ((com.avito.android.short_term_rent.view.components.toggle_v2.c) obj).f283069c;
                if (eVar != null) {
                    eVar.b(i12);
                    break;
                }
                break;
            case 8:
                E.a aVar2 = (E.a) obj;
                if (i12 < 0) {
                    int i14 = E.a.f364374d;
                    break;
                } else {
                    ArrayList arrayList2 = aVar2.f364375b;
                    if (i12 < arrayList2.size()) {
                        h11.b bVar = (h11.b) arrayList2.get(i12);
                        InterfaceC40761a.InterfaceC11238a interfaceC11238a = aVar2.f364376c.get();
                        if (interfaceC11238a != null) {
                            interfaceC11238a.a(bVar);
                            break;
                        }
                    }
                }
                break;
            default:
                boolean zIsChecked = ((ListItemCheckmark) view).isChecked();
                C41191c c41191c = ((C41194f) obj).f398319b;
                Boolean[] boolArr = c41191c.f398317e;
                if (i12 == 0) {
                    for (int i15 = 0; i15 < 7; i15++) {
                        boolArr[i15] = Boolean.valueOf(zIsChecked);
                        C41194f c41194f = c41191c.f398316d;
                        if (c41194f != null) {
                            c41194f.a(i15 + 1, zIsChecked);
                        }
                    }
                    break;
                } else {
                    boolArr[i12 - 1] = Boolean.valueOf(zIsChecked);
                    C41194f c41194f2 = c41191c.f398316d;
                    if (c41194f2 != null) {
                        int length = boolArr.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 < length) {
                                if (boolArr[i16].booleanValue()) {
                                    i16++;
                                } else {
                                    z12 = false;
                                }
                            }
                        }
                        c41194f2.a(0, z12);
                        break;
                    }
                }
                break;
        }
    }
}
