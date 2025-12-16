package ru.ok.android.externcalls.sdk.ml.delegate;

import defpackage.em6;
import defpackage.hn6;
import defpackage.qqg;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class MLFeatureDelegate$clearDir$1$1 extends hn6 implements em6 {
    public MLFeatureDelegate$clearDir$1$1(Object obj) {
        super(1, 0, MLFeatureDelegate.class, obj, "log", "log(Ljava/lang/String;)V");
    }

    @Override // defpackage.em6
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return qqg.a;
    }

    public final void invoke(String str) {
        ((MLFeatureDelegate) this.receiver).log(str);
    }
}
