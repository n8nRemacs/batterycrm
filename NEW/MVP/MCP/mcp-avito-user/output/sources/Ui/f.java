package Ui;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_shared.model.action.BeduinActionsResponse;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRequestState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUi/f;", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final BeduinAction f16554a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final P2<BeduinActionsResponse> f16555b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k BeduinAction beduinAction, @k P2<? super BeduinActionsResponse> p22) {
        this.f16554a = beduinAction;
        this.f16555b = p22;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f16554a, fVar.f16554a) && L.f(this.f16555b, fVar.f16555b);
    }

    public final int hashCode() {
        return this.f16555b.hashCode() + (this.f16554a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "BeduinRequestState(action=" + this.f16554a + ", loadingState=" + this.f16555b + ')';
    }
}
