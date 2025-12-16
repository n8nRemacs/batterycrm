package com.avito.android.util.architecture_components;

import androidx.view.C23038g0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SingleLiveEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/architecture_components/D;", "T", "Landroidx/lifecycle/g0;", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class D<T> extends C23038g0<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f318804a = new AtomicBoolean(false);

    @Inject
    public D() {
    }

    @Override // androidx.view.AbstractC22991Y
    public final void observe(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k InterfaceC23040h0<? super T> interfaceC23040h0) {
        if (hasActiveObservers()) {
            throw new IllegalStateException("Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(interfaceC22983P, new Ba1.F(3, this, interfaceC23040h0));
    }

    @Override // androidx.view.C23038g0, androidx.view.AbstractC22991Y
    public final void setValue(T t12) {
        this.f318804a.set(true);
        super.setValue(t12);
    }
}
