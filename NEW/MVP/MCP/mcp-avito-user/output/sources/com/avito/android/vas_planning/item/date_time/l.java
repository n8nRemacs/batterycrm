package com.avito.android.vas_planning.item.date_time;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.D6;
import com.avito.android.vas_planning.model.VasPlanningItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VasPlanningDateTimeView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning/item/date_time/l;", "Lcom/avito/android/vas_planning/item/date_time/k;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f322385h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Input f322386b;

    /* renamed from: c, reason: collision with root package name */
    public final Input f322387c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f322388d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f322389e;

    /* renamed from: f, reason: collision with root package name */
    public final org.threeten.bp.format.c f322390f;

    /* renamed from: g, reason: collision with root package name */
    public final org.threeten.bp.format.c f322391g;

    /* compiled from: VasPlanningDateTimeView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/vas_planning/item/date_time/l$a;", "", "<init>", "()V", "", "DATE_FORMAT", "Ljava/lang/String;", "TIME_FORMAT", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public l(@Y61.k View view) {
        super(view);
        Input input = (Input) view.findViewById(R.id.date);
        input.setRightIcon((Drawable) null);
        this.f322386b = input;
        Input input2 = (Input) view.findViewById(R.id.time);
        input2.setRightIcon((Drawable) null);
        this.f322387c = input2;
        Button button = (Button) view.findViewById(R.id.remove_action);
        FV.a aVar = FV.a.f4720a;
        Context context = view.getContext();
        aVar.getClass();
        button.setText(FV.a.b(R.attr.textIconDelete, context));
        this.f322388d = button;
        this.f322389e = (Button) view.findViewById(R.id.add_new_date);
        this.f322390f = org.threeten.bp.format.c.b("dd MMMM");
        this.f322391g = org.threeten.bp.format.c.b("HH:mm");
    }

    @Override // com.avito.android.vas_planning.item.date_time.k
    public final void L30(@Y61.k Y41.a<G0> aVar) {
        this.f322389e.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(29, aVar));
    }

    @Override // com.avito.android.vas_planning.item.date_time.k
    public final void Lo(@Y61.k VasPlanningItem.VasPlanningDateTime vasPlanningDateTime) {
        org.threeten.bp.e eVar = vasPlanningDateTime.f322423d;
        boolean z12 = false;
        Input input = this.f322387c;
        Input input2 = this.f322386b;
        if (eVar == null) {
            D6.w(input);
            input2.setHint(R.string.vas_planning_date_and_time);
            Input.t(input2, null, false, 6);
        } else {
            D6.G(input, true);
            input2.setHint(R.string.vas_planning_date);
            org.threeten.bp.format.c cVar = this.f322390f;
            w81.d.f(cVar, "formatter");
            Input.t(input2, cVar.a(eVar), false, 6);
        }
        org.threeten.bp.g gVar = vasPlanningDateTime.f322424e;
        Input.t(input, gVar != null ? gVar.q(this.f322391g) : null, false, 6);
        D6.G(this.f322388d, vasPlanningDateTime.f322425f);
        if (vasPlanningDateTime.f322426g && gVar != null) {
            z12 = true;
        }
        D6.G(this.f322389e, z12);
    }

    @Override // com.avito.android.vas_planning.item.date_time.k
    public final void UF(@Y61.k Y41.a<G0> aVar) {
        this.f322386b.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(27, aVar));
    }

    @Override // com.avito.android.vas_planning.item.date_time.k
    public final void pL(@Y61.k Y41.a<G0> aVar) {
        this.f322387c.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(26, aVar));
    }

    @Override // com.avito.android.vas_planning.item.date_time.k
    public final void xA(@Y61.k Y41.a<G0> aVar) {
        this.f322388d.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(28, aVar));
    }
}
