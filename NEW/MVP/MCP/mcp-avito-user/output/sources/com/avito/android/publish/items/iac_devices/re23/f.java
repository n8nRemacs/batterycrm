package com.avito.android.publish.items.iac_devices.re23;

import Hj.C13996a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.items.ItemWithState;
import com.avito.android.publish.iac_devices.IacDevice;
import com.avito.android.publish.items.iac_devices.IacDevicesItem;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PublishIacDevicesItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/iac_devices/re23/f;", "Lcom/avito/android/publish/items/iac_devices/re23/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final OL.a f236896b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<IacDevicesItem.b> f236897c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C41981q0 f236898d;

    @Inject
    public f(@k OL.a aVar) {
        this.f236896b = aVar;
        com.jakewharton.rxrelay3.c<IacDevicesItem.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f236897c = cVar;
        this.f236898d = new C41981q0(cVar);
    }

    public static String O(h hVar, List list) {
        String str;
        List list2 = list;
        Object obj = null;
        int i12 = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((IacDevice) it.next()).f236032e && (i12 = i12 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        if (i12 != 1) {
            return i12 > 1 ? hVar.getContext().getResources().getQuantityString(R.plurals.selected_devices_plural, i12, Integer.valueOf(i12)) : "";
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((IacDevice) next).f236032e) {
                obj = next;
                break;
            }
        }
        IacDevice iacDevice = (IacDevice) obj;
        return (iacDevice == null || (str = iacDevice.f236029b) == null) ? "" : str;
    }

    public static C13996a k(h hVar, IacDevicesItem iacDevicesItem) {
        String string = hVar.getContext().getString(R.string.iac_devices_choose_title_re23);
        return new C13996a(string, iacDevicesItem.f236857g ? new ItemWithState.State.Error.ErrorWithMessage(hVar.getContext().getString(R.string.iac_devices_dialog_error)) : iacDevicesItem.f236853c, string.length() == 0, false, null, null, null, null, iacDevicesItem.f236858h ? hVar.getContext().getString(R.string.iac_devices_badge) : null, 248, null);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        IacDevicesItem iacDevicesItem = (IacDevicesItem) aVar;
        hVar.pe(O(hVar, iacDevicesItem.f236854d));
        hVar.Lb(new e(this, iacDevicesItem));
        hVar.a60(k(hVar, iacDevicesItem));
        hVar.setEnabled(iacDevicesItem.f236856f);
    }

    @Override // com.avito.android.publish.items.iac_devices.re23.c
    @k
    public final z<IacDevicesItem.b> d() {
        return this.f236898d;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        IacDevicesItem iacDevicesItem = (IacDevicesItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.publish.items.iac_devices.c) {
                obj = obj2;
            }
        }
        if (!(obj instanceof com.avito.android.publish.items.iac_devices.c)) {
            obj = null;
        }
        com.avito.android.publish.items.iac_devices.c cVar = (com.avito.android.publish.items.iac_devices.c) obj;
        if (cVar == null) {
            hVar.pe(O(hVar, iacDevicesItem.f236854d));
            hVar.Lb(new e(this, iacDevicesItem));
            hVar.a60(k(hVar, iacDevicesItem));
            hVar.setEnabled(iacDevicesItem.f236856f);
            return;
        }
        List<IacDevice> list2 = cVar.f236866a;
        if (list2 != null) {
            hVar.pe(O(hVar, list2));
            hVar.Lb(new d(this, iacDevicesItem));
        }
        Boolean bool = cVar.f236867b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : iacDevicesItem.f236857g;
        Boolean bool2 = cVar.f236869d;
        IacDevicesItem iacDevicesItemA = IacDevicesItem.a(iacDevicesItem, null, zBooleanValue, bool2 != null ? bool2.booleanValue() : iacDevicesItem.f236858h, 31);
        IacDevicesItem iacDevicesItem2 = iacDevicesItemA.equals(iacDevicesItem) ? null : iacDevicesItemA;
        if (iacDevicesItem2 != null) {
            hVar.a60(k(hVar, iacDevicesItem2));
        }
        Boolean bool3 = cVar.f236868c;
        if (bool3 != null) {
            hVar.setEnabled(bool3.booleanValue());
        }
    }
}
