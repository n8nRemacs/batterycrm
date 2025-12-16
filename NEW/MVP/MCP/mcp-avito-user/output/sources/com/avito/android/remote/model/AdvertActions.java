package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertActions.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/AdvertActions;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/AdvertAction;", "actions", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/ContactsPosition;", "position", "Lcom/avito/android/remote/model/PriorityContactsMethod;", "priorityMethod", "", "earlyAccessEndInfo", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ContactsPosition;Lcom/avito/android/remote/model/PriorityContactsMethod;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/ContactsPosition;", "getPosition", "()Lcom/avito/android/remote/model/ContactsPosition;", "Lcom/avito/android/remote/model/PriorityContactsMethod;", "getPriorityMethod", "()Lcom/avito/android/remote/model/PriorityContactsMethod;", "Ljava/lang/String;", "getEarlyAccessEndInfo", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertActions implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertActions> CREATOR = new Creator();

    @k
    private final List<AdvertAction> actions;

    @l
    private final String earlyAccessEndInfo;

    @l
    private final ContactsPosition position;

    @l
    private final PriorityContactsMethod priorityMethod;

    @l
    private final AttributedText title;

    /* compiled from: AdvertActions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertActions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertActions createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(AdvertActions.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertActions(arrayList, (AttributedText) parcel.readParcelable(AdvertActions.class.getClassLoader()), parcel.readInt() == 0 ? null : ContactsPosition.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PriorityContactsMethod.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertActions[] newArray(int i12) {
            return new AdvertActions[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertActions(@k List<? extends AdvertAction> list, @l AttributedText attributedText, @l ContactsPosition contactsPosition, @l PriorityContactsMethod priorityContactsMethod, @l String str) {
        this.actions = list;
        this.title = attributedText;
        this.position = contactsPosition;
        this.priorityMethod = priorityContactsMethod;
        this.earlyAccessEndInfo = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final List<AdvertAction> getActions() {
        return this.actions;
    }

    @l
    public final String getEarlyAccessEndInfo() {
        return this.earlyAccessEndInfo;
    }

    @l
    public final ContactsPosition getPosition() {
        return this.position;
    }

    @l
    public final PriorityContactsMethod getPriorityMethod() {
        return this.priorityMethod;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.actions, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeParcelable(this.title, flags);
        ContactsPosition contactsPosition = this.position;
        if (contactsPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contactsPosition.writeToParcel(parcel, flags);
        }
        PriorityContactsMethod priorityContactsMethod = this.priorityMethod;
        if (priorityContactsMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priorityContactsMethod.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.earlyAccessEndInfo);
    }

    public /* synthetic */ AdvertActions(List list, AttributedText attributedText, ContactsPosition contactsPosition, PriorityContactsMethod priorityContactsMethod, String str, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : attributedText, (i12 & 4) != 0 ? null : contactsPosition, (i12 & 8) != 0 ? null : priorityContactsMethod, (i12 & 16) != 0 ? null : str);
    }
}
