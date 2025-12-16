package com.avito.android.autoteka.presentation.previewsearch.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.autoteka.helpers.AutotekaItem;
import com.avito.android.autoteka.items.fullScreenError.previewsearch.PreviewSearchFullScreenErrorItem;
import com.avito.android.autoteka.items.preview.PreviewItem;
import com.avito.android.autoteka.items.previewGeneration.PreviewGenerationItem;
import com.avito.android.autoteka.items.readyToPreviewSearch.ReadyToPreviewSearchItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPreviewSearchState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "Data", "FullScreenError", "ReadyToPreviewSearch", "Waiting", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState$Data;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState$FullScreenError;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState$ReadyToPreviewSearch;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState$Waiting;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AutotekaPreviewSearchState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f97628b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f97629c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AutotekaItem f97630d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f97631e;

    /* compiled from: AutotekaPreviewSearchState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState$Data;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Data extends AutotekaPreviewSearchState {

        @k
        public static final Parcelable.Creator<Data> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        @k
        public final PreviewItem f97632f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f97633g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f97634h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f97635i;

        /* compiled from: AutotekaPreviewSearchState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                return new Data(PreviewItem.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i12) {
                return new Data[i12];
            }
        }

        public Data(@k PreviewItem previewItem, @k String str, boolean z12, boolean z13) {
            super(str, z12, previewItem, false, null);
            this.f97632f = previewItem;
            this.f97633g = str;
            this.f97634h = z12;
            this.f97635i = z13;
        }

        @Override // com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState
        /* renamed from: c */
        public final AutotekaItem getF97630d() {
            return this.f97632f;
        }

        @Override // com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState
        @k
        /* renamed from: d, reason: from getter */
        public final String getF97628b() {
            return this.f97633g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState
        /* renamed from: e, reason: from getter */
        public final boolean getF97629c() {
            return this.f97634h;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return L.f(this.f97632f, data.f97632f) && L.f(this.f97633g, data.f97633g) && this.f97634h == data.f97634h && this.f97635i == data.f97635i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97635i) + r.i(H.d(this.f97632f.hashCode() * 31, 31, this.f97633g), 31, this.f97634h);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Data(item=");
            sb2.append(this.f97632f);
            sb2.append(", searchKey=");
            sb2.append(this.f97633g);
            sb2.append(", showInput=");
            sb2.append(this.f97634h);
            sb2.append(", hideExampleReportButton=");
            return r.x(sb2, this.f97635i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f97632f.writeToParcel(parcel, i12);
            parcel.writeString(this.f97633g);
            parcel.writeInt(this.f97634h ? 1 : 0);
            parcel.writeInt(this.f97635i ? 1 : 0);
        }
    }

    /* compiled from: AutotekaPreviewSearchState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState$FullScreenError;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FullScreenError extends AutotekaPreviewSearchState {

        @k
        public static final Parcelable.Creator<FullScreenError> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        @k
        public final PreviewSearchFullScreenErrorItem f97636f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f97637g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f97638h;

        /* compiled from: AutotekaPreviewSearchState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FullScreenError> {
            @Override // android.os.Parcelable.Creator
            public final FullScreenError createFromParcel(Parcel parcel) {
                return new FullScreenError(PreviewSearchFullScreenErrorItem.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final FullScreenError[] newArray(int i12) {
                return new FullScreenError[i12];
            }
        }

        public FullScreenError(@k PreviewSearchFullScreenErrorItem previewSearchFullScreenErrorItem, @k String str, boolean z12) {
            super(str, z12, previewSearchFullScreenErrorItem, false, null);
            this.f97636f = previewSearchFullScreenErrorItem;
            this.f97637g = str;
            this.f97638h = z12;
        }

        @Override // com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState
        /* renamed from: c */
        public final AutotekaItem getF97630d() {
            return this.f97636f;
        }

        @Override // com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState
        @k
        /* renamed from: d, reason: from getter */
        public final String getF97628b() {
            return this.f97637g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState
        /* renamed from: e, reason: from getter */
        public final boolean getF97629c() {
            return this.f97638h;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FullScreenError)) {
                return false;
            }
            FullScreenError fullScreenError = (FullScreenError) obj;
            return L.f(this.f97636f, fullScreenError.f97636f) && L.f(this.f97637g, fullScreenError.f97637g) && this.f97638h == fullScreenError.f97638h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97638h) + H.d(this.f97636f.hashCode() * 31, 31, this.f97637g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FullScreenError(item=");
            sb2.append(this.f97636f);
            sb2.append(", searchKey=");
            sb2.append(this.f97637g);
            sb2.append(", showInput=");
            return r.x(sb2, this.f97638h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f97636f.writeToParcel(parcel, i12);
            parcel.writeString(this.f97637g);
            parcel.writeInt(this.f97638h ? 1 : 0);
        }
    }

    /* compiled from: AutotekaPreviewSearchState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState$Waiting;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Waiting extends AutotekaPreviewSearchState {

        @k
        public static final Parcelable.Creator<Waiting> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        @k
        public final PreviewGenerationItem f97642f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f97643g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f97644h;

        /* compiled from: AutotekaPreviewSearchState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Waiting> {
            @Override // android.os.Parcelable.Creator
            public final Waiting createFromParcel(Parcel parcel) {
                return new Waiting(PreviewGenerationItem.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Waiting[] newArray(int i12) {
                return new Waiting[i12];
            }
        }

        public Waiting(@k PreviewGenerationItem previewGenerationItem, @k String str, boolean z12) {
            super(str, z12, previewGenerationItem, false, null);
            this.f97642f = previewGenerationItem;
            this.f97643g = str;
            this.f97644h = z12;
        }

        @Override // com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState
        /* renamed from: c */
        public final AutotekaItem getF97630d() {
            return this.f97642f;
        }

        @Override // com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState
        @k
        /* renamed from: d, reason: from getter */
        public final String getF97628b() {
            return this.f97643g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState
        /* renamed from: e, reason: from getter */
        public final boolean getF97629c() {
            return this.f97644h;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Waiting)) {
                return false;
            }
            Waiting waiting = (Waiting) obj;
            return L.f(this.f97642f, waiting.f97642f) && L.f(this.f97643g, waiting.f97643g) && this.f97644h == waiting.f97644h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97644h) + H.d(this.f97642f.f96915b.hashCode() * 31, 31, this.f97643g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Waiting(item=");
            sb2.append(this.f97642f);
            sb2.append(", searchKey=");
            sb2.append(this.f97643g);
            sb2.append(", showInput=");
            return r.x(sb2, this.f97644h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f97642f.writeToParcel(parcel, i12);
            parcel.writeString(this.f97643g);
            parcel.writeInt(this.f97644h ? 1 : 0);
        }
    }

    public AutotekaPreviewSearchState(String str, boolean z12, AutotekaItem autotekaItem, boolean z13, C42822w c42822w) {
        this.f97628b = str;
        this.f97629c = z12;
        this.f97630d = autotekaItem;
        this.f97631e = z13;
    }

    @k
    /* renamed from: c, reason: from getter */
    public AutotekaItem getF97630d() {
        return this.f97630d;
    }

    @k
    /* renamed from: d, reason: from getter */
    public String getF97628b() {
        return this.f97628b;
    }

    /* renamed from: e, reason: from getter */
    public boolean getF97629c() {
        return this.f97629c;
    }

    /* compiled from: AutotekaPreviewSearchState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState$ReadyToPreviewSearch;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReadyToPreviewSearch extends AutotekaPreviewSearchState {

        @k
        public static final Parcelable.Creator<ReadyToPreviewSearch> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ReadyToPreviewSearchItem f97639f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f97640g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f97641h;

        /* compiled from: AutotekaPreviewSearchState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReadyToPreviewSearch> {
            @Override // android.os.Parcelable.Creator
            public final ReadyToPreviewSearch createFromParcel(Parcel parcel) {
                return new ReadyToPreviewSearch(ReadyToPreviewSearchItem.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ReadyToPreviewSearch[] newArray(int i12) {
                return new ReadyToPreviewSearch[i12];
            }
        }

        public /* synthetic */ ReadyToPreviewSearch(ReadyToPreviewSearchItem readyToPreviewSearchItem, String str, boolean z12, int i12, C42822w c42822w) {
            this(readyToPreviewSearchItem, (i12 & 2) != 0 ? "" : str, z12);
        }

        @Override // com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState
        /* renamed from: c */
        public final AutotekaItem getF97630d() {
            return this.f97639f;
        }

        @Override // com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState
        @k
        /* renamed from: d, reason: from getter */
        public final String getF97628b() {
            return this.f97640g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState
        /* renamed from: e, reason: from getter */
        public final boolean getF97629c() {
            return this.f97641h;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReadyToPreviewSearch)) {
                return false;
            }
            ReadyToPreviewSearch readyToPreviewSearch = (ReadyToPreviewSearch) obj;
            return L.f(this.f97639f, readyToPreviewSearch.f97639f) && L.f(this.f97640g, readyToPreviewSearch.f97640g) && this.f97641h == readyToPreviewSearch.f97641h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97641h) + H.d(this.f97639f.f96952b.hashCode() * 31, 31, this.f97640g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReadyToPreviewSearch(item=");
            sb2.append(this.f97639f);
            sb2.append(", searchKey=");
            sb2.append(this.f97640g);
            sb2.append(", showInput=");
            return r.x(sb2, this.f97641h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f97639f.writeToParcel(parcel, i12);
            parcel.writeString(this.f97640g);
            parcel.writeInt(this.f97641h ? 1 : 0);
        }

        public ReadyToPreviewSearch(@k ReadyToPreviewSearchItem readyToPreviewSearchItem, @k String str, boolean z12) {
            super(str, z12, readyToPreviewSearchItem, true, null);
            this.f97639f = readyToPreviewSearchItem;
            this.f97640g = str;
            this.f97641h = z12;
        }
    }
}
