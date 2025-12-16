package com.avito.android.body_condition_sheet;

import Mj.InterfaceC14496a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BodyConditionSheetView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/body_condition_sheet/o;", "Lcom/avito/android/body_condition_sheet/m;", "_avito_body-condition-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TextView f106917a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f106918b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.advert.g f106919c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.body_condition.i f106920d;

    public o(@Y61.k View view, @Y61.k InterfaceC14496a interfaceC14496a) {
        View viewFindViewById = view.findViewById(R.id.body_condition_sheet_title_tv);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f106917a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.close_sheet_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f106918b = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.flat_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f106919c = new com.avito.android.advert_core.advert.g((LinearLayout) viewFindViewById3, 0, null, true, 6, null);
        View viewFindViewById4 = view.findViewById(R.id.car_body_condition_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f106920d = new com.avito.android.body_condition.i(viewFindViewById4, interfaceC14496a);
    }
}
