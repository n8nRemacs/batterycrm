package ru.mts.biometry.sdk.feature.recognition.ui.intro;

import B91.G;
import Ba1.AbstractC13130h;
import Ba1.k;
import H91.g;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.view.C22981N;
import com.avito.android.R;
import e11.ViewOnClickListenerC39879j1;
import g2.c;
import ja1.d;
import ja1.f;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import ru.mts.biometry.sdk.base.b;

@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/mts/biometry/sdk/feature/recognition/ui/intro/e;", "Lru/mts/biometry/sdk/base/b;", "LB91/G;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class e extends b<G> {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ n[] f436502i0 = {m0.f406844a.i(new h0(e.class, "viewModel", "getViewModel()Lru/mts/biometry/sdk/feature/recognition/ui/intro/RecognitionPageIntroViewModel;", 0))};

    /* renamed from: h0, reason: collision with root package name */
    public final k f436503h0;

    public e() {
        super(0);
        this.f436503h0 = new k(f.class, new d(this));
    }

    @Override // ru.mts.biometry.sdk.base.b
    public final c b5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return G.a(layoutInflater, null);
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
        C43259k.d(C22981N.a(getLifecycle()), null, null, new ja1.c(this, null), 3);
        g12.f1040h.setOnCloseListener(new ViewOnClickListenerC39879j1(this, 14));
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
}
