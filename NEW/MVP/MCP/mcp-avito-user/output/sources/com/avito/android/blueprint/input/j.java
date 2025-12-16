package com.avito.android.blueprint.input;

import com.avito.android.blueprints.input.C28876a;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.llm.ui.a;
import com.avito.android.remote.model.category_parameters.CharParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: PublishInputPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f105529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.items.d f105530m;

    /* compiled from: PublishInputPresenter.kt */
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
    public j(o oVar, com.avito.android.items.d dVar) {
        super(1);
        this.f105529l = oVar;
        this.f105530m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        CharParameter.AutoBeautification f117501z;
        o oVar = this.f105529l;
        int iOrdinal = oVar.f105540f.getF181688a().ordinal();
        com.jakewharton.rxrelay3.c<com.avito.android.llm.ui.a> cVar = oVar.f105545k;
        com.avito.android.items.d dVar = this.f105530m;
        if (iOrdinal == 0) {
            CharParameter.AutoDescription f117500y = dVar.getF117500y();
            if (f117500y != null) {
                LlmDescriptionPresenter.Feature feature = LlmDescriptionPresenter.Feature.f181677b;
                LlmDescriptionPresenter llmDescriptionPresenter = oVar.f105540f;
                cVar.accept(new C28876a(f117500y.getOverlay(), (llmDescriptionPresenter.a() || llmDescriptionPresenter.getF181689b().length() <= 0) ? null : f117500y.getConfirmDialog(), f117500y.getTimeout(), dVar, new p(1, llmDescriptionPresenter, LlmDescriptionPresenter.class, "rememberGenerateDescriptionText", "rememberGenerateDescriptionText(Ljava/lang/String;)V", 0), L.f(f117500y.getNeedPreviousFieldsValidation(), Boolean.TRUE), new q(0, llmDescriptionPresenter, LlmDescriptionPresenter.class, "onValidationError", "onValidationError()V", 0)));
            }
        } else if (iOrdinal == 1 && (f117501z = dVar.getF117501z()) != null) {
            cVar.accept(new a.C5343a(f117501z, dVar, new d(oVar)));
        }
        return G0.f406611a;
    }
}
