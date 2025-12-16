package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ri1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class jw0 implements gg1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ri1 f386985a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ArrayList f386986b = a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        final ri1.a f386987a;

        /* renamed from: b, reason: collision with root package name */
        final float f386988b;

        public a(@j.N ri1.a aVar, float f12) {
            this.f386987a = aVar;
            this.f386988b = f12;
        }
    }

    public jw0(@j.N ri1 ri1Var) {
        this.f386985a = ri1Var;
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void a(long j12, long j13) {
        if (j12 != 0) {
            Iterator it = this.f386986b.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.f386988b * j12 <= j13) {
                    this.f386985a.a(aVar.f386987a);
                    it.remove();
                }
            }
        }
    }

    @j.N
    private static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(ri1.a.f389551a, 0.25f));
        arrayList.add(new a(ri1.a.f389552b, 0.5f));
        arrayList.add(new a(ri1.a.f389553c, 0.75f));
        return arrayList;
    }
}
