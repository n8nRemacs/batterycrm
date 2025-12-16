package com.avito.android.serp.adapter.retry;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.seller_promotions.o;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RetryView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/retry/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/serp/adapter/retry/i;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f270769e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f270770b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ViewGroup f270771c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f270772d;

    public j(@k View view) {
        super(view);
        View viewFindViewById = this.itemView.findViewById(R.id.progress_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f270770b = viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.load_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f270771c = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = this.itemView.findViewById(R.id.message);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        View viewFindViewById4 = this.itemView.findViewById(R.id.refresh_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        this.f270772d = button;
        button.setState(new UU.a(this.itemView.getResources().getText(R.string.try_again), null, false, false, false, null, null, null, null, false, 1022, null));
        textView.setText(R.string.serp_core_items_load_error);
    }

    @Override // com.avito.android.serp.adapter.retry.i
    public final void Pz(@k Y41.a<G0> aVar) {
        this.f270772d.setOnClickListener(new o(23, aVar));
    }

    @Override // com.avito.android.serp.adapter.retry.i
    public final void dU(@k AppendingState appendingState) {
        AppendingState appendingState2 = AppendingState.f270751c;
        ViewGroup viewGroup = this.f270771c;
        View view = this.f270770b;
        if (appendingState == appendingState2 || appendingState == AppendingState.f270752d) {
            view.setVisibility(0);
            D6.w(viewGroup);
        } else {
            view.setVisibility(8);
            D6.H(viewGroup);
        }
    }
}
