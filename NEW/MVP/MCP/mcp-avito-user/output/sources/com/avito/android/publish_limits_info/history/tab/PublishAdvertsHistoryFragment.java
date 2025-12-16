package com.avito.android.publish_limits_info.history.tab;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.publish_limits_info.history.tab.di.h;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.konveyor.adapter.j;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishAdvertsHistoryFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish_limits_info/history/tab/PublishAdvertsHistoryFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PublishAdvertsHistoryFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: r0, reason: collision with root package name */
    @k
    public static final a f245880r0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f245881n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public j f245882o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public d f245883p0;

    /* renamed from: q0, reason: collision with root package name */
    public RecyclerView f245884q0;

    /* compiled from: PublishAdvertsHistoryFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish_limits_info/history/tab/PublishAdvertsHistoryFragment$a;", "", "<init>", "()V", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: PublishAdvertsHistoryFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.publish_limits_info.history.tab.PublishAdvertsHistoryFragment$a$a, reason: collision with other inner class name */
        public static final class C7369a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f245885l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7369a(String str) {
                super(1);
                this.f245885l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("shortcut", this.f245885l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static PublishAdvertsHistoryFragment a(@k String str) {
            PublishAdvertsHistoryFragment publishAdvertsHistoryFragment = new PublishAdvertsHistoryFragment();
            C35966w1.a(publishAdvertsHistoryFragment, -1, new C7369a(str));
            return publishAdvertsHistoryFragment;
        }

        public a() {
        }
    }

    public PublishAdvertsHistoryFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.publish_adverts_history_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f245884q0 = recyclerView;
        j jVar = this.f245882o0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        String string = requireArguments().getString("shortcut");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.konveyor.adapter.a aVar = this.f245881n0;
        if (aVar == null) {
            aVar = null;
        }
        d dVar = this.f245883p0;
        if (dVar == null) {
            dVar = null;
        }
        aVar.c(new UV0.c(dVar.gc(string)));
        RecyclerView recyclerView2 = this.f245884q0;
        RecyclerView.Adapter adapter = (recyclerView2 != null ? recyclerView2 : null).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.publish_limits_info.history.tab.di.a.a().a((h) C29972i.a(C29972i.b(this), h.class)).a(this);
    }
}
