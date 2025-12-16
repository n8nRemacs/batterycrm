package com.avito.android.verification.verification_webview;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: VerificationWebViewArgs.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/verification_webview/VerificationWebViewArgs;", "Landroid/os/Parcelable;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationWebViewArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<VerificationWebViewArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f325838b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f325839c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, String> f325840d;

    /* compiled from: VerificationWebViewArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationWebViewArgs> {
        @Override // android.os.Parcelable.Creator
        public final VerificationWebViewArgs createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new VerificationWebViewArgs(string, string2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationWebViewArgs[] newArray(int i12) {
            return new VerificationWebViewArgs[i12];
        }
    }

    public VerificationWebViewArgs(@k String str, @k String str2, @k Map<String, String> map) {
        this.f325838b = str;
        this.f325839c = str2;
        this.f325840d = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f325838b);
        parcel.writeString(this.f325839c);
        Iterator itI = C0.i(parcel, this.f325840d);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public /* synthetic */ VerificationWebViewArgs(String str, String str2, Map map, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? P0.c() : map);
    }
}
