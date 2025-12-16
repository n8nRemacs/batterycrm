package com.avito.android.messenger.widget.chat_list_element;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SupportChatElement.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/widget/chat_list_element/e;", "Lcom/avito/android/messenger/widget/chat_list_element/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f197509a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f197510b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f197511c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f197512d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f197513e;

    public e(@k View view) {
        View viewFindViewById = view.findViewById(R.id.messenger_support_chat_item_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f197509a = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.messenger_support_chat_item_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f197510b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.messenger_support_chat_item_message);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f197511c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.messenger_support_chat_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f197512d = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.messenger_support_chat_new_message_indicator);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f197513e = (ImageView) viewFindViewById5;
    }

    public final void a(boolean z12) {
        ImageView imageView = this.f197513e;
        TextView textView = this.f197511c;
        if (z12) {
            textView.setText(textView.getContext().getString(R.string.messenger_support_chat_message_happy_to_help));
            D6.w(imageView);
        } else {
            textView.setText(textView.getContext().getString(R.string.messenger_support_chat_message_new_msg));
            D6.H(imageView);
        }
    }
}
