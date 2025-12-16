package com.avito.android.advert_core.feature_teasers.common.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.advert_core.feature_teasers.common.AdvertDetailsFeatureTeaserOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsFeatureTeaserDialogInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/dialog/AdvertDetailsFeatureTeaserDialogInfo;", "Landroid/os/Parcelable;", "()V", "CheckedByAvito", "FeaturesList", "Lcom/avito/android/advert_core/feature_teasers/common/dialog/AdvertDetailsFeatureTeaserDialogInfo$CheckedByAvito;", "Lcom/avito/android/advert_core/feature_teasers/common/dialog/AdvertDetailsFeatureTeaserDialogInfo$FeaturesList;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class AdvertDetailsFeatureTeaserDialogInfo implements Parcelable {

    /* compiled from: AdvertDetailsFeatureTeaserDialogInfo.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/dialog/AdvertDetailsFeatureTeaserDialogInfo$CheckedByAvito;", "Lcom/avito/android/advert_core/feature_teasers/common/dialog/AdvertDetailsFeatureTeaserDialogInfo;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CheckedByAvito extends AdvertDetailsFeatureTeaserDialogInfo {

        @Y61.k
        public static final Parcelable.Creator<CheckedByAvito> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AdvertDetailsFeatureTeaserOption f83614b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f83615c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f83616d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f83617e;

        /* compiled from: AdvertDetailsFeatureTeaserDialogInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CheckedByAvito> {
            @Override // android.os.Parcelable.Creator
            public final CheckedByAvito createFromParcel(Parcel parcel) {
                AdvertDetailsFeatureTeaserOption advertDetailsFeatureTeaserOptionCreateFromParcel = AdvertDetailsFeatureTeaserOption.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AdvertDetailsFeatureTeaserOption.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new CheckedByAvito(advertDetailsFeatureTeaserOptionCreateFromParcel, string, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CheckedByAvito[] newArray(int i12) {
                return new CheckedByAvito[i12];
            }
        }

        public CheckedByAvito(@Y61.k AdvertDetailsFeatureTeaserOption advertDetailsFeatureTeaserOption, @Y61.k String str, @Y61.k ArrayList arrayList, @Y61.k String str2) {
            super(null);
            this.f83614b = advertDetailsFeatureTeaserOption;
            this.f83615c = str;
            this.f83616d = arrayList;
            this.f83617e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            this.f83614b.writeToParcel(parcel, i12);
            parcel.writeString(this.f83615c);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f83616d, parcel);
            while (itZ.hasNext()) {
                ((AdvertDetailsFeatureTeaserOption) itZ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeString(this.f83617e);
        }
    }

    /* compiled from: AdvertDetailsFeatureTeaserDialogInfo.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/dialog/AdvertDetailsFeatureTeaserDialogInfo$FeaturesList;", "Lcom/avito/android/advert_core/feature_teasers/common/dialog/AdvertDetailsFeatureTeaserDialogInfo;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FeaturesList extends AdvertDetailsFeatureTeaserDialogInfo {

        @Y61.k
        public static final Parcelable.Creator<FeaturesList> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f83618b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f83619c;

        /* compiled from: AdvertDetailsFeatureTeaserDialogInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FeaturesList> {
            @Override // android.os.Parcelable.Creator
            public final FeaturesList createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
                }
                return new FeaturesList(linkedHashMap, string);
            }

            @Override // android.os.Parcelable.Creator
            public final FeaturesList[] newArray(int i12) {
                return new FeaturesList[i12];
            }
        }

        public FeaturesList(@Y61.k LinkedHashMap linkedHashMap, @Y61.k String str) {
            super(null);
            this.f83618b = str;
            this.f83619c = linkedHashMap;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f83618b);
            LinkedHashMap linkedHashMap = this.f83619c;
            parcel.writeInt(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeStringList((List) entry.getValue());
            }
        }
    }

    public /* synthetic */ AdvertDetailsFeatureTeaserDialogInfo(C42822w c42822w) {
        this();
    }

    public AdvertDetailsFeatureTeaserDialogInfo() {
    }
}
