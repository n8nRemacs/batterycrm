package Dc0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.BeduinV2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileTabBeduinItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDc0/h;", "Lcom/avito/conveyor_item/a;", "_avito_profile-tab_summary_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class h implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f3295b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BeduinV2 f3296c;

    public h(@k String str, @k BeduinV2 beduinV2) {
        this.f3295b = str;
        this.f3296c = beduinV2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f3295b, hVar.f3295b) && L.f(this.f3296c, hVar.f3296c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return getF3295b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF3295b() {
        return this.f3295b;
    }

    public final int hashCode() {
        return this.f3296c.hashCode() + (this.f3295b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ProfileTabBeduinItem(beduinItemId=" + this.f3295b + ", beduinContent=" + this.f3296c + ')';
    }
}
