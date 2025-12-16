package com.avito.android.messenger_icebreakers_dialog.deeplink;

import com.avito.android.analytics.statsd.y;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger_icebreakers_dialog.deeplink.MessengerIcebreakerDialogDeeplink;
import com.avito.android.util.InterfaceC35741a1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f197589l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar) {
        super(1);
        this.f197589l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        a aVar = this.f197589l;
        aVar.f197560i.c(new y.a("messengerIcebreakersDialog.error", 0L, 2, null));
        a.i.C4057a.d(aVar.f197559h, InterfaceC35741a1.a.a(aVar.f197571t, th3, null, null, 6), null, null, new f.c(th3), 0, null, null, null, 2030);
        aVar.j(MessengerIcebreakerDialogDeeplink.b.C5818b.f197553b);
        return G0.f406611a;
    }
}
