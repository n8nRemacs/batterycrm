package com.avito.android.inline_filters.dialog.suggest;

import android.view.View;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.K2;
import kotlin.Metadata;

/* compiled from: SuggestFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f172240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f172241c;

    public k(b bVar, View view) {
        this.f172240b = bVar;
        this.f172241c = view;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        View view = this.f172241c;
        b bVar = this.f172240b;
        bVar.getClass();
        bVar.f172216f.invoke(bVar.f172214d, new InlineFilterValue.InlineFilterSelectValue((String) obj));
        K2.d(view, true);
        bVar.c();
    }
}
