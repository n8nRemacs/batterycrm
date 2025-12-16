package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.e;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacPii.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u000e¨\u0006#"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLinkTyped;", "Lcom/avito/android/deep_linking/links/DeepLink;", "T", "Lcom/avito/android/iac_dialer_models/abstract_module/b;", "Landroid/os/Parcelable;", "LdL/d;", "value", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "toStringUnmasked", "()Ljava/lang/String;", "toStringMasked", "unwrap", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component1", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLinkTyped;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getValue", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacPiiDeepLinkTyped<T extends DeepLink> extends b implements Parcelable, dL.d {

    @k
    public static final Parcelable.Creator<IacPiiDeepLinkTyped<?>> CREATOR = new a();

    @k
    private final T value;

    /* compiled from: IacPii.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacPiiDeepLinkTyped<?>> {
        @Override // android.os.Parcelable.Creator
        public final IacPiiDeepLinkTyped<?> createFromParcel(Parcel parcel) {
            return new IacPiiDeepLinkTyped<>((DeepLink) parcel.readParcelable(IacPiiDeepLinkTyped.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IacPiiDeepLinkTyped<?>[] newArray(int i12) {
            return new IacPiiDeepLinkTyped[i12];
        }
    }

    public IacPiiDeepLinkTyped(@k T t12) {
        this.value = t12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IacPiiDeepLinkTyped copy$default(IacPiiDeepLinkTyped iacPiiDeepLinkTyped, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            deepLink = iacPiiDeepLinkTyped.value;
        }
        return iacPiiDeepLinkTyped.copy(deepLink);
    }

    @k
    public final T component1() {
        return this.value;
    }

    @k
    public final IacPiiDeepLinkTyped<T> copy(@k T value) {
        return new IacPiiDeepLinkTyped<>(value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IacPiiDeepLinkTyped) && L.f(this.value, ((IacPiiDeepLinkTyped) other).value);
    }

    @k
    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // com.avito.android.iac_dialer_models.abstract_module.b
    @k
    public String toStringMasked() {
        return e.a(this.value);
    }

    @Override // com.avito.android.iac_dialer_models.abstract_module.b
    @k
    public String toStringUnmasked() {
        return this.value.toString();
    }

    @k
    public final T unwrap() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.value, flags);
    }
}
