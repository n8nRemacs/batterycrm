package com.avito.android.avl.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.O;
import java.util.LinkedHashSet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.C43259k;

/* compiled from: AvlPlayerActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class l extends H implements Y41.l<Integer, G0> {
    public final void f(int i12) {
        O o12;
        AvlPlayerActivity avlPlayerActivity = (AvlPlayerActivity) this.receiver;
        int i13 = AvlPlayerActivity.f98291Q;
        int iA2 = avlPlayerActivity.a2(i12);
        if (iA2 >= 0) {
            q qVar = avlPlayerActivity.f98300I;
            if (qVar == null) {
                qVar = null;
            }
            if (iA2 < qVar.f98409n.size()) {
                ViewPager2 viewPager2 = avlPlayerActivity.f98299H;
                if (viewPager2 == null) {
                    viewPager2 = null;
                }
                View childAt = viewPager2.getChildAt(0);
                RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                RecyclerView.C cP2 = recyclerView != null ? recyclerView.P(iA2) : null;
                if (!(cP2 instanceof B)) {
                    cP2 = null;
                }
                B b12 = (B) cP2;
                if (b12 != null) {
                    b12.D80(avlPlayerActivity);
                }
            }
        }
        int iA22 = avlPlayerActivity.a2(iA2);
        if (iA22 >= 0) {
            q qVar2 = avlPlayerActivity.f98300I;
            if (qVar2 == null) {
                qVar2 = null;
            }
            if (iA22 < qVar2.f98409n.size()) {
                LinkedHashSet linkedHashSet = avlPlayerActivity.f98298G;
                if (linkedHashSet.contains(Integer.valueOf(iA22))) {
                    return;
                }
                com.avito.android.avl.features.a aVar = avlPlayerActivity.f98313r;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.getClass();
                kotlin.reflect.n<Object> nVar = com.avito.android.avl.features.a.f98177c[0];
                if (((Boolean) aVar.f98178b.a().invoke()).booleanValue()) {
                    linkedHashSet.add(Integer.valueOf(iA22));
                    ViewPager2 viewPager22 = avlPlayerActivity.f98299H;
                    if (viewPager22 == null) {
                        viewPager22 = null;
                    }
                    View childAt2 = viewPager22.getChildAt(0);
                    RecyclerView recyclerView2 = childAt2 instanceof RecyclerView ? (RecyclerView) childAt2 : null;
                    RecyclerView.C cP3 = recyclerView2 != null ? recyclerView2.P(iA22) : null;
                    if (!(cP3 instanceof B)) {
                        cP3 = null;
                    }
                    B b13 = (B) cP3;
                    if (b13 == null || (o12 = b13.f98338E) == null) {
                        return;
                    }
                    C43259k.d(C22981N.a(avlPlayerActivity.getLifecycle()), null, null, new j(iA22, avlPlayerActivity, o12, null), 3);
                }
            }
        }
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
        f(num.intValue());
        return G0.f406611a;
    }
}
