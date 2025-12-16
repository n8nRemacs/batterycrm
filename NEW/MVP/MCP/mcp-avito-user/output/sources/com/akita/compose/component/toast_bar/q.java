package com.akita.compose.component.toast_bar;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ToastBarHost.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*b\b\u0002\u0010\u0007\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¨\u0006\t²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "Lkotlin/S;", "name", "content", "FadeInFadeOutTransition", "onAnimationFinishState", "toast-bar_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final float f63273a;

    /* compiled from: ToastBarHost.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ToastBarDuration.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToastBarDuration toastBarDuration = ToastBarDuration.f63230b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ToastBarDuration toastBarDuration2 = ToastBarDuration.f63230b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f63273a = 74;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0167 A[LOOP:1: B:104:0x0161->B:106:0x0167, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013c A[LOOP:0: B:97:0x0136->B:99:0x013c, LOOP_END] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.akita.compose.component.toast_bar.InterfaceC27357f r19, androidx.compose.ui.v r20, androidx.compose.runtime.internal.C22096n r21, androidx.compose.runtime.A r22, int r23) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.toast_bar.q.a(com.akita.compose.component.toast_bar.f, androidx.compose.ui.v, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k com.akita.compose.component.toast_bar.u r8, @Y61.l androidx.compose.ui.v r9, @Y61.l androidx.compose.runtime.internal.C22096n r10, @Y61.l androidx.compose.runtime.A r11, int r12, int r13) {
        /*
            r0 = 1020666846(0x3cd623de, float:0.02614015)
            androidx.compose.runtime.B r11 = r11.E(r0)
            r0 = r12 & 14
            if (r0 != 0) goto L16
            boolean r0 = r11.B(r8)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r12
            goto L17
        L16:
            r0 = r12
        L17:
            r1 = r13 & 2
            if (r1 == 0) goto L1e
            r0 = r0 | 48
            goto L2e
        L1e:
            r2 = r12 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L2e
            boolean r2 = r11.B(r9)
            if (r2 == 0) goto L2b
            r2 = 32
            goto L2d
        L2b:
            r2 = 16
        L2d:
            r0 = r0 | r2
        L2e:
            r0 = r0 | 384(0x180, float:5.38E-43)
            r2 = r0 & 731(0x2db, float:1.024E-42)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 != r3) goto L43
            boolean r2 = r11.c()
            if (r2 != 0) goto L3d
            goto L43
        L3d:
            r11.f()
        L40:
            r4 = r9
            r5 = r10
            goto L89
        L43:
            if (r1 == 0) goto L47
            androidx.compose.ui.v$a r9 = androidx.compose.ui.v.f42878y1
        L47:
            com.akita.compose.component.toast_bar.a r10 = com.akita.compose.component.toast_bar.C27352a.f63239a
            r10.getClass()
            androidx.compose.runtime.internal.n r10 = com.akita.compose.component.toast_bar.C27352a.f63240b
            androidx.compose.runtime.y1 r1 = r8.f63285b
            androidx.compose.runtime.i3 r1 = (androidx.compose.runtime.C22082i3) r1
            java.lang.Object r1 = r1.getF42167b()
            com.akita.compose.component.toast_bar.f r1 = (com.akita.compose.component.toast_bar.InterfaceC27357f) r1
            r2 = 908431887(0x3625920f, float:2.4671933E-6)
            r11.C(r2)
            boolean r2 = r11.B(r1)
            java.lang.Object r3 = r11.t()
            if (r2 != 0) goto L71
            androidx.compose.runtime.A$a r2 = androidx.compose.runtime.A.f37866a
            r2.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r2) goto L7a
        L71:
            com.akita.compose.component.toast_bar.o r3 = new com.akita.compose.component.toast_bar.o
            r2 = 0
            r3.<init>(r1, r2)
            r11.H(r3)
        L7a:
            Y41.p r3 = (Y41.p) r3
            r2 = 0
            r11.X(r2)
            androidx.compose.runtime.C22187u0.d(r3, r11, r1)
            r0 = r0 & 1008(0x3f0, float:1.413E-42)
            a(r1, r9, r10, r11, r0)
            goto L40
        L89:
            androidx.compose.runtime.c2 r9 = r11.Z()
            if (r9 == 0) goto L9a
            com.akita.compose.component.toast_bar.p r10 = new com.akita.compose.component.toast_bar.p
            r2 = r10
            r3 = r8
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r9.f38184d = r10
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.toast_bar.q.b(com.akita.compose.component.toast_bar.u, androidx.compose.ui.v, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }
}
