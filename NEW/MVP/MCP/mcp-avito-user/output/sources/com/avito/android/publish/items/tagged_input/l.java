package com.avito.android.publish.items.tagged_input;

import com.avito.android.blueprints.input.C28876a;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.llm.ui.a;
import com.avito.android.remote.model.category_parameters.CharParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: MultiStateInputWithTagsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class l extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f237149l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.H f237150m;

    /* compiled from: MultiStateInputWithTagsItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LlmDescriptionPresenter.Feature.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LlmDescriptionPresenter.Feature feature = LlmDescriptionPresenter.Feature.f181677b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LlmDescriptionPresenter.Feature feature2 = LlmDescriptionPresenter.Feature.f181677b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(x xVar, ParameterElement.H h12) {
        super(1);
        this.f237149l = xVar;
        this.f237150m = h12;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        CharParameter.AutoBeautification autoBeautification;
        x xVar = this.f237149l;
        int iOrdinal = xVar.f237176j.getF181688a().ordinal();
        com.jakewharton.rxrelay3.c<com.avito.android.llm.ui.a> cVar = xVar.f237181o;
        ParameterElement.H h12 = this.f237150m;
        if (iOrdinal == 0) {
            CharParameter.AutoDescription autoDescription = h12.f117317w;
            if (autoDescription != null) {
                LlmDescriptionPresenter.Feature feature = LlmDescriptionPresenter.Feature.f181677b;
                LlmDescriptionPresenter llmDescriptionPresenter = xVar.f237176j;
                cVar.accept(new C28876a(autoDescription.getOverlay(), (llmDescriptionPresenter.a() || llmDescriptionPresenter.getF181689b().length() <= 0) ? null : autoDescription.getConfirmDialog(), autoDescription.getTimeout(), h12, new v(1, llmDescriptionPresenter, LlmDescriptionPresenter.class, "rememberGenerateDescriptionText", "rememberGenerateDescriptionText(Ljava/lang/String;)V", 0), L.f(autoDescription.getNeedPreviousFieldsValidation(), Boolean.TRUE), new w(0, llmDescriptionPresenter, LlmDescriptionPresenter.class, "onValidationError", "onValidationError()V", 0)));
            }
        } else if (iOrdinal == 1 && (autoBeautification = h12.f117318x) != null) {
            cVar.accept(new a.C5343a(autoBeautification, h12, new C33871c(xVar)));
        }
        return G0.f406611a;
    }
}
