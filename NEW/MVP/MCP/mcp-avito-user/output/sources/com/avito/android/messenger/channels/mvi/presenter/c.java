package com.avito.android.messenger.channels.mvi.presenter;

import com.avito.android.messenger.channels.mvi.presenter.a;
import com.avito.android.messenger.channels.mvi.presenter.b;
import com.avito.android.messenger.folders.f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: FoldersPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/folders/f;", "newCounters", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/folders/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f188303b;

    public c(b bVar) {
        this.f188303b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        ArrayList<Q> arrayList = ((f) obj).f196356a;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        for (Q q12 : arrayList) {
            int iIntValue = ((Number) q12.f406620c).intValue();
            String strValueOf = iIntValue == 0 ? "" : String.valueOf(iIntValue);
            com.avito.android.messenger.folders.a aVar = (com.avito.android.messenger.folders.a) q12.f406619b;
            arrayList2.add(new a.C5551a(aVar.f196344b, aVar.f196343a, strValueOf));
        }
        this.f188303b.le().s(new b.C5553b(arrayList2));
    }
}
