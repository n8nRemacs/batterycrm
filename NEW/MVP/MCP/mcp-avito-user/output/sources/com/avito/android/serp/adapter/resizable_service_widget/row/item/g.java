package com.avito.android.serp.adapter.resizable_service_widget.row.item;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ResizableServiceWidgetRowView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/resizable_service_widget/row/item/g;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f270747d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayout f270748b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f270749c;

    public g(@k View view) {
        super(view);
        LinearLayout linearLayout = (LinearLayout) view;
        this.f270748b = linearLayout;
        this.f270749c = LayoutInflater.from(linearLayout.getContext());
    }
}
