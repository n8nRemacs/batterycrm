package com.avito.android.beduin.common.component.selector_card_group;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22829k0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.sequences.C43033p;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: BeduinSelectorCardGroupView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/sequences/m;", "invoke", "(Landroid/view/View;)Lkotlin/sequences/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class r extends N implements Y41.l<View, InterfaceC43030m<? extends View>> {

    /* renamed from: l, reason: collision with root package name */
    public static final r f102569l = new r();

    public r() {
        super(1);
    }

    @Override // Y41.l
    public final InterfaceC43030m<? extends View> invoke(View view) {
        View view2 = view;
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        C22829k0 c22829k0 = viewGroup != null ? new C22829k0(viewGroup) : null;
        return c22829k0 == null ? C43033p.h() : c22829k0;
    }
}
