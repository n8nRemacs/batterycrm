package wc0;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImageBottomMenu.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwc0/e;", "Lwc0/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wc0.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49600e implements InterfaceC49598c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f441681a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<yc0.k, G0> f441682b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f441683c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f441684d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public TextView f441685e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public TextView f441686f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public ImageView f441687g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public AlignmentFrameLayout f441688h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Object f441689i = new Object();

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public AttributedText f441690j;

    /* JADX WARN: Multi-variable type inference failed */
    public C49600e(@Y61.k Context context, @Y61.k Y41.l<? super yc0.k, G0> lVar, @Y61.k Y41.l<? super DeepLink, G0> lVar2) {
        this.f441681a = context;
        this.f441682b = lVar;
        this.f441683c = lVar2;
    }

    public final void a(AttributedText attributedText, String str, boolean z12) {
        Spinner spinner;
        AlignmentFrameLayout alignmentFrameLayout;
        Spinner spinner2;
        AlignmentFrameLayout alignmentFrameLayout2;
        TextView textView = this.f441685e;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(this, 24));
        }
        TextView textView2 = this.f441686f;
        if (textView2 != null) {
            com.avito.android.util.text.j.a(textView2, attributedText, null);
        }
        this.f441690j = attributedText;
        Object obj = this.f441689i;
        if (!z12) {
            D6.H(this.f441687g);
            AlignmentFrameLayout alignmentFrameLayout3 = this.f441688h;
            if (alignmentFrameLayout3 == null || (spinner = (Spinner) alignmentFrameLayout3.findViewWithTag(obj)) == null || (alignmentFrameLayout = this.f441688h) == null) {
                return;
            }
            alignmentFrameLayout.removeView(spinner);
            return;
        }
        D6.w(this.f441687g);
        AlignmentFrameLayout alignmentFrameLayout4 = this.f441688h;
        if (alignmentFrameLayout4 != null && (spinner2 = (Spinner) alignmentFrameLayout4.findViewWithTag(obj)) != null && (alignmentFrameLayout2 = this.f441688h) != null) {
            alignmentFrameLayout2.removeView(spinner2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 19;
        Spinner spinner3 = new Spinner(this.f441681a);
        spinner3.setLayoutParams(layoutParams);
        spinner3.setTag(obj);
        spinner3.setAppearance(R.style.Design_Widget_Spinner_Dark_Medium);
        AlignmentFrameLayout alignmentFrameLayout5 = this.f441688h;
        if (alignmentFrameLayout5 != null) {
            alignmentFrameLayout5.addView(spinner3);
        }
    }
}
