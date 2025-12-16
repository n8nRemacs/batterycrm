package Ij;

import JO.m;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectedInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIj/b;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f8494a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final m f8495b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ParameterElement.C f8496c;

    public b(@k String str, @k m mVar, @l ParameterElement.C c12) {
        this.f8494a = str;
        this.f8495b = mVar;
        this.f8496c = c12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f8494a, bVar.f8494a) && L.f(this.f8495b, bVar.f8495b) && L.f(this.f8496c, bVar.f8496c);
    }

    public final int hashCode() {
        int iHashCode = (this.f8495b.hashCode() + (this.f8494a.hashCode() * 31)) * 31;
        ParameterElement.C c12 = this.f8496c;
        return iHashCode + (c12 == null ? 0 : c12.hashCode());
    }

    @k
    public final String toString() {
        return "SelectedInfo(selectId=" + this.f8494a + ", item=" + this.f8495b + ", parentItem=" + this.f8496c + ')';
    }

    public /* synthetic */ b(String str, m mVar, ParameterElement.C c12, int i12, C42822w c42822w) {
        this(str, mVar, (i12 & 4) != 0 ? null : c12);
    }
}
