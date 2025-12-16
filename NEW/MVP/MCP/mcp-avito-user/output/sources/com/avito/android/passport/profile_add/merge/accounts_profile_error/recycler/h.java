package com.avito.android.passport.profile_add.merge.accounts_profile_error.recycler;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportProfileErrorItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/recycler/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/recycler/g;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f212455b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f212456c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f212457d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f212458e;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f212455b = view;
        this.f212456c = aVar;
        View viewFindViewById = view.findViewById(R.id.passport_profile_error_list_item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f212457d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.passport_profile_error_list_item_left_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f212458e = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.passport.profile_add.merge.accounts_profile_error.recycler.g
    public final void e(@k AttributedText attributedText) {
        j.a(this.f212457d, attributedText, this.f212456c);
    }

    @Override // com.avito.android.passport.profile_add.merge.accounts_profile_error.recycler.g
    public final void setIcon(@InterfaceC42150f int i12) {
        FV.a.f4720a.getClass();
        FV.a.c(this.f212458e, i12);
    }
}
