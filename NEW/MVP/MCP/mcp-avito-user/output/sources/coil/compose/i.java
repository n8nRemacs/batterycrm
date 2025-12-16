package coil.compose;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AsyncImagePainter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f58232a = new a();

    /* compiled from: AsyncImagePainter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil/compose/i$a", "LM2/d;", "coil-compose-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements M2.d {
        @Override // M2.d
        @Y61.l
        public final Drawable a() {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final coil.compose.C27242f a(@Y61.l java.lang.Object r3, @Y61.k coil.j r4, @Y61.l Y41.l r5, @Y61.l Y41.l r6, @Y61.l androidx.compose.ui.layout.InterfaceC22374n r7, int r8, @Y61.l androidx.compose.runtime.A r9, int r10) {
        /*
            r0 = 1645646697(0x62169369, float:6.944084E20)
            r9.I(r0)
            r10 = r10 & 64
            if (r10 == 0) goto Lc
            coil.compose.p$a r10 = coil.compose.p.f58261a
        Lc:
            r10 = 952940650(0x38ccb86a, float:9.761828E-5)
            r9.I(r10)
            coil.size.e r10 = coil.compose.G.f58164b
            r10 = 1087186730(0x40cd272a, float:6.411031)
            r9.I(r10)
            boolean r10 = r3 instanceof coil.request.p
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            if (r10 == 0) goto L26
            coil.request.p r3 = (coil.request.p) r3
            r9.O()
            goto L61
        L26:
            androidx.compose.runtime.J3 r10 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f41069b
            java.lang.Object r10 = r9.o(r10)
            android.content.Context r10 = (android.content.Context) r10
            r1 = 375474364(0x166148bc, float:1.8198306E-25)
            r9.I(r1)
            boolean r1 = r9.B(r10)
            boolean r2 = r9.B(r3)
            r1 = r1 | r2
            java.lang.Object r2 = r9.t()
            if (r1 != 0) goto L4a
            r0.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L58
        L4a:
            coil.request.p$a r1 = new coil.request.p$a
            r1.<init>(r10)
            r1.f58691c = r3
            coil.request.p r2 = r1.a()
            r9.H(r2)
        L58:
            r3 = r2
            coil.request.p r3 = (coil.request.p) r3
            r9.O()
            r9.O()
        L61:
            java.lang.Object r10 = r3.f58660b
            boolean r1 = r10 instanceof coil.request.p.a
            if (r1 != 0) goto Lde
            boolean r1 = r10 instanceof androidx.compose.ui.graphics.InterfaceC22280q0
            r2 = 0
            if (r1 != 0) goto Ld8
            boolean r1 = r10 instanceof androidx.compose.ui.graphics.vector.C22293d
            if (r1 != 0) goto Ld2
            boolean r10 = r10 instanceof androidx.compose.ui.graphics.painter.e
            if (r10 != 0) goto Lcc
            K2.c r10 = r3.f58661c
            if (r10 != 0) goto Lc4
            r10 = 294038899(0x1186ad73, float:2.1248369E-28)
            r9.I(r10)
            java.lang.Object r10 = r9.t()
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r10 != r0) goto L91
            coil.compose.f r10 = new coil.compose.f
            r10.<init>(r3, r4)
            r9.H(r10)
        L91:
            coil.compose.f r10 = (coil.compose.C27242f) r10
            r9.O()
            r10.f58203n = r5
            r10.f58204o = r6
            r10.f58205p = r7
            r10.f58206q = r8
            androidx.compose.runtime.J3 r5 = androidx.compose.ui.platform.C22543x1.f41638a
            java.lang.Object r5 = r9.o(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r10.f58207r = r5
            androidx.compose.runtime.y1 r5 = r10.f58210u
            androidx.compose.runtime.i3 r5 = (androidx.compose.runtime.C22082i3) r5
            r5.setValue(r4)
            androidx.compose.runtime.y1 r4 = r10.f58209t
            androidx.compose.runtime.i3 r4 = (androidx.compose.runtime.C22082i3) r4
            r4.setValue(r3)
            r10.c()
            r9.O()
            r9.O()
            return r10
        Lc4:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "request.target must be null."
            r3.<init>(r4)
            throw r3
        Lcc:
            java.lang.String r3 = "Painter"
            b(r3)
            throw r2
        Ld2:
            java.lang.String r3 = "ImageVector"
            b(r3)
            throw r2
        Ld8:
            java.lang.String r3 = "ImageBitmap"
            b(r3)
            throw r2
        Lde:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.i.a(java.lang.Object, coil.j, Y41.l, Y41.l, androidx.compose.ui.layout.n, int, androidx.compose.runtime.A, int):coil.compose.f");
    }

    public static void b(String str) {
        throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.n("Unsupported type: ", str, ". ", AK.c.k("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
