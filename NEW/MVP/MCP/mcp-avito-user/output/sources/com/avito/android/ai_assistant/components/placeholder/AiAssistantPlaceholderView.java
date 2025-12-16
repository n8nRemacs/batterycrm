package com.avito.android.ai_assistant.components.placeholder;

import A91.p;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.res.i;
import com.avito.android.R;
import com.avito.android.ai_assistant.components.placeholder.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.button.b;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.util.darkTheme.c;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AiAssistantPlaceholderView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/ai_assistant/components/placeholder/AiAssistantPlaceholderView;", "Landroid/widget/FrameLayout;", "Lcom/avito/android/ai_assistant/components/placeholder/a;", VoiceInfo.STATE, "Lkotlin/G0;", "setState", "(Lcom/avito/android/ai_assistant/components/placeholder/a;)V", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AiAssistantPlaceholderView extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f88924h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Spinner f88925b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f88926c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f88927d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f88928e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f88929f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f88930g;

    @j
    public AiAssistantPlaceholderView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setState(@k a state) {
        a.C2623a c2623a = a.C2623a.f88931a;
        setVisibility(!state.equals(c2623a) ? 0 : 8);
        boolean z12 = state instanceof a.c;
        LinearLayout linearLayout = this.f88930g;
        Spinner spinner = this.f88925b;
        if (!z12) {
            if (!state.equals(a.b.f88932a)) {
                state.equals(c2623a);
                return;
            } else {
                D6.w(linearLayout);
                D6.H(spinner);
                return;
            }
        }
        a.c cVar = (a.c) state;
        I5.a(this.f88927d, cVar.f88933a.k0(getContext()), false);
        a.c.b bVar = cVar.f88934b;
        boolean z13 = bVar instanceof a.c.b.C2627b;
        TextView textView = this.f88928e;
        if (z13) {
            I5.a(textView, ((a.c.b.C2627b) bVar).f88940a.k0(getContext()), false);
        } else if (bVar instanceof a.c.b.C2626a) {
            com.avito.android.util.text.j.a(textView, ((a.c.b.C2626a) bVar).f88939a, null);
        }
        PrintableText printableText = cVar.f88936d;
        String strK0 = printableText != null ? printableText.k0(getContext()) : null;
        Button button = this.f88929f;
        b.a(button, strK0, false);
        button.setOnClickListener(new p(cVar, 5));
        a.c.InterfaceC2624a interfaceC2624a = cVar.f88935c;
        boolean z14 = interfaceC2624a instanceof a.c.InterfaceC2624a.b;
        ImageView imageView = this.f88926c;
        if (z14) {
            com.avito.android.image_loader.glide.utils.b.d(imageView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(((a.c.InterfaceC2624a.b) interfaceC2624a).f88938a, c.b(getContext()))));
        } else if (interfaceC2624a instanceof a.c.InterfaceC2624a.C2625a) {
            Resources resources = getResources();
            Resources.Theme theme = getContext().getTheme();
            ThreadLocal<TypedValue> threadLocal = i.f44673a;
            imageView.setImageDrawable(resources.getDrawable(R.drawable.ai_assistant_chat_list_img, theme));
        }
        boolean z15 = interfaceC2624a != null;
        D6.w(spinner);
        D6.H(linearLayout);
        imageView.setVisibility(z15 ? 0 : 8);
    }

    public AiAssistantPlaceholderView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        View.inflate(context, R.layout.ai_assistant_placeholder, this);
        this.f88925b = (Spinner) findViewById(R.id.buyer_assistant_placeholder_spinner);
        this.f88926c = (ImageView) findViewById(R.id.buyer_assistant_placeholder_image);
        this.f88927d = (TextView) findViewById(R.id.buyer_assistant_placeholder_title);
        this.f88928e = (TextView) findViewById(R.id.buyer_assistant_placeholder_subtitle);
        this.f88929f = (Button) findViewById(R.id.buyer_assistant_placeholder_button);
        this.f88930g = (LinearLayout) findViewById(R.id.buyer_assistant_placeholder_content);
    }
}
