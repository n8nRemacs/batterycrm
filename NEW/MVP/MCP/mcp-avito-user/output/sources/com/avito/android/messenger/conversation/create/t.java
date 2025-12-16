package com.avito.android.messenger.conversation.create;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.X1;
import com.avito.android.messenger.conversation.create.CreateChannelPresenter;
import io.reactivex.rxjava3.internal.operators.observable.M;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CreateChannelView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/create/t;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final s f189622a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f189623b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f189624c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public CreateChannelPresenter.State f189625d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final X1 f189626e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.group.item.double_input.e f189627f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final M f189628g;

    /* compiled from: CreateChannelView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            t.this.f189626e.k(null);
        }
    }

    public t(@Y61.k s sVar, @Y61.k View view, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f189622a = sVar;
        this.f189623b = view;
        this.f189624c = view.getContext();
        X1 x12 = new X1((ViewGroup) view.findViewById(R.id.messenger_create_channel_screen), interfaceC28373a);
        this.f189626e = x12;
        this.f189627f = new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 12);
        this.f189628g = new M(x12.e().y(200L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(io.reactivex.rxjava3.android.schedulers.b.b()), new a());
    }
}
