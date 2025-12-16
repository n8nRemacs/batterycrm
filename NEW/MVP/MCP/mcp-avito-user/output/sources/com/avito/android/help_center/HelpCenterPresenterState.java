package com.avito.android.help_center;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: HelpCenterPresenterState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/help_center/HelpCenterPresenterState;", "Landroid/os/Parcelable;", "b", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes13.dex */
public final class HelpCenterPresenterState implements Parcelable {

    @X41.f
    @Y61.k
    public static final Parcelable.Creator<HelpCenterPresenterState> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f161609b;

    /* compiled from: HelpCenterPresenterState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/help_center/HelpCenterPresenterState;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Parcel, HelpCenterPresenterState> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f161610l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final HelpCenterPresenterState invoke(Parcel parcel) {
            return new HelpCenterPresenterState(parcel.readString());
        }
    }

    /* compiled from: HelpCenterPresenterState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/help_center/HelpCenterPresenterState$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/help_center/HelpCenterPresenterState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "_avito_help-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        a aVar = a.f161610l;
        int i12 = I3.f318630a;
        CREATOR = new H3(aVar);
    }

    public HelpCenterPresenterState(@Y61.l String str) {
        this.f161609b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f161609b);
    }
}
