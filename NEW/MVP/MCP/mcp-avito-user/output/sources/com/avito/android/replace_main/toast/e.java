package com.avito.android.replace_main.toast;

import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: ReplaceMainToastFactoryImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<i> f254597l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f254598m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l0.h<i> hVar, h hVar2) {
        super(0);
        this.f254597l = hVar;
        this.f254598m = hVar2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        i iVar = this.f254597l.f406842b;
        if (iVar != null) {
            iVar.setState(new ToastBarState(null, null, null, null, null, null, null, 0, false, false, null, ToastBarState.State.f181136c, 2047, null));
        }
        this.f254598m.f254605g.invoke();
        return G0.f406611a;
    }
}
