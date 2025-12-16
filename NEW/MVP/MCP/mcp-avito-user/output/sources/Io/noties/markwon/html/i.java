package io.noties.markwon.html;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import io.noties.markwon.html.g;
import io.noties.markwon.html.jsoup.parser.Token;
import io.noties.markwon.html.r;
import j.N;
import j.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: MarkwonHtmlParserImpl.java */
/* loaded from: classes8.dex */
public class i extends h {

    /* renamed from: g, reason: collision with root package name */
    @k0
    public static final Set<String> f401745g = Collections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", Constants.SMALL, "span", "strong", "sub", "sup", "textarea", CrashHianalyticsData.TIME, "tt", "var")));

    /* renamed from: h, reason: collision with root package name */
    public static final Set<String> f401746h = Collections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", Constants.REFERRER_API_META, "param", SearchParamsConverterKt.SOURCE, "track", "wbr")));

    /* renamed from: i, reason: collision with root package name */
    public static final Set<String> f401747i = Collections.unmodifiableSet(new HashSet(Arrays.asList(AddressParameter.TYPE, "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));

    /* renamed from: a, reason: collision with root package name */
    public final d f401748a;

    /* renamed from: b, reason: collision with root package name */
    public final r.a f401749b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f401750c = new ArrayList(0);

    /* renamed from: d, reason: collision with root package name */
    public g.a f401751d = new g.a("", 0, Collections.emptyMap(), null);

    /* renamed from: e, reason: collision with root package name */
    public boolean f401752e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f401753f;

    /* compiled from: MarkwonHtmlParserImpl.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f401754a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f401754a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f401754a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f401754a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(@N d dVar, @N r.a aVar) {
        this.f401748a = dVar;
        this.f401749b = aVar;
    }

    @N
    public static Map<String, String> a(@N Token.g gVar) {
        io.noties.markwon.html.jsoup.nodes.b bVar = gVar.f401786j;
        int i12 = bVar.f401759b;
        if (i12 <= 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(i12);
        Iterator<io.noties.markwon.html.jsoup.nodes.a> it = bVar.iterator();
        while (it.hasNext()) {
            io.noties.markwon.html.jsoup.nodes.a next = it.next();
            map.put(next.f401755b.toLowerCase(Locale.US), next.f401756c);
        }
        return Collections.unmodifiableMap(map);
    }

    public final void b() {
        this.f401750c.clear();
        this.f401751d = new g.a("", 0, Collections.emptyMap(), null);
    }
}
