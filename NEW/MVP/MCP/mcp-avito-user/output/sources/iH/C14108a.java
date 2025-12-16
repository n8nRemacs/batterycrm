package Ih;

import Y61.k;
import com.avito.android.beduin.common.component.activate_group.BeduinAccordionGroupModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.q;
import h31.e;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import oj.InterfaceC44784a;

/* compiled from: AccordionGroupParametersExtractionStrategy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LIh/a;", "Loj/a;", "Lcom/avito/android/beduin/common/component/activate_group/BeduinAccordionGroupModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ih.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14108a implements InterfaceC44784a<BeduinAccordionGroupModel> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC44784a<BeduinModel>> f8479a;

    @Inject
    public C14108a(@k e<InterfaceC44784a<BeduinModel>> eVar) {
        this.f8479a = eVar;
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        return q.a(((BeduinAccordionGroupModel) beduinModel).getInlinedModels(), this.f8479a.get());
    }
}
