package com.avito.android.tariff.cpx.configure.advance.items.cards;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.cpx.configure.advance.items.cards.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: CpxConfigureAdvanceCardsItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0007²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/advance/items/cards/w;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/configure/advance/items/cards/j;", "Lcom/avito/android/tariff/cpx/configure/advance/items/cards/y;", VoiceInfo.STATE, "", "maxCardHeight", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class w extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f295688b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<y> f295689c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super a, G0> f295690d;

    public w(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.cpx_configure_advance_compose_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        ComposeView composeView = (ComposeView) viewFindViewById;
        TextView textView = (TextView) view.findViewById(R.id.cpx_configure_advance_cards_info);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f295688b = textView;
        y.f295691c.getClass();
        this.f295689c = p2.a(y.f295692d);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.b.f41609b);
        composeView.setContent(new C22096n(-15475665, new v(this), true));
    }

    @Override // com.avito.android.tariff.cpx.configure.advance.items.cards.j
    public final void U4(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f295688b, attributedText, null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f295690d = null;
    }

    @Override // com.avito.android.tariff.cpx.configure.advance.items.cards.j
    public final void wa(@Y61.k Y41.l lVar, @Y61.k List list) {
        Integer numValueOf;
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof a.b) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            numValueOf = null;
            if (it.hasNext()) {
                next = it.next();
                if (((a.b) next).f295651b) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        a.b bVar = (a.b) next;
        if (bVar != null) {
            U4(bVar.f295653d);
            numValueOf = Integer.valueOf(list.indexOf(bVar));
        }
        this.f295689c.setValue(new y(list, numValueOf));
        this.f295690d = lVar;
    }
}
