package NZ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.mortgage.api.model.landing.items.LabelValueParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculationInputItem.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LNZ/a;", "LNZ/d;", "Lcom/avito/android/mortgage/api/model/landing/items/LabelValueParameter;", "maxValue", "minValue", "", "predefinedOptions", "", "value", "<init>", "(Lcom/avito/android/mortgage/api/model/landing/items/LabelValueParameter;Lcom/avito/android/mortgage/api/model/landing/items/LabelValueParameter;Ljava/util/List;Ljava/lang/Integer;)V", "Lcom/avito/android/mortgage/api/model/landing/items/LabelValueParameter;", "a", "()Lcom/avito/android/mortgage/api/model/landing/items/LabelValueParameter;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a implements d {

    @com.google.gson.annotations.c("maxValue")
    @k
    private final LabelValueParameter maxValue;

    @com.google.gson.annotations.c("minValue")
    @k
    private final LabelValueParameter minValue;

    @com.google.gson.annotations.c("predefinedOptions")
    @l
    private final List<LabelValueParameter> predefinedOptions;

    @com.google.gson.annotations.c("value")
    @l
    private final Integer value;

    public a(@k LabelValueParameter labelValueParameter, @k LabelValueParameter labelValueParameter2, @l List<LabelValueParameter> list, @l Integer num) {
        this.maxValue = labelValueParameter;
        this.minValue = labelValueParameter2;
        this.predefinedOptions = list;
        this.value = num;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final LabelValueParameter getMaxValue() {
        return this.maxValue;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final LabelValueParameter getMinValue() {
        return this.minValue;
    }

    @l
    public final List<LabelValueParameter> c() {
        return this.predefinedOptions;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.maxValue, aVar.maxValue) && L.f(this.minValue, aVar.minValue) && L.f(this.predefinedOptions, aVar.predefinedOptions) && L.f(this.value, aVar.value);
    }

    public final int hashCode() {
        int iHashCode = (this.minValue.hashCode() + (this.maxValue.hashCode() * 31)) * 31;
        List<LabelValueParameter> list = this.predefinedOptions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.value;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalculationInputItem(maxValue=");
        sb2.append(this.maxValue);
        sb2.append(", minValue=");
        sb2.append(this.minValue);
        sb2.append(", predefinedOptions=");
        sb2.append(this.predefinedOptions);
        sb2.append(", value=");
        return s.j(sb2, this.value, ')');
    }
}
