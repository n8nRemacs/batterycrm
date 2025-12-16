package Vh;

import Y61.k;
import com.avito.android.beduin.common.component.stored_parameters.BeduinStoredParametersModel;
import com.avito.android.beduin.common.storage.c;
import com.avito.android.beduin.common.storage.d;
import com.avito.android.beduin_models.BeduinModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import oj.InterfaceC44784a;

/* compiled from: StoredParametersExtractionStrategy.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LVh/a;", "Loj/a;", "Lcom/avito/android/beduin/common/component/stored_parameters/BeduinStoredParametersModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15678a implements InterfaceC44784a<BeduinStoredParametersModel> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f17358a;

    @Inject
    public C15678a(@k d dVar) {
        this.f17358a = dVar;
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        BeduinStoredParametersModel beduinStoredParametersModel = (BeduinStoredParametersModel) beduinModel;
        c cVarA = this.f17358a.a(beduinStoredParametersModel.getStorageType());
        List<String> listC = beduinStoredParametersModel.c();
        Map mapC = P0.c();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapC2 = cVarA.get((String) it.next());
            if (mapC2 == null) {
                mapC2 = P0.c();
            }
            mapC = P0.k(mapC, mapC2);
        }
        return mapC;
    }
}
