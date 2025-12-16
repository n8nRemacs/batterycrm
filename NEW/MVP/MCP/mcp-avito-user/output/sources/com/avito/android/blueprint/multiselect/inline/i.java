package com.avito.android.blueprint.multiselect.inline;

import Ba.ViewOnClickListenerC13121a;
import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import androidx.core.view.C22829k0;
import com.avito.android.R;
import com.avito.android.blueprints.publish.multiselect.inline.j;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.lib.design.toggle.Toggle;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;

/* compiled from: PublishInlineMultiselectView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprint/multiselect/inline/i;", "LHj/c;", "Lcom/avito/android/blueprint/multiselect/inline/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends Hj.c implements g {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final LinearLayout f105621m;

    /* renamed from: n, reason: collision with root package name */
    public final LayoutInflater f105622n;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view, R.layout.view_publish_multiselect_inline_content, aVar);
        this.f105621m = (LinearLayout) this.f7656e;
        this.f105622n = LayoutInflater.from(view.getContext());
        new C41981q0(new com.jakewharton.rxrelay3.c());
    }

    @Override // Hj.c
    public final void B80() {
        Toggle.f181152k.getClass();
        D80(Toggle.f181154m);
    }

    @Override // Hj.c
    public final void C80() {
        Toggle.f181152k.getClass();
        D80(Toggle.f181153l);
    }

    public final void D80(int[] iArr) {
        C43025h.a aVar = new C43025h.a(C43033p.i(new C22829k0(this.f105621m), h.f105620l));
        while (aVar.hasNext()) {
            ((ListItemCheckbox) aVar.next()).setCheckboxState(iArr);
        }
    }

    @Override // com.avito.android.blueprint.multiselect.inline.g
    public final void L8(@k String str) {
        LinearLayout linearLayout = this.f105621m;
        Iterator<View> it = new C22829k0(linearLayout).iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (L.f(next.getTag(), str)) {
                linearLayout.removeView(next);
                return;
            }
        }
    }

    @Override // com.avito.android.blueprint.multiselect.inline.g
    public final void b8(@k String str, @k String str2, @l String str3, boolean z12, @l Y41.a<G0> aVar, @l Integer num, @l Y41.l<? super Boolean, G0> lVar) {
        LayoutInflater layoutInflater = this.f105622n;
        G0 g02 = null;
        View viewInflate = layoutInflater != null ? layoutInflater.inflate(R.layout.publish_checkbox_list_item, (ViewGroup) null) : null;
        ListItemCheckbox listItemCheckbox = (ListItemCheckbox) viewInflate;
        j jVar = new j(listItemCheckbox);
        listItemCheckbox.setTitle(str2);
        listItemCheckbox.setSubtitle(str3);
        listItemCheckbox.setChecked(z12);
        if (aVar == null) {
            listItemCheckbox.k();
        } else {
            listItemCheckbox.l();
        }
        listItemCheckbox.setImageClickedListener(new ViewOnClickListenerC13121a(22, aVar));
        com.avito.android.blueprints.publish.multiselect.inline.i iVar = jVar.f106397a;
        if (iVar != null) {
            listItemCheckbox.j(iVar);
        }
        com.avito.android.blueprints.publish.multiselect.inline.i iVar2 = new com.avito.android.blueprints.publish.multiselect.inline.i(0, lVar);
        listItemCheckbox.e(iVar2);
        jVar.f106397a = iVar2;
        listItemCheckbox.setTag(str);
        LinearLayout linearLayout = this.f105621m;
        if (num != null) {
            if ((num.intValue() <= linearLayout.getChildCount() ? num : null) != null) {
                linearLayout.addView(viewInflate, num.intValue());
                g02 = G0.f406611a;
            }
        }
        if (g02 == null) {
            linearLayout.addView(viewInflate);
        }
    }

    @Override // com.avito.android.blueprint.multiselect.inline.g
    public final void s(@k String str) {
        this.f105621m.setTag(str);
    }

    @Override // com.avito.android.blueprint.multiselect.inline.g
    public final void za() {
        this.f105621m.removeAllViews();
    }
}
