package fi;

import Y61.k;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import oj.InterfaceC44784a;

/* compiled from: BeduinParametersExtractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfi/a;", "Loj/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C40424a implements InterfaceC44784a<BeduinModel> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<Class<? extends BeduinModel>, InterfaceC44784a<? extends BeduinModel>> f396061a;

    @Inject
    public C40424a(@k Map<Class<? extends BeduinModel>, InterfaceC44784a<? extends BeduinModel>> map) {
        this.f396061a = map;
    }

    @Override // oj.InterfaceC44784a
    @k
    public final Map<String, Object> m(@k BeduinModel beduinModel) {
        Map<String, Object> mapM;
        InterfaceC44784a<? extends BeduinModel> interfaceC44784a = this.f396061a.get(beduinModel.getClass());
        InterfaceC44784a<? extends BeduinModel> interfaceC44784a2 = interfaceC44784a instanceof InterfaceC44784a ? interfaceC44784a : null;
        return (interfaceC44784a2 == null || (mapM = interfaceC44784a2.m(beduinModel)) == null) ? P0.c() : mapM;
    }
}
