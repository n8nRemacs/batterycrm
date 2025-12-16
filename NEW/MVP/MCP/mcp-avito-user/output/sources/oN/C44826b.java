package on;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartSimilarItemsNextPage.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lon/b;", "", "", "paginationRequest", "", "LSq0/c;", "components", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "a", "()Ljava/util/List;", "getActions", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: on.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C44826b {

    @c("actions")
    @l
    private final List<BeduinAction> actions;

    @c("components")
    @k
    private final List<Sq0.c> components;

    @c("paginationRequest")
    @l
    private final String paginationRequest;

    /* JADX WARN: Multi-variable type inference failed */
    public C44826b(@l String str, @k List<? extends Sq0.c> list, @l List<? extends BeduinAction> list2) {
        this.paginationRequest = str;
        this.components = list;
        this.actions = list2;
    }

    @k
    public final List<Sq0.c> a() {
        return this.components;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getPaginationRequest() {
        return this.paginationRequest;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44826b)) {
            return false;
        }
        C44826b c44826b = (C44826b) obj;
        return L.f(this.paginationRequest, c44826b.paginationRequest) && L.f(this.components, c44826b.components) && L.f(this.actions, c44826b.actions);
    }

    public final int hashCode() {
        String str = this.paginationRequest;
        int iE2 = H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.components);
        List<BeduinAction> list = this.actions;
        return iE2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartSimilarItemsNextPage(paginationRequest=");
        sb2.append(this.paginationRequest);
        sb2.append(", components=");
        sb2.append(this.components);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }
}
