package com.avito.android.passport.profile_add.create_flow.select_specific.recycler;

import com.avito.android.passport.profile_add.create_flow.select_specific.SpecificVo;
import kotlin.Metadata;

/* compiled from: Specific.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/recycler/u;", "Lcom/avito/conveyor_item/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SpecificVo f211795b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f211796c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f211797d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f211798e;

    public u(@Y61.k SpecificVo specificVo, boolean z12, boolean z13, @Y61.k String str) {
        this.f211795b = specificVo;
        this.f211796c = z12;
        this.f211797d = z13;
        this.f211798e = str;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return getF202667b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202667b() {
        return this.f211798e;
    }
}
