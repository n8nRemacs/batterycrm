package com.avito.android.user_advert.advert.items.multi_urgency;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.selector_card.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MultiUrgencyTypeBinder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multi_urgency/k;", "Lcom/avito/android/lib/design/selector_card/f;", "<init>", "()V", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements com.avito.android.lib.design.selector_card.f {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f309661d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public View f309662a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public TextView f309663b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public TextView f309664c;

    /* compiled from: MultiUrgencyTypeBinder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multi_urgency/k$a;", "Lcom/avito/android/lib/design/selector_card/g;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.lib.design.selector_card.g {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.lib.design.selector_card.g
        @Y61.k
        public final com.avito.android.lib.design.selector_card.f create() {
            return new k();
        }

        public a() {
        }
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void a(@Y61.k View view) {
        this.f309662a = view;
        this.f309663b = (TextView) view.findViewById(R.id.multi_urgency_item_title);
        this.f309664c = (TextView) view.findViewById(R.id.multi_urgency_item_subtitle);
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void b(@Y61.k r rVar) {
        if (rVar instanceof l) {
            View view = this.f309662a;
            if (view != null) {
                view.setEnabled(((l) rVar).f309669f);
                l lVar = (l) rVar;
                view.setSelected(lVar.f309668e);
                view.setTag(Long.valueOf(lVar.f309665b));
            }
            TextView textView = this.f309663b;
            if (textView != null) {
                textView.setEnabled(((l) rVar).f309669f);
                com.avito.android.util.text.j.a(textView, ((l) rVar).f309666c, null);
            }
            TextView textView2 = this.f309664c;
            if (textView2 != null) {
                textView2.setEnabled(((l) rVar).f309669f);
                com.avito.android.util.text.j.a(textView2, ((l) rVar).f309667d, null);
            }
        }
    }
}
