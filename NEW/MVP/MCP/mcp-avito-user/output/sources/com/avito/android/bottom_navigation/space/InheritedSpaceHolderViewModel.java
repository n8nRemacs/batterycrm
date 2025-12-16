package com.avito.android.bottom_navigation.space;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.M0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SpaceHolderViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/bottom_navigation/space/InheritedSpaceHolderViewModel;", "Landroidx/lifecycle/M0;", "Landroidx/lifecycle/r0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/r0;)V", "a", "SavedState", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InheritedSpaceHolderViewModel extends M0 {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f107069J = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public BottomNavigationSpace f107070E;

    /* compiled from: SpaceHolderViewModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/space/InheritedSpaceHolderViewModel$SavedState;", "Landroid/os/Parcelable;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final BottomNavigationSpace f107071b;

        /* compiled from: SpaceHolderViewModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel.readInt() == 0 ? null : BottomNavigationSpace.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i12) {
                return new SavedState[i12];
            }
        }

        public SavedState(@Y61.l BottomNavigationSpace bottomNavigationSpace) {
            this.f107071b = bottomNavigationSpace;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            BottomNavigationSpace bottomNavigationSpace = this.f107071b;
            if (bottomNavigationSpace == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(bottomNavigationSpace.name());
            }
        }
    }

    /* compiled from: SpaceHolderViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bottom_navigation/space/InheritedSpaceHolderViewModel$a;", "", "<init>", "()V", "", "SAVED_STATE_KEY", "Ljava/lang/String;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InheritedSpaceHolderViewModel(@Y61.k androidx.view.C23060r0 r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "SAVED_STATE_KEY"
            java.lang.Object r1 = r5.b(r0)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r1 == 0) goto L25
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r2 < r3) goto L1a
            java.lang.Object r1 = com.avito.android.bottom_navigation.space.h.a(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            goto L1e
        L1a:
            android.os.Parcelable r1 = r1.getParcelable(r0)
        L1e:
            com.avito.android.bottom_navigation.space.InheritedSpaceHolderViewModel$SavedState r1 = (com.avito.android.bottom_navigation.space.InheritedSpaceHolderViewModel.SavedState) r1
            if (r1 == 0) goto L25
            com.avito.android.bottom_navigation.space.BottomNavigationSpace r1 = r1.f107071b
            goto L26
        L25:
            r1 = 0
        L26:
            r4.f107070E = r1
            com.avito.android.bottom_navigation.space.i r1 = new com.avito.android.bottom_navigation.space.i
            r1.<init>()
            java.util.LinkedHashMap r5 = r5.f46877b
            r5.put(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bottom_navigation.space.InheritedSpaceHolderViewModel.<init>(androidx.lifecycle.r0):void");
    }
}
