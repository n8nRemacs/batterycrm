package com.avito.beduin.v2.avito.component.date_picker.state;

import com.avito.beduin.v2.avito.component.date_picker.state.AvitoDatePickerState;
import com.avito.beduin.v2.engine.component.G;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoDatePickerStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$c;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/beduin/v2/avito/component/date_picker/state/AvitoDatePickerState$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.l<G, AvitoDatePickerState.c> {

    /* renamed from: l, reason: collision with root package name */
    public static final h f334184l = new h();

    public h() {
        super(1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // Y41.l
    public final AvitoDatePickerState.c invoke(G g12) {
        G g13 = g12;
        String string = g13.getString("key");
        if (string != null) {
            switch (string.hashCode()) {
                case -1837602274:
                    if (string.equals("SingleOrIntervalDate")) {
                        return AvitoDatePickerState.f.f334174a;
                    }
                    break;
                case -1388355530:
                    if (string.equals("SingleDate")) {
                        return AvitoDatePickerState.e.f334173a;
                    }
                    break;
                case -872874317:
                    if (string.equals("DateInterval")) {
                        return new AvitoDatePickerState.b(g13.a("minDays"));
                    }
                    break;
                case 123202101:
                    if (string.equals("MultipleDates")) {
                        return AvitoDatePickerState.d.f334172a;
                    }
                    break;
            }
        }
        return null;
    }
}
