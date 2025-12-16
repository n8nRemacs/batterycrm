package com.avito.android.developments_agency_search.screen.realty_agency_search.dialog;

import Y41.l;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.bottom_sheet.m;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OptionListBottomSheetDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/dialog/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends d {
    public b() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, List list, l lVar, int i12, C42822w c42822w) {
        super(context, 0, 2, null);
        str = (i12 & 2) != 0 ? null : str;
        d.M(this, str, false, true, 6);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.design_bottom_sheet_dialog_scrollable_content, (ViewGroup) null);
        G(viewInflate, true);
        View viewFindViewById = viewInflate.findViewById(R.id.items_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), y6.b(12), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        m mVar = new m(linearLayout, R.style.Re23_ListItem_DefaultMedium);
        mVar.f178558d = new a(lVar, this);
        mVar.c(mVar.f178555a, list);
    }
}
