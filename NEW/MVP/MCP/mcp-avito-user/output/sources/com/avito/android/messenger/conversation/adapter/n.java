package com.avito.android.messenger.conversation.adapter;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.bottom_navigation.ViewOnLongClickListenerC28892n;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessageViewClicksDelegate.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/n;", "Lcom/avito/android/messenger/conversation/adapter/m;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f189257b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public N f189258c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<Boolean> f189259d;

    public n(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.message);
        this.f189257b = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC31873b(this, 1));
        viewFindViewById.setOnLongClickListener(new ViewOnLongClickListenerC28892n(this, 3));
    }

    @Override // com.avito.android.messenger.conversation.adapter.m
    public final void KC(@Y61.k Y41.a<Boolean> aVar) {
        throw null;
    }

    @Override // com.avito.android.messenger.conversation.adapter.m
    public final void c(@Y61.k Y41.a<G0> aVar) {
        throw null;
    }
}
