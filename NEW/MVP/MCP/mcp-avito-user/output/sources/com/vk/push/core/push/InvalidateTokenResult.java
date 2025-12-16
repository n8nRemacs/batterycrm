package com.vk.push.core.push;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InvalidateTokenResult.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/push/InvalidateTokenResult;", "", "Landroid/os/Parcelable;", "CREATOR", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InvalidateTokenResult implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    public static final InvalidateTokenResult f367131b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ InvalidateTokenResult[] f367132c;

    /* compiled from: InvalidateTokenResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/push/InvalidateTokenResult$a;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/push/InvalidateTokenResult;", "<init>", "()V", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: com.vk.push.core.push.InvalidateTokenResult$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<InvalidateTokenResult> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final InvalidateTokenResult createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Enum enumValueOf = InvalidateTokenResult.f367131b;
            if (string != null) {
                try {
                    enumValueOf = Enum.valueOf(InvalidateTokenResult.class, string.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (InvalidateTokenResult) enumValueOf;
        }

        @Override // android.os.Parcelable.Creator
        public final InvalidateTokenResult[] newArray(int i12) {
            return new InvalidateTokenResult[i12];
        }

        public Companion() {
        }
    }

    static {
        InvalidateTokenResult invalidateTokenResult = new InvalidateTokenResult("OK", 0);
        f367131b = invalidateTokenResult;
        f367132c = new InvalidateTokenResult[]{invalidateTokenResult};
        INSTANCE = new Companion(null);
    }

    public InvalidateTokenResult() {
        throw null;
    }

    public static InvalidateTokenResult valueOf(String str) {
        return (InvalidateTokenResult) Enum.valueOf(InvalidateTokenResult.class, str);
    }

    public static InvalidateTokenResult[] values() {
        return (InvalidateTokenResult[]) f367132c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
