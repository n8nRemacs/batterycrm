package com.avito.android.beduin.common.advert;

import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.single.S;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import lj.InterfaceC43779a;

/* compiled from: BeduinFavoriteAdvertManagerImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f100551b;

    public g(f fVar) {
        this.f100551b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ((Number) obj).longValue();
        f fVar = this.f100551b;
        fVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = fVar.f100546d.values().iterator();
        while (it.hasNext()) {
            C28809e.d(new k(linkedHashMap), ((InterfaceC43779a) it.next()).a());
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        S s5 = fVar.f100543a.d(C42745f0.M0(linkedHashMap.keySet())).s(fVar.f100544b.e());
        m mVar = new m(fVar, linkedHashMap);
        final V2 v22 = V2.f318762a;
        fVar.f100547e.b(s5.x(mVar, new l41.g() { // from class: com.avito.android.beduin.common.advert.n
            @Override // l41.g
            public final void accept(Object obj2) {
                v22.f((Throwable) obj2);
            }
        }));
    }
}
