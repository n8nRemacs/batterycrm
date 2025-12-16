package com.avito.android.select.bottom_sheet.blueprints.chips;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.state.ChipsState;
import com.avito.android.lib.design.chips.ui.Chips;
import com.avito.android.lib.design.chips.ui.g;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.U;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckableChipsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/chips/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/select/bottom_sheet/blueprints/chips/g;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f265079b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Chips f265080c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f265081d;

    public i(@k View view) {
        super(view);
        this.f265079b = view;
        this.f265080c = (Chips) view.findViewById(R.id.chips);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f265081d = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.chips.g
    public final void b(@l String str) {
        I5.a(this.f265081d, str, false);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.chips.g
    public final void g5(@k String str) throws Resources.NotFoundException {
        g.b bVar = com.avito.android.lib.design.chips.ui.g.f178794f;
        Context context = this.f265079b.getContext();
        bVar.getClass();
        this.f265080c.setStyle(g.b.c(C35835l0.j(com.avito.android.lib.util.f.e(str), context), context));
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.chips.g
    public final void sU(int i12, int i13, int i14) {
        D6.b(this.f265079b, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i14));
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.chips.g
    public final void x20(@k ArrayList arrayList, @k ChipsState.DisplayType displayType, @U int i12, @k Y41.l lVar) {
        this.f265080c.setState(new ChipsState(i12, displayType, null, arrayList, new h(lVar)));
    }
}
