package com.avito.android.authorization.upgrade_password;

import com.avito.android.credman.o;
import kotlin.Metadata;
import xn0.C49971a;

/* compiled from: UpgradePasswordPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/credman/o$a;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/credman/o$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f94829b;

    public t(x xVar) {
        this.f94829b = xVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        UpgradePasswordFragment upgradePasswordFragment;
        boolean z12 = ((o.a) obj) instanceof o.a.b;
        x xVar = this.f94829b;
        if (z12 && (upgradePasswordFragment = xVar.f94846o) != null) {
            C49971a.a(upgradePasswordFragment.requireActivity());
        }
        xVar.h();
    }
}
