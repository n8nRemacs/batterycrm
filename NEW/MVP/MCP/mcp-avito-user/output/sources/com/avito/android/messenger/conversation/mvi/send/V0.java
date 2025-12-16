package com.avito.android.messenger.conversation.mvi.send;

import android.view.View;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import kotlin.Metadata;

/* compiled from: SendMessageView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class V0 extends kotlin.jvm.internal.N implements Y41.l<View, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q0 f194457l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AttachMenuItem.File f194458m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(Q0 q02, AttachMenuItem.File file) {
        super(1);
        this.f194457l = q02;
        this.f194458m = file;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(View view) {
        this.f194457l.f194351D.accept(this.f194458m);
        return kotlin.G0.f406611a;
    }
}
