package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view;

import Y41.l;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tooltip.k;
import com.avito.android.lib.design.tooltip.o;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAdvertsSearchView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements l<o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f312830l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f312831m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, k kVar) {
        super(1);
        this.f312830l = hVar;
        this.f312831m = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(o oVar) {
        o oVar2 = oVar;
        oVar2.h(R.string.user_adverts_filters_stat_vas_tooltip_title);
        oVar2.a(R.string.user_adverts_filters_stat_vas_tooltip_desc);
        Button button = oVar2.f181255d;
        if (button != null) {
            button.setText(R.string.user_adverts_filters_tooltip_btn);
        }
        D6.G(button, true);
        oVar2.c(new com.avito.android.tariff.cpx.configure.levels.d(16, this.f312830l, this.f312831m));
        return G0.f406611a;
    }
}
