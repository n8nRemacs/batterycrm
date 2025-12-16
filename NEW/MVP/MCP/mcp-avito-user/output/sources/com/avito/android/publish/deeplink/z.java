package com.avito.android.publish.deeplink;

import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: JobEnrichmentFeedbackDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "feedbackText", "Lcom/avito/android/publish/enrichment_feedback/b;", "dialog", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/android/publish/enrichment_feedback/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class z extends N implements Y41.p<String, com.avito.android.publish.enrichment_feedback.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D f232613l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(D d12) {
        super(2);
        this.f232613l = d12;
    }

    @Override // Y41.p
    public final G0 invoke(String str, com.avito.android.publish.enrichment_feedback.b bVar) {
        String str2 = str;
        com.avito.android.publish.enrichment_feedback.b bVar2 = bVar;
        D d12 = this.f232613l;
        int length = str2.length();
        if (5 > length || length >= 1501) {
            String string = bVar2.getContext().getString(R.string.job_enrichment_feedback_length_error, 5, 1500);
            Input.f179303W.getClass();
            bVar2.V(Input.f179305b0, true, string, false);
        } else {
            C43259k.d(d12.f232530h, null, null, new C(d12, str2, bVar2, null), 3);
        }
        return G0.f406611a;
    }
}
