package com.avito.android.inline_filters.dialog.suggest;

import android.view.View;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.suggest.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestFilterDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/inline_filters/dialog/suggest/a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/inline_filters/dialog/suggest/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.l<a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f172236l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f172237m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, View view) {
        super(1);
        this.f172236l = bVar;
        this.f172237m = view;
    }

    @Override // Y41.l
    public final G0 invoke(a aVar) {
        com.avito.android.lib.design.toast_bar.b bVar;
        a aVar2 = aVar;
        b bVar2 = this.f172236l;
        bVar2.getClass();
        if (aVar2 instanceof a.b) {
            com.avito.android.lib.design.toast_bar.b bVar3 = bVar2.f172221k;
            if (bVar3 != null) {
                bVar3.a();
            }
            bVar2.f172221k = com.avito.android.component.toast.b.b(this.f172237m, null, R.string.vertical_suggest_widget_error, null, R.string.vertical_suggest_widget_retry, ((a.b) aVar2).f172213a, 2750, ToastBarPosition.f181047e, null, null, 130949);
        } else if ((aVar2 instanceof a.C5082a) && (bVar = bVar2.f172221k) != null) {
            bVar.a();
        }
        return G0.f406611a;
    }
}
