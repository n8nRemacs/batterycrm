package Qa;

import Au.ViewOnClickListenerC13080b;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_multi_items.param.MultiItemParamHeaderItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MultiItemParamHeaderView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQa/b;", "", "_avito_advert-multi-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qa.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14874b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TextView f13762a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f13763b;

    public C14874b(@k View view) {
        this.f13762a = (TextView) view.findViewById(R.id.title);
        this.f13763b = (TextView) view.findViewById(R.id.right_action_title);
    }

    public final void a(@k MultiItemParamHeaderItem multiItemParamHeaderItem, @k InterfaceC14873a interfaceC14873a) {
        this.f13762a.setText(multiItemParamHeaderItem.f85901b);
        String str = multiItemParamHeaderItem.f85902c;
        DeepLink deepLink = multiItemParamHeaderItem.f85903d;
        int i12 = (deepLink == null || str == null) ? 8 : 0;
        TextView textView = this.f13763b;
        textView.setVisibility(i12);
        if (deepLink != null) {
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            FV.a.f4720a.f(textView, R.attr.textIconChevronRight, y6.b(4));
            textView.setOnClickListener(new ViewOnClickListenerC13080b(16, interfaceC14873a, deepLink));
        }
    }
}
