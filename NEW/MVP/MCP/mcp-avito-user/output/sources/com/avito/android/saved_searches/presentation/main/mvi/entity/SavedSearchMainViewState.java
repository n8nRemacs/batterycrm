package com.avito.android.saved_searches.presentation.main.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.conveyor_item.ParcelableItem;
import j.InterfaceC42150f;
import j.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchMainState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState;", "Landroid/os/Parcelable;", "()V", "Content", "Error", "Initial", "Loading", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState$Content;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState$Error;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState$Initial;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState$Loading;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SavedSearchMainViewState implements Parcelable {

    /* compiled from: SavedSearchMainState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState$Error;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends SavedSearchMainViewState {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f258675b;

        /* renamed from: c, reason: collision with root package name */
        public final int f258676c;

        /* renamed from: d, reason: collision with root package name */
        public final int f258677d;

        /* compiled from: SavedSearchMainState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@InterfaceC42150f int i12, @e0 int i13, @e0 int i14) {
            super(null);
            this.f258675b = i12;
            this.f258676c = i13;
            this.f258677d = i14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.f258675b == error.f258675b && this.f258676c == error.f258676c && this.f258677d == error.f258677d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f258677d) + r.e(this.f258676c, Integer.hashCode(this.f258675b) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(image=");
            sb2.append(this.f258675b);
            sb2.append(", title=");
            sb2.append(this.f258676c);
            sb2.append(", subtitle=");
            return r.t(sb2, this.f258677d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f258675b);
            parcel.writeInt(this.f258676c);
            parcel.writeInt(this.f258677d);
        }
    }

    /* compiled from: SavedSearchMainState.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState$Initial;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState;", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Initial extends SavedSearchMainViewState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Initial f258678b = new Initial();

        @k
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        /* compiled from: SavedSearchMainState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Initial> {
            @Override // android.os.Parcelable.Creator
            public final Initial createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Initial.f258678b;
            }

            @Override // android.os.Parcelable.Creator
            public final Initial[] newArray(int i12) {
                return new Initial[i12];
            }
        }

        public Initial() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Initial);
        }

        public final int hashCode() {
            return 2051550977;
        }

        @k
        public final String toString() {
            return "Initial";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SavedSearchMainState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState$Loading;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends SavedSearchMainViewState {

        @k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<ParcelableItem> f258679b;

        /* compiled from: SavedSearchMainState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Loading.class, parcel, arrayList, iL2, 1);
                }
                return new Loading(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loading(@k List<? extends ParcelableItem> list) {
            super(null);
            this.f258679b = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && L.f(this.f258679b, ((Loading) obj).f258679b);
        }

        public final int hashCode() {
            return this.f258679b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Loading(items="), this.f258679b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.f258679b, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
        }
    }

    public /* synthetic */ SavedSearchMainViewState(C42822w c42822w) {
        this();
    }

    /* compiled from: SavedSearchMainState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState$Content;", "Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState;", "Button", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Content extends SavedSearchMainViewState {

        @k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f258670b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Button f258671c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Button f258672d;

        /* compiled from: SavedSearchMainState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Content.class, parcel, arrayList, iL2, 1);
                }
                Parcelable.Creator<Button> creator = Button.CREATOR;
                return new Content(arrayList, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public Content(@k ArrayList arrayList, @k Button button, @l Button button2) {
            super(null);
            this.f258670b = arrayList;
            this.f258671c = button;
            this.f258672d = button2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f258670b, content.f258670b) && L.f(this.f258671c, content.f258671c) && L.f(this.f258672d, content.f258672d);
        }

        public final int hashCode() {
            int iHashCode = (this.f258671c.hashCode() + (this.f258670b.hashCode() * 31)) * 31;
            Button button = this.f258672d;
            return iHashCode + (button == null ? 0 : button.hashCode());
        }

        @k
        public final String toString() {
            return "Content(items=" + this.f258670b + ", mainButton=" + this.f258671c + ", secondaryButton=" + this.f258672d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f258670b, parcel);
            while (itZ.hasNext()) {
                parcel.writeParcelable((Parcelable) itZ.next(), i12);
            }
            this.f258671c.writeToParcel(parcel, i12);
            Button button = this.f258672d;
            if (button == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                button.writeToParcel(parcel, i12);
            }
        }

        /* compiled from: SavedSearchMainState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainViewState$Content$Button;", "Landroid/os/Parcelable;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button implements Parcelable {

            @k
            public static final Parcelable.Creator<Button> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f258673b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f258674c;

            /* compiled from: SavedSearchMainState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Button> {
                @Override // android.os.Parcelable.Creator
                public final Button createFromParcel(Parcel parcel) {
                    return new Button(parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            public Button(@k String str, boolean z12) {
                this.f258673b = str;
                this.f258674c = z12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return L.f(this.f258673b, button.f258673b) && this.f258674c == button.f258674c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f258674c) + (this.f258673b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Button(title=");
                sb2.append(this.f258673b);
                sb2.append(", progress=");
                return r.x(sb2, this.f258674c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f258673b);
                parcel.writeInt(this.f258674c ? 1 : 0);
            }

            public /* synthetic */ Button(String str, boolean z12, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? false : z12);
            }
        }
    }

    public SavedSearchMainViewState() {
    }
}
