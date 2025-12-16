package com.avito.android.search.filter;

import com.avito.android.remote.model.category_parameters.KeywordsParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.Metadata;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/search/filter/converter/ParameterElement;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.search.filter.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34609z0 extends kotlin.jvm.internal.N implements Y41.l<?, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f263818l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34609z0(C34574h0 c34574h0) {
        super(1);
        this.f263818l = c34574h0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        ParameterElement parameterElement = (ParameterElement) obj;
        C34574h0 c34574h0 = this.f263818l;
        ParametersTreeWithAdditional parametersTreeWithAdditional = c34574h0.f263319Q;
        ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.findParameter(parameterElement.getF75720c()) : null;
        if ((parameterSlotFindParameter instanceof KeywordsParameter) && (parameterElement instanceof ParameterElement.p)) {
            KeywordsParameter keywordsParameter = (KeywordsParameter) parameterSlotFindParameter;
            c34574h0.f263329a.t(keywordsParameter.copy((1023 & 1) != 0 ? keywordsParameter.id : null, (1023 & 2) != 0 ? keywordsParameter.title : null, (1023 & 4) != 0 ? keywordsParameter.attrId : null, (1023 & 8) != 0 ? keywordsParameter.displaying : null, (1023 & 16) != 0 ? keywordsParameter._value : null, (1023 & 32) != 0 ? keywordsParameter.visible : false, (1023 & 64) != 0 ? keywordsParameter.phantom : null, (1023 & 128) != 0 ? keywordsParameter.hasSuggest : false, (1023 & 256) != 0 ? keywordsParameter.maxCharCount : null, (1023 & 512) != 0 ? keywordsParameter.maxOptionsCount : null, (1023 & 1024) != 0 ? keywordsParameter.text : ((ParameterElement.p) parameterElement).f262808i));
        }
        return kotlin.G0.f406611a;
    }
}
