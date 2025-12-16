package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Location.kt */
@InterfaceC19823a
@s0
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001XB\u0085\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b/\u0010'J\u0012\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b4\u0010\"J\u0092\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b7\u0010\u001cJ \u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010'R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bD\u0010'R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bE\u0010'R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bF\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010.R\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010B\u001a\u0004\bK\u0010'\"\u0004\bL\u0010MR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bO\u00101R$\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010P\u001a\u0004\bQ\u00103\"\u0004\bR\u0010SR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bT\u0010\"R\u001a\u0010W\u001a\u00020\u00038VX\u0096\u0004¢\u0006\f\u0012\u0004\bU\u0010V\u001a\u0004\b\u0019\u0010\"¨\u0006Y"}, d2 = {"Lcom/avito/android/remote/model/Location;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Entity;", "", "id", "Lcom/avito/android/remote/model/CaseText;", "names", "", "hasMetro", "hasChildren", "hasDirections", "hasDistricts", "Lcom/avito/android/remote/model/SimpleLocation;", "parent", "Lcom/avito/android/remote/model/Location$From;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "forcedByUser", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "forcedLocationForRecommendation", "internalId", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/CaseText;ZZZZLcom/avito/android/remote/model/SimpleLocation;Lcom/avito/android/remote/model/Location$From;ZLcom/avito/android/remote/model/Coordinates;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "nameCase", "getName", "(I)Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "component1", "component2", "()Lcom/avito/android/remote/model/CaseText;", "component3", "()Z", "component4", "component5", "component6", "component7", "()Lcom/avito/android/remote/model/SimpleLocation;", "component8", "()Lcom/avito/android/remote/model/Location$From;", "component9", "component10", "()Lcom/avito/android/remote/model/Coordinates;", "component11", "()Ljava/lang/Boolean;", "component12", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/CaseText;ZZZZLcom/avito/android/remote/model/SimpleLocation;Lcom/avito/android/remote/model/Location$From;ZLcom/avito/android/remote/model/Coordinates;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/Location;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/CaseText;", "getNames", "Z", "getHasMetro", "getHasChildren", "getHasDirections", "getHasDistricts", "Lcom/avito/android/remote/model/SimpleLocation;", "getParent", "Lcom/avito/android/remote/model/Location$From;", "getFrom", "getForcedByUser", "setForcedByUser", "(Z)V", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "Ljava/lang/Boolean;", "getForcedLocationForRecommendation", "setForcedLocationForRecommendation", "(Ljava/lang/Boolean;)V", "getInternalId", "getName$annotations", "()V", "name", "From", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes17.dex */
public final /* data */ class Location implements Parcelable, Entity<String> {

    @k
    public static final Parcelable.Creator<Location> CREATOR = new Creator();

    @l
    private final Coordinates coordinates;
    private boolean forcedByUser;

    @l
    private Boolean forcedLocationForRecommendation;

    @l
    private final From from;
    private final boolean hasChildren;
    private final boolean hasDirections;
    private final boolean hasDistricts;
    private final boolean hasMetro;

    @k
    private final String id;

    @l
    private final String internalId;

    @k
    private final CaseText names;

    @l
    private final SimpleLocation parent;

    /* compiled from: Location.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Location> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Location createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            CaseText caseTextCreateFromParcel = CaseText.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            SimpleLocation simpleLocationCreateFromParcel = parcel.readInt() == 0 ? null : SimpleLocation.CREATOR.createFromParcel(parcel);
            From fromCreateFromParcel = parcel.readInt() == 0 ? null : From.CREATOR.createFromParcel(parcel);
            boolean z16 = parcel.readInt() != 0;
            Coordinates coordinatesCreateFromParcel = parcel.readInt() == 0 ? null : Coordinates.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Location(string, caseTextCreateFromParcel, z12, z13, z14, z15, simpleLocationCreateFromParcel, fromCreateFromParcel, z16, coordinatesCreateFromParcel, boolValueOf, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Location[] newArray(int i12) {
            return new Location[i12];
        }
    }

    /* compiled from: Location.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/Location$From;", "Landroid/os/Parcelable;", "", "internalId", "name", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/Location$From;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getInternalId", "getName", "getPath", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class From implements Parcelable {

        @k
        public static final Parcelable.Creator<From> CREATOR = new Creator();

        @c("internal_id")
        @l
        private final String internalId;

        @c("name")
        @l
        private final String name;

        @c("path")
        @l
        private final String path;

        /* compiled from: Location.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<From> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final From createFromParcel(@k Parcel parcel) {
                return new From(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final From[] newArray(int i12) {
                return new From[i12];
            }
        }

        public From() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ From copy$default(From from, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = from.internalId;
            }
            if ((i12 & 2) != 0) {
                str2 = from.name;
            }
            if ((i12 & 4) != 0) {
                str3 = from.path;
            }
            return from.copy(str, str2, str3);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getInternalId() {
            return this.internalId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        @k
        public final From copy(@l String internalId, @l String name, @l String path) {
            return new From(internalId, name, path);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof From)) {
                return false;
            }
            From from = (From) other;
            return L.f(this.internalId, from.internalId) && L.f(this.name, from.name) && L.f(this.path, from.path);
        }

        @l
        public final String getInternalId() {
            return this.internalId;
        }

        @l
        public final String getName() {
            return this.name;
        }

        @l
        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            String str = this.internalId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.path;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("From(internalId=");
            sb2.append(this.internalId);
            sb2.append(", name=");
            sb2.append(this.name);
            sb2.append(", path=");
            return C22026a.c(sb2, this.path, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.internalId);
            parcel.writeString(this.name);
            parcel.writeString(this.path);
        }

        public From(@l String str, @l String str2, @l String str3) {
            this.internalId = str;
            this.name = str2;
            this.path = str3;
        }

        public /* synthetic */ From(String str, String str2, String str3, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
        }
    }

    public Location(@k String str, @k CaseText caseText, boolean z12, boolean z13, boolean z14, boolean z15, @l SimpleLocation simpleLocation, @l From from, boolean z16, @l Coordinates coordinates, @l Boolean bool, @l String str2) {
        this.id = str;
        this.names = caseText;
        this.hasMetro = z12;
        this.hasChildren = z13;
        this.hasDirections = z14;
        this.hasDistricts = z15;
        this.parent = simpleLocation;
        this.from = from;
        this.forcedByUser = z16;
        this.coordinates = coordinates;
        this.forcedLocationForRecommendation = bool;
        this.internalId = str2;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final Boolean getForcedLocationForRecommendation() {
        return this.forcedLocationForRecommendation;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getInternalId() {
        return this.internalId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final CaseText getNames() {
        return this.names;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasMetro() {
        return this.hasMetro;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasChildren() {
        return this.hasChildren;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasDirections() {
        return this.hasDirections;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasDistricts() {
        return this.hasDistricts;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final SimpleLocation getParent() {
        return this.parent;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final From getFrom() {
        return this.from;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getForcedByUser() {
        return this.forcedByUser;
    }

    @k
    public final Location copy(@k String id2, @k CaseText names, boolean hasMetro, boolean hasChildren, boolean hasDirections, boolean hasDistricts, @l SimpleLocation parent, @l From from, boolean forcedByUser, @l Coordinates coordinates, @l Boolean forcedLocationForRecommendation, @l String internalId) {
        return new Location(id2, names, hasMetro, hasChildren, hasDirections, hasDistricts, parent, from, forcedByUser, coordinates, forcedLocationForRecommendation, internalId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof Location)) {
            return L.f(((Location) other).getId(), getId());
        }
        return false;
    }

    @l
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    public final boolean getForcedByUser() {
        return this.forcedByUser;
    }

    @l
    public final Boolean getForcedLocationForRecommendation() {
        return this.forcedLocationForRecommendation;
    }

    @l
    public final From getFrom() {
        return this.from;
    }

    public final boolean getHasChildren() {
        return this.hasChildren;
    }

    public final boolean getHasDirections() {
        return this.hasDirections;
    }

    public final boolean getHasDistricts() {
        return this.hasDistricts;
    }

    public final boolean getHasMetro() {
        return this.hasMetro;
    }

    @l
    public final String getInternalId() {
        return this.internalId;
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    /* renamed from: getName */
    public String getF278063c() {
        String name;
        CaseText caseText = this.names;
        return (caseText == null || (name = caseText.getName()) == null) ? "" : name;
    }

    @k
    public final CaseText getNames() {
        return this.names;
    }

    @l
    public final SimpleLocation getParent() {
        return this.parent;
    }

    public int hashCode() {
        return getId().hashCode() + 31;
    }

    public final void setForcedByUser(boolean z12) {
        this.forcedByUser = z12;
    }

    public final void setForcedLocationForRecommendation(@l Boolean bool) {
        this.forcedLocationForRecommendation = bool;
    }

    @k
    public String toString() {
        return "Location[" + getId() + ", " + getF278063c() + ']';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        this.names.writeToParcel(parcel, flags);
        parcel.writeInt(this.hasMetro ? 1 : 0);
        parcel.writeInt(this.hasChildren ? 1 : 0);
        parcel.writeInt(this.hasDirections ? 1 : 0);
        parcel.writeInt(this.hasDistricts ? 1 : 0);
        SimpleLocation simpleLocation = this.parent;
        if (simpleLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            simpleLocation.writeToParcel(parcel, flags);
        }
        From from = this.from;
        if (from == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            from.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.forcedByUser ? 1 : 0);
        Coordinates coordinates = this.coordinates;
        if (coordinates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coordinates.writeToParcel(parcel, flags);
        }
        Boolean bool = this.forcedLocationForRecommendation;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.internalId);
    }

    @Override // com.avito.android.remote.model.Entity
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final String getName(int nameCase) {
        return this.names.getName(nameCase);
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public /* synthetic */ Location(String str, CaseText caseText, boolean z12, boolean z13, boolean z14, boolean z15, SimpleLocation simpleLocation, From from, boolean z16, Coordinates coordinates, Boolean bool, String str2, int i12, C42822w c42822w) {
        this(str, caseText, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? false : z15, (i12 & 64) != 0 ? null : simpleLocation, (i12 & 128) != 0 ? null : from, (i12 & 256) != 0 ? false : z16, (i12 & 512) != 0 ? null : coordinates, (i12 & 1024) != 0 ? null : bool, (i12 & 2048) != 0 ? null : str2);
    }
}
