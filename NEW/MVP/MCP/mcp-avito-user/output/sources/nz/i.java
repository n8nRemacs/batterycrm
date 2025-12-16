package NZ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculationProgramsItem.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LNZ/i;", "", "", "value", "", "stringValue", "<init>", "(FLjava/lang/String;)V", "F", "getValue", "()F", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class i {

    @com.google.gson.annotations.c("stringValue")
    @k
    private final String stringValue;

    @com.google.gson.annotations.c("value")
    private final float value;

    public i(float f12, @k String str) {
        this.value = f12;
        this.stringValue = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.value, iVar.value) == 0 && L.f(this.stringValue, iVar.stringValue);
    }

    public final int hashCode() {
        return this.stringValue.hashCode() + (Float.hashCode(this.value) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StringNumberParameter(value=");
        sb2.append(this.value);
        sb2.append(", stringValue=");
        return C22026a.c(sb2, this.stringValue, ')');
    }
}
