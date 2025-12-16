package com.avito.android.publish.cpa_tariff;

import Kd0.e;
import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.text.j;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.toolbar.AppBarLayoutWithTextAction;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: CpaTariffView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/cpa_tariff/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CoordinatorLayout f232431a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AppBarLayoutWithTextAction f232432b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f232433c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Input f232434d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f232435e;

    /* compiled from: CpaTariffView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            Input input = c.this.f232433c;
            Input.f179303W.getClass();
            input.setState(Input.f179304a0);
            return G0.f406611a;
        }
    }

    /* compiled from: CpaTariffView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<String, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            Input input = c.this.f232434d;
            Input.f179303W.getClass();
            input.setState(Input.f179304a0);
            return G0.f406611a;
        }
    }

    public c(@k View view) {
        this.f232431a = (CoordinatorLayout) view.findViewById(R.id.cpa_tariff_root);
        AppBarLayoutWithTextAction appBarLayoutWithTextAction = (AppBarLayoutWithTextAction) view.findViewById(R.id.app_bar);
        this.f232432b = appBarLayoutWithTextAction;
        Input input = (Input) view.findViewById(R.id.input_name);
        this.f232433c = input;
        Input input2 = (Input) view.findViewById(R.id.input_phone);
        this.f232434d = input2;
        this.f232435e = (Button) view.findViewById(R.id.cpa_tariff_button);
        TextView textView = (TextView) view.findViewById(R.id.cpa_tariff_disclaimer);
        TextView textView2 = (TextView) view.findViewById(R.id.subtitle);
        Resources resources = view.getResources();
        n.c(input, new a());
        n.c(input2, new b());
        j.c(textView, new AttributedText(resources.getString(R.string.cpa_tariff_disclaimer_text), Collections.singletonList(new LinkAttribute(resources.getString(R.string.cpa_tariff_disclaimer_link_name), resources.getString(R.string.cpa_tariff_disclaimer_link_text), resources.getString(R.string.cpa_tariff_disclaimer_link_url), Collections.singletonList(FontParameter.UnderlineParameter.INSTANCE))), 1), null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        j.c(textView2, new AttributedText(resources.getString(R.string.cpa_tariff_description_text), Collections.singletonList(new LinkAttribute(resources.getString(R.string.cpa_tariff_description_link_name), resources.getString(R.string.cpa_tariff_description_link_text), resources.getString(R.string.cpa_tariff_description_link_url), null, 8, null)), 0, 4, null), null);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        CollapsingTitleAppBarLayout.m(appBarLayoutWithTextAction, R.drawable.ic_close_24);
        appBarLayoutWithTextAction.setTitle(appBarLayoutWithTextAction.getResources().getString(R.string.cpa_tariff_title));
        appBarLayoutWithTextAction.setShortTitle(appBarLayoutWithTextAction.getTitle());
    }

    public static void a(Input input, e eVar) {
        int[] iArr;
        Input.t(input, eVar.f9562a, true, 2);
        if (eVar.f9563b) {
            Input.f179303W.getClass();
            iArr = Input.f179304a0;
        } else {
            Input.f179303W.getClass();
            iArr = Input.f179305b0;
        }
        input.setState(iArr);
    }
}
