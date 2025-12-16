package pw0;

import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactsData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/c;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pw0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47159c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final C47158b f428859a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C47158b f428860b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C47158b f428861c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ParametersTree f428862d;

    public C47159c(@Y61.l C47158b c47158b, @Y61.l C47158b c47158b2, @Y61.l C47158b c47158b3, @Y61.l ParametersTree parametersTree) {
        this.f428859a = c47158b;
        this.f428860b = c47158b2;
        this.f428861c = c47158b3;
        this.f428862d = parametersTree;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.avito.android.remote.model.category_parameters.ParametersTree] */
    public static C47159c a(C47159c c47159c, C47158b c47158b, C47158b c47158b2, C47158b c47158b3, SimpleParametersTree simpleParametersTree, int i12) {
        if ((i12 & 1) != 0) {
            c47158b = c47159c.f428859a;
        }
        if ((i12 & 2) != 0) {
            c47158b2 = c47159c.f428860b;
        }
        if ((i12 & 4) != 0) {
            c47158b3 = c47159c.f428861c;
        }
        SimpleParametersTree simpleParametersTree2 = simpleParametersTree;
        if ((i12 & 8) != 0) {
            simpleParametersTree2 = c47159c.f428862d;
        }
        c47159c.getClass();
        return new C47159c(c47158b, c47158b2, c47158b3, simpleParametersTree2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47159c)) {
            return false;
        }
        C47159c c47159c = (C47159c) obj;
        return L.f(this.f428859a, c47159c.f428859a) && L.f(this.f428860b, c47159c.f428860b) && L.f(this.f428861c, c47159c.f428861c) && L.f(this.f428862d, c47159c.f428862d);
    }

    public final int hashCode() {
        C47158b c47158b = this.f428859a;
        int iHashCode = (c47158b == null ? 0 : c47158b.hashCode()) * 31;
        C47158b c47158b2 = this.f428860b;
        int iHashCode2 = (iHashCode + (c47158b2 == null ? 0 : c47158b2.hashCode())) * 31;
        C47158b c47158b3 = this.f428861c;
        int iHashCode3 = (iHashCode2 + (c47158b3 == null ? 0 : c47158b3.hashCode())) * 31;
        ParametersTree parametersTree = this.f428862d;
        return iHashCode3 + (parametersTree != null ? parametersTree.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ContactsData(name=" + this.f428859a + ", phone=" + this.f428860b + ", email=" + this.f428861c + ", parametersTree=" + this.f428862d + ')';
    }
}
