package fp;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomState.kt */
@P
@J41.b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfp/i;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f396125a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f396126b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f396127c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f396128d;

    public i(int i12, @k p pVar, @k AttributedText attributedText, boolean z12) {
        this.f396125a = i12;
        this.f396126b = pVar;
        this.f396127c = attributedText;
        this.f396128d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f396125a == iVar.f396125a && L.f(this.f396126b, iVar.f396126b) && L.f(this.f396127c, iVar.f396127c) && this.f396128d == iVar.f396128d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f396128d) + com.avito.android.actions_sheet.a.b(s.b(this.f396126b, Integer.hashCode(this.f396125a) * 31, 31), 31, this.f396127c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SmallBadge(iconResource=");
        sb2.append(this.f396125a);
        sb2.append(", color=");
        sb2.append(this.f396126b);
        sb2.append(", text=");
        sb2.append(this.f396127c);
        sb2.append(", withTooltip=");
        return r.x(sb2, this.f396128d, ')');
    }

    public /* synthetic */ i(int i12, p pVar, AttributedText attributedText, boolean z12, int i13, C42822w c42822w) {
        this(i12, pVar, attributedText, (i13 & 8) != 0 ? false : z12);
    }
}
