package com.avito.android.beduin.common.component.text;

import Y61.l;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: BeduinAbstractTextModel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/common/component/text/BeduinAbstractTextModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "()V", "alignment", "Lcom/avito/android/beduin/common/component/text/Alignment;", "getAlignment", "()Lcom/avito/android/beduin/common/component/text/Alignment;", "attributedText", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedText", "()Lcom/avito/android/remote/model/text/AttributedText;", "linkColor", "Lcom/avito/android/remote/model/UniversalColor;", "getLinkColor", "()Lcom/avito/android/remote/model/UniversalColor;", "numberOfLines", "", "getNumberOfLines", "()Ljava/lang/Integer;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "getStyle", "()Ljava/lang/String;", "text", "getText", "textColor", "getTextColor", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BeduinAbstractTextModel extends LeafBeduinModel {
    @l
    public abstract Alignment getAlignment();

    @l
    public abstract AttributedText getAttributedText();

    @l
    public abstract UniversalColor getLinkColor();

    @l
    public abstract Integer getNumberOfLines();

    @l
    public abstract String getStyle();

    @l
    public abstract String getText();

    @l
    public abstract UniversalColor getTextColor();

    @l
    public abstract BeduinComponentTheme getTheme();
}
