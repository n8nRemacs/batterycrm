package com.avito.android.extended_profile_adverts;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: ProfileAdvertsView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class q extends H implements Y41.l<pA.d, G0> {
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(pA.d dVar) {
        pA.d dVar2 = dVar;
        s sVar = (s) this.receiver;
        sVar.getClass();
        boolean z12 = dVar2.f428248f;
        View view = sVar.f150973l;
        RecyclerView recyclerView = sVar.f150974m;
        if (z12 && dVar2.f428243a.isEmpty()) {
            D6.w(recyclerView);
            D6.H(view);
        } else {
            D6.H(recyclerView);
            D6.w(view);
        }
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(sVar.f150969h);
            sVar.a(dVar2);
        } else {
            recyclerView.post(new RunnableC28882d(5, sVar, dVar2));
        }
        return G0.f406611a;
    }
}
