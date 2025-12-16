package com.avito.android.blueprints.input;

import android.text.Editable;
import android.text.TextWatcher;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: MultiStateInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/input/w;", "Landroid/text/TextWatcher;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class w implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f105986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f105987c;

    public w(z zVar, Y41.a aVar) {
        this.f105986b = zVar;
        this.f105987c = aVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@Y61.k Editable editable) {
        boolean zK2 = C43066x.K(editable);
        z zVar = this.f105986b;
        if (!zK2) {
            zVar.WE(null, null);
        } else {
            zVar.H20(this.f105987c);
            zVar.WE(Integer.valueOf(R.attr.ic_help24), Integer.valueOf(R.attr.gray28));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
