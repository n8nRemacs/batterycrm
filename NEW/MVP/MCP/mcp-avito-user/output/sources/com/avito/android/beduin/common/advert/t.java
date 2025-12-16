package com.avito.android.beduin.common.advert;

import Ag.CallableC13028a;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.S;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import lj.InterfaceC43779a;

/* compiled from: BeduinViewedAdvertManagerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f100577b;

    public t(s sVar) {
        this.f100577b = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ((Number) obj).longValue();
        s sVar = this.f100577b;
        sVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sVar.f100573g.values().iterator();
        while (it.hasNext()) {
            C28809e.d(new v(arrayList), ((InterfaceC43779a) it.next()).a());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        G g12 = new G(new CallableC13028a(7, sVar, arrayList));
        InterfaceC35745a5 interfaceC35745a5 = sVar.f100569c;
        S s5 = g12.z(interfaceC35745a5.a()).s(interfaceC35745a5.e());
        x xVar = new x(sVar, arrayList);
        final V2 v22 = V2.f318762a;
        sVar.f100571e.b(s5.x(xVar, new l41.g() { // from class: com.avito.android.beduin.common.advert.y
            @Override // l41.g
            public final void accept(Object obj2) {
                v22.f((Throwable) obj2);
            }
        }));
    }
}
