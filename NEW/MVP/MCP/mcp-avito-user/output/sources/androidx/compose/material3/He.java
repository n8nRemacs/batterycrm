package androidx.compose.material3;

import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.InterfaceC22029a2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Shapes.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class He {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.runtime.J3 f34849a = androidx.compose.runtime.S.d(a.f34850l);

    /* compiled from: Shapes.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/Ge;", "invoke", "()Landroidx/compose/material3/Ge;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Ge> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f34850l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Ge invoke() {
            return new Ge(null, null, null, null, null, 31, null);
        }
    }

    /* compiled from: Shapes.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    @InterfaceC22029a2
    @InterfaceC22132o
    @X41.i
    @Y61.k
    public static final androidx.compose.ui.graphics.h1 a(@Y61.k ShapeKeyTokens shapeKeyTokens, @Y61.l androidx.compose.runtime.A a12) {
        C21859s9.f37272a.getClass();
        Ge ge2 = (Ge) a12.o(f34849a);
        switch (shapeKeyTokens.ordinal()) {
            case 0:
                return ge2.f34795e;
            case 1:
                return b(ge2.f34795e);
            case 2:
                return ge2.f34791a;
            case 3:
                return b(ge2.f34791a);
            case 4:
                return androidx.compose.foundation.shape.o.f30153a;
            case 5:
                return ge2.f34794d;
            case 6:
                androidx.compose.foundation.shape.e eVar = ge2.f34794d;
                float f12 = (float) 0.0d;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                return androidx.compose.foundation.shape.e.c(eVar, androidx.compose.foundation.shape.g.b(f12), null, null, androidx.compose.foundation.shape.g.b(f12), 6);
            case 7:
                return b(ge2.f34794d);
            case 8:
                return ge2.f34793c;
            case 9:
                return androidx.compose.ui.graphics.Y0.f39346a;
            case 10:
                return ge2.f34792b;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Y61.k
    public static final androidx.compose.foundation.shape.e b(@Y61.k androidx.compose.foundation.shape.e eVar) {
        float f12 = (float) 0.0d;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return androidx.compose.foundation.shape.e.c(eVar, null, null, androidx.compose.foundation.shape.g.b(f12), androidx.compose.foundation.shape.g.b(f12), 3);
    }
}
