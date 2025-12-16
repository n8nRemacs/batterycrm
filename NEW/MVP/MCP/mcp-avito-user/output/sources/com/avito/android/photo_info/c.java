package com.avito.android.photo_info;

import N70.e;
import Y61.k;
import Y61.l;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.avito.android.util.V2;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PhotoInformationProvider.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_info/c;", "Lcom/avito/android/photo_info/b;", "a", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.photo_info.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f218046a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f218047b = C42727D.c(new b());

    /* compiled from: PhotoInformationProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_info/c$a;", "", "<init>", "()V", "", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Ljava/lang/String;", "_avito_photo-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PhotoInformationProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/ContentResolver;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ContentResolver> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ContentResolver invoke() {
            return c.this.f218046a.getContentResolver();
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@k Context context) {
        this.f218046a = context;
    }

    @Override // com.avito.android.photo_info.b
    @l
    public final com.avito.android.photo_info.a a(@k Uri uri) {
        InterfaceC42726C interfaceC42726C = this.f218047b;
        try {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = ((ContentResolver) interfaceC42726C.getValue()).openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                try {
                    Q<Float, Float> qB2 = b(uri, assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                    float fFloatValue = qB2.f406619b.floatValue();
                    float fFloatValue2 = qB2.f406620c.floatValue();
                    long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                    String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(((ContentResolver) interfaceC42726C.getValue()).getType(uri));
                    if (extensionFromMimeType == null) {
                        extensionFromMimeType = "unknown";
                    }
                    com.avito.android.photo_info.a aVar = new com.avito.android.photo_info.a(fFloatValue, fFloatValue2, length, extensionFromMimeType);
                    kotlin.io.c.a(assetFileDescriptorOpenAssetFileDescriptor, null);
                    return aVar;
                } finally {
                }
            }
        } catch (Throwable th2) {
            V2.f318762a.c("PhotoInformationProvider", "invoke", th2);
        }
        return null;
    }

    public final Q<Float, Float> b(Uri uri, FileDescriptor fileDescriptor) {
        Float fX02;
        Float fX03;
        int iHashCode;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        Float fValueOf = Float.valueOf(options.outWidth);
        Float fValueOf2 = Float.valueOf(options.outHeight);
        Q<Float, Float> q12 = new Q<>(fValueOf, fValueOf2);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = 0.0f;
        if (fFloatValue <= 0.0f || fFloatValue2 <= 0.0f) {
            q12 = null;
        }
        if (q12 != null) {
            return q12;
        }
        String scheme = uri.getScheme();
        InputStream inputStreamOpenInputStream = (scheme == null || ((iHashCode = scheme.hashCode()) == 3143036 ? !scheme.equals("file") : !(iHashCode == 951530617 && scheme.equals("content")))) ? null : ((ContentResolver) this.f218047b.getValue()).openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            return new Q<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        try {
            LinkedHashMap linkedHashMapA = e.a(new androidx.exifinterface.media.a(inputStreamOpenInputStream));
            String str = (String) linkedHashMapA.get("ImageWidth");
            float fFloatValue4 = (str == null || (fX03 = C43066x.x0(str)) == null) ? 0.0f : fX03.floatValue();
            String str2 = (String) linkedHashMapA.get("ImageLength");
            if (str2 != null && (fX02 = C43066x.x0(str2)) != null) {
                fFloatValue3 = fX02.floatValue();
            }
            Q<Float, Float> q13 = new Q<>(Float.valueOf(fFloatValue4), Float.valueOf(fFloatValue3));
            kotlin.io.c.a(inputStreamOpenInputStream, null);
            return q13;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(inputStreamOpenInputStream, th2);
                throw th3;
            }
        }
    }
}
