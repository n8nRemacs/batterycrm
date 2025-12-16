package com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work;

import Aw.C13093d;
import Aw.InterfaceC13090a;
import Y41.l;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.deal.item.agent.h;
import com.avito.android.lib.design.button.Button;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReturnToWorkDialogView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/return_to_work/c;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/return_to_work/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<InterfaceC13090a, G0> f137185a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public View f137186b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public c(@k l<? super InterfaceC13090a, G0> lVar) {
        this.f137185a = lVar;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.b
    public final void a(@k View view) {
        this.f137186b = view;
        View viewFindViewById = view.findViewById(R.id.action_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById).setOnClickListener(new h(this, 26));
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.b
    public final void b(@k C13093d c13093d) {
        View view = this.f137186b;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.action_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            ((Button) viewFindViewById).setLoading(c13093d.f703b);
        }
    }
}
