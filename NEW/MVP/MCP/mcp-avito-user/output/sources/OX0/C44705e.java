package oX0;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;

/* compiled from: JsonWriteContext.java */
/* renamed from: oX0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C44705e extends com.fasterxml.jackson.core.g {

    /* renamed from: c, reason: collision with root package name */
    public final C44705e f419833c;

    /* renamed from: d, reason: collision with root package name */
    public C44702b f419834d;

    /* renamed from: e, reason: collision with root package name */
    public C44705e f419835e;

    /* renamed from: f, reason: collision with root package name */
    public String f419836f;

    /* renamed from: g, reason: collision with root package name */
    public Object f419837g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f419838h;

    public C44705e(int i12, C44705e c44705e, C44702b c44702b) {
        this.f341141a = i12;
        this.f419833c = c44705e;
        this.f419834d = c44702b;
        this.f341142b = -1;
    }

    @Override // com.fasterxml.jackson.core.g
    public final String a() {
        return this.f419836f;
    }

    @Override // com.fasterxml.jackson.core.g
    public final Object b() {
        return this.f419837g;
    }

    @Override // com.fasterxml.jackson.core.g
    public final com.fasterxml.jackson.core.g c() {
        return this.f419833c;
    }

    @Override // com.fasterxml.jackson.core.g
    public final void g(Object obj) {
        this.f419837g = obj;
    }

    public final C44705e i() {
        C44705e c44705e = this.f419835e;
        if (c44705e == null) {
            C44702b c44702b = this.f419834d;
            C44705e c44705e2 = new C44705e(1, this, c44702b != null ? c44702b.a() : null);
            this.f419835e = c44705e2;
            return c44705e2;
        }
        c44705e.f341141a = 1;
        c44705e.f341142b = -1;
        c44705e.f419836f = null;
        c44705e.f419838h = false;
        c44705e.f419837g = null;
        C44702b c44702b2 = c44705e.f419834d;
        if (c44702b2 != null) {
            c44702b2.f419817b = null;
            c44702b2.f419818c = null;
            c44702b2.f419819d = null;
        }
        return c44705e;
    }

    public final C44705e j(Object obj) {
        C44705e c44705e = this.f419835e;
        if (c44705e == null) {
            C44702b c44702b = this.f419834d;
            C44705e c44705e2 = new C44705e(1, this, c44702b != null ? c44702b.a() : null, obj);
            this.f419835e = c44705e2;
            return c44705e2;
        }
        c44705e.f341141a = 1;
        c44705e.f341142b = -1;
        c44705e.f419836f = null;
        c44705e.f419838h = false;
        c44705e.f419837g = obj;
        C44702b c44702b2 = c44705e.f419834d;
        if (c44702b2 != null) {
            c44702b2.f419817b = null;
            c44702b2.f419818c = null;
            c44702b2.f419819d = null;
        }
        return c44705e;
    }

    public final C44705e k() {
        C44705e c44705e = this.f419835e;
        if (c44705e == null) {
            C44702b c44702b = this.f419834d;
            C44705e c44705e2 = new C44705e(2, this, c44702b != null ? c44702b.a() : null);
            this.f419835e = c44705e2;
            return c44705e2;
        }
        c44705e.f341141a = 2;
        c44705e.f341142b = -1;
        c44705e.f419836f = null;
        c44705e.f419838h = false;
        c44705e.f419837g = null;
        C44702b c44702b2 = c44705e.f419834d;
        if (c44702b2 != null) {
            c44702b2.f419817b = null;
            c44702b2.f419818c = null;
            c44702b2.f419819d = null;
        }
        return c44705e;
    }

    public final C44705e l(Object obj) {
        C44705e c44705e = this.f419835e;
        if (c44705e == null) {
            C44702b c44702b = this.f419834d;
            C44705e c44705e2 = new C44705e(2, this, c44702b != null ? c44702b.a() : null, obj);
            this.f419835e = c44705e2;
            return c44705e2;
        }
        c44705e.f341141a = 2;
        c44705e.f341142b = -1;
        c44705e.f419836f = null;
        c44705e.f419838h = false;
        c44705e.f419837g = obj;
        C44702b c44702b2 = c44705e.f419834d;
        if (c44702b2 != null) {
            c44702b2.f419817b = null;
            c44702b2.f419818c = null;
            c44702b2.f419819d = null;
        }
        return c44705e;
    }

    public final int m(String str) throws JsonGenerationException {
        if (this.f341141a != 2 || this.f419838h) {
            return 4;
        }
        this.f419838h = true;
        this.f419836f = str;
        C44702b c44702b = this.f419834d;
        if (c44702b == null || !c44702b.b(str)) {
            return this.f341142b < 0 ? 0 : 1;
        }
        String strK = AK.c.k("Duplicate field '", str, "'");
        Object obj = c44702b.f419816a;
        throw new JsonGenerationException(strK, obj instanceof JsonGenerator ? (JsonGenerator) obj : null);
    }

    public final int n() {
        int i12 = this.f341141a;
        if (i12 == 2) {
            if (!this.f419838h) {
                return 5;
            }
            this.f419838h = false;
            this.f341142b++;
            return 2;
        }
        if (i12 == 1) {
            int i13 = this.f341142b;
            this.f341142b = i13 + 1;
            return i13 < 0 ? 0 : 1;
        }
        int i14 = this.f341142b + 1;
        this.f341142b = i14;
        return i14 == 0 ? 0 : 3;
    }

    public C44705e(int i12, C44705e c44705e, C44702b c44702b, Object obj) {
        this.f341141a = i12;
        this.f419833c = c44705e;
        this.f419834d = c44702b;
        this.f341142b = -1;
        this.f419837g = obj;
    }
}
