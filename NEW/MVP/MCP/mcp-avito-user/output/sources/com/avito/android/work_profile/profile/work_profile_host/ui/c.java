package com.avito.android.work_profile.profile.work_profile_host.ui;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WorkProfileHostFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ WorkProfileHostFragment f331312l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WorkProfileHostFragment workProfileHostFragment) {
        super(0);
        this.f331312l = workProfileHostFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f331312l.requireActivity().finish();
        return G0.f406611a;
    }
}
