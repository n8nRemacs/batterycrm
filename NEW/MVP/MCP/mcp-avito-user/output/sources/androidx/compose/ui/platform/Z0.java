package androidx.compose.ui.platform;

import android.os.Bundle;
import androidx.view.C23404y0;
import androidx.view.C23485c;
import androidx.view.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class Z0 implements C23485c.InterfaceC1922c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41346b;

    public /* synthetic */ Z0(Object obj, int i12) {
        this.f41345a = i12;
        this.f41346b = obj;
    }

    @Override // androidx.view.C23485c.InterfaceC1922c
    public final Bundle H() {
        switch (this.f41345a) {
            case 0:
                Map<String, List<Object>> mapC = ((androidx.compose.runtime.saveable.r) this.f41346b).c();
                Bundle bundle = new Bundle();
                for (Map.Entry<String, List<Object>> entry : mapC.entrySet()) {
                    String key = entry.getKey();
                    List<Object> value = entry.getValue();
                    bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
                }
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                Bundle bundleX = ((C23404y0) this.f41346b).x();
                if (bundleX == null) {
                    break;
                }
                break;
            default:
                int i12 = ((NavHostFragment) this.f41346b).f53121h0;
                if (i12 != 0) {
                    break;
                } else {
                    break;
                }
        }
        return Bundle.EMPTY;
    }
}
