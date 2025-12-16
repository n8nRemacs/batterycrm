package com.akita.compose.component.tooltip;

import androidx.compose.ui.window.T;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TooltipBox.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/akita/compose/component/tooltip/a;", "Landroidx/compose/ui/window/T;", "Lcom/akita/compose/component/tooltip/TooltipToAnchorPosition;", "tooltipToAnchorPosition", "Lcom/akita/compose/component/tooltip/TooltipTailPosition;", "tailPosition", "Lcom/akita/compose/component/tooltip/TooltipTailToAnchorPosition;", "tailToAnchorPosition", "Landroidx/compose/ui/unit/j;", "extraOffset", "Landroidx/compose/ui/unit/d;", "density", "Lcom/akita/compose/component/tooltip/w;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Lcom/akita/compose/component/tooltip/TooltipToAnchorPosition;Lcom/akita/compose/component/tooltip/TooltipTailPosition;Lcom/akita/compose/component/tooltip/TooltipTailToAnchorPosition;JLandroidx/compose/ui/unit/d;Lcom/akita/compose/component/tooltip/w;Lkotlin/jvm/internal/w;)V", "tooltip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class a implements T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TooltipToAnchorPosition f63465a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TooltipTailPosition f63466b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TooltipTailToAnchorPosition f63467c;

    /* renamed from: d, reason: collision with root package name */
    public final long f63468d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f63469e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final w f63470f;

    /* compiled from: TooltipBox.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.akita.compose.component.tooltip.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2104a {
        static {
            int[] iArr = new int[TooltipToAnchorPosition.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TooltipToAnchorPosition tooltipToAnchorPosition = TooltipToAnchorPosition.f63461b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TooltipToAnchorPosition tooltipToAnchorPosition2 = TooltipToAnchorPosition.f63461b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TooltipToAnchorPosition tooltipToAnchorPosition3 = TooltipToAnchorPosition.f63461b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[TooltipTailPosition.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TooltipTailPosition tooltipTailPosition = TooltipTailPosition.f63452b;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TooltipTailPosition tooltipTailPosition2 = TooltipTailPosition.f63452b;
                iArr2[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[TooltipTailToAnchorPosition.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TooltipTailToAnchorPosition tooltipTailToAnchorPosition = TooltipTailToAnchorPosition.f63456b;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                TooltipTailToAnchorPosition tooltipTailToAnchorPosition2 = TooltipTailToAnchorPosition.f63456b;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public a(TooltipToAnchorPosition tooltipToAnchorPosition, TooltipTailPosition tooltipTailPosition, TooltipTailToAnchorPosition tooltipTailToAnchorPosition, long j12, androidx.compose.ui.unit.d dVar, w wVar, C42822w c42822w) {
        this.f63465a = tooltipToAnchorPosition;
        this.f63466b = tooltipTailPosition;
        this.f63467c = tooltipTailToAnchorPosition;
        this.f63468d = j12;
        this.f63469e = dVar;
        this.f63470f = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.window.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(@Y61.k androidx.compose.ui.unit.s r17, long r18, @Y61.k androidx.compose.ui.unit.LayoutDirection r20, long r21) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.tooltip.a.a(androidx.compose.ui.unit.s, long, androidx.compose.ui.unit.LayoutDirection, long):long");
    }
}
