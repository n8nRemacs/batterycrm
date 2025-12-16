package com.avito.android.publish.deeplink;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobEnrichmentFeedbackDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class B extends N implements Y41.l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D f232520l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D d12) {
        super(1);
        this.f232520l = d12;
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        D d12 = this.f232520l;
        com.avito.android.publish.enrichment_feedback.b bVar = new com.avito.android.publish.enrichment_feedback.b(context, new z(d12));
        bVar.R(new A(d12));
        return bVar;
    }
}
