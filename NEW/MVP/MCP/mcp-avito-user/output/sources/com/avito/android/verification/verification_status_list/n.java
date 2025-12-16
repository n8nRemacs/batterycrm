package com.avito.android.verification.verification_status_list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import xM0.C49864d;

/* compiled from: VerificationStatusListView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_status_list/n;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f325823a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final NavBar f325824b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f325825c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C49864d f325826d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f325827e;

    /* compiled from: VerificationStatusListView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f325828l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f325828l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            return this.f325828l.findViewById(R.id.verification_status_list_content_container);
        }
    }

    public n(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.d dVar) {
        this.f325823a = dVar;
        Context context = view.getContext();
        this.f325824b = (NavBar) view.findViewById(R.id.verification_status_list_nav_bar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.verification_status_list);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.verification_status_swipe_refresh);
        this.f325825c = swipeRefreshLayout;
        this.f325826d = new C49864d((ViewGroup) view.findViewById(R.id.verification_status_list_progress_root), new a(view), 0, 4, null);
        this.f325827e = (TextView) view.findViewById(R.id.verification_status_footer);
        recyclerView.setAdapter(dVar);
        recyclerView.l(new com.avito.android.verification.list_items.verification_status.d(), -1);
        recyclerView.l(new XM0.e(), -1);
        recyclerView.l(new XM0.a(), -1);
        recyclerView.l(new XM0.b(y6.b(16)), -1);
        recyclerView.l(new XM0.c(), -1);
        recyclerView.l(new XM0.d(), -1);
        recyclerView.l(new PV.a(y6.b(16), y6.b(16), 0, 0, 12, null), -1);
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(context, false);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, context));
    }
}
