package com.google.android.gms.common.api.internal;

import android.content.Context;
import bZ0.InterfaceC25600a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.internal.AbstractC36699e;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
final class T extends AbstractRunnableC36623a0 {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f349056c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36626b0 f349057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C36626b0 c36626b0, HashMap map) {
        super(c36626b0, null);
        this.f349057d = c36626b0;
        this.f349056c = map;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC36623a0
    @InterfaceC25600a
    @j.l0
    public final void a() {
        com.google.android.gms.signin.f fVar;
        C36626b0 c36626b0 = this.f349057d;
        com.google.android.gms.common.internal.V v12 = new com.google.android.gms.common.internal.V(c36626b0.f349080d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = this.f349056c;
        for (C36616a.f fVar2 : map.keySet()) {
            if (!fVar2.requiresGooglePlayServices() || ((P) map.get(fVar2)).f349046c) {
                arrayList2.add(fVar2);
            } else {
                arrayList.add(fVar2);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Context context = c36626b0.f349079c;
        int i12 = 0;
        int iA2 = -1;
        if (!zIsEmpty) {
            int size = arrayList.size();
            while (i12 < size) {
                iA2 = v12.a(context, (C36616a.f) arrayList.get(i12));
                i12++;
                if (iA2 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i12 < size2) {
                iA2 = v12.a(context, (C36616a.f) arrayList2.get(i12));
                i12++;
                if (iA2 == 0) {
                    break;
                }
            }
        }
        C36661o0 c36661o0 = c36626b0.f349077a;
        if (iA2 != 0) {
            Q q12 = new Q(this, c36626b0, new ConnectionResult(iA2, null));
            HandlerC36659n0 handlerC36659n0 = c36661o0.f349193r;
            handlerC36659n0.sendMessage(handlerC36659n0.obtainMessage(1, q12));
            return;
        }
        if (c36626b0.f349089m && (fVar = c36626b0.f349087k) != null) {
            fVar.a();
        }
        for (C36616a.f fVar3 : map.keySet()) {
            AbstractC36699e.c cVar = (AbstractC36699e.c) map.get(fVar3);
            if (!fVar3.requiresGooglePlayServices() || v12.a(context, fVar3) == 0) {
                fVar3.connect(cVar);
            } else {
                S s5 = new S(c36626b0, cVar);
                HandlerC36659n0 handlerC36659n02 = c36661o0.f349193r;
                handlerC36659n02.sendMessage(handlerC36659n02.obtainMessage(1, s5));
            }
        }
    }
}
