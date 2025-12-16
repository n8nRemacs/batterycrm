package Wh;

import Ui.InterfaceC15523b;
import Y61.k;
import bi.C25654c;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import kotlin.Metadata;

/* compiled from: ContainerChildFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWh/c;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f18009a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final lj.e f18010b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C25654c f18011c;

    public c(@k InterfaceC15523b interfaceC15523b, @k lj.e eVar, @k C25654c c25654c) {
        this.f18009a = interfaceC15523b;
        this.f18010b = eVar;
        this.f18011c = c25654c;
    }

    @k
    public final AbstractC40112a<BeduinModel, InterfaceC40116e> a(@k BeduinModel beduinModel) {
        return this.f18011c.a(beduinModel, this.f18010b, this.f18009a);
    }
}
