package com.avito.android.profile.user_profile.cards.contacts;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import gr.C40723b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContactsCardItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/contacts/h;", "Lcom/avito/android/profile/user_profile/cards/contacts/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f224928b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C40723b f224929c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.lib.deprecated_design.button.c f224930d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ViewGroup f224931e;

    /* compiled from: ContactsCardItemView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f224932l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f224932l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f224932l.invoke();
            return G0.f406611a;
        }
    }

    public h(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f224928b = (TextView) view.findViewById(R.id.title);
        C40723b c40723bB = com.avito.android.profile.user_profile.cards.d.b(view, R.id.contacts);
        com.avito.android.profile.user_profile.cards.d.c(c40723bB, C35835l0.l(context.getDrawable(R.drawable.ic_contacts_24), C35835l0.d(R.attr.gray28, context)));
        this.f224929c = c40723bB;
        this.f224930d = com.avito.android.profile.user_profile.cards.d.a(view, R.id.action_button);
        View viewFindViewById = view.findViewById(R.id.action_block);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f224931e = (ViewGroup) viewFindViewById;
    }

    @Override // com.avito.android.profile.user_profile.cards.contacts.g
    public final void P(@k String str, @k Y41.a<G0> aVar) {
        com.avito.android.lib.deprecated_design.button.c cVar = this.f224930d;
        cVar.b(str);
        cVar.c(new a(aVar));
        D6.H(this.f224931e);
    }

    @Override // com.avito.android.profile.user_profile.cards.contacts.g
    public final void ak() {
        D6.w(this.f224931e);
    }

    @Override // com.avito.android.profile.user_profile.cards.contacts.g
    public final void b(@k String str) {
        I5.a(this.f224928b, str, false);
    }

    @Override // com.avito.android.profile.user_profile.cards.contacts.g
    public final void n(@l String str) {
        this.f224929c.m6(str);
    }
}
