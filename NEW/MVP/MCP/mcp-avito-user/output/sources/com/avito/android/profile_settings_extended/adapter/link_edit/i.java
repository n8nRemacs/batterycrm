package com.avito.android.profile_settings_extended.adapter.link_edit;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LinkEditItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/link_edit/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/link_edit/h;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h, InterfaceC15026b {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f229666i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C15027c f229667b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f229668c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f229669d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f229670e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f229671f;

    /* renamed from: g, reason: collision with root package name */
    public final int f229672g;

    /* renamed from: h, reason: collision with root package name */
    public final int f229673h;

    public i(@k View view) {
        super(view);
        this.f229667b = new C15027c(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_link_edit_item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229668c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_link_edit_item_link);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229669d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.extended_profile_link_edit_item_moderation_status);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229670e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.extended_profile_link_edit_item_actions_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f229671f = viewFindViewById4;
        this.f229672g = C35835l0.d(R.attr.red, view.getContext());
        this.f229673h = C35835l0.d(R.attr.gray54, view.getContext());
    }

    @Override // com.avito.android.profile_settings_extended.adapter.link_edit.h
    public final void LX(@k LinkEditItem linkEditItem) {
        I5.a(this.f229668c, linkEditItem.f229641c, false);
        I5.a(this.f229669d, linkEditItem.f229642d, false);
        ModerationStatus moderationStatus = linkEditItem.f229645g;
        AttributedText f226771c = moderationStatus != null ? moderationStatus.getF226771c() : null;
        TextView textView = this.f229670e;
        j.a(textView, f226771c, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor(moderationStatus instanceof ModerationStatus.ModerationFailed ? this.f229672g : this.f229673h);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.link_edit.h
    public final void Rq(@k Y41.a<G0> aVar) {
        this.f229671f.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(15, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229671f.setOnClickListener(null);
        this.f229669d.setOnClickListener(null);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.link_edit.h
    public final void wP(@k Y41.a<G0> aVar) {
        this.f229669d.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(16, aVar));
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229667b.xT(z12);
    }
}
