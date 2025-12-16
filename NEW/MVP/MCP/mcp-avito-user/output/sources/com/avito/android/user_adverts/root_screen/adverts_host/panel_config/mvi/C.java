package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi;

import GI0.a;
import HI0.a;
import II0.b;
import II0.d;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_config.item.PanelConfigItem;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PanelConfigReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/mvi/C;", "Lcom/avito/android/arch/mvi/u;", "LII0/b;", "LII0/d;", "<init>", "()V", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class C implements com.avito.android.arch.mvi.u<II0.b, II0.d> {

    /* compiled from: PanelConfigReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/mvi/C$a;", "", "<init>", "()V", "", "PANEL_CONFIG_CPX_BALANCE_ITEM_ID", "Ljava/lang/String;", "PANEL_CONFIG_JOB_ONBOARDING_ITEM_ID", "PANEL_CONFIG_LACK_ITEM_ID", "PANEL_CONFIG_LOADING_ITEM_ID_POSTFIX", "PANEL_CONFIG_PROMO_ITEM_ID", "PANEL_CONFIG_PUBLISH_BALANCE_ITEM_ID", "PANEL_CONFIG_SB_ONBOARDING_ITEM_ID", "PANEL_CONFIG_STATS_ITEM_ID", "PANEL_CONFIG_VAS_BALANCE_ITEM_ID", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Inject
    public C() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List<HI0.a>] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11, types: [HI0.a$d] */
    /* JADX WARN: Type inference failed for: r3v12, types: [HI0.a$c] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [HI0.a$b] */
    @Override // com.avito.android.arch.mvi.u
    public final II0.d a(II0.b bVar, II0.d dVar) {
        PanelConfigItem.a aVar;
        ?? arrayList;
        ?? dVar2;
        ArrayList arrayList2;
        PanelConfigItem.a aVar2;
        PanelConfigItem.a aVar3;
        PanelConfigItem.a aVar4;
        PanelConfigItem.a aVar5;
        II0.d dVar3;
        II0.b bVar2 = bVar;
        II0.d dVar4 = dVar;
        PanelConfigItem.a aVarA = null;
        aVarA = null;
        if (bVar2 instanceof b.a) {
            b.a aVar6 = (b.a) bVar2;
            dVar3 = new II0.d(null, new d.a.C0457a(aVar6.f8086a, aVar6.f8087b));
        } else {
            if (!(bVar2 instanceof b.C0455b)) {
                boolean z12 = bVar2 instanceof b.c;
                d.a aVarA2 = dVar4.f8103b;
                if (z12) {
                    if (aVarA2 instanceof d.a.b) {
                        kotlin.collections.builders.b bVar3 = ((d.a.b) aVarA2).f8117l;
                        arrayList = new ArrayList(C42745f0.q(bVar3, 10));
                        ListIterator listIterator = bVar3.listIterator(0);
                        while (listIterator.hasNext()) {
                            PanelConfigItem panelConfigItem = (PanelConfigItem) listIterator.next();
                            String str = panelConfigItem.getF7028b() + "-loading";
                            if (panelConfigItem instanceof PanelConfigItem.a) {
                                dVar2 = new a.b(str);
                            } else if (panelConfigItem instanceof PanelConfigItem.d) {
                                dVar2 = new a.c(str);
                            } else {
                                if (!(panelConfigItem instanceof PanelConfigItem.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2 = new a.d(str);
                            }
                            arrayList.add(dVar2);
                        }
                    } else {
                        arrayList = aVarA2 instanceof d.a.c ? ((d.a.c) aVarA2).f8118a : C42784z0.f406748b;
                    }
                    return II0.d.a(dVar4, new d.a.c(arrayList));
                }
                if (bVar2 instanceof b.i) {
                    d.a.b bVarA = II0.e.a(aVarA2);
                    if (bVarA != null) {
                        d.a.b bVarA2 = II0.e.a(aVarA2);
                        if (bVarA2 != null && (aVar = bVarA2.f8108c) != null) {
                            aVarA = PanelConfigItem.a.a(aVar);
                        }
                        aVarA2 = d.a.b.a(bVarA, aVarA, 2043);
                    }
                    return II0.d.a(dVar4, aVarA2);
                }
                if (bVar2 instanceof b.h) {
                    d.a.b bVarA3 = II0.e.a(aVarA2);
                    if (bVarA3 != null) {
                        aVarA2 = d.a.b.a(bVarA3, null, 1535);
                    }
                    return II0.d.a(dVar4, aVarA2);
                }
                if (bVar2 instanceof b.j) {
                    d.a.b bVarA4 = II0.e.a(aVarA2);
                    if (bVarA4 != null) {
                        aVarA2 = d.a.b.a(bVarA4, null, 1023);
                    }
                    return II0.d.a(dVar4, aVarA2);
                }
                if (bVar2 instanceof b.g) {
                    return new II0.d(null, null, 3, null);
                }
                if (bVar2 instanceof b.d ? true : bVar2 instanceof b.e ? true : bVar2 instanceof b.f) {
                    return dVar4;
                }
                throw new NoWhenBranchMatchedException();
            }
            b.C0455b c0455b = (b.C0455b) bVar2;
            GI0.a aVar7 = c0455b.f8088a;
            a.InterfaceC0341a.b<a.InterfaceC0341a.d> bVar4 = aVar7.f6420g;
            if (bVar4 != null) {
                ArrayList<a.InterfaceC0341a.d> arrayList3 = bVar4.f6431a;
                ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
                for (a.InterfaceC0341a.d dVar5 : arrayList3) {
                    String str2 = "panel-config-sb-onboarding-item-id-" + dVar5.hashCode();
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(dVar5.f6434a);
                    PrintableText printableTextF2 = com.avito.android.printable_text.b.f(dVar5.f6435b);
                    PanelConfigItem.Type type = PanelConfigItem.Type.f313292b;
                    arrayList4.add(new PanelConfigItem.e(str2, printableTextF, printableTextF2, dVar5.f6437d, dVar5.f6436c, dVar5.f6438e));
                }
                arrayList2 = arrayList4;
            } else {
                arrayList2 = null;
            }
            a.InterfaceC0341a.C0342a c0342a = aVar7.f6419f;
            if (c0342a != null) {
                PrintableText printableTextF3 = com.avito.android.printable_text.b.f(c0342a.f6426a);
                String str3 = c0342a.f6427b;
                if (str3 == null) {
                    str3 = "";
                }
                aVar2 = new PanelConfigItem.a("panel-config-balance-lack-item-id", PanelConfigItem.Type.f313295e, printableTextF3, com.avito.android.printable_text.b.f(str3), null, PanelCardItem.Style.f313697d, null, null, null, 0, new a.C9655a(R.drawable.img_user_adverts_panel_vas_plan), 960, null);
            } else {
                aVar2 = null;
            }
            a.InterfaceC0341a.C0342a c0342a2 = aVar7.f6416c;
            if (c0342a2 != null) {
                PrintableText printableTextF4 = com.avito.android.printable_text.b.f(c0342a2.f6426a);
                String str4 = c0342a2.f6427b;
                if (str4 == null) {
                    str4 = "";
                }
                aVar3 = new PanelConfigItem.a("panel-config-stats-item-id", PanelConfigItem.Type.f313292b, printableTextF4, com.avito.android.printable_text.b.f(str4), c0342a2.f6428c, PanelCardItem.Style.f313696c, c0455b.f8089b ? new PanelConfigItem.b.a(com.avito.android.printable_text.b.c(R.string.user_adverts_smb_onboarding_popup_text, new Serializable[0])) : null, null, null, 0, new a.C9655a(R.drawable.img_user_adverts_panel_stats), 896, null);
            } else {
                aVar3 = null;
            }
            a.InterfaceC0341a.C0342a c0342a3 = aVar7.f6417d;
            if (c0342a3 != null) {
                PrintableText printableTextF5 = com.avito.android.printable_text.b.f(c0342a3.f6426a);
                String str5 = c0342a3.f6427b;
                if (str5 == null) {
                    str5 = "";
                }
                aVar4 = new PanelConfigItem.a("panel-config-job-onboarding-item-id", PanelConfigItem.Type.f313293c, printableTextF5, com.avito.android.printable_text.b.f(str5), c0342a3.f6428c, PanelCardItem.Style.f313695b, null, null, null, 0, new a.b(c0342a3.f6429d), 960, null);
            } else {
                aVar4 = null;
            }
            a.InterfaceC0341a.C0342a c0342a4 = aVar7.f6418e;
            if (c0342a4 != null) {
                PrintableText printableTextF6 = com.avito.android.printable_text.b.f(c0342a4.f6426a);
                String str6 = c0342a4.f6427b;
                aVar5 = new PanelConfigItem.a("panel-config-promo-item-id", PanelConfigItem.Type.f313294d, printableTextF6, com.avito.android.printable_text.b.f(str6 != null ? str6 : ""), c0342a4.f6428c, PanelCardItem.Style.f313698e, null, c0342a4.f6430e, PanelCardItem.HyphenationFrequency.f313692c, 2, new a.b(c0342a4.f6429d));
            } else {
                aVar5 = null;
            }
            a.InterfaceC0341a.c cVar = aVar7.f6421h;
            PanelConfigItem.d dVar6 = cVar != null ? new PanelConfigItem.d("panel-config-publish-balance-item-id", PanelConfigItem.Type.f313297g, com.avito.android.printable_text.b.f(cVar.f6432a), com.avito.android.printable_text.b.f(cVar.f6433b)) : null;
            a.InterfaceC0341a.c cVar2 = aVar7.f6422i;
            PanelConfigItem.d dVar7 = cVar2 != null ? new PanelConfigItem.d("panel-config-vas-balance-item-id", PanelConfigItem.Type.f313298h, com.avito.android.printable_text.b.f(cVar2.f6432a), com.avito.android.printable_text.b.f(cVar2.f6433b)) : null;
            a.InterfaceC0341a.c cVar3 = aVar7.f6423j;
            dVar3 = new II0.d(aVar7, new d.a.b(arrayList2, aVar2, aVar3, aVar4, aVar7.f6424k, dVar6, dVar7, aVar5, cVar3 != null ? new PanelConfigItem.d("panel-config-cpx-balance-item-id", PanelConfigItem.Type.f313299i, com.avito.android.printable_text.b.f(cVar3.f6432a), com.avito.android.printable_text.b.f(cVar3.f6433b)) : null, c0455b.f8090c, aVar7.f6425l));
        }
        return dVar3;
    }
}
