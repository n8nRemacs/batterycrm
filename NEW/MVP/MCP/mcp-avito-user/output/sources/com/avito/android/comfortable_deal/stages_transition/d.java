package com.avito.android.comfortable_deal.stages_transition;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.konveyor.adapter.j;
import fq.InterfaceC40463a;
import fq.f;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StagesTransitionDialogView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/d;", "Lcom/avito/android/comfortable_deal/stages_transition/c;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f122818a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f122819b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<InterfaceC40463a, G0> f122820c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public View f122821d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public View f122822e;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k j jVar, @k com.avito.konveyor.adapter.a aVar, @k l<? super InterfaceC40463a, G0> lVar) {
        this.f122818a = jVar;
        this.f122819b = aVar;
        this.f122820c = lVar;
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.c
    public final void a(@k View view) {
        this.f122821d = view;
        View viewFindViewById = view.findViewById(R.id.fields_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        j jVar = this.f122818a;
        jVar.setHasStableIds(true);
        ((RecyclerView) viewFindViewById).setAdapter(jVar);
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.c
    public final void b(@k View view) {
        this.f122822e = view;
        View viewFindViewById = view.findViewById(R.id.save_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById).setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(this, 5));
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.c
    @SuppressLint({"NotifyDataSetChanged"})
    public final void c(@k fq.f fVar) {
        FrameLayout frameLayout;
        Button button = null;
        if (fVar instanceof f.b) {
            View view = this.f122821d;
            if (view != null) {
                View viewFindViewById = view.findViewById(R.id.loading_container);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                }
                D6.H((FrameLayout) viewFindViewById);
            }
            View view2 = this.f122822e;
            if (view2 != null) {
                View viewFindViewById2 = view2.findViewById(R.id.save_button);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                button = (Button) viewFindViewById2;
            }
            if (button == null) {
                return;
            }
            button.setEnabled(false);
            return;
        }
        if (fVar instanceof f.a) {
            View view3 = this.f122821d;
            if (view3 != null) {
                View viewFindViewById3 = view3.findViewById(R.id.fields_recycler);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
                }
            }
            f.a aVar = (f.a) fVar;
            this.f122819b.c(new UV0.c(aVar.f396157a));
            this.f122818a.notifyDataSetChanged();
            View view4 = this.f122821d;
            if (view4 != null) {
                View viewFindViewById4 = view4.findViewById(R.id.loading_container);
                if (viewFindViewById4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                }
                frameLayout = (FrameLayout) viewFindViewById4;
            } else {
                frameLayout = null;
            }
            D6.w(frameLayout);
            View view5 = this.f122822e;
            if (view5 != null) {
                View viewFindViewById5 = view5.findViewById(R.id.save_button);
                if (viewFindViewById5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                button = (Button) viewFindViewById5;
            }
            if (button == null) {
                return;
            }
            button.setEnabled(aVar.f396158b);
        }
    }
}
