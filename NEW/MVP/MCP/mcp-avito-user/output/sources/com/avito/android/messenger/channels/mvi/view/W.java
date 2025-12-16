package com.avito.android.messenger.channels.mvi.view;

import Fc1.D3;
import HY.e;
import HY.h;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelsListView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/bottom_sheet/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class W extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.bottom_sheet.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h.a.b f188718l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f188719m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(h.a.b bVar, H h12) {
        super(1);
        this.f188718l = bVar;
        this.f188719m = h12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.bottom_sheet.o oVar) {
        com.avito.android.lib.design.bottom_sheet.o oVar2 = oVar;
        Iterator it = this.f188718l.f7228a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            H h12 = this.f188719m;
            if (!zHasNext) {
                oVar2.R(new V(h12));
                oVar2.setOnCancelListener(new D3(h12, 13));
                com.avito.android.lib.util.g.a(oVar2);
                return G0.f406611a;
            }
            HY.e eVar = (HY.e) it.next();
            if (eVar instanceof e.a) {
                kotlin.reflect.n<Object>[] nVarArr = H.f188652K;
                com.avito.android.lib.design.bottom_sheet.o.W(oVar2, h12.e().getString(R.string.messenger_channels_list_menu_delete_channel), Integer.valueOf(R.drawable.ic_delete_new_24), null, null, null, new P(oVar2, h12, (e.a) eVar), 28);
            } else if (eVar instanceof e.b) {
                kotlin.reflect.n<Object>[] nVarArr2 = H.f188652K;
                com.avito.android.lib.design.bottom_sheet.o.W(oVar2, h12.e().getString(R.string.messenger_channels_list_menu_mark_as_read), Integer.valueOf(C35835l0.j(R.attr.ic_chatRead20, oVar2.getContext())), Integer.valueOf(C35835l0.d(R.attr.black, oVar2.getContext())), null, null, new Q(oVar2, h12, (e.b) eVar), 24);
            } else if (eVar instanceof e.c) {
                kotlin.reflect.n<Object>[] nVarArr3 = H.f188652K;
                com.avito.android.lib.design.bottom_sheet.o.W(oVar2, h12.e().getString(R.string.messenger_channels_list_menu_mark_as_unread), Integer.valueOf(C35835l0.j(R.attr.ic_chatUnread20, oVar2.getContext())), Integer.valueOf(C35835l0.d(R.attr.black, oVar2.getContext())), null, null, new S(oVar2, h12, (e.c) eVar), 24);
            } else if (eVar instanceof e.d) {
                kotlin.reflect.n<Object>[] nVarArr4 = H.f188652K;
                com.avito.android.lib.design.bottom_sheet.o.W(oVar2, h12.e().getString(R.string.messenger_channels_list_menu_pin), Integer.valueOf(R.drawable.ic_messenger_pin_solid_20), null, null, null, new T(oVar2, h12, (e.d) eVar), 28);
            } else if (eVar instanceof e.C0417e) {
                kotlin.reflect.n<Object>[] nVarArr5 = H.f188652K;
                com.avito.android.lib.design.bottom_sheet.o.W(oVar2, h12.e().getString(R.string.messenger_channels_list_menu_unpin), Integer.valueOf(R.drawable.ic_messenger_pin_off_solid_20), null, null, null, new U(oVar2, h12, (e.C0417e) eVar), 28);
            }
        }
    }
}
