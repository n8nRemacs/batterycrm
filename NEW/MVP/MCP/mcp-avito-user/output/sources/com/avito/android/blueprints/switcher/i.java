package com.avito.android.blueprints.switcher;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.lib.design.switcher.Switcher;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MultiStateSwitcherItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/switcher/i;", "Lcom/avito/android/blueprints/switcher/g;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ComponentContainer f106762b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ListItemSwitcher f106763c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public a f106764d;

    /* renamed from: e, reason: collision with root package name */
    public final int f106765e;

    /* renamed from: f, reason: collision with root package name */
    public final int f106766f;

    /* compiled from: MultiStateSwitcherItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/blueprints/switcher/i$a", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ListItemCompoundButton.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N f106767a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Boolean, G0> lVar) {
            this.f106767a = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
        public final void a(@k ListItemCompoundButton listItemCompoundButton, boolean z12) {
            this.f106767a.invoke(Boolean.valueOf(z12));
        }
    }

    public i(@k View view) {
        ComponentContainer componentContainer = (ComponentContainer) view.findViewById(R.id.container);
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) view.findViewById(R.id.switcher);
        this.f106762b = componentContainer;
        this.f106763c = listItemSwitcher;
        this.f106765e = componentContainer.getPaddingTop();
        this.f106766f = componentContainer.getPaddingBottom();
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void H(@l CharSequence charSequence) {
        Switcher.f180663a0.getClass();
        int[] iArr = Switcher.f180665c0;
        ListItemSwitcher listItemSwitcher = this.f106763c;
        listItemSwitcher.setSwitcherState(iArr);
        listItemSwitcher.setMessage(charSequence);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void Jp(@l CharSequence charSequence) {
        ListItemSwitcher listItemSwitcher = this.f106763c;
        listItemSwitcher.setLink(charSequence);
        listItemSwitcher.setLinkMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void S1(@k Y41.l<? super Boolean, G0> lVar) {
        a aVar = this.f106764d;
        ListItemSwitcher listItemSwitcher = this.f106763c;
        if (aVar != null) {
            listItemSwitcher.j(aVar);
        }
        a aVar2 = new a(lVar);
        listItemSwitcher.e(aVar2);
        this.f106764d = aVar2;
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void Wi(@l CharSequence charSequence) {
        this.f106762b.setTitle(charSequence);
    }

    @Override // com.avito.android.blueprints.switcher.g
    @k
    public final Context getContext() {
        return this.f106762b.getContext();
    }

    @Override // TV0.e
    public final void j5() {
        throw null;
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void j9(@k BaseListItem.Alignment alignment) {
        this.f106763c.setSwitcherAlignment(alignment);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void k0(@l CustomPaddings customPaddings) {
        Integer bottom;
        Integer top;
        D6.f(this.f106762b, 0, (customPaddings == null || (top = customPaddings.getTop()) == null) ? this.f106765e : y6.d(top.intValue()), 0, (customPaddings == null || (bottom = customPaddings.getBottom()) == null) ? this.f106766f : y6.d(bottom.intValue()), 5);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void setChecked(boolean z12) {
        this.f106763c.setChecked(z12);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void setEnabled(boolean z12) {
        this.f106763c.setEnabled(z12);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void setTitle(@k String str) {
        this.f106763c.setTitle(str);
    }

    @Override // com.avito.android.blueprints.switcher.g
    public final void u(@l CharSequence charSequence) {
        Switcher.f180663a0.getClass();
        int[] iArr = Switcher.f180664b0;
        ListItemSwitcher listItemSwitcher = this.f106763c;
        listItemSwitcher.setSwitcherState(iArr);
        listItemSwitcher.setMessage(charSequence);
    }
}
