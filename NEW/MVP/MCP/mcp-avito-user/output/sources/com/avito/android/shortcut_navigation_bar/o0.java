package com.avito.android.shortcut_navigation_bar;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ShortcutUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/ViewTreeObserver;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/ViewTreeObserver;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class o0 extends kotlin.jvm.internal.N implements Y41.l<ViewTreeObserver, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View f283444l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f283445m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(Y41.a aVar, View view) {
        super(1);
        this.f283444l = view;
        this.f283445m = (kotlin.jvm.internal.N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnWindowFocusChangeListener(new n0(this.f283445m, this.f283444l));
        return G0.f406611a;
    }
}
