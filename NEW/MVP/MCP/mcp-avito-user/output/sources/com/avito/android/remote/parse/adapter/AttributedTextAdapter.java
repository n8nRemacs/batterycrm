package com.avito.android.remote.parse.adapter;

import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.BadgeAttribute;
import com.avito.android.remote.model.text.BulletAttribute;
import com.avito.android.remote.model.text.DateAttribute;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.remote.model.text.ParametersAttribute;
import com.avito.android.remote.model.text.SpacerAttribute;
import com.avito.android.remote.model.text.TextAlignment;
import com.avito.android.remote.model.text.TextIconAttribute;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.text.UnknownAttribute;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AttributedTextAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/parse/adapter/AttributedTextAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/google/gson/o;", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AttributedTextAdapter implements com.google.gson.h<AttributedText>, com.google.gson.o<AttributedText> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f254156a;

    /* JADX WARN: Multi-variable type inference failed */
    public AttributedTextAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static com.google.gson.k c(FontParameter fontParameter, com.google.gson.n nVar) {
        com.google.gson.k kVar = new com.google.gson.k();
        if (fontParameter instanceof FontParameter.ColorParameter) {
            kVar.y("type", "fontColor");
            FontParameter.ColorParameter colorParameter = (FontParameter.ColorParameter) fontParameter;
            kVar.t("value", nVar.a(colorParameter.getColor(), Color.class));
            kVar.y("valueName", colorParameter.getColorKey());
            kVar.t("valueDark", nVar.a(colorParameter.getColorDark(), Color.class));
        } else if (fontParameter instanceof FontParameter.StyleParameter) {
            kVar.y("type", "fontStyle");
            kVar.y("value", ((FontParameter.StyleParameter) fontParameter).getStyle());
        } else if (fontParameter instanceof FontParameter.StrikethroughParameter) {
            kVar.y("type", "strikeThrough");
            kVar.y("value", "");
        } else if (fontParameter instanceof FontParameter.TextStyleParameter) {
            kVar.y("type", "textStyle");
            FontParameter.TextStyleParameter textStyleParameter = (FontParameter.TextStyleParameter) fontParameter;
            kVar.y(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, textStyleParameter.getStyle());
            kVar.y("value", textStyleParameter.getAttribute());
        } else if (fontParameter instanceof FontParameter.ParagraphSpacingRelativeParameter) {
            kVar.w(Float.valueOf(((FontParameter.ParagraphSpacingRelativeParameter) fontParameter).getValue()), "value");
        } else if (fontParameter instanceof FontParameter.UseParagraphingParameter) {
            kVar.y("type", "useParagraphing");
            kVar.y("value", "");
        } else if (fontParameter instanceof FontParameter.ParagraphSpacingParameter) {
            kVar.w(Float.valueOf(((FontParameter.ParagraphSpacingParameter) fontParameter).getValue()), "value");
        } else if (fontParameter instanceof FontParameter.TextAlignmentParameter) {
            kVar.y("type", "textAlignment");
            TextAlignment alignment = ((FontParameter.TextAlignmentParameter) fontParameter).getAlignment();
            kVar.y("value", alignment != null ? alignment.toString() : null);
        } else if (fontParameter instanceof FontParameter.UnderlineParameter) {
            kVar.y("type", "underline");
            kVar.y("value", "");
        } else {
            if (!(fontParameter instanceof FontParameter.TextStyleDataParameter ? true : fontParameter instanceof FontParameter.Re23StrikethroughParameter)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        G0 g02 = G0.f406611a;
        return kVar;
    }

    @Override // com.google.gson.o
    public final com.google.gson.i a(Object obj, com.google.gson.n nVar) {
        AttributedText attributedText = (AttributedText) obj;
        com.google.gson.k kVar = new com.google.gson.k();
        kVar.y("text", attributedText.getText());
        List<Attribute> attributes = attributedText.getAttributes();
        com.google.gson.k kVar2 = new com.google.gson.k();
        for (Attribute attribute : attributes) {
            String name = attribute.getName();
            com.google.gson.k kVar3 = new com.google.gson.k();
            com.google.gson.k kVar4 = new com.google.gson.k();
            kVar3.t("value", kVar4);
            kVar4.y("title", attribute.getTitle());
            if (attribute instanceof LinkAttribute) {
                kVar3.y("type", "link");
                LinkAttribute linkAttribute = (LinkAttribute) attribute;
                kVar4.y(ContextActionHandler.Link.URL, linkAttribute.getUrl());
                if (linkAttribute.getParameters() != null) {
                    com.google.gson.f fVar = new com.google.gson.f();
                    Iterator<T> it = linkAttribute.getParameters().iterator();
                    while (it.hasNext()) {
                        fVar.t(c((FontParameter) it.next(), nVar));
                    }
                    G0 g02 = G0.f406611a;
                    kVar4.t("list", fVar);
                }
                G0 g03 = G0.f406611a;
            } else if (attribute instanceof DeepLinkAttribute) {
                DeepLinkAttribute deepLinkAttribute = (DeepLinkAttribute) attribute;
                if (deepLinkAttribute.getFallbackUrl() != null) {
                    kVar3.y("type", "link");
                    kVar4.y(ContextActionHandler.Link.DEEPLINK, deepLinkAttribute.getDeepLinkString());
                    kVar4.y(ContextActionHandler.Link.URL, deepLinkAttribute.getFallbackUrl());
                } else {
                    kVar3.y("type", ContextActionHandler.Link.DEEPLINK);
                    kVar4.y(TooltipAttribute.PARAM_DEEP_LINK, deepLinkAttribute.getDeepLinkString());
                }
                if (deepLinkAttribute.getParameters() != null) {
                    com.google.gson.f fVar2 = new com.google.gson.f();
                    Iterator<T> it2 = deepLinkAttribute.getParameters().iterator();
                    while (it2.hasNext()) {
                        fVar2.t(c((FontParameter) it2.next(), nVar));
                    }
                    G0 g04 = G0.f406611a;
                    kVar4.t("list", fVar2);
                }
                G0 g05 = G0.f406611a;
            } else if (attribute instanceof FontAttribute) {
                kVar3.y("type", Navigation.ATTRIBUTES);
                com.google.gson.f fVar3 = new com.google.gson.f();
                Iterator<T> it3 = ((FontAttribute) attribute).getParameters().iterator();
                while (it3.hasNext()) {
                    fVar3.t(c((FontParameter) it3.next(), nVar));
                }
                G0 g06 = G0.f406611a;
                kVar4.t("list", fVar3);
            } else if (attribute instanceof DateAttribute) {
                kVar3.y("type", "TODO");
                G0 g07 = G0.f406611a;
            } else if (attribute instanceof BadgeAttribute) {
                kVar3.y("type", "badge");
                BadgeAttribute badgeAttribute = (BadgeAttribute) attribute;
                kVar4.t("titleColor", nVar.a(badgeAttribute.getBadge().getUniversalTitleColor(), UniversalColor.class));
                kVar4.t("backgroundColor", nVar.a(badgeAttribute.getBadge().getUniversalBackgroundColor(), UniversalColor.class));
                G0 g08 = G0.f406611a;
            } else if (attribute instanceof BulletAttribute) {
                kVar3.y("type", "bullet");
                BulletAttribute bulletAttribute = (BulletAttribute) attribute;
                kVar4.y("bullet", bulletAttribute.getBullet());
                kVar4.w(bulletAttribute.getOffset(), "offset");
                kVar4.w(bulletAttribute.getIndentation(), "indentation");
                if (bulletAttribute.getParameters() != null) {
                    com.google.gson.f fVar4 = new com.google.gson.f();
                    Iterator<T> it4 = bulletAttribute.getParameters().iterator();
                    while (it4.hasNext()) {
                        fVar4.t(c((FontParameter) it4.next(), nVar));
                    }
                    G0 g09 = G0.f406611a;
                    kVar4.t("list", fVar4);
                }
                G0 g010 = G0.f406611a;
            } else if (attribute instanceof TextIconAttribute) {
                kVar3.y("type", "textIcon");
                kVar4.y("iconName", attribute.getTitle());
                TextIconAttribute textIconAttribute = (TextIconAttribute) attribute;
                if (textIconAttribute.getParameters() != null) {
                    com.google.gson.f fVar5 = new com.google.gson.f();
                    Iterator<T> it5 = textIconAttribute.getParameters().iterator();
                    while (it5.hasNext()) {
                        fVar5.t(c((FontParameter) it5.next(), nVar));
                    }
                    G0 g011 = G0.f406611a;
                    kVar4.t("list", fVar5);
                }
                G0 g012 = G0.f406611a;
            } else if (attribute instanceof SpacerAttribute) {
                kVar3.y("type", SpacerAttribute.ATTRIBUTE_TYPE);
                SpacerAttribute spacerAttribute = (SpacerAttribute) attribute;
                String type = spacerAttribute.getType();
                if (type != null) {
                    kVar4.y("type", type);
                }
                Integer value = spacerAttribute.getValue();
                if (value != null) {
                    kVar4.w(Integer.valueOf(value.intValue()), "value");
                    G0 g013 = G0.f406611a;
                }
            } else if (attribute instanceof TooltipAttribute) {
                kVar3.y("type", TooltipAttribute.ATTRIBUTE_TYPE);
                kVar4.y("iconName", attribute.getTitle());
                kVar4.t(TooltipAttribute.PARAM_DEEP_LINK, nVar.a(((TooltipAttribute) attribute).getDeepLink(), DeepLink.class));
                G0 g014 = G0.f406611a;
            } else if (attribute instanceof UnknownAttribute) {
                kVar3.y("type", ((UnknownAttribute) attribute).getType());
                G0 g015 = G0.f406611a;
            } else {
                if (!(attribute instanceof ParametersAttribute)) {
                    throw new NoWhenBranchMatchedException();
                }
                G0 g016 = G0.f406611a;
            }
            kVar2.t(name, kVar3);
        }
        kVar.t(Navigation.ATTRIBUTES, kVar2);
        return kVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0319  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.text.AttributedText b(@Y61.k com.google.gson.g r20, @Y61.k com.google.gson.i r21) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.parse.adapter.AttributedTextAdapter.b(com.google.gson.g, com.google.gson.i):com.avito.android.remote.model.text.AttributedText");
    }

    @Override // com.google.gson.h
    public final /* bridge */ /* synthetic */ AttributedText deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        return b(gVar, iVar);
    }

    public AttributedTextAdapter(@Y61.l Integer num) {
        this.f254156a = num;
    }

    public /* synthetic */ AttributedTextAdapter(Integer num, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num);
    }
}
