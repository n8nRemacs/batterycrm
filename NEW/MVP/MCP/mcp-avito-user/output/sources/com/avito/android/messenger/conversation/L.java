package com.avito.android.messenger.conversation;

import NY.m;
import VU.b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.messenger.conversation.mvi.messages.g0;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import com.avito.android.messenger.conversation.mvi.messages.q0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.messenger.context.ChatReplyTime;
import com.avito.android.remote.model.messenger.context.Placeholder;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.X2;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: ChannelFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$c;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/messages/g0$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class L<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFragment f189110b;

    public L(ChannelFragment channelFragment) {
        this.f189110b = channelFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.avito.android.messenger.conversation.T1] */
    @Override // l41.g
    public final void accept(Object obj) {
        ChannelFragment channelFragment;
        com.avito.android.messenger.conversation.mvi.voice.Q q12;
        g0.a aVar;
        List<T1> list;
        g0.a.c cVar;
        g0.a.c.InterfaceC5705a interfaceC5705a;
        final DeepLink noMatchLink;
        g0.c cVar2 = (g0.c) obj;
        ChannelFragment channelFragment2 = this.f189110b;
        com.avito.android.messenger.conversation.mvi.messages.q0 q0Var = channelFragment2.f189001o1;
        com.avito.android.messenger.conversation.mvi.messages.q0 q0Var2 = q0Var == null ? null : q0Var;
        K k12 = new K(1, channelFragment2, ChannelFragment.class, "onMessageListViewAction", "onMessageListViewAction(Lcom/avito/android/messenger/conversation/mvi/messages/MessageListViewAction;)V", 0);
        q0Var2.getClass();
        com.avito.android.messenger.conversation.mvi.messages.v0 v0Var = q0Var2.f193103K;
        g0.c cVar3 = v0Var.f193646b;
        final com.avito.android.messenger.conversation.mvi.messages.q0 q0Var3 = v0Var.f193647c;
        q0Var3.f193102J = k12;
        g0.a aVar2 = cVar2.f192970b;
        boolean z12 = aVar2 instanceof g0.a.AbstractC5703a;
        ViewGroup viewGroup = q0Var3.f193122t;
        ViewGroup viewGroup2 = q0Var3.f193119q;
        if (z12) {
            g0.a.AbstractC5703a abstractC5703a = (g0.a.AbstractC5703a) aVar2;
            if (kotlin.jvm.internal.L.f(abstractC5703a, g0.a.AbstractC5703a.C5704a.f192957b)) {
                D6.w(viewGroup2);
                D6.w(viewGroup);
            } else if (abstractC5703a instanceof g0.a.AbstractC5703a.b) {
                NY.c cVar4 = ((g0.a.AbstractC5703a.b) aVar2).f192958b;
                NY.m mVar = cVar4.f11543c;
                Button button = q0Var3.f193124v;
                TextView textView = q0Var3.f193123u;
                if (mVar != null) {
                    m.a aVar3 = mVar.f11585a;
                    com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(new Image(aVar3.f11588a));
                    SimpleDraweeView simpleDraweeView = q0Var3.f193125w;
                    ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
                    Size size = aVar3.f11589b;
                    channelFragment = channelFragment2;
                    layoutParams.width = y6.b(size.getWidth());
                    simpleDraweeView.getLayoutParams().height = y6.b(size.getHeight());
                    C35949t5.c(simpleDraweeView, aVarB, null, null, null, 14);
                    q0Var3.f193126x.getLayoutParams().height = y6.b(10);
                    q0Var3.f193127y.getLayoutParams().height = y6.b(6);
                    com.avito.android.util.text.j.a(textView, mVar.f11586b, null);
                    Placeholder.Button button2 = mVar.f11587c;
                    if (button2 != null) {
                        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(button.getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, button2.getTheme()));
                        b.a aVar4 = VU.b.f17147t;
                        String style = button2.getStyle();
                        aVar4.getClass();
                        VU.b bVarB = b.a.b(dVar, style);
                        CharSequence charSequenceD = q0Var3.f193112j.d(button2.getTitle());
                        if (charSequenceD == null) {
                            charSequenceD = "";
                        }
                        String onTapDeepLink = button2.getOnTapDeepLink();
                        if (onTapDeepLink == null || (noMatchLink = q0Var3.f193111i.b(onTapDeepLink)) == null) {
                            noMatchLink = new NoMatchLink();
                        }
                        button.setStyle(bVarB);
                        button.setText(charSequenceD);
                        button.setPadding(y6.b(20), 0, y6.b(20), 0);
                        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.messenger.conversation.mvi.messages.i0
                            /* JADX WARN: Type inference failed for: r3v2, types: [Y41.l, java.lang.Object] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                q0Var3.f193102J.invoke(new h0.d(noMatchLink));
                            }
                        });
                    }
                    D6.H(viewGroup);
                    D6.w(viewGroup2);
                } else {
                    channelFragment = channelFragment2;
                    boolean z13 = cVar4.f11542b;
                    ChatReplyTime chatReplyTime = cVar4.f11541a;
                    if (z13 && chatReplyTime.getActionType() == ChatReplyTime.ActionType.CALL) {
                        textView.setText(chatReplyTime.getText());
                        button.setOnClickListener(new ViewOnClickListenerC31873b(q0Var3, 3));
                        D6.H(viewGroup);
                        D6.w(viewGroup2);
                    } else {
                        q0Var3.f193121s.setText(chatReplyTime.getText());
                        int i12 = q0.a.f193129a[chatReplyTime.getActionType().ordinal()];
                        ImageView imageView = q0Var3.f193120r;
                        if (i12 == 1) {
                            imageView.setImageResource(C35835l0.j(R.attr.img_longAnswerTime, imageView.getContext()));
                        } else if (i12 == 2) {
                            imageView.setImageResource(C35835l0.j(R.attr.img_fastAnswerTime, imageView.getContext()));
                        }
                        D6.w(viewGroup);
                        D6.H(viewGroup2);
                    }
                }
            }
            channelFragment = channelFragment2;
        } else {
            channelFragment = channelFragment2;
            D6.w(viewGroup2);
            D6.w(viewGroup);
        }
        boolean z14 = z12 ? true : aVar2 instanceof g0.a.c;
        X1 x12 = q0Var3.f193114l;
        if (z14) {
            x12.j();
            q12 = null;
        } else if (aVar2 instanceof g0.a.d) {
            q12 = null;
            x12.k(null);
        } else {
            q12 = null;
            if (!(aVar2 instanceof g0.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            x12.a("");
        }
        kotlin.G0 g02 = kotlin.G0.f406611a;
        q0Var3.f193115m.setValue(cVar2);
        if (aVar2 instanceof g0.a.c) {
            boolean z15 = q0Var3.f193100H;
            com.jakewharton.rxrelay3.b bVar = q0Var3.f193097E;
            com.avito.android.messenger.conversation.mvi.messages.utils.d dVar2 = q0Var3.f193108f;
            if (z15 || (interfaceC5705a = (cVar = (g0.a.c) aVar2).f192960b) == null) {
                g0.a.c cVar5 = (g0.a.c) aVar2;
                g0.a.c.InterfaceC5705a.b bVar2 = cVar5.f192962d;
                if (bVar2 != null) {
                    q0Var3.c(bVar2.f192964a);
                    g0.a.c.InterfaceC5705a.b bVar3 = cVar5.f192962d;
                    if (bVar3 != null) {
                        dVar2.b(bVar3.f192965b);
                    }
                    bVar.accept(kotlin.G0.f406611a);
                }
            } else {
                if (!cVar.f192961c && interfaceC5705a.getF192964a() >= 0) {
                    g0.a.c.InterfaceC5705a interfaceC5705a2 = cVar.f192960b;
                    q0Var3.c(interfaceC5705a2.getF192964a());
                    if (interfaceC5705a2 instanceof g0.a.c.InterfaceC5705a.b) {
                        dVar2.b(((g0.a.c.InterfaceC5705a.b) interfaceC5705a2).f192965b);
                    }
                    bVar.accept(kotlin.G0.f406611a);
                }
                q0Var3.f193096D.accept(kotlin.G0.f406611a);
                q0Var3.f193100H = true;
            }
        }
        q0Var3.f193101I = cVar2.f192971c;
        k12.invoke(new h0.n((cVar3 == null || (aVar = cVar3.f192970b) == null || (list = aVar.f192956a) == null) ? q12 : (T1) C42745f0.G(list), (T1) C42745f0.G(aVar2.f192956a)));
        v0Var.f193646b = cVar2;
        ChannelFragment channelFragment3 = channelFragment;
        io.reactivex.rxjava3.disposables.c cVar6 = channelFragment3.f188984f3;
        if (cVar6.g() == 0) {
            com.avito.android.messenger.conversation.mvi.voice.Q q13 = channelFragment3.f188954R0;
            if (q13 != null) {
                q12 = q13;
            }
            cVar6.b(q12.M0().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new C32368z1(channelFragment3)));
        }
        X2.f318778a.g("ChannelFragment", "Rendered " + cVar2);
    }
}
