package Wi;

import Y61.k;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.custom.c;
import com.avito.android.beduin_shared.model.action.custom.reloadScreen.BeduinCancelScreenReloadAction;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BeduinCancelScreenReloadActionHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LWi/a;", "Lcom/avito/android/beduin_shared/model/action/custom/c;", "Lcom/avito/android/beduin_shared/model/action/custom/reloadScreen/BeduinCancelScreenReloadAction;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Wi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15766a implements c<BeduinCancelScreenReloadAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f18018a;

    public C15766a() {
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f18018a = cVar;
        new C41981q0(cVar);
    }

    @Override // com.avito.android.beduin_shared.model.action.custom.c
    public final void a(BeduinAction beduinAction, InterfaceC40691b interfaceC40691b) {
        this.f18018a.accept(G0.f406611a);
    }
}
