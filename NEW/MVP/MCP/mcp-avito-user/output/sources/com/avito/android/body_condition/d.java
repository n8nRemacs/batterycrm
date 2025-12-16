package com.avito.android.body_condition;

import Mj.InterfaceC14496a;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CarBodyConditionBlueprint.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/body_condition/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/body_condition/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements p<ViewGroup, View, i> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14496a f106809l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC14496a interfaceC14496a) {
        super(2);
        this.f106809l = interfaceC14496a;
    }

    @Override // Y41.p
    public final i invoke(ViewGroup viewGroup, View view) {
        return new i(view, this.f106809l);
    }
}
