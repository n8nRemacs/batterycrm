package JZ;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.FormItemValueModel;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormItemUpdateModel.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LJZ/j;", "", "", "id", "name", "context", "Lcom/avito/android/mortgage/api/model/FormItemValueModel;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/mortgage/api/model/FormItemValueModel;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "getContext", "Lcom/avito/android/mortgage/api/model/FormItemValueModel;", "getValue", "()Lcom/avito/android/mortgage/api/model/FormItemValueModel;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class j {

    @com.google.gson.annotations.c("context")
    @Y61.k
    private final String context;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String name;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final FormItemValueModel value;

    public j(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k FormItemValueModel formItemValueModel) {
        this.id = str;
        this.name = str2;
        this.context = str3;
        this.value = formItemValueModel;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.id, jVar.id) && L.f(this.name, jVar.name) && L.f(this.context, jVar.context) && L.f(this.value, jVar.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + H.d(H.d(this.id.hashCode() * 31, 31, this.name), 31, this.context);
    }

    @Y61.k
    public final String toString() {
        return "FormItemUpdateModel(id=" + this.id + ", name=" + this.name + ", context=" + this.context + ", value=" + this.value + ')';
    }
}
