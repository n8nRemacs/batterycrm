package com.avito.android.serp.warning;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.HashMap;
import kotlin.Metadata;

/* compiled from: TemporalWarningStateStorage.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/warning/d;", "Lcom/avito/android/serp/warning/a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final HashMap f273975a = new HashMap();

    @Override // com.avito.android.serp.warning.h
    public final boolean c(@k String str) {
        return true;
    }

    @Override // com.avito.android.serp.warning.h
    public final void d(@k WarningStateStorageState warningStateStorageState) {
        if (warningStateStorageState instanceof TemporalWarningStateStorageState) {
            HashMap map = this.f273975a;
            map.clear();
            map.putAll(((TemporalWarningStateStorageState) warningStateStorageState).f273964b);
        }
    }

    @Override // com.avito.android.serp.warning.h
    @k
    public final WarningStateStorageState d0() {
        return new TemporalWarningStateStorageState(this.f273975a);
    }

    @Override // com.avito.android.serp.warning.a
    @k
    public final WarningState e(@k String str) {
        WarningState warningState = (WarningState) this.f273975a.get(str);
        return warningState != null ? warningState : WarningState.f273966d;
    }

    @Override // com.avito.android.serp.warning.a
    public final void f(@k String str) {
        this.f273975a.put(str, WarningState.f273967e);
    }

    @Override // com.avito.android.serp.warning.h
    @k
    public final String name() {
        return d.class.getName();
    }
}
