package com.avito.android.messenger.channels.mvi.view;

import androidx.view.InterfaceC23040h0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LiveDatas.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class d0<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f188742b;

    public d0(g0 g0Var) {
        this.f188742b = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != 0) {
            i0 i0Var = this.f188742b.f188751f;
            if (i0Var != null) {
                if (i0Var.f188761e.getTabCount() > 1) {
                    i0Var.c();
                } else {
                    i0Var.f188762f = true;
                }
            }
        }
    }
}
