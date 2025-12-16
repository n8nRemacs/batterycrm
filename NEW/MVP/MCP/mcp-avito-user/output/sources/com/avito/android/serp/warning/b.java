package com.avito.android.serp.warning;

import AK0.l;
import Y61.k;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.serp.warning.WarningState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PermanentWarningStateStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/warning/b;", "Lcom/avito/android/serp/warning/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f273973a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<String> f273974b = Collections.singleton("jobNearbyWarningItem");

    public b(@k l lVar) {
        this.f273973a = lVar;
    }

    @Override // com.avito.android.serp.warning.h
    public final boolean c(@k String str) {
        return this.f273974b.contains(str);
    }

    @Override // com.avito.android.serp.warning.h
    @k
    public final WarningStateStorageState d0() {
        return new WarningStateStorageState();
    }

    @Override // com.avito.android.serp.warning.a
    @k
    public final WarningState e(@k String str) {
        Object objA;
        String string = this.f273973a.getString("warning_" + str);
        if (string == null) {
            return WarningState.f273966d;
        }
        WarningState.f273965c.getClass();
        WarningState[] warningStateArrValues = WarningState.values();
        ArrayList arrayList = new ArrayList();
        for (WarningState warningState : warningStateArrValues) {
            if (warningState.f273970b.equals(string)) {
                arrayList.add(warningState);
            }
        }
        org.funktionale.option.a aVarA = org.funktionale.option.e.a(C42745f0.G(arrayList));
        e eVar = e.f273976l;
        if (aVarA.b()) {
            eVar.invoke();
            objA = WarningState.f273967e;
        } else {
            objA = aVarA.a();
        }
        return (WarningState) objA;
    }

    @Override // com.avito.android.serp.warning.a
    public final void f(@k String str) {
        WarningState.a aVar = WarningState.f273965c;
        this.f273973a.putString(G.f("warning_", str), ConstraintKt.CONDITION_FLOW_HIDE);
    }

    @Override // com.avito.android.serp.warning.h
    @k
    public final String name() {
        return b.class.getName();
    }

    @Override // com.avito.android.serp.warning.h
    public final void d(@k WarningStateStorageState warningStateStorageState) {
    }
}
