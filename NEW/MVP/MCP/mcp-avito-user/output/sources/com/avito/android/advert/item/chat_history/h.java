package com.avito.android.advert.item.chat_history;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.remote.model.ChatHistory;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.InterfaceC35945t1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ChatHistoryView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/chat_history/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/chat_history/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f74260g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<Long> f74261b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f74262c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayoutCompat f74263d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f74264e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f74265f;

    /* compiled from: ChatHistoryView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74266a;

        static {
            int[] iArr = new int[ChatHistory.MessageType.values().length];
            try {
                iArr[ChatHistory.MessageType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatHistory.MessageType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatHistory.MessageType.FILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChatHistory.MessageType.LOCATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChatHistory.MessageType.ITEM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChatHistory.MessageType.LINK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChatHistory.MessageType.TEXT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f74266a = iArr;
        }
    }

    public h(@k View view, @k InterfaceC35945t1 interfaceC35945t1) {
        super(view);
        this.f74261b = interfaceC35945t1;
        View viewFindViewById = view.findViewById(R.id.advert_chat_history_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74262c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_chat_history_messages);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat");
        }
        this.f74263d = (LinearLayoutCompat) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.advert_chat_history_continue);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74264e = (TextView) viewFindViewById3;
        this.f74265f = LayoutInflater.from(view.getContext());
    }

    @Override // com.avito.android.advert.item.chat_history.g
    public final void FN(@k Y41.a<G0> aVar) {
        this.f74264e.setOnClickListener(new n(7, aVar));
    }

    @Override // com.avito.android.advert.item.chat_history.g
    public final void xQ(@k ChatHistory chatHistory) {
        LinearLayoutCompat linearLayoutCompat = this.f74263d;
        linearLayoutCompat.removeAllViews();
        I5.a(this.f74262c, chatHistory.getTitle(), false);
        for (ChatHistory.Message message : chatHistory.getMessages()) {
            ViewGroup viewGroup = (ViewGroup) this.f74265f.inflate(message.getIsSeller() ? R.layout.advert_details_chat_message_incoming : R.layout.advert_details_chat_message_outgoing, (ViewGroup) linearLayoutCompat, false);
            View viewFindViewById = viewGroup.findViewById(R.id.advert_chat_message_text);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            I5.a((TextView) viewFindViewById, message.getText(), false);
            View viewFindViewById2 = viewGroup.findViewById(R.id.advert_chat_message_time);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            I5.a((TextView) viewFindViewById2, this.f74261b.a(Long.valueOf(message.getTimestamp())), false);
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.advert_chat_message_status);
            if (imageView != null) {
                imageView.setImageResource(L.f(message.getIsRead(), Boolean.TRUE) ? R.drawable.ic_msg_read_16 : R.drawable.ic_msg_delivered_16);
            }
            View viewFindViewById3 = viewGroup.findViewById(R.id.advert_chat_message_type);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ImageView imageView2 = (ImageView) viewFindViewById3;
            D6.G(imageView2, message.getType() != ChatHistory.MessageType.TEXT);
            ChatHistory.MessageType type = message.getType();
            switch (type == null ? -1 : a.f74266a[type.ordinal()]) {
                case -1:
                case 4:
                case 5:
                case 6:
                    imageView2.setImageResource(R.drawable.ic_link);
                    break;
                case 1:
                case 2:
                case 3:
                    imageView2.setImageResource(C35835l0.j(R.attr.ic_image20, viewGroup.getContext()));
                    break;
            }
            linearLayoutCompat.addView(viewGroup);
        }
    }
}
