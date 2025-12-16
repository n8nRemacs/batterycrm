package iI0;

import kotlin.Metadata;
import mx0.InterfaceC44149a;

/* compiled from: UserAdvertDeliverySettingsUpdateEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LiI0/H;", "Lmx0/a;", "", "itemId", "<init>", "(J)V", "J", "a", "()J", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class H implements InterfaceC44149a {

    @com.google.gson.annotations.c("itemId")
    private final long itemId;

    public H(long j12) {
        this.itemId = j12;
    }

    /* renamed from: a, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && this.itemId == ((H) obj).itemId;
    }

    public final int hashCode() {
        return Long.hashCode(this.itemId);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.u(new StringBuilder("UserAdvertDeliverySettingsUpdateEvent(itemId="), this.itemId, ')');
    }
}
