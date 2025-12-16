package com.vk.push.core.test;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TestPushPayload.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/push/core/test/TestPushPayload;", "Landroid/os/Parcelable;", "CREATOR", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TestPushPayload implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f367155b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f367156c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f367157d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<String, String> f367158e;

    /* compiled from: TestPushPayload.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/test/TestPushPayload$a;", "Landroid/os/Parcelable$Creator;", "Lcom/vk/push/core/test/TestPushPayload;", "<init>", "()V", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: com.vk.push.core.test.TestPushPayload$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<TestPushPayload> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final TestPushPayload createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            String string2 = parcel.readString();
            if (string2 == null) {
                string2 = "";
            }
            String string3 = parcel.readString();
            if (string3 == null) {
                string3 = "";
            }
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                String string4 = parcel.readString();
                if (string4 == null) {
                    string4 = "";
                }
                String string5 = parcel.readString();
                if (string5 == null) {
                    string5 = "";
                }
                linkedHashMap.put(string4, string5);
            }
            return new TestPushPayload(string, string2, string3, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TestPushPayload[] newArray(int i12) {
            return new TestPushPayload[i12];
        }

        public Companion() {
        }
    }

    public TestPushPayload() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestPushPayload)) {
            return false;
        }
        TestPushPayload testPushPayload = (TestPushPayload) obj;
        return L.f(this.f367155b, testPushPayload.f367155b) && L.f(this.f367156c, testPushPayload.f367156c) && L.f(this.f367157d, testPushPayload.f367157d) && L.f(this.f367158e, testPushPayload.f367158e);
    }

    public final int hashCode() {
        return this.f367158e.hashCode() + H.d(H.d(this.f367155b.hashCode() * 31, 31, this.f367156c), 31, this.f367157d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TestPushPayload(title=");
        sb2.append(this.f367155b);
        sb2.append(", body=");
        sb2.append(this.f367156c);
        sb2.append(", imgUrl=");
        sb2.append(this.f367157d);
        sb2.append(", data=");
        return r.w(sb2, this.f367158e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f367155b);
        parcel.writeString(this.f367156c);
        parcel.writeString(this.f367157d);
        Map<String, String> map = this.f367158e;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public TestPushPayload(@k String str, @k String str2, @k String str3, @k Map<String, String> map) {
        this.f367155b = str;
        this.f367156c = str2;
        this.f367157d = str3;
        this.f367158e = map;
    }

    public /* synthetic */ TestPushPayload(String str, String str2, String str3, Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? P0.c() : map);
    }
}
