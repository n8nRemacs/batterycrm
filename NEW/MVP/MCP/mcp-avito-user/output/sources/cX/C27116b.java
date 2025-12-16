package cX;

import Y61.k;
import Y61.l;
import com.avito.android.loyalty.remote.model.badge_details.BadgeDetailsAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgeDetailsResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LcX/b;", "", "", "LcX/a;", "widgets", "Lcom/avito/android/loyalty/remote/model/badge_details/BadgeDetailsAction;", "action", "<init>", "(Ljava/util/List;Lcom/avito/android/loyalty/remote/model/badge_details/BadgeDetailsAction;)V", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/avito/android/loyalty/remote/model/badge_details/BadgeDetailsAction;", "a", "()Lcom/avito/android/loyalty/remote/model/badge_details/BadgeDetailsAction;", "_avito-discouraged_avito-network_loyalty"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cX.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C27116b {

    @com.google.gson.annotations.c("action")
    @l
    private final BadgeDetailsAction action;

    @com.google.gson.annotations.c("widgets")
    @l
    private final List<InterfaceC27115a> widgets;

    /* JADX WARN: Multi-variable type inference failed */
    public C27116b(@l List<? extends InterfaceC27115a> list, @l BadgeDetailsAction badgeDetailsAction) {
        this.widgets = list;
        this.action = badgeDetailsAction;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final BadgeDetailsAction getAction() {
        return this.action;
    }

    @l
    public final List<InterfaceC27115a> b() {
        return this.widgets;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27116b)) {
            return false;
        }
        C27116b c27116b = (C27116b) obj;
        return L.f(this.widgets, c27116b.widgets) && L.f(this.action, c27116b.action);
    }

    public final int hashCode() {
        List<InterfaceC27115a> list = this.widgets;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        BadgeDetailsAction badgeDetailsAction = this.action;
        return iHashCode + (badgeDetailsAction != null ? badgeDetailsAction.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BadgeDetailsResponse(widgets=" + this.widgets + ", action=" + this.action + ')';
    }
}
