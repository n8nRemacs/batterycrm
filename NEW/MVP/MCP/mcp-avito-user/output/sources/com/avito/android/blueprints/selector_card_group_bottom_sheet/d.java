package com.avito.android.blueprints.selector_card_group_bottom_sheet;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardGroupBottomSheet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/selector_card_group_bottom_sheet/d;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final k f106681E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final Y41.l<j, G0> f106682F;

    /* renamed from: G, reason: collision with root package name */
    public SelectorCardGroup f106683G;

    /* renamed from: H, reason: collision with root package name */
    public Button f106684H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public j f106685I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k Context context, @Y61.k k kVar, @Y61.k Y41.l<? super j, G0> lVar) {
        super(context, 0, 2, null);
        Object obj = null;
        this.f106681E = kVar;
        this.f106682F = lVar;
        Iterator it = kVar.f106708e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((j) next).f106703g) {
                obj = next;
                break;
            }
        }
        this.f106685I = (j) obj;
        D(R.layout.selector_card_group_bottom_sheet, true);
        k kVar2 = this.f106681E;
        L(kVar2.f106705b, kVar2.f106706c, true, true);
        S(C35835l0.i(context).heightPixels);
        J(true);
        K(true);
        com.avito.android.lib.util.g.a(this);
    }

    public final void V() {
        Object next;
        this.f106683G = (SelectorCardGroup) findViewById(R.id.selector_cards_grid);
        Button button = (Button) findViewById(R.id.selector_card_select_button);
        this.f106684H = button;
        k kVar = this.f106681E;
        String string = kVar.f106707d;
        if (string == null) {
            string = getContext().getString(R.string.selector_card_group_bottom_sheet_select_button_text);
        }
        button.setState(new UU.a(string, null, false, false, false, null, null, null, null, false, 1022, null));
        SelectorCardGroup selectorCardGroup = this.f106683G;
        if (selectorCardGroup == null) {
            selectorCardGroup = null;
        }
        selectorCardGroup.setContentBinderFactory(new i(new a(this)));
        ArrayList arrayList = kVar.f106708e;
        selectorCardGroup.setData(arrayList);
        selectorCardGroup.setSelectedListener(new b(this));
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((j) next).f106703g) {
                    break;
                }
            }
        }
        j jVar = (j) next;
        if (jVar != null) {
            selectorCardGroup.d(jVar, true);
        }
        Button button2 = this.f106684H;
        (button2 != null ? button2 : null).setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 19));
        P(new c(this));
    }
}
