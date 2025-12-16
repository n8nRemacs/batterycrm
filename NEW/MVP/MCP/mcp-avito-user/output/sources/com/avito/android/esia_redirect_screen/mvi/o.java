package com.avito.android.esia_redirect_screen.mvi;

import Iz.AbstractC14178c;
import Iz.C14177b;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.esia_redirect_screen.buttons_list.link_item.EsiaRedirectButtonsLinkItem;
import com.avito.android.esia_redirect_screen.buttons_list.primary_item.EsiaRedirectButtonsPrimaryItem;
import com.avito.android.esia_redirect_screen.buttons_list.secondary_item.EsiaRedirectButtonsSecondaryItem;
import com.avito.android.esia_redirect_screen.content_list.logo_item.EsiaRedirectContentLogoItem;
import com.avito.android.esia_redirect_screen.content_list.requirement_item.EsiaRedirectContentRequirementItem;
import com.avito.android.esia_redirect_screen.content_list.title_item.EsiaRedirectContentTitleItem;
import com.avito.android.esia_redirect_screen.models.EsiaRedirectButtonType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: EsiaRedirectReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/esia_redirect_screen/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "LIz/c;", "LIz/e;", "<init>", "()V", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements u<AbstractC14178c, Iz.e> {

    /* compiled from: EsiaRedirectReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[EsiaRedirectButtonType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EsiaRedirectButtonType esiaRedirectButtonType = EsiaRedirectButtonType.f148051b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EsiaRedirectButtonType esiaRedirectButtonType2 = EsiaRedirectButtonType.f148051b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Iz.e a(AbstractC14178c abstractC14178c, Iz.e eVar) {
        com.avito.conveyor_item.a esiaRedirectButtonsPrimaryItem;
        AbstractC14178c abstractC14178c2 = abstractC14178c;
        Iz.e eVar2 = eVar;
        if (!(abstractC14178c2 instanceof AbstractC14178c.b)) {
            return abstractC14178c2 instanceof AbstractC14178c.C0498c ? Iz.e.a(eVar2, false, true, false) : abstractC14178c2 instanceof AbstractC14178c.e ? Iz.e.a(eVar2, false, false, true) : abstractC14178c2 instanceof AbstractC14178c.d ? Iz.e.a(eVar2, true, false, false) : eVar2;
        }
        AbstractC14178c.b bVar = (AbstractC14178c.b) abstractC14178c2;
        List<String> list = bVar.f8676c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new EsiaRedirectContentRequirementItem((String) it.next(), null, 2, null));
        }
        ArrayList arrayListE0 = C42745f0.e0(new EsiaRedirectContentLogoItem(bVar.f8675b, null, 2, null), new EsiaRedirectContentTitleItem(bVar.f8674a, null, 2, null));
        arrayListE0.addAll(arrayList);
        ArrayList<C14177b> arrayList2 = bVar.f8677d;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        for (C14177b c14177b : arrayList2) {
            int iOrdinal = c14177b.f8672c.ordinal();
            if (iOrdinal == 0) {
                esiaRedirectButtonsPrimaryItem = new EsiaRedirectButtonsPrimaryItem(c14177b.f8670a, null, c14177b.f8671b, 2, null);
            } else if (iOrdinal == 1) {
                esiaRedirectButtonsPrimaryItem = new EsiaRedirectButtonsSecondaryItem(c14177b.f8670a, null, c14177b.f8671b, 2, null);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                esiaRedirectButtonsPrimaryItem = new EsiaRedirectButtonsLinkItem(c14177b.f8670a, null, c14177b.f8671b, 2, null);
            }
            arrayList3.add(esiaRedirectButtonsPrimaryItem);
        }
        DeepLink deepLink = bVar.f8678e;
        return new Iz.e(arrayListE0, arrayList3, deepLink, eVar2.f8686d, deepLink != null, true, false, false, false);
    }
}
