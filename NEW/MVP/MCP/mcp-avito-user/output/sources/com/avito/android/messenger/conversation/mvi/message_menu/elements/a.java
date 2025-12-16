package com.avito.android.messenger.conversation.mvi.message_menu.elements;

import android.content.ClipData;
import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.C31665v;
import com.avito.android.messenger.conversation.mvi.message_menu.AbstractC32118b;
import com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a;
import com.avito.android.messenger.conversation.mvi.message_menu.d;
import com.avito.android.messenger.conversation.mvi.message_menu.l;
import com.avito.android.messenger.q0;
import com.avito.android.mvi.rx3.with_monolithic_state.C32890a;
import com.avito.android.mvi.rx3.with_monolithic_state.x;
import com.avito.android.remote.model.messenger.ActionConfirmation;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.C35809h6;
import com.avito.android.util.Q;
import com.avito.android.util.V2;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CopyToClipboardElementProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/a;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements InterfaceC32117a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Q f191622a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f191623b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC5662a f191624c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final q0 f191625d;

    /* compiled from: CopyToClipboardElementProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/a$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.message_menu.elements.a$a, reason: collision with other inner class name */
    public interface InterfaceC5662a {
        void g8(@Y61.k ClipData clipData);
    }

    /* compiled from: CopyToClipboardElementProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/elements/a$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/a;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/l$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends C32890a<l.a> {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.messenger.conversation.mvi.message_menu.d f191626d;

        public b(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
            super(null, null, 3, null);
            this.f191626d = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.avito.android.mvi.rx3.with_monolithic_state.C32890a
        public final void b(l.a aVar) {
            kotlin.Q q12;
            String string;
            com.avito.android.messenger.conversation.mvi.message_menu.d dVar = this.f191626d;
            if (dVar instanceof d.h) {
                d.h hVar = (d.h) dVar;
                boolean z12 = hVar.f191608d;
                String str = hVar.f191607c;
                q12 = z12 ? new kotlin.Q(str, Boolean.TRUE) : new kotlin.Q(str, Boolean.FALSE);
            } else if (dVar instanceof d.c) {
                q12 = new kotlin.Q(((d.c) dVar).f191578d, Boolean.TRUE);
            } else if (dVar instanceof d.C5661d) {
                q12 = new kotlin.Q(((d.C5661d) dVar).f191584c, Boolean.TRUE);
            } else if (dVar instanceof d.e) {
                q12 = new kotlin.Q(((d.e) dVar).f191590c, Boolean.TRUE);
            } else if (dVar instanceof d.b) {
                q12 = new kotlin.Q(((d.b) dVar).f191573e, Boolean.TRUE);
            } else if (dVar instanceof d.g) {
                q12 = new kotlin.Q(((d.g) dVar).f191601c, Boolean.TRUE);
            } else {
                if (!(dVar instanceof d.f ? true : dVar instanceof d.a ? true : dVar instanceof d.i ? true : dVar instanceof d.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                q12 = new kotlin.Q("", Boolean.TRUE);
            }
            String str2 = (String) q12.f406619b;
            boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
            if (C43066x.K(str2)) {
                V2.f318762a.i("CopyActionDescriptor", "Action was not performed, text is empty or blank", null);
                return;
            }
            boolean zF2 = L.f(dVar.getF191618b().f191746a.f430682d, dVar.getF191618b().f191749d);
            a aVar2 = a.this;
            if (zBooleanValue || zF2) {
                string = str2;
            } else {
                ArrayList<MessageBody.Text.Chunk> arrayListA = aVar2.f191625d.a(str2);
                StringBuilder sb2 = new StringBuilder();
                for (MessageBody.Text.Chunk chunk : arrayListA) {
                    if (chunk instanceof MessageBody.Text.Chunk.Plain) {
                        sb2.append(str2.substring(chunk.getStart(), chunk.getEnd() + 1));
                    } else if (chunk instanceof MessageBody.Text.Chunk.Link) {
                        String strSubstring = str2.substring(chunk.getStart(), chunk.getEnd() + 1);
                        String[] strArr = C35809h6.f318898a;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 3) {
                                strSubstring = AK.c.s(new StringBuilder(), strArr[0], strSubstring);
                                break;
                            }
                            String str3 = strArr[i12];
                            if (!C43066x.h0(strSubstring, str3, true)) {
                                i12++;
                            } else if (!strSubstring.startsWith(str3)) {
                                StringBuilder sbR = H.r(str3);
                                sbR.append(strSubstring.substring(str3.length()));
                                strSubstring = sbR.toString();
                            }
                        }
                        if (!C43066x.h0(strSubstring, "https://link.avito.ru/go?to=", false)) {
                            strSubstring = new Uri.Builder().scheme(Constants.SCHEME).authority("link.avito.ru").path("/go").appendQueryParameter(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, strSubstring).build().toString();
                        }
                        sb2.append(strSubstring);
                    }
                    sb2.append('\n');
                }
                string = C43066x.A0(sb2.toString()).toString();
            }
            aVar2.f191624c.g8(aVar2.f191622a.a(string));
            String str4 = dVar.getF191618b().f191750e;
            if (str4 != null) {
                aVar2.f191623b.c(new C31665v(dVar.getF191618b().f191747b, str4, str2, true ^ str2.equals(string)));
            }
        }
    }

    @Inject
    public a(@Y61.k Q q12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC5662a interfaceC5662a, @Y61.k q0 q0Var) {
        this.f191622a = q12;
        this.f191623b = interfaceC28373a;
        this.f191624c = interfaceC5662a;
        this.f191625d = q0Var;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.c
    @Y61.l
    public final AbstractC32118b a(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        if (dVar instanceof d.C5661d ? true : dVar instanceof d.e ? true : dVar instanceof d.c) {
            return new AbstractC32118b.a("copy", R.string.messenger_message_menu_copy_link, R.drawable.ic_messenger_link_menu_copy);
        }
        if (dVar instanceof d.g ? true : dVar instanceof d.h) {
            return new AbstractC32118b.a("copy", R.string.messenger_message_menu_copy, R.drawable.ic_messenger_link_menu_copy);
        }
        if (dVar instanceof d.f ? true : dVar instanceof d.a ? true : dVar instanceof d.i ? true : dVar instanceof d.b ? true : dVar instanceof d.j) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @Y61.l
    public final ActionConfirmation b() {
        return null;
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @Y61.k
    public final x<l.a> c(@Y61.k com.avito.android.messenger.conversation.mvi.message_menu.d dVar) {
        return new b(dVar);
    }

    @Override // com.avito.android.messenger.conversation.mvi.message_menu.InterfaceC32117a
    @Y61.k
    public final String d() {
        return "copy";
    }
}
