package com.avito.android.util.architecture_components;

import androidx.view.C23038g0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import androidx.view.Lifecycle;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: OnResumeLiveData.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/architecture_components/C;", "T", "Landroidx/lifecycle/g0;", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class C<T> extends C23038g0<T> {

    /* compiled from: OnResumeLiveData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<T, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f318801l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC23040h0<? super T> f318802m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22983P interfaceC22983P, InterfaceC23040h0<? super T> interfaceC23040h0) {
            super(1);
            this.f318801l = interfaceC22983P;
            this.f318802m = interfaceC23040h0;
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            InterfaceC22983P interfaceC22983P = this.f318801l;
            boolean zA2 = interfaceC22983P.getLifecycle().getF46705d().a(Lifecycle.State.f46683f);
            InterfaceC23040h0<? super T> interfaceC23040h0 = this.f318802m;
            if (zA2) {
                interfaceC23040h0.onChanged(obj);
            } else {
                interfaceC22983P.getLifecycle().a(new B(interfaceC23040h0, obj, interfaceC22983P));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: OnResumeLiveData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f318803b;

        public b(Y41.l lVar) {
            this.f318803b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(this.f318803b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f318803b;
        }

        public final int hashCode() {
            return this.f318803b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f318803b.invoke(obj);
        }
    }

    @Override // androidx.view.AbstractC22991Y
    public final void observe(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k InterfaceC23040h0<? super T> interfaceC23040h0) {
        super.observe(interfaceC22983P, new b(new a(interfaceC22983P, interfaceC23040h0)));
    }
}
