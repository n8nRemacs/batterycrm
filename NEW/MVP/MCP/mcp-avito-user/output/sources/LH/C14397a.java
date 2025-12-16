package Lh;

import Y61.k;
import ci.InterfaceC27197a;
import com.avito.android.beduin.common.component.conditional_group.BeduinConditionalGroupModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.q;
import h31.e;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import mj.InterfaceC44087a;
import oj.InterfaceC44784a;

/* compiled from: ConditionalGroupParametersExtractionStrategy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LLh/a;", "Loj/a;", "Lcom/avito/android/beduin/common/component/conditional_group/BeduinConditionalGroupModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lh.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C14397a implements InterfaceC44784a<BeduinConditionalGroupModel> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC44784a<BeduinModel>> f10085a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e<InterfaceC27197a> f10086b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e<InterfaceC44087a> f10087c;

    @Inject
    public C14397a(@k e<InterfaceC44784a<BeduinModel>> eVar, @k e<InterfaceC27197a> eVar2, @k e<InterfaceC44087a> eVar3) {
        this.f10085a = eVar;
        this.f10086b = eVar2;
        this.f10087c = eVar3;
    }

    @Override // oj.InterfaceC44784a
    public final Map m(BeduinModel beduinModel) {
        return q.a(((BeduinConditionalGroupModel) beduinModel).resolveChildren(P0.k(this.f10086b.get().b(), this.f10087c.get().b())), this.f10085a.get());
    }
}
