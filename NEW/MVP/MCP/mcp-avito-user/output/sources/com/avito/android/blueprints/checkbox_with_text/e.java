package com.avito.android.blueprints.checkbox_with_text;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.items.CheckBoxItemWithText;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CheckBoxItemWithTextPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/checkbox_with_text/e;", "Lcom/avito/android/blueprints/checkbox_with_text/c;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<CheckBoxItemWithText> f105832b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f105833c;

    @Inject
    public e() {
        com.jakewharton.rxrelay3.c<CheckBoxItemWithText> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105832b = cVar;
        this.f105833c = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CheckBoxItemWithText checkBoxItemWithText = (CheckBoxItemWithText) aVar;
        gVar.setTitle(checkBoxItemWithText.f173887c);
        gVar.pF(checkBoxItemWithText.f173888d);
        gVar.qE(new d(checkBoxItemWithText, this));
        gVar.setChecked(checkBoxItemWithText.f173889e);
    }

    @Override // com.avito.android.blueprints.checkbox_with_text.c
    @k
    public final z<CheckBoxItemWithText> c() {
        return this.f105833c;
    }
}
