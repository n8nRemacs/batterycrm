package com.avito.android.remote.model.category_parameters.slot.text_suggests;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TextSuggestionsSlotConfig.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/text_suggests/TextSuggestionsSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "targetFieldId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/slot/text_suggests/TextSuggestionsSlotConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTargetFieldId", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TextSuggestionsSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<TextSuggestionsSlotConfig> CREATOR = new Creator();

    @c("targetFieldId")
    @k
    private final String targetFieldId;

    /* compiled from: TextSuggestionsSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TextSuggestionsSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TextSuggestionsSlotConfig createFromParcel(@k Parcel parcel) {
            return new TextSuggestionsSlotConfig(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TextSuggestionsSlotConfig[] newArray(int i12) {
            return new TextSuggestionsSlotConfig[i12];
        }
    }

    public TextSuggestionsSlotConfig(@k String str) {
        this.targetFieldId = str;
    }

    public static /* synthetic */ TextSuggestionsSlotConfig copy$default(TextSuggestionsSlotConfig textSuggestionsSlotConfig, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = textSuggestionsSlotConfig.targetFieldId;
        }
        return textSuggestionsSlotConfig.copy(str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTargetFieldId() {
        return this.targetFieldId;
    }

    @k
    public final TextSuggestionsSlotConfig copy(@k String targetFieldId) {
        return new TextSuggestionsSlotConfig(targetFieldId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TextSuggestionsSlotConfig) && L.f(this.targetFieldId, ((TextSuggestionsSlotConfig) other).targetFieldId);
    }

    @k
    public final String getTargetFieldId() {
        return this.targetFieldId;
    }

    public int hashCode() {
        return this.targetFieldId.hashCode();
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("TextSuggestionsSlotConfig(targetFieldId="), this.targetFieldId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.targetFieldId);
    }
}
