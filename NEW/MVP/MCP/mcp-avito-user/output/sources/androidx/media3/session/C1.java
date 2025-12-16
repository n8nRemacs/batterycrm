package androidx.media3.session;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media.AbstractServiceC23085i;
import androidx.media.AudioAttributesCompat;
import androidx.media3.common.B;
import androidx.media3.common.C23091e;
import androidx.media3.common.C23107s;
import androidx.media3.common.C23128y;
import androidx.media3.common.H;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.common.z;
import androidx.media3.session.AbstractServiceC23270w0;
import androidx.media3.session.D1;
import androidx.media3.session.O0;
import com.google.common.collect.AbstractC37401r1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: MediaUtils.java */
/* loaded from: classes.dex */
final class C1 {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractServiceC23085i.a f51933a = new AbstractServiceC23085i.a(null, "androidx.media3.session.MediaLibraryService");

    public static int A(@j.P androidx.media3.common.J j12) {
        if (j12 instanceof C23128y) {
            return 1;
        }
        if (j12 instanceof androidx.media3.common.O) {
            return 2;
        }
        if (!(j12 instanceof androidx.media3.common.M)) {
            return j12 instanceof androidx.media3.common.F ? 6 : 0;
        }
        int i12 = ((androidx.media3.common.M) j12).f47359d;
        int i13 = 3;
        if (i12 != 3) {
            i13 = 4;
            if (i12 != 4) {
                i13 = 5;
                if (i12 != 5) {
                    return 0;
                }
            }
        }
        return i13;
    }

    public static boolean B(long j12, long j13) {
        return (j12 & j13) != 0;
    }

    public static H.c C(@j.P H.c cVar, @j.P H.c cVar2) {
        if (cVar == null || cVar2 == null) {
            return H.c.f47239c;
        }
        H.c.a aVar = new H.c.a();
        for (int i12 = 0; i12 < cVar.g(); i12++) {
            C23107s c23107s = cVar.f47242b;
            if (cVar2.a(c23107s.b(i12))) {
                aVar.a(c23107s.b(i12));
            }
        }
        return aVar.c();
    }

    public static Pair<D1, D1.b> D(D1 d12, D1.b bVar, D1 d13, D1.b bVar2, H.c cVar) {
        boolean z12 = bVar2.f52035b;
        boolean z13 = bVar2.f52036c;
        if (z12 && cVar.a(17) && !bVar.f52035b) {
            androidx.media3.common.P p12 = d12.f51984k;
            D1.a aVarB = M1.b(d13, d13);
            aVarB.f52014j = p12;
            d13 = aVarB.a();
            bVar2 = new D1.b(false, z13);
        }
        if (z13 && cVar.a(30) && !bVar.f52036c) {
            d13 = d13.a(d12.f51973E);
            bVar2 = new D1.b(bVar2.f52035b, false);
        }
        return new Pair<>(d13, bVar2);
    }

    public static void E(androidx.media3.common.H h12, O0.i iVar) {
        int i12 = iVar.f52224b;
        AbstractC37401r1<androidx.media3.common.z> abstractC37401r1 = iVar.f52223a;
        if (i12 == -1) {
            if (h12.u(20)) {
                h12.c(abstractC37401r1);
                return;
            } else {
                if (abstractC37401r1.isEmpty()) {
                    return;
                }
                h12.S(abstractC37401r1.get(0));
                return;
            }
        }
        boolean zU2 = h12.u(20);
        long j12 = iVar.f52225c;
        if (zU2) {
            h12.M(abstractC37401r1, iVar.f52224b, j12);
        } else {
            if (abstractC37401r1.isEmpty()) {
                return;
            }
            h12.V(abstractC37401r1.get(0), j12);
        }
    }

    public static ArrayList F(List list) {
        ArrayList arrayList = new ArrayList();
        Parcel parcelObtain = Parcel.obtain();
        for (int i12 = 0; i12 < list.size(); i12++) {
            try {
                Parcelable parcelable = (Parcelable) list.get(i12);
                parcelObtain.writeParcelable(parcelable, 0);
                if (parcelObtain.dataSize() >= 262144) {
                    break;
                }
                arrayList.add(parcelable);
            } finally {
                parcelObtain.recycle();
            }
        }
        return arrayList;
    }

    public static boolean a(N1 n12, N1 n13) {
        H.k kVar = n12.f52190b;
        int i12 = kVar.f47255c;
        H.k kVar2 = n13.f52190b;
        return i12 == kVar2.f47255c && kVar.f47258f == kVar2.f47258f && kVar.f47261i == kVar2.f47261i && kVar.f47262j == kVar2.f47262j;
    }

    public static int b(long j12, long j13) {
        if (j12 == -9223372036854775807L || j13 == -9223372036854775807L) {
            return 0;
        }
        if (j13 == 0) {
            return 100;
        }
        return androidx.media3.common.util.M.k((int) ((j12 * 100) / j13), 0, 100);
    }

    public static MediaBrowserCompat.MediaItem c(androidx.media3.common.z zVar, @j.P Bitmap bitmap) {
        MediaDescriptionCompat mediaDescriptionCompatK = k(zVar, bitmap);
        androidx.media3.common.B b12 = zVar.f47981e;
        Boolean bool = b12.f47169q;
        int i12 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        Boolean bool2 = b12.f47170r;
        if (bool2 != null && bool2.booleanValue()) {
            i12 |= 2;
        }
        return new MediaBrowserCompat.MediaItem(mediaDescriptionCompatK, i12);
    }

    public static long d(@j.P PlaybackStateCompat playbackStateCompat, @j.P MediaMetadataCompat mediaMetadataCompat, long j12) {
        long bufferedPosition = playbackStateCompat == null ? 0L : playbackStateCompat.getBufferedPosition();
        long jF2 = f(playbackStateCompat, mediaMetadataCompat, j12);
        long jG2 = g(mediaMetadataCompat);
        return jG2 == -9223372036854775807L ? Math.max(jF2, bufferedPosition) : androidx.media3.common.util.M.l(bufferedPosition, jF2, jG2);
    }

    public static byte[] e(Bitmap bitmap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static long f(@j.P PlaybackStateCompat playbackStateCompat, @j.P MediaMetadataCompat mediaMetadataCompat, long j12) {
        long position;
        if (playbackStateCompat == null) {
            return 0L;
        }
        if (playbackStateCompat.getState() == 3) {
            position = playbackStateCompat.getCurrentPosition(j12 == -9223372036854775807L ? null : Long.valueOf(j12));
        } else {
            position = playbackStateCompat.getPosition();
        }
        long j13 = position;
        long jG2 = g(mediaMetadataCompat);
        return jG2 == -9223372036854775807L ? Math.max(0L, j13) : androidx.media3.common.util.M.l(j13, 0L, jG2);
    }

    public static long g(@j.P MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null || !mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            return -9223372036854775807L;
        }
        long j12 = mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
        if (j12 <= 0) {
            return -9223372036854775807L;
        }
        return j12;
    }

    public static long h(int i12) {
        switch (i12) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                throw new IllegalArgumentException(AK.c.g(i12, "Unrecognized FolderType: "));
        }
    }

    public static int i(long j12) {
        if (j12 == 0) {
            return 0;
        }
        if (j12 == 1) {
            return 1;
        }
        if (j12 == 2) {
            return 2;
        }
        if (j12 == 3) {
            return 3;
        }
        if (j12 == 4) {
            return 4;
        }
        if (j12 == 5) {
            return 5;
        }
        return j12 == 6 ? 6 : 0;
    }

    @j.P
    public static AbstractServiceC23270w0.b j(com.avito.android.messenger.service.media_session.a aVar, @j.P Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(aVar.getClassLoader());
            int i12 = bundle.getInt("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS", -1);
            if (i12 >= 0) {
                bundle.remove("androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS");
                boolean z12 = true;
                if (i12 != 1) {
                    z12 = false;
                }
                bundle.putBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", z12);
            }
            AbstractServiceC23270w0.b.a aVar2 = new AbstractServiceC23270w0.b.a();
            aVar2.f52663d = bundle;
            aVar2.f52660a = bundle.getBoolean("android.service.media.extra.RECENT");
            aVar2.f52661b = bundle.getBoolean("android.service.media.extra.OFFLINE");
            aVar2.f52662c = bundle.getBoolean("android.service.media.extra.SUGGESTED");
            return new AbstractServiceC23270w0.b(aVar2.f52663d, aVar2.f52660a, aVar2.f52661b, aVar2.f52662c);
        } catch (Exception unused) {
            AbstractServiceC23270w0.b.a aVar3 = new AbstractServiceC23270w0.b.a();
            aVar3.f52663d = bundle;
            return new AbstractServiceC23270w0.b(aVar3.f52663d, aVar3.f52660a, aVar3.f52661b, aVar3.f52662c);
        }
    }

    public static MediaDescriptionCompat k(androidx.media3.common.z zVar, @j.P Bitmap bitmap) {
        MediaDescriptionCompat.Builder mediaId = new MediaDescriptionCompat.Builder().setMediaId(zVar.f47978b.equals("") ? null : zVar.f47978b);
        if (bitmap != null) {
            mediaId.setIconBitmap(bitmap);
        }
        androidx.media3.common.B b12 = zVar.f47981e;
        Bundle bundle = b12.f47153I;
        Integer num = b12.f47168p;
        boolean z12 = (num == null || num.intValue() == -1) ? false : true;
        Integer num2 = b12.f47152H;
        boolean z13 = num2 != null;
        if (z12 || z13) {
            bundle = bundle == null ? new Bundle() : new Bundle(bundle);
            if (z12) {
                num.getClass();
                bundle.putLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE, h(num.intValue()));
            }
            if (z13) {
                num2.getClass();
                bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num2.intValue());
            }
        }
        MediaDescriptionCompat.Builder title = mediaId.setTitle(b12.f47154b);
        CharSequence charSequence = b12.f47155c;
        if (charSequence == null) {
            charSequence = b12.f47159g;
        }
        return title.setSubtitle(charSequence).setDescription(b12.f47160h).setIconUri(b12.f47165m).setMediaUri(zVar.f47983g.f48082b).setExtras(bundle).build();
    }

    public static androidx.media3.common.z l(MediaDescriptionCompat mediaDescriptionCompat, boolean z12, boolean z13) {
        String mediaId = mediaDescriptionCompat.getMediaId();
        z.c cVar = new z.c();
        if (mediaId == null) {
            mediaId = "";
        }
        cVar.f47988a = mediaId;
        z.i.a aVar = new z.i.a();
        aVar.f48085a = mediaDescriptionCompat.getMediaUri();
        cVar.f48000m = aVar.a();
        cVar.f47998k = n(mediaDescriptionCompat, 0, z12, z13);
        return cVar.a();
    }

    public static androidx.media3.common.z m(@j.P String str, MediaMetadataCompat mediaMetadataCompat, int i12) {
        z.c cVar = new z.c();
        if (str != null) {
            cVar.f47988a = str;
        }
        String string = mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI);
        if (string != null) {
            z.i.a aVar = new z.i.a();
            aVar.f48085a = Uri.parse(string);
            cVar.f48000m = aVar.a();
        }
        cVar.f47998k = o(mediaMetadataCompat, i12);
        return cVar.a();
    }

    public static androidx.media3.common.B n(@j.P MediaDescriptionCompat mediaDescriptionCompat, int i12, boolean z12, boolean z13) {
        byte[] bArrE;
        if (mediaDescriptionCompat == null) {
            return androidx.media3.common.B.f47110J;
        }
        B.b bVar = new B.b();
        bVar.f47186a = mediaDescriptionCompat.getTitle();
        bVar.f47191f = mediaDescriptionCompat.getSubtitle();
        bVar.f47192g = mediaDescriptionCompat.getDescription();
        bVar.f47197l = mediaDescriptionCompat.getIconUri();
        bVar.f47193h = u(RatingCompat.newUnratedRating(i12));
        Bitmap iconBitmap = mediaDescriptionCompat.getIconBitmap();
        if (iconBitmap != null) {
            try {
                bArrE = e(iconBitmap);
            } catch (IOException e12) {
                androidx.media3.common.util.s.h("Failed to convert iconBitmap to artworkData", e12);
                bArrE = null;
            }
            bVar.d(bArrE, 3);
        }
        Bundle extras = mediaDescriptionCompat.getExtras();
        Bundle bundle = extras != null ? new Bundle(extras) : null;
        if (bundle != null && bundle.containsKey(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)) {
            bVar.f47200o = Integer.valueOf(i(bundle.getLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE)));
            bundle.remove(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE);
        }
        bVar.f47201p = Boolean.valueOf(z12);
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            bVar.f47184F = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && !bundle.isEmpty()) {
            bVar.f47185G = bundle;
        }
        bVar.f47202q = Boolean.valueOf(z13);
        return bVar.a();
    }

    public static androidx.media3.common.B o(@j.P MediaMetadataCompat mediaMetadataCompat, int i12) {
        Bitmap bitmap;
        CharSequence text;
        String string;
        if (mediaMetadataCompat == null) {
            return androidx.media3.common.B.f47110J;
        }
        B.b bVar = new B.b();
        String[] strArr = {MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, MediaMetadataCompat.METADATA_KEY_TITLE};
        int i13 = 0;
        int i14 = 0;
        while (true) {
            bitmap = null;
            if (i14 >= 2) {
                text = null;
                break;
            }
            String str = strArr[i14];
            if (mediaMetadataCompat.containsKey(str)) {
                text = mediaMetadataCompat.getText(str);
                break;
            }
            i14++;
        }
        bVar.f47186a = text;
        bVar.f47191f = mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE);
        bVar.f47192g = mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION);
        bVar.f47187b = mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_ARTIST);
        bVar.f47188c = mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_ALBUM);
        bVar.f47189d = mediaMetadataCompat.getText(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST);
        bVar.f47194i = u(mediaMetadataCompat.getRating(MediaMetadataCompat.METADATA_KEY_RATING));
        androidx.media3.common.J jU2 = u(mediaMetadataCompat.getRating(MediaMetadataCompat.METADATA_KEY_USER_RATING));
        if (jU2 != null) {
            bVar.f47193h = jU2;
        } else {
            bVar.f47193h = u(RatingCompat.newUnratedRating(i12));
        }
        if (mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_YEAR)) {
            bVar.f47203r = Integer.valueOf((int) mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_YEAR));
        }
        String[] strArr2 = {MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI};
        int i15 = 0;
        while (true) {
            if (i15 >= 2) {
                string = null;
                break;
            }
            String str2 = strArr2[i15];
            if (mediaMetadataCompat.containsKey(str2)) {
                string = mediaMetadataCompat.getString(str2);
                break;
            }
            i15++;
        }
        if (string != null) {
            bVar.f47197l = Uri.parse(string);
        }
        String[] strArr3 = {MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, MediaMetadataCompat.METADATA_KEY_ALBUM_ART};
        while (true) {
            if (i13 >= 2) {
                break;
            }
            String str3 = strArr3[i13];
            if (mediaMetadataCompat.containsKey(str3)) {
                bitmap = mediaMetadataCompat.getBitmap(str3);
                break;
            }
            i13++;
        }
        if (bitmap != null) {
            try {
                bVar.d(e(bitmap), 3);
            } catch (IOException e12) {
                androidx.media3.common.util.s.h("Failed to convert artworkBitmap to artworkData", e12);
            }
        }
        boolean zContainsKey = mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE);
        bVar.f47201p = Boolean.valueOf(zContainsKey);
        if (zContainsKey) {
            bVar.f47200o = Integer.valueOf(i(mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE)));
        }
        if (mediaMetadataCompat.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            bVar.f47184F = Integer.valueOf((int) mediaMetadataCompat.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
        }
        bVar.f47202q = Boolean.TRUE;
        return bVar.a();
    }

    public static MediaMetadataCompat p(androidx.media3.common.B b12, String str, @j.P Uri uri, long j12, @j.P Bitmap bitmap) {
        MediaMetadataCompat.Builder builderPutString = new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, str);
        CharSequence charSequence = b12.f47154b;
        if (charSequence != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_TITLE, charSequence);
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, b12.f47154b);
        }
        CharSequence charSequence2 = b12.f47159g;
        if (charSequence2 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, charSequence2);
        }
        CharSequence charSequence3 = b12.f47160h;
        if (charSequence3 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_DISPLAY_DESCRIPTION, charSequence3);
        }
        CharSequence charSequence4 = b12.f47155c;
        if (charSequence4 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_ARTIST, charSequence4);
        }
        CharSequence charSequence5 = b12.f47156d;
        if (charSequence5 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_ALBUM, charSequence5);
        }
        CharSequence charSequence6 = b12.f47157e;
        if (charSequence6 != null) {
            builderPutString.putText(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, charSequence6);
        }
        if (b12.f47172t != null) {
            builderPutString.putLong(MediaMetadataCompat.METADATA_KEY_YEAR, r0.intValue());
        }
        if (uri != null) {
            builderPutString.putString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, uri.toString());
        }
        Uri uri2 = b12.f47165m;
        if (uri2 != null) {
            builderPutString.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, uri2.toString());
            builderPutString.putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ART_URI, uri2.toString());
        }
        if (bitmap != null) {
            builderPutString.putBitmap(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON, bitmap);
            builderPutString.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        }
        Integer num = b12.f47168p;
        if (num != null && num.intValue() != -1) {
            builderPutString.putLong(MediaMetadataCompat.METADATA_KEY_BT_FOLDER_TYPE, h(num.intValue()));
        }
        if (j12 != -9223372036854775807L) {
            builderPutString.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, j12);
        }
        RatingCompat ratingCompatV = v(b12.f47161i);
        if (ratingCompatV != null) {
            builderPutString.putRating(MediaMetadataCompat.METADATA_KEY_USER_RATING, ratingCompatV);
        }
        RatingCompat ratingCompatV2 = v(b12.f47162j);
        if (ratingCompatV2 != null) {
            builderPutString.putRating(MediaMetadataCompat.METADATA_KEY_RATING, ratingCompatV2);
        }
        if (b12.f47152H != null) {
            builderPutString.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", r3.intValue());
        }
        return builderPutString.build();
    }

    @j.P
    public static PlaybackException q(@j.P PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null || playbackStateCompat.getState() != 7) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(playbackStateCompat.getErrorMessage())) {
            sb2.append(playbackStateCompat.getErrorMessage().toString());
            sb2.append(", ");
        }
        sb2.append("code=");
        sb2.append(playbackStateCompat.getErrorCode());
        String string = sb2.toString();
        InterfaceC23115f.f47901a.getClass();
        return new PlaybackException(string, null, 1001, SystemClock.elapsedRealtime());
    }

    public static int r(int i12) {
        if (i12 == 0) {
            return 0;
        }
        int i13 = 1;
        if (i12 != 1) {
            i13 = 2;
            if (i12 != 2) {
                androidx.media3.common.util.s.g();
                return 0;
            }
        }
        return i13;
    }

    public static int s(@j.P PlaybackException playbackException, int i12, boolean z12) {
        if (playbackException != null) {
            return 7;
        }
        if (i12 == 1) {
            return 0;
        }
        if (i12 == 2) {
            return z12 ? 6 : 2;
        }
        if (i12 == 3) {
            return z12 ? 3 : 2;
        }
        if (i12 == 4) {
            return 1;
        }
        throw new IllegalArgumentException(AK.c.g(i12, "Unrecognized State: "));
    }

    public static long t(int i12) {
        if (i12 == -1) {
            return -1L;
        }
        return i12;
    }

    @j.P
    public static androidx.media3.common.J u(@j.P RatingCompat ratingCompat) {
        if (ratingCompat == null) {
            return null;
        }
        switch (ratingCompat.getRatingStyle()) {
            case 1:
                if (!ratingCompat.isRated()) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!ratingCompat.isRated()) {
                    break;
                } else {
                    break;
                }
            case 3:
                if (!ratingCompat.isRated()) {
                    break;
                } else {
                    break;
                }
            case 4:
                if (!ratingCompat.isRated()) {
                    break;
                } else {
                    break;
                }
            case 5:
                if (!ratingCompat.isRated()) {
                    break;
                } else {
                    break;
                }
            case 6:
                if (!ratingCompat.isRated()) {
                    break;
                } else {
                    break;
                }
        }
        return null;
    }

    @SuppressLint({"WrongConstant"})
    @j.P
    public static RatingCompat v(@j.P androidx.media3.common.J j12) {
        if (j12 == null) {
            return null;
        }
        int iA2 = A(j12);
        if (!j12.a()) {
            return RatingCompat.newUnratedRating(iA2);
        }
        switch (iA2) {
            case 1:
                return RatingCompat.newHeartRating(((C23128y) j12).f47969e);
            case 2:
                return RatingCompat.newThumbRating(((androidx.media3.common.O) j12).f47367e);
            case 3:
            case 4:
            case 5:
                return RatingCompat.newStarRating(iA2, ((androidx.media3.common.M) j12).f47360e);
            case 6:
                return RatingCompat.newPercentageRating(((androidx.media3.common.F) j12).f47231d);
            default:
                return null;
        }
    }

    public static int w(int i12) {
        if (i12 == -1 || i12 == 0) {
            return 0;
        }
        int i13 = 1;
        if (i12 != 1) {
            i13 = 2;
            if (i12 != 2 && i12 != 3) {
                androidx.media3.common.util.s.g();
                return 0;
            }
        }
        return i13;
    }

    public static boolean x(int i12) {
        if (i12 == -1 || i12 == 0) {
            return false;
        }
        if (i12 == 1 || i12 == 2) {
            return true;
        }
        throw new IllegalArgumentException(AK.c.g(i12, "Unrecognized ShuffleMode: "));
    }

    public static void y(com.google.common.util.concurrent.D0 d02) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z12 = false;
        long j12 = 3000;
        while (true) {
            try {
                try {
                    d02.get(j12, TimeUnit.MILLISECONDS);
                    if (z12) {
                        return;
                    } else {
                        return;
                    }
                } catch (InterruptedException unused) {
                    z12 = true;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    if (jElapsedRealtime2 >= 3000) {
                        throw new TimeoutException();
                    }
                    j12 = 3000 - jElapsedRealtime2;
                }
            } finally {
                if (z12) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static int z(C23091e c23091e) {
        AudioAttributesCompat.d dVar = new AudioAttributesCompat.d();
        dVar.b(c23091e.f47651b);
        dVar.c(c23091e.f47652c);
        dVar.e(c23091e.f47653d);
        int iB2 = dVar.a().f46989a.b();
        if (iB2 == Integer.MIN_VALUE) {
            return 3;
        }
        return iB2;
    }
}
