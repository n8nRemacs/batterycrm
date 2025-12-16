package com.avito.android.lib.deprecated_design.tab.adapter;

import Y61.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TabsDataProvider.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/deprecated_design/tab/adapter/k;", "T", "Lcom/avito/android/lib/deprecated_design/tab/adapter/j;", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k<T> implements j<T> {

    /* renamed from: a, reason: collision with root package name */
    @l
    public UV0.c f178156a;

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.j
    public final void E5(@Y61.k List<? extends T> list) {
        this.f178156a = new UV0.c(list);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.j
    public final void b(@Y61.k UV0.c cVar) {
        this.f178156a = cVar;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.j
    public final int getCount() {
        UV0.c cVar = this.f178156a;
        if (cVar != null) {
            return cVar.getCount();
        }
        return 0;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.j
    public final T getItem(int i12) {
        UV0.c cVar = this.f178156a;
        if (cVar != null) {
            return cVar.f16399b.get(i12);
        }
        throw new IllegalStateException("Data source is not initialized yet");
    }
}
