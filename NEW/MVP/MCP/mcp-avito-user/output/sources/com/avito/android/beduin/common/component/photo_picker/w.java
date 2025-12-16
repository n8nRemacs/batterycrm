package com.avito.android.beduin.common.component.photo_picker;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.H;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import i.AbstractC41201a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhotoPickerActivityContract.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/w;", "Li/a;", "Lcom/avito/android/beduin/common/component/photo_picker/w$a;", "Lkotlin/G0;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class w extends AbstractC41201a<a, G0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory f102086b;

    /* compiled from: PhotoPickerActivityContract.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/photo_picker/w$a;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f102087a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f102088b;

        /* renamed from: c, reason: collision with root package name */
        public final int f102089c;

        /* renamed from: d, reason: collision with root package name */
        public final int f102090d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f102091e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final PhotoPickerIntentFactory.CameraType f102092f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final PhotoPickerIntentFactory.PhotoPickerMode f102093g;

        public a(String str, String str2, int i12, int i13, String str3, PhotoPickerIntentFactory.CameraType cameraType, PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode, int i14, C42822w c42822w) {
            i12 = (i14 & 4) != 0 ? 0 : i12;
            i13 = (i14 & 8) != 0 ? 1 : i13;
            str3 = (i14 & 16) != 0 ? null : str3;
            cameraType = (i14 & 32) != 0 ? PhotoPickerIntentFactory.CameraType.f218799b : cameraType;
            this.f102087a = str;
            this.f102088b = str2;
            this.f102089c = i12;
            this.f102090d = i13;
            this.f102091e = str3;
            this.f102092f = cameraType;
            this.f102093g = photoPickerMode;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f102087a, aVar.f102087a) && L.f(this.f102088b, aVar.f102088b) && this.f102089c == aVar.f102089c && this.f102090d == aVar.f102090d && L.f(this.f102091e, aVar.f102091e) && this.f102092f == aVar.f102092f && L.f(this.f102093g, aVar.f102093g);
        }

        public final int hashCode() {
            int iE2 = androidx.appcompat.app.r.e(this.f102090d, androidx.appcompat.app.r.e(this.f102089c, H.d(this.f102087a.hashCode() * 31, 31, this.f102088b), 31), 31);
            String str = this.f102091e;
            return this.f102093g.hashCode() + ((this.f102092f.hashCode() + ((iE2 + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "Params(operationId=" + this.f102087a + ", typeId=" + this.f102088b + ", minPhotoCount=" + this.f102089c + ", maxPhotoCount=" + this.f102090d + ", selectedPhotoId=" + this.f102091e + ", startCamera=" + this.f102092f + ", pickerMode=" + this.f102093g + ')';
        }
    }

    @Inject
    public w(@Y61.k PhotoPickerIntentFactory photoPickerIntentFactory) {
        this.f102086b = photoPickerIntentFactory;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, a aVar) {
        a aVar2 = aVar;
        return PhotoPickerIntentFactory.a.a(this.f102086b, context, aVar2.f102087a, aVar2.f102088b, aVar2.f102089c, aVar2.f102090d, aVar2.f102091e, aVar2.f102092f, aVar2.f102093g, false, 256);
    }

    @Override // i.AbstractC41201a
    public final /* bridge */ /* synthetic */ G0 parseResult(int i12, Intent intent) {
        return G0.f406611a;
    }
}
