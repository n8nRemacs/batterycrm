package com.avito.android.ai_assistant.adapter.assistant_text_message;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: AssistantTextMessageItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/assistant_text_message/h;", "Lcom/avito/android/ai_assistant/adapter/assistant_text_message/f;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43238h f88757b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f88758c = f2.b(0, 1, null, 5);

    @Inject
    public h(@Y61.k R0 r02) {
        this.f88757b = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        AttributedText attributedText = ((b) aVar).f88748d;
        ((j) eVar).q8(attributedText);
        C43175k.K(new C43197r1(new g(this, null), attributedText.linkClicks()), this.f88757b);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        AttributedText attributedText = ((b) aVar).f88748d;
        ((j) eVar).q8(attributedText);
        C43175k.K(new C43197r1(new g(this, null), attributedText.linkClicks()), this.f88757b);
    }

    @Override // com.avito.android.ai_assistant.adapter.assistant_text_message.f
    @Y61.k
    /* renamed from: o5, reason: from getter */
    public final e2 getF88758c() {
        return this.f88758c;
    }
}
