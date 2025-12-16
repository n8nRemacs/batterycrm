package uD0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfigureLocationsBadges.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LuD0/a;", "", "", "collapseTitle", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uD0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48884a {

    @c("collapseTitle")
    @k
    private final String collapseTitle;

    public C48884a(@k String str) {
        this.collapseTitle = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getCollapseTitle() {
        return this.collapseTitle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48884a) && L.f(this.collapseTitle, ((C48884a) obj).collapseTitle);
    }

    public final int hashCode() {
        return this.collapseTitle.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ConfigureLocationsBadges(collapseTitle="), this.collapseTitle, ')');
    }
}
