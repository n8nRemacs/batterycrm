package com.avito.android.screens.bbip_v2.ui.items.duration;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.screens.bbip_v2.ui.items.duration.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: BbipV2DurationItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0005²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/duration/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/screens/bbip_v2/ui/items/duration/i;", "Lcom/avito/android/screens/bbip_v2/ui/items/duration/p;", VoiceInfo.STATE, "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f261644b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<p> f261645c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super String, G0> f261646d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public a f261647e;

    public n(@Y61.k View view) {
        super(view);
        this.f261644b = (TextView) view.findViewById(R.id.bbip_v2_duration_title);
        ComposeView composeView = (ComposeView) view.findViewById(R.id.bbip_v2_compose_view);
        p.f261648e.getClass();
        this.f261645c = p2.a(p.f261649f);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.b.f41609b);
        composeView.setContent(new C22096n(74011147, new m(this), true));
    }

    public final void B80(int i12, p pVar, boolean z12) {
        List<b.a> list = pVar.f261650a;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                this.f261645c.setValue(new p(arrayList, pVar.f261651b, pVar.f261652c, z12 ? Integer.valueOf(i12) : null));
                return;
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(b.a.a((b.a) next, i13 == i12, 123));
            i13 = i14;
        }
    }

    @Override // com.avito.android.screens.bbip_v2.ui.items.duration.i
    public final void ZL(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k ArrayList arrayList, boolean z12) {
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (((b.a) it.next()).f261621c) {
                break;
            } else {
                i12++;
            }
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 == -1) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        B80(iIntValue, new p(arrayList, str, z12, Integer.valueOf(iIntValue)), true);
        this.f261646d = lVar;
    }

    @Override // com.avito.android.screens.bbip_v2.ui.items.duration.i
    public final void pf(@Y61.k String str, @Y61.k String str2, @Y61.k List<b.a> list, @Y61.k Y41.l<? super b.a, G0> lVar) {
        a aVar = this.f261647e;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f261647e = new a(this.itemView.getContext(), str, str2, list, lVar);
    }

    @Override // com.avito.android.screens.bbip_v2.ui.items.duration.i
    public final void setTitle(@Y61.k String str) {
        this.f261644b.setText(str);
    }
}
