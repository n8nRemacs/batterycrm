package oX0;

import androidx.camera.core.Q;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.n;
import com.fasterxml.jackson.core.util.r;
import com.fasterxml.jackson.databind.ObjectMapper;
import lX0.AbstractC43698a;

/* compiled from: JsonGeneratorImpl.java */
/* renamed from: oX0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC44703c extends AbstractC43698a {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f419820m = com.fasterxml.jackson.core.io.b.f341151h;

    /* renamed from: h, reason: collision with root package name */
    public final com.fasterxml.jackson.core.io.f f419821h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f419822i;

    /* renamed from: j, reason: collision with root package name */
    public int f419823j;

    /* renamed from: k, reason: collision with root package name */
    public n f419824k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f419825l;

    public AbstractC44703c(com.fasterxml.jackson.core.io.f fVar, int i12, ObjectMapper objectMapper) {
        this.f413834d = i12;
        this.f413833c = objectMapper;
        this.f413836f = new C44705e(0, null, JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.b(i12) ? new C44702b(this) : null);
        this.f413835e = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.b(i12);
        this.f419822i = f419820m;
        this.f419824k = com.fasterxml.jackson.core.util.e.f341294i;
        this.f419821h = fVar;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.b(i12)) {
            this.f419823j = 127;
        }
        this.f419825l = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.b(i12);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void k(int i12) {
        if (i12 < 0) {
            i12 = 0;
        }
        this.f419823j = i12;
    }

    @Override // lX0.AbstractC43698a
    public final void n0(int i12, int i13) {
        super.n0(i12, i13);
        this.f419825l = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.b(i12);
    }

    @Override // lX0.AbstractC43698a
    public final JsonGenerator p0(JsonGenerator.Feature feature) {
        super.p0(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this.f419825l = true;
        }
        return this;
    }

    public final void r0(String str) throws JsonGenerationException {
        a(Q.a("Can not ", str, ", expecting field name (context: ", this.f413836f.h(), ")"));
        throw null;
    }

    public final void s0(int i12, String str) throws JsonGenerationException {
        if (i12 == 0) {
            if (this.f413836f.d()) {
                this.f341039b.c(this);
                return;
            } else {
                if (this.f413836f.e()) {
                    this.f341039b.i(this);
                    return;
                }
                return;
            }
        }
        if (i12 == 1) {
            this.f341039b.l(this);
            return;
        }
        if (i12 == 2) {
            this.f341039b.g(this);
            return;
        }
        if (i12 == 3) {
            this.f341039b.a(this);
        } else {
            if (i12 != 5) {
                r.c();
                throw null;
            }
            r0(str);
            throw null;
        }
    }
}
