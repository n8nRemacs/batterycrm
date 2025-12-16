package com.avito.android.extended_profile_universal_widget_edit.edit_block;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetImageUploader.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tJ\u001b\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetImageUploader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function0;", "Lkotlin/G0;", "listener", "setOnRemoveClickListener", "(LY41/a;)V", "setOnImageClickListener", "Platform", "a", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UniversalWidgetImageUploader extends ConstraintLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f153997i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f153998b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f153999c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f154000d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f154001e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f154002f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f154003g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f154004h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetImageUploader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetImageUploader$Platform;", "", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Platform {

        /* renamed from: b, reason: collision with root package name */
        public static final Platform f154005b;

        /* renamed from: c, reason: collision with root package name */
        public static final Platform f154006c;

        /* renamed from: d, reason: collision with root package name */
        public static final Platform f154007d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Platform[] f154008e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f154009f;

        static {
            Platform platform = new Platform("MOBILE", 0);
            f154005b = platform;
            Platform platform2 = new Platform("DESKTOP", 1);
            f154006c = platform2;
            Platform platform3 = new Platform("BOTH", 2);
            f154007d = platform3;
            Platform[] platformArr = {platform, platform2, platform3};
            f154008e = platformArr;
            f154009f = kotlin.enums.c.a(platformArr);
        }

        public Platform() {
            throw null;
        }

        public static Platform valueOf(String str) {
            return (Platform) Enum.valueOf(Platform.class, str);
        }

        public static Platform[] values() {
            return (Platform[]) f154008e.clone();
        }
    }

    /* compiled from: UniversalWidgetImageUploader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[Platform.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Platform platform = Platform.f154005b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Platform platform2 = Platform.f154005b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @X41.j
    public UniversalWidgetImageUploader(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(@Y61.k com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetImageUploader.a r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetImageUploader.g(com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetImageUploader$a, boolean):void");
    }

    public final void setOnImageClickListener(@Y61.k Y41.a<G0> listener) {
        this.f153998b.setOnClickListener(new r(listener, 1));
    }

    public final void setOnRemoveClickListener(@Y61.k Y41.a<G0> listener) {
        this.f154002f.setOnClickListener(new r(listener, 0));
    }

    public UniversalWidgetImageUploader(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.universal_widget_edit_block_image_uploader, this);
        this.f153998b = (SimpleDraweeView) findViewById(R.id.extended_profile_universal_widget_image);
        this.f153999c = (ImageView) findViewById(R.id.extended_profile_universal_widget_image_platform_preview);
        this.f154000d = (TextView) findViewById(R.id.extended_profile_universal_widget_image_preview_size);
        this.f154001e = (ImageView) findViewById(R.id.extended_profile_universal_widget_image_text);
        this.f154002f = findViewById(R.id.extended_profile_universal_widget_image_remove);
        this.f154003g = (ImageView) findViewById(R.id.extended_profile_universal_widget_image_platform);
        this.f154004h = (TextView) findViewById(R.id.extended_profile_universal_widget_image_error);
    }

    /* compiled from: UniversalWidgetImageUploader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit_block/UniversalWidgetImageUploader$a;", "", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Image f154010a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Uri f154011b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f154012c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f154013d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f154014e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Platform f154015f;

        /* renamed from: g, reason: collision with root package name */
        public final float f154016g;

        public a(@Y61.l Image image, @Y61.l Uri uri, @Y61.l String str, @Y61.l String str2, boolean z12, @Y61.k Platform platform, float f12) {
            this.f154010a = image;
            this.f154011b = uri;
            this.f154012c = str;
            this.f154013d = str2;
            this.f154014e = z12;
            this.f154015f = platform;
            this.f154016g = f12;
        }

        public static a a(a aVar, Uri uri, String str, int i12) {
            Image image = (i12 & 1) != 0 ? aVar.f154010a : null;
            if ((i12 & 2) != 0) {
                uri = aVar.f154011b;
            }
            String str2 = aVar.f154013d;
            boolean z12 = aVar.f154014e;
            Platform platform = aVar.f154015f;
            float f12 = aVar.f154016g;
            aVar.getClass();
            return new a(image, uri, str, str2, z12, platform, f12);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f154010a, aVar.f154010a) && L.f(this.f154011b, aVar.f154011b) && L.f(this.f154012c, aVar.f154012c) && L.f(this.f154013d, aVar.f154013d) && this.f154014e == aVar.f154014e && this.f154015f == aVar.f154015f && Float.compare(this.f154016g, aVar.f154016g) == 0;
        }

        public final int hashCode() {
            Image image = this.f154010a;
            int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
            Uri uri = this.f154011b;
            int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            String str = this.f154012c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f154013d;
            return Float.hashCode(this.f154016g) + ((this.f154015f.hashCode() + androidx.appcompat.app.r.i((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f154014e)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UniversalWidgetImageUploaderState(image=");
            sb2.append(this.f154010a);
            sb2.append(", selectedImage=");
            sb2.append(this.f154011b);
            sb2.append(", errorText=");
            sb2.append(this.f154012c);
            sb2.append(", previewSize=");
            sb2.append(this.f154013d);
            sb2.append(", showImageText=");
            sb2.append(this.f154014e);
            sb2.append(", platform=");
            sb2.append(this.f154015f);
            sb2.append(", cropImageRatio=");
            return androidx.appcompat.app.r.k(')', this.f154016g, sb2);
        }

        public /* synthetic */ a(Image image, Uri uri, String str, String str2, boolean z12, Platform platform, float f12, int i12, C42822w c42822w) {
            this(image, (i12 & 2) != 0 ? null : uri, str, str2, z12, platform, f12);
        }
    }
}
