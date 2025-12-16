package androidx.view;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: NavDeepLink.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/N;", "", "a", "b", "c", "d", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23302N {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f52813q;

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f52814r;

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f52815a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f52816b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f52817c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f52818d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f52819e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f52820f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f52821g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Object f52822h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52823i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f52824j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Object f52825k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Object f52826l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f52827m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f52828n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f52829o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f52830p;

    /* compiled from: NavDeepLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/N$a;", "", "<init>", "()V", "a", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.N$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public String f52831a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public String f52832b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public String f52833c;

        /* compiled from: NavDeepLink.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/N$a$a;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.navigation.N$a$a, reason: collision with other inner class name */
        public static final class C1867a {
            public /* synthetic */ C1867a(C42822w c42822w) {
                this();
            }

            public C1867a() {
            }
        }

        static {
            new C1867a(null);
        }

        @RestrictTo
        public a() {
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/navigation/N$b;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "FILL_IN_PATTERN", "Ljava/util/regex/Pattern;", "SCHEME_PATTERN", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.N$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: NavDeepLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/N$c;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.N$c */
    public static final class c implements Comparable<c> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f52834b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f52835c;

        public c(@Y61.k String str) {
            List listE0;
            List listH = new C43059p("/").h(str);
            if (listH.isEmpty()) {
                listE0 = C42784z0.f406748b;
            } else {
                ListIterator listIterator = listH.listIterator(listH.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listE0 = C42745f0.E0(listH, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listE0 = C42784z0.f406748b;
            }
            this.f52834b = (String) listE0.get(0);
            this.f52835c = (String) listE0.get(1);
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            c cVar2 = cVar;
            int i12 = L.f(this.f52834b, cVar2.f52834b) ? 2 : 0;
            return L.f(this.f52835c, cVar2.f52835c) ? i12 + 1 : i12;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/N$d;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.N$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public String f52836a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f52837b = new ArrayList();
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.N$e */
    public static final class e extends N implements Y41.a<List<String>> {
        public e() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final List<String> invoke() {
            List<String> list;
            Q q12 = (Q) C23302N.this.f52824j.getValue();
            return (q12 == null || (list = (List) q12.f406619b) == null) ? new ArrayList() : list;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "", "", "invoke", "()Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.N$f */
    public static final class f extends N implements Y41.a<Q<? extends List<String>, ? extends String>> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Q<? extends List<String>, ? extends String> invoke() {
            String str = C23302N.this.f52815a;
            if (str == null || Uri.parse(str).getFragment() == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            String fragment = Uri.parse(str).getFragment();
            StringBuilder sb2 = new StringBuilder();
            C23302N.a(fragment, arrayList, sb2);
            return new Q<>(arrayList, sb2.toString());
        }
    }

    /* compiled from: NavDeepLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/regex/Pattern;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.N$g */
    public static final class g extends N implements Y41.a<Pattern> {
        public g() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final Pattern invoke() {
            String str = (String) C23302N.this.f52826l.getValue();
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.N$h */
    public static final class h extends N implements Y41.a<String> {
        public h() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final String invoke() {
            Q q12 = (Q) C23302N.this.f52824j.getValue();
            if (q12 != null) {
                return (String) q12.f406620c;
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.N$i */
    public static final class i extends N implements Y41.a<Boolean> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            String str = C23302N.this.f52815a;
            return Boolean.valueOf((str == null || Uri.parse(str).getQuery() == null) ? false : true);
        }
    }

    /* compiled from: NavDeepLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/regex/Pattern;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.N$j */
    public static final class j extends N implements Y41.a<Pattern> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Pattern invoke() {
            String str = C23302N.this.f52828n;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/regex/Pattern;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.N$k */
    public static final class k extends N implements Y41.a<Pattern> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Pattern invoke() {
            String str = C23302N.this.f52819e;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Landroidx/navigation/N$d;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.N$l */
    public static final class l extends N implements Y41.a<Map<String, d>> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, d> invoke() {
            Pattern pattern = C23302N.f52813q;
            C23302N c23302n = C23302N.this;
            c23302n.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (((Boolean) c23302n.f52821g.getValue()).booleanValue()) {
                String str = c23302n.f52815a;
                Uri uri = Uri.parse(str);
                for (String str2 : uri.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    List<String> queryParameters = uri.getQueryParameters(str2);
                    if (queryParameters.size() > 1) {
                        throw new IllegalArgumentException(androidx.camera.core.Q.a("Query parameter ", str2, " must only be present once in ", str, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                    }
                    String str3 = (String) C42745f0.G(queryParameters);
                    if (str3 == null) {
                        c23302n.f52823i = true;
                        str3 = str2;
                    }
                    Matcher matcher = C23302N.f52814r.matcher(str3);
                    d dVar = new d();
                    int iEnd = 0;
                    while (matcher.find()) {
                        dVar.f52837b.add(matcher.group(1));
                        sb2.append(Pattern.quote(str3.substring(iEnd, matcher.start())));
                        sb2.append("(.+?)?");
                        iEnd = matcher.end();
                    }
                    if (iEnd < str3.length()) {
                        sb2.append(Pattern.quote(str3.substring(iEnd)));
                    }
                    dVar.f52836a = C43066x.a0(sb2.toString(), ".*", "\\E.*\\Q", false);
                    linkedHashMap.put(str2, dVar);
                }
            }
            return linkedHashMap;
        }
    }

    static {
        new b(null);
        f52813q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
        f52814r = Pattern.compile("\\{(.+?)\\}");
    }

    public C23302N(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.f52815a = str;
        this.f52816b = str2;
        this.f52817c = str3;
        ArrayList arrayList = new ArrayList();
        this.f52818d = arrayList;
        this.f52820f = C42727D.c(new k());
        this.f52821g = C42727D.c(new i());
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f52822h = C42727D.b(lazyThreadSafetyMode, new l());
        this.f52824j = C42727D.b(lazyThreadSafetyMode, new f());
        this.f52825k = C42727D.b(lazyThreadSafetyMode, new e());
        this.f52826l = C42727D.b(lazyThreadSafetyMode, new h());
        this.f52827m = C42727D.c(new g());
        this.f52829o = C42727D.c(new j());
        if (str != null) {
            StringBuilder sb2 = new StringBuilder("^");
            if (!f52813q.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            a(str.substring(0, matcher.start()), arrayList, sb2);
            this.f52830p = (C43066x.q(sb2, ".*", false) || C43066x.q(sb2, "([^/]+?)", false)) ? false : true;
            sb2.append("($|(\\?(.)*)|(\\#(.)*))");
            this.f52819e = C43066x.a0(sb2.toString(), ".*", "\\E.*\\Q", false);
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            throw new IllegalArgumentException(AK.c.k("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(str3);
        StringBuilder sb3 = new StringBuilder("^(");
        sb3.append(cVar.f52834b);
        sb3.append("|[*]+)/(");
        this.f52828n = C43066x.a0(AK.c.s(sb3, cVar.f52835c, "|[*]+)$"), "*|[*]", "[\\s\\S]", false);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb2) {
        Matcher matcher = f52814r.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            arrayList.add(matcher.group(1));
            if (matcher.start() > iEnd) {
                sb2.append(Pattern.quote(str.substring(iEnd, matcher.start())));
            }
            sb2.append("([^/]+?)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            sb2.append(Pattern.quote(str.substring(iEnd)));
        }
    }

    public final boolean b(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f52818d;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            String str = (String) next;
            String strDecode = Uri.decode(matcher.group(i13));
            C23389r c23389r = (C23389r) linkedHashMap.get(str);
            if (c23389r != null) {
                try {
                    AbstractC23292H0<Object> abstractC23292H0 = c23389r.f53171a;
                    abstractC23292H0.e(str, bundle, abstractC23292H0.f(strDecode));
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                bundle.putString(str, strDecode);
            }
            arrayList2.add(G0.f406611a);
            i12 = i13;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
    public final boolean c(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        String query;
        C23302N c23302n = this;
        for (Map.Entry entry : ((Map) c23302n.f52822h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            d dVar = (d) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (c23302n.f52823i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = Collections.singletonList(query);
            }
            if (queryParameters != null) {
                for (String str2 : queryParameters) {
                    String str3 = dVar.f52836a;
                    Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                    int i12 = 0;
                    if (matcher == null || !matcher.matches()) {
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    try {
                        ArrayList arrayList = dVar.f52837b;
                        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                C42745f0.H0();
                                throw null;
                            }
                            String str4 = (String) next;
                            String strGroup = matcher.group(i13);
                            if (strGroup == null) {
                                strGroup = "";
                            }
                            try {
                                C23389r c23389r = (C23389r) linkedHashMap.get(str4);
                                if (!bundle.containsKey(str4)) {
                                    if (!strGroup.equals('{' + str4 + '}')) {
                                        if (c23389r != null) {
                                            AbstractC23292H0<Object> abstractC23292H0 = c23389r.f53171a;
                                            abstractC23292H0.e(str4, bundle2, abstractC23292H0.f(strGroup));
                                        } else {
                                            bundle2.putString(str4, strGroup);
                                        }
                                    }
                                } else if (c23389r != null) {
                                    AbstractC23292H0<Object> abstractC23292H02 = c23389r.f53171a;
                                    Object objA = abstractC23292H02.a(bundle, str4);
                                    if (!bundle.containsKey(str4)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    abstractC23292H02.e(str4, bundle, abstractC23292H02.c(objA, strGroup));
                                } else {
                                    continue;
                                }
                                arrayList2.add(G0.f406611a);
                                i12 = i13;
                            } catch (IllegalArgumentException unused) {
                                continue;
                            }
                        }
                        bundle.putAll(bundle2);
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
            c23302n = this;
        }
        return true;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj == null || !(obj instanceof C23302N)) {
            return false;
        }
        C23302N c23302n = (C23302N) obj;
        return L.f(this.f52815a, c23302n.f52815a) && L.f(this.f52816b, c23302n.f52816b) && L.f(this.f52817c, c23302n.f52817c);
    }

    public final int hashCode() {
        String str = this.f52815a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f52816b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f52817c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
