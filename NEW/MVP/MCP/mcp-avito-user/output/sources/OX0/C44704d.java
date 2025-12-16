package oX0;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;

/* compiled from: JsonReadContext.java */
/* renamed from: oX0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44704d extends com.fasterxml.jackson.core.g {

    /* renamed from: c, reason: collision with root package name */
    public final C44704d f419826c;

    /* renamed from: d, reason: collision with root package name */
    public final C44702b f419827d;

    /* renamed from: e, reason: collision with root package name */
    public C44704d f419828e;

    /* renamed from: f, reason: collision with root package name */
    public String f419829f;

    /* renamed from: g, reason: collision with root package name */
    public Object f419830g;

    /* renamed from: h, reason: collision with root package name */
    public int f419831h;

    /* renamed from: i, reason: collision with root package name */
    public int f419832i;

    public C44704d(C44704d c44704d, C44702b c44702b, int i12, int i13, int i14) {
        this.f419826c = c44704d;
        this.f419827d = c44702b;
        this.f341141a = i12;
        this.f419831h = i13;
        this.f419832i = i14;
        this.f341142b = -1;
    }

    @Override // com.fasterxml.jackson.core.g
    public final String a() {
        return this.f419829f;
    }

    @Override // com.fasterxml.jackson.core.g
    public final Object b() {
        return this.f419830g;
    }

    @Override // com.fasterxml.jackson.core.g
    public final com.fasterxml.jackson.core.g c() {
        return this.f419826c;
    }

    @Override // com.fasterxml.jackson.core.g
    public final void g(Object obj) {
        this.f419830g = obj;
    }

    public final C44704d i(int i12, int i13) {
        C44704d c44704d = this.f419828e;
        if (c44704d == null) {
            C44702b c44702b = this.f419827d;
            c44704d = new C44704d(this, c44702b != null ? c44702b.a() : null, 1, i12, i13);
            this.f419828e = c44704d;
        } else {
            c44704d.f341141a = 1;
            c44704d.f341142b = -1;
            c44704d.f419831h = i12;
            c44704d.f419832i = i13;
            c44704d.f419829f = null;
            c44704d.f419830g = null;
            C44702b c44702b2 = c44704d.f419827d;
            if (c44702b2 != null) {
                c44702b2.f419817b = null;
                c44702b2.f419818c = null;
                c44702b2.f419819d = null;
            }
        }
        return c44704d;
    }

    public final C44704d j(int i12, int i13) {
        C44704d c44704d = this.f419828e;
        if (c44704d == null) {
            C44702b c44702b = this.f419827d;
            C44704d c44704d2 = new C44704d(this, c44702b != null ? c44702b.a() : null, 2, i12, i13);
            this.f419828e = c44704d2;
            return c44704d2;
        }
        c44704d.f341141a = 2;
        c44704d.f341142b = -1;
        c44704d.f419831h = i12;
        c44704d.f419832i = i13;
        c44704d.f419829f = null;
        c44704d.f419830g = null;
        C44702b c44702b2 = c44704d.f419827d;
        if (c44702b2 != null) {
            c44702b2.f419817b = null;
            c44702b2.f419818c = null;
            c44702b2.f419819d = null;
        }
        return c44704d;
    }

    public final boolean k() {
        int i12 = this.f341142b + 1;
        this.f341142b = i12;
        return this.f341141a != 0 && i12 > 0;
    }

    public final void l(String str) throws JsonParseException {
        this.f419829f = str;
        C44702b c44702b = this.f419827d;
        if (c44702b == null || !c44702b.b(str)) {
            return;
        }
        Object obj = c44702b.f419816a;
        throw new JsonParseException(obj instanceof JsonParser ? (JsonParser) obj : null, AK.c.k("Duplicate field '", str, "'"));
    }
}
