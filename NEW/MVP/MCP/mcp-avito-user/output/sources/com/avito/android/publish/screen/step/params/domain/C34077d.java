package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.ux.feedback.impl.x;
import kotlin.Metadata;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/ux/feedback/impl/x;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/ux/feedback/impl/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.screen.step.params.domain.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34077d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34076c f241260b;

    public C34077d(C34076c c34076c) {
        this.f241260b = c34076c;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.ux.feedback.impl.x xVar = (com.avito.android.ux.feedback.impl.x) obj;
        boolean zEquals = xVar.equals(x.d.f319186a);
        C34076c c34076c = this.f241260b;
        if (zEquals) {
            c34076c.u();
            return;
        }
        if (xVar.equals(x.e.f319187a) ? true : xVar.equals(x.b.f319184a) ? true : xVar.equals(x.a.f319183a) ? true : xVar.equals(x.c.f319185a)) {
            c34076c.r();
        }
    }
}
