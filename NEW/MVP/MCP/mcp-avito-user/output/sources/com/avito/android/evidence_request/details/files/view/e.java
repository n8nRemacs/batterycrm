package com.avito.android.evidence_request.details.files.view;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.evidence_request.details.files.o;
import com.avito.android.items.ItemWithState;
import com.avito.android.photo_list_view.s;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.T3;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FilesItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/details/files/view/e;", "Lcom/avito/android/evidence_request/details/files/view/c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f148472b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f148473c;

    @Inject
    public e(@Y61.k s sVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f148472b = sVar;
        this.f148473c = aVar;
    }

    public final void O(o oVar, ParameterElement.y yVar) {
        ItemWithState.State state = yVar.f117605j;
        CharSequence charSequenceB = null;
        if (state instanceof ItemWithState.State.Normal) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence == null) {
                AttributedText attributedText = yVar.f117606k;
                if (attributedText != null) {
                    charSequenceB = this.f148473c.b(attributedText);
                }
            } else {
                charSequenceB = charSequence;
            }
            oVar.u(charSequenceB);
        } else if (state instanceof ItemWithState.State.Warning) {
            oVar.H(((ItemWithState.State.Warning) state).f173900b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            oVar.H(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            oVar.H(null);
        }
        this.f148472b.p(yVar.f117605j instanceof ItemWithState.State.Error);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((o) eVar, (ParameterElement.y) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        o oVar = (o) eVar;
        ParameterElement.y yVar = (ParameterElement.y) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof T3) {
                obj = obj2;
            }
        }
        T3 t32 = (T3) (obj instanceof T3 ? obj : null);
        if (t32 == null) {
            k(oVar, yVar);
            return;
        }
        if (t32.f318741a) {
            O(oVar, yVar);
        }
        if (t32.f318742b) {
            this.f148472b.c(yVar.f117602g);
        }
    }

    public final void k(@Y61.k o oVar, @Y61.k ParameterElement.y yVar) {
        oVar.setTitle(yVar.f117607l ? null : yVar.f117599d);
        oVar.T(yVar.f117600e);
        O(oVar, yVar);
        int i12 = yVar.f117602g;
        s sVar = this.f148472b;
        sVar.c(i12);
        oVar.B2(sVar);
        oVar.d(new d(this));
    }
}
