package com.avito.android.mortgage_invite.client_form;

import androidx.fragment.app.ActivityC22955m;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ApplicationClientFormFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_invite.client_form.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32795g extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ApplicationClientFormFragment f205194l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f205195m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32795g(ApplicationClientFormFragment applicationClientFormFragment, ActivityC22955m activityC22955m) {
        super(2);
        this.f205194l = applicationClientFormFragment;
        this.f205195m = activityC22955m;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            ApplicationClientFormFragment applicationClientFormFragment = this.f205194l;
            com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) applicationClientFormFragment.f205021s0.getValue(), androidx.compose.runtime.internal.r.c(-1428143768, new C32794f(applicationClientFormFragment, this.f205195m), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
