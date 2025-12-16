package androidx.view.result;

import X41.f;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IntentSenderRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "a", "c", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {

    @f
    @k
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final IntentSender f21244b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Intent f21245c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21246d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21247e;

    /* compiled from: IntentSenderRequest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$a;", "", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Intent f21248a;

        /* renamed from: b, reason: collision with root package name */
        public int f21249b;

        /* renamed from: c, reason: collision with root package name */
        public int f21250c;

        /* compiled from: IntentSenderRequest.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0083\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$a$a;", "", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @P41.c
        /* renamed from: androidx.activity.result.IntentSenderRequest$a$a, reason: collision with other inner class name */
        public @interface InterfaceC1513a {
        }

        public a(@k IntentSender intentSender) {
        }
    }

    /* compiled from: IntentSenderRequest.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/activity/result/IntentSenderRequest$b", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/IntentSenderRequest;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest((IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest[] newArray(int i12) {
            return new IntentSenderRequest[i12];
        }
    }

    /* compiled from: IntentSenderRequest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$c;", "", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        new c(null);
        CREATOR = new b();
    }

    public IntentSenderRequest(@k IntentSender intentSender, @l Intent intent, int i12, int i13) {
        this.f21244b = intentSender;
        this.f21245c = intent;
        this.f21246d = i12;
        this.f21247e = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f21244b, i12);
        parcel.writeParcelable(this.f21245c, i12);
        parcel.writeInt(this.f21246d);
        parcel.writeInt(this.f21247e);
    }

    public /* synthetic */ IntentSenderRequest(IntentSender intentSender, Intent intent, int i12, int i13, int i14, C42822w c42822w) {
        this(intentSender, (i14 & 2) != 0 ? null : intent, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}
