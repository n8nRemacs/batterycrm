package Ba1;

import android.app.Activity;
import android.content.Intent;
import androidx.view.InterfaceC23040h0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.universal_map.map.UniversalMapFragment;
import com.avito.android.util.C35755b0;
import gj.C40690a;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import ru.cyberity.cbr.core.presentation.base.ActionLiveData;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class F implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1493c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1494d;

    public /* synthetic */ F(int i12, Object obj, Object obj2) {
        this.f1492b = i12;
        this.f1493c = obj;
        this.f1494d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Y41.a, kotlin.jvm.internal.H] */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(Object obj) {
        Object obj2 = this.f1494d;
        Object obj3 = this.f1493c;
        switch (this.f1492b) {
            case 0:
                if (((G) obj3).f1495a.compareAndSet(true, false)) {
                    ((InterfaceC23040h0) obj2).onChanged(obj);
                    break;
                }
                break;
            case 1:
                C40690a c40690a = (C40690a) obj;
                List<BeduinAction> list = c40690a.f396751a;
                boolean zIsEmpty = list.isEmpty();
                Map<String, Object> map = c40690a.f396752b;
                if (!zIsEmpty || !map.isEmpty()) {
                    Intent intent = new Intent();
                    List<BeduinAction> list2 = list;
                    if (!list2.isEmpty()) {
                        intent.putParcelableArrayListExtra("beduin_result_actions_key", C35755b0.a(list2));
                        G0 g02 = G0.f406611a;
                    }
                    if (!map.isEmpty()) {
                        intent.putExtra("beduin_result_params_key", map instanceof Serializable ? (Serializable) map : null);
                        G0 g03 = G0.f406611a;
                    }
                    ((Activity) obj3).setResult(-1, intent);
                }
                ((kotlin.jvm.internal.H) obj2).invoke();
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                UniversalMapFragment.a aVar = UniversalMapFragment.f304838X0;
                if (bool != null && bool.booleanValue()) {
                    ((oG0.f) obj3).t2();
                    ((UniversalMapFragment) obj2).t5();
                    break;
                }
                break;
            case 3:
                if (((com.avito.android.util.architecture_components.D) obj3).f318804a.compareAndSet(true, false)) {
                    ((InterfaceC23040h0) obj2).onChanged(obj);
                    break;
                }
                break;
            default:
                ActionLiveData.m277observe$lambda0((ActionLiveData) obj3, (InterfaceC23040h0) obj2, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ F(Activity activity, Y41.a aVar) {
        this.f1492b = 1;
        this.f1493c = activity;
        this.f1494d = (kotlin.jvm.internal.H) aVar;
    }
}
