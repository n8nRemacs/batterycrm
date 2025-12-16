package com.avito.android.messenger.channels.mvi.view;

import FY.c;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.authorization.AuthSource;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.util.L5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ChannelsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFY/c;", "event", "Lkotlin/G0;", "invoke", "(LFY/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.view.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31875d extends kotlin.jvm.internal.N implements Y41.l<FY.c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ChannelsFragment f188741l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31875d(ChannelsFragment channelsFragment) {
        super(1);
        this.f188741l = channelsFragment;
    }

    @Override // Y41.l
    public final G0 invoke(FY.c cVar) throws Resources.NotFoundException {
        Toolbar toolbar;
        FY.c cVar2 = cVar;
        boolean zEquals = cVar2.equals(c.a.f4764a);
        ChannelsFragment channelsFragment = this.f188741l;
        if (zEquals) {
            com.avito.android.messenger.channels.b bVar = channelsFragment.f188606L0;
            if (bVar == null) {
                bVar = null;
            }
            bVar.getClass();
            bVar.f187142a.startActivity(bVar.f187143b.a(AuthSource.f92712l));
        } else if (cVar2.equals(c.b.f4765a) && (toolbar = channelsFragment.f188604J0) != null) {
            ArrayList<View> arrayList = new ArrayList<>();
            toolbar.findViewsWithText(arrayList, channelsFragment.getResources().getString(R.string.action_overflow_menu_content_description), 2);
            View view = (View) C42745f0.G(arrayList);
            String string = channelsFragment.getResources().getString(R.string.messenger_blacklist_popup_message);
            if (view != null) {
                com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(toolbar.getContext(), 0, 0, 6, null);
                int i12 = kVar.f181229o;
                kVar.f181228n = -2;
                kVar.f181229o = i12;
                i.b bVar2 = new i.b(new b.C5327b());
                bVar2.f181210c = Integer.valueOf(y6.b(8));
                r.a aVar = new r.a(bVar2);
                aVar.m(y6.b(0));
                aVar.j(y6.b(-6));
                kVar.f181224j = aVar;
                com.avito.android.lib.design.tooltip.p.a(kVar, new C31878g(string));
                kVar.f(view);
            } else {
                Context context = channelsFragment.getContext();
                if (context != null) {
                    L5.b(context, string, 0);
                }
            }
        }
        return G0.f406611a;
    }
}
