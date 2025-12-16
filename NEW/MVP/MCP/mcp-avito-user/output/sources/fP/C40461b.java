package fp;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientRoomState.kt */
@P
@J41.b
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfp/b;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40461b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f396086a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f396087b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Image f396088c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<i> f396089d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f396090e;

    public C40461b(@k String str, @k String str2, @l Image image, @k List list, @k ArrayList arrayList) {
        this.f396086a = str;
        this.f396087b = str2;
        this.f396088c = image;
        this.f396089d = list;
        this.f396090e = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40461b)) {
            return false;
        }
        C40461b c40461b = (C40461b) obj;
        return L.f(this.f396086a, c40461b.f396086a) && this.f396087b.equals(c40461b.f396087b) && L.f(this.f396088c, c40461b.f396088c) && L.f(this.f396089d, c40461b.f396089d) && this.f396090e.equals(c40461b.f396090e);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f396086a.hashCode() * 31, 31, this.f396087b);
        Image image = this.f396088c;
        return this.f396090e.hashCode() + H.e((iD2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f396089d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AgentState(name=");
        sb2.append(this.f396086a);
        sb2.append(", description=");
        sb2.append(this.f396087b);
        sb2.append(", image=");
        sb2.append(this.f396088c);
        sb2.append(", miniBadges=");
        sb2.append(this.f396089d);
        sb2.append(", largeBadges=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f396090e, ')');
    }
}
