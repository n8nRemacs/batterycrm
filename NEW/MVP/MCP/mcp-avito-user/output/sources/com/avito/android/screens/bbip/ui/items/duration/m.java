package com.avito.android.screens.bbip.ui.items.duration;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DurationItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/duration/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/screens/bbip/ui/items/duration/j;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f260368b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Chips f260369c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public l f260370d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.chips.h f260371e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public a f260372f;

    public m(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.bbip_duration_title_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f260368b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.bbip_duration_chips);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f260369c = (Chips) viewFindViewById2;
    }

    @Override // com.avito.android.screens.bbip.ui.items.duration.j
    public final void Ys(@Y61.k List<Integer> list, int i12, @Y61.k Y41.l<? super Integer, G0> lVar) throws Resources.NotFoundException {
        a aVar = this.f260372f;
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
        com.avito.android.lib.design.bottom_sheet.d.M(aVar2, context.getResources().getString(R.string.bbip_duration_dialog_title), true, true, 2);
        aVar2.D(R.layout.bbip_duration_picker, true);
        com.avito.android.lib.design.bottom_sheet.d.I(aVar2, true);
        Picker picker = (Picker) aVar2.findViewById(R.id.bbip_duration_picker);
        Button button = (Button) aVar2.findViewById(R.id.bbip_duration_picker_select);
        if (button != null) {
            button.setOnClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(picker, (Y41.l) lVar, (com.avito.android.lib.design.bottom_sheet.d) aVar2, 14));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            arrayList.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(i13), resources.getQuantityString(R.plurals.duration, iIntValue, Integer.valueOf(iIntValue))));
            i13 = i14;
        }
        if (picker != null) {
            Picker.d(picker, arrayList, new com.avito.android.lib.design.picker.m(null, false, -1, 1, null), 12);
            picker.setFirstWheelValue((com.avito.android.lib.design.picker.k) arrayList.get(i12 - 1));
        }
        com.avito.android.lib.util.g.a(aVar2);
        this.f260372f = aVar2;
    }

    @Override // com.avito.android.screens.bbip.ui.items.duration.j
    public final void o8(int i12, @Y61.k Y41.l lVar, @Y61.k ArrayList arrayList) {
        this.f260370d = new l(arrayList, lVar, this);
        ya(i12, arrayList);
    }

    @Override // com.avito.android.screens.bbip.ui.items.duration.j
    public final void setTitle(@Y61.k String str) {
        this.f260368b.setText(str);
    }

    @Override // com.avito.android.screens.bbip.ui.items.duration.j
    public final void ya(int i12, @Y61.k ArrayList arrayList) {
        Chips chips = this.f260369c;
        Object obj = null;
        chips.setChipsSelectedListener(null);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new k((String) it.next()));
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
            this.f260371e = hVar;
            chips.q(hVar, true);
            chips.o(hVar, false);
        }
        chips.setChipsSelectedListener(this.f260370d);
    }
}
