package com.avito.android.advert.notes;

import com.avito.android.advert.notes.v;
import com.avito.android.util.K2;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: EditAdvertNotePresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert/notes/v;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/advert/notes/v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f80921b;

    public o(t tVar) {
        this.f80921b = tVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str;
        v vVar = (v) obj;
        t tVar = this.f80921b;
        y yVar = tVar.f80937l;
        if (yVar != null) {
            K2.d(yVar.f80954d, true);
        }
        if (vVar instanceof v.a) {
            t.c(tVar, null, 1);
        } else {
            if (!(vVar instanceof v.b) || (str = tVar.f80939n) == null) {
                return;
            }
            tVar.f80935j.b(tVar.f80929d.a(tVar.f80926a, str, C43066x.K(tVar.f80928c)).j0(tVar.f80930e.e()).v0(new k(tVar, str), new l(tVar), io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
    }
}
