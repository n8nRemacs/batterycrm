package com.avito.android.developments_agency_search.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: GetClientListResponse.kt */
@P
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0007%&'()*+B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006,"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetClientListResponse;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClient;", "clients", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$Counters;", "counters", "<init>", "(Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$Counters;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$Counters;", "copy", "(Ljava/util/List;Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$Counters;)Lcom/avito/android/developments_agency_search/domain/GetClientListResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getClients", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$Counters;", "getCounters", "Counters", "PendingClient", "PendingClientMedia", "PendingClientState", "PendingClientStateColors", "PendingClientStateStatus", "PendingClientStatus", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes13.dex */
public final /* data */ class GetClientListResponse implements Parcelable {
    public static final int $stable = 8;

    @k
    public static final Parcelable.Creator<GetClientListResponse> CREATOR = new a();

    @c("clients")
    @k
    private final List<PendingClient> clients;

    @c("counters")
    @k
    private final Counters counters;

    /* compiled from: GetClientListResponse.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$Counters;", "Landroid/os/Parcelable;", "", "active", "archived", "filtered", "<init>", "(III)V", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$Counters;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getActive", "getArchived", "getFiltered", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Counters implements Parcelable {
        public static final int $stable = 0;

        @k
        public static final Parcelable.Creator<Counters> CREATOR = new a();

        @c("active")
        private final int active;

        @c("archived")
        private final int archived;

        @c("filtered")
        private final int filtered;

        /* compiled from: GetClientListResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Counters> {
            @Override // android.os.Parcelable.Creator
            public final Counters createFromParcel(Parcel parcel) {
                return new Counters(parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Counters[] newArray(int i12) {
                return new Counters[i12];
            }
        }

        public Counters(int i12, int i13, int i14) {
            this.active = i12;
            this.archived = i13;
            this.filtered = i14;
        }

        public static /* synthetic */ Counters copy$default(Counters counters, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i12 = counters.active;
            }
            if ((i15 & 2) != 0) {
                i13 = counters.archived;
            }
            if ((i15 & 4) != 0) {
                i14 = counters.filtered;
            }
            return counters.copy(i12, i13, i14);
        }

        /* renamed from: component1, reason: from getter */
        public final int getActive() {
            return this.active;
        }

        /* renamed from: component2, reason: from getter */
        public final int getArchived() {
            return this.archived;
        }

        /* renamed from: component3, reason: from getter */
        public final int getFiltered() {
            return this.filtered;
        }

        @k
        public final Counters copy(int active, int archived, int filtered) {
            return new Counters(active, archived, filtered);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Counters)) {
                return false;
            }
            Counters counters = (Counters) other;
            return this.active == counters.active && this.archived == counters.archived && this.filtered == counters.filtered;
        }

        public final int getActive() {
            return this.active;
        }

        public final int getArchived() {
            return this.archived;
        }

        public final int getFiltered() {
            return this.filtered;
        }

        public int hashCode() {
            return Integer.hashCode(this.filtered) + r.e(this.archived, Integer.hashCode(this.active) * 31, 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Counters(active=");
            sb2.append(this.active);
            sb2.append(", archived=");
            sb2.append(this.archived);
            sb2.append(", filtered=");
            return r.t(sb2, this.filtered, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.active);
            parcel.writeInt(this.archived);
            parcel.writeInt(this.filtered);
        }
    }

    /* compiled from: GetClientListResponse.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J|\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010)J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020'HÖ\u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b<\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b=\u0010\u0015R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b@\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010!R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bD\u0010#¨\u0006E"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClient;", "Landroid/os/Parcelable;", "", "id", "", "viewed", "name", "Lcom/avito/android/remote/model/Image;", "avatar", "phone", "email", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientMedia;", "media", "preferences", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStatus;", "status", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientState;", VoiceInfo.STATE, "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientMedia;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStatus;Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientState;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "component6", "component7", "()Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientMedia;", "component8", "component9", "()Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStatus;", "component10", "()Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientState;", "copy", "(Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientMedia;Ljava/lang/String;Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStatus;Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientState;)Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClient;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Z", "getViewed", "getName", "Lcom/avito/android/remote/model/Image;", "getAvatar", "getPhone", "getEmail", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientMedia;", "getMedia", "getPreferences", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStatus;", "getStatus", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientState;", "getState", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class PendingClient implements Parcelable {
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<PendingClient> CREATOR = new a();

        @c("avatar")
        @l
        private final Image avatar;

        @c("email")
        @l
        private final String email;

        @c("id")
        @k
        private final String id;

        @c("media")
        @k
        private final PendingClientMedia media;

        @c("name")
        @k
        private final String name;

        @c("phone")
        @l
        private final String phone;

        @c("preferences")
        @l
        private final String preferences;

        @c(VoiceInfo.STATE)
        @k
        private final PendingClientState state;

        @c("status")
        @k
        private final PendingClientStatus status;

        @c("viewed")
        private final boolean viewed;

        /* compiled from: GetClientListResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PendingClient> {
            @Override // android.os.Parcelable.Creator
            public final PendingClient createFromParcel(Parcel parcel) {
                return new PendingClient(parcel.readString(), parcel.readInt() != 0, parcel.readString(), (Image) parcel.readParcelable(PendingClient.class.getClassLoader()), parcel.readString(), parcel.readString(), PendingClientMedia.CREATOR.createFromParcel(parcel), parcel.readString(), PendingClientStatus.valueOf(parcel.readString()), PendingClientState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final PendingClient[] newArray(int i12) {
                return new PendingClient[i12];
            }
        }

        public PendingClient(@k String str, boolean z12, @k String str2, @l Image image, @l String str3, @l String str4, @k PendingClientMedia pendingClientMedia, @l String str5, @k PendingClientStatus pendingClientStatus, @k PendingClientState pendingClientState) {
            this.id = str;
            this.viewed = z12;
            this.name = str2;
            this.avatar = image;
            this.phone = str3;
            this.email = str4;
            this.media = pendingClientMedia;
            this.preferences = str5;
            this.status = pendingClientStatus;
            this.state = pendingClientState;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component10, reason: from getter */
        public final PendingClientState getState() {
            return this.state;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getViewed() {
            return this.viewed;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getAvatar() {
            return this.avatar;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @k
        /* renamed from: component7, reason: from getter */
        public final PendingClientMedia getMedia() {
            return this.media;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final String getPreferences() {
            return this.preferences;
        }

        @k
        /* renamed from: component9, reason: from getter */
        public final PendingClientStatus getStatus() {
            return this.status;
        }

        @k
        public final PendingClient copy(@k String id2, boolean viewed, @k String name, @l Image avatar, @l String phone, @l String email, @k PendingClientMedia media, @l String preferences, @k PendingClientStatus status, @k PendingClientState state) {
            return new PendingClient(id2, viewed, name, avatar, phone, email, media, preferences, status, state);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingClient)) {
                return false;
            }
            PendingClient pendingClient = (PendingClient) other;
            return L.f(this.id, pendingClient.id) && this.viewed == pendingClient.viewed && L.f(this.name, pendingClient.name) && L.f(this.avatar, pendingClient.avatar) && L.f(this.phone, pendingClient.phone) && L.f(this.email, pendingClient.email) && L.f(this.media, pendingClient.media) && L.f(this.preferences, pendingClient.preferences) && this.status == pendingClient.status && L.f(this.state, pendingClient.state);
        }

        @l
        public final Image getAvatar() {
            return this.avatar;
        }

        @l
        public final String getEmail() {
            return this.email;
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final PendingClientMedia getMedia() {
            return this.media;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @l
        public final String getPhone() {
            return this.phone;
        }

        @l
        public final String getPreferences() {
            return this.preferences;
        }

        @k
        public final PendingClientState getState() {
            return this.state;
        }

        @k
        public final PendingClientStatus getStatus() {
            return this.status;
        }

        public final boolean getViewed() {
            return this.viewed;
        }

        public int hashCode() {
            int iD2 = H.d(r.i(this.id.hashCode() * 31, 31, this.viewed), 31, this.name);
            Image image = this.avatar;
            int iHashCode = (iD2 + (image == null ? 0 : image.hashCode())) * 31;
            String str = this.phone;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.email;
            int iHashCode3 = (this.media.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.preferences;
            int iHashCode4 = str3 != null ? str3.hashCode() : 0;
            return this.state.hashCode() + ((this.status.hashCode() + ((iHashCode3 + iHashCode4) * 31)) * 31);
        }

        @k
        public String toString() {
            return "PendingClient(id=" + this.id + ", viewed=" + this.viewed + ", name=" + this.name + ", avatar=" + this.avatar + ", phone=" + this.phone + ", email=" + this.email + ", media=" + this.media + ", preferences=" + this.preferences + ", status=" + this.status + ", state=" + this.state + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeInt(this.viewed ? 1 : 0);
            parcel.writeString(this.name);
            parcel.writeParcelable(this.avatar, flags);
            parcel.writeString(this.phone);
            parcel.writeString(this.email);
            this.media.writeToParcel(parcel, flags);
            parcel.writeString(this.preferences);
            parcel.writeString(this.status.name());
            this.state.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: GetClientListResponse.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientMedia;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Lcom/avito/android/remote/model/Image;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "copy", "(Lcom/avito/android/remote/model/Image;)Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientMedia;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class PendingClientMedia implements Parcelable {
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<PendingClientMedia> CREATOR = new a();

        @c("image")
        @k
        private final Image image;

        /* compiled from: GetClientListResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PendingClientMedia> {
            @Override // android.os.Parcelable.Creator
            public final PendingClientMedia createFromParcel(Parcel parcel) {
                return new PendingClientMedia((Image) parcel.readParcelable(PendingClientMedia.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PendingClientMedia[] newArray(int i12) {
                return new PendingClientMedia[i12];
            }
        }

        public PendingClientMedia(@k Image image) {
            this.image = image;
        }

        public static /* synthetic */ PendingClientMedia copy$default(PendingClientMedia pendingClientMedia, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                image = pendingClientMedia.image;
            }
            return pendingClientMedia.copy(image);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        public final PendingClientMedia copy(@k Image image) {
            return new PendingClientMedia(image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PendingClientMedia) && L.f(this.image, ((PendingClientMedia) other).image);
        }

        @k
        public final Image getImage() {
            return this.image;
        }

        public int hashCode() {
            return this.image.hashCode();
        }

        @k
        public String toString() {
            return AK.c.o(new StringBuilder("PendingClientMedia(image="), this.image, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
        }
    }

    /* compiled from: GetClientListResponse.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JF\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b*\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0015¨\u0006/"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientState;", "Landroid/os/Parcelable;", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateStatus;", "status", "", "title", "text", "", "progress", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateColors;", "colors", "<init>", "(Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateStatus;Ljava/lang/String;Ljava/lang/String;ILcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateColors;)V", "component1", "()Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateStatus;", "component2", "()Ljava/lang/String;", "component3", "component4", "()I", "component5", "()Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateColors;", "copy", "(Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateStatus;Ljava/lang/String;Ljava/lang/String;ILcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateColors;)Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientState;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateStatus;", "getStatus", "Ljava/lang/String;", "getTitle", "getText", "I", "getProgress", "Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateColors;", "getColors", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class PendingClientState implements Parcelable {
        public static final int $stable = 0;

        @k
        public static final Parcelable.Creator<PendingClientState> CREATOR = new a();

        @c("colors")
        @k
        private final PendingClientStateColors colors;

        @c("progress")
        private final int progress;

        @c("status")
        @k
        private final PendingClientStateStatus status;

        @c("text")
        @l
        private final String text;

        @c("title")
        @l
        private final String title;

        /* compiled from: GetClientListResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PendingClientState> {
            @Override // android.os.Parcelable.Creator
            public final PendingClientState createFromParcel(Parcel parcel) {
                return new PendingClientState(PendingClientStateStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt(), PendingClientStateColors.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final PendingClientState[] newArray(int i12) {
                return new PendingClientState[i12];
            }
        }

        public PendingClientState(@k PendingClientStateStatus pendingClientStateStatus, @l String str, @l String str2, int i12, @k PendingClientStateColors pendingClientStateColors) {
            this.status = pendingClientStateStatus;
            this.title = str;
            this.text = str2;
            this.progress = i12;
            this.colors = pendingClientStateColors;
        }

        public static /* synthetic */ PendingClientState copy$default(PendingClientState pendingClientState, PendingClientStateStatus pendingClientStateStatus, String str, String str2, int i12, PendingClientStateColors pendingClientStateColors, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                pendingClientStateStatus = pendingClientState.status;
            }
            if ((i13 & 2) != 0) {
                str = pendingClientState.title;
            }
            String str3 = str;
            if ((i13 & 4) != 0) {
                str2 = pendingClientState.text;
            }
            String str4 = str2;
            if ((i13 & 8) != 0) {
                i12 = pendingClientState.progress;
            }
            int i14 = i12;
            if ((i13 & 16) != 0) {
                pendingClientStateColors = pendingClientState.colors;
            }
            return pendingClientState.copy(pendingClientStateStatus, str3, str4, i14, pendingClientStateColors);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final PendingClientStateStatus getStatus() {
            return this.status;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final int getProgress() {
            return this.progress;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final PendingClientStateColors getColors() {
            return this.colors;
        }

        @k
        public final PendingClientState copy(@k PendingClientStateStatus status, @l String title, @l String text, int progress, @k PendingClientStateColors colors) {
            return new PendingClientState(status, title, text, progress, colors);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingClientState)) {
                return false;
            }
            PendingClientState pendingClientState = (PendingClientState) other;
            return this.status == pendingClientState.status && L.f(this.title, pendingClientState.title) && L.f(this.text, pendingClientState.text) && this.progress == pendingClientState.progress && L.f(this.colors, pendingClientState.colors);
        }

        @k
        public final PendingClientStateColors getColors() {
            return this.colors;
        }

        public final int getProgress() {
            return this.progress;
        }

        @k
        public final PendingClientStateStatus getStatus() {
            return this.status;
        }

        @l
        public final String getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.status.hashCode() * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            return this.colors.hashCode() + r.e(this.progress, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        }

        @k
        public String toString() {
            return "PendingClientState(status=" + this.status + ", title=" + this.title + ", text=" + this.text + ", progress=" + this.progress + ", colors=" + this.colors + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.status.name());
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            parcel.writeInt(this.progress);
            this.colors.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: GetClientListResponse.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateColors;", "Landroid/os/Parcelable;", "", "title", "text", "progress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateColors;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getText", "getProgress", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class PendingClientStateColors implements Parcelable {
        public static final int $stable = 0;

        @k
        public static final Parcelable.Creator<PendingClientStateColors> CREATOR = new a();

        @c("progress")
        @l
        private final String progress;

        @c("text")
        @l
        private final String text;

        @c("title")
        @l
        private final String title;

        /* compiled from: GetClientListResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PendingClientStateColors> {
            @Override // android.os.Parcelable.Creator
            public final PendingClientStateColors createFromParcel(Parcel parcel) {
                return new PendingClientStateColors(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PendingClientStateColors[] newArray(int i12) {
                return new PendingClientStateColors[i12];
            }
        }

        public PendingClientStateColors(@l String str, @l String str2, @l String str3) {
            this.title = str;
            this.text = str2;
            this.progress = str3;
        }

        public static /* synthetic */ PendingClientStateColors copy$default(PendingClientStateColors pendingClientStateColors, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = pendingClientStateColors.title;
            }
            if ((i12 & 2) != 0) {
                str2 = pendingClientStateColors.text;
            }
            if ((i12 & 4) != 0) {
                str3 = pendingClientStateColors.progress;
            }
            return pendingClientStateColors.copy(str, str2, str3);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getProgress() {
            return this.progress;
        }

        @k
        public final PendingClientStateColors copy(@l String title, @l String text, @l String progress) {
            return new PendingClientStateColors(title, text, progress);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PendingClientStateColors)) {
                return false;
            }
            PendingClientStateColors pendingClientStateColors = (PendingClientStateColors) other;
            return L.f(this.title, pendingClientStateColors.title) && L.f(this.text, pendingClientStateColors.text) && L.f(this.progress, pendingClientStateColors.progress);
        }

        @l
        public final String getProgress() {
            return this.progress;
        }

        @l
        public final String getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.progress;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PendingClientStateColors(title=");
            sb2.append(this.title);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", progress=");
            return C22026a.c(sb2, this.progress, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            parcel.writeString(this.progress);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetClientListResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateStatus;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "SELECTION", "BINDING", "BOOKING_REQUESTED", "BOOKED", "REVENUE_REQUEST_PENDING", "REVENUE_REQUEST_SENT", "REVENUE_REQUEST_PAY_WAITING", "REVENUE_REQUEST_DENIED", "REVENUE_REQUEST_CONFIRMED", "COMPLETED", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PendingClientStateStatus {

        @c("binding")
        public static final PendingClientStateStatus BINDING;

        @c("booked")
        public static final PendingClientStateStatus BOOKED;

        @c("booking_requested")
        public static final PendingClientStateStatus BOOKING_REQUESTED;

        @c("completed")
        public static final PendingClientStateStatus COMPLETED;

        @c("revenue_request_confirmed")
        public static final PendingClientStateStatus REVENUE_REQUEST_CONFIRMED;

        @c("revenue_request_denied")
        public static final PendingClientStateStatus REVENUE_REQUEST_DENIED;

        @c("revenue_request_pay_waiting")
        public static final PendingClientStateStatus REVENUE_REQUEST_PAY_WAITING;

        @c("revenue_request_pending")
        public static final PendingClientStateStatus REVENUE_REQUEST_PENDING;

        @c("revenue_request_sent")
        public static final PendingClientStateStatus REVENUE_REQUEST_SENT;

        @c("selection")
        public static final PendingClientStateStatus SELECTION;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PendingClientStateStatus[] f136502b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f136503c;

        /* compiled from: GetClientListResponse.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStateStatus$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            PendingClientStateStatus pendingClientStateStatus = new PendingClientStateStatus("SELECTION", 0, "selection");
            SELECTION = pendingClientStateStatus;
            PendingClientStateStatus pendingClientStateStatus2 = new PendingClientStateStatus("BINDING", 1, "binding");
            BINDING = pendingClientStateStatus2;
            PendingClientStateStatus pendingClientStateStatus3 = new PendingClientStateStatus("BOOKING_REQUESTED", 2, "booking_requested");
            BOOKING_REQUESTED = pendingClientStateStatus3;
            PendingClientStateStatus pendingClientStateStatus4 = new PendingClientStateStatus("BOOKED", 3, "booked");
            BOOKED = pendingClientStateStatus4;
            PendingClientStateStatus pendingClientStateStatus5 = new PendingClientStateStatus("REVENUE_REQUEST_PENDING", 4, "revenue_request_pending");
            REVENUE_REQUEST_PENDING = pendingClientStateStatus5;
            PendingClientStateStatus pendingClientStateStatus6 = new PendingClientStateStatus("REVENUE_REQUEST_SENT", 5, "revenue_request_sent");
            REVENUE_REQUEST_SENT = pendingClientStateStatus6;
            PendingClientStateStatus pendingClientStateStatus7 = new PendingClientStateStatus("REVENUE_REQUEST_PAY_WAITING", 6, "revenue_request_pay_waiting");
            REVENUE_REQUEST_PAY_WAITING = pendingClientStateStatus7;
            PendingClientStateStatus pendingClientStateStatus8 = new PendingClientStateStatus("REVENUE_REQUEST_DENIED", 7, "revenue_request_denied");
            REVENUE_REQUEST_DENIED = pendingClientStateStatus8;
            PendingClientStateStatus pendingClientStateStatus9 = new PendingClientStateStatus("REVENUE_REQUEST_CONFIRMED", 8, "revenue_request_confirmed");
            REVENUE_REQUEST_CONFIRMED = pendingClientStateStatus9;
            PendingClientStateStatus pendingClientStateStatus10 = new PendingClientStateStatus("COMPLETED", 9, "completed");
            COMPLETED = pendingClientStateStatus10;
            PendingClientStateStatus[] pendingClientStateStatusArr = {pendingClientStateStatus, pendingClientStateStatus2, pendingClientStateStatus3, pendingClientStateStatus4, pendingClientStateStatus5, pendingClientStateStatus6, pendingClientStateStatus7, pendingClientStateStatus8, pendingClientStateStatus9, pendingClientStateStatus10};
            f136502b = pendingClientStateStatusArr;
            f136503c = kotlin.enums.c.a(pendingClientStateStatusArr);
            new a(null);
        }

        private PendingClientStateStatus(String str, int i12, String str2) {
        }

        public static PendingClientStateStatus valueOf(String str) {
            return (PendingClientStateStatus) Enum.valueOf(PendingClientStateStatus.class, str);
        }

        public static PendingClientStateStatus[] values() {
            return (PendingClientStateStatus[]) f136502b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetClientListResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/domain/GetClientListResponse$PendingClientStatus;", "", "(Ljava/lang/String;I)V", "ACTIVE", "EXPIRING", "ARCHIVED", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PendingClientStatus {

        @c("active")
        public static final PendingClientStatus ACTIVE;

        @c("archived")
        public static final PendingClientStatus ARCHIVED;

        @c("expiring")
        public static final PendingClientStatus EXPIRING;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PendingClientStatus[] f136504b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f136505c;

        static {
            PendingClientStatus pendingClientStatus = new PendingClientStatus("ACTIVE", 0);
            ACTIVE = pendingClientStatus;
            PendingClientStatus pendingClientStatus2 = new PendingClientStatus("EXPIRING", 1);
            EXPIRING = pendingClientStatus2;
            PendingClientStatus pendingClientStatus3 = new PendingClientStatus("ARCHIVED", 2);
            ARCHIVED = pendingClientStatus3;
            PendingClientStatus[] pendingClientStatusArr = {pendingClientStatus, pendingClientStatus2, pendingClientStatus3};
            f136504b = pendingClientStatusArr;
            f136505c = kotlin.enums.c.a(pendingClientStatusArr);
        }

        private PendingClientStatus(String str, int i12) {
        }

        public static PendingClientStatus valueOf(String str) {
            return (PendingClientStatus) Enum.valueOf(PendingClientStatus.class, str);
        }

        public static PendingClientStatus[] values() {
            return (PendingClientStatus[]) f136504b.clone();
        }
    }

    /* compiled from: GetClientListResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GetClientListResponse> {
        @Override // android.os.Parcelable.Creator
        public final GetClientListResponse createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(PendingClient.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GetClientListResponse(arrayList, Counters.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GetClientListResponse[] newArray(int i12) {
            return new GetClientListResponse[i12];
        }
    }

    public GetClientListResponse(@k List<PendingClient> list, @k Counters counters) {
        this.clients = list;
        this.counters = counters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetClientListResponse copy$default(GetClientListResponse getClientListResponse, List list, Counters counters, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = getClientListResponse.clients;
        }
        if ((i12 & 2) != 0) {
            counters = getClientListResponse.counters;
        }
        return getClientListResponse.copy(list, counters);
    }

    @k
    public final List<PendingClient> component1() {
        return this.clients;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Counters getCounters() {
        return this.counters;
    }

    @k
    public final GetClientListResponse copy(@k List<PendingClient> clients, @k Counters counters) {
        return new GetClientListResponse(clients, counters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetClientListResponse)) {
            return false;
        }
        GetClientListResponse getClientListResponse = (GetClientListResponse) other;
        return L.f(this.clients, getClientListResponse.clients) && L.f(this.counters, getClientListResponse.counters);
    }

    @k
    public final List<PendingClient> getClients() {
        return this.clients;
    }

    @k
    public final Counters getCounters() {
        return this.counters;
    }

    public int hashCode() {
        return this.counters.hashCode() + (this.clients.hashCode() * 31);
    }

    @k
    public String toString() {
        return "GetClientListResponse(clients=" + this.clients + ", counters=" + this.counters + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.clients, parcel);
        while (itJ.hasNext()) {
            ((PendingClient) itJ.next()).writeToParcel(parcel, flags);
        }
        this.counters.writeToParcel(parcel, flags);
    }
}
