package bM0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.vas_planning.remote.model.Action;
import com.avito.android.vas_planning.remote.model.VasRadioType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasPlannerItem.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LbM0/c;", "", "Lcom/avito/android/vas_planning/remote/model/Action;", "action", "", "description", "label", "title", "Lcom/avito/android/vas_planning/remote/model/VasRadioType;", "type", "<init>", "(Lcom/avito/android/vas_planning/remote/model/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/vas_planning/remote/model/VasRadioType;)V", "Lcom/avito/android/vas_planning/remote/model/Action;", "a", "()Lcom/avito/android/vas_planning/remote/model/Action;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "Lcom/avito/android/vas_planning/remote/model/VasRadioType;", "e", "()Lcom/avito/android/vas_planning/remote/model/VasRadioType;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bM0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C25531c {

    @com.google.gson.annotations.c("action")
    @k
    private final Action action;

    @com.google.gson.annotations.c("description")
    @l
    private final String description;

    @com.google.gson.annotations.c("label")
    @l
    private final String label;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("type")
    @l
    private final VasRadioType type;

    public C25531c(@k Action action, @l String str, @l String str2, @k String str3, @l VasRadioType vasRadioType) {
        this.action = action;
        this.description = str;
        this.label = str2;
        this.title = str3;
        this.type = vasRadioType;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final VasRadioType getType() {
        return this.type;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25531c)) {
            return false;
        }
        C25531c c25531c = (C25531c) obj;
        return L.f(this.action, c25531c.action) && L.f(this.description, c25531c.description) && L.f(this.label, c25531c.label) && L.f(this.title, c25531c.title) && this.type == c25531c.type;
    }

    public final int hashCode() {
        int iHashCode = this.action.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.label;
        int iD2 = H.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title);
        VasRadioType vasRadioType = this.type;
        return iD2 + (vasRadioType != null ? vasRadioType.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "VasPlannerItem(action=" + this.action + ", description=" + this.description + ", label=" + this.label + ", title=" + this.title + ", type=" + this.type + ')';
    }
}
