package com.avito.android.blueprints.switcher;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiStateSwitcherItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/switcher/f;", "Lcom/avito/android/blueprints/switcher/b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f106754b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f106755c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Q1 f106756d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<com.avito.android.items.b> f106757e;

    /* renamed from: f, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f106758f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C41981q0 f106759g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C41981q0 f106760h;

    public f(@k com.avito.android.util.text.a aVar, @k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12) {
        this.f106754b = aVar;
        this.f106755c = interfaceC35807h4;
        this.f106756d = q12;
        com.jakewharton.rxrelay3.c<com.avito.android.items.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106757e = cVar;
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f106758f = cVar2;
        this.f106759g = new C41981q0(cVar);
        this.f106760h = new C41981q0(cVar2);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        com.avito.android.items.b bVar = (com.avito.android.items.b) aVar;
        gVar.S1(c.f106750l);
        boolean zBooleanValue = this.f106756d.w().invoke().booleanValue();
        boolean z12 = bVar.f173934i;
        String str = bVar.f173933h;
        if (zBooleanValue) {
            gVar.Wi(this.f106755c.a(str, z12, bVar.f173938m));
        } else {
            if (z12) {
                str = "";
            }
            gVar.Wi(str);
        }
        gVar.setTitle(bVar.f173928c);
        com.avito.android.util.text.a aVar2 = this.f106754b;
        CharSequence charSequenceB = null;
        AttributedText attributedText = bVar.f173930e;
        gVar.Jp(attributedText != null ? aVar2.c(gVar.getContext(), attributedText) : null);
        gVar.setChecked(bVar.f173929d);
        gVar.setEnabled(bVar.f173936k);
        BaseListItem.Alignment alignment = bVar.f173940o;
        if (alignment != null) {
            gVar.j9(alignment);
        }
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new d(this));
        }
        gVar.k0(bVar.f173937l);
        ItemWithState.State state = bVar.f173931f;
        if (state instanceof ItemWithState.State.Normal) {
            CharSequence charSequence = ((ItemWithState.State.Normal) state).f173899b;
            if (charSequence == null) {
                AttributedText attributedText2 = bVar.f173932g;
                if (attributedText2 != null) {
                    charSequenceB = aVar2.b(attributedText2);
                }
            } else {
                charSequenceB = charSequence;
            }
            gVar.u(charSequenceB);
        } else if (state instanceof ItemWithState.State.Warning) {
            gVar.H(((ItemWithState.State.Warning) state).f173900b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithMessage) {
            gVar.H(((ItemWithState.State.Error.ErrorWithMessage) state).f173897b);
        } else if (state instanceof ItemWithState.State.Error.ErrorWithoutMessage) {
            gVar.H(null);
        }
        gVar.S1(new e(bVar, this));
    }

    @Override // com.avito.android.blueprints.switcher.b
    @k
    public final z<com.avito.android.items.b> b() {
        return this.f106759g;
    }

    @Override // com.avito.android.blueprints.switcher.b
    @k
    /* renamed from: v, reason: from getter */
    public final C41981q0 getF106760h() {
        return this.f106760h;
    }
}
