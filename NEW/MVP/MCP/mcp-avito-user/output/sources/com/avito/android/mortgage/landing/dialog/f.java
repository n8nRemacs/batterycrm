package com.avito.android.mortgage.landing.dialog;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.mortgage.landing.list.items.programs.program.ProgramItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageProgramsInfoDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/dialog/f;", "LTZ/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f extends TZ.b {

    /* renamed from: H, reason: collision with root package name */
    @k
    public final ArrayList f199631H;

    /* renamed from: I, reason: collision with root package name */
    @k
    public final l<String, G0> f199632I;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final l<String, G0> f199633J;

    /* renamed from: K, reason: collision with root package name */
    public final int f199634K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public ProgramItem f199635L;

    public f(@k Context context, @Y61.l String str, @k ArrayList arrayList, @k l lVar, @k l lVar2) {
        super(context, null, 2, null);
        this.f199631H = arrayList;
        this.f199632I = lVar;
        this.f199633J = lVar2;
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (L.f(((ProgramItem) it.next()).f199931l, str)) {
                break;
            } else {
                i12++;
            }
        }
        this.f199634K = i12;
        ProgramItem programItem = (ProgramItem) C42745f0.K(i12, this.f199631H);
        this.f199635L = programItem == null ? (ProgramItem) C42745f0.G(this.f199631H) : programItem;
        setTitle(R.string.landing_mortgage_programs);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        S(kotlin.math.b.a(C35835l0.g(context).y * 0.8d));
        K(true);
        B(R.layout.mortgage_programs_layout, R.layout.button_footer_layout, new d(this), new e(this), false);
    }

    public static void V(View view, ProgramItem programItem) {
        View viewFindViewById = view.findViewById(R.id.rate_value);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(programItem.f199924e);
        View viewFindViewById2 = view.findViewById(R.id.credit_value);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById2).setText(programItem.f199928i);
        View viewFindViewById3 = view.findViewById(R.id.term_value);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById3).setText(programItem.f199929j);
        View viewFindViewById4 = view.findViewById(R.id.payment_value);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById4).setText(programItem.f199925f);
        if (L.f(programItem.f199931l, "standart")) {
            View viewFindViewById5 = view.findViewById(R.id.rate_value);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById5).setTextColor(C35835l0.e(R.attr.black, view.getContext()));
        } else {
            View viewFindViewById6 = view.findViewById(R.id.rate_value);
            if (viewFindViewById6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById6).setTextColor(C35835l0.e(R.attr.green600, view.getContext()));
        }
        View viewFindViewById7 = view.findViewById(R.id.program_info);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        j.a((TextView) viewFindViewById7, programItem.f199930k, null);
    }
}
