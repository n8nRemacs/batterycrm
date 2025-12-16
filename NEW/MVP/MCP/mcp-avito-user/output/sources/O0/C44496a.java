package o0;

import X41.f;
import Y61.k;
import android.content.res.TypedArray;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.vector.C22299j;
import androidx.core.content.res.l;
import j.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: XmlVectorParser.android.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo0/a;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C44496a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final XmlPullParser f419254a;

    /* renamed from: b, reason: collision with root package name */
    public int f419255b;

    /* renamed from: c, reason: collision with root package name */
    @f
    @k
    public final C22299j f419256c;

    public C44496a(XmlPullParser xmlPullParser, int i12, int i13, C42822w c42822w) {
        i12 = (i13 & 2) != 0 ? 0 : i12;
        this.f419254a = xmlPullParser;
        this.f419255b = i12;
        this.f419256c = new C22299j();
    }

    public final float a(@k TypedArray typedArray, @k String str, @g0 int i12, float f12) {
        if (l.d(this.f419254a, str)) {
            f12 = typedArray.getFloat(i12, f12);
        }
        b(typedArray.getChangingConfigurations());
        return f12;
    }

    public final void b(int i12) {
        this.f419255b = i12 | this.f419255b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44496a)) {
            return false;
        }
        C44496a c44496a = (C44496a) obj;
        return L.f(this.f419254a, c44496a.f419254a) && this.f419255b == c44496a.f419255b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f419255b) + (this.f419254a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f419254a);
        sb2.append(", config=");
        return r.t(sb2, this.f419255b, ')');
    }
}
