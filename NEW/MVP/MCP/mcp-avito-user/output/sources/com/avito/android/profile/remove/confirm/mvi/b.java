package com.avito.android.profile.remove.confirm.mvi;

import J90.a;
import Y61.k;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ProfileRemoveConfirmActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/remove/confirm/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LJ90/a;", "LJ90/b;", "LJ90/d;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.arch.mvi.a<J90.a, J90.b, J90.d> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.profile.remove.confirm.h f223871a;

    @Inject
    public b(@k com.avito.android.profile.remove.confirm.h hVar) {
        this.f223871a = hVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<J90.b> b(J90.a aVar, J90.d dVar) {
        J90.a aVar2 = aVar;
        if (!(aVar2 instanceof a.C0510a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new a(this.f223871a.a(((a.C0510a) aVar2).f8811a));
    }
}
