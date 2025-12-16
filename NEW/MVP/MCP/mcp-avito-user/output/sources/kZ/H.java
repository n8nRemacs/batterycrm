package KZ;

import com.avito.android.mortgage.api.model.ActionButton;
import kotlin.Metadata;

/* compiled from: ApplicationTeamItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKZ/H;", "", "LKZ/I;", "member", "Lcom/avito/android/mortgage/api/model/ActionButton;", "action", "<init>", "(LKZ/I;Lcom/avito/android/mortgage/api/model/ActionButton;)V", "LKZ/I;", "b", "()LKZ/I;", "Lcom/avito/android/mortgage/api/model/ActionButton;", "a", "()Lcom/avito/android/mortgage/api/model/ActionButton;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class H {

    @com.google.gson.annotations.c("action")
    @Y61.l
    private final ActionButton action;

    @com.google.gson.annotations.c("member")
    @Y61.k
    private final I member;

    public H(@Y61.k I i12, @Y61.l ActionButton actionButton) {
        this.member = i12;
        this.action = actionButton;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final ActionButton getAction() {
        return this.action;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final I getMember() {
        return this.member;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h12 = (H) obj;
        return kotlin.jvm.internal.L.f(this.member, h12.member) && kotlin.jvm.internal.L.f(this.action, h12.action);
    }

    public final int hashCode() {
        int iHashCode = this.member.hashCode() * 31;
        ActionButton actionButton = this.action;
        return iHashCode + (actionButton == null ? 0 : actionButton.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ApplicationTeamManager(member=" + this.member + ", action=" + this.action + ')';
    }
}
