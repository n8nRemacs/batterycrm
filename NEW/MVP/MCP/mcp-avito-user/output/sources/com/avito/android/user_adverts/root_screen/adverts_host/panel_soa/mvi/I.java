package com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.mvi;

import LI0.a;
import MI0.b;
import MI0.d;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.a;
import java.io.Serializable;
import java.text.Format;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: PanelSoaReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/mvi/I;", "Lcom/avito/android/arch/mvi/u;", "LMI0/b;", "LMI0/d;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class I implements com.avito.android.arch.mvi.u<MI0.b, MI0.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.g f313512b;

    /* compiled from: PanelSoaReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_soa/mvi/I$a;", "", "<init>", "()V", "", "PANEL_SOA_ITEM_ID", "Ljava/lang/String;", "PANEL_SOA_LOADING_ITEM_ID", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public I(@Y61.k com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.g gVar) {
        this.f313512b = gVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final MI0.d a(MI0.b bVar, MI0.d dVar) {
        MI0.b bVar2 = bVar;
        MI0.d dVar2 = dVar;
        if (bVar2 instanceof b.a) {
            b.a aVar = (b.a) bVar2;
            return MI0.d.a(dVar2, new KI0.b(null, null, 3, null), null, new d.a.b(aVar.f10556a, aVar.f10557b), 2);
        }
        if (bVar2 instanceof b.C0671b) {
            return b((b.C0671b) bVar2, dVar2);
        }
        boolean z12 = bVar2 instanceof b.c;
        d.a cVar = dVar2.f10579c;
        if (z12) {
            return MI0.d.a(dVar2, new KI0.b(null, null, 3, null), null, new d.a.C0673d(cVar instanceof d.a.c ? new LI0.b() : cVar instanceof d.a.C0673d ? ((d.a.C0673d) cVar).f10584a : null), 2);
        }
        if (bVar2 instanceof b.j) {
            if (cVar instanceof d.a.C0673d) {
                cVar = b(new b.C0671b(dVar2.f10577a, false), dVar2).f10579c;
            } else if (cVar instanceof d.a.c) {
                cVar = new d.a.c(LI0.a.a(((d.a.c) cVar).f10583a, 247));
            }
            return MI0.d.a(dVar2, null, null, cVar, 3);
        }
        if (bVar2 instanceof b.k) {
            b.k kVar = (b.k) bVar2;
            return MI0.d.a(dVar2, null, null, cVar instanceof d.a.c ? new d.a.c(LI0.a.a(((d.a.c) cVar).f10583a, 247)) : new d.a.b(kVar.f10569a, kVar.f10570b), 3);
        }
        if (bVar2 instanceof b.l) {
            b.l lVar = (b.l) bVar2;
            return b(new b.C0671b(lVar.f10571a, lVar.f10572b), dVar2);
        }
        if (bVar2 instanceof b.m) {
            return MI0.d.a(dVar2, null, null, new d.a.C0673d(new LI0.b()), 3);
        }
        if (bVar2 instanceof b.g) {
            return MI0.d.a(dVar2, null, ((b.g) bVar2).f10565a, null, 5);
        }
        if (bVar2 instanceof b.i) {
            if (cVar instanceof d.a.c) {
                cVar = new d.a.c(LI0.a.a(((d.a.c) cVar).f10583a, 223));
            }
            return MI0.d.a(dVar2, null, null, cVar, 3);
        }
        if (bVar2 instanceof b.h) {
            return new MI0.d(null, null, null, 7, null);
        }
        if (bVar2 instanceof b.d ? true : bVar2 instanceof b.f ? true : bVar2 instanceof b.e) {
            return dVar2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.C] */
    public final MI0.d b(b.C0671b c0671b, MI0.d dVar) throws NumberFormatException {
        PrintableText printableTextC;
        KI0.b bVar = c0671b.f10558a;
        if (bVar.f9388a.length() == 0 || bVar.f9389b.length() == 0) {
            return MI0.d.a(dVar, new KI0.b(null, null, 3, null), null, d.a.C0672a.f10580a, 2);
        }
        KI0.b bVar2 = c0671b.f10558a;
        String str = bVar2.f9388a;
        com.avito.android.user_adverts.root_screen.adverts_host.panel_soa.domain.g gVar = this.f313512b;
        gVar.getClass();
        if (str.length() == 0) {
            printableTextC = com.avito.android.printable_text.b.a();
        } else {
            int i12 = 0;
            while (true) {
                int length = str.length();
                String str2 = bVar2.f9389b;
                if (i12 >= length) {
                    double d12 = Double.parseDouble(str);
                    printableTextC = d12 >= 1.0E9d ? com.avito.android.printable_text.b.c(R.string.user_adverts_soa_value_currency_billion_pair_text, ((Format) gVar.f313470b.getValue()).format(Double.valueOf(((long) d12) / 1.0E9d)), str2) : com.avito.android.printable_text.b.c(R.string.user_adverts_soa_value_currency_pair_text, ((Format) gVar.f313469a.getValue()).format(Double.valueOf(d12)), str2);
                } else {
                    if (!Character.isDigit(str.charAt(i12))) {
                        printableTextC = com.avito.android.printable_text.b.c(R.string.user_adverts_soa_value_currency_pair_text, str, str2);
                        break;
                    }
                    i12++;
                }
            }
        }
        PrintableText printableText = printableTextC;
        PrintableText printableTextC2 = com.avito.android.printable_text.b.c(R.string.user_adverts_soa_short_text, new Serializable[0]);
        a.C0610a c0610a = c0671b.f10559b ? new a.C0610a(com.avito.android.printable_text.b.c(R.string.user_adverts_soa_onboarding_popup_text, new Serializable[0])) : null;
        a.C9655a c9655a = new a.C9655a(R.drawable.img_user_adverts_panel_soa);
        PanelCardItem.Style style = PanelCardItem.Style.f313695b;
        return MI0.d.a(dVar, bVar2, null, new d.a.c(new LI0.a(printableText, printableTextC2, false, c0610a, c9655a)), 2);
    }
}
