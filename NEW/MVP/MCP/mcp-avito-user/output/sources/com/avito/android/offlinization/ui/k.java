package com.avito.android.offlinization.ui;

import androidx.view.C22984Q;
import androidx.view.C23050m0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import kotlin.Metadata;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ProcessLifecycleOwnerRestartableScope.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_offlinization_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k {

    /* compiled from: ProcessLifecycleOwnerRestartableScope.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/offlinization/ui/k$a", "Landroidx/lifecycle/q;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC23057q {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public N0 f208638b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Boolean> f208639c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Object> f208640d;

        public a(Y41.a<Boolean> aVar, InterfaceC43160i<Object> interfaceC43160i) {
            this.f208639c = aVar;
            this.f208640d = interfaceC43160i;
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onStart(@Y61.k InterfaceC22983P interfaceC22983P) {
            if (this.f208639c.invoke().booleanValue()) {
                C23050m0.f46822j.getClass();
                C23050m0.f46823k.f46829g.c(this);
            }
            C23050m0.f46822j.getClass();
            this.f208638b = C43175k.K(this.f208640d, C22984Q.a(C23050m0.f46823k));
        }

        @Override // androidx.view.InterfaceC23057q
        public final void onStop(@Y61.k InterfaceC22983P interfaceC22983P) {
            N0 n02 = this.f208638b;
            if (n02 != null) {
                n02.c(null);
            }
        }
    }

    public static final void a(@Y61.k Y41.a aVar, @Y61.k InterfaceC43160i interfaceC43160i) {
        C23050m0.f46822j.getClass();
        C23050m0.f46823k.f46829g.a(new a(aVar, interfaceC43160i));
    }
}
