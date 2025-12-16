package ru.mts.biometry.sdk.feature.passport.ui.intro;

import B91.G;
import Ba1.AbstractC13130h;
import H91.e;
import H91.f;
import H91.g;
import L91.q;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.d;
import com.avito.android.R;
import e11.ViewOnClickListenerC39879j1;
import g2.c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.mts.biometry.sdk.base.b;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/passport/ui/intro/a;", "Lru/mts/biometry/sdk/base/b;", "LB91/G;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class a extends b<G> {
    public a() {
        super((Object) null);
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return G.a(layoutInflater, viewGroup);
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void c5(int i12, int i13) throws Resources.NotFoundException {
        G g12 = (G) this.f436376g0;
        if (g12 != null) {
            g.a(i12, 0, 13, g12.f1040h);
            TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(H91.b.d(R.attr.sdkBioTextAppearanceFooter, requireContext()), new int[]{android.R.attr.layout_marginBottom});
            try {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, H91.c.a(24));
                typedArrayObtainStyledAttributes.recycle();
                View view = g12.f1041i;
                if (view.getVisibility() == 0) {
                    i13 += dimensionPixelOffset;
                } else {
                    view = g12.f1035c;
                }
                g.a(0, i13, 7, view);
                g.a(i12, 0, 13, g12.f1039g);
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final void d5(c cVar) {
        G g12 = (G) cVar;
        g12.f1040h.setOnCloseListener(new q(16));
        g12.f1037e.setImageDrawable(d.getDrawable(requireContext(), R.drawable.sdk_bio_passport_intro_main));
        Ca1.d.a(new q(15), g12.f1035c);
        Ca1.d.a(new ViewOnClickListenerC39879j1(this, 3), g12.f1036d);
        TextView textView = g12.f1041i;
        boolean z12 = textView.getText().length() > 0;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setVisibility(z12 ? 0 : 8);
        LinearLayout linearLayout = g12.f1034b;
        if (z12) {
            AbstractC13130h.b(linearLayout, H91.c.a(20), H91.c.a(20), H91.c.a(20), H91.c.a(10));
        } else {
            AbstractC13130h.a(linearLayout);
        }
    }

    @Override // ru.mts.biometry.sdk.base.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        e.a(this, !f.b(this));
    }
}
