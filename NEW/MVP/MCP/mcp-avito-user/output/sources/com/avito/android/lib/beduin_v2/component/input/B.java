package com.avito.android.lib.beduin_v2.component.input;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.compose.runtime.C22039c2;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.avito.beduin.v2.avito.component.input.state.AvitoInputFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InputCompose.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "previousIsFocused", "_design-modules_beduin-v2_renderer_component_input"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class B {

    /* compiled from: InputCompose.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AvitoInputFormat.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvitoInputFormat.a aVar = AvitoInputFormat.f334457c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AvitoInputFormat.a aVar2 = AvitoInputFormat.f334457c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AvitoInputFormat.a aVar3 = AvitoInputFormat.f334457c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AvitoInputFormat.a aVar4 = AvitoInputFormat.f334457c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AvitoInputFormat.a aVar5 = AvitoInputFormat.f334457c;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AvitoInputFormat.a aVar6 = AvitoInputFormat.f334457c;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AvitoInputFormat.a aVar7 = AvitoInputFormat.f334457c;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AvitoInputFormat.a aVar8 = AvitoInputFormat.f334457c;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static final void a(String str, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(208787818);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            Integer numA = com.avito.android.lib.util.q.a(str);
            if (numA == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new n(i12, vVar, str);
                    return;
                }
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = ((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)).getTheme().obtainStyledAttributes(new int[]{numA.intValue()});
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                if (resourceId == 0) {
                    C22039c2 c22039c2Z2 = bE2.Z();
                    if (c22039c2Z2 != null) {
                        c22039c2Z2.f38184d = new l(i12, vVar, str);
                    }
                    return;
                }
                typedArrayObtainStyledAttributes.recycle();
                com.akita.compose.foundation.ui.e.a(u0.e.a(resourceId, 0, bE2), "", vVar, null, bE2, ((i13 << 3) & 896) | 56, 8);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        C22039c2 c22039c2Z3 = bE2.Z();
        if (c22039c2Z3 != null) {
            c22039c2Z3.f38184d = new m(i12, vVar, str);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0564 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.avito.android.lib.beduin_v2.component.input.C r58, com.avito.android.lib.beduin_v2.component.input.F r59, boolean r60, Y41.l r61, Y41.l r62, Y41.a r63, Y41.a r64, Y41.a r65, Y41.a r66, androidx.compose.runtime.A r67, int r68) {
        /*
            Method dump skipped, instructions count: 1670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.beduin_v2.component.input.B.b(com.avito.android.lib.beduin_v2.component.input.C, com.avito.android.lib.beduin_v2.component.input.F, boolean, Y41.l, Y41.l, Y41.a, Y41.a, Y41.a, Y41.a, androidx.compose.runtime.A, int):void");
    }
}
