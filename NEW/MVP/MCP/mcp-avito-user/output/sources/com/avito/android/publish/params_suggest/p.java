package com.avito.android.publish.params_suggest;

import com.avito.android.publish.C0;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ParamsSuggestionsViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "", "Lcom/avito/android/publish/params_suggest/d;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f238238b;

    public p(s sVar) {
        this.f238238b = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2<?> p22 = (P2) obj;
        s sVar = this.f238238b;
        sVar.f238246N.setValue(p22);
        boolean z12 = p22 instanceof P2.b;
        C0 c02 = sVar.f238243K;
        if (!z12) {
            if (p22 instanceof P2.a) {
                c02.xe(null);
                return;
            } else {
                p22.equals(P2.c.f318721a);
                return;
            }
        }
        P2.b bVar = (P2.b) p22;
        CategoryParameters categoryParameters = c02.f231873k0;
        if (categoryParameters != null) {
            CategoryParameters categoryParametersA = sVar.f238244L.a(categoryParameters, (List) bVar.f318720a);
            if (categoryParametersA != null) {
                c02.Le(categoryParametersA);
            }
        }
        c02.xe(null);
    }
}
