package com.avito.android.verification.inn.list.checkbox;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.deep_linking.links.w;
import com.avito.android.di.B;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CheckboxItemPresenter.kt */
@B
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/checkbox/g;", "LTV0/d;", "Lcom/avito/android/verification/inn/list/checkbox/i;", "Lcom/avito/android/verification/inn/list/checkbox/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements TV0.d<i, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f323949b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final w f323950c;

    @Inject
    public g(@k d dVar, @k w wVar) {
        this.f323949b = dVar;
        this.f323950c = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        AttributedText attributedText = aVar2.f323937f;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(this.f323950c);
        }
        com.avito.android.lib.deprecated_design.radio_button.c cVar = new com.avito.android.lib.deprecated_design.radio_button.c(7, iVar, new e(aVar2, this));
        Checkbox checkbox = iVar.f323953b;
        checkbox.setOnCheckedChangeListener(cVar);
        checkbox.setText(aVar2.f323938g);
        j.a(iVar.f323954c, aVar2.f323937f, null);
        checkbox.setChecked(aVar2.f323939h);
        checkbox.setEnabled(!aVar2.f323936e);
        ((RecyclerView.n) iVar.itemView.getLayoutParams()).setMargins(0, y6.b(aVar2.f323940i), 0, y6.b(aVar2.f323941j));
        iVar.f323955d = new f(aVar2);
    }
}
