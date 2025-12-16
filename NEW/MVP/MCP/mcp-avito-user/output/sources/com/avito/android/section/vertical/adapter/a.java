package com.avito.android.section.vertical.adapter;

import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SectionVerticalAdapterBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/section/vertical/adapter/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/section/vertical/adapter/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements p<ViewGroup, View, h> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f264934l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(2);
        this.f264934l = bVar;
    }

    @Override // Y41.p
    public final h invoke(ViewGroup viewGroup, View view) {
        View view2 = view;
        b bVar = this.f264934l;
        return new h(view2, (com.avito.konveyor.adapter.a) bVar.f264936b.get(), bVar.f264938d, bVar.f264937c, bVar.f264939e);
    }
}
