package com.avito.android.remote;

import com.avito.android.InterfaceC32948p;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SupportFeaturesHeaderProviderImpl.kt */
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/m1;", "Lcom/avito/android/remote/l1;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class m1 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32948p f253570a;

    @Inject
    public m1(@Y61.k InterfaceC32948p interfaceC32948p) {
        this.f253570a = interfaceC32948p;
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b */
    public final boolean getF253513b() {
        return false;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "X-Supported-Features";
    }

    @Override // hd.InterfaceC40915a
    @Y61.l
    /* renamed from: getValue */
    public final String getF253512a() {
        List<DE0.a<Object>> listA = this.f253570a.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            DE0.a aVar = (DE0.a) obj;
            String f3110e = aVar.getF3110e();
            if (f3110e != null && f3110e.length() != 0 && (aVar.getValue() instanceof Boolean) && kotlin.jvm.internal.L.f(aVar.getValue(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((DE0.a) it.next()).getF3110e());
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String strF = (String) it2.next();
            if (sb2.length() != 0) {
                strF = androidx.camera.camera2.internal.G.f(";", strF);
            }
            sb2.append(strF);
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }
}
