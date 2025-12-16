package com.avito.android.photo_picker.camera;

import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CameraViewport.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_picker/camera/t;", "", "a", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface t {

    /* compiled from: CameraViewport.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/camera/t$a;", "", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final RectF f219033a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final RectF f219034b;

        public a(@Y61.k RectF rectF, @Y61.k RectF rectF2) {
            this.f219033a = rectF;
            this.f219034b = rectF2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f219033a, aVar.f219033a) && L.f(this.f219034b, aVar.f219034b);
        }

        public final int hashCode() {
            return this.f219034b.hashCode() + (this.f219033a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "FocusArea(focusRect=" + this.f219033a + ", meteringRect=" + this.f219034b + ')';
        }
    }
}
