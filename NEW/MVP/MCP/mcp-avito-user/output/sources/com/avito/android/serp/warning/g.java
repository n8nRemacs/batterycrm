package com.avito.android.serp.warning;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.warning.WarningState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: WarningStateProviderImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/warning/g;", "Lcom/avito/android/serp/warning/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<h> f273977a;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k List<? extends h> list, @l WarningStateProviderState warningStateProviderState) {
        this.f273977a = list;
        if (warningStateProviderState != null) {
            for (h hVar : list) {
                WarningStateStorageState warningStateStorageState = warningStateProviderState.f273971b.get(hVar.name());
                if (warningStateStorageState != null) {
                    hVar.d(warningStateStorageState);
                }
            }
        }
    }

    @Override // com.avito.android.serp.warning.f
    @k
    public final WarningState a(@k String str) {
        WarningState warningStateA;
        List<h> list = this.f273977a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((h) obj).c(str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((h) next).a(str) == WarningState.f273967e) {
                arrayList2.add(next);
            }
        }
        h hVar = (h) C42745f0.G(arrayList2);
        return (hVar == null || (warningStateA = hVar.a(str)) == null) ? WarningState.f273966d : warningStateA;
    }

    @Override // com.avito.android.serp.warning.f
    public final void b(@k String str) {
        WarningState.a aVar = WarningState.f273965c;
        List<h> list = this.f273977a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((h) obj).c(str)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((h) it.next()).b(str);
        }
    }
}
