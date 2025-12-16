package com.avito.android.wallet.page.history.details.mvi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.bottom_sheet_group.o;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PaymentHistoryDetailsDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/d;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f327926M = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final Y41.l<SO0.a, G0> f327927E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final TextView f327928F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final TextView f327929G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f327930H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public LinearLayout f327931I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.l
    public TextView f327932J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public LinearLayout f327933K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f327934L;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k Context context, @Y61.k Y41.l<? super SO0.a, G0> lVar) {
        super(context, 0, 2, null);
        this.f327927E = lVar;
        setContentView(R.layout.payment_history_detailed_info);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new o(3));
        S(C35835l0.g(context).y);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 3);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.payment_history_detailed_info_header, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.operation_details_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f327928F = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.operation_details_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f327929G = (TextView) viewFindViewById2;
        H(viewInflate);
        this.f327930H = (LinearLayout) findViewById(R.id.details_list);
        this.f327934L = (FrameLayout) findViewById(R.id.loading_indicator);
    }
}
