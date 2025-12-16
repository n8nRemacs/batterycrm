package com.avito.android.inline_filters.dialog.suggest;

import android.view.View;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.K2;
import kotlin.Metadata;

/* compiled from: SuggestFilterDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/i;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/inline_filters/dialog/select/adapter/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f172233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f172234c;

    public f(b bVar, View view) {
        this.f172233b = bVar;
        this.f172234c = view;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str = ((com.avito.android.inline_filters.dialog.select.adapter.i) obj).f172093d;
        View view = this.f172234c;
        b bVar = this.f172233b;
        bVar.getClass();
        bVar.f172216f.invoke(bVar.f172214d, new InlineFilterValue.InlineFilterSelectValue(str));
        K2.d(view, true);
        bVar.c();
    }
}
