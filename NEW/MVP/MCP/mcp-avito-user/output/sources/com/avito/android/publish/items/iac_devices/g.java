package com.avito.android.publish.items.iac_devices;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.publish.iac_devices.IacDevice;
import com.avito.android.publish.items.iac_devices.IacDevicesItem;
import io.reactivex.rxjava3.core.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: IacDevicesItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/iac_devices/g;", "Lcom/avito/android/publish/items/iac_devices/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f236874b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final OL.a f236875c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<IacDevicesItem.b> f236876d = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public g(@k Resources resources, @k OL.a aVar) {
        this.f236874b = resources;
        this.f236875c = aVar;
    }

    public final String O(List<IacDevice> list) {
        String str;
        List<IacDevice> list2 = list;
        Object obj = null;
        int i12 = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((IacDevice) it.next()).f236032e && (i12 = i12 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        if (i12 != 1) {
            return i12 > 1 ? this.f236874b.getQuantityString(R.plurals.selected_devices_plural, i12, Integer.valueOf(i12)) : "";
        }
        Iterator<T> it2 = list2.iterator();
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

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((i) eVar, (IacDevicesItem) aVar);
    }

    @Override // com.avito.android.publish.items.iac_devices.d
    public final z d() {
        return this.f236876d;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        IacDevicesItem iacDevicesItem = (IacDevicesItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof c) {
                obj = obj2;
            }
        }
        c cVar = (c) (obj instanceof c ? obj : null);
        if (cVar == null) {
            k(iVar, iacDevicesItem);
            return;
        }
        List<IacDevice> list2 = cVar.f236866a;
        if (list2 != null) {
            iVar.me(O(list2));
            iVar.Lb(new e(this, iacDevicesItem));
        }
        Boolean bool = cVar.f236867b;
        if (bool != null) {
            iVar.Zj(bool.booleanValue());
        }
        Boolean bool2 = cVar.f236868c;
        if (bool2 != null) {
            iVar.setEnabled(bool2.booleanValue());
        }
    }

    public final void k(@k i iVar, @k IacDevicesItem iacDevicesItem) {
        iVar.me(O(iacDevicesItem.f236854d));
        iVar.Lb(new f(this, iacDevicesItem));
        iVar.Zj(iacDevicesItem.f236857g);
        iVar.setEnabled(iacDevicesItem.f236856f);
        iVar.IX(iacDevicesItem.f236858h);
    }
}
