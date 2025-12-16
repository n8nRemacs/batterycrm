package com.yandex.div.internal.widget.tabs;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.tabs.A;
import com.yandex.div.internal.widget.tabs.d;
import j.K;
import j.N;

/* compiled from: BaseCardHeightCalculator.java */
@K
/* loaded from: classes7.dex */
public abstract class b implements A.a {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final c f370453a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final c f370454b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final SparseArray<r> f370455c = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    public int f370456d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f370457e = 0.0f;

    public b(@N ViewGroup viewGroup, @N c cVar, @N c cVar2) {
        this.f370453a = cVar;
        this.f370454b = cVar2;
    }

    @Override // com.yandex.div.internal.widget.tabs.A.a
    public int a(int i12, int i13) {
        SparseArray<r> sparseArray = this.f370455c;
        r rVar = sparseArray.get(i12);
        if (rVar == null) {
            d.g<TAB_DATA> gVar = this.f370454b.f370458a.f370471m;
            int size = gVar == 0 ? 0 : gVar.a().size();
            if (size == 0) {
                return 0;
            }
            r rVar2 = new r(size, new C38111a(this, View.MeasureSpec.getSize(i12)));
            sparseArray.put(i12, rVar2);
            rVar = rVar2;
        }
        return e(rVar, this.f370456d, this.f370457e);
    }

    @Override // com.yandex.div.internal.widget.tabs.A.a
    public final void b() {
        this.f370455c.clear();
    }

    @Override // com.yandex.div.internal.widget.tabs.A.a
    public final void d(float f12, int i12) {
        this.f370456d = i12;
        this.f370457e = f12;
    }

    public abstract int e(@N r rVar, int i12, float f12);
}
