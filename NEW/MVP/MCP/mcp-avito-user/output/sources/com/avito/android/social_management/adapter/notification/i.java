package com.avito.android.social_management.adapter.notification;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.alert_banner.AlertBanner;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NotificationItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/social_management/adapter/notification/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/social_management/adapter/notification/h;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f284543b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f284544c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AlertBanner f284545d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f284546e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<G0> f284547f;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f284543b = view;
        this.f284544c = aVar;
        AlertBanner alertBanner = (AlertBanner) view.findViewById(R.id.social_banner);
        this.f284545d = alertBanner;
        RU.a content = alertBanner.getContent();
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = content.f14463k;
        if (textView != null) {
            textView.setMovementMethod(linkMovementMethod);
        }
        alertBanner.setCloseButtonListener(new com.avito.android.services_transportation_widget.dialog.h(this, 5));
    }

    @Override // com.avito.android.social_management.adapter.notification.h
    public final void Oz(@k Y41.a<G0> aVar) {
        this.f284546e = aVar;
    }

    @Override // com.avito.android.social_management.adapter.notification.h
    public final void d(@l Y41.a<G0> aVar) {
        this.f284547f = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f284547f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.social_management.adapter.notification.h
    public final void r(@k AttributedText attributedText) {
        this.f284545d.getContent().a(this.f284544c.c(this.f284543b.getContext(), attributedText));
    }
}
