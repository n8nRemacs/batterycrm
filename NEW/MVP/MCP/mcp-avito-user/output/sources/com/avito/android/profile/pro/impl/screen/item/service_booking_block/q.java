package com.avito.android.profile.pro.impl.screen.item.service_booking_block;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C23418i;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.header_button.HeaderButton;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import i31.InterfaceC41220a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProSbBlockItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/q;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f223516p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f223517b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.pro.impl.screen.item.service_booking_block.a f223518c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f223519d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f223520e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Badge f223521f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final HeaderButton f223522g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f223523h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f223524i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f223525j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f223526k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final View f223527l;

    /* renamed from: m, reason: collision with root package name */
    public final Context f223528m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DeepLink, G0> f223529n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Object f223530o;

    /* compiled from: ProfileProSbBlockItem.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/q$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        q a(@Y61.k View view);
    }

    /* compiled from: ProfileProSbBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.a<com.avito.konveyor.adapter.d> {
        @Override // Y41.a
        public final com.avito.konveyor.adapter.d invoke() throws BlueprintCollisionException {
            q qVar = (q) this.receiver;
            ProfileProSbBlockActionsLayoutManager profileProSbBlockActionsLayoutManager = new ProfileProSbBlockActionsLayoutManager(qVar.f223528m, 0, 0, 6, null);
            RecyclerView recyclerView = qVar.f223526k;
            recyclerView.setLayoutManager(profileProSbBlockActionsLayoutManager);
            recyclerView.l(qVar.f223519d, -1);
            C23418i c23418i = new C23418i();
            c23418i.f53830d = 0L;
            recyclerView.setItemAnimator(c23418i);
            a.C10493a c10493a = new a.C10493a();
            c10493a.b(qVar.f223518c);
            com.avito.konveyor.a aVarA = c10493a.a();
            com.avito.konveyor.adapter.d dVar = new com.avito.konveyor.adapter.d(new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, null, 4, null);
            recyclerView.setAdapter(dVar);
            return dVar;
        }
    }

    @i31.c
    public q(@InterfaceC41220a @Y61.k View view, @Y61.k com.avito.android.util.text.a aVar, @Y61.k com.avito.android.profile.pro.impl.screen.item.service_booking_block.a aVar2, @Y61.k k kVar) {
        super(view);
        this.f223517b = aVar;
        this.f223518c = aVar2;
        this.f223519d = kVar;
        this.f223520e = (TextView) view.findViewById(R.id.sb_block_title);
        this.f223521f = (Badge) view.findViewById(R.id.sb_block_badge);
        this.f223522g = (HeaderButton) view.findViewById(R.id.sb_block_button);
        this.f223523h = view.findViewById(R.id.sb_block_button_group);
        this.f223524i = (ViewGroup) view.findViewById(R.id.sb_block_action);
        this.f223525j = (TextView) view.findViewById(R.id.sb_block_action_text);
        this.f223526k = (RecyclerView) view.findViewById(R.id.sb_block_action_items);
        this.f223527l = view.findViewById(R.id.sb_block_loading_skeleton);
        this.f223528m = this.itemView.getContext();
        this.f223530o = C42727D.b(LazyThreadSafetyMode.f406616d, new b(0, this, q.class, "initRvAndAdapter", "initRvAndAdapter()Lcom/avito/konveyor/adapter/ListRecyclerAdapter;", 0));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f223529n = null;
        this.f223522g.setOnClickListener(null);
        this.f223524i.setOnClickListener(null);
    }
}
