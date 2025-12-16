package com.avito.android.realty_agency.inline_filters.developer_suggest;

import android.view.View;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeveloperSuggestFilterDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f251528l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f251529m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, d dVar) {
        super(0);
        this.f251528l = view;
        this.f251529m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        K2.f(this.f251528l, 3);
        this.f251529m.dismiss();
        return G0.f406611a;
    }
}
