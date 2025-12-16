package ru.cyberity.cbr.core.theme;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.component.accordion.s;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.FontStyleKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: Element.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/theme/b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "Lru/cyberity/cbr/core/theme/b$a;", "Lru/cyberity/cbr/core/theme/b$b;", "Lru/cyberity/cbr/core/theme/b$c;", "Lru/cyberity/cbr/core/theme/b$d;", "Lru/cyberity/cbr/core/theme/b$e;", "Lru/cyberity/cbr/core/theme/b$f;", "Lru/cyberity/cbr/core/theme/b$g;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class b {

    /* compiled from: Element.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/theme/b$a;", "Lru/cyberity/cbr/core/theme/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "dark", "b", "d", FontStyleKt.LIGHT, "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class a extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final Integer dark;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final Integer light;

        @l
        /* renamed from: c, reason: from getter */
        public final Integer getDark() {
            return this.dark;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Integer getLight() {
            return this.light;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return L.f(this.dark, aVar.dark) && L.f(this.light, aVar.light);
        }

        public int hashCode() {
            Integer num = this.dark;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.light;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Color(dark=");
            sb2.append(this.dark);
            sb2.append(", light=");
            return s.j(sb2, this.light, ')');
        }
    }

    /* compiled from: Element.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/theme/b$b;", "Lru/cyberity/cbr/core/theme/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/lang/Float;", "b", "()Ljava/lang/Float;", "value", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.theme.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12491b extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final Float value;

        @l
        /* renamed from: b, reason: from getter */
        public final Float getValue() {
            return this.value;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C12491b) && L.f(this.value, ((C12491b) other).value);
        }

        public int hashCode() {
            Float f12 = this.value;
            if (f12 == null) {
                return 0;
            }
            return f12.hashCode();
        }

        @k
        public String toString() {
            return h.d(new StringBuilder("Dimension(value="), this.value, ')');
        }
    }

    /* compiled from: Element.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u0014\u0010!¨\u0006\""}, d2 = {"Lru/cyberity/cbr/core/theme/b$c;", "Lru/cyberity/cbr/core/theme/b;", "", "image", "", "scale", "rendering", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "c", "g", "d", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class c extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final String image;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final Integer scale;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final String rendering;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        private Bitmap bitmap;

        public /* synthetic */ c(String str, Integer num, String str2, Bitmap bitmap, int i12, C42822w c42822w) {
            this(str, num, str2, (i12 & 8) != 0 ? null : bitmap);
        }

        public final void a(@l Bitmap bitmap) {
            this.bitmap = bitmap;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return L.f(this.image, cVar.image) && L.f(this.scale, cVar.scale) && L.f(this.rendering, cVar.rendering) && L.f(this.bitmap, cVar.bitmap);
        }

        @l
        /* renamed from: f, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final Integer getScale() {
            return this.scale;
        }

        public int hashCode() {
            String str = this.image;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.scale;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.rendering;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Bitmap bitmap = this.bitmap;
            return iHashCode3 + (bitmap != null ? bitmap.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Image(image=" + this.image + ", scale=" + this.scale + ", rendering=" + this.rendering + ", bitmap=" + this.bitmap + ')';
        }

        public c(@l String str, @l Integer num, @l String str2, @l Bitmap bitmap) {
            super(null);
            this.image = str;
            this.scale = num;
            this.rendering = str2;
            this.bitmap = bitmap;
        }
    }

    /* compiled from: Element.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/theme/b$d;", "Lru/cyberity/cbr/core/theme/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "Lru/cyberity/cbr/core/theme/b$c;", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "images", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class d extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final Map<String, c> images;

        @k
        public final Map<String, c> b() {
            return this.images;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && L.f(this.images, ((d) other).images);
        }

        public int hashCode() {
            return this.images.hashCode();
        }

        @k
        public String toString() {
            return r.w(new StringBuilder("ImageList(images="), this.images, ')');
        }
    }

    /* compiled from: Element.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/core/theme/b$e;", "Lru/cyberity/cbr/core/theme/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/lang/Float;", "d", "()Ljava/lang/Float;", "width", "b", "c", "height", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class e extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final Float width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final Float height;

        @l
        /* renamed from: c, reason: from getter */
        public final Float getHeight() {
            return this.height;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Float getWidth() {
            return this.width;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return L.f(this.width, eVar.width) && L.f(this.height, eVar.height);
        }

        public int hashCode() {
            Float f12 = this.width;
            int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
            Float f13 = this.height;
            return iHashCode + (f13 != null ? f13.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Size(width=");
            sb2.append(this.width);
            sb2.append(", height=");
            return h.d(sb2, this.height, ')');
        }
    }

    /* compiled from: Element.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/core/theme/b$f;", "Lru/cyberity/cbr/core/theme/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "value", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class f extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final String value;

        @k
        /* renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && L.f(this.value, ((f) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("Style(value="), this.value, ')');
        }
    }

    /* compiled from: Element.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b\u0014\u0010 ¨\u0006!"}, d2 = {"Lru/cyberity/cbr/core/theme/b$g;", "Lru/cyberity/cbr/core/theme/b;", "", "face", "", "size", "filename", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Ljava/lang/String;ILjava/lang/String;Landroid/graphics/Typeface;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "I", "g", "c", "f", "d", "Landroid/graphics/Typeface;", "h", "()Landroid/graphics/Typeface;", "(Landroid/graphics/Typeface;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class g extends b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @k
        private final String face;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int size;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @k
        private final String filename;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        private Typeface typeface;

        public /* synthetic */ g(String str, int i12, String str2, Typeface typeface, int i13, C42822w c42822w) {
            this(str, i12, str2, (i13 & 8) != 0 ? null : typeface);
        }

        public final void a(@l Typeface typeface) {
            this.typeface = typeface;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return L.f(this.face, gVar.face) && this.size == gVar.size && L.f(this.filename, gVar.filename) && L.f(this.typeface, gVar.typeface);
        }

        @k
        /* renamed from: f, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        /* renamed from: g, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        @l
        /* renamed from: h, reason: from getter */
        public final Typeface getTypeface() {
            return this.typeface;
        }

        public int hashCode() {
            int iD2 = H.d(r.e(this.size, this.face.hashCode() * 31, 31), 31, this.filename);
            Typeface typeface = this.typeface;
            return iD2 + (typeface == null ? 0 : typeface.hashCode());
        }

        @k
        public String toString() {
            return "Typography(face=" + this.face + ", size=" + this.size + ", filename=" + this.filename + ", typeface=" + this.typeface + ')';
        }

        public g(@k String str, int i12, @k String str2, @l Typeface typeface) {
            super(null);
            this.face = str;
            this.size = i12;
            this.filename = str2;
            this.typeface = typeface;
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    private b() {
    }
}
