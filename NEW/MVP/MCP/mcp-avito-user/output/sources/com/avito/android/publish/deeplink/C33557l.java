package com.avito.android.publish.deeplink;

import com.avito.android.deep_linking.links.InterfaceC29681g;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CollectPublishParamsDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.deeplink.l, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33557l extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f232581l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33557l(n nVar) {
        super(1);
        this.f232581l = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        String message = th3.getMessage();
        n nVar = this.f232581l;
        if (message == null) {
            message = nVar.f232587j;
        }
        nVar.j(new InterfaceC29681g.a(message));
        V2.f318762a.a(n.class.getName(), "Failed to send draft", th3);
        return G0.f406611a;
    }
}
