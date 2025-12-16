package com.avito.android.success_screen_after_apply.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.success_screen_after_apply.mvi.a;
import com.avito.android.success_screen_after_apply.ui.SuccessScreenAfterApplyOpenParams;
import hA0.C40793a;
import hA0.C40797e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SuccessScreenAfterApplyActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/success_screen_after_apply/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/success_screen_after_apply/mvi/a;", "Lcom/avito/android/success_screen_after_apply/mvi/i;", "Lcom/avito/android/success_screen_after_apply/mvi/m;", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.arch.mvi.a<a, i, m> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SuccessScreenAfterApplyOpenParams f291731a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C40793a f291732b;

    @Inject
    public d(@Y61.k SuccessScreenAfterApplyOpenParams successScreenAfterApplyOpenParams, @Y61.k C40793a c40793a) {
        this.f291731a = successScreenAfterApplyOpenParams;
        this.f291732b = c40793a;
        c40793a.f397083a.c(new C40797e(String.valueOf(c40793a.f397085c.f291768b), c40793a.f397084b.a()));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<i> b(a aVar, m mVar) {
        a aVar2 = aVar;
        if (aVar2.equals(a.C8834a.f291723a)) {
            return C43175k.G(new b(this, null));
        }
        if (aVar2.equals(a.b.f291724a)) {
            return C43175k.G(new c(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
