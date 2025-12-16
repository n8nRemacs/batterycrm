package com.avito.android.beduin.network.parse;

import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.attributed_text_pair.BeduinAttributedTextPairModel;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.utils.z;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.x;
import com.google.gson.k;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinAttributedTextPairDeserializer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/network/parse/BeduinAttributedTextPairDeserializer;", "Lcom/google/gson/h;", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinAttributedTextPairDeserializer implements h<BeduinAttributedTextPairModel> {
    @Override // com.google.gson.h
    public final BeduinAttributedTextPairModel deserialize(i iVar, Type type, g gVar) {
        BeduinAttributedTextPairModel.AttributedTextPairPart attributedTextPairPart;
        BeduinAttributedTextPairModel.AttributedTextPairPart attributedTextPairPart2;
        i iVarD = iVar.i().D("content");
        k kVarI = iVarD != null ? iVarD.i() : null;
        if (kVarI == null) {
            return null;
        }
        x<String, i> xVar = kVarI.f362194b;
        if (xVar.containsKey("leftPart")) {
            if (gVar == null) {
                return null;
            }
            attributedTextPairPart = (BeduinAttributedTextPairModel.AttributedTextPairPart) gVar.b(kVarI.D("leftPart"), BeduinAttributedTextPairModel.AttributedTextPairPart.class);
        } else {
            if (gVar == null) {
                return null;
            }
            attributedTextPairPart = new BeduinAttributedTextPairModel.AttributedTextPairPart((AttributedText) gVar.b(kVarI.D("leftText"), AttributedText.class), null, null, null, null, 30, null);
        }
        BeduinAttributedTextPairModel.AttributedTextPairPart attributedTextPairPart3 = attributedTextPairPart;
        if (xVar.containsKey("rightPart")) {
            attributedTextPairPart2 = (BeduinAttributedTextPairModel.AttributedTextPairPart) gVar.b(kVarI.D("rightPart"), BeduinAttributedTextPairModel.AttributedTextPairPart.class);
        } else {
            i iVarD2 = kVarI.D("rightText");
            AttributedText attributedText = (AttributedText) (iVarD2 == null ? null : gVar.b(iVarD2, AttributedText.class));
            if (attributedText == null) {
                return null;
            }
            i iVarD3 = kVarI.D("rightIcon");
            attributedTextPairPart2 = new BeduinAttributedTextPairModel.AttributedTextPairPart(attributedText, null, (BeduinAttributedTextPairModel.AttributedTextPairIcon) (iVarD3 == null ? null : gVar.b(iVarD3, BeduinAttributedTextPairModel.AttributedTextPairIcon.class)), null, null, 26, null);
        }
        BeduinAttributedTextPairModel.AttributedTextPairPart attributedTextPairPart4 = attributedTextPairPart2;
        i iVarD4 = kVarI.D(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE);
        DisplayingPredicate displayingPredicate = (DisplayingPredicate) (iVarD4 == null ? null : gVar.b(iVarD4, DisplayingPredicate.class));
        i iVarD5 = kVarI.D("leftPartWidthPercent");
        if (iVarD5 == null) {
            iVarD5 = kVarI.D("leftTextWidthPercent");
        }
        i iVarD6 = kVarI.D("connectingLine");
        BeduinAttributedTextPairModel.ConnectingLine connectingLine = (BeduinAttributedTextPairModel.ConnectingLine) (iVarD6 == null ? null : gVar.b(iVarD6, BeduinAttributedTextPairModel.ConnectingLine.class));
        i iVarD7 = kVarI.D(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING);
        BeduinContainerIndent beduinContainerIndent = (BeduinContainerIndent) (iVarD7 == null ? null : gVar.b(iVarD7, BeduinContainerIndent.class));
        i iVarD8 = kVarI.D(BeduinPromoBlockModel.SERIALIZED_NAME_THEME);
        return new BeduinAttributedTextPairModel(z.a(kVarI), displayingPredicate, attributedTextPairPart3, attributedTextPairPart4, iVarD5 != null ? C34328m0.b(iVarD5) : null, connectingLine, beduinContainerIndent, (BeduinComponentTheme) (iVarD8 == null ? null : gVar.b(iVarD8, BeduinComponentTheme.class)));
    }
}
