package com.avito.android.ai_assistant.screens.chat;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContentOverlay.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/screens/chat/v;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f89557a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f89558b;

    /* renamed from: c, reason: collision with root package name */
    public final View f89559c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f89560d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f89561e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f89562f;

    /* renamed from: g, reason: collision with root package name */
    public final Button f89563g;

    /* renamed from: h, reason: collision with root package name */
    public final Spinner f89564h;

    /* renamed from: i, reason: collision with root package name */
    public final Resources f89565i;

    /* renamed from: j, reason: collision with root package name */
    public final Resources.Theme f89566j;

    public v(@Y61.k ViewGroup viewGroup, @Y61.k com.avito.android.util.text.a aVar) throws Resources.NotFoundException {
        this.f89557a = aVar;
        this.f89558b = (RecyclerView) viewGroup.findViewById(R.id.recycler);
        this.f89559c = viewGroup.findViewById(R.id.error_layout);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.error_icon);
        this.f89560d = imageView;
        TextView textView = (TextView) viewGroup.findViewById(R.id.error_title);
        textView.setGravity(1);
        this.f89561e = textView;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.error_subtitle);
        this.f89562f = textView2;
        Button button = (Button) viewGroup.findViewById(R.id.retry_button);
        this.f89563g = button;
        this.f89564h = (Spinner) viewGroup.findViewById(R.id.progress_spinner);
        this.f89565i = viewGroup.getResources();
        this.f89566j = viewGroup.getContext().getTheme();
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.ai_assistant_horizontal_offset);
        D6.f(textView2, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
        button.setAppearanceFromAttr(R.attr.buttonSecondaryMedium);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = y6.b(200);
        layoutParams.width = y6.b(200);
        imageView.setLayoutParams(layoutParams);
        textView.setTextAppearance(C35835l0.j(R.attr.textH3, viewGroup.getContext()));
        D6.c(textView2, null, Integer.valueOf(y6.b(2)), null, null, 13);
        D6.c(imageView, null, null, null, Integer.valueOf(y6.b(4)), 7);
    }
}
