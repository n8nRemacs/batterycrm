package com.avito.android.advert.item.short_term_rent.str_buttons;

import LV.c;
import VU.b;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.SimpleAction;
import com.avito.android.util.D6;
import com.avito.android.util.Y4;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsShortTermRentStrButtonsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/str_buttons/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/short_term_rent/str_buttons/k;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f80175b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f80176c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f80177d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f80178e;

    /* compiled from: AdvertDetailsShortTermRentStrButtonsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f80179l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SimpleAction f80180m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Uri, G0> lVar, SimpleAction simpleAction) {
            super(0);
            this.f80179l = (N) lVar;
            this.f80180m = simpleAction;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f80179l.invoke(this.f80180m.getUri());
            return G0.f406611a;
        }
    }

    public l(@Y61.k View view) {
        super(view);
        this.f80175b = view;
        this.f80176c = (Button) view.findViewById(R.id.primary_button);
        this.f80177d = (Button) view.findViewById(R.id.secondary_button);
        View viewFindViewById = view.findViewById(R.id.insights_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f80178e = (ViewGroup) viewFindViewById;
    }

    public final void B80(SimpleAction simpleAction, Button button, boolean z12, Y41.l<? super Uri, G0> lVar) {
        if (simpleAction == null) {
            D6.w(button);
            return;
        }
        String style = simpleAction.getStyle();
        if (style != null) {
            Y4.f318784a.getClass();
            int iA2 = Y4.a(style);
            b.a aVar = VU.b.f17147t;
            Context context = this.itemView.getContext();
            aVar.getClass();
            VU.b bVar = (VU.b) c.a.a(aVar, context, iA2);
            if (button != null) {
                button.setStyle(bVar);
            }
        }
        if (z12 && button != null) {
            v.a(button, y6.b(12));
        }
        if (button != null) {
            String title = simpleAction.getTitle();
            String subtitle = simpleAction.getSubtitle();
            if (subtitle == null) {
                subtitle = "";
            }
            button.setState(new UU.a(title, subtitle, false, false, false, new a(lVar, simpleAction), null, null, null, false, 988, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    @Override // com.avito.android.advert.item.short_term_rent.str_buttons.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(@Y61.k com.avito.android.advert.item.short_term_rent.entity.ShortTermRentStrButtons r17, boolean r18, @Y61.k Y41.l<? super android.net.Uri, kotlin.G0> r19) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.short_term_rent.str_buttons.l.LJ(com.avito.android.advert.item.short_term_rent.entity.ShortTermRentStrButtons, boolean, Y41.l):void");
    }

    @Override // com.avito.android.advert.item.short_term_rent.str_buttons.k
    public final int Vd() {
        int[] iArr = new int[2];
        Button button = this.f80176c;
        button.getLocationOnScreen(iArr);
        return button.getHeight() + iArr[1];
    }

    @Override // com.avito.android.advert.item.short_term_rent.str_buttons.k
    public final void hide() {
        D6.w(this.f80175b);
    }
}
