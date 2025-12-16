package com.avito.android.screens.bbip.ui.items.duration;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: DurationItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/duration/h;", "Lcom/avito/android/screens/bbip/ui/items/duration/e;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<Integer> f260357b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e f260358c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public String f260359d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public TreeSet f260360e;

    /* renamed from: f, reason: collision with root package name */
    public int f260361f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public Object f260362g;

    @Inject
    public h() {
        io.reactivex.rxjava3.subjects.e<Integer> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f260357b = eVar;
        this.f260358c = eVar;
        this.f260359d = "";
        this.f260360e = new TreeSet();
        this.f260362g = C42784z0.f406748b;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        b bVar = (b) aVar;
        jVar.setTitle(bVar.f260341c);
        this.f260359d = bVar.f260348j;
        this.f260360e = C42745f0.Q0(bVar.f260345g);
        this.f260361f = bVar.f260347i;
        ArrayList arrayList = new ArrayList();
        int i13 = bVar.f260342d;
        int i14 = bVar.f260343e;
        if (i13 <= i14) {
            while (true) {
                arrayList.add(Integer.valueOf(i13));
                if (i13 == i14) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f260362g = arrayList;
        jVar.o8(this.f260361f, new f(this, jVar), k());
    }

    public final ArrayList k() {
        TreeSet treeSet = this.f260360e;
        ArrayList arrayList = new ArrayList(C42745f0.q(treeSet, 10));
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf((Integer) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(this.f260359d);
        return arrayList2;
    }

    @Override // com.avito.android.screens.bbip.ui.items.duration.e
    @Y61.k
    /* renamed from: q3, reason: from getter */
    public final io.reactivex.rxjava3.subjects.e getF260358c() {
        return this.f260358c;
    }
}
