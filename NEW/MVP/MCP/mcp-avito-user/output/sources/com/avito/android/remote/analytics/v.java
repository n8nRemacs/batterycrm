package com.avito.android.remote.analytics;

import android.net.Uri;
import android.util.Patterns;
import com.avito.android.util.C5;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: NetworkErrorsUrlFormatter.kt */
@h31.j
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/analytics/v;", "Lcom/avito/android/remote/analytics/u;", "<init>", "()V", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class v implements u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C43059p f253266a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C43059p f253267b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C43059p f253268c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C43059p f253269d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C43059p f253270e;

    /* compiled from: NetworkErrorsUrlFormatter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/analytics/v$a;", "", "<init>", "()V", "Lkotlin/text/p;", "apiWithVersionNumberRegex", "Lkotlin/text/p;", "numberRegex", "uuidRegex", "versionNumberRegex", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f253266a = new C43059p("\\{[\\w\\d]+\\}");
        f253267b = new C43059p("^\\d+");
        f253268c = new C43059p("^api/\\d+");
        f253269d = new C43059p("[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}");
        f253270e = new C43059p("(?<=/)(\\d+)(?=/|$)");
    }

    @Inject
    public v() {
    }

    public static String d(Uri uri) {
        return uri.getScheme() + "://" + uri.getHost() + '/';
    }

    @Override // com.avito.android.remote.analytics.u
    @Y61.k
    public final String a(@Y61.k String str, @Y61.k String str2) {
        String path;
        if (str.length() == 0) {
            Uri uri = Uri.parse(str2);
            if (uri == null || (str = uri.getPath()) == null) {
                str = "";
            }
        } else {
            Uri uri2 = Uri.parse(str);
            if (uri2 != null && (path = uri2.getPath()) != null) {
                str = path;
            }
        }
        String strF = f253270e.f(f253269d.f(f253268c.f(f253267b.f(f253266a.f(C43066x.U("/", str), "{id}"), "{version}"), "api/{version}"), "{id}"), "{id}");
        C43059p c43059p = C5.f318567a;
        if (!C43066x.h0(strF, "api/", false)) {
            strF = "api/".concat(strF);
        }
        return androidx.appcompat.app.r.q(d(Uri.parse(str2)), strF);
    }

    @Override // com.avito.android.remote.analytics.u
    @Y61.k
    public final String b(@Y61.k Uri uri) {
        return d(uri) + "{imagePath}";
    }

    @Override // com.avito.android.remote.analytics.u
    @Y61.l
    public final String c(@Y61.l String str) {
        if (str != null) {
            return new C43059p(Patterns.WEB_URL).f(str, "<url>");
        }
        return null;
    }
}
