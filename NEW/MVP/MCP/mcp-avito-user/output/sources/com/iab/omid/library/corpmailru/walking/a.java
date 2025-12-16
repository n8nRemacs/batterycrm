package com.iab.omid.library.corpmailru.walking;

import android.view.View;
import com.iab.omid.library.corpmailru.d.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<View, String> f364034a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<View, C10765a> f364035b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, View> f364036c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<View> f364037d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet<String> f364038e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet<String> f364039f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap<String, String> f364040g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f364041h;

    /* renamed from: com.iab.omid.library.corpmailru.walking.a$a, reason: collision with other inner class name */
    public static class C10765a {

        /* renamed from: a, reason: collision with root package name */
        private final com.iab.omid.library.corpmailru.b.c f364045a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<String> f364046b = new ArrayList<>();

        public C10765a(com.iab.omid.library.corpmailru.b.c cVar, String str) {
            this.f364045a = cVar;
            a(str);
        }

        public com.iab.omid.library.corpmailru.b.c a() {
            return this.f364045a;
        }

        public ArrayList<String> b() {
            return this.f364046b;
        }

        public void a(String str) {
            this.f364046b.add(str);
        }
    }

    private String d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strE = f.e(view);
            if (strE != null) {
                return strE;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.f364037d.addAll(hashSet);
        return null;
    }

    public String a(View view) {
        if (this.f364034a.size() == 0) {
            return null;
        }
        String str = this.f364034a.get(view);
        if (str != null) {
            this.f364034a.remove(view);
        }
        return str;
    }

    public View b(String str) {
        return this.f364036c.get(str);
    }

    public c c(View view) {
        return this.f364037d.contains(view) ? c.PARENT_VIEW : this.f364041h ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public void e() {
        this.f364041h = true;
    }

    public String a(String str) {
        return this.f364040g.get(str);
    }

    public C10765a b(View view) {
        C10765a c10765a = this.f364035b.get(view);
        if (c10765a != null) {
            this.f364035b.remove(view);
        }
        return c10765a;
    }

    public void c() {
        com.iab.omid.library.corpmailru.b.a aVarA = com.iab.omid.library.corpmailru.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.corpmailru.adsession.a aVar : aVarA.c()) {
                View viewD = aVar.d();
                if (aVar.e()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (viewD != null) {
                        String strD = d(viewD);
                        if (strD == null) {
                            this.f364038e.add(adSessionId);
                            this.f364034a.put(viewD, adSessionId);
                            a(aVar);
                        } else {
                            this.f364039f.add(adSessionId);
                            this.f364036c.put(adSessionId, viewD);
                            this.f364040g.put(adSessionId, strD);
                        }
                    } else {
                        this.f364039f.add(adSessionId);
                        this.f364040g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void d() {
        this.f364034a.clear();
        this.f364035b.clear();
        this.f364036c.clear();
        this.f364037d.clear();
        this.f364038e.clear();
        this.f364039f.clear();
        this.f364040g.clear();
        this.f364041h = false;
    }

    public HashSet<String> a() {
        return this.f364038e;
    }

    public HashSet<String> b() {
        return this.f364039f;
    }

    private void a(com.iab.omid.library.corpmailru.adsession.a aVar) {
        Iterator<com.iab.omid.library.corpmailru.b.c> it = aVar.a().iterator();
        while (it.hasNext()) {
            a(it.next(), aVar);
        }
    }

    private void a(com.iab.omid.library.corpmailru.b.c cVar, com.iab.omid.library.corpmailru.adsession.a aVar) {
        View view = cVar.a().get();
        if (view == null) {
            return;
        }
        C10765a c10765a = this.f364035b.get(view);
        if (c10765a != null) {
            c10765a.a(aVar.getAdSessionId());
        } else {
            this.f364035b.put(view, new C10765a(cVar, aVar.getAdSessionId()));
        }
    }
}
