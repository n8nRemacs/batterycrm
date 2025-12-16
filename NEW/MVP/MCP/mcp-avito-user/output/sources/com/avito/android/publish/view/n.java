package com.avito.android.publish.view;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.view.a;
import com.avito.android.remote.model.Sublocation;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.SubLocationParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.select.Arguments;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: LocationParameterClickListener.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/view/n;", "Lcom/avito/android/publish/view/m;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public a.b f245668a;

    @Inject
    public n() {
    }

    @Override // com.avito.android.publish.view.m
    public final void a(@Y61.k com.avito.conveyor_item.a aVar, @Y61.k CategoryParameter categoryParameter) {
        if (aVar instanceof com.avito.android.items.e) {
            ((com.avito.android.items.e) aVar).o();
        }
        if (categoryParameter instanceof EditableParameter) {
            ((EditableParameter) categoryParameter).setError(null);
        }
        if (categoryParameter instanceof AddressParameter) {
            a.b bVar = this.f245668a;
            if (bVar != null) {
                bVar.g4((AddressParameter) categoryParameter, false);
                return;
            }
            return;
        }
        if (categoryParameter instanceof SubLocationParameter) {
            SubLocationParameter subLocationParameter = (SubLocationParameter) categoryParameter;
            Sublocation value = subLocationParameter.getValue();
            List listSingletonList = value != null ? Collections.singletonList(value) : C42784z0.f406748b;
            a.b bVar2 = this.f245668a;
            if (bVar2 != null) {
                bVar2.R1(new Arguments(false, subLocationParameter.getId(), null, subLocationParameter.getValues(), listSingletonList, subLocationParameter.getTitle(), null, true, false, false, false, !subLocationParameter.getRequired(), false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -7355, 255, null));
            }
        }
    }

    @Override // com.avito.android.publish.view.m
    public final void c0() {
        this.f245668a = null;
    }

    @Override // com.avito.android.publish.view.m
    public final void e(@Y61.l a.b bVar) {
        this.f245668a = bVar;
    }
}
