package com.avito.android.messenger.conversation.mvi.menu;

import Fc1.D3;
import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.menu.t;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelMenuView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/bottom_sheet/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class H extends N implements Y41.l<com.avito.android.lib.design.bottom_sheet.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f191418l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t.e.c f191419m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(u uVar, t.e.c cVar) {
        super(1);
        this.f191418l = uVar;
        this.f191419m = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.bottom_sheet.o oVar) {
        String string;
        com.avito.android.lib.design.bottom_sheet.o oVar2 = oVar;
        u uVar = this.f191418l;
        oVar2.S(uVar.f191542j);
        t.e.c cVar = this.f191419m;
        t.b bVar = cVar.f191530a;
        t.d dVarC = bVar.f191505a.c();
        if (dVarC instanceof t.d.c) {
            t.d.c cVar2 = (t.d.c) dVarC;
            String str = cVar2.f191525d;
            if (str != null && str.length() != 0) {
                com.avito.android.lib.design.bottom_sheet.o.V(oVar2, new z((t.d.c) dVarC));
            }
            if (cVar2.f191526e != null) {
                oVar2.X(new A((t.d.c) dVarC));
            }
            Action action = cVar2.f191523b;
            if (action == null || (string = action.getTitle()) == null) {
                string = oVar2.getContext().getString(R.string.messenger_chat_menu_profile);
            }
            Image image = cVar2.f191522a;
            com.avito.android.lib.design.bottom_sheet.o.W(oVar2, string, null, null, image != null ? com.avito.android.image_loader.b.b(image) : null, null, new B((t.d.c) dVarC, oVar2, uVar), 22);
        } else if (dVarC instanceof t.d.a) {
            t.d.a aVar = (t.d.a) dVarC;
            String str2 = aVar.f191516a;
            if (str2 != null && str2.length() != 0) {
                com.avito.android.lib.design.bottom_sheet.o.V(oVar2, new C((t.d.a) dVarC));
            }
            if (aVar.f191517b != null) {
                oVar2.X(new D((t.d.a) dVarC));
            }
        } else if (dVarC instanceof t.d.b) {
            t.d.b bVar2 = (t.d.b) dVarC;
            String str3 = bVar2.f191520c;
            if (str3 == null || str3.length() == 0) {
                String str4 = bVar2.f191518a;
                if (str4 != null && str4.length() != 0) {
                    com.avito.android.lib.design.bottom_sheet.o.V(oVar2, new F((t.d.b) dVarC));
                }
            } else {
                com.avito.android.lib.design.bottom_sheet.o.V(oVar2, new E((t.d.b) dVarC));
            }
            if (bVar2.f191521d != null) {
                oVar2.X(new G((t.d.b) dVarC));
            } else {
                String str5 = bVar2.f191519b;
                if (str5 != null && str5.length() != 0) {
                    oVar2.X(new w((t.d.b) dVarC));
                }
            }
        }
        int i12 = 0;
        for (Object obj : bVar.f191506b) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            t.c cVar3 = (t.c) obj;
            com.avito.android.lib.design.bottom_sheet.o.W(oVar2, cVar3.f191510a, cVar3.f191511b, null, null, cVar3.f191514e, new y(oVar2, cVar3, this.f191418l, cVar, i12), 12);
            i12 = i13;
        }
        oVar2.R(cVar.f191532c);
        oVar2.setOnCancelListener(new D3(cVar, 14));
        com.avito.android.lib.util.g.a(oVar2);
        return G0.f406611a;
    }
}
