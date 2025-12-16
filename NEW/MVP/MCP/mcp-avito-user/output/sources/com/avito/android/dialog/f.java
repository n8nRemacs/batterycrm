package com.avito.android.dialog;

import com.avito.android.lib.design.modal.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DialogPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class f extends N implements Y41.l<a.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CharSequence f144767l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CharSequence charSequence) {
        super(1);
        this.f144767l = charSequence;
    }

    @Override // Y41.l
    public final G0 invoke(a.b bVar) {
        bVar.setSubtitle(this.f144767l);
        return G0.f406611a;
    }
}
