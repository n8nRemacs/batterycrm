package com.avito.android.bbl.screens.configure.v4.mvi;

import Bh.C13148c;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.bbl.screens.configure.v4.mvi.entity.BblConfigureV4InternalAction;
import com.avito.android.error.z;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import lh.InterfaceC43770a;
import vh.C49328a;
import vh.C49329b;
import vh.C49330c;
import wZ.C49578b;
import wZ.C49582f;
import wZ.g;
import wZ.k;

/* compiled from: BblConfigureV4Reducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bbl/screens/configure/v4/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/bbl/screens/configure/v4/mvi/entity/BblConfigureV4InternalAction;", "LBh/c;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements u<BblConfigureV4InternalAction, C13148c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43770a f99512b;

    @Inject
    public l(@Y61.k InterfaceC43770a interfaceC43770a) {
        this.f99512b = interfaceC43770a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C13148c a(BblConfigureV4InternalAction bblConfigureV4InternalAction, C13148c c13148c) {
        ArrayList arrayList;
        AttributedText attributedText;
        wZ.g gVarA;
        C13148c.C0068c c0068c;
        C13148c.C0068c c0068c2;
        C13148c.C0068c c0068c3;
        C13148c.C0068c c0068c4;
        C13148c.C0068c c0068c5;
        C13148c.C0068c c0068c6;
        Object next;
        wZ.j jVar;
        C13148c.C0068c c0068c7;
        C13148c.C0068c c0068c8;
        C13148c.C0068c c0068c9;
        C13148c.C0068c c0068c10;
        C13148c.C0068c c0068c11;
        vh.e current;
        wZ.k kVarB;
        C13148c.b bVar;
        BblConfigureV4InternalAction bblConfigureV4InternalAction2 = bblConfigureV4InternalAction;
        C13148c c13148c2 = c13148c;
        if (bblConfigureV4InternalAction2 instanceof BblConfigureV4InternalAction.Error) {
            return C13148c.a(c13148c2, false, false, z.l(((BblConfigureV4InternalAction.Error) bblConfigureV4InternalAction2).f99494b), null, null, 249);
        }
        if (bblConfigureV4InternalAction2 instanceof BblConfigureV4InternalAction.Loading) {
            return C13148c.a(c13148c2, false, true, null, null, null, 249);
        }
        if (bblConfigureV4InternalAction2 instanceof BblConfigureV4InternalAction.PostSaveLoading) {
            return C13148c.a(c13148c2, ((BblConfigureV4InternalAction.PostSaveLoading) bblConfigureV4InternalAction2).f99499b, false, null, null, null, 254);
        }
        if (bblConfigureV4InternalAction2 instanceof BblConfigureV4InternalAction.HandleDeeplink) {
            return C13148c.a(c13148c2, false, false, null, null, null, 254);
        }
        boolean z12 = bblConfigureV4InternalAction2 instanceof BblConfigureV4InternalAction.Content;
        AttributedText attributedText2 = null;
        InterfaceC43770a interfaceC43770a = this.f99512b;
        if (!z12) {
            if (!(bblConfigureV4InternalAction2 instanceof BblConfigureV4InternalAction.OnSelectorCardClicked)) {
                return c13148c2;
            }
            List<C13148c.a> list = c13148c2.f1606h;
            if (list != null) {
                List<C13148c.a> list2 = list;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                int i12 = 0;
                for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
                    Object next2 = it.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    C13148c.a aVar = (C13148c.a) next2;
                    arrayList.add(new C13148c.a(aVar.f1608a, aVar.f1609b, aVar.f1610c, aVar.f1611d, i12 == ((BblConfigureV4InternalAction.OnSelectorCardClicked) bblConfigureV4InternalAction2).f99498b, aVar.f1613f, aVar.f1614g, aVar.f1615h, aVar.f1616i, aVar.f1617j));
                    i12 = i13;
                }
            } else {
                arrayList = null;
            }
            C13148c.a aVar2 = arrayList != null ? (C13148c.a) C42745f0.K(((BblConfigureV4InternalAction.OnSelectorCardClicked) bblConfigureV4InternalAction2).f99498b, arrayList) : null;
            C49582f c49582f = c13148c2.f1607i;
            C49582f c49582f2 = new C49582f((c49582f != null ? c49582f.f441555a : 0) + ((aVar2 == null || (c0068c6 = aVar2.f1608a) == null) ? 0 : (int) c0068c6.f1620a), (c49582f != null ? c49582f.f441556b : 0.0f) + ((aVar2 == null || (c0068c5 = aVar2.f1608a) == null) ? 0.0f : (float) c0068c5.f1622c), (aVar2 == null || (c0068c2 = aVar2.f1608a) == null) ? null : c0068c2.f1624e, (aVar2 == null || (c0068c4 = aVar2.f1608a) == null) ? null : c0068c4.f1621b, (aVar2 == null || (c0068c3 = aVar2.f1608a) == null) ? null : c0068c3.f1623d);
            wZ.g gVar = c13148c2.f1604f;
            if (gVar != null) {
                g.a aVar3 = gVar.f441560a;
                attributedText = null;
                gVarA = wZ.g.a(gVar, aVar3 != null ? g.a.a(aVar3, c49582f2) : null, null, 30);
            } else {
                attributedText = null;
                gVarA = null;
            }
            interfaceC43770a.b((aVar2 == null || (c0068c = aVar2.f1608a) == null) ? attributedText : c0068c.f1624e, c49582f2);
            return C13148c.a(c13148c2, false, false, null, gVarA, arrayList, 175);
        }
        C49328a c49328a = ((BblConfigureV4InternalAction.Content) bblConfigureV4InternalAction2).f99493b;
        AttributedText title = c49328a.getTitle();
        List<C49330c> listA = c49328a.a();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listA, 10));
        for (C49330c c49330c : listA) {
            vh.e bblDelta = c49330c.getBblDelta();
            long count = bblDelta.getCount();
            String icon = bblDelta.getIcon();
            double progress = bblDelta.getProgress();
            vh.f progressColor = bblDelta.getProgressColor();
            if (progressColor != null) {
                k.a aVar4 = wZ.k.f441571d;
                String valueName = progressColor.getValueName();
                String value = progressColor.getValue();
                String valueDark = progressColor.getValueDark();
                aVar4.getClass();
                kVarB = k.a.b(valueName, value, valueDark);
            } else {
                kVarB = null;
            }
            C13148c.C0068c c0068c12 = new C13148c.C0068c(count, icon, progress, kVarB, bblDelta.getText());
            String daysTitle = c49330c.getDaysTitle();
            String discountPricePercentage = c49330c.getDiscountPricePercentage();
            long id2 = c49330c.getId();
            boolean isSelected = c49330c.getIsSelected();
            String limitContactsTitle = c49330c.getLimitContactsTitle();
            String priceTitle = c49330c.getPriceTitle();
            vh.d promoteBadge = c49330c.getPromoteBadge();
            if (promoteBadge != null) {
                C49329b image = promoteBadge.getImage();
                bVar = new C13148c.b(new wZ.l(image.getValue(), image.getValueDark()), promoteBadge.getText());
            } else {
                bVar = null;
            }
            C49329b universalImage = c49330c.getUniversalImage();
            arrayList2.add(new C13148c.a(c0068c12, daysTitle, discountPricePercentage, id2, isSelected, limitContactsTitle, priceTitle, bVar, new wZ.l(universalImage.getValue(), universalImage.getValueDark()), c49330c.getWithoutDiscountPriceTitle()));
        }
        vh.h bblFooter = c49328a.getBblFooter();
        AttributedText terms = bblFooter.getTerms();
        C49578b c49578b = new C49578b(bblFooter.getButton().getTitle(), bblFooter.getButton().getUri(), bblFooter.getButton().getStyle(), null, 8, null);
        vh.g secondButton = bblFooter.getSecondButton();
        C49578b c49578b2 = secondButton != null ? new C49578b(secondButton.getTitle(), secondButton.getUri(), secondButton.getStyle(), null, 8, null) : null;
        vh.j contacts = bblFooter.getContacts();
        wZ.g gVar2 = new wZ.g(contacts != null ? new g.a(contacts.getText(), m.a(contacts.getCurrent())) : null, terms, c49578b, c49578b2, null, 16, null);
        vh.j contacts2 = c49328a.getBblFooter().getContacts();
        C49582f c49582fA = (contacts2 == null || (current = contacts2.getCurrent()) == null) ? null : m.a(current);
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((C13148c.a) next).f1612e) {
                break;
            }
        }
        C13148c.a aVar5 = (C13148c.a) next;
        if (aVar5 == null) {
            aVar5 = (C13148c.a) C42745f0.G(arrayList2);
        }
        C49582f c49582f3 = new C49582f((c49582fA != null ? c49582fA.f441555a : 0) + ((aVar5 == null || (c0068c11 = aVar5.f1608a) == null) ? 0 : (int) c0068c11.f1620a), (c49582fA != null ? c49582fA.f441556b : 0.0f) + ((aVar5 == null || (c0068c10 = aVar5.f1608a) == null) ? 0.0f : (float) c0068c10.f1622c), null, (aVar5 == null || (c0068c9 = aVar5.f1608a) == null) ? null : c0068c9.f1621b, (aVar5 == null || (c0068c8 = aVar5.f1608a) == null) ? null : c0068c8.f1623d, 4, null);
        g.a aVar6 = gVar2.f441560a;
        wZ.g gVarA2 = wZ.g.a(gVar2, aVar6 != null ? g.a.a(aVar6, c49582f3) : null, null, 30);
        vh.l navbar = c49328a.getNavbar();
        if (navbar != null) {
            vh.k button = navbar.getButton();
            C49578b c49578b3 = button != null ? new C49578b(button.getTitle(), button.getUri(), null, null, 12, null) : null;
            Double progress2 = navbar.getProgress();
            jVar = new wZ.j(progress2 != null ? Float.valueOf((float) progress2.doubleValue()) : null, c49578b3);
        } else {
            jVar = null;
        }
        if (aVar5 != null && (c0068c7 = aVar5.f1608a) != null) {
            attributedText2 = c0068c7.f1624e;
        }
        interfaceC43770a.clear();
        interfaceC43770a.b(attributedText2, c49582f3);
        return new C13148c(false, false, null, jVar, gVarA2, title, arrayList2, c49582fA);
    }
}
