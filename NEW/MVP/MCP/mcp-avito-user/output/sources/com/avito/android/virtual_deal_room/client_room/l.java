package com.avito.android.virtual_deal_room.client_room;

import EN0.a;
import com.avito.android.virtual_deal_room.client_room.ClientRoomFragment;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClientRoomView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class l extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f326333l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<DN0.b> f326334m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, List<DN0.b> list) {
        super(1);
        this.f326333l = jVar;
        this.f326334m = list;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        ((ClientRoomFragment.c) this.f326333l.f326316a).invoke(new a.i(this.f326334m.get(iIntValue)));
        return G0.f406611a;
    }
}
