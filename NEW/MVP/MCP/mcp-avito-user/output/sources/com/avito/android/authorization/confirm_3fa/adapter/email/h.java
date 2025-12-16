package com.avito.android.authorization.confirm_3fa.adapter.email;

import Y61.k;
import android.view.View;
import com.avito.android.authorization.confirm_3fa.adapter.EmailListItemView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: EmailItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/adapter/email/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/authorization/confirm_3fa/adapter/email/g;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f93570c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final EmailListItemView f93571b;

    public h(@k View view) {
        super(view);
        this.f93571b = (EmailListItemView) view;
    }

    @Override // com.avito.android.authorization.confirm_3fa.adapter.email.g
    public final void Mr(@k String str) {
        this.f93571b.setText(str);
    }

    @Override // com.avito.android.authorization.confirm_3fa.adapter.email.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f93571b.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(6, aVar));
    }
}
