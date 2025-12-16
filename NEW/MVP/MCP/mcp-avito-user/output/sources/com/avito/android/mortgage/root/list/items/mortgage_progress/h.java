package com.avito.android.mortgage.root.list.items.mortgage_progress;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.widgets.VerticalStepsBar;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageProgressView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/mortgage_progress/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/mortgage_progress/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f202691b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final VerticalStepsBar f202692c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.l<? super DeepLink, G0> f202693d;

    /* compiled from: MortgageProgressView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<DeepLink, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            DeepLink deepLink2 = deepLink;
            Y41.l<? super DeepLink, G0> lVar = h.this.f202693d;
            if (lVar != null) {
                lVar.invoke(deepLink2);
            }
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202691b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.steps);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.mortgage.widgets.VerticalStepsBar");
        }
        this.f202692c = (VerticalStepsBar) viewFindViewById2;
    }

    @Override // com.avito.android.mortgage.root.list.items.mortgage_progress.g
    public final void O2(@k Y41.l<? super DeepLink, G0> lVar) {
        this.f202693d = lVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.mortgage_progress.g
    public final void YB(int i12) {
        this.f202692c.setCurrentStep(i12);
    }

    @Override // com.avito.android.mortgage.root.list.items.mortgage_progress.g
    public final void setTitle(@k String str) {
        this.f202691b.setText(str);
    }

    @Override // com.avito.android.mortgage.root.list.items.mortgage_progress.g
    public final void t4(@k List<VerticalStepsBar.c> list) {
        this.f202692c.b(new a(), (ArrayList) list);
    }
}
