package com.avito.android.select.new_metro;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.SelectResult;
import com.avito.android.select.new_metro.SelectMetroFragment;
import com.avito.android.select.new_metro.item.MetroStationItem;
import com.avito.android.util.K2;
import com.avito.android.util.architecture_components.D;
import iq0.InterfaceC42092b;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;

/* compiled from: SelectMetroFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class g extends H implements Y41.l<InterfaceC42092b, G0> {
    @Override // Y41.l
    public final G0 invoke(InterfaceC42092b interfaceC42092b) {
        InterfaceC42092b interfaceC42092b2 = interfaceC42092b;
        SelectMetroFragment selectMetroFragment = (SelectMetroFragment) this.receiver;
        SelectMetroFragment.a aVar = SelectMetroFragment.f265914C0;
        selectMetroFragment.getClass();
        if (interfaceC42092b2 instanceof InterfaceC42092b.a) {
            View view = selectMetroFragment.getView();
            if (view != null) {
                K2.d(view, true);
            }
            if (selectMetroFragment.l1() instanceof SelectMetroActivity) {
                ActivityC22955m activityC22955mL1 = selectMetroFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.setResult(0);
                }
                ActivityC22955m activityC22955mL12 = selectMetroFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.finish();
                }
            } else {
                selectMetroFragment.B5(0, null);
                selectMetroFragment.r5();
            }
        } else if (interfaceC42092b2 instanceof InterfaceC42092b.C11538b) {
            InterfaceC42092b.C11538b c11538b = (InterfaceC42092b.C11538b) interfaceC42092b2;
            View view2 = selectMetroFragment.getView();
            if (view2 != null) {
                K2.d(view2, true);
            }
            String str = selectMetroFragment.f265921x0;
            ArrayList<MetroStationItem> arrayList = c11538b.f405267a;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            for (MetroStationItem metroStationItem : arrayList) {
                arrayList2.add(new Metro(String.valueOf(metroStationItem.f266202e), metroStationItem.f266203f, null));
            }
            Intent intentPutExtra = new Intent().putExtra("select_result", new SelectResult(str, arrayList2, null, 4, null));
            D<List<ParcelableEntity<String>>> d12 = selectMetroFragment.f265923z0;
            if (d12.hasActiveObservers()) {
                d12.setValue(arrayList2);
            } else if (selectMetroFragment.l1() instanceof SelectMetroActivity) {
                ActivityC22955m activityC22955mL13 = selectMetroFragment.l1();
                if (activityC22955mL13 != null) {
                    activityC22955mL13.setResult(-1, intentPutExtra);
                }
                ActivityC22955m activityC22955mL14 = selectMetroFragment.l1();
                if (activityC22955mL14 != null) {
                    activityC22955mL14.finish();
                }
            } else {
                selectMetroFragment.B5(-1, intentPutExtra);
                selectMetroFragment.r5();
            }
        }
        return G0.f406611a;
    }
}
