package com.avito.android.performance;

import Y61.k;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.enums.c;

/* compiled from: PerformanceImageTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/performance/PerformanceImageTracker;", "", "<init>", "()V", "ImageOrigin", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PerformanceImageTracker {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final PerformanceImageTracker f215083a = new PerformanceImageTracker();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final LinkedHashSet f215084b = new LinkedHashSet();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerformanceImageTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/performance/PerformanceImageTracker$ImageOrigin;", "", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ImageOrigin {

        /* renamed from: b, reason: collision with root package name */
        public static final ImageOrigin f215085b;

        /* renamed from: c, reason: collision with root package name */
        public static final ImageOrigin f215086c;

        /* renamed from: d, reason: collision with root package name */
        public static final ImageOrigin f215087d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ImageOrigin[] f215088e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f215089f;

        static {
            ImageOrigin imageOrigin = new ImageOrigin("NETWORK", 0);
            f215085b = imageOrigin;
            ImageOrigin imageOrigin2 = new ImageOrigin("OTHER", 1);
            f215086c = imageOrigin2;
            ImageOrigin imageOrigin3 = new ImageOrigin(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            f215087d = imageOrigin3;
            ImageOrigin[] imageOriginArr = {imageOrigin, imageOrigin2, imageOrigin3};
            f215088e = imageOriginArr;
            f215089f = c.a(imageOriginArr);
        }

        public ImageOrigin() {
            throw null;
        }

        public static ImageOrigin valueOf(String str) {
            return (ImageOrigin) Enum.valueOf(ImageOrigin.class, str);
        }

        public static ImageOrigin[] values() {
            return (ImageOrigin[]) f215088e.clone();
        }
    }
}
