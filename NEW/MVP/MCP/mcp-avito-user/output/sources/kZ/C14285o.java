package KZ;

import com.avito.android.mortgage.api.adapters.ApplicationContentItemDeserializer;
import com.avito.android.mortgage.api.model.items.application.ApplicationContentItemType;
import kotlin.Metadata;

/* compiled from: ApplicationContentItem.kt */
@androidx.compose.runtime.internal.P
@com.google.gson.annotations.b(ApplicationContentItemDeserializer.class)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKZ/o;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: KZ.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C14285o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ApplicationContentItemType f9529a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14286p f9530b;

    public C14285o(@Y61.k ApplicationContentItemType applicationContentItemType, @Y61.k InterfaceC14286p interfaceC14286p) {
        this.f9529a = applicationContentItemType;
        this.f9530b = interfaceC14286p;
    }

    public static C14285o a(C14285o c14285o, InterfaceC14286p interfaceC14286p) {
        ApplicationContentItemType applicationContentItemType = c14285o.f9529a;
        c14285o.getClass();
        return new C14285o(applicationContentItemType, interfaceC14286p);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14285o)) {
            return false;
        }
        C14285o c14285o = (C14285o) obj;
        return this.f9529a == c14285o.f9529a && kotlin.jvm.internal.L.f(this.f9530b, c14285o.f9530b);
    }

    public final int hashCode() {
        return this.f9530b.hashCode() + (this.f9529a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "ApplicationContentItem(type=" + this.f9529a + ", value=" + this.f9530b + ')';
    }
}
