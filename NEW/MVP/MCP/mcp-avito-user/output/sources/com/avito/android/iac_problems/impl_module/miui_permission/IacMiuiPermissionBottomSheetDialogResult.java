package com.avito.android.iac_problems.impl_module.miui_permission;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: IacMiuiPermissionBottomSheetDialogResult.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/miui_permission/IacMiuiPermissionBottomSheetDialogResult;", "Landroid/os/Parcelable;", "<init>", "()V", "Closed", "a", "RoutedToSettings", "Lcom/avito/android/iac_problems/impl_module/miui_permission/IacMiuiPermissionBottomSheetDialogResult$Closed;", "Lcom/avito/android/iac_problems/impl_module/miui_permission/IacMiuiPermissionBottomSheetDialogResult$RoutedToSettings;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IacMiuiPermissionBottomSheetDialogResult implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f168776b = new a(null);

    /* compiled from: IacMiuiPermissionBottomSheetDialogResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/miui_permission/IacMiuiPermissionBottomSheetDialogResult$Closed;", "Lcom/avito/android/iac_problems/impl_module/miui_permission/IacMiuiPermissionBottomSheetDialogResult;", "<init>", "()V", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Closed extends IacMiuiPermissionBottomSheetDialogResult {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final Closed f168777c = new Closed();

        @k
        public static final Parcelable.Creator<Closed> CREATOR = new a();

        /* compiled from: IacMiuiPermissionBottomSheetDialogResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Closed> {
            @Override // android.os.Parcelable.Creator
            public final Closed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Closed.f168777c;
            }

            @Override // android.os.Parcelable.Creator
            public final Closed[] newArray(int i12) {
                return new Closed[i12];
            }
        }

        public Closed() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Closed);
        }

        public final int hashCode() {
            return 1545017789;
        }

        @k
        public final String toString() {
            return "Closed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: IacMiuiPermissionBottomSheetDialogResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/miui_permission/IacMiuiPermissionBottomSheetDialogResult$RoutedToSettings;", "Lcom/avito/android/iac_problems/impl_module/miui_permission/IacMiuiPermissionBottomSheetDialogResult;", "<init>", "()V", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RoutedToSettings extends IacMiuiPermissionBottomSheetDialogResult {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final RoutedToSettings f168778c = new RoutedToSettings();

        @k
        public static final Parcelable.Creator<RoutedToSettings> CREATOR = new a();

        /* compiled from: IacMiuiPermissionBottomSheetDialogResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RoutedToSettings> {
            @Override // android.os.Parcelable.Creator
            public final RoutedToSettings createFromParcel(Parcel parcel) {
                parcel.readInt();
                return RoutedToSettings.f168778c;
            }

            @Override // android.os.Parcelable.Creator
            public final RoutedToSettings[] newArray(int i12) {
                return new RoutedToSettings[i12];
            }
        }

        public RoutedToSettings() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RoutedToSettings);
        }

        public final int hashCode() {
            return -140890006;
        }

        @k
        public final String toString() {
            return "RoutedToSettings";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: IacMiuiPermissionBottomSheetDialogResult.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/miui_permission/IacMiuiPermissionBottomSheetDialogResult$a;", "", "<init>", "()V", "", "KEY_RESULT", "Ljava/lang/String;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ IacMiuiPermissionBottomSheetDialogResult(C42822w c42822w) {
        this();
    }

    public IacMiuiPermissionBottomSheetDialogResult() {
    }
}
