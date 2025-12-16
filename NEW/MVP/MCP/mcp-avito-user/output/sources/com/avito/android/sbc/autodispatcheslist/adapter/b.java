package com.avito.android.sbc.autodispatcheslist.adapter;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SbcAutoDispatchAdvertItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/b;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f259033a;

    /* renamed from: b, reason: collision with root package name */
    public final SimpleDraweeView f259034b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f259035c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f259036d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f259037e;

    public b(@Y61.k View view) {
        this.f259033a = view;
        this.f259034b = (SimpleDraweeView) view.findViewById(R.id.sbc_auto_dispatches_item_image);
        this.f259035c = (TextView) view.findViewById(R.id.sbc_auto_dispatches_item_title);
        this.f259036d = (TextView) view.findViewById(R.id.sbc_auto_dispatches_item_price);
        this.f259037e = (TextView) view.findViewById(R.id.sbc_auto_dispatches_item_status_result);
    }

    public final void a(@Y61.k a aVar) {
        String str = aVar.f259029b;
        TextView textView = this.f259035c;
        textView.setText(str);
        String str2 = aVar.f259030c;
        TextView textView2 = this.f259036d;
        textView2.setText(str2);
        SimpleDraweeView simpleDraweeView = this.f259034b;
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(Uri.parse(aVar.f259028a));
        aVarA.c();
        View view = this.f259033a;
        if (aVar.f259031d) {
            textView.setTextColor(C35835l0.d(R.attr.black, view.getContext()));
            textView2.setTextColor(C35835l0.d(R.attr.warmGray54, view.getContext()));
            simpleDraweeView.setAlpha(1.0f);
            return;
        }
        textView.setTextColor(C35835l0.d(R.attr.gray36, view.getContext()));
        textView2.setTextColor(C35835l0.d(R.attr.gray36, view.getContext()));
        simpleDraweeView.setAlpha(0.5f);
        TextView textView3 = this.f259037e;
        String str3 = aVar.f259032e;
        if (str3 == null) {
            D6.w(textView3);
        } else {
            D6.H(textView3);
            textView3.setText(str3);
        }
    }
}
