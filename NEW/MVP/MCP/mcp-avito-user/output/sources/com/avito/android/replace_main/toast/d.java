package com.avito.android.replace_main.toast;

import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ReplaceMainToastFactoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/replace_main/toast/d;", "Lcom/avito/android/replace_main/toast/a;", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0.h<i> f254596a;

    public d(l0.h<i> hVar) {
        this.f254596a = hVar;
    }

    @Override // com.avito.android.replace_main.toast.a
    public final void dismiss() {
        this.f254596a.f406842b.setState(new ToastBarState(null, null, null, null, null, null, null, 0, false, false, null, ToastBarState.State.f181136c, 2047, null));
    }
}
