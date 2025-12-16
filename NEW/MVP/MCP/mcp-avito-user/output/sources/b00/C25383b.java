package b00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage.document_requirements.model.Document;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: DocumentRequirementsState.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb00/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b00.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C25383b extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Document> f56811b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Document f56812c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f56813d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Document f56814e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Document f56815f;

    /* JADX WARN: Multi-variable type inference failed */
    public C25383b(@k List<? extends Document> list, @l Document document, @l String str) {
        this.f56811b = list;
        this.f56812c = document;
        this.f56813d = str;
        this.f56814e = (Document) C42745f0.G(list);
        this.f56815f = (Document) C42745f0.S(list);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25383b)) {
            return false;
        }
        C25383b c25383b = (C25383b) obj;
        return L.f(this.f56811b, c25383b.f56811b) && this.f56812c == c25383b.f56812c && L.f(this.f56813d, c25383b.f56813d);
    }

    public final int hashCode() {
        int iHashCode = this.f56811b.hashCode() * 31;
        Document document = this.f56812c;
        int iHashCode2 = (iHashCode + (document == null ? 0 : document.hashCode())) * 31;
        String str = this.f56813d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentRequirementsState(documents=");
        sb2.append(this.f56811b);
        sb2.append(", selectedDocument=");
        sb2.append(this.f56812c);
        sb2.append(", applicationId=");
        return C22026a.c(sb2, this.f56813d, ')');
    }
}
