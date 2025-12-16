package com.avito.android.remote.notification;

import Bk0.InterfaceC13158a;
import android.graphics.Bitmap;
import androidx.core.app.z;
import androidx.core.graphics.drawable.IconCompat;
import com.avito.android.remote.notification.analytics.NotificationEvent;
import com.avito.android.remote.notification.analytics.NotificationImageLoadEvent;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NotificationInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/notification/NotificationImages;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.remote.notification.u, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
final class C34353u extends kotlin.jvm.internal.N implements Y41.l<P2<? super NotificationImages>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f254099l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ NotificationIdentifier f254100m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PushParameters f254101n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z.b f254102o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f254103p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34353u(r rVar, NotificationIdentifier notificationIdentifier, PushParameters pushParameters, z.b bVar, String str) {
        super(1);
        this.f254099l = rVar;
        this.f254100m = notificationIdentifier;
        this.f254101n = pushParameters;
        this.f254102o = bVar;
        this.f254103p = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(P2<? super NotificationImages> p22) {
        P2<? super NotificationImages> p23 = p22;
        int i12 = r.f254068z;
        NotificationIdentifier notificationIdentifier = this.f254100m;
        r rVar = this.f254099l;
        rVar.o(notificationIdentifier);
        boolean z12 = p23 instanceof P2.a;
        PushParameters pushParameters = this.f254101n;
        InterfaceC13158a interfaceC13158a = rVar.f254082n;
        String str = this.f254103p;
        z.b bVar = this.f254102o;
        if (z12) {
            interfaceC13158a.c(NotificationImageLoadEvent.f254025f);
            rVar.n(notificationIdentifier, pushParameters, bVar, str);
        } else if (p23 instanceof P2.b) {
            interfaceC13158a.c(NotificationImageLoadEvent.f254024e);
            NotificationImages notificationImages = (NotificationImages) ((P2.b) p23).f318720a;
            interfaceC13158a.d(NotificationEvent.f254016p);
            z.k kVar = new z.k();
            Bitmap bitmap = notificationImages.f253963b;
            kVar.f44573d = bitmap == null ? null : IconCompat.c(bitmap);
            kVar.f44624b = z.n.c(pushParameters.f253976c.getBody());
            kVar.f44625c = true;
            z.n nVarH = rVar.h(notificationIdentifier, pushParameters, str);
            Bitmap bitmap2 = notificationImages.f253964c;
            nVarH.h(bitmap2);
            nVarH.j(kVar);
            if (bVar != null) {
                nVarH.a(bVar);
            }
            rVar.l(nVarH, notificationIdentifier, pushParameters, str);
            notificationImages.f253963b.recycle();
            bitmap2.recycle();
            notificationImages.f253965d.recycle();
        } else {
            p23.equals(P2.c.f318721a);
        }
        return G0.f406611a;
    }
}
