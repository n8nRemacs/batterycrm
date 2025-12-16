package com.avito.android.extended_profile_widgets.adapter.selections;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectionsItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/extended_profile_widgets/adapter/selections/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/extended_profile_widgets/adapter/selections/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class a extends N implements p<ViewGroup, View, i> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f154869l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(2);
        this.f154869l = bVar;
    }

    @Override // Y41.p
    public final i invoke(ViewGroup viewGroup, View view) {
        b bVar = this.f154869l;
        return new i(view, bVar.f154901c, (com.avito.konveyor.adapter.a) bVar.f154900b.get());
    }
}
