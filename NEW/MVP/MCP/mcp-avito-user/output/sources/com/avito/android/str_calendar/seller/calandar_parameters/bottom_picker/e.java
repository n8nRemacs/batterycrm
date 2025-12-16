package com.avito.android.str_calendar.seller.calandar_parameters.bottom_picker;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.publish.start_publish.C;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PickerBottomSheetDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/bottom_picker/e;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final View f286743E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final RecyclerView f286744F;

    /* renamed from: G, reason: collision with root package name */
    @l
    public Y41.a<G0> f286745G;

    public e(@k Context context, @l String str, @k RecyclerView.Adapter adapter, @l Integer num) {
        super(context, 0, 2, null);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.picker_dialog, (ViewGroup) null);
        this.f286743E = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f286744F = recyclerView;
        G(viewInflate, true);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        j.c(this, str, true, 0, 0, 0, 120);
        setOnDismissListener(new C(this, 2));
        this.f286745G = new d(num, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
    }
}
