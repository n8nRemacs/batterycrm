package com.avito.android.extended_profile_universal_widget_edit.edit_block;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetSectionModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetEditBlockResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetEditBlockResult;", "Landroid/os/Parcelable;", "()V", "Cancel", "Success", "Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetEditBlockResult$Cancel;", "Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetEditBlockResult$Success;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class UniversalWidgetEditBlockResult implements Parcelable {

    /* compiled from: UniversalWidgetEditBlockResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetEditBlockResult$Cancel;", "Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetEditBlockResult;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Cancel extends UniversalWidgetEditBlockResult {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Cancel f153994b = new Cancel();

        @Y61.k
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        /* compiled from: UniversalWidgetEditBlockResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Cancel> {
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Cancel.f153994b;
            }

            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i12) {
                return new Cancel[i12];
            }
        }

        public Cancel() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -1874813201;
        }

        @Y61.k
        public final String toString() {
            return "Cancel";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: UniversalWidgetEditBlockResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetEditBlockResult$Success;", "Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetEditBlockResult;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success extends UniversalWidgetEditBlockResult {

        @Y61.k
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UniversalWidgetSectionModel.Block f153995b;

        /* renamed from: c, reason: collision with root package name */
        public final int f153996c;

        /* compiled from: UniversalWidgetEditBlockResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success((UniversalWidgetSectionModel.Block) parcel.readParcelable(Success.class.getClassLoader()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success(@Y61.k UniversalWidgetSectionModel.Block block, int i12) {
            super(null);
            this.f153995b = block;
            this.f153996c = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return L.f(this.f153995b, success.f153995b) && this.f153996c == success.f153996c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f153996c) + (this.f153995b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(block=");
            sb2.append(this.f153995b);
            sb2.append(", index=");
            return androidx.appcompat.app.r.t(sb2, this.f153996c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f153995b, i12);
            parcel.writeInt(this.f153996c);
        }
    }

    public /* synthetic */ UniversalWidgetEditBlockResult(C42822w c42822w) {
        this();
    }

    public UniversalWidgetEditBlockResult() {
    }
}
