package com.avito.android.publish;

import com.avito.android.analytics.publish.FromPage;
import com.avito.android.publish.drafts.C33842h;
import com.avito.android.publish.drafts.PublishDraftRepository;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: DraftSyncDelegate.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/publish/drafts/h;", "optionalLocalDraft", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/publish/drafts/PublishDraftRepository$DraftSyncResult;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33865i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33874j f236028b;

    public C33865i(C33874j c33874j) {
        this.f236028b = c33874j;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        boolean zF2;
        io.reactivex.rxjava3.internal.operators.single.U uA2;
        C33842h c33842h = (C33842h) arrow.core.Z0.a((arrow.core.Y0) obj, C33863h.f236025l);
        if (c33842h != null) {
            if (!c33842h.f235380f) {
                c33842h = null;
            }
            if (c33842h != null) {
                C33874j c33874j = this.f236028b;
                if (c33874j.f237365b.f443210b.length() == 0) {
                    C50213a c50213a = c33874j.f237365b;
                    String str = c33842h.f235375a;
                    c50213a.f443211c = str;
                    c50213a.f443210b = str;
                    c33874j.f237365b.f443212d = FromPage.f90272b;
                    c33874j.f237365b.f443213e = null;
                    zF2 = true;
                } else {
                    zF2 = kotlin.jvm.internal.L.f(c33874j.f237365b.b(), c33842h.f235375a);
                }
                if ((zF2 ? c33842h : null) != null && (uA2 = this.f236028b.f237364a.getF235426k()) != null) {
                    return uA2;
                }
            }
        }
        return io.reactivex.rxjava3.core.I.q(PublishDraftRepository.DraftSyncResult.f235332b);
    }
}
