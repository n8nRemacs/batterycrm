package PK0;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.avito.android.util.C35763c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextStyleDataProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LPK0/b;", "", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f12969a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12970b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12971c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12972d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final C35763c0 f12973e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Drawable f12974f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final a f12975g;

    /* compiled from: TextStyleDataProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPK0/b$a;", "", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Float f12976a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Typeface f12977b;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f12976a, aVar.f12976a) && L.f(this.f12977b, aVar.f12977b);
        }

        public final int hashCode() {
            Float f12 = this.f12976a;
            int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
            Typeface typeface = this.f12977b;
            return iHashCode + (typeface != null ? typeface.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "TextStyle(textSize=" + this.f12976a + ", font=" + this.f12977b + ')';
        }

        public a(@Y61.l Float f12, @Y61.l Typeface typeface) {
            this.f12976a = f12;
            this.f12977b = typeface;
        }

        public /* synthetic */ a(Float f12, Typeface typeface, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : f12, (i12 & 2) != 0 ? null : typeface);
        }
    }

    public b(@Y61.k String str, int i12, boolean z12, int i13, @Y61.l C35763c0 c35763c0, @Y61.l Drawable drawable, @Y61.l a aVar) {
        this.f12969a = str;
        this.f12970b = i12;
        this.f12971c = z12;
        this.f12972d = i13;
        this.f12973e = c35763c0;
        this.f12974f = drawable;
        this.f12975g = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f12969a, bVar.f12969a) && this.f12970b == bVar.f12970b && this.f12971c == bVar.f12971c && this.f12972d == bVar.f12972d && L.f(this.f12973e, bVar.f12973e) && L.f(this.f12974f, bVar.f12974f) && L.f(this.f12975g, bVar.f12975g);
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f12972d, androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f12970b, this.f12969a.hashCode() * 31, 31), 31, this.f12971c), 31);
        C35763c0 c35763c0 = this.f12973e;
        int iHashCode = (iE2 + (c35763c0 == null ? 0 : c35763c0.hashCode())) * 31;
        Drawable drawable = this.f12974f;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        a aVar = this.f12975g;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ExpandableStyle(expandText=" + this.f12969a + ", compactNumberOfLines=" + this.f12970b + ", shouldUseNewLine=" + this.f12971c + ", expandTextStyleAttr=" + this.f12972d + ", expandTextColor=" + this.f12973e + ", expandIcon=" + this.f12974f + ", expandTextStyle=" + this.f12975g + ')';
    }

    public /* synthetic */ b(String str, int i12, boolean z12, int i13, C35763c0 c35763c0, Drawable drawable, a aVar, int i14, C42822w c42822w) {
        this(str, i12, z12, i13, (i14 & 16) != 0 ? null : c35763c0, (i14 & 32) != 0 ? null : drawable, (i14 & 64) != 0 ? null : aVar);
    }
}
