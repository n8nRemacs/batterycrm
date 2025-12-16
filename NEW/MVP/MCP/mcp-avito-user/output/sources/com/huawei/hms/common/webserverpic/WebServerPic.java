package com.huawei.hms.common.webserverpic;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

/* loaded from: classes7.dex */
public class WebServerPic {
    public static final Parcelable.Creator<WebServerPic> CREATOR = new WebServerPicCreator();
    private final int height;
    private final Uri url;
    private final int width;

    public WebServerPic(Uri uri, int i12, int i13) {
        this.url = uri;
        this.width = i12;
        this.height = i13;
        if (uri == null) {
            throw new IllegalArgumentException("url is not able to be null");
        }
        if (i12 < 0 || i13 < 0) {
            throw new IllegalArgumentException("width and height should be positive or 0");
        }
    }

    public final int getHeight() {
        return this.height;
    }

    public final Uri getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        int i12 = this.width;
        int i13 = this.height;
        String string = this.url.toString();
        StringBuilder sbY = r.y(i12, i13, "Image ", "x", " ");
        sbY.append(string);
        return sbY.toString();
    }

    public final void writeToParcel(Parcel parcel, int i12) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUrl(), i12, false);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public WebServerPic(Uri uri) {
        this(uri, 0, 0);
    }
}
