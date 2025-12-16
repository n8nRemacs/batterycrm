package com.avito.android.comfortable_deal.client_room;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientRoomScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class D extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f119802l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f119803m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f119804n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(String str, String str2, int i12) {
        super(2);
        this.f119802l = str;
        this.f119803m = str2;
        this.f119804n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f119804n | 1);
        t.k(this.f119802l, this.f119803m, a12, iA2);
        return G0.f406611a;
    }
}
