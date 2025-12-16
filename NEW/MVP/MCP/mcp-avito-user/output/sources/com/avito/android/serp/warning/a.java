package com.avito.android.serp.warning;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.warning.WarningState;
import kotlin.Metadata;

/* compiled from: AbstractWarningStateStorage.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/warning/a;", "Lcom/avito/android/serp/warning/h;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a implements h {
    @Override // com.avito.android.serp.warning.h
    @k
    public final WarningState a(@k String str) {
        if (c(str)) {
            return e(str);
        }
        throw new IllegalArgumentException("Don't processed id ".concat(str));
    }

    @Override // com.avito.android.serp.warning.h
    public final void b(@k String str) {
        WarningState.a aVar = WarningState.f273965c;
        if (!c(str)) {
            throw new IllegalArgumentException("Don't processed id ".concat(str));
        }
        f(str);
    }

    @k
    public abstract WarningState e(@k String str);

    public abstract void f(@k String str);
}
