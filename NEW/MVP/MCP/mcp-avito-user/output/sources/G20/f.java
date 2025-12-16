package G20;

import F20.e;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.multi_message_send.model.MultiSendAnchor;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MultiMessageSendUiState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LG20/f;", "", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6258a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<F20.e> f6259b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<MultiSendAnchor> f6260c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f6261d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Boolean f6262e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Boolean f6263f;

    /* JADX WARN: Multi-variable type inference failed */
    public f(boolean z12, @l List<? extends F20.e> list, @l List<MultiSendAnchor> list2, @k a aVar, @l Boolean bool) {
        Boolean boolValueOf;
        this.f6258a = z12;
        this.f6259b = list;
        this.f6260c = list2;
        this.f6261d = aVar;
        this.f6262e = bool;
        if (list != 0) {
            List<? extends F20.e> list3 = list;
            boolean z13 = false;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    F20.e eVar = (F20.e) it.next();
                    if ((eVar instanceof e.a) && ((e.a) eVar).f4517k) {
                        z13 = true;
                        break;
                    }
                }
            }
            boolValueOf = Boolean.valueOf(z13);
        } else {
            boolValueOf = null;
        }
        this.f6263f = boolValueOf;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f6258a == fVar.f6258a && L.f(this.f6259b, fVar.f6259b) && L.f(this.f6260c, fVar.f6260c) && L.f(this.f6261d, fVar.f6261d) && L.f(this.f6262e, fVar.f6262e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f6258a) * 31;
        List<F20.e> list = this.f6259b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MultiSendAnchor> list2 = this.f6260c;
        int iHashCode3 = (this.f6261d.hashCode() + ((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        Boolean bool = this.f6262e;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiMessageSendUiState(isError=");
        sb2.append(this.f6258a);
        sb2.append(", contentListItems=");
        sb2.append(this.f6259b);
        sb2.append(", anchors=");
        sb2.append(this.f6260c);
        sb2.append(", inputState=");
        sb2.append(this.f6261d);
        sb2.append(", anchorsIsVisible=");
        return C0.g(sb2, this.f6262e, ')');
    }

    public /* synthetic */ f(boolean z12, List list, List list2, a aVar, Boolean bool, int i12, C42822w c42822w) {
        this(z12, list, list2, aVar, (i12 & 16) != 0 ? null : bool);
    }
}
