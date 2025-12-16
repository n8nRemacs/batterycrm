package defpackage;

import android.graphics.Picture;
import android.text.BoringLayout;
import android.util.ArraySet;
import java.util.ArrayList;
import java.util.function.Supplier;
import tech.kwik.agent15.alert.HandshakeFailureAlert;
import tech.kwik.agent15.alert.IllegalParameterAlert;
import tech.kwik.agent15.alert.MissingExtensionAlert;

/* loaded from: classes2.dex */
public final /* synthetic */ class ik implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ ik(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new Picture();
            case 1:
                return new ArrayList();
            case 2:
                return new IllegalStateException("Can't find connection id that is not retired");
            case 3:
                return new BoringLayout.Metrics();
            case 4:
                return new oh9();
            case 5:
                return new ArraySet();
            case 6:
                return new IllegalParameterAlert("");
            case 7:
                return new HandshakeFailureAlert("failed to negotiate signature scheme");
            default:
                return new MissingExtensionAlert();
        }
    }
}
