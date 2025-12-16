package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.v2;
import j.P;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f383013b;

    /* renamed from: c, reason: collision with root package name */
    public final String f383014c;

    public class a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame[] newArray(int i12) {
            return new TextInformationFrame[i12];
        }
    }

    public TextInformationFrame(String str, @P String str2, String str3) {
        super(str);
        this.f383013b = str2;
        this.f383014c = str3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.yandex.mobile.ads.impl.ad0.a r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame.a(com.yandex.mobile.ads.impl.ad0$a):void");
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return pc1.a(this.f383002a, textInformationFrame.f383002a) && pc1.a(this.f383013b, textInformationFrame.f383013b) && pc1.a(this.f383014c, textInformationFrame.f383014c);
    }

    public final int hashCode() {
        int iA2 = v2.a(this.f383002a, 527, 31);
        String str = this.f383013b;
        int iHashCode = (iA2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f383014c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f383002a + ": description=" + this.f383013b + ": value=" + this.f383014c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f383002a);
        parcel.writeString(this.f383013b);
        parcel.writeString(this.f383014c);
    }

    public TextInformationFrame(Parcel parcel) {
        super((String) pc1.a(parcel.readString()));
        this.f383013b = parcel.readString();
        this.f383014c = (String) pc1.a(parcel.readString());
    }

    private static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }
}
