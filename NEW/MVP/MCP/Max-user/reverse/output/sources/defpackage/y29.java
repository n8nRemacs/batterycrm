package defpackage;

import one.me.mediapicker.MediaPickerScreen;
import one.me.qrscanner.QrScannerWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class y29 implements mi4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Long c;

    public /* synthetic */ y29(boolean z, Long l, int i) {
        this.a = i;
        this.b = z;
        this.c = l;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                return new MediaPickerScreen(new xo6(false, false, false, false, hd5.a, false, false, this.b), this.c);
            default:
                return new QrScannerWidget(this.b, this.c);
        }
    }
}
