package com.avito.android.vas_performance.ui.applied_services;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AppliedServicesDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Action f321424l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AppliedServicesDialogFragment f321425m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Action action, AppliedServicesDialogFragment appliedServicesDialogFragment) {
        super(0);
        this.f321424l = action;
        this.f321425m = appliedServicesDialogFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        Action action = this.f321424l;
        if (action != null && (deepLink = action.getDeepLink()) != null) {
            j jVar = this.f321425m.f321409k0;
            if (jVar == null) {
                jVar = null;
            }
            jVar.f(deepLink);
        }
        return G0.f406611a;
    }
}
