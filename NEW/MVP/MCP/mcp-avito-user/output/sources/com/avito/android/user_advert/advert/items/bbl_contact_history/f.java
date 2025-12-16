package com.avito.android.user_advert.advert.items.bbl_contact_history;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.button.Button;
import com.avito.android.user_advert.advert.items.bbl_contact_history.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;

/* compiled from: BblContactHistoryItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/bbl_contact_history/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/bbl_contact_history/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f309289g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinearLayout f309290b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f309291c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f309292d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f309293e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f309294f;

    /* compiled from: BblContactHistoryItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements w, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f309295b;

        public a(l lVar) {
            this.f309295b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof w) && (obj instanceof D)) {
                return L.f(this.f309295b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f309295b;
        }

        public final int hashCode() {
            return this.f309295b.hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f309295b.invoke(deepLink);
        }
    }

    public f(@k View view) {
        super(view);
        this.f309290b = (LinearLayout) view.findViewById(R.id.bbl_contact_history_container);
        this.f309291c = (TextView) view.findViewById(R.id.bbl_contact_history_title);
        TextView textView = (TextView) view.findViewById(R.id.bbl_contact_history_about_icon);
        FV.a aVar = FV.a.f4720a;
        Context context = view.getContext();
        aVar.getClass();
        textView.setText(FV.a.b(R.attr.textIconQuestionOutline, context));
        this.f309292d = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.bbl_contact_history_history);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        this.f309293e = textView2;
        this.f309294f = (Button) view.findViewById(R.id.bbl_contact_history_contacts_button);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f309292d.setOnClickListener(null);
        this.f309294f.setOnClickListener(null);
    }

    @Override // com.avito.android.user_advert.advert.items.bbl_contact_history.d
    public final void uO(@k l lVar, @k com.avito.android.user_advert.advert.items.bbl_contact_history.a aVar) {
        SpannableStringBuilder spannableStringBuilder;
        String str;
        LinearLayout linearLayout = this.f309290b;
        linearLayout.setBackgroundTintList(ColorStateList.valueOf(C35835l0.d(aVar.f309277f, linearLayout.getContext())));
        I5.a(this.f309291c, aVar.f309274c.f309280a, false);
        this.f309292d.setOnClickListener(new e(lVar, aVar));
        a.b bVar = aVar.f309275d;
        if (bVar == null || (str = bVar.f309280a) == null) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(new OK0.b(bVar.f309281b, new a(lVar), false), 0, str.length(), 33);
            spannableStringBuilder.setSpan(new UnderlineSpan(), 0, str.length(), 33);
        }
        I5.a(this.f309293e, spannableStringBuilder, false);
        a.C9483a c9483a = aVar.f309276e;
        String str2 = c9483a != null ? c9483a.f309278a : null;
        Button button = this.f309294f;
        com.avito.android.lib.design.button.b.a(button, str2, false);
        button.setOnClickListener(new e(aVar, lVar));
    }
}
