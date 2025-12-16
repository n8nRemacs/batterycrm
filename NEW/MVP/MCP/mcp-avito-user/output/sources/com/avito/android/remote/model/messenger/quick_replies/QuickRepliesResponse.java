package com.avito.android.remote.model.messenger.quick_replies;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QuickRepliesResponse.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fJ \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/messenger/quick_replies/QuickRepliesResponse;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/messenger/quick_replies/QuickReply;", AttachMenuItem.Replies.KEY, "", "limit", "<init>", "(Ljava/util/List;I)V", "component1", "()Ljava/util/List;", "component2", "()I", "copy", "(Ljava/util/List;I)Lcom/avito/android/remote/model/messenger/quick_replies/QuickRepliesResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getReplies", "I", "getLimit", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class QuickRepliesResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<QuickRepliesResponse> CREATOR = new Creator();

    @c("limit")
    private final int limit;

    @c(AttachMenuItem.Replies.KEY)
    @l
    private final List<QuickReply> replies;

    /* compiled from: QuickRepliesResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QuickRepliesResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final QuickRepliesResponse createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(QuickReply.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new QuickRepliesResponse(arrayList, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final QuickRepliesResponse[] newArray(int i12) {
            return new QuickRepliesResponse[i12];
        }
    }

    public QuickRepliesResponse(@l List<QuickReply> list, int i12) {
        this.replies = list;
        this.limit = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuickRepliesResponse copy$default(QuickRepliesResponse quickRepliesResponse, List list, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = quickRepliesResponse.replies;
        }
        if ((i13 & 2) != 0) {
            i12 = quickRepliesResponse.limit;
        }
        return quickRepliesResponse.copy(list, i12);
    }

    @l
    public final List<QuickReply> component1() {
        return this.replies;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @k
    public final QuickRepliesResponse copy(@l List<QuickReply> replies, int limit) {
        return new QuickRepliesResponse(replies, limit);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickRepliesResponse)) {
            return false;
        }
        QuickRepliesResponse quickRepliesResponse = (QuickRepliesResponse) other;
        return L.f(this.replies, quickRepliesResponse.replies) && this.limit == quickRepliesResponse.limit;
    }

    public final int getLimit() {
        return this.limit;
    }

    @l
    public final List<QuickReply> getReplies() {
        return this.replies;
    }

    public int hashCode() {
        List<QuickReply> list = this.replies;
        return Integer.hashCode(this.limit) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("QuickRepliesResponse(replies=");
        sb2.append(this.replies);
        sb2.append(", limit=");
        return r.t(sb2, this.limit, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<QuickReply> list = this.replies;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((QuickReply) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.limit);
    }
}
