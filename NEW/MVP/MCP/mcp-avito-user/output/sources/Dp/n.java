package dp;

import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.api.model.Direction;
import com.avito.android.comfortable_deal.api.model.Type;
import kotlin.Metadata;

/* compiled from: SortInfo.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldp/n;", "", "Lcom/avito/android/comfortable_deal/api/model/Type;", "type", "Lcom/avito/android/comfortable_deal/api/model/Direction;", "direction", "<init>", "(Lcom/avito/android/comfortable_deal/api/model/Type;Lcom/avito/android/comfortable_deal/api/model/Direction;)V", "Lcom/avito/android/comfortable_deal/api/model/Type;", "getType", "()Lcom/avito/android/comfortable_deal/api/model/Type;", "Lcom/avito/android/comfortable_deal/api/model/Direction;", "getDirection", "()Lcom/avito/android/comfortable_deal/api/model/Direction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class n {

    @com.google.gson.annotations.c("direction")
    @Y61.k
    private final Direction direction;

    @com.google.gson.annotations.c("field")
    @Y61.k
    private final Type type;

    public n(@Y61.k Type type, @Y61.k Direction direction) {
        this.type = type;
        this.direction = direction;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.type == nVar.type && this.direction == nVar.direction;
    }

    public final int hashCode() {
        return this.direction.hashCode() + (this.type.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "SortInfo(type=" + this.type + ", direction=" + this.direction + ')';
    }
}
