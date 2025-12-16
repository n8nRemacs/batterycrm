package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.C22039c2;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: ListItem.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.k9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21676k9 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f36724a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f36725b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f36726c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f36727d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f36728e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f36729f;

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f36724a = 8;
        f36725b = 12;
        float f12 = 16;
        f36726c = f12;
        f36727d = f12;
        f36728e = f12;
        f36729f = f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.runtime.internal.C22096n r16, androidx.compose.runtime.internal.C22096n r17, androidx.compose.runtime.internal.C22096n r18, androidx.compose.runtime.internal.C22096n r19, androidx.compose.runtime.internal.C22096n r20, androidx.compose.runtime.A r21, int r22) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21676k9.a(androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    public static final void b(long j12, TypographyKeyTokens typographyKeyTokens, Y41.p pVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1133967795);
        if ((i12 & 6) == 0) {
            i13 = (bE2.n(j12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(typographyKeyTokens) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.u(pVar) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && bE2.c()) {
            bE2.f();
        } else {
            C21859s9.f37272a.getClass();
            Vc.a(j12, Ql.a(C21859s9.b(bE2), typographyKeyTokens), pVar, bE2, i13 & 910);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21631i9(j12, typographyKeyTokens, pVar, i12);
        }
    }
}
