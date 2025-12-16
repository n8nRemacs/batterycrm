package gj;

import com.avito.android.beduin_models.BeduinAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCustomActionHandlerAssociation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lgj/f;", "Lcom/avito/android/beduin_models/BeduinAction;", "Action", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class f<Action extends BeduinAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Class<Action> f396755a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin_shared.model.action.custom.c<Action> f396756b;

    public f(@Y61.k Class<Action> cls, @Y61.k com.avito.android.beduin_shared.model.action.custom.c<Action> cVar) {
        this.f396755a = cls;
        this.f396756b = cVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f396755a, fVar.f396755a) && L.f(this.f396756b, fVar.f396756b);
    }

    public final int hashCode() {
        return this.f396756b.hashCode() + (this.f396755a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "BeduinCustomActionHandlerAssociation(actionClass=" + this.f396755a + ", actionHandler=" + this.f396756b + ')';
    }
}
