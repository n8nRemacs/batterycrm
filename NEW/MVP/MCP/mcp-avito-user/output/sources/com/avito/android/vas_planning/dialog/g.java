package com.avito.android.vas_planning.dialog;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.phone_confirmation.C33153i;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* compiled from: TimePickerDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/dialog/g;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @l
    public final org.threeten.bp.e f322313E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final C33153i f322314F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final String f322315G;

    /* renamed from: H, reason: collision with root package name */
    @k
    public final Object f322316H;

    /* renamed from: I, reason: collision with root package name */
    @k
    public final Object f322317I;

    /* renamed from: J, reason: collision with root package name */
    public int f322318J;

    /* renamed from: K, reason: collision with root package name */
    public int f322319K;

    /* renamed from: L, reason: collision with root package name */
    public Button f322320L;

    /* renamed from: M, reason: collision with root package name */
    public Picker f322321M;

    /* renamed from: N, reason: collision with root package name */
    public TextView f322322N;

    public g(@k Context context, @l org.threeten.bp.g gVar, @l org.threeten.bp.e eVar, @k C33153i c33153i) {
        super(context, 0, 2, null);
        this.f322313E = eVar;
        this.f322314F = c33153i;
        this.f322315G = context.getString(R.string.vas_planning_select_time_string);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f322316H = C42727D.b(lazyThreadSafetyMode, new c(this));
        this.f322317I = C42727D.b(lazyThreadSafetyMode, new d(this));
        gVar = gVar == null ? (eVar == null || eVar.z(org.threeten.bp.e.L()) != 0) ? org.threeten.bp.g.f422067f : org.threeten.bp.g.t().B(1L) : gVar;
        this.f322318J = gVar.f422072b;
        this.f322319K = gVar.f422073c;
        S(C35835l0.g(context).y);
        B(R.layout.vas_time_picker_dialog, R.layout.vas_time_picker_dialog_footer, new a(this), new b(this), true);
        j.c(this, context.getString(R.string.vas_planning_time_picker_title), false, 0, 0, 0, 120);
    }

    public static final ArrayList V(g gVar, int i12) {
        gVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 < i12) {
            arrayList.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(i13), i13 < 10 ? AK.c.g(i13, "0") : String.valueOf(i13)));
            i13++;
        }
        return arrayList;
    }
}
