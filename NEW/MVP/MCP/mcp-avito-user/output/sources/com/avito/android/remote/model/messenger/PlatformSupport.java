package com.avito.android.remote.model.messenger;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PlatformSupport.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/messenger/PlatformSupport;", "Landroid/os/Parcelable;", "", "", "platforms", "Lcom/avito/android/remote/model/text/AttributedText;", "fallbackText", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/messenger/PlatformSupport;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPlatforms", "Lcom/avito/android/remote/model/text/AttributedText;", "getFallbackText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PlatformSupport implements Parcelable {

    @k
    public static final Parcelable.Creator<PlatformSupport> CREATOR = new Creator();

    @c("fallback")
    @l
    private final AttributedText fallbackText;

    @c("platforms")
    @l
    private final List<String> platforms;

    /* compiled from: PlatformSupport.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlatformSupport> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PlatformSupport createFromParcel(@k Parcel parcel) {
            return new PlatformSupport(parcel.createStringArrayList(), (AttributedText) parcel.readParcelable(PlatformSupport.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PlatformSupport[] newArray(int i12) {
            return new PlatformSupport[i12];
        }
    }

    public PlatformSupport(@l List<String> list, @l AttributedText attributedText) {
        this.platforms = list;
        this.fallbackText = attributedText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformSupport copy$default(PlatformSupport platformSupport, List list, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = platformSupport.platforms;
        }
        if ((i12 & 2) != 0) {
            attributedText = platformSupport.fallbackText;
        }
        return platformSupport.copy(list, attributedText);
    }

    @l
    public final List<String> component1() {
        return this.platforms;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getFallbackText() {
        return this.fallbackText;
    }

    @k
    public final PlatformSupport copy(@l List<String> platforms, @l AttributedText fallbackText) {
        return new PlatformSupport(platforms, fallbackText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformSupport)) {
            return false;
        }
        PlatformSupport platformSupport = (PlatformSupport) other;
        return L.f(this.platforms, platformSupport.platforms) && L.f(this.fallbackText, platformSupport.fallbackText);
    }

    @l
    public final AttributedText getFallbackText() {
        return this.fallbackText;
    }

    @l
    public final List<String> getPlatforms() {
        return this.platforms;
    }

    public int hashCode() {
        List<String> list = this.platforms;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        AttributedText attributedText = this.fallbackText;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PlatformSupport(platforms=");
        sb2.append(this.platforms);
        sb2.append(", fallbackText=");
        return a.w(sb2, this.fallbackText, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeStringList(this.platforms);
        parcel.writeParcelable(this.fallbackText, flags);
    }

    public /* synthetic */ PlatformSupport(List list, AttributedText attributedText, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : attributedText);
    }
}
