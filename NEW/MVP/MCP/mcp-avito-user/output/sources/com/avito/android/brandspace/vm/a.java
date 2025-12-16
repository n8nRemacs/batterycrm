package com.avito.android.brandspace.vm;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.error.ApiError;
import dj.InterfaceC39736a;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import gj.InterfaceC40691b;
import io.reactivex.rxjava3.core.z;
import java.util.List;
import kotlin.Metadata;
import pk.InterfaceC47104b;

/* compiled from: BrandspaceViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brandspace/vm/a;", "", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {
    @k
    InterfaceC39736a B0();

    @l
    List<AbstractC40112a<BeduinModel, InterfaceC40116e>> B5();

    @l
    List<AbstractC40112a<BeduinModel, InterfaceC40116e>> Dd();

    @k
    /* renamed from: E6 */
    C23038g0 getF107825O();

    @l
    List<AbstractC40112a<BeduinModel, InterfaceC40116e>> H3();

    @k
    z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> H6();

    void I0();

    @k
    z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> N8();

    @k
    Bundle P();

    @k
    AbstractC22991Y<ApiError> R4();

    void R8();

    @k
    String Rd();

    @k
    /* renamed from: V */
    InterfaceC40691b getF107823M();

    @k
    z<List<AbstractC40112a<BeduinModel, InterfaceC40116e>>> V6();

    @k
    String W9();

    void b(@k Bundle bundle);

    @k
    /* renamed from: g1 */
    InterfaceC47104b getF107820J();

    @k
    String m0();

    void w8();
}
