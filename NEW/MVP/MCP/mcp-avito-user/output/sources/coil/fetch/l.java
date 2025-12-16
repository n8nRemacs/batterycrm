package coil.fetch;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import androidx.appcompat.app.r;
import coil.decode.DataSource;
import coil.decode.s;
import coil.fetch.h;
import coil.request.t;
import coil.util.p;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import m.C43852a;
import okio.M;
import okio.Y;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourceUriFetcher.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil/fetch/l;", "Lcoil/fetch/h;", "a", "b", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Uri f58408a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f58409b;

    /* compiled from: ResourceUriFetcher.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcoil/fetch/l$a;", "", "<init>", "()V", "", "MIME_TYPE_XML", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ResourceUriFetcher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/fetch/l$b;", "Lcoil/fetch/h$a;", "Landroid/net/Uri;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements h.a<Uri> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, t tVar) {
            Uri uri = (Uri) obj;
            if (L.f(uri.getScheme(), "android.resource")) {
                return new l(uri, tVar);
            }
            return null;
        }
    }

    static {
        new a(null);
    }

    public l(@Y61.k Uri uri, @Y61.k t tVar) {
        this.f58408a = uri;
        this.f58409b = tVar;
    }

    @Override // coil.fetch.h
    @Y61.l
    public final Object b(@Y61.k Continuation<? super g> continuation) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Integer numY0;
        Drawable drawable;
        Uri uri = this.f58408a;
        String authority = uri.getAuthority();
        if (authority != null) {
            if (C43066x.K(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) C42745f0.S(uri.getPathSegments());
                if (str == null || (numY0 = C43066x.y0(str)) == null) {
                    throw new IllegalStateException(r.n(uri, "Invalid android.resource URI: "));
                }
                int iIntValue = numY0.intValue();
                t tVar = this.f58409b;
                Context context = tVar.f58717a;
                Resources resources = authority.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                boolean z12 = true;
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strB = coil.util.l.b(MimeTypeMap.getSingleton(), charSequence.subSequence(C43066x.M('/', 0, 6, charSequence), charSequence.length()).toString());
                if (!L.f(strB, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new m(s.b(new Y(M.g(resources.openRawResource(iIntValue, typedValue2))), context, new coil.decode.t(typedValue2.density)), strB, DataSource.f58270d);
                }
                if (authority.equals(context.getPackageName())) {
                    drawable = C43852a.a(context, iIntValue);
                    if (drawable == null) {
                        throw new IllegalStateException(AK.c.g(iIntValue, "Invalid resource ID: ").toString());
                    }
                } else {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
                    drawable = resources.getDrawable(iIntValue, theme);
                    if (drawable == null) {
                        throw new IllegalStateException(AK.c.g(iIntValue, "Invalid resource ID: ").toString());
                    }
                }
                if (!(drawable instanceof VectorDrawable) && !(drawable instanceof androidx.vectordrawable.graphics.drawable.i)) {
                    z12 = false;
                }
                if (z12) {
                    p.f58788a.getClass();
                    drawable = new BitmapDrawable(context.getResources(), p.a(drawable, tVar.f58718b, tVar.f58720d, tVar.f58721e, tVar.f58722f));
                }
                return new f(drawable, z12, DataSource.f58270d);
            }
        }
        throw new IllegalStateException(r.n(uri, "Invalid android.resource URI: "));
    }
}
