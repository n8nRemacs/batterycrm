package com.avito.android.blocked_ip.deep_linking;

import android.content.DialogInterface;
import com.avito.android.blocked_ip.deep_linking.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BlockedIpScreenLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f105347l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f105348m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DialogInterface dialogInterface, a aVar) {
        super(0);
        this.f105347l = dialogInterface;
        this.f105348m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f105347l.dismiss();
        a aVar = this.f105348m;
        aVar.f105344h.R(aVar.f105343g.a("request/720?eventData[contextId]=117"), com.avito.android.deeplink_handler.view.b.f134588l);
        aVar.j(a.b.C3152b.f105346b);
        return G0.f406611a;
    }
}
