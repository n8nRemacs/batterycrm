package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RejectReason.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u00012BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JV\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u0018¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/RejectReason;", "Landroid/os/Parcelable;", "", "name", "description", "Lcom/avito/android/remote/model/Action;", "action", "promoBlockStyle", "severity", "Lcom/avito/android/remote/model/text/AttributedText;", AttachMenuItem.Support.KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Action;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component5", "()Ljava/lang/String;", "", "isCritical", "()Z", "component1", "component2", "component3", "()Lcom/avito/android/remote/model/Action;", "component4", "component6", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Action;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/RejectReason;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getDescription", "Lcom/avito/android/remote/model/Action;", "getAction", "getPromoBlockStyle", "Lcom/avito/android/remote/model/text/AttributedText;", "getSupport", "Severity", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RejectReason implements Parcelable {

    @k
    public static final Parcelable.Creator<RejectReason> CREATOR = new Creator();

    @c("action")
    @l
    private final Action action;

    @c("description")
    @l
    private final String description;

    @c("name")
    @k
    private final String name;

    @c("promoBlockStyle")
    @l
    private final String promoBlockStyle;

    @c("severity")
    @l
    private final String severity;

    @c(AttachMenuItem.Support.KEY)
    @l
    private final AttributedText support;

    /* compiled from: RejectReason.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RejectReason> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RejectReason createFromParcel(@k Parcel parcel) {
            return new RejectReason(parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(RejectReason.class.getClassLoader()), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(RejectReason.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RejectReason[] newArray(int i12) {
            return new RejectReason[i12];
        }
    }

    /* compiled from: RejectReason.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0083\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/model/RejectReason$Severity;", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface Severity {
    }

    public RejectReason(@k String str, @l String str2, @l Action action, @l String str3, @l String str4, @l AttributedText attributedText) {
        this.name = str;
        this.description = str2;
        this.action = action;
        this.promoBlockStyle = str3;
        this.severity = str4;
        this.support = attributedText;
    }

    /* renamed from: component5, reason: from getter */
    private final String getSeverity() {
        return this.severity;
    }

    public static /* synthetic */ RejectReason copy$default(RejectReason rejectReason, String str, String str2, Action action, String str3, String str4, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = rejectReason.name;
        }
        if ((i12 & 2) != 0) {
            str2 = rejectReason.description;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            action = rejectReason.action;
        }
        Action action2 = action;
        if ((i12 & 8) != 0) {
            str3 = rejectReason.promoBlockStyle;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            str4 = rejectReason.severity;
        }
        String str7 = str4;
        if ((i12 & 32) != 0) {
            attributedText = rejectReason.support;
        }
        return rejectReason.copy(str, str5, action2, str6, str7, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getPromoBlockStyle() {
        return this.promoBlockStyle;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttributedText getSupport() {
        return this.support;
    }

    @k
    public final RejectReason copy(@k String name, @l String description, @l Action action, @l String promoBlockStyle, @l String severity, @l AttributedText support) {
        return new RejectReason(name, description, action, promoBlockStyle, severity, support);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RejectReason)) {
            return false;
        }
        RejectReason rejectReason = (RejectReason) other;
        return L.f(this.name, rejectReason.name) && L.f(this.description, rejectReason.description) && L.f(this.action, rejectReason.action) && L.f(this.promoBlockStyle, rejectReason.promoBlockStyle) && L.f(this.severity, rejectReason.severity) && L.f(this.support, rejectReason.support);
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final String getPromoBlockStyle() {
        return this.promoBlockStyle;
    }

    @l
    public final AttributedText getSupport() {
        return this.support;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.action;
        int iHashCode3 = (iHashCode2 + (action == null ? 0 : action.hashCode())) * 31;
        String str2 = this.promoBlockStyle;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.severity;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.support;
        return iHashCode5 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    public final boolean isCritical() {
        return "critical".equals(this.severity);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RejectReason(name=");
        sb2.append(this.name);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", promoBlockStyle=");
        sb2.append(this.promoBlockStyle);
        sb2.append(", severity=");
        sb2.append(this.severity);
        sb2.append(", support=");
        return a.w(sb2, this.support, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.action, flags);
        parcel.writeString(this.promoBlockStyle);
        parcel.writeString(this.severity);
        parcel.writeParcelable(this.support, flags);
    }

    public /* synthetic */ RejectReason(String str, String str2, Action action, String str3, String str4, AttributedText attributedText, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : action, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? "critical" : str4, (i12 & 32) == 0 ? attributedText : null);
    }
}
