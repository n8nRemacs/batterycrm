package Ff;

import Ba.ViewOnClickListenerC13121a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FullScreenErrorView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LFf/b;", "Lcom/avito/konveyor/adapter/b;", "LFf/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends com.avito.konveyor.adapter.b implements InterfaceC13798a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f5943g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f5944b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f5945c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f5946d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f5947e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f5948f;

    public b(@k View view) {
        super(view);
        this.f5944b = (TextView) this.itemView.findViewById(R.id.autoteka_full_screen_text);
        this.f5945c = (TextView) this.itemView.findViewById(R.id.autoteka_full_screen_title);
        this.f5946d = (Button) this.itemView.findViewById(R.id.autoteka_full_screen_update);
        this.f5947e = (ImageView) this.itemView.findViewById(R.id.autoteka_full_screen_image);
        this.f5948f = view.getContext();
    }

    @Override // Ff.InterfaceC13798a
    public final void L1() {
        D6.w(this.f5946d);
    }

    @Override // Ff.InterfaceC13798a
    public final void Y2(@k PrintableText printableText) {
        this.f5944b.setText(printableText.k0(this.f5948f));
    }

    @Override // Ff.InterfaceC13798a
    public final void Zh(@l Integer num) {
        ImageView imageView = this.f5947e;
        if (num == null) {
            D6.w(imageView);
        } else {
            imageView.setImageResource(num.intValue());
            D6.H(imageView);
        }
    }

    @Override // Ff.InterfaceC13798a
    public final void l4(@k PrintableText printableText, @k Y41.a<G0> aVar) {
        String strK0 = printableText.k0(this.f5948f);
        Button button = this.f5946d;
        button.setText(strK0);
        button.setOnClickListener(new ViewOnClickListenerC13121a(1, aVar));
        D6.H(button);
    }

    @Override // Ff.InterfaceC13798a
    public final void p1(@l PrintableText printableText) {
        TextView textView = this.f5945c;
        if (printableText == null) {
            D6.w(textView);
        } else {
            textView.setText(printableText.k0(this.f5948f));
            D6.H(textView);
        }
    }
}
