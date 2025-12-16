package org.koin.androidx.scope;

import androidx.fragment.app.ActivityC22955m;
import g71.C40544c;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.logger.Level;
import s71.AbstractC48011b;

/* compiled from: FragmentExt.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lorg/koin/core/scope/a;", "invoke", "()Lorg/koin/core/scope/a;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class h extends N implements Y41.a<org.koin.core.scope.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ScopeFragment f421412l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ScopeFragment scopeFragment) {
        super(0);
        this.f421412l = scopeFragment;
    }

    @Override // Y41.a
    public final org.koin.core.scope.a invoke() throws ScopeAlreadyCreatedException {
        ScopeFragment scopeFragment = this.f421412l;
        org.koin.core.scope.a aVarB = C40544c.a(scopeFragment).b(org.koin.core.component.g.a(scopeFragment));
        if (aVarB == null) {
            aVarB = f.a(scopeFragment, scopeFragment);
        }
        ActivityC22955m activityC22955mRequireActivity = scopeFragment.requireActivity();
        org.koin.core.scope.a aVarB2 = C40544c.a(activityC22955mRequireActivity).b(org.koin.core.component.g.a(activityC22955mRequireActivity));
        if (aVarB2 != null) {
            org.koin.core.scope.a[] aVarArr = {aVarB2};
            if (aVarB.f421473c) {
                throw new IllegalStateException("Can't add scope link to a root scope");
            }
            C42745f0.i(aVarB.f421475e, aVarArr);
        } else {
            AbstractC48011b abstractC48011b = aVarB.f421474d.f419399c;
            String str = "Fragment '" + scopeFragment + "' can't be linked to parent activity scope";
            Level level = Level.f421465b;
            if (abstractC48011b.b(level)) {
                abstractC48011b.a(level, str);
            }
        }
        return aVarB;
    }
}
