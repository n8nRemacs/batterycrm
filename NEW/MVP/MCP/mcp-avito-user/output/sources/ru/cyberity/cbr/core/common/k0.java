package ru.cyberity.cbr.core.common;

import androidx.view.AbstractC22991Y;
import androidx.view.InterfaceC23040h0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;

/* compiled from: LiveDataExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class k0 {

    /* compiled from: LiveDataExtensions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"ru/cyberity/cbr/core/common/k0$a", "Landroidx/lifecycle/h0;", "t", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public final class a implements InterfaceC23040h0<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC22991Y<Object> f432741a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Continuation<Object> f432742b;

        @Override // androidx.view.InterfaceC23040h0
        public void onChanged(@Y61.l Object t12) {
            this.f432741a.removeObserver(this);
            Continuation<Object> continuation = this.f432742b;
            int i12 = Z.f406624c;
            continuation.resumeWith(t12);
        }
    }
}
