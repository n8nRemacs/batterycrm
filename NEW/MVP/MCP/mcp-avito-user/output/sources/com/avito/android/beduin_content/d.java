package com.avito.android.beduin_content;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_shared.model.form.BeduinForm;
import gj.InterfaceC40691b;
import kotlin.Metadata;

/* compiled from: BeduinSerpItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin_content/d;", "LXQ/a;", "Lcom/avito/android/beduin_content/e;", "Lcom/avito/android/beduin_content/BeduinSerpItem;", "_avito_bx-content_widget_beduin-content_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements XQ.a<e, BeduinSerpItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40691b f105228b;

    public d(@k InterfaceC40691b interfaceC40691b) {
        this.f105228b = interfaceC40691b;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        BeduinForm beduinForm = ((BeduinSerpItem) aVar).f105213b;
        String str = beduinForm.f105312b;
        ((e) eVar).Z00(str, com.avito.android.beduin_shared.model.utils.b.a(this.f105228b, str, beduinForm.f105313c));
    }

    @Override // XQ.a
    @l
    public final XQ.b d0() {
        return null;
    }
}
