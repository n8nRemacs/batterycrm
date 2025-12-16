package com.avito.android.evidence_request.mvi.evidence_details.adapter.files;

import com.avito.android.category_parameters.ParameterElement;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/files/g;", "Lcom/avito/android/evidence_request/mvi/evidence_details/adapter/files/c;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s f148783b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f148784c;

    @Inject
    public g(@Y61.k s sVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f148783b = sVar;
        this.f148784c = aVar;
    }

    public final void O(d dVar, ParameterElement.y yVar) {
        ItemWithState.State state = yVar.f117605j;
        if (state instanceof ItemWithState.State.Warning) {
            dVar.H(((ItemWithState.State.Warning) state).f173900b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            dVar.H(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b);
        } else {
            CharSequence charSequenceC = null;
            if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
                dVar.H(null);
            } else if (state instanceof ItemWithState.State.Normal) {
                CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
                if (charSequence == null) {
                    AttributedText attributedText = yVar.f117606k;
                    if (attributedText != null) {
                        charSequenceC = this.f148784c.c(dVar.getContext(), attributedText);
                    }
                } else {
                    charSequenceC = charSequence;
                }
                dVar.u(charSequenceC);
            }
        }
        this.f148783b.p(yVar.f117605j instanceof ItemWithState.State.Error);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((d) eVar, (ParameterElement.y) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        d dVar = (d) eVar;
        ParameterElement.y yVar = (ParameterElement.y) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof T3) {
                obj = obj2;
            }
        }
        T3 t32 = (T3) (obj instanceof T3 ? obj : null);
        if (t32 == null) {
            k(dVar, yVar);
            return;
        }
        if (t32.f318741a) {
            O(dVar, yVar);
        }
        if (t32.f318742b) {
            this.f148783b.c(yVar.f117602g);
        }
    }

    public final void k(@Y61.k d dVar, @Y61.k ParameterElement.y yVar) {
        dVar.setTitle(!yVar.f117607l ? yVar.f117599d : null);
        dVar.T(yVar.f117600e);
        O(dVar, yVar);
        int i12 = yVar.f117602g;
        s sVar = this.f148783b;
        sVar.c(i12);
        dVar.B2(sVar);
        dVar.d(new f(this));
    }
}
