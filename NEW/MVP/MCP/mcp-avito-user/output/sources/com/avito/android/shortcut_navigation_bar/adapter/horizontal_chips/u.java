package com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35987z1;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.avito.android.util.y6;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zw0.InterfaceC50637a;

/* compiled from: HorizontalChipsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/u;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/shortcut_navigation_bar/adapter/horizontal_chips/t;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u extends com.avito.konveyor.adapter.b implements t {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f283324f = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f283325b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50637a f283326c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f283327d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f283328e;

    /* compiled from: HorizontalChipsView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/G0;", "accept", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            u uVar = u.this;
            Button.g(uVar.f283327d, new BitmapDrawable(uVar.f283327d.getResources(), (Bitmap) obj), null, false, null, 10);
        }
    }

    /* compiled from: HorizontalChipsView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f283331l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f283331l = str;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
            oVar.b(this.f283331l);
            return G0.f406611a;
        }
    }

    public u(@Y61.k View view, @Y61.k InterfaceC50637a interfaceC50637a) {
        super(view);
        this.f283325b = view;
        this.f283326c = interfaceC50637a;
        this.f283327d = (Button) view;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.t
    public final void Ao(boolean z12) {
        Button.h(this.f283327d, 0, z12 ? R.drawable.expand_more_8x16 : 0, 1);
        D6.f(this.f283327d, y6.b(0), 0, y6.b(0), 0, 10);
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.t
    public final void C30() {
        Button.g(this.f283327d, null, null, false, null, 14);
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.t
    public final void Cc(@Y61.k String str) {
        Button button = this.f283327d;
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(button.getContext(), 0, 0, 6, null);
        r.a aVar = new r.a(new i.c(new b.a()));
        aVar.j(y6.b(-2));
        kVar.f181224j = aVar;
        com.avito.android.lib.design.tooltip.p.a(kVar, new c(str));
        kVar.f(button);
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.t
    public final void Cw(int i12, boolean z12) {
        Button button = this.f283327d;
        if (z12) {
            button.setImageResource(i12);
            D6.f(this.f283327d, y6.b(4), 0, y6.b(4), 0, 10);
            return;
        }
        Button.h(button, i12, 0, 2);
        D6.f(this.f283327d, y6.b(0), 0, y6.b(0), 0, 10);
    }

    @Override // xw0.InterfaceC50015a
    public final void U7(@Y61.k String str, boolean z12) {
        this.f283327d.setText(this.f283326c.a(str, z12));
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.t
    public final void Uq(@Y61.k UniversalImage universalImage, @Y61.k Size size, boolean z12) {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f283328e;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        Image imageQ = com.avito.android.actions_sheet.a.q(this.f283325b, universalImage);
        if (imageQ == null) {
            return;
        }
        if (z12) {
            D6.f(this.f283327d, y6.b(12), 0, y6.b(12), 0, 10);
        } else {
            D6.f(this.f283327d, 0, 0, 0, 0, 10);
        }
        Uri uriD = C35829k2.b(imageQ, y6.b(size.getWidth()), y6.b(size.getHeight()), 0.0f, 2, 44).d();
        if (uriD == null) {
            return;
        }
        C35987z1.f319133a.getClass();
        C42006d c42006d = new C42006d(new com.avito.android.gig_shift_action.ui.a(10, uriD, size));
        a aVar = new a();
        final V2 v22 = V2.f318762a;
        this.f283328e = (io.reactivex.rxjava3.internal.observers.m) c42006d.x(aVar, new l41.g() { // from class: com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.u.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        });
    }

    @Override // xw0.InterfaceC50015a
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f283327d.setOnClickListener(new A(16, aVar));
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.t
    public final void eH() {
        this.f283325b.setTag(SearchParamsConverterKt.SORT);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        io.reactivex.rxjava3.internal.observers.m mVar = this.f283328e;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.t
    public final void setSelected(boolean z12) {
        this.f283327d.setSelected(z12);
    }
}
