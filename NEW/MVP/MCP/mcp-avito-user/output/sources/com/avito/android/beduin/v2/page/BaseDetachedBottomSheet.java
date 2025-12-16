package com.avito.android.beduin.v2.page;

import android.os.Bundle;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.render.android_view.BeduinView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BaseDetachedBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/BaseDetachedBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "_design-modules_beduin-v2-page_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BaseDetachedBottomSheet extends BottomSheetDialogFragment {

    /* renamed from: f0, reason: collision with root package name */
    public Y41.a<G0> f104757f0;

    /* renamed from: g0, reason: collision with root package name */
    public BottomSheetHeight f104758g0;

    /* renamed from: h0, reason: collision with root package name */
    public BottomSheetContentPaddings f104759h0;

    /* compiled from: BaseDetachedBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/v2/page/BaseDetachedBottomSheet$a", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_design-modules_beduin-v2-page_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.android.lib.design.bottom_sheet.d {

        /* compiled from: BaseDetachedBottomSheet.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.v2.page.BaseDetachedBottomSheet$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3129a {
            static {
                int[] iArr = new int[BottomSheetHeight.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    BottomSheetHeight.a aVar = BottomSheetHeight.f337302b;
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    BottomSheetHeight.a aVar2 = BottomSheetHeight.f337302b;
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                int[] iArr2 = new int[BottomSheetContentPaddings.values().length];
                try {
                    iArr2[0] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    BottomSheetContentPaddings.a aVar3 = BottomSheetContentPaddings.f337295b;
                    iArr2[3] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    BottomSheetContentPaddings.a aVar4 = BottomSheetContentPaddings.f337295b;
                    iArr2[1] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    BottomSheetContentPaddings.a aVar5 = BottomSheetContentPaddings.f337295b;
                    iArr2[2] = 4;
                } catch (NoSuchFieldError unused7) {
                }
            }
        }
    }

    @Y61.k
    public abstract BeduinView b5();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Dialog onCreateDialog(@Y61.l android.os.Bundle r7) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            android.content.Context r7 = r6.requireContext()
            com.avito.android.beduin.v2.page.BaseDetachedBottomSheet$a r0 = new com.avito.android.beduin.v2.page.BaseDetachedBottomSheet$a
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r7, r1, r2, r3)
            r0.T()
            r7 = 7
            r4 = 1
            com.avito.android.lib.design.bottom_sheet.d.M(r0, r3, r1, r4, r7)
            com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight r7 = r6.f104758g0
            if (r7 == 0) goto L19
            goto L1a
        L19:
            r7 = r3
        L1a:
            int r7 = r7.ordinal()
            if (r7 == 0) goto L4e
            if (r7 == r4) goto L3a
            if (r7 == r2) goto L25
            goto L5e
        L25:
            android.content.Context r7 = r6.requireContext()
            android.graphics.Point r7 = com.avito.android.util.C35835l0.g(r7)
            int r7 = r7.y
            int r7 = r7 / r2
            r0.S(r7)
            r0.K(r4)
            r0.J(r4)
            goto L5e
        L3a:
            android.content.Context r7 = r6.requireContext()
            android.graphics.Point r7 = com.avito.android.util.C35835l0.g(r7)
            int r7 = r7.y
            r0.S(r7)
            r0.K(r4)
            r0.J(r4)
            goto L5e
        L4e:
            boolean r7 = r0.f178525s
            if (r7 != r4) goto L53
            goto L5e
        L53:
            r0.f178525s = r4
            r0.f178526t = r4
            com.avito.android.lib.design.bottom_sheet.q r7 = r0.f178530x
            if (r7 == 0) goto L5e
            r7.e(r4, r4)
        L5e:
            com.avito.beduin.v2.render.android_view.BeduinView r7 = r6.b5()
            com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings r5 = r6.f104759h0
            if (r5 == 0) goto L67
            goto L68
        L67:
            r5 = r3
        L68:
            int r5 = r5.ordinal()
            if (r5 == 0) goto L8e
            if (r5 == r4) goto L7b
            if (r5 == r2) goto L76
            r1 = 3
            if (r5 == r1) goto L8e
            goto L97
        L76:
            r2 = 4
            com.avito.android.lib.design.bottom_sheet.j.b(r0, r1, r2)
            goto L97
        L7b:
            android.content.Context r2 = r6.requireContext()
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131166011(0x7f07033b, float:1.7946255E38)
            int r2 = r2.getDimensionPixelSize(r5)
            r7.setPadding(r2, r1, r2, r1)
            goto L97
        L8e:
            r0.f178528v = r4
            com.avito.android.lib.design.bottom_sheet.q r1 = r0.f178530x
            if (r1 == 0) goto L97
            r1.j()
        L97:
            r0.setContentView(r7)
            com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight r1 = r6.f104758g0
            if (r1 == 0) goto L9f
            r3 = r1
        L9f:
            com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight r1 = com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight.f337304d
            if (r3 != r1) goto Lb4
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto Lb4
            com.avito.android.beduin.v2.page.g r2 = new com.avito.android.beduin.v2.page.g
            r2.<init>(r7, r6, r1)
            com.avito.android.util.D6.l(r4, r1, r2)
        Lb4:
            com.avito.android.beduin.v2.page.h r7 = new com.avito.android.beduin.v2.page.h
            r7.<init>(r6)
            r0.R(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.v2.page.BaseDetachedBottomSheet.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }
}
