package rY;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Subtitle.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LrY/d;", "", "", "deadlines", "floors", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rY.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C47617d {

    @com.google.gson.annotations.c("deadlines")
    @l
    private final String deadlines;

    @com.google.gson.annotations.c("floors")
    @l
    private final String floors;

    public C47617d(@l String str, @l String str2) {
        this.deadlines = str;
        this.floors = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getDeadlines() {
        return this.deadlines;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getFloors() {
        return this.floors;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47617d)) {
            return false;
        }
        C47617d c47617d = (C47617d) obj;
        return L.f(this.deadlines, c47617d.deadlines) && L.f(this.floors, c47617d.floors);
    }

    public final int hashCode() {
        String str = this.deadlines;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.floors;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Subtitle(deadlines=");
        sb2.append(this.deadlines);
        sb2.append(", floors=");
        return C22026a.c(sb2, this.floors, ')');
    }
}
