package GK;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.splitter.ab.configs.CoreTelecomOutgoingCallsTestGroup;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.reflect.n;
import u3.AbstractC48780d;
import u3.j;

/* compiled from: CoreTelecomOutgoingCalls.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LGK/b;", "Lu3/d;", "Lcom/avito/android/iac_dialer/impl_module/splitter/ab/configs/CoreTelecomOutgoingCallsTestGroup;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC48780d<CoreTelecomOutgoingCallsTestGroup> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.splitter.features.a f6445a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f6446b = "iac_core_telecom_outgoing";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6447c;

    public b(@k com.avito.android.iac_dialer.impl_module.splitter.features.a aVar) {
        this.f6445a = aVar;
        Owners owners = Owners.f210476d;
        this.f6447c = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437359c() {
        return this.f6447c;
    }

    @Override // u3.InterfaceC48778b
    @k
    /* renamed from: b, reason: from getter */
    public final String getF437358b() {
        return this.f6446b;
    }

    @Override // u3.AbstractC48780d
    public final j c() {
        com.avito.android.iac_dialer.impl_module.splitter.features.a aVar = this.f6445a;
        aVar.getClass();
        n<Object>[] nVarArr = com.avito.android.iac_dialer.impl_module.splitter.features.a.f166390j;
        n<Object> nVar = nVarArr[4];
        if (!((Boolean) aVar.f166396g.a().invoke()).booleanValue()) {
            return CoreTelecomOutgoingCallsTestGroup.f166385c;
        }
        n<Object> nVar2 = nVarArr[5];
        if (((Boolean) aVar.f166397h.a().invoke()).booleanValue()) {
            return CoreTelecomOutgoingCallsTestGroup.f166386d;
        }
        return null;
    }

    @Override // u3.AbstractC48780d
    public final j[] e() {
        return CoreTelecomOutgoingCallsTestGroup.values();
    }

    @Override // u3.AbstractC48780d
    public final j f() {
        return CoreTelecomOutgoingCallsTestGroup.f166385c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        com.avito.android.iac_dialer.impl_module.splitter.features.a aVar = this.f6445a;
        aVar.getClass();
        n<Object> nVar = com.avito.android.iac_dialer.impl_module.splitter.features.a.f166390j[4];
        return ((Boolean) aVar.f166396g.a().invoke()).booleanValue();
    }
}
