package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WebPaymentShowErrorPlaceholderTransform.kt */
@d
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/WebPaymentShowErrorPlaceholderTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "", WebPaymentShowErrorPlaceholderTransform.TYPE, "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/avito/android/beduin/common/form/transforms/WebPaymentShowErrorPlaceholderTransform;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getShowErrorPlaceholder", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WebPaymentShowErrorPlaceholderTransform implements BeduinModelTransform {
    private final boolean showErrorPlaceholder;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<WebPaymentShowErrorPlaceholderTransform> CREATOR = new b();

    @k
    private static final Class<? extends BeduinModelTransform> transform = WebPaymentShowErrorPlaceholderTransform.class;

    @k
    private static final String TYPE = "showErrorPlaceholder";

    @k
    private static final String type = TYPE;

    /* compiled from: WebPaymentShowErrorPlaceholderTransform.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/WebPaymentShowErrorPlaceholderTransform$a;", "LTi/a;", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.form.transforms.WebPaymentShowErrorPlaceholderTransform$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15365a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<? extends BeduinModelTransform> a() {
            return WebPaymentShowErrorPlaceholderTransform.transform;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return WebPaymentShowErrorPlaceholderTransform.type;
        }

        public Companion() {
        }
    }

    /* compiled from: WebPaymentShowErrorPlaceholderTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<WebPaymentShowErrorPlaceholderTransform> {
        @Override // android.os.Parcelable.Creator
        public final WebPaymentShowErrorPlaceholderTransform createFromParcel(Parcel parcel) {
            return new WebPaymentShowErrorPlaceholderTransform(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final WebPaymentShowErrorPlaceholderTransform[] newArray(int i12) {
            return new WebPaymentShowErrorPlaceholderTransform[i12];
        }
    }

    public WebPaymentShowErrorPlaceholderTransform(boolean z12) {
        this.showErrorPlaceholder = z12;
    }

    public static /* synthetic */ WebPaymentShowErrorPlaceholderTransform copy$default(WebPaymentShowErrorPlaceholderTransform webPaymentShowErrorPlaceholderTransform, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = webPaymentShowErrorPlaceholderTransform.showErrorPlaceholder;
        }
        return webPaymentShowErrorPlaceholderTransform.copy(z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowErrorPlaceholder() {
        return this.showErrorPlaceholder;
    }

    @k
    public final WebPaymentShowErrorPlaceholderTransform copy(boolean showErrorPlaceholder) {
        return new WebPaymentShowErrorPlaceholderTransform(showErrorPlaceholder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WebPaymentShowErrorPlaceholderTransform) && this.showErrorPlaceholder == ((WebPaymentShowErrorPlaceholderTransform) other).showErrorPlaceholder;
    }

    public final boolean getShowErrorPlaceholder() {
        return this.showErrorPlaceholder;
    }

    public int hashCode() {
        return Boolean.hashCode(this.showErrorPlaceholder);
    }

    @k
    public String toString() {
        return r.x(new StringBuilder("WebPaymentShowErrorPlaceholderTransform(showErrorPlaceholder="), this.showErrorPlaceholder, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.showErrorPlaceholder ? 1 : 0);
    }
}
