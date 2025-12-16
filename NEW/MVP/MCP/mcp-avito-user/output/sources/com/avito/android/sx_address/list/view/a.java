package com.avito.android.sx_address.list.view;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.sx_address.list.domain.Filter;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: FilterMenuView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/view/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f293405L = 0;

    /* renamed from: E, reason: collision with root package name */
    @l
    public final TextView f293406E;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final LinearLayout f293407F;

    /* renamed from: G, reason: collision with root package name */
    @l
    public final Button f293408G;

    /* renamed from: H, reason: collision with root package name */
    @k
    public Filter f293409H;

    /* renamed from: I, reason: collision with root package name */
    @k
    public final LinkedHashMap f293410I;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final e2 f293411J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final e2 f293412K;

    public a(@k View view, @k com.avito.android.sx_address.list.e eVar) {
        super(view.getContext(), 0, 2, null);
        this.f293409H = Filter.f293146c;
        this.f293410I = new LinkedHashMap();
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410779d, 1);
        this.f293411J = e2VarB;
        this.f293412K = e2VarB;
        LinearLayout linearLayout = this.f293407F;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        setContentView(R.layout.filter_menu_layout);
        this.f293406E = (TextView) findViewById(R.id.title);
        this.f293407F = (LinearLayout) findViewById(R.id.radio_container);
        this.f293408G = (Button) findViewById(R.id.accept_button);
        com.avito.android.lib.design.bottom_sheet.j.c(this, null, false, 0, 0, 0, 127);
        Iterator it = ((AbstractC42738c) Filter.f293151h).iterator();
        while (it.hasNext()) {
            Filter filter = (Filter) it.next();
            ListItemRadio listItemRadio = new ListItemRadio(getContext(), null);
            listItemRadio.setClickable(true);
            listItemRadio.setFocusable(true);
            listItemRadio.setChecked(this.f293409H == filter);
            listItemRadio.e(new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.e(7, this, filter));
            D6.f(listItemRadio, y6.b(16), 0, y6.b(16), 0, 10);
            D6.c(listItemRadio, null, Integer.valueOf(y6.b(8)), null, Integer.valueOf(y6.b(8)), 5);
            listItemRadio.setTitle(filter.f293152b);
            this.f293410I.put(filter.name(), listItemRadio);
            TextView textView = this.f293406E;
            if (textView != null) {
                I5.a(textView, eVar.getF293192a(), false);
            }
            LinearLayout linearLayout2 = this.f293407F;
            if (linearLayout2 != null) {
                linearLayout2.addView(listItemRadio);
            }
        }
        Button button = this.f293408G;
        if (button != null) {
            button.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 18));
        }
    }
}
