package com.avito.android.auto_reseller_contacts.spend_contact_dialog;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SpendContactDialogView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_reseller_contacts/spend_contact_dialog/j;", "Lcom/avito/android/auto_reseller_contacts/spend_contact_dialog/i;", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f95807a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f95808b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ProgressBar f95809c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f95810d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f95811e;

    public j(@Y61.k com.avito.android.lib.design.modal.a aVar) {
        this.f95807a = aVar.getContext();
        this.f95808b = (TextView) aVar.findViewById(R.id.counter_title);
        this.f95809c = (ProgressBar) aVar.findViewById(R.id.progress_bar);
        this.f95810d = (TextView) aVar.findViewById(R.id.counter_details);
        this.f95811e = (ViewGroup) aVar.findViewById(R.id.counter_container);
    }
}
