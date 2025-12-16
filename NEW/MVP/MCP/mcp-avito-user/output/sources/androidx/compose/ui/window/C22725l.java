package androidx.compose.ui.window;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.C22143q0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidPopup.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0017\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "currentContent", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.window.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22725l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22143q0 f43092a = androidx.compose.runtime.S.c(a.f43093l);

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.window.l$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f43093l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021c  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.ui.window.T r30, @Y61.l Y41.a r31, @Y61.l androidx.compose.ui.window.U r32, @Y61.k androidx.compose.runtime.internal.C22096n r33, @Y61.l androidx.compose.runtime.A r34, int r35, int r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.C22725l.a(androidx.compose.ui.window.T, Y41.a, androidx.compose.ui.window.U, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.l androidx.compose.ui.i r13, long r14, @Y61.l Y41.a r16, @Y61.l androidx.compose.ui.window.U r17, @Y61.k androidx.compose.runtime.internal.C22096n r18, @Y61.l androidx.compose.runtime.A r19, int r20) throws java.lang.Throwable {
        /*
            r2 = r14
            r0 = 295309329(0x119a1011, float:2.4306818E-28)
            r1 = r19
            androidx.compose.runtime.B r0 = r1.E(r0)
            boolean r1 = r0.n(r14)
            r4 = 32
            if (r1 == 0) goto L14
            r1 = r4
            goto L16
        L14:
            r1 = 16
        L16:
            r1 = r20 | r1
            r11 = r16
            boolean r5 = r0.u(r11)
            if (r5 == 0) goto L23
            r5 = 256(0x100, float:3.59E-43)
            goto L25
        L23:
            r5 = 128(0x80, float:1.8E-43)
        L25:
            r1 = r1 | r5
            r5 = r1 & 9363(0x2493, float:1.312E-41)
            r6 = 1
            r7 = 9362(0x2492, float:1.3119E-41)
            r8 = 0
            if (r5 == r7) goto L30
            r5 = r6
            goto L31
        L30:
            r5 = r8
        L31:
            r7 = r1 & 1
            boolean r5 = r0.p(r7, r5)
            if (r5 == 0) goto L6d
            r5 = r1 & 112(0x70, float:1.57E-43)
            if (r5 != r4) goto L3e
            goto L3f
        L3e:
            r6 = r8
        L3f:
            java.lang.Object r4 = r0.t()
            if (r6 != 0) goto L51
            androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
            r5.getClass()
            androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r5) goto L4f
            goto L51
        L4f:
            r12 = r13
            goto L5b
        L51:
            androidx.compose.ui.window.a r4 = new androidx.compose.ui.window.a
            r5 = 0
            r12 = r13
            r4.<init>(r13, r14, r5)
            r0.H(r4)
        L5b:
            androidx.compose.ui.window.a r4 = (androidx.compose.ui.window.C22714a) r4
            int r1 = r1 >> 3
            r9 = r1 & 8176(0x1ff0, float:1.1457E-41)
            r10 = 0
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r0
            a(r4, r5, r6, r7, r8, r9, r10)
            goto L71
        L6d:
            r12 = r13
            r0.f()
        L71:
            androidx.compose.runtime.c2 r8 = r0.Z()
            if (r8 == 0) goto L89
            androidx.compose.ui.window.m r9 = new androidx.compose.ui.window.m
            r0 = r9
            r1 = r13
            r2 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r20
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r8.f38184d = r9
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.C22725l.b(androidx.compose.ui.i, long, Y41.a, androidx.compose.ui.window.U, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    public static final boolean c(@Y61.k View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
