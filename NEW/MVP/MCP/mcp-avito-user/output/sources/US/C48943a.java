package uS;

import Y61.k;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.beduin.v2.avito.component.map.state.MoveReason;
import com.avito.beduin.v2.avito.component.map.state.Pin;
import com.avito.beduin.v2.avito.component.map.state.x;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Mapers.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_beduin-v2_renderer_component_map"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: uS.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48943a {

    /* compiled from: Mapers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uS.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C12717a {
        static {
            int[] iArr = new int[Pin.Anchor.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Pin.Anchor anchor = Pin.Anchor.f334647c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Pin.Anchor anchor2 = Pin.Anchor.f334647c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Pin.Anchor anchor3 = Pin.Anchor.f334647c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[MoveReason.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MoveReason moveReason = MoveReason.f334631c;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[com.avito.android.lib.design.map.state.MoveReason.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                com.avito.android.lib.design.map.state.MoveReason moveReason2 = com.avito.android.lib.design.map.state.MoveReason.f179644b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @k
    public static final x a(@k AvitoMapPoint avitoMapPoint) {
        return new x((float) avitoMapPoint.getLatitude(), (float) avitoMapPoint.getLongitude());
    }

    @k
    public static final AvitoMapPoint b(@k x xVar) {
        return new AvitoMapPoint(xVar.f334759a, xVar.f334760b, null, 4, null);
    }
}
