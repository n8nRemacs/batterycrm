package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin.common.component.attributed_text_pair.BeduinAttributedTextPairModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AttributedTextPairTransform.kt */
@d
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001(B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\r¨\u0006)"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/AttributedTextPairTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "Lcom/avito/android/remote/model/text/AttributedText;", "rightText", "leftText", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$ConnectingLine;", "line", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$ConnectingLine;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$ConnectingLine;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$ConnectingLine;)Lcom/avito/android/beduin/common/form/transforms/AttributedTextPairTransform;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getRightText", "getLeftText", "Lcom/avito/android/beduin/common/component/attributed_text_pair/BeduinAttributedTextPairModel$ConnectingLine;", "getLine", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AttributedTextPairTransform implements BeduinModelTransform {

    @l
    private final AttributedText leftText;

    @l
    private final BeduinAttributedTextPairModel.ConnectingLine line;

    @l
    private final AttributedText rightText;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<AttributedTextPairTransform> CREATOR = new b();

    @k
    private static final Class<? extends BeduinModelTransform> transform = AttributedTextPairTransform.class;

    @k
    private static final String TYPE = "attributedTextPairTexts";

    @k
    private static final String type = TYPE;

    /* compiled from: AttributedTextPairTransform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/AttributedTextPairTransform$a;", "LTi/a;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.form.transforms.AttributedTextPairTransform$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15365a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<? extends BeduinModelTransform> a() {
            return AttributedTextPairTransform.transform;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return AttributedTextPairTransform.type;
        }

        public Companion() {
        }
    }

    /* compiled from: AttributedTextPairTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AttributedTextPairTransform> {
        @Override // android.os.Parcelable.Creator
        public final AttributedTextPairTransform createFromParcel(Parcel parcel) {
            return new AttributedTextPairTransform((AttributedText) parcel.readParcelable(AttributedTextPairTransform.class.getClassLoader()), (AttributedText) parcel.readParcelable(AttributedTextPairTransform.class.getClassLoader()), parcel.readInt() == 0 ? null : BeduinAttributedTextPairModel.ConnectingLine.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AttributedTextPairTransform[] newArray(int i12) {
            return new AttributedTextPairTransform[i12];
        }
    }

    public AttributedTextPairTransform() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AttributedTextPairTransform copy$default(AttributedTextPairTransform attributedTextPairTransform, AttributedText attributedText, AttributedText attributedText2, BeduinAttributedTextPairModel.ConnectingLine connectingLine, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = attributedTextPairTransform.rightText;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = attributedTextPairTransform.leftText;
        }
        if ((i12 & 4) != 0) {
            connectingLine = attributedTextPairTransform.line;
        }
        return attributedTextPairTransform.copy(attributedText, attributedText2, connectingLine);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getRightText() {
        return this.rightText;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getLeftText() {
        return this.leftText;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinAttributedTextPairModel.ConnectingLine getLine() {
        return this.line;
    }

    @k
    public final AttributedTextPairTransform copy(@l AttributedText rightText, @l AttributedText leftText, @l BeduinAttributedTextPairModel.ConnectingLine line) {
        return new AttributedTextPairTransform(rightText, leftText, line);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributedTextPairTransform)) {
            return false;
        }
        AttributedTextPairTransform attributedTextPairTransform = (AttributedTextPairTransform) other;
        return L.f(this.rightText, attributedTextPairTransform.rightText) && L.f(this.leftText, attributedTextPairTransform.leftText) && L.f(this.line, attributedTextPairTransform.line);
    }

    @l
    public final AttributedText getLeftText() {
        return this.leftText;
    }

    @l
    public final BeduinAttributedTextPairModel.ConnectingLine getLine() {
        return this.line;
    }

    @l
    public final AttributedText getRightText() {
        return this.rightText;
    }

    public int hashCode() {
        AttributedText attributedText = this.rightText;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.leftText;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        BeduinAttributedTextPairModel.ConnectingLine connectingLine = this.line;
        return iHashCode2 + (connectingLine != null ? connectingLine.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AttributedTextPairTransform(rightText=" + this.rightText + ", leftText=" + this.leftText + ", line=" + this.line + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.rightText, flags);
        parcel.writeParcelable(this.leftText, flags);
        BeduinAttributedTextPairModel.ConnectingLine connectingLine = this.line;
        if (connectingLine == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            connectingLine.writeToParcel(parcel, flags);
        }
    }

    public AttributedTextPairTransform(@l AttributedText attributedText, @l AttributedText attributedText2, @l BeduinAttributedTextPairModel.ConnectingLine connectingLine) {
        this.rightText = attributedText;
        this.leftText = attributedText2;
        this.line = connectingLine;
    }

    public /* synthetic */ AttributedTextPairTransform(AttributedText attributedText, AttributedText attributedText2, BeduinAttributedTextPairModel.ConnectingLine connectingLine, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : attributedText, (i12 & 2) != 0 ? null : attributedText2, (i12 & 4) != 0 ? null : connectingLine);
    }
}
