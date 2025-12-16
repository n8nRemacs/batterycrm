package com.avito.android.select.bottom_sheet.blueprints.nd_trx;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NdTrxEntryPointItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/nd_trx/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f265171d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f265172b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f265173c;

    public i(@k View view) {
        super(view);
        this.f265172b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f265173c = (TextView) viewFindViewById;
    }
}
