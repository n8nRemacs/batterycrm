package com.avito.android.remote.model.category_parameters.slot.universal_beduin;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalBeduinSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JF\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0013¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/universal_beduin/UniversalBeduinSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", ContextActionHandler.Link.URL, "", "excludeAttributeIds", "Lcom/avito/android/beduin_models/BeduinForm;", "form", "", "enableParamsObserve", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin_models/BeduinForm;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/beduin_models/BeduinForm;", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin_models/BeduinForm;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/slot/universal_beduin/UniversalBeduinSlotConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUrl", "Ljava/util/List;", "getExcludeAttributeIds", "Lcom/avito/android/beduin_models/BeduinForm;", "getForm", "Ljava/lang/Boolean;", "getEnableParamsObserve", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalBeduinSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<UniversalBeduinSlotConfig> CREATOR = new Creator();

    @c("enableParamsObserve")
    @l
    private final Boolean enableParamsObserve;

    @c("excludeAttributeIds")
    @l
    private final List<String> excludeAttributeIds;

    @c("content")
    @l
    private final BeduinForm form;

    @c("contentUrl")
    @l
    private final String url;

    /* compiled from: UniversalBeduinSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalBeduinSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalBeduinSlotConfig createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            BeduinForm beduinForm = (BeduinForm) parcel.readParcelable(UniversalBeduinSlotConfig.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UniversalBeduinSlotConfig(string, arrayListCreateStringArrayList, beduinForm, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalBeduinSlotConfig[] newArray(int i12) {
            return new UniversalBeduinSlotConfig[i12];
        }
    }

    public UniversalBeduinSlotConfig(@l String str, @l List<String> list, @l BeduinForm beduinForm, @l Boolean bool) {
        this.url = str;
        this.excludeAttributeIds = list;
        this.form = beduinForm;
        this.enableParamsObserve = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniversalBeduinSlotConfig copy$default(UniversalBeduinSlotConfig universalBeduinSlotConfig, String str, List list, BeduinForm beduinForm, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = universalBeduinSlotConfig.url;
        }
        if ((i12 & 2) != 0) {
            list = universalBeduinSlotConfig.excludeAttributeIds;
        }
        if ((i12 & 4) != 0) {
            beduinForm = universalBeduinSlotConfig.form;
        }
        if ((i12 & 8) != 0) {
            bool = universalBeduinSlotConfig.enableParamsObserve;
        }
        return universalBeduinSlotConfig.copy(str, list, beduinForm, bool);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @l
    public final List<String> component2() {
        return this.excludeAttributeIds;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinForm getForm() {
        return this.form;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getEnableParamsObserve() {
        return this.enableParamsObserve;
    }

    @k
    public final UniversalBeduinSlotConfig copy(@l String url, @l List<String> excludeAttributeIds, @l BeduinForm form, @l Boolean enableParamsObserve) {
        return new UniversalBeduinSlotConfig(url, excludeAttributeIds, form, enableParamsObserve);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalBeduinSlotConfig)) {
            return false;
        }
        UniversalBeduinSlotConfig universalBeduinSlotConfig = (UniversalBeduinSlotConfig) other;
        return L.f(this.url, universalBeduinSlotConfig.url) && L.f(this.excludeAttributeIds, universalBeduinSlotConfig.excludeAttributeIds) && L.f(this.form, universalBeduinSlotConfig.form) && L.f(this.enableParamsObserve, universalBeduinSlotConfig.enableParamsObserve);
    }

    @l
    public final Boolean getEnableParamsObserve() {
        return this.enableParamsObserve;
    }

    @l
    public final List<String> getExcludeAttributeIds() {
        return this.excludeAttributeIds;
    }

    @l
    public final BeduinForm getForm() {
        return this.form;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.excludeAttributeIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BeduinForm beduinForm = this.form;
        int iHashCode3 = (iHashCode2 + (beduinForm == null ? 0 : beduinForm.hashCode())) * 31;
        Boolean bool = this.enableParamsObserve;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalBeduinSlotConfig(url=");
        sb2.append(this.url);
        sb2.append(", excludeAttributeIds=");
        sb2.append(this.excludeAttributeIds);
        sb2.append(", form=");
        sb2.append(this.form);
        sb2.append(", enableParamsObserve=");
        return C0.g(sb2, this.enableParamsObserve, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.url);
        parcel.writeStringList(this.excludeAttributeIds);
        parcel.writeParcelable(this.form, flags);
        Boolean bool = this.enableParamsObserve;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
