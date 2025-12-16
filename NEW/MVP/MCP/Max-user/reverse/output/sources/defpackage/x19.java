package defpackage;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;

/* loaded from: classes.dex */
public final class x19 implements Parcelable {
    public static final Parcelable.Creator<x19> CREATOR;
    public static final us c;
    public static final String[] d;
    public final Bundle a;
    public MediaMetadata b;

    static {
        us usVar = new us(0);
        c = usVar;
        usVar.put(MediaMetadataCompat.METADATA_KEY_TITLE, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_ARTIST, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_DURATION, 0);
        usVar.put(MediaMetadataCompat.METADATA_KEY_ALBUM, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_AUTHOR, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_WRITER, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_COMPOSER, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_COMPILATION, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_DATE, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_YEAR, 0);
        usVar.put(MediaMetadataCompat.METADATA_KEY_GENRE, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_TRACK_NUMBER, 0);
        usVar.put(MediaMetadataCompat.METADATA_KEY_NUM_TRACKS, 0);
        usVar.put(MediaMetadataCompat.METADATA_KEY_DISC_NUMBER, 0);
        usVar.put(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_ART, 2);
        usVar.put(MediaMetadataCompat.METADATA_KEY_ART_URI, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, 2);
        usVar.put(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_USER_RATING, 3);
        usVar.put(MediaMetadataCompat.METADATA_KEY_RATING, 3);
        usVar.put(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, 2);
        usVar.put(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, 0);
        usVar.put(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, 1);
        usVar.put(MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT, 0);
        usVar.put(MediaMetadataCompat.METADATA_KEY_DOWNLOAD_STATUS, 0);
        d = new String[]{MediaMetadataCompat.METADATA_KEY_TITLE, MediaMetadataCompat.METADATA_KEY_ARTIST, MediaMetadataCompat.METADATA_KEY_ALBUM, MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, MediaMetadataCompat.METADATA_KEY_WRITER, MediaMetadataCompat.METADATA_KEY_AUTHOR, MediaMetadataCompat.METADATA_KEY_COMPOSER, MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION};
        CREATOR = new pq8(4);
    }

    public x19(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        h79.w(bundle2);
    }

    public final long a(String str) {
        return this.a.getLong(str, 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public x19(Parcel parcel) {
        Bundle bundle = parcel.readBundle(h79.class.getClassLoader());
        bundle.getClass();
        this.a = bundle;
    }
}
