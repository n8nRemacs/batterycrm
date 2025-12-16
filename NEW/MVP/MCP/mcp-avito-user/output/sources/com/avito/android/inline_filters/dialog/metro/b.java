package com.avito.android.inline_filters.dialog.metro;

import Y41.l;
import Y61.k;
import androidx.view.InterfaceC23040h0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;

/* compiled from: MetroSelectDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_inline-filters_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* compiled from: MetroSelectDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f171858b;

        public a(l lVar) {
            this.f171858b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f171858b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f171858b;
        }

        public final int hashCode() {
            return this.f171858b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f171858b.invoke(obj);
        }
    }
}
