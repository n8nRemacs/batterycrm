package hc1;

import Y61.k;
import Y61.l;
import gc1.C40657a;
import gc1.C40659c;
import gc1.C40660d;
import gc1.InterfaceC40658b;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"SberIdSDK_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: hc1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C40914a {
    @l
    public static final InterfaceC40658b a(@k C40659c c40659c, @k InterfaceC40658b interfaceC40658b, @k String str) {
        if (interfaceC40658b instanceof InterfaceC40658b.c) {
            InterfaceC40658b.c cVar = (InterfaceC40658b.c) interfaceC40658b;
            String icon = c40659c.getIcon();
            if (icon == null) {
                icon = cVar.f396503b;
            }
            String str2 = icon;
            String title = c40659c.getTitle();
            if (title == null) {
                title = cVar.f396502a;
            }
            String str3 = title;
            C40657a click = c40659c.getClick();
            if (click == null && (click = c40659c.getValueClick()) == null) {
                click = cVar.f396504c;
            }
            C40657a c40657a = click;
            String elementName = c40659c.getElementName();
            if (elementName == null) {
                elementName = cVar.f396506e;
            }
            String str4 = elementName;
            List<C40660d> listS = c40659c.s();
            return new InterfaceC40658b.c(str3, str2, c40657a, str, str4, null, listS != null ? b.a(listS) : cVar.f396508g, 32, null);
        }
        if (interfaceC40658b instanceof InterfaceC40658b.d) {
            InterfaceC40658b.d dVar = (InterfaceC40658b.d) interfaceC40658b;
            String title2 = c40659c.getTitle();
            if (title2 == null) {
                title2 = dVar.f396510a;
            }
            String str5 = title2;
            String icon2 = c40659c.getIcon();
            if (icon2 == null) {
                icon2 = dVar.f396511b;
            }
            String str6 = icon2;
            C40657a click2 = c40659c.getClick();
            if (click2 == null && (click2 = c40659c.getValueClick()) == null) {
                click2 = dVar.f396512c;
            }
            C40657a c40657a2 = click2;
            String elementName2 = c40659c.getElementName();
            if (elementName2 == null) {
                elementName2 = dVar.f396514e;
            }
            String str7 = elementName2;
            List<C40660d> listS2 = c40659c.s();
            return new InterfaceC40658b.d(str5, str6, c40657a2, str, str7, null, listS2 != null ? b.a(listS2) : dVar.f396516g, 32, null);
        }
        if (interfaceC40658b instanceof InterfaceC40658b.e) {
            InterfaceC40658b.e eVar = (InterfaceC40658b.e) interfaceC40658b;
            String title3 = c40659c.getTitle();
            if (title3 == null) {
                title3 = eVar.f396518a;
            }
            String str8 = title3;
            String description = c40659c.getDescription();
            if (description == null) {
                description = eVar.f396519b;
            }
            String str9 = description;
            String titleIcon = c40659c.getTitleIcon();
            if (titleIcon == null) {
                titleIcon = eVar.f396520c;
            }
            String str10 = titleIcon;
            List<String> listK = c40659c.k();
            if (listK == null) {
                listK = eVar.f396521d;
            }
            List<String> list = listK;
            String value = c40659c.getValue();
            if (value == null) {
                value = eVar.f396522e;
            }
            String str11 = value;
            String currency = c40659c.getCurrency();
            if (currency == null) {
                currency = eVar.f396523f;
            }
            String str12 = currency;
            String valueCurrency = c40659c.getValueCurrency();
            if (valueCurrency == null) {
                valueCurrency = eVar.f396524g;
            }
            String str13 = valueCurrency;
            String buttonTitle = c40659c.getButtonTitle();
            if (buttonTitle == null) {
                buttonTitle = eVar.f396525h;
            }
            String str14 = buttonTitle;
            C40657a click3 = c40659c.getClick();
            if (click3 == null && (click3 = c40659c.getValueClick()) == null) {
                click3 = eVar.f396526i;
            }
            C40657a c40657a3 = click3;
            String widgetName = c40659c.getWidgetName();
            if (widgetName == null) {
                widgetName = eVar.f396529l;
            }
            String str15 = widgetName;
            String elementName3 = c40659c.getElementName();
            if (elementName3 == null) {
                elementName3 = eVar.f396528k;
            }
            String str16 = elementName3;
            List<C40660d> listS3 = c40659c.s();
            return new InterfaceC40658b.e(str8, str9, str10, list, str11, str12, str13, str14, c40657a3, str, str16, str15, listS3 != null ? b.a(listS3) : eVar.f396530m);
        }
        if (interfaceC40658b instanceof InterfaceC40658b.i) {
            InterfaceC40658b.i iVar = (InterfaceC40658b.i) interfaceC40658b;
            String title4 = c40659c.getTitle();
            if (title4 == null) {
                title4 = iVar.f396557a;
            }
            String str17 = title4;
            String icon3 = c40659c.getIcon();
            if (icon3 == null) {
                icon3 = iVar.f396558b;
            }
            String str18 = icon3;
            String elementName4 = c40659c.getElementName();
            if (elementName4 == null) {
                elementName4 = iVar.f396560d;
            }
            String str19 = elementName4;
            List<C40660d> listS4 = c40659c.s();
            return new InterfaceC40658b.i(str17, str18, str, str19, null, listS4 != null ? b.a(listS4) : iVar.f396562f, 16, null);
        }
        if (interfaceC40658b instanceof InterfaceC40658b.l) {
            InterfaceC40658b.l lVar = (InterfaceC40658b.l) interfaceC40658b;
            String title5 = c40659c.getTitle();
            if (title5 == null) {
                title5 = lVar.f396582a;
            }
            String str20 = title5;
            String icon4 = c40659c.getIcon();
            if (icon4 == null) {
                icon4 = lVar.f396583b;
            }
            String str21 = icon4;
            String elementName5 = c40659c.getElementName();
            if (elementName5 == null) {
                elementName5 = lVar.f396585d;
            }
            String str22 = elementName5;
            List<C40660d> listS5 = c40659c.s();
            return new InterfaceC40658b.l(str20, str21, str, str22, null, listS5 != null ? b.a(listS5) : lVar.f396587f, 16, null);
        }
        if (interfaceC40658b instanceof InterfaceC40658b.n) {
            InterfaceC40658b.n nVar = (InterfaceC40658b.n) interfaceC40658b;
            String title6 = c40659c.getTitle();
            if (title6 == null) {
                title6 = nVar.f396596a;
            }
            String str23 = title6;
            String icon5 = c40659c.getIcon();
            if (icon5 == null) {
                icon5 = nVar.f396597b;
            }
            String str24 = icon5;
            String divider = c40659c.getDivider();
            if (divider == null) {
                divider = nVar.f396598c;
            }
            String str25 = divider;
            String elementName6 = c40659c.getElementName();
            if (elementName6 == null) {
                elementName6 = nVar.f396600e;
            }
            String str26 = elementName6;
            List<C40660d> listS6 = c40659c.s();
            return new InterfaceC40658b.n(str23, str24, str25, str, str26, null, listS6 != null ? b.a(listS6) : nVar.f396602g, 32, null);
        }
        if (interfaceC40658b instanceof InterfaceC40658b.o) {
            InterfaceC40658b.o oVar = (InterfaceC40658b.o) interfaceC40658b;
            String title7 = c40659c.getTitle();
            if (title7 == null) {
                title7 = oVar.f396604a;
            }
            String str27 = title7;
            String icon6 = c40659c.getIcon();
            if (icon6 == null) {
                icon6 = oVar.f396605b;
            }
            String str28 = icon6;
            String badge = c40659c.getBadge();
            if (badge == null) {
                badge = oVar.f396606c;
            }
            String str29 = badge;
            Integer iconSize = c40659c.getIconSize();
            if (iconSize == null) {
                iconSize = oVar.f396607d;
            }
            Integer num = iconSize;
            String initials = c40659c.getInitials();
            if (initials == null) {
                initials = oVar.f396608e;
            }
            String str30 = initials;
            String value2 = c40659c.getValue();
            if (value2 == null) {
                value2 = oVar.f396609f;
            }
            String str31 = value2;
            C40657a click4 = c40659c.getClick();
            if (click4 == null && (click4 = c40659c.getValueClick()) == null) {
                click4 = oVar.f396610g;
            }
            C40657a c40657a4 = click4;
            String elementName7 = c40659c.getElementName();
            if (elementName7 == null) {
                elementName7 = oVar.f396612i;
            }
            String str32 = elementName7;
            List<C40660d> listS7 = c40659c.s();
            return new InterfaceC40658b.o(str27, str28, str29, num, str30, str31, c40657a4, str, str32, null, listS7 != null ? b.a(listS7) : oVar.f396614k, 512, null);
        }
        if (interfaceC40658b instanceof InterfaceC40658b.j) {
            InterfaceC40658b.j jVar = (InterfaceC40658b.j) interfaceC40658b;
            String icon7 = c40659c.getIcon();
            if (icon7 == null) {
                icon7 = jVar.f396565b;
            }
            String str33 = icon7;
            String value3 = c40659c.getValue();
            if (value3 == null) {
                value3 = jVar.f396564a;
            }
            String str34 = value3;
            C40657a click5 = c40659c.getClick();
            if (click5 == null && (click5 = c40659c.getValueClick()) == null) {
                click5 = jVar.f396566c;
            }
            C40657a c40657a5 = click5;
            String elementName8 = c40659c.getElementName();
            if (elementName8 == null) {
                elementName8 = jVar.f396568e;
            }
            String str35 = elementName8;
            List<C40660d> listS8 = c40659c.s();
            return new InterfaceC40658b.j(str34, str33, c40657a5, str, str35, null, listS8 != null ? b.a(listS8) : jVar.f396570g, 32, null);
        }
        if (interfaceC40658b instanceof InterfaceC40658b.h) {
            InterfaceC40658b.h hVar = (InterfaceC40658b.h) interfaceC40658b;
            String title8 = c40659c.getTitle();
            if (title8 == null) {
                title8 = hVar.f396550a;
            }
            String str36 = title8;
            String icon8 = c40659c.getIcon();
            if (icon8 == null) {
                icon8 = hVar.f396551b;
            }
            String str37 = icon8;
            String elementName9 = c40659c.getElementName();
            if (elementName9 == null) {
                elementName9 = hVar.f396553d;
            }
            String str38 = elementName9;
            List<C40660d> listS9 = c40659c.s();
            return new InterfaceC40658b.h(str36, str37, str, str38, null, listS9 != null ? b.a(listS9) : hVar.f396555f, 16, null);
        }
        if (interfaceC40658b instanceof InterfaceC40658b.g) {
            InterfaceC40658b.g gVar = (InterfaceC40658b.g) interfaceC40658b;
            String title9 = c40659c.getTitle();
            if (title9 == null) {
                title9 = gVar.f396541a;
            }
            String str39 = title9;
            String icon9 = c40659c.getIcon();
            if (icon9 == null) {
                icon9 = gVar.f396542b;
            }
            String str40 = icon9;
            C40657a click6 = c40659c.getClick();
            if (click6 == null && (click6 = c40659c.getValueClick()) == null) {
                click6 = gVar.f396544d;
            }
            C40657a c40657a6 = click6;
            Boolean isPaint = c40659c.getIsPaint();
            boolean zBooleanValue = isPaint != null ? isPaint.booleanValue() : gVar.f396543c;
            String elementName10 = c40659c.getElementName();
            if (elementName10 == null) {
                elementName10 = gVar.f396546f;
            }
            String str41 = elementName10;
            List<C40660d> listS10 = c40659c.s();
            return new InterfaceC40658b.g(str39, str40, zBooleanValue, c40657a6, str, str41, null, listS10 != null ? b.a(listS10) : gVar.f396548h, 64, null);
        }
        if (interfaceC40658b instanceof InterfaceC40658b.f) {
            InterfaceC40658b.f fVar = (InterfaceC40658b.f) interfaceC40658b;
            String title10 = c40659c.getTitle();
            if (title10 == null) {
                title10 = fVar.f396532a;
            }
            String str42 = title10;
            String description2 = c40659c.getDescription();
            if (description2 == null) {
                description2 = fVar.f396534c;
            }
            String str43 = description2;
            String titleIcon2 = c40659c.getTitleIcon();
            if (titleIcon2 == null) {
                titleIcon2 = fVar.f396533b;
            }
            String str44 = titleIcon2;
            C40657a click7 = c40659c.getClick();
            if (click7 == null && (click7 = c40659c.getValueClick()) == null) {
                click7 = fVar.f396535d;
            }
            C40657a c40657a7 = click7;
            String elementName11 = c40659c.getElementName();
            if (elementName11 == null) {
                elementName11 = fVar.f396537f;
            }
            String str45 = elementName11;
            List<C40660d> listS11 = c40659c.s();
            return new InterfaceC40658b.f(str42, str44, str43, c40657a7, str, str45, null, listS11 != null ? b.a(listS11) : fVar.f396539h, 64, null);
        }
        if (!(interfaceC40658b instanceof InterfaceC40658b.p)) {
            if ((interfaceC40658b instanceof InterfaceC40658b.k) || (interfaceC40658b instanceof InterfaceC40658b.m)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC40658b.p pVar = (InterfaceC40658b.p) interfaceC40658b;
        String title11 = c40659c.getTitle();
        if (title11 == null) {
            title11 = pVar.f396616a;
        }
        String str46 = title11;
        String icon10 = c40659c.getIcon();
        if (icon10 == null) {
            icon10 = pVar.f396617b;
        }
        String str47 = icon10;
        String badge2 = c40659c.getBadge();
        if (badge2 == null) {
            badge2 = pVar.f396618c;
        }
        String str48 = badge2;
        Integer iconSize2 = c40659c.getIconSize();
        if (iconSize2 == null) {
            iconSize2 = pVar.f396619d;
        }
        Integer num2 = iconSize2;
        String initials2 = c40659c.getInitials();
        if (initials2 == null) {
            initials2 = pVar.f396620e;
        }
        String str49 = initials2;
        String value4 = c40659c.getValue();
        if (value4 == null) {
            value4 = pVar.f396621f;
        }
        String str50 = value4;
        C40657a click8 = c40659c.getClick();
        if (click8 == null && (click8 = c40659c.getValueClick()) == null) {
            click8 = pVar.f396623h;
        }
        C40657a c40657a8 = click8;
        Integer space = c40659c.getSpace();
        if (space == null) {
            space = pVar.f396622g;
        }
        Integer num3 = space;
        String elementName12 = c40659c.getElementName();
        if (elementName12 == null) {
            elementName12 = pVar.f396625j;
        }
        String str51 = elementName12;
        List<C40660d> listS12 = c40659c.s();
        return new InterfaceC40658b.p(str46, str47, str48, num2, str49, str50, num3, c40657a8, str, str51, null, listS12 != null ? b.a(listS12) : pVar.f396627l, 1024, null);
    }
}
