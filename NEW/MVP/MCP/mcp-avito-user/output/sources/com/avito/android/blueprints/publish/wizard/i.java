package com.avito.android.blueprints.publish.wizard;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprint.date.interval.j;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WizardItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/wizard/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/publish/wizard/h;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f106510d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f106511b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ListItemCheckmark f106512c;

    public i(@k View view) {
        super(view);
        this.f106511b = view;
        this.f106512c = (ListItemCheckmark) view;
    }

    @Override // com.avito.android.blueprints.publish.wizard.h
    public final void D(@l PrintableText printableText) {
        this.f106512c.setTitle(printableText != null ? printableText.k0(this.f106511b.getContext()) : null);
    }

    @Override // com.avito.android.blueprints.publish.wizard.h
    public final void J0(@k Y41.a<G0> aVar) {
        this.f106511b.setOnClickListener(new j(19, aVar));
    }

    @Override // com.avito.android.blueprints.publish.wizard.h
    public final void f(@l String str) {
        this.f106512c.setSubtitle(str);
    }
}
