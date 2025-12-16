package com.avito.android.ab_groups;

import com.avito.android.ab_groups.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.C43066x;
import q3.C47189a;

/* compiled from: AbExperimentsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/CharSequence;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class u<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f67694b;

    public u(q qVar) {
        this.f67694b = qVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String string = ((CharSequence) obj).toString();
        q qVar = this.f67694b;
        String lowerCase = string.toLowerCase(Locale.ROOT);
        ArrayList<C47189a> arrayList = qVar.f67676J;
        ArrayList arrayList2 = new ArrayList();
        Iterator<C47189a> it = arrayList.iterator();
        while (it.hasNext()) {
            C47189a next = it.next();
            C47189a c47189a = next;
            String title = c47189a.getTitle();
            Locale locale = Locale.ROOT;
            if (C43066x.q(title.toLowerCase(locale), lowerCase, false) || C43066x.q(c47189a.getLabel().toLowerCase(locale), lowerCase, false)) {
                arrayList2.add(next);
            }
        }
        qVar.f67677K.postValue(new q.d.c(arrayList2));
    }
}
