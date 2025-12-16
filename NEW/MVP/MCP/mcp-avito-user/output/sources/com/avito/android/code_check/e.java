package com.avito.android.code_check;

import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.M0;
import kotlin.Metadata;

/* compiled from: CodeCheckDataViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check/e;", "Landroidx/lifecycle/a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e extends AbstractC22993a {
    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (cls.isAssignableFrom(g.class)) {
            return new g(c23060r0);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
