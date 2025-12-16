package LZ;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.form.InputFormContentItemValue;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChildrenFormContentItemValue.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LLZ/a;", "", "", "id", "title", "Lcom/avito/android/mortgage/api/model/items/form/InputFormContentItemValue;", "input", "Lcom/avito/android/mortgage/api/model/items/form/b;", "checkbox", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/mortgage/api/model/items/form/InputFormContentItemValue;Lcom/avito/android/mortgage/api/model/items/form/b;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "Lcom/avito/android/mortgage/api/model/items/form/InputFormContentItemValue;", "d", "()Lcom/avito/android/mortgage/api/model/items/form/InputFormContentItemValue;", "Lcom/avito/android/mortgage/api/model/items/form/b;", "b", "()Lcom/avito/android/mortgage/api/model/items/form/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    @com.google.gson.annotations.c("checkbox")
    @k
    private final com.avito.android.mortgage.api.model.items.form.b checkbox;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("input")
    @k
    private final InputFormContentItemValue input;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public a(@k String str, @k String str2, @k InputFormContentItemValue inputFormContentItemValue, @k com.avito.android.mortgage.api.model.items.form.b bVar) {
        this.id = str;
        this.title = str2;
        this.input = inputFormContentItemValue;
        this.checkbox = bVar;
    }

    public static a a(a aVar, InputFormContentItemValue inputFormContentItemValue, com.avito.android.mortgage.api.model.items.form.b bVar, int i12) {
        String str = aVar.id;
        String str2 = aVar.title;
        if ((i12 & 4) != 0) {
            inputFormContentItemValue = aVar.input;
        }
        if ((i12 & 8) != 0) {
            bVar = aVar.checkbox;
        }
        return new a(str, str2, inputFormContentItemValue, bVar);
    }

    @k
    /* renamed from: b, reason: from getter */
    public final com.avito.android.mortgage.api.model.items.form.b getCheckbox() {
        return this.checkbox;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final InputFormContentItemValue getInput() {
        return this.input;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.id, aVar.id) && L.f(this.title, aVar.title) && L.f(this.input, aVar.input) && L.f(this.checkbox, aVar.checkbox);
    }

    public final int hashCode() {
        return this.checkbox.hashCode() + ((this.input.hashCode() + H.d(this.id.hashCode() * 31, 31, this.title)) * 31);
    }

    @k
    public final String toString() {
        return "ChildFormContentItemValue(id=" + this.id + ", title=" + this.title + ", input=" + this.input + ", checkbox=" + this.checkbox + ')';
    }
}
