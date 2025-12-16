package com.avito.android.messenger.conversation.mvi.quick_replies;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.quick_replies.r;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: QuickRepliesView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "contentView", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "com/avito/android/messenger/conversation/mvi/quick_replies/A", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class s extends N implements Y41.l<View, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f194141l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f194142m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, r rVar2) {
        super(1);
        this.f194141l = rVar;
        this.f194142m = rVar2;
    }

    @Override // Y41.l
    public final G0 invoke(View view) {
        View view2 = view;
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.quick_replies_recycler);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        r rVar = this.f194141l;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(rVar.f194122b, rVar.f194123c);
        recyclerView.setAdapter(jVar);
        View viewFindViewById = view2.findViewById(R.id.quick_replies_progress);
        View viewFindViewById2 = view2.findViewById(R.id.quick_replies_empty_placeholder);
        r.a aVar = new r.a(recyclerView, jVar, viewFindViewById, viewFindViewById2, (TextView) view2.findViewById(R.id.quick_replies_empty_placeholder_subtitle));
        D6.w(recyclerView);
        this.f194142m.f194122b.c(new UV0.c(C42784z0.f406748b));
        jVar.notifyDataSetChanged();
        D6.H(viewFindViewById);
        D6.g(viewFindViewById2);
        rVar.f194133m = aVar;
        return G0.f406611a;
    }
}
