package com.avito.android.blueprint.switcher;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishSwitcherView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprint/switcher/i;", "LHj/c;", "Lcom/avito/android/blueprint/switcher/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends Hj.c implements g {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f105777q = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final View f105778m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f105779n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final ListItemSwitcher f105780o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public h f105781p;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view, R.layout.view_publish_switcher_content, aVar);
        this.f105778m = view;
        this.f105779n = aVar;
        this.f105780o = (ListItemSwitcher) this.f7656e.findViewById(R.id.publish_switcher);
    }

    @Override // com.avito.android.blueprint.switcher.g
    public final void Fj(@l AttributedText attributedText) {
        CharSequence charSequenceC;
        if (attributedText != null) {
            charSequenceC = this.f105779n.c(this.f105778m.getContext(), attributedText);
        } else {
            charSequenceC = null;
        }
        ListItemSwitcher listItemSwitcher = this.f105780o;
        listItemSwitcher.setLink(charSequenceC);
        listItemSwitcher.setLinkMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.blueprint.switcher.g
    public final void S1(@k Y41.l<? super Boolean, G0> lVar) {
        h hVar = this.f105781p;
        ListItemSwitcher listItemSwitcher = this.f105780o;
        if (hVar != null) {
            listItemSwitcher.j(hVar);
        }
        h hVar2 = new h(0, lVar);
        listItemSwitcher.e(hVar2);
        this.f105781p = hVar2;
    }

    @Override // com.avito.android.blueprint.switcher.g
    public final void j9(@k BaseListItem.Alignment alignment) {
        this.f105780o.setSwitcherAlignment(alignment);
    }

    @Override // com.avito.android.blueprint.switcher.g
    public final void setChecked(boolean z12) {
        this.f105780o.setChecked(z12);
    }

    @Override // Hj.c, Hj.InterfaceC13997b
    public final void setEnabled(boolean z12) {
        super.setEnabled(z12);
        this.f105780o.setEnabled(z12);
    }

    @Override // com.avito.android.blueprint.switcher.g
    public final void setText(@k String str) {
        this.f105780o.setTitle(str);
    }
}
