package com.avito.android.update.mvi_screen.mvi.entity;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UpdateApplicationState.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/update/mvi_screen/mvi/entity/UpdateApplicationState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UpdateApplicationState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f306696b = new a(null);

    @k
    public static final Parcelable.Creator<UpdateApplicationState> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final UpdateApplicationState f306697c = new UpdateApplicationState();

    /* compiled from: UpdateApplicationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/update/mvi_screen/mvi/entity/UpdateApplicationState$a;", "", "<init>", "()V", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UpdateApplicationState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UpdateApplicationState> {
        @Override // android.os.Parcelable.Creator
        public final UpdateApplicationState createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new UpdateApplicationState();
        }

        @Override // android.os.Parcelable.Creator
        public final UpdateApplicationState[] newArray(int i12) {
            return new UpdateApplicationState[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
