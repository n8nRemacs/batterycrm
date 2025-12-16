package com.avito.android.remote.model.category_parameters.slot.user_verification;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserVerificationSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJH\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b*\u0010\u000e¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/user_verification/BlockedState;", "Landroid/os/Parcelable;", "", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "text", "buttonText", "supportText", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/category_parameters/slot/user_verification/BlockedState;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getImage", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getText", "getButtonText", "getSupportText", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BlockedState implements Parcelable {

    @k
    public static final Parcelable.Creator<BlockedState> CREATOR = new Creator();

    @c("buttonText")
    @l
    private final String buttonText;

    @c("image")
    @l
    private final String image;

    @c("supportText")
    @l
    private final AttributedText supportText;

    @c("text")
    @k
    private final AttributedText text;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: UserVerificationSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BlockedState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BlockedState createFromParcel(@k Parcel parcel) {
            return new BlockedState(parcel.readString(), (AttributedText) parcel.readParcelable(BlockedState.class.getClassLoader()), (AttributedText) parcel.readParcelable(BlockedState.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(BlockedState.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BlockedState[] newArray(int i12) {
            return new BlockedState[i12];
        }
    }

    public BlockedState(@l String str, @k AttributedText attributedText, @k AttributedText attributedText2, @l String str2, @l AttributedText attributedText3) {
        this.image = str;
        this.title = attributedText;
        this.text = attributedText2;
        this.buttonText = str2;
        this.supportText = attributedText3;
    }

    public static /* synthetic */ BlockedState copy$default(BlockedState blockedState, String str, AttributedText attributedText, AttributedText attributedText2, String str2, AttributedText attributedText3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = blockedState.image;
        }
        if ((i12 & 2) != 0) {
            attributedText = blockedState.title;
        }
        AttributedText attributedText4 = attributedText;
        if ((i12 & 4) != 0) {
            attributedText2 = blockedState.text;
        }
        AttributedText attributedText5 = attributedText2;
        if ((i12 & 8) != 0) {
            str2 = blockedState.buttonText;
        }
        String str3 = str2;
        if ((i12 & 16) != 0) {
            attributedText3 = blockedState.supportText;
        }
        return blockedState.copy(str, attributedText4, attributedText5, str3, attributedText3);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getSupportText() {
        return this.supportText;
    }

    @k
    public final BlockedState copy(@l String image, @k AttributedText title, @k AttributedText text, @l String buttonText, @l AttributedText supportText) {
        return new BlockedState(image, title, text, buttonText, supportText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockedState)) {
            return false;
        }
        BlockedState blockedState = (BlockedState) other;
        return L.f(this.image, blockedState.image) && L.f(this.title, blockedState.title) && L.f(this.text, blockedState.text) && L.f(this.buttonText, blockedState.buttonText) && L.f(this.supportText, blockedState.supportText);
    }

    @l
    public final String getButtonText() {
        return this.buttonText;
    }

    @l
    public final String getImage() {
        return this.image;
    }

    @l
    public final AttributedText getSupportText() {
        return this.supportText;
    }

    @k
    public final AttributedText getText() {
        return this.text;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.image;
        int iB2 = a.b(a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.text);
        String str2 = this.buttonText;
        int iHashCode = (iB2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.supportText;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BlockedState(image=");
        sb2.append(this.image);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", buttonText=");
        sb2.append(this.buttonText);
        sb2.append(", supportText=");
        return a.w(sb2, this.supportText, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.image);
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.text, flags);
        parcel.writeString(this.buttonText);
        parcel.writeParcelable(this.supportText, flags);
    }
}
