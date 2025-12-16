package com.avito.android.comfortable_deal.client_room;

import androidx.compose.runtime.C22066f2;
import com.avito.android.comfortable_deal.client_room.model.PartnerStatus;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientRoomScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class A extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PartnerStatus f119781l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f119782m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(PartnerStatus partnerStatus, int i12) {
        super(2);
        this.f119781l = partnerStatus;
        this.f119782m = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f119782m | 1);
        t.h(this.f119781l, a12, iA2);
        return G0.f406611a;
    }
}
