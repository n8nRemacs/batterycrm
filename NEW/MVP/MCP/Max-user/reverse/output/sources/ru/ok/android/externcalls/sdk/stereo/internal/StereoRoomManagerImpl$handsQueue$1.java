package ru.ok.android.externcalls.sdk.stereo.internal;

import defpackage.cm6;
import defpackage.hn6;
import defpackage.qqg;
import defpackage.sm6;
import defpackage.ti1;
import java.util.List;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class StereoRoomManagerImpl$handsQueue$1 extends hn6 implements sm6 {
    public StereoRoomManagerImpl$handsQueue$1(Object obj) {
        super(2, 0, StereoRoomManagerImpl.class, obj, "resolveIdsAndThen", "resolveIdsAndThen(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V");
    }

    @Override // defpackage.sm6
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((List<ti1>) obj, (cm6) obj2);
        return qqg.a;
    }

    public final void invoke(List<ti1> list, cm6 cm6Var) {
        ((StereoRoomManagerImpl) this.receiver).resolveIdsAndThen(list, cm6Var);
    }
}
