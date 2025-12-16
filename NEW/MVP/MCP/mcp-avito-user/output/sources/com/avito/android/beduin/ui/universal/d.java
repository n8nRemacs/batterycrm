package com.avito.android.beduin.ui.universal;

import com.avito.android.component.toast.f;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import gj.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UniversalBeduinFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "kotlin.jvm.PlatformType", "error", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/error/ApiError;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements Y41.l<ApiError, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalBeduinFragment f104458l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(UniversalBeduinFragment universalBeduinFragment) {
        super(1);
        this.f104458l = universalBeduinFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ApiError apiError) {
        o.a aVarA;
        ApiError apiError2 = apiError;
        f.c cVar = new f.c(apiError2);
        gj.o oVarC1 = this.f104458l.c1();
        if (oVarC1 != null && (aVarA = gj.p.a(oVarC1, cVar)) != null) {
            com.avito.android.component.toast.b.b(aVarA.f396763a, z.k(apiError2), 0, null, 0, null, 0, aVarA.f396764b, cVar, null, 130878);
        }
        return G0.f406611a;
    }
}
