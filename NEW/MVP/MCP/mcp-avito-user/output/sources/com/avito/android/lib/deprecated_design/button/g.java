package com.avito.android.lib.deprecated_design.button;

import Y61.k;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.internal.operators.observable.C;
import kotlin.Metadata;

/* compiled from: Buttons.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_deprecated-components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {
    @k
    public static final C a(@k final a aVar) {
        return new C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.lib.deprecated_design.button.d
            @Override // io.reactivex.rxjava3.core.C
            public final void f(B b12) {
                final a aVar2 = aVar;
                b12.f(new l41.f() { // from class: com.avito.android.lib.deprecated_design.button.e
                    @Override // l41.f
                    public final void cancel() {
                        aVar2.c(null);
                    }
                });
                aVar2.c(new f(b12));
            }
        });
    }
}
