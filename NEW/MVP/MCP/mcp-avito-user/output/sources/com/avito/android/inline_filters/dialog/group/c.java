package com.avito.android.inline_filters.dialog.group;

import android.widget.TextView;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilterValueKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: GroupFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/remote/model/search/Filter;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "it", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f171560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f171561c;

    public c(b bVar, r rVar) {
        this.f171560b = bVar;
        this.f171561c = rVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        b bVar = this.f171560b;
        bVar.f171557e.put(q12.f406619b, q12.f406620c);
        Collection collectionValues = bVar.f171557e.values();
        boolean z12 = false;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator<T> it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (InlineFilterValueKt.isNotEmpty((InlineFilterValue) it.next())) {
                    z12 = true;
                    break;
                }
            }
        }
        r rVar = this.f171561c;
        int i12 = z12 ? rVar.f171642n : rVar.f171643o;
        TextView textView = rVar.f171635g;
        textView.setTextColor(i12);
        textView.setClickable(z12);
    }
}
