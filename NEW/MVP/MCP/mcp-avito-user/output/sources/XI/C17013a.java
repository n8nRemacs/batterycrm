package Xi;

import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.custom.c;
import com.avito.android.beduin_shared.model.action.custom.selectTab.BeduinSelectTabAction;
import com.avito.android.di.B;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinSelectTabActionHandler.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LXi/a;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/beduin_shared/model/action/custom/selectTab/BeduinSelectTabAction;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17013a implements c<BeduinSelectTabAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f19039a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41981q0 f19040b;

    @Inject
    public C17013a() {
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f19039a = cVar;
        this.f19040b = new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        this.f19039a.accept(((BeduinSelectTabAction) beduinAction).getTabId());
    }
}
