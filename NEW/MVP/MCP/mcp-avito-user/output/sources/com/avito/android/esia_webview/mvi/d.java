package com.avito.android.esia_webview.mvi;

import Oz.AbstractC14758b;
import Oz.AbstractC14759c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ConfirmDocumentsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/esia_webview/mvi/d;", "Lcom/avito/android/arch/mvi/t;", "LOz/b;", "LOz/c;", "<init>", "()V", "_avito_gig_esia-webview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements t<AbstractC14758b, AbstractC14759c> {
    @Inject
    public d() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final AbstractC14759c b(AbstractC14758b abstractC14758b) {
        AbstractC14758b abstractC14758b2 = abstractC14758b;
        if (abstractC14758b2 instanceof AbstractC14758b.C0824b) {
            return AbstractC14759c.a.f12746a;
        }
        if (abstractC14758b2 instanceof AbstractC14758b.a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
