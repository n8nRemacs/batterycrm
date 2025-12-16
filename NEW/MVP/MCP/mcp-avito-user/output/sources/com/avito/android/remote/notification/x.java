package com.avito.android.remote.notification;

import Bk0.InterfaceC13158a;
import androidx.core.app.z;
import com.avito.android.remote.model.notification.Payload;
import com.avito.android.remote.notification.analytics.NotificationMessengerIconLoadEvent;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NotificationInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/notification/NotificationImages;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes17.dex */
final class x extends kotlin.jvm.internal.N implements Y41.l<P2<? super NotificationImages>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f254106l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ NotificationIdentifier f254107m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PushParameters f254108n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z.b f254109o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f254110p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Payload.Messenger.RedesignPushData f254111q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(r rVar, NotificationIdentifier notificationIdentifier, PushParameters pushParameters, z.b bVar, String str, Payload.Messenger.RedesignPushData redesignPushData) {
        super(1);
        this.f254106l = rVar;
        this.f254107m = notificationIdentifier;
        this.f254108n = pushParameters;
        this.f254109o = bVar;
        this.f254110p = str;
        this.f254111q = redesignPushData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(P2<? super NotificationImages> p22) {
        P2<? super NotificationImages> p23 = p22;
        int i12 = r.f254068z;
        NotificationIdentifier notificationIdentifier = this.f254107m;
        r rVar = this.f254106l;
        rVar.o(notificationIdentifier);
        boolean z12 = p23 instanceof P2.a;
        PushParameters pushParameters = this.f254108n;
        InterfaceC13158a interfaceC13158a = rVar.f254082n;
        String str = this.f254110p;
        z.b bVar = this.f254109o;
        if (z12) {
            interfaceC13158a.f(NotificationMessengerIconLoadEvent.f254033g);
            rVar.n(notificationIdentifier, pushParameters, bVar, str);
        } else if (p23 instanceof P2.b) {
            interfaceC13158a.f(NotificationMessengerIconLoadEvent.f254032f);
            try {
                r.g(this.f254106l, (NotificationImages) ((P2.b) p23).f318720a, notificationIdentifier, pushParameters, this.f254109o, this.f254110p, this.f254111q);
            } catch (ShortcutCreationException unused) {
                interfaceC13158a.f(NotificationMessengerIconLoadEvent.f254031e);
                rVar.n(notificationIdentifier, pushParameters, bVar, str);
            }
        } else {
            p23.equals(P2.c.f318721a);
        }
        return G0.f406611a;
    }
}
