package com.avito.android.messenger.conversation.mvi.send;

import android.view.View;
import kotlin.Metadata;

/* compiled from: SendMessageView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class Z0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.tooltip.k f194472b;

    public Z0(com.avito.android.lib.design.tooltip.k kVar) {
        this.f194472b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f194472b.dismiss();
    }
}
