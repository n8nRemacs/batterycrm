package androidx.compose.ui.text;

import androidx.compose.ui.unit.y;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ParagraphStyle.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public static final long f41951a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41952b = 0;

    static {
        androidx.compose.ui.unit.y.f42874b.getClass();
        f41951a = androidx.compose.ui.unit.y.f42876d;
    }

    @Y61.k
    public static final S a(@Y61.k S s5, int i12, int i13, long j12, @Y61.l androidx.compose.ui.text.style.p pVar, @Y61.l W w12, @Y61.l androidx.compose.ui.text.style.h hVar, int i14, int i15, @Y61.l androidx.compose.ui.text.style.r rVar) {
        int i16 = i12;
        long j13 = j12;
        androidx.compose.ui.text.style.i.f42675b.getClass();
        int i17 = androidx.compose.ui.text.style.i.f42682i;
        if (androidx.compose.ui.text.style.i.b(i16, i17) || androidx.compose.ui.text.style.i.b(i16, s5.f41942a)) {
            y.a aVar = androidx.compose.ui.unit.y.f42874b;
            if (((j13 & 1095216660480L) == 0 || androidx.compose.ui.unit.y.b(j13, s5.f41944c)) && (pVar == null || pVar.equals(s5.f41945d))) {
                androidx.compose.ui.text.style.k.f42689b.getClass();
                if ((androidx.compose.ui.text.style.k.b(i13, androidx.compose.ui.text.style.k.f42695h) || androidx.compose.ui.text.style.k.b(i13, s5.f41943b)) && ((w12 == null || w12.equals(s5.f41946e)) && (hVar == null || hVar.equals(s5.f41947f)))) {
                    androidx.compose.ui.text.style.f.f42639b.getClass();
                    if (i14 == 0 || i14 == s5.f41948g) {
                        androidx.compose.ui.text.style.e.f42634b.getClass();
                        if ((androidx.compose.ui.text.style.e.b(i15, androidx.compose.ui.text.style.e.f42637e) || androidx.compose.ui.text.style.e.b(i15, s5.f41949h)) && (rVar == null || rVar.equals(s5.f41950i))) {
                            return s5;
                        }
                    }
                }
            }
        }
        y.a aVar2 = androidx.compose.ui.unit.y.f42874b;
        if ((j13 & 1095216660480L) == 0) {
            j13 = s5.f41944c;
        }
        long j14 = j13;
        androidx.compose.ui.text.style.p pVar2 = pVar == null ? s5.f41945d : pVar;
        if (androidx.compose.ui.text.style.i.b(i16, i17)) {
            i16 = s5.f41942a;
        }
        int i18 = i16;
        androidx.compose.ui.text.style.k.f42689b.getClass();
        int i19 = !androidx.compose.ui.text.style.k.b(i13, androidx.compose.ui.text.style.k.f42695h) ? i13 : s5.f41943b;
        W w13 = s5.f41946e;
        W w14 = (w13 != null && w12 == null) ? w13 : w12;
        androidx.compose.ui.text.style.h hVar2 = hVar == null ? s5.f41947f : hVar;
        androidx.compose.ui.text.style.f.f42639b.getClass();
        int i22 = i14 == 0 ? s5.f41948g : i14;
        androidx.compose.ui.text.style.e.f42634b.getClass();
        return new S(i18, i19, j14, pVar2, w14, hVar2, i22, !androidx.compose.ui.text.style.e.b(i15, androidx.compose.ui.text.style.e.f42637e) ? i15 : s5.f41949h, rVar == null ? s5.f41950i : rVar, (C42822w) null);
    }
}
