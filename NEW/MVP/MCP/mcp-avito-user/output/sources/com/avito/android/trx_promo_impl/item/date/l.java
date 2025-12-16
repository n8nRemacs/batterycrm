package com.avito.android.trx_promo_impl.item.date;

import LV.c;
import RF0.e;
import VU.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V0;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: TrxPromoDatesView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_impl/item/date/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/trx_promo_impl/item/date/k;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f304258b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f304259c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f304260d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f304261e;

    /* compiled from: TrxPromoDatesView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<e.a, G0> f304262l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e.a f304263m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super e.a, G0> lVar, e.a aVar) {
            super(0);
            this.f304262l = lVar;
            this.f304263m = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f304262l.invoke(this.f304263m);
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoDatesView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<e.b, G0> f304264l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e.b f304265m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super e.b, G0> lVar, e.b bVar) {
            super(0);
            this.f304264l = lVar;
            this.f304265m = bVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f304264l.invoke(this.f304265m);
            return G0.f406611a;
        }
    }

    /* compiled from: TrxPromoDatesView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<e.c, G0> f304266l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e.c f304267m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super e.c, G0> lVar, e.c cVar) {
            super(0);
            this.f304266l = lVar;
            this.f304267m = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f304266l.invoke(this.f304267m);
            return G0.f406611a;
        }
    }

    public l(@Y61.k View view) {
        super(view);
        this.f304258b = (TextView) view.findViewById(R.id.trx_promo_dates_text_title);
        this.f304259c = (Button) view.findViewById(R.id.trx_promo_dates_button_all_free);
        this.f304260d = (Button) view.findViewById(R.id.trx_promo_dates_button_before_date);
        this.f304261e = (Button) view.findViewById(R.id.trx_promo_dates_button_date_range);
    }

    public static Drawable B80(RF0.g gVar, Context context) {
        Drawable drawableH;
        if (gVar == null || (drawableH = C35835l0.h(gVar.f14237a, context)) == null) {
            return null;
        }
        RF0.l lVar = gVar.f14238b;
        if (lVar != null) {
            C48063a c48063a = C48063a.f437606a;
            RF0.j jVar = lVar.f14247b;
            Integer numValueOf = jVar != null ? Integer.valueOf(jVar.f14244a) : null;
            RF0.j jVar2 = lVar.f14248c;
            if (jVar2 != null) {
                jVar = jVar2;
            }
            numD = C48063a.d(c48063a, context, lVar.f14246a, numValueOf, jVar != null ? Integer.valueOf(jVar.f14244a) : null);
        }
        if (numD != null) {
            V0.a(drawableH, numD.intValue());
        }
        return drawableH;
    }

    @Override // com.avito.android.trx_promo_impl.item.date.k
    public final void Lz(@Y61.k String str, @Y61.l RF0.g gVar, @InterfaceC42150f int i12, @Y61.k e.a aVar, @Y61.k Y41.l<? super e.a, G0> lVar) {
        Button button = this.f304259c;
        button.setState(new UU.a(str, null, false, false, false, new a(lVar, aVar), null, B80(gVar, button.getContext()), null, false, 862, null));
        b.a aVar2 = VU.b.f17147t;
        Context context = button.getContext();
        aVar2.getClass();
        button.setStyle((VU.b) c.a.a(aVar2, context, i12));
    }

    @Override // com.avito.android.trx_promo_impl.item.date.k
    public final void Yl(@Y61.k String str, @Y61.l RF0.g gVar, @InterfaceC42150f int i12, @Y61.k e.c cVar, @Y61.k Y41.l<? super e.c, G0> lVar) {
        D6.w(this.f304260d);
        Button button = this.f304261e;
        D6.H(button);
        button.setState(new UU.a(str, null, false, false, false, new c(lVar, cVar), null, B80(gVar, button.getContext()), null, false, 862, null));
        b.a aVar = VU.b.f17147t;
        Context context = button.getContext();
        aVar.getClass();
        button.setStyle((VU.b) c.a.a(aVar, context, i12));
    }

    @Override // com.avito.android.trx_promo_impl.item.date.k
    public final void c40(@Y61.k String str, @Y61.l RF0.g gVar, @InterfaceC42150f int i12, @Y61.k e.b bVar, @Y61.k Y41.l<? super e.b, G0> lVar) {
        D6.w(this.f304261e);
        Button button = this.f304260d;
        D6.H(button);
        button.setState(new UU.a(str, null, false, false, false, new b(lVar, bVar), null, B80(gVar, button.getContext()), null, false, 862, null));
        b.a aVar = VU.b.f17147t;
        Context context = button.getContext();
        aVar.getClass();
        button.setStyle((VU.b) c.a.a(aVar, context, i12));
    }

    @Override // com.avito.android.trx_promo_impl.item.date.k
    public final void e(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f304258b, attributedText, null);
    }
}
