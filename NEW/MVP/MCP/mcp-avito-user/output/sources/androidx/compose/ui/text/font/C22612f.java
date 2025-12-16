package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidFontLoader.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/f;", "Landroidx/compose/ui/text/font/m0;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.font.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22612f implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f42254a;

    /* compiled from: AndroidFontLoader.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", i = {1, 1}, l = {55, 57}, m = "awaitLoad", n = {"this", "font"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.ui.text.font.f$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public C22612f f42255q;

        /* renamed from: r, reason: collision with root package name */
        public D f42256r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f42257s;

        /* renamed from: u, reason: collision with root package name */
        public int f42259u;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f42257s = obj;
            this.f42259u |= BeduinInputModel.MIN_TEXT_VERSION;
            return C22612f.this.a(null, this);
        }
    }

    public C22612f(@Y61.k Context context) {
        this.f42254a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.m0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k androidx.compose.ui.text.font.D r13, @Y61.k kotlin.coroutines.Continuation<? super android.graphics.Typeface> r14) throws android.content.res.Resources.NotFoundException {
        /*
            r12 = this;
            boolean r0 = r14 instanceof androidx.compose.ui.text.font.C22612f.a
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.ui.text.font.f$a r0 = (androidx.compose.ui.text.font.C22612f.a) r0
            int r1 = r0.f42259u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f42259u = r1
            goto L1a
        L13:
            androidx.compose.ui.text.font.f$a r0 = new androidx.compose.ui.text.font.f$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r14 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r14
            r0.<init>(r14)
        L1a:
            java.lang.Object r14 = r0.f42257s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f42259u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            androidx.compose.ui.text.font.D r13 = r0.f42256r
            androidx.compose.ui.text.font.f r0 = r0.f42255q
            kotlin.C42729a0.b(r14)
            goto L90
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            kotlin.C42729a0.b(r14)
            return r14
        L3e:
            kotlin.C42729a0.b(r14)
            boolean r14 = r13 instanceof androidx.compose.ui.text.font.AbstractC22610d
            if (r14 != 0) goto Lb1
            boolean r14 = r13 instanceof androidx.compose.ui.text.font.s0
            if (r14 == 0) goto L9d
            r14 = r13
            androidx.compose.ui.text.font.s0 r14 = (androidx.compose.ui.text.font.s0) r14
            r0.f42255q = r12
            r0.f42256r = r13
            r0.f42259u = r3
            kotlinx.coroutines.r r2 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            r2.<init>(r4, r3)
            r2.p()
            int r6 = r14.f42303a
            androidx.compose.ui.text.font.g r9 = new androidx.compose.ui.text.font.g
            r9.<init>(r2, r14)
            java.lang.ThreadLocal<android.util.TypedValue> r14 = androidx.core.content.res.i.f44673a
            android.content.Context r5 = r12.f42254a
            boolean r14 = r5.isRestricted()
            if (r14 == 0) goto L74
            r14 = -4
            r9.a(r14)
            goto L7f
        L74:
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r8 = 0
            r10 = 0
            r11 = 0
            androidx.core.content.res.i.d(r5, r6, r7, r8, r9, r10, r11)
        L7f:
            java.lang.Object r14 = r2.o()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r14 != r2) goto L8c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)
        L8c:
            if (r14 != r1) goto L8f
            return r1
        L8f:
            r0 = r12
        L90:
            android.graphics.Typeface r14 = (android.graphics.Typeface) r14
            androidx.compose.ui.text.font.s0 r13 = (androidx.compose.ui.text.font.s0) r13
            androidx.compose.ui.text.font.d0$e r13 = r13.f42306d
            android.content.Context r0 = r0.f42254a
            android.graphics.Typeface r13 = androidx.compose.ui.text.font.r0.a(r14, r13, r0)
            return r13
        L9d:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown font type: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        Lb1:
            androidx.compose.ui.text.font.d r13 = (androidx.compose.ui.text.font.AbstractC22610d) r13
            androidx.compose.ui.text.font.d$a r13 = r13.f42231b
            r0.f42259u = r4
            r13.a()
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.C22612f.a(androidx.compose.ui.text.font.D, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.m0
    public final Object b(D d12) {
        Object bVar;
        Typeface typefaceC;
        boolean z12 = d12 instanceof AbstractC22610d;
        Context context = this.f42254a;
        if (z12) {
            AbstractC22610d abstractC22610d = (AbstractC22610d) d12;
            return abstractC22610d.f42231b.b(context, abstractC22610d);
        }
        if (!(d12 instanceof s0)) {
            return null;
        }
        X.f42213b.getClass();
        int i12 = ((s0) d12).f42307e;
        if (X.a(i12, 0)) {
            typefaceC = androidx.core.content.res.i.c(((s0) d12).f42303a, context);
        } else {
            if (!X.a(i12, X.f42214c)) {
                if (X.a(i12, X.f42215d)) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) X.b(i12)));
            }
            try {
                int i13 = kotlin.Z.f406624c;
                bVar = androidx.core.content.res.i.c(((s0) d12).f42303a, context);
            } catch (Throwable th2) {
                int i14 = kotlin.Z.f406624c;
                bVar = new Z.b(th2);
            }
            typefaceC = (Typeface) (bVar instanceof Z.b ? null : bVar);
        }
        return r0.a(typefaceC, ((s0) d12).f42306d, context);
    }

    @Override // androidx.compose.ui.text.font.m0
    @Y61.l
    /* renamed from: getCacheKey */
    public final Object getF42323b() {
        return null;
    }
}
