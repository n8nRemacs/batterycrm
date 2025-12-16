package Qd;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParameterIdWithValues.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LQd/a;", "", "", "parameterId", "", "parameterValues", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getParameterId", "()Ljava/lang/String;", "Ljava/util/List;", "getParameterValues", "()Ljava/util/List;", "_avito-discouraged_avito-api_auction"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qd.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C14883a {

    @c("id")
    @k
    private final String parameterId;

    @c("values")
    @k
    private final List<?> parameterValues;

    public C14883a(@k String str, @k List<?> list) {
        this.parameterId = str;
        this.parameterValues = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14883a)) {
            return false;
        }
        C14883a c14883a = (C14883a) obj;
        return L.f(this.parameterId, c14883a.parameterId) && L.f(this.parameterValues, c14883a.parameterValues);
    }

    public final int hashCode() {
        return this.parameterValues.hashCode() + (this.parameterId.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParameterIdWithValues(parameterId=");
        sb2.append(this.parameterId);
        sb2.append(", parameterValues=");
        return H.p(sb2, this.parameterValues, ')');
    }
}
