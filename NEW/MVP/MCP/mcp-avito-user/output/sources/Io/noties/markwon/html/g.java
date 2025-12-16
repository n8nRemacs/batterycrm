package io.noties.markwon.html;

import io.noties.markwon.html.f;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: HtmlTagImpl.java */
/* loaded from: classes8.dex */
abstract class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f401739a;

    /* renamed from: b, reason: collision with root package name */
    public final int f401740b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f401741c;

    /* renamed from: d, reason: collision with root package name */
    public int f401742d = -1;

    /* compiled from: HtmlTagImpl.java */
    public static class b extends g implements f.b {
        public b() {
            throw null;
        }

        @Override // io.noties.markwon.html.f
        @N
        public final f.a a() {
            throw new ClassCastException("Cannot cast Inline instance to Block");
        }

        @Override // io.noties.markwon.html.f
        public final boolean d() {
            return false;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InlineImpl{name='");
            sb2.append(this.f401739a);
            sb2.append("', start=");
            sb2.append(this.f401740b);
            sb2.append(", end=");
            sb2.append(this.f401742d);
            sb2.append(", attributes=");
            return androidx.appcompat.app.r.w(sb2, this.f401741c, '}');
        }
    }

    public g(int i12, @N String str, @N Map map) {
        this.f401739a = str;
        this.f401740b = i12;
        this.f401741c = map;
    }

    @Override // io.noties.markwon.html.f
    @N
    public Map<String, String> b() {
        return this.f401741c;
    }

    @Override // io.noties.markwon.html.f
    public final int f() {
        return this.f401742d;
    }

    @Override // io.noties.markwon.html.f
    public final boolean isClosed() {
        return this.f401742d > -1;
    }

    @Override // io.noties.markwon.html.f
    @N
    public final String name() {
        return this.f401739a;
    }

    @Override // io.noties.markwon.html.f
    public final int start() {
        return this.f401740b;
    }

    /* compiled from: HtmlTagImpl.java */
    public static class a extends g implements f.a {

        /* renamed from: e, reason: collision with root package name */
        public final a f401743e;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList f401744f;

        public a(@N String str, int i12, @N Map<String, String> map, @P a aVar) {
            super(i12, str, map);
            this.f401743e = aVar;
        }

        @Override // io.noties.markwon.html.g, io.noties.markwon.html.f
        @N
        public final Map<String, String> b() {
            return this.f401741c;
        }

        @Override // io.noties.markwon.html.f.a
        @P
        public final f.a c() {
            return this.f401743e;
        }

        @Override // io.noties.markwon.html.f
        public final boolean d() {
            return true;
        }

        @Override // io.noties.markwon.html.f.a
        @N
        public final List<f.a> e() {
            ArrayList arrayList = this.f401744f;
            return arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        }

        public final void g(int i12) {
            if (isClosed()) {
                return;
            }
            this.f401742d = i12;
            ArrayList arrayList = this.f401744f;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).g(i12);
                }
            }
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BlockImpl{name='");
            sb2.append(this.f401739a);
            sb2.append("', start=");
            sb2.append(this.f401740b);
            sb2.append(", end=");
            sb2.append(this.f401742d);
            sb2.append(", attributes=");
            sb2.append(this.f401741c);
            sb2.append(", parent=");
            a aVar = this.f401743e;
            sb2.append(aVar != null ? aVar.f401739a : null);
            sb2.append(", children=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f401744f, '}');
        }

        @Override // io.noties.markwon.html.f
        @N
        public final f.a a() {
            return this;
        }
    }
}
