package lj;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ComponentsForm.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llj/a;", "Llj/e;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC43779a extends e {
    @k
    ArrayList a();

    @l
    BeduinModel b(@k String str);

    @l
    List<AbstractC40112a<BeduinModel, InterfaceC40116e>> d();

    @k
    ArrayList e();

    @k
    List<BeduinModel> f();

    boolean g(@k Set<String> set);

    @k
    /* renamed from: getComponents */
    C41981q0 getF103348p();

    @k
    LinkedHashMap getParameters();

    @k
    /* renamed from: i */
    HashMap getF103349q();

    boolean isValid();

    void j(@k Map<String, ? extends Object> map);

    void k();
}
