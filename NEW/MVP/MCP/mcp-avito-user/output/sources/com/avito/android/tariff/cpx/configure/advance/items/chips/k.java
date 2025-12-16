package com.avito.android.tariff.cpx.configure.advance.items.chips;

import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.tariff.cpx.configure.advance.items.chips.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CpxConfigureAdvanceChipsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/chips/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/configure/advance/items/chips/j;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f295716e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Chips f295717b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f295718c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.chips.h f295719d;

    public k(@Y61.k View view) {
        super(view);
        this.f295717b = (Chips) view.findViewById(R.id.cpx_configure_advance_chips);
        TextView textView = (TextView) view.findViewById(R.id.cpx_configure_advance_chips_info);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f295718c = textView;
    }

    @Override // com.avito.android.tariff.cpx.configure.advance.items.chips.j
    public final void U4(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f295718c, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpx.configure.advance.items.chips.j
    public final void wa(@Y61.k Y41.l lVar, @Y61.k List list) {
        Object next;
        Chips chips = this.f295717b;
        chips.setData(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof a.b) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((a.b) next).f295698c) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        a.b bVar = (a.b) next;
        if (bVar != null) {
            this.f295719d = bVar;
            com.avito.android.util.text.j.a(this.f295718c, bVar.f295700e, null);
            chips.q(bVar, false);
            chips.post(new RunnableC34589p(16, chips, bVar));
        }
        chips.setChipsSelectedListener(new a(lVar, this));
    }

    /* compiled from: CpxConfigureAdvanceChipsItemView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/tariff/cpx/configure/advance/items/chips/k$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.tariff.cpx.configure.advance.items.chips.a, G0> f295720a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f295721b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super com.avito.android.tariff.cpx.configure.advance.items.chips.a, G0> lVar, k kVar) {
            this.f295720a = lVar;
            this.f295721b = kVar;
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            boolean z12 = hVar instanceof a.C8995a;
            Y41.l<com.avito.android.tariff.cpx.configure.advance.items.chips.a, G0> lVar = this.f295720a;
            k kVar = this.f295721b;
            if (!z12) {
                if (hVar instanceof a.b) {
                    ((g) lVar).invoke(hVar);
                    kVar.f295719d = hVar;
                    return;
                }
                return;
            }
            ((g) lVar).invoke(hVar);
            com.avito.android.lib.design.chips.h hVar2 = kVar.f295719d;
            if (hVar2 != null) {
                int i12 = Chips.f178664L;
                kVar.f295717b.q(hVar2, true);
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }
}
