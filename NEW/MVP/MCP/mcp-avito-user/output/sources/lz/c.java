package LZ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.adapters.FormContentItemDeserializer;
import com.avito.android.mortgage.api.model.items.form.FormContentItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormContentItem.kt */
@P
@com.google.gson.annotations.b(FormContentItemDeserializer.class)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLZ/c;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FormContentItemType f9995a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.api.model.items.form.d f9996b;

    public c(@k FormContentItemType formContentItemType, @k com.avito.android.mortgage.api.model.items.form.d dVar) {
        this.f9995a = formContentItemType;
        this.f9996b = dVar;
    }

    public static c a(c cVar, com.avito.android.mortgage.api.model.items.form.d dVar) {
        FormContentItemType formContentItemType = cVar.f9995a;
        cVar.getClass();
        return new c(formContentItemType, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f9995a == cVar.f9995a && L.f(this.f9996b, cVar.f9996b);
    }

    public final int hashCode() {
        return this.f9996b.hashCode() + (this.f9995a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "FormContentItem(type=" + this.f9995a + ", value=" + this.f9996b + ')';
    }
}
