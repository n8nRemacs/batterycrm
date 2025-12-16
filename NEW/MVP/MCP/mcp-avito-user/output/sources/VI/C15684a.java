package Vi;

import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.custom.applyMapFilters.BeduinApplyMapFiltersAction;
import com.avito.android.beduin_shared.model.action.custom.c;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BeduinApplyMapFiltersActionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LVi/a;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/beduin_shared/model/action/custom/applyMapFilters/BeduinApplyMapFiltersAction;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15684a implements c<BeduinApplyMapFiltersAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<Map<String, Object>> f17363a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41981q0 f17364b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<Map<String, Object>> f17365c;

    public C15684a() {
        com.jakewharton.rxrelay3.c<Map<String, Object>> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f17363a = cVar;
        this.f17364b = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<Map<String, Object>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f17365c = cVar2;
        new C41981q0(cVar2);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        BeduinApplyMapFiltersAction beduinApplyMapFiltersAction = (BeduinApplyMapFiltersAction) beduinAction;
        if (beduinApplyMapFiltersAction.getPreselectedFilters() != null) {
            this.f17365c.accept(beduinApplyMapFiltersAction.getPreselectedFilters());
        } else {
            this.f17363a.accept(interfaceC40691b.h().d(beduinApplyMapFiltersAction.getParameterIds()));
        }
    }
}
