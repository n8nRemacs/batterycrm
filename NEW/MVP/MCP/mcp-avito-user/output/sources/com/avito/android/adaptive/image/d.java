package com.avito.android.adaptive.image;

import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdaptiveImagePicker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/avito/android/adaptive/image/d;", "", "<init>", "()V", "a", "b", "c", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f68499a = new d();

    /* compiled from: AdaptiveImagePicker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adaptive/image/d$a;", "", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final b f68500a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final b f68501b;

        public a(@Y61.k b bVar, @Y61.k b bVar2) {
            this.f68500a = bVar;
            this.f68501b = bVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f68500a, aVar.f68500a) && L.f(this.f68501b, aVar.f68501b);
        }

        public final int hashCode() {
            return this.f68501b.hashCode() + (this.f68500a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "AdaptiveImagePick(defaultPick=" + this.f68500a + ", adaptivePick=" + this.f68501b + ')';
        }
    }

    /* compiled from: AdaptiveImagePicker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adaptive/image/d$b;", "", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final c f68502a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Uri f68503b;

        public b(@Y61.k c cVar, @Y61.k Uri uri) {
            this.f68502a = cVar;
            this.f68503b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f68502a, bVar.f68502a) && L.f(this.f68503b, bVar.f68503b);
        }

        public final int hashCode() {
            return this.f68503b.hashCode() + (this.f68502a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ImagePick(size=");
            sb2.append(this.f68502a);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.t(sb2, this.f68503b, ')');
        }
    }

    /* compiled from: AdaptiveImagePicker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/adaptive/image/d$c;", "", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f68504a;

        /* renamed from: b, reason: collision with root package name */
        public final int f68505b;

        public c(int i12, int i13) {
            this.f68504a = i12;
            this.f68505b = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f68504a == cVar.f68504a && this.f68505b == cVar.f68505b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f68505b) + (Integer.hashCode(this.f68504a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Size(width=");
            sb2.append(this.f68504a);
            sb2.append(", height=");
            return r.t(sb2, this.f68505b, ')');
        }
    }

    /* compiled from: AdaptiveImagePicker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.adaptive.image.d$d, reason: collision with other inner class name */
    public /* synthetic */ class C2143d {
        static {
            int[] iArr = new int[ImageContentMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ImageContentMode imageContentMode = ImageContentMode.f68474b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ImageFallbackQuality.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ImageFallbackQuality[] imageFallbackQualityArr = ImageFallbackQuality.f68478b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ImageFallbackQuality[] imageFallbackQualityArr2 = ImageFallbackQuality.f68478b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static double a(c cVar, int i12, int i13, ImageContentMode imageContentMode) {
        int i14;
        double dMin;
        int i15 = cVar.f68504a;
        if (i15 == 0 || (i14 = cVar.f68505b) == 0 || i12 == 0 || i13 == 0) {
            return Double.MAX_VALUE;
        }
        double d12 = i15 / i12;
        double d13 = i14 / i13;
        int iOrdinal = imageContentMode.ordinal();
        if (iOrdinal == 0) {
            dMin = Math.min(d12, d13);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            dMin = Math.max(d12, d13);
        }
        return dMin < 1.0d ? 1 / Math.pow(dMin, 5.0d) : dMin;
    }
}
