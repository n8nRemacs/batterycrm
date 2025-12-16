package com.vk.push.core.test;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SendTestPushResult.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0001\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/test/SendTestPushResult;", "", "Landroid/os/Parcelable;", "CREATOR", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SendTestPushResult implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    public static final SendTestPushResult f367153b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SendTestPushResult[] f367154c;

    /* compiled from: SendTestPushResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/test/SendTestPushResult$a;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/test/SendTestPushResult;", "<init>", "()V", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: com.vk.push.core.test.SendTestPushResult$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SendTestPushResult> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final SendTestPushResult createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Enum enumValueOf = SendTestPushResult.f367153b;
            if (string != null) {
                try {
                    enumValueOf = Enum.valueOf(SendTestPushResult.class, string.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (SendTestPushResult) enumValueOf;
        }

        @Override // android.os.Parcelable.Creator
        public final SendTestPushResult[] newArray(int i12) {
            return new SendTestPushResult[i12];
        }

        public Companion() {
        }
    }

    static {
        SendTestPushResult sendTestPushResult = new SendTestPushResult("SUCCESS", 0);
        f367153b = sendTestPushResult;
        f367154c = new SendTestPushResult[]{sendTestPushResult};
        INSTANCE = new Companion(null);
    }

    public SendTestPushResult() {
        throw null;
    }

    public static SendTestPushResult valueOf(String str) {
        return (SendTestPushResult) Enum.valueOf(SendTestPushResult.class, str);
    }

    public static SendTestPushResult[] values() {
        return (SendTestPushResult[]) f367154c.clone();
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
