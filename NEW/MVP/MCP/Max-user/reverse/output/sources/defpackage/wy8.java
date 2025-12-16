package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class wy8 implements Parcelable {
    public static final Parcelable.Creator<wy8> CREATOR = new pq8(3);
    public final Uri X;
    public final Bundle Y;
    public final Uri Z;
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final Bitmap o;
    public MediaDescription s0;

    public wy8(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.o = bitmap;
        this.X = uri;
        this.Y = bundle;
        this.Z = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.wy8 a(android.media.MediaDescription r13) {
        /*
            java.lang.String r1 = r13.getMediaId()
            java.lang.CharSequence r2 = r13.getTitle()
            java.lang.CharSequence r3 = r13.getSubtitle()
            java.lang.CharSequence r4 = r13.getDescription()
            android.graphics.Bitmap r5 = r13.getIconBitmap()
            android.net.Uri r6 = r13.getIconUri()
            android.os.Bundle r0 = r13.getExtras()
            r7 = 0
            if (r0 != 0) goto L21
        L1f:
            r0 = r7
            goto L30
        L21:
            defpackage.h79.w(r0)
            r0.isEmpty()     // Catch: android.os.BadParcelableException -> L28
            goto L30
        L28:
            java.lang.String r0 = "MediaSessionCompat"
            java.lang.String r8 = "Could not unparcel the data."
            android.util.Log.e(r0, r8)
            goto L1f
        L30:
            if (r0 == 0) goto L38
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r0)
            r0 = r8
        L38:
            if (r0 == 0) goto L5c
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            android.os.Parcelable r9 = r0.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L5a
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r0.containsKey(r10)
            if (r11 == 0) goto L54
            int r11 = r0.size()
            r12 = 2
            if (r11 != r12) goto L54
            goto L5e
        L54:
            r0.remove(r8)
            r0.remove(r10)
        L5a:
            r7 = r0
            goto L5e
        L5c:
            r9 = r7
            goto L5a
        L5e:
            if (r9 == 0) goto L62
        L60:
            r8 = r9
            goto L67
        L62:
            android.net.Uri r9 = r13.getMediaUri()
            goto L60
        L67:
            wy8 r0 = new wy8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.s0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy8.a(android.media.MediaDescription):wy8");
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.s0;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.a);
        builder.setTitle(this.b);
        builder.setSubtitle(this.c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.o);
        builder.setIconUri(this.X);
        builder.setExtras(this.Y);
        builder.setMediaUri(this.Z);
        MediaDescription mediaDescriptionBuild = builder.build();
        this.s0 = mediaDescriptionBuild;
        return mediaDescriptionBuild;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.b) + ", " + ((Object) this.c) + ", " + ((Object) this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b().writeToParcel(parcel, i);
    }
}
