package com.avito.android.section.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.section.w;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.util.C;
import com.avito.android.util.L0;
import kotlin.Metadata;

/* compiled from: SectionItemWidthProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/item/t;", "Lcom/avito/android/section/item/s;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L0 f264824a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C f264825b;

    /* renamed from: c, reason: collision with root package name */
    public final int f264826c;

    /* renamed from: d, reason: collision with root package name */
    public final int f264827d;

    /* renamed from: e, reason: collision with root package name */
    public final int f264828e;

    /* renamed from: f, reason: collision with root package name */
    public final int f264829f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f264830g;

    /* renamed from: h, reason: collision with root package name */
    public final int f264831h;

    /* renamed from: i, reason: collision with root package name */
    public final int f264832i;

    public t(@Y61.k L0 l02, @Y61.k w wVar) {
        this.f264824a = l02;
        this.f264825b = l02.getF318655a();
        int f109435b = wVar.getF109435b();
        this.f264826c = f109435b;
        int iL2 = wVar.l();
        int iN2 = wVar.n();
        this.f264827d = wVar.f();
        this.f264828e = wVar.d();
        this.f264829f = wVar.k();
        this.f264830g = wVar.c();
        this.f264831h = wVar.b();
        this.f264832i = d(f109435b, iN2 - iL2, iL2, null);
    }

    @Override // com.avito.android.section.item.s
    public final int a(@Y61.k SerpViewType serpViewType) {
        SerpViewType serpViewType2 = SerpViewType.f268584d;
        int i12 = this.f264826c;
        if (serpViewType == serpViewType2) {
            i12 /= 2;
        }
        if (i12 <= 0) {
            i12 = 1;
        }
        return d(i12, (i12 - 1) * this.f264828e, this.f264829f, serpViewType);
    }

    @Override // com.avito.android.section.item.s
    public final int b(int i12) {
        int i13 = this.f264832i;
        if (i12 == 1) {
            return i13;
        }
        if (2 <= i12 && i12 < 7) {
            return i13 * 2;
        }
        this.f264825b.o().getClass();
        return i13;
    }

    @Override // com.avito.android.section.item.s
    public final int c() {
        return (int) ((this.f264824a.c() - this.f264829f) * ((this.f264830g || (this.f264831h == 2)) ? 0.28f : 0.4f));
    }

    public final int d(int i12, int i13, int i14, SerpViewType serpViewType) {
        int iC2 = (this.f264824a.c() - ((serpViewType == SerpViewType.f268583c ? 3 : 2) * i14)) - i13;
        boolean z12 = iC2 > 0;
        boolean z13 = i12 > 0;
        if (z12 && z13) {
            return iC2 / i12;
        }
        this.f264825b.o().getClass();
        return this.f264827d;
    }
}
