package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes8.dex */
public final class fv0 implements gg1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f385509a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ma1 f385510b = new ma1();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final LinkedList f385511c;

    public fv0(@j.N Context context, @j.N ff1 ff1Var) {
        this.f385509a = context.getApplicationContext();
        this.f385511c = a(ff1Var);
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void a(long j12, long j13) {
        Iterator it = this.f385511c.iterator();
        while (it.hasNext()) {
            ev0 ev0Var = (ev0) it.next();
            float fA2 = ev0Var.a();
            String strB = ev0Var.b();
            if (fA2 <= j13) {
                qh1.f389188c.a(this.f385509a).a(strB);
                it.remove();
            }
        }
    }

    @j.N
    private LinkedList a(@j.N ff1 ff1Var) {
        LinkedList linkedList = new LinkedList();
        im imVarA = ff1Var.a();
        long jD2 = imVarA.d();
        this.f385510b.getClass();
        ArrayList arrayListA = ma1.a(imVarA);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ia1 ia1Var = (ia1) it.next();
            if ("progress".equals(ia1Var.a())) {
                arrayList.add(ia1Var);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ia1 ia1Var2 = (ia1) it2.next();
            String strC = ia1Var2.c();
            VastTimeOffset vastTimeOffsetB = ia1Var2.b();
            ev0 ev0Var = null;
            if (vastTimeOffsetB != null) {
                Long lValueOf = VastTimeOffset.b.f392906a.equals(vastTimeOffsetB.c()) ? Long.valueOf((long) vastTimeOffsetB.d()) : null;
                if (VastTimeOffset.b.f392907b.equals(vastTimeOffsetB.c())) {
                    lValueOf = Long.valueOf((long) ((vastTimeOffsetB.d() / 100.0f) * jD2));
                }
                if (lValueOf != null) {
                    ev0Var = new ev0(strC, lValueOf.longValue());
                }
            }
            if (ev0Var != null) {
                linkedList.add(ev0Var);
            }
        }
        return linkedList;
    }
}
