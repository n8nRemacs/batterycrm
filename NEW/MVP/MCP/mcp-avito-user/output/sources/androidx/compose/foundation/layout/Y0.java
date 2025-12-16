package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ContextualFlowLayout.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/layout/Y0;", "", "", "lineIndex", "positionInLine", "Landroidx/compose/ui/unit/h;", "maxMainAxisSize", "maxCrossAxisSize", "<init>", "(IIFFLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    public int f28557a;

    /* renamed from: b, reason: collision with root package name */
    public int f28558b;

    /* renamed from: c, reason: collision with root package name */
    public float f28559c;

    /* renamed from: d, reason: collision with root package name */
    public float f28560d;

    public Y0(int i12, int i13, float f12, float f13, C42822w c42822w) {
        this.f28557a = i12;
        this.f28558b = i13;
        this.f28559c = f12;
        this.f28560d = f13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Y0(int i12, int i13, float f12, float f13, int i14, C42822w c42822w) {
        int i15 = (i14 & 1) != 0 ? 0 : i12;
        int i16 = (i14 & 2) != 0 ? 0 : i13;
        if ((i14 & 4) != 0) {
            f12 = 0;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
        }
        float f14 = f12;
        if ((i14 & 8) != 0) {
            f13 = 0;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        }
        this(i15, i16, f14, f13, null);
    }
}
