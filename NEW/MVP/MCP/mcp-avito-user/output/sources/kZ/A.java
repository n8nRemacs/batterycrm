package KZ;

import androidx.compose.runtime.C22026a;
import com.avito.android.mortgage.api.model.items.application.ApplicationProcessType;
import kotlin.Metadata;

/* compiled from: ApplicationProcessItemValue.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKZ/A;", "", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationProcessType;", "type", "", "title", "<init>", "(Lcom/avito/android/mortgage/api/model/items/application/ApplicationProcessType;Ljava/lang/String;)V", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationProcessType;", "b", "()Lcom/avito/android/mortgage/api/model/items/application/ApplicationProcessType;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class A {

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("type")
    @Y61.k
    private final ApplicationProcessType type;

    public A(@Y61.k ApplicationProcessType applicationProcessType, @Y61.k String str) {
        this.type = applicationProcessType;
        this.title = str;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final ApplicationProcessType getType() {
        return this.type;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a12 = (A) obj;
        return this.type == a12.type && kotlin.jvm.internal.L.f(this.title, a12.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.type.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationProcessAction(type=");
        sb2.append(this.type);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }
}
