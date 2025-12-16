package com.avito.android.messenger.conversation.mvi.menu;

import android.widget.TextView;
import com.avito.android.messenger.conversation.mvi.menu.t;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChannelMenuView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/G0;", "invoke", "(Landroid/widget/TextView;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class w extends N implements Y41.l<TextView, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t.d.b f191548l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t.d.b bVar) {
        super(1);
        this.f191548l = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(TextView textView) {
        textView.setText(this.f191548l.f191519b);
        return G0.f406611a;
    }
}
