package com.avito.android.lib.design.tooltip;

import KV.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.close_button.CloseButton;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TooltipContent.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "LLV/d;", "LKV/a$b;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o implements LV.d<a.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final TextView f181253b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final TextView f181254c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Button f181255d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ImageView f181256e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final CloseButton f181257f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f181258g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public a.b f181259h;

    /* compiled from: TooltipContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ImageGravity.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ImageGravity[] imageGravityArr = ImageGravity.f181186b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ImageGravity[] imageGravityArr2 = ImageGravity.f181186b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public o(@Y61.k View view) {
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.f181253b = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.body);
        this.f181254c = textView2;
        Button button = (Button) view.findViewById(R.id.button);
        this.f181255d = button;
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        this.f181256e = imageView;
        CloseButton closeButton = (CloseButton) view.findViewById(R.id.close_button);
        this.f181257f = closeButton;
        this.f181258g = (LinearLayout) view.findViewById(R.id.content_container);
        if (textView != null) {
            D6.w(textView);
        }
        if (textView2 != null) {
            D6.w(textView2);
        }
        if (button != null) {
            D6.w(button);
        }
        if (imageView != null) {
            D6.w(imageView);
        }
        if (closeButton != null) {
            D6.w(closeButton);
        }
    }

    public final void a(@e0 int i12) {
        TextView textView = this.f181254c;
        if (textView != null) {
            textView.setText(i12);
        }
        D6.G(textView, i12 != 0);
    }

    public final void b(@Y61.l CharSequence charSequence) {
        TextView textView = this.f181254c;
        if (textView != null) {
            I5.a(textView, charSequence, false);
        }
    }

    public final void c(@Y61.l View.OnClickListener onClickListener) {
        Button button = this.f181255d;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public final void d(@Y61.l CharSequence charSequence) {
        Button button = this.f181255d;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, charSequence, false);
        }
    }

    public final void e(@Y61.l View.OnClickListener onClickListener) {
        CloseButton closeButton = this.f181257f;
        if (closeButton != null) {
            closeButton.setOnClickListener(onClickListener);
        }
    }

    public final void f(boolean z12) {
        CloseButton closeButton = this.f181257f;
        if (closeButton != null) {
            D6.G(closeButton, z12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(@Y61.k KV.a.b r13) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.tooltip.o.g(KV.a$b):void");
    }

    public final void h(@e0 int i12) {
        TextView textView = this.f181253b;
        if (textView != null) {
            textView.setText(i12);
        }
        D6.G(textView, true);
    }

    public final void i(@Y61.l CharSequence charSequence) {
        TextView textView = this.f181253b;
        if (textView != null) {
            I5.a(textView, charSequence, false);
        }
    }
}
