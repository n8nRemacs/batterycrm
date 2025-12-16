package com.avito.android.sbc.autodispatches;

import Po0.InterfaceC14819c;
import com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SbcAutoDispatchesInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchOut;", "active", "inactive", "LPo0/c;", "invoke", "(Ljava/util/List;Ljava/util/List;)LPo0/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class r extends N implements Y41.p<List<? extends AutoDispatchOut>, List<? extends AutoDispatchOut>, InterfaceC14819c> {

    /* renamed from: l, reason: collision with root package name */
    public static final r f258955l = new r();

    public r() {
        super(2);
    }

    @Override // Y41.p
    public final InterfaceC14819c invoke(List<? extends AutoDispatchOut> list, List<? extends AutoDispatchOut> list2) {
        return new InterfaceC14819c.C0866c(list, list2, false);
    }
}
