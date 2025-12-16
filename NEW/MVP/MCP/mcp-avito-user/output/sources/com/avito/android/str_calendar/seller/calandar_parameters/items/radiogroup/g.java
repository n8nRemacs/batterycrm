package com.avito.android.str_calendar.seller.calandar_parameters.items.radiogroup;

import JO.m;
import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.util.I5;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: RadioGroupSelectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/radiogroup/g;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/radiogroup/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayout f287259b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f287260c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f287261d;

    /* compiled from: RadioGroupSelectItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f287262a;

        static {
            int[] iArr = new int[SelectParameter.Displaying.LabelPosition.values().length];
            try {
                iArr[SelectParameter.Displaying.LabelPosition.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectParameter.Displaying.LabelPosition.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f287262a = iArr;
        }
    }

    public g(@k View view) {
        super(view);
        this.f287259b = (LinearLayout) view.findViewById(R.id.radio_container);
        this.f287260c = (TextView) view.findViewById(R.id.title);
        this.f287261d = (TextView) view.findViewById(R.id.error);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.radiogroup.f
    public final void QJ(@k l lVar, @k List list) throws Resources.NotFoundException {
        ListItemRadio.RadioButtonPosition radioButtonPosition;
        LinearLayout linearLayout = this.f287259b;
        linearLayout.removeAllViews();
        int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(R.dimen.seller_edit_calendar_recycler_view_horizontal_padding);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            ListItemRadio listItemRadio = new ListItemRadio(linearLayout.getContext(), null);
            listItemRadio.setTag(mVar.f8961b);
            listItemRadio.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            SelectParameter.Displaying.LabelPosition labelPosition = mVar.f8976q;
            int i12 = labelPosition == null ? -1 : a.f287262a[labelPosition.ordinal()];
            if (i12 == -1) {
                radioButtonPosition = ListItemRadio.RadioButtonPosition.f179560b;
            } else if (i12 != 1) {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                radioButtonPosition = ListItemRadio.RadioButtonPosition.f179560b;
            } else {
                radioButtonPosition = ListItemRadio.RadioButtonPosition.f179561c;
            }
            listItemRadio.setState((kV.b) new kV.e(mVar.f8962c, null, mVar.f8963d, null, null, null, null, false, false, new ToggleState(new h(lVar, mVar), false, false, false, mVar.f8964e ? ToggleState.ToggleValue.f181170d : ToggleState.ToggleValue.f181168b, 14, null), null, false, BaseListItem.Alignment.f179501c, radioButtonPosition, 3578, null));
            linearLayout.addView(listItemRadio);
        }
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.radiogroup.f
    public final void setError(@Y61.l String str) {
        I5.a(this.f287261d, str, false);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.radiogroup.f
    public final void setTitle(@Y61.l String str) {
        I5.a(this.f287260c, str, false);
    }
}
