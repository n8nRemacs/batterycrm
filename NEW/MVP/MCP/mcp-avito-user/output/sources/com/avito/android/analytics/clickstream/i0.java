package com.avito.android.analytics.clickstream;

import com.avito.android.InterfaceC32896n;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.clickstream.H;
import com.avito.android.analytics.clickstream.event.FirebaseUploadErrorClickStreamEventType;
import com.avito.android.util.V2;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SendClickStreamEventsTaskDelegateImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/analytics/clickstream/H$c;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class i0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f89805b;

    public i0(k0 k0Var) {
        this.f89805b = k0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        k0 k0Var = this.f89805b;
        k0Var.getClass();
        for (H.c cVar : (List) obj) {
            boolean z12 = cVar instanceof H.c.C2665c;
            InterfaceC28373a interfaceC28373a = k0Var.f89812c;
            InterfaceC32896n interfaceC32896n = k0Var.f89811b;
            if (z12) {
                if (interfaceC32896n.g().invoke().booleanValue()) {
                    interfaceC28373a.c(new cc.d(String.valueOf(((H.c.C2665c) cVar).f89748a.getMessage()), FirebaseUploadErrorClickStreamEventType.f89784c));
                }
                V2.f318762a.e("ClickStream", ((H.c.C2665c) cVar).f89748a);
            } else if ((cVar instanceof H.c.a) && interfaceC32896n.g().invoke().booleanValue()) {
                interfaceC28373a.c(new cc.d(String.valueOf(((H.c.a) cVar).f89747a.getMessage()), FirebaseUploadErrorClickStreamEventType.f89786e));
            }
        }
    }
}
