package com.avito.android.analytics;

import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoPickerEventTracker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/c0;", "Lcom/avito/android/analytics/b0;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Set<l41.g<m80.k>> f89693a;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(@Y61.k Set<? extends l41.g<m80.k>> set) {
        this.f89693a = set;
    }

    @Override // com.avito.android.analytics.b0
    public final void a(@Y61.k m80.k kVar) {
        Iterator<T> it = this.f89693a.iterator();
        while (it.hasNext()) {
            ((l41.g) it.next()).accept(kVar);
        }
    }
}
