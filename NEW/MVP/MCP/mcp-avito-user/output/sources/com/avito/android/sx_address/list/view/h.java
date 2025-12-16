package com.avito.android.sx_address.list.view;

import android.content.DialogInterface;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SxAddressListView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f293515l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f293516m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f293517n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, DeepLink deepLink, DialogInterface dialogInterface) {
        super(0);
        this.f293515l = gVar;
        this.f293516m = deepLink;
        this.f293517n = dialogInterface;
    }

    @Override // Y41.a
    public final G0 invoke() {
        g gVar = this.f293515l;
        gVar.f293444m.h();
        b.a.a(gVar.f293439h, this.f293516m, null, null, 6);
        this.f293517n.dismiss();
        return G0.f406611a;
    }
}
