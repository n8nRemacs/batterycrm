package com.avito.android.verification.verification_finish;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import xM0.C49864d;

/* compiled from: VerificationFinishView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_finish/s;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f325325a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final NavBar f325326b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f325327c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f325328d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f325329e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f325330f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C49864d f325331g;

    /* compiled from: VerificationFinishView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f325332l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.f325332l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            return this.f325332l.findViewById(R.id.verification_finish_content_container);
        }
    }

    public s(@Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k View view, @Y61.k Y41.a<G0> aVar) {
        this.f325325a = dVar;
        NavBar navBar = (NavBar) view.findViewById(R.id.verification_finish_nav_bar);
        this.f325326b = navBar;
        this.f325327c = (TextView) view.findViewById(R.id.verification_finish_title);
        this.f325328d = (TextView) view.findViewById(R.id.verification_finish_subtitle);
        this.f325329e = (Button) view.findViewById(R.id.verification_finish_button);
        this.f325330f = (Button) view.findViewById(R.id.verification_finish_secondary_button);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.verification_finish_list);
        this.f325331g = new C49864d((ViewGroup) view.findViewById(R.id.verification_finish_progress_root), new a(view), 0, 4, null);
        recyclerView.setAdapter(dVar);
        recyclerView.l(new com.avito.android.verification.list_items.verification_status.d(), -1);
        recyclerView.l(new PM0.b(), -1);
        recyclerView.l(new PM0.c(), -1);
        recyclerView.l(new PM0.e(), -1);
        recyclerView.l(new PM0.d(), -1);
        recyclerView.l(new PM0.a(), -1);
        navBar.c(R.attr.ic_close24, aVar);
    }
}
