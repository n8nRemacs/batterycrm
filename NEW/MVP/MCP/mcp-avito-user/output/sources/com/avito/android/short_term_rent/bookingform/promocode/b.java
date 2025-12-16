package com.avito.android.short_term_rent.bookingform.promocode;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.services_transportation_widget.dialog.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormPromoCodeDialogView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/b;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f282078a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, G0> f282079b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f282080c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f282081d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Input f282082e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f282083f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RecyclerView f282084g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f282085h;

    /* compiled from: BookingFormPromoCodeDialogView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            b.this.f282079b.invoke(str);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k View view, @k com.avito.konveyor.adapter.d dVar, @k l<? super String, G0> lVar, @k Y41.a<G0> aVar) {
        this.f282078a = dVar;
        this.f282079b = lVar;
        this.f282080c = aVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f282081d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f282082e = input;
        View viewFindViewById3 = view.findViewById(R.id.inputDescription);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f282083f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.promoCodes);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        this.f282084g = recyclerView;
        View viewFindViewById5 = view.findViewById(R.id.button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById5;
        this.f282085h = button;
        n.c(input, new a());
        button.setOnClickListener(new h(this, 1));
        recyclerView.setAdapter(dVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
    }
}
