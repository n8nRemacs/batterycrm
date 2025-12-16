package com.avito.android.screens.bbip_private.ui.items.duration;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.m;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateDurationItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/duration/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/screens/bbip_private/ui/items/duration/i;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f260857b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Chips f260858c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public k f260859d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.chips.h f260860e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public a f260861f;

    public l(@Y61.k View view) {
        super(view);
        this.f260857b = (TextView) view.findViewById(R.id.bbip_private_duration_title);
        this.f260858c = (Chips) view.findViewById(R.id.bbip_private_duration_chips);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.duration.i
    public final void K0(@Y61.k String str, boolean z12) {
        TextView textView = this.f260857b;
        textView.setText(str);
        textView.setTextAppearance(C35835l0.j(z12 ? R.attr.textH50 : R.attr.textH40, textView.getContext()));
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.duration.i
    public final void NA(int i12, @Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2, @Y61.k ArrayList arrayList) throws Resources.NotFoundException {
        a aVar = this.f260861f;
        if (aVar != null) {
            aVar.dismiss();
        }
        Context context = this.itemView.getContext();
        int i13 = 0;
        a aVar2 = new a(context, i13, 2, null);
        Locale locale = new Locale("ru", "RU");
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        Resources resources = context.createConfigurationContext(configuration).getResources();
        com.avito.android.lib.design.bottom_sheet.d.M(aVar2, str, false, true, 6);
        aVar2.D(R.layout.bbip_private_duration_picker_view, true);
        com.avito.android.lib.design.bottom_sheet.d.I(aVar2, true);
        Picker picker = (Picker) aVar2.findViewById(R.id.bbip_private_duration_picker);
        Button button = (Button) aVar2.findViewById(R.id.bbip_private_duration_picker_action);
        if (button != null) {
            button.setText(str2);
            button.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(picker, lVar, (com.avito.android.lib.design.bottom_sheet.d) aVar2, 15));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            arrayList2.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(i13), resources.getQuantityString(R.plurals.duration, iIntValue, Integer.valueOf(iIntValue))));
            i13 = i14;
        }
        if (picker != null) {
            Picker.d(picker, arrayList2, new m(null, false, -1, 1, null), 12);
            picker.setFirstWheelValue((com.avito.android.lib.design.picker.k) arrayList2.get(i12 - 1));
        }
        com.avito.android.lib.util.g.a(aVar2);
        this.f260861f = aVar2;
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.duration.i
    public final void o8(int i12, @Y61.k Y41.l lVar, @Y61.k ArrayList arrayList) {
        this.f260859d = new k(arrayList, lVar, this);
        ya(i12, arrayList);
    }

    @Override // com.avito.android.screens.bbip_private.ui.items.duration.i
    public final void ya(int i12, @Y61.k ArrayList arrayList) {
        Chips chips = this.f260858c;
        Object obj = null;
        chips.setChipsSelectedListener(null);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new j((String) it.next()));
        }
        chips.setData(arrayList2);
        String strValueOf = String.valueOf(i12);
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (L.f(((com.avito.android.lib.design.chips.h) next).getF114848c(), strValueOf)) {
                obj = next;
                break;
            }
        }
        com.avito.android.lib.design.chips.h hVar = (com.avito.android.lib.design.chips.h) obj;
        if (hVar != null) {
            this.f260860e = hVar;
            chips.q(hVar, true);
            chips.o(hVar, false);
        }
        chips.setChipsSelectedListener(this.f260859d);
    }
}
