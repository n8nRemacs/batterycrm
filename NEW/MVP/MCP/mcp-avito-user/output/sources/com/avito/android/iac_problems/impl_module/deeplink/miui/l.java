package com.avito.android.iac_problems.impl_module.deeplink.miui;

import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.b1;

/* compiled from: IacMiuiPermissionAnalyticsHelper.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/deeplink/miui/l;", "Lcom/avito/android/iac_problems/impl_module/deeplink/miui/k;", "<init>", "()V", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public Object f168751a = B0.f406639b;

    @Inject
    public l() {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Set] */
    @Override // com.avito.android.iac_problems.impl_module.deeplink.miui.k
    public final void a(@Y61.k cc.e eVar, @Y61.k Y41.l lVar) {
        C42829l0 c42829l0 = new C42829l0(Integer.valueOf(eVar.getF2413b()), Integer.valueOf(eVar.getF2414c()), eVar.getParams());
        if (this.f168751a.contains(c42829l0)) {
            return;
        }
        this.f168751a = b1.i(this.f168751a, c42829l0);
        lVar.invoke(eVar);
    }
}
