package KE;

import Au.ViewOnClickListenerC13080b;
import Fc1.G3;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.floating_buy_block.FloatingBuyBlockItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.floating_container.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FloatingBuyBlockView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LKE/a;", "", "a", "_avito_floating-buy-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final int f9368g;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final N f9369a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N f9370b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ViewGroup f9371c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FloatingContainer f9372d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Boolean f9373e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public FloatingBuyBlockItem f9374f;

    /* compiled from: FloatingBuyBlockView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKE/a$a;", "", "<init>", "()V", "", "SLIDE_ANIMATION_DURATION", "J", "", "SLIDE_ANIMATION_OFFSET", "I", "_avito_floating-buy-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: KE.a$a, reason: collision with other inner class name */
    public static final class C0562a {
        public /* synthetic */ C0562a(C42822w c42822w) {
            this();
        }

        public C0562a() {
        }
    }

    static {
        new C0562a(null);
        f9368g = y6.b(240);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k View view, @k Y41.l<? super DeepLink, G0> lVar, @k Y41.l<? super Boolean, G0> lVar2) {
        this.f9369a = (N) lVar;
        this.f9370b = (N) lVar2;
        ViewGroup viewGroup = (ViewGroup) view;
        this.f9371c = viewGroup;
        FloatingContainer floatingContainer = (FloatingContainer) C0.b(viewGroup, R.layout.floating_buy_block, viewGroup, false);
        this.f9372d = floatingContainer;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        viewGroup.addView(floatingContainer, layoutParams);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
    public final void a() {
        Boolean bool = this.f9373e;
        Boolean bool2 = Boolean.TRUE;
        if (L.f(bool, bool2) || this.f9374f == null) {
            return;
        }
        FloatingContainer floatingContainer = this.f9372d;
        D6.H(floatingContainer);
        this.f9370b.invoke(bool2);
        this.f9373e = bool2;
        floatingContainer.setTranslationY(y6.e(f9368g));
        A0 a0A = C22823h0.a(floatingContainer);
        a0A.g(0.0f);
        a0A.c(100L);
        a0A.h(new G3(this, 1));
        a0A.d(new LinearInterpolator());
        a0A.f();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    public final void b() {
        D6.w(this.f9372d);
        Boolean bool = Boolean.FALSE;
        this.f9373e = bool;
        this.f9370b.invoke(bool);
    }

    public final void c(@l FloatingBuyBlockItem floatingBuyBlockItem) {
        if (L.f(this.f9374f, floatingBuyBlockItem)) {
            return;
        }
        this.f9374f = floatingBuyBlockItem;
        if (floatingBuyBlockItem == null) {
            b();
            return;
        }
        Context context = this.f9371c.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setLayoutParams(new LinearLayout.LayoutParams(y6.b(36), y6.b(36)));
        simpleDraweeView.getHierarchy().s(RoundingParams.b(12.0f));
        simpleDraweeView.getHierarchy().n(s.c.f340137i);
        simpleDraweeView.setImageURI(floatingBuyBlockItem.f158439d);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.leftMargin = y6.b(6);
        layoutParams.rightMargin = y6.b(6);
        linearLayout2.setLayoutParams(layoutParams);
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
        aVar.setText(floatingBuyBlockItem.f158438c);
        aVar.setTextAppearance(C35835l0.j(R.attr.textS20, context));
        aVar.setTypeface(Typeface.DEFAULT_BOLD);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        aVar.setEllipsize(truncateAt);
        aVar.setMaxLines(1);
        com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(context, null, 0, 0, 14, null);
        aVar2.setText(floatingBuyBlockItem.f158437b);
        aVar2.setTextAppearance(C35835l0.j(R.attr.textS20, context));
        aVar2.setEllipsize(truncateAt);
        aVar2.setMaxLines(1);
        linearLayout2.addView(aVar);
        linearLayout2.addView(aVar2);
        Button button = new Button(context, null, 0, 0, 12, null);
        button.setPadding(y6.b(12), 0, y6.b(12), 0);
        button.setAppearanceFromAttr(R.attr.buttonPaySmall);
        button.setText("Купить");
        button.setOnClickListener(new ViewOnClickListenerC13080b(8, this, floatingBuyBlockItem));
        linearLayout.addView(simpleDraweeView);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(button);
        this.f9372d.setState(new com.avito.android.lib.design.floating_container.a(new a.AbstractC5270a.C5271a(linearLayout)));
    }
}
