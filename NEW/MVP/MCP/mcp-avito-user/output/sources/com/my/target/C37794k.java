package com.my.target;

import android.content.Context;
import com.my.target.InterfaceC37817w;
import e11.AbstractC39895p;
import e11.C39924z;
import e11.k2;
import java.util.ArrayList;

/* renamed from: com.my.target.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37794k implements A, InterfaceC37817w.a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C f364883a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final b4 f364884b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final boolean[] f364885c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final ArrayList f364886d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final ArrayList f364887e;

    public C37794k(@j.N C c12, @j.N ArrayList arrayList, @j.N b4 b4Var) {
        this.f364883a = c12;
        this.f364884b = b4Var;
        this.f364887e = new ArrayList(arrayList);
        this.f364885c = new boolean[arrayList.size()];
        c12.setListener(this);
    }

    @Override // com.my.target.InterfaceC37817w.a
    public final void a(@j.N int[] iArr) {
        for (int i12 : iArr) {
            if (i12 >= 0) {
                boolean[] zArr = this.f364885c;
                if (i12 < zArr.length && !zArr[i12]) {
                    zArr[i12] = true;
                    AbstractC39895p abstractC39895p = (AbstractC39895p) this.f364887e.get(i12);
                    N0 n02 = this.f364884b.f364732e;
                    n02.getClass();
                    Context context = n02.getContext();
                    String strQ = C39924z.q(context);
                    if (strQ != null) {
                        k2.a(context, abstractC39895p.f394702a.a(strQ));
                    }
                    k2.a(context, abstractC39895p.f394702a.e("playbackStarted"));
                    k2.a(context, abstractC39895p.f394702a.e("show"));
                }
            }
        }
    }
}
