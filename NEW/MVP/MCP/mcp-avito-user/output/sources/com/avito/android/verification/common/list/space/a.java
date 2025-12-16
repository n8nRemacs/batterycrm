package com.avito.android.verification.common.list.space;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import j.U;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SpaceItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/common/list/space/a;", "Lcom/avito/conveyor_item/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f323442c;

    public a(@k String str, @U int i12) {
        this.f323441b = str;
        this.f323442c = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f323441b, aVar.f323441b) && this.f323442c == aVar.f323442c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return getF321549b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF321549b() {
        return this.f323441b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f323442c) + (this.f323441b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpaceItem(stringId=");
        sb2.append(this.f323441b);
        sb2.append(", height=");
        return r.t(sb2, this.f323442c, ')');
    }

    public /* synthetic */ a(String str, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? UUID.randomUUID().toString() : str, i12);
    }
}
