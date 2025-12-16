package com.avito.android.sx_address.new_address.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.sx_address.new_address.domain.AddressType;
import com.avito.android.sx_address.new_address.domain.DetailItem;
import com.avito.android.sx_address.new_address.domain.HideAddress;
import com.avito.android.sx_address.new_address.domain.ScheduleType;
import com.avito.android.sx_address.new_address.domain.WorkingHours;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviViewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SxNewAddressMviViewState.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState;", "Landroid/os/Parcelable;", "AddressContent", "a", "ContentPart", "DetailsContent", "LoadingType", "TitleContent", "TypesContent", "WorkingSchedulerContent", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SxNewAddressMviState implements Parcelable {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final SxNewAddressMviState f293713k;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LoadingType f293714b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SxNewAddressMviViewState f293715c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AddressContent f293716d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TitleContent f293717e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TypesContent f293718f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final DetailsContent f293719g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final WorkingSchedulerContent f293720h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final AttributedText f293721i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final a f293712j = new a(null);

    @Y61.k
    public static final Parcelable.Creator<SxNewAddressMviState> CREATOR = new b();

    /* compiled from: SxNewAddressMviViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$AddressContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$ContentPart;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddressContent extends ContentPart {

        @Y61.k
        public static final Parcelable.Creator<AddressContent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f293722b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f293723c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final HideAddress f293724d;

        /* compiled from: SxNewAddressMviViewState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AddressContent> {
            @Override // android.os.Parcelable.Creator
            public final AddressContent createFromParcel(Parcel parcel) {
                return new AddressContent(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : HideAddress.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AddressContent[] newArray(int i12) {
                return new AddressContent[i12];
            }
        }

        public /* synthetic */ AddressContent(String str, boolean z12, HideAddress hideAddress, int i12, C42822w c42822w) {
            this(str, z12, (i12 & 4) != 0 ? null : hideAddress);
        }

        public static AddressContent a(AddressContent addressContent, HideAddress hideAddress, int i12) {
            String str = (i12 & 1) != 0 ? addressContent.f293722b : null;
            boolean z12 = addressContent.f293723c;
            if ((i12 & 4) != 0) {
                hideAddress = addressContent.f293724d;
            }
            addressContent.getClass();
            return new AddressContent(str, z12, hideAddress);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressContent)) {
                return false;
            }
            AddressContent addressContent = (AddressContent) obj;
            return L.f(this.f293722b, addressContent.f293722b) && this.f293723c == addressContent.f293723c && L.f(this.f293724d, addressContent.f293724d);
        }

        public final int hashCode() {
            String str = this.f293722b;
            int i12 = androidx.appcompat.app.r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f293723c);
            HideAddress hideAddress = this.f293724d;
            return i12 + (hideAddress != null ? hideAddress.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "AddressContent(address=" + this.f293722b + ", isEditFlow=" + this.f293723c + ", hideAddress=" + this.f293724d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f293722b);
            parcel.writeInt(this.f293723c ? 1 : 0);
            HideAddress hideAddress = this.f293724d;
            if (hideAddress == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                hideAddress.writeToParcel(parcel, i12);
            }
        }

        public AddressContent(@Y61.l String str, boolean z12, @Y61.l HideAddress hideAddress) {
            super(null);
            this.f293722b = str;
            this.f293723c = z12;
            this.f293724d = hideAddress;
        }
    }

    /* compiled from: SxNewAddressMviViewState.kt */
    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$ContentPart;", "Landroid/os/Parcelable;", "()V", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$AddressContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$DetailsContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$TitleContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$TypesContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$WorkingSchedulerContent;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static abstract class ContentPart implements Parcelable {
        public /* synthetic */ ContentPart(C42822w c42822w) {
            this();
        }

        public ContentPart() {
        }
    }

    /* compiled from: SxNewAddressMviViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$DetailsContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$ContentPart;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DetailsContent extends ContentPart {

        @Y61.k
        public static final Parcelable.Creator<DetailsContent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Object f293725b;

        /* compiled from: SxNewAddressMviViewState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DetailsContent> {
            @Override // android.os.Parcelable.Creator
            public final DetailsContent createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(DetailItem.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new DetailsContent(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final DetailsContent[] newArray(int i12) {
                return new DetailsContent[i12];
            }
        }

        public DetailsContent(@Y61.k List<DetailItem> list) {
            super(null);
            this.f293725b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DetailsContent) && L.f(this.f293725b, ((DetailsContent) obj).f293725b);
        }

        public final int hashCode() {
            return this.f293725b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.foundation.H.n(new StringBuilder("DetailsContent(details="), this.f293725b, ')');
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            ?? r02 = this.f293725b;
            parcel.writeInt(r02.size());
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                ((DetailItem) it.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SxNewAddressMviViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$LoadingType;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingType {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingType f293726b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingType f293727c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingType f293728d;

        /* renamed from: e, reason: collision with root package name */
        public static final LoadingType f293729e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ LoadingType[] f293730f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f293731g;

        static {
            LoadingType loadingType = new LoadingType("NONE", 0);
            f293726b = loadingType;
            LoadingType loadingType2 = new LoadingType("LOADING", 1);
            f293727c = loadingType2;
            LoadingType loadingType3 = new LoadingType("SAVE_LOADING", 2);
            f293728d = loadingType3;
            LoadingType loadingType4 = new LoadingType("NETWORK_ERROR", 3);
            f293729e = loadingType4;
            LoadingType[] loadingTypeArr = {loadingType, loadingType2, loadingType3, loadingType4};
            f293730f = loadingTypeArr;
            f293731g = kotlin.enums.c.a(loadingTypeArr);
        }

        public LoadingType() {
            throw null;
        }

        public static LoadingType valueOf(String str) {
            return (LoadingType) Enum.valueOf(LoadingType.class, str);
        }

        public static LoadingType[] values() {
            return (LoadingType[]) f293730f.clone();
        }
    }

    /* compiled from: SxNewAddressMviViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$TitleContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$ContentPart;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TitleContent extends ContentPart {

        @Y61.k
        public static final Parcelable.Creator<TitleContent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f293732b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f293733c;

        /* compiled from: SxNewAddressMviViewState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TitleContent> {
            @Override // android.os.Parcelable.Creator
            public final TitleContent createFromParcel(Parcel parcel) {
                return new TitleContent(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TitleContent[] newArray(int i12) {
                return new TitleContent[i12];
            }
        }

        public TitleContent(@Y61.l String str, @Y61.l String str2) {
            super(null);
            this.f293732b = str;
            this.f293733c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TitleContent)) {
                return false;
            }
            TitleContent titleContent = (TitleContent) obj;
            return L.f(this.f293732b, titleContent.f293732b) && L.f(this.f293733c, titleContent.f293733c);
        }

        public final int hashCode() {
            String str = this.f293732b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f293733c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TitleContent(title=");
            sb2.append(this.f293732b);
            sb2.append(", required=");
            return C22026a.c(sb2, this.f293733c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f293732b);
            parcel.writeString(this.f293733c);
        }
    }

    /* compiled from: SxNewAddressMviViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$TypesContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$ContentPart;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TypesContent extends ContentPart {

        @Y61.k
        public static final Parcelable.Creator<TypesContent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Object f293734b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f293735c;

        /* compiled from: SxNewAddressMviViewState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TypesContent> {
            @Override // android.os.Parcelable.Creator
            public final TypesContent createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AddressType.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new TypesContent(arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypesContent[] newArray(int i12) {
                return new TypesContent[i12];
            }
        }

        public TypesContent(@Y61.k List<AddressType> list, @Y61.l String str) {
            super(null);
            this.f293734b = list;
            this.f293735c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TypesContent)) {
                return false;
            }
            TypesContent typesContent = (TypesContent) obj;
            return L.f(this.f293734b, typesContent.f293734b) && L.f(this.f293735c, typesContent.f293735c);
        }

        public final int hashCode() {
            int iHashCode = this.f293734b.hashCode() * 31;
            String str = this.f293735c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TypesContent(types=");
            sb2.append(this.f293734b);
            sb2.append(", required=");
            return C22026a.c(sb2, this.f293735c, ')');
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            ?? r02 = this.f293734b;
            parcel.writeInt(r02.size());
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                ((AddressType) it.next()).writeToParcel(parcel, i12);
            }
            parcel.writeString(this.f293735c);
        }
    }

    /* compiled from: SxNewAddressMviViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$WorkingSchedulerContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$ContentPart;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WorkingSchedulerContent extends ContentPart {

        @Y61.k
        public static final Parcelable.Creator<WorkingSchedulerContent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final WorkingHours f293736b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ScheduleType f293737c;

        /* compiled from: SxNewAddressMviViewState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WorkingSchedulerContent> {
            @Override // android.os.Parcelable.Creator
            public final WorkingSchedulerContent createFromParcel(Parcel parcel) {
                return new WorkingSchedulerContent(WorkingHours.CREATOR.createFromParcel(parcel), ScheduleType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final WorkingSchedulerContent[] newArray(int i12) {
                return new WorkingSchedulerContent[i12];
            }
        }

        public WorkingSchedulerContent(@Y61.k WorkingHours workingHours, @Y61.k ScheduleType scheduleType) {
            super(null);
            this.f293736b = workingHours;
            this.f293737c = scheduleType;
        }

        public static WorkingSchedulerContent a(WorkingSchedulerContent workingSchedulerContent, WorkingHours workingHours, ScheduleType scheduleType, int i12) {
            if ((i12 & 1) != 0) {
                workingHours = workingSchedulerContent.f293736b;
            }
            if ((i12 & 2) != 0) {
                scheduleType = workingSchedulerContent.f293737c;
            }
            workingSchedulerContent.getClass();
            return new WorkingSchedulerContent(workingHours, scheduleType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkingSchedulerContent)) {
                return false;
            }
            WorkingSchedulerContent workingSchedulerContent = (WorkingSchedulerContent) obj;
            return L.f(this.f293736b, workingSchedulerContent.f293736b) && this.f293737c == workingSchedulerContent.f293737c;
        }

        public final int hashCode() {
            return this.f293737c.hashCode() + (this.f293736b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "WorkingSchedulerContent(hours=" + this.f293736b + ", selectedSchedule=" + this.f293737c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            this.f293736b.writeToParcel(parcel, i12);
            parcel.writeString(this.f293737c.name());
        }
    }

    /* compiled from: SxNewAddressMviViewState.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$a;", "", "<init>", "()V", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$AddressContent;", AddressParameter.TYPE, "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$AddressContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$DetailsContent;", "details", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$DetailsContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$WorkingSchedulerContent;", "schedule", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$WorkingSchedulerContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$TitleContent;", "title", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$TitleContent;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$TypesContent;", "types", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviState$TypesContent;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SxNewAddressMviViewState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SxNewAddressMviState> {
        @Override // android.os.Parcelable.Creator
        public final SxNewAddressMviState createFromParcel(Parcel parcel) {
            return new SxNewAddressMviState(LoadingType.valueOf(parcel.readString()), (SxNewAddressMviViewState) parcel.readParcelable(SxNewAddressMviState.class.getClassLoader()), AddressContent.CREATOR.createFromParcel(parcel), TitleContent.CREATOR.createFromParcel(parcel), TypesContent.CREATOR.createFromParcel(parcel), DetailsContent.CREATOR.createFromParcel(parcel), WorkingSchedulerContent.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(SxNewAddressMviState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SxNewAddressMviState[] newArray(int i12) {
            return new SxNewAddressMviState[i12];
        }
    }

    static {
        AddressContent addressContent = new AddressContent("", false, null, 4, null);
        TitleContent titleContent = new TitleContent(null, null);
        C42784z0 c42784z0 = C42784z0.f406748b;
        f293713k = new SxNewAddressMviState(LoadingType.f293727c, SxNewAddressMviViewState.Loading.f293744b, addressContent, titleContent, new TypesContent(c42784z0, null), new DetailsContent(c42784z0), new WorkingSchedulerContent(new WorkingHours("", P0.c(), P0.c()), ScheduleType.f293619d), null);
    }

    public SxNewAddressMviState(@Y61.k LoadingType loadingType, @Y61.k SxNewAddressMviViewState sxNewAddressMviViewState, @Y61.k AddressContent addressContent, @Y61.k TitleContent titleContent, @Y61.k TypesContent typesContent, @Y61.k DetailsContent detailsContent, @Y61.k WorkingSchedulerContent workingSchedulerContent, @Y61.l AttributedText attributedText) {
        this.f293714b = loadingType;
        this.f293715c = sxNewAddressMviViewState;
        this.f293716d = addressContent;
        this.f293717e = titleContent;
        this.f293718f = typesContent;
        this.f293719g = detailsContent;
        this.f293720h = workingSchedulerContent;
        this.f293721i = attributedText;
    }

    public static SxNewAddressMviState a(SxNewAddressMviState sxNewAddressMviState, LoadingType loadingType, SxNewAddressMviViewState sxNewAddressMviViewState, AddressContent addressContent, TitleContent titleContent, TypesContent typesContent, DetailsContent detailsContent, WorkingSchedulerContent workingSchedulerContent, int i12) {
        LoadingType loadingType2 = (i12 & 1) != 0 ? sxNewAddressMviState.f293714b : loadingType;
        SxNewAddressMviViewState sxNewAddressMviViewState2 = (i12 & 2) != 0 ? sxNewAddressMviState.f293715c : sxNewAddressMviViewState;
        AddressContent addressContent2 = (i12 & 4) != 0 ? sxNewAddressMviState.f293716d : addressContent;
        TitleContent titleContent2 = (i12 & 8) != 0 ? sxNewAddressMviState.f293717e : titleContent;
        TypesContent typesContent2 = (i12 & 16) != 0 ? sxNewAddressMviState.f293718f : typesContent;
        DetailsContent detailsContent2 = (i12 & 32) != 0 ? sxNewAddressMviState.f293719g : detailsContent;
        WorkingSchedulerContent workingSchedulerContent2 = (i12 & 64) != 0 ? sxNewAddressMviState.f293720h : workingSchedulerContent;
        AttributedText attributedText = sxNewAddressMviState.f293721i;
        sxNewAddressMviState.getClass();
        return new SxNewAddressMviState(loadingType2, sxNewAddressMviViewState2, addressContent2, titleContent2, typesContent2, detailsContent2, workingSchedulerContent2, attributedText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SxNewAddressMviState)) {
            return false;
        }
        SxNewAddressMviState sxNewAddressMviState = (SxNewAddressMviState) obj;
        return this.f293714b == sxNewAddressMviState.f293714b && L.f(this.f293715c, sxNewAddressMviState.f293715c) && L.f(this.f293716d, sxNewAddressMviState.f293716d) && L.f(this.f293717e, sxNewAddressMviState.f293717e) && L.f(this.f293718f, sxNewAddressMviState.f293718f) && L.f(this.f293719g, sxNewAddressMviState.f293719g) && L.f(this.f293720h, sxNewAddressMviState.f293720h) && L.f(this.f293721i, sxNewAddressMviState.f293721i);
    }

    public final int hashCode() {
        int iHashCode = (this.f293720h.hashCode() + C23088b.a((this.f293718f.hashCode() + ((this.f293717e.hashCode() + ((this.f293716d.hashCode() + ((this.f293715c.hashCode() + (this.f293714b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f293719g.f293725b)) * 31;
        AttributedText attributedText = this.f293721i;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SxNewAddressMviState(loadingType=");
        sb2.append(this.f293714b);
        sb2.append(", viewState=");
        sb2.append(this.f293715c);
        sb2.append(", addressContent=");
        sb2.append(this.f293716d);
        sb2.append(", titleContent=");
        sb2.append(this.f293717e);
        sb2.append(", typesContent=");
        sb2.append(this.f293718f);
        sb2.append(", detailsContent=");
        sb2.append(this.f293719g);
        sb2.append(", scheduleContent=");
        sb2.append(this.f293720h);
        sb2.append(", legalText=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f293721i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f293714b.name());
        parcel.writeParcelable(this.f293715c, i12);
        this.f293716d.writeToParcel(parcel, i12);
        this.f293717e.writeToParcel(parcel, i12);
        this.f293718f.writeToParcel(parcel, i12);
        this.f293719g.writeToParcel(parcel, i12);
        this.f293720h.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f293721i, i12);
    }
}
