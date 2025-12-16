package gj;

import Ui.InterfaceC15522a;
import Ui.InterfaceC15523b;
import android.content.Context;
import androidx.view.C23034e0;
import cj.InterfaceC27205c;
import cj.InterfaceC27207e;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import dj.InterfaceC39736a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import j.j0;
import kotlin.Metadata;
import lj.InterfaceC43779a;
import mj.InterfaceC44087a;
import nj.InterfaceC44433a;
import oj.InterfaceC44784a;

/* compiled from: BeduinContext.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lgj/b;", "LUi/b;", "Lcom/avito/android/beduin_models/BeduinAction;", "Loj/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gj.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC40691b extends InterfaceC15523b<BeduinAction>, InterfaceC44784a<BeduinModel> {
    @Y61.k
    InterfaceC39736a B0();

    @Y61.k
    j a();

    @Y61.k
    InterfaceC44433a b();

    @Y61.k
    InterfaceC27207e c();

    @Y61.k
    InterfaceC27205c d();

    @Y61.k
    InterfaceC15522a e();

    @Y61.k
    InterfaceC15523b<BeduinAction> f();

    void g(@Y61.k Screen screen);

    @Y61.k
    lj.c h();

    @Y61.k
    InterfaceC44087a i();

    @j0
    @Y61.k
    InterfaceC43779a j();

    @Y61.k
    z<com.avito.android.beduin_shared.model.action.custom.d> k();

    void onCleared();

    @Y61.k
    com.avito.android.beduin.common.deeplink_processor.e p();

    @Y61.k
    C41981q0 q();

    @Y61.k
    com.avito.android.beduin.common.form.store.b r();

    @Y61.k
    C23034e0 s(@Y61.k Context context);
}
