package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Verification.kt */
@d
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"Jv\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020&HÖ\u0001¢\u0006\u0004\b.\u0010(J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020&HÖ\u0001¢\u0006\u0004\b3\u00104R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b9\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010 R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010\"¨\u0006D"}, d2 = {"Lcom/avito/android/remote/model/Verification;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/VerificationStatus;", "status", "", "title", "description", "Lcom/avito/android/remote/model/Note;", "note", "Lcom/avito/android/remote/model/VerificationButton;", "verificationButton", "Lcom/avito/android/remote/model/SupportButton;", "supportButton", "Lcom/avito/android/remote/model/Badge;", "badge", "", "Lcom/avito/android/remote/model/VerificationStep;", "steps", "<init>", "(Lcom/avito/android/remote/model/VerificationStatus;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Note;Lcom/avito/android/remote/model/VerificationButton;Lcom/avito/android/remote/model/SupportButton;Lcom/avito/android/remote/model/Badge;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/VerificationStatus;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/Note;", "component5", "()Lcom/avito/android/remote/model/VerificationButton;", "component6", "()Lcom/avito/android/remote/model/SupportButton;", "component7", "()Lcom/avito/android/remote/model/Badge;", "component8", "()Ljava/util/List;", "copy", "(Lcom/avito/android/remote/model/VerificationStatus;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Note;Lcom/avito/android/remote/model/VerificationButton;Lcom/avito/android/remote/model/SupportButton;Lcom/avito/android/remote/model/Badge;Ljava/util/List;)Lcom/avito/android/remote/model/Verification;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/VerificationStatus;", "getStatus", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/Note;", "getNote", "Lcom/avito/android/remote/model/VerificationButton;", "getVerificationButton", "Lcom/avito/android/remote/model/SupportButton;", "getSupportButton", "Lcom/avito/android/remote/model/Badge;", "getBadge", "Ljava/util/List;", "getSteps", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Verification implements Parcelable {

    @k
    public static final Parcelable.Creator<Verification> CREATOR = new Creator();

    @c("badge")
    @l
    private final Badge badge;

    @c("description")
    @l
    private final String description;

    @c("note")
    @l
    private final Note note;

    @c("status")
    @l
    private final VerificationStatus status;

    @c("steps")
    @l
    private final List<VerificationStep> steps;

    @c("supportButton")
    @l
    private final SupportButton supportButton;

    @c("title")
    @l
    private final String title;

    @c("verificationButton")
    @l
    private final VerificationButton verificationButton;

    /* compiled from: Verification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Verification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Verification createFromParcel(@k Parcel parcel) {
            ArrayList arrayList = null;
            VerificationStatus verificationStatusValueOf = parcel.readInt() == 0 ? null : VerificationStatus.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Note noteCreateFromParcel = parcel.readInt() == 0 ? null : Note.CREATOR.createFromParcel(parcel);
            VerificationButton verificationButtonCreateFromParcel = parcel.readInt() == 0 ? null : VerificationButton.CREATOR.createFromParcel(parcel);
            SupportButton supportButtonCreateFromParcel = parcel.readInt() == 0 ? null : SupportButton.CREATOR.createFromParcel(parcel);
            Badge badgeCreateFromParcel = parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(VerificationStep.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new Verification(verificationStatusValueOf, string, string2, noteCreateFromParcel, verificationButtonCreateFromParcel, supportButtonCreateFromParcel, badgeCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Verification[] newArray(int i12) {
            return new Verification[i12];
        }
    }

    public Verification(@l VerificationStatus verificationStatus, @l String str, @l String str2, @l Note note, @l VerificationButton verificationButton, @l SupportButton supportButton, @l Badge badge, @l List<VerificationStep> list) {
        this.status = verificationStatus;
        this.title = str;
        this.description = str2;
        this.note = note;
        this.verificationButton = verificationButton;
        this.supportButton = supportButton;
        this.badge = badge;
        this.steps = list;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final VerificationStatus getStatus() {
        return this.status;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Note getNote() {
        return this.note;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final VerificationButton getVerificationButton() {
        return this.verificationButton;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final SupportButton getSupportButton() {
        return this.supportButton;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    @l
    public final List<VerificationStep> component8() {
        return this.steps;
    }

    @k
    public final Verification copy(@l VerificationStatus status, @l String title, @l String description, @l Note note, @l VerificationButton verificationButton, @l SupportButton supportButton, @l Badge badge, @l List<VerificationStep> steps) {
        return new Verification(status, title, description, note, verificationButton, supportButton, badge, steps);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Verification)) {
            return false;
        }
        Verification verification = (Verification) other;
        return this.status == verification.status && L.f(this.title, verification.title) && L.f(this.description, verification.description) && L.f(this.note, verification.note) && L.f(this.verificationButton, verification.verificationButton) && L.f(this.supportButton, verification.supportButton) && L.f(this.badge, verification.badge) && L.f(this.steps, verification.steps);
    }

    @l
    public final Badge getBadge() {
        return this.badge;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Note getNote() {
        return this.note;
    }

    @l
    public final VerificationStatus getStatus() {
        return this.status;
    }

    @l
    public final List<VerificationStep> getSteps() {
        return this.steps;
    }

    @l
    public final SupportButton getSupportButton() {
        return this.supportButton;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final VerificationButton getVerificationButton() {
        return this.verificationButton;
    }

    public int hashCode() {
        VerificationStatus verificationStatus = this.status;
        int iHashCode = (verificationStatus == null ? 0 : verificationStatus.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Note note = this.note;
        int iHashCode4 = (iHashCode3 + (note == null ? 0 : note.hashCode())) * 31;
        VerificationButton verificationButton = this.verificationButton;
        int iHashCode5 = (iHashCode4 + (verificationButton == null ? 0 : verificationButton.hashCode())) * 31;
        SupportButton supportButton = this.supportButton;
        int iHashCode6 = (iHashCode5 + (supportButton == null ? 0 : supportButton.hashCode())) * 31;
        Badge badge = this.badge;
        int iHashCode7 = (iHashCode6 + (badge == null ? 0 : badge.hashCode())) * 31;
        List<VerificationStep> list = this.steps;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Verification(status=");
        sb2.append(this.status);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", note=");
        sb2.append(this.note);
        sb2.append(", verificationButton=");
        sb2.append(this.verificationButton);
        sb2.append(", supportButton=");
        sb2.append(this.supportButton);
        sb2.append(", badge=");
        sb2.append(this.badge);
        sb2.append(", steps=");
        return H.p(sb2, this.steps, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        VerificationStatus verificationStatus = this.status;
        if (verificationStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(verificationStatus.name());
        }
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Note note = this.note;
        if (note == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            note.writeToParcel(parcel, flags);
        }
        VerificationButton verificationButton = this.verificationButton;
        if (verificationButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verificationButton.writeToParcel(parcel, flags);
        }
        SupportButton supportButton = this.supportButton;
        if (supportButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            supportButton.writeToParcel(parcel, flags);
        }
        Badge badge = this.badge;
        if (badge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badge.writeToParcel(parcel, flags);
        }
        List<VerificationStep> list = this.steps;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((VerificationStep) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
