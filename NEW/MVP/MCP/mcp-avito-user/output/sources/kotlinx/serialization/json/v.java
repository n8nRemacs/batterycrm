package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.json.internal.e0;

/* compiled from: Json.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class v {
    public static AbstractC43443a a(Y41.l lVar) {
        AbstractC43443a.C11757a c11757a = AbstractC43443a.f412954d;
        C43446d c43446d = new C43446d();
        C43448f c43448f = c11757a.f412955a;
        c43446d.f412964a = c43448f.f412981a;
        c43446d.f412965b = c43448f.f412986f;
        c43446d.f412966c = c43448f.f412982b;
        c43446d.f412967d = c43448f.f412983c;
        c43446d.f412968e = c43448f.f412984d;
        c43446d.f412969f = c43448f.f412985e;
        String str = c43448f.f412987g;
        c43446d.f412970g = str;
        c43446d.f412971h = c43448f.f412988h;
        c43446d.f412972i = c43448f.f412989i;
        String str2 = c43448f.f412990j;
        c43446d.f412973j = str2;
        ClassDiscriminatorMode classDiscriminatorMode = c43448f.f412996p;
        c43446d.f412974k = classDiscriminatorMode;
        c43446d.f412975l = c43448f.f412991k;
        c43446d.f412976m = c43448f.f412992l;
        c43446d.f412977n = c43448f.f412993m;
        c43446d.f412978o = c43448f.f412994n;
        c43446d.f412979p = c43448f.f412995o;
        c43446d.f412980q = c11757a.f412956b;
        lVar.invoke(c43446d);
        if (c43446d.f412972i) {
            if (!L.f(str2, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (classDiscriminatorMode != ClassDiscriminatorMode.f412938c) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (c43446d.f412969f) {
            if (!L.f(str, "    ")) {
                for (int i12 = 0; i12 < str.length(); i12++) {
                    char cCharAt = str.charAt(i12);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                    }
                }
            }
        } else if (!L.f(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        u uVar = new u(new C43448f(c43446d.f412964a, c43446d.f412966c, c43446d.f412967d, c43446d.f412968e, c43446d.f412969f, c43446d.f412965b, c43446d.f412970g, c43446d.f412971h, c43446d.f412972i, c43446d.f412973j, c43446d.f412975l, c43446d.f412976m, c43446d.f412977n, c43446d.f412978o, c43446d.f412979p, c43446d.f412974k), c43446d.f412980q, null);
        kotlinx.serialization.modules.d dVar = kotlinx.serialization.modules.m.f413167a;
        kotlinx.serialization.modules.f fVar = uVar.f412956b;
        if (!L.f(fVar, dVar)) {
            C43448f c43448f2 = uVar.f412955a;
            fVar.a(new e0(c43448f2.f412989i, c43448f2.f412990j));
        }
        return uVar;
    }
}
