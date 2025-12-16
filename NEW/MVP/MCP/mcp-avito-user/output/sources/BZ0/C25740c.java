package bz0;

import Ba.ViewOnClickListenerC13121a;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bz0.InterfaceC25739b;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.f;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OrderItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lbz0/c;", "Lbz0/b;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25740c extends com.avito.konveyor.adapter.b implements InterfaceC25739b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f57593k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f57594b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f57595c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f57596d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f57597e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f57598f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f57599g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageView f57600h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f57601i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Button f57602j;

    public C25740c(@k View view) {
        super(view);
        this.f57594b = view;
        this.f57595c = (TextView) view.findViewById(R.id.order_title_tv);
        this.f57596d = (TextView) view.findViewById(R.id.order_subtitle_tv);
        this.f57597e = (TextView) view.findViewById(R.id.estate_info_tv);
        this.f57598f = (TextView) view.findViewById(R.id.address_tv);
        this.f57599g = (ImageView) view.findViewById(R.id.estate_pic_iv);
        this.f57600h = (ImageView) view.findViewById(R.id.buyer_pic_iv);
        this.f57601i = (Button) view.findViewById(R.id.first_button);
        this.f57602j = (Button) view.findViewById(R.id.second_button);
    }

    public static int B80(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -817598092) {
            if (iHashCode != -314765822) {
                if (iHashCode == -213768444 && str.equals("overlaySecondary")) {
                    return R.attr.buttonOverlaySecondaryMedium;
                }
            } else if (str.equals("primary")) {
                return R.attr.buttonPrimaryMedium;
            }
        } else if (str.equals("secondary")) {
            return R.attr.buttonSecondaryMedium;
        }
        return f.d(str);
    }

    @Override // bz0.InterfaceC25739b
    public final void B0(@l String str) {
        I5.a(this.f57598f, str, false);
    }

    @Override // bz0.InterfaceC25739b
    public final void BT(@k InterfaceC25739b.a aVar, @l Y41.a<G0> aVar2) {
        Button button = this.f57601i;
        if (aVar2 == null) {
            button.setOnClickListener(null);
        } else {
            button.setOnClickListener(new Ae0.b(26, aVar2));
        }
        button.setVisibility(aVar.f57590a ? 0 : 8);
        button.setText(aVar.f57591b);
        button.setAppearanceFromAttr(B80(aVar.f57592c));
    }

    @Override // bz0.InterfaceC25739b
    public final void V2() {
        this.f57594b.setOnClickListener(null);
    }

    @Override // bz0.InterfaceC25739b
    public final void Yt(@l String str) {
        I5.a(this.f57597e, str, false);
    }

    @Override // bz0.InterfaceC25739b
    public final void a(@k Y41.a<G0> aVar) {
        this.f57594b.setOnClickListener(new ViewOnClickListenerC13121a(6, aVar));
    }

    @Override // bz0.InterfaceC25739b
    public final void gN(@k InterfaceC25739b.a aVar, @l Y41.a<G0> aVar2) {
        Button button = this.f57602j;
        if (aVar2 == null) {
            button.setOnClickListener(null);
        } else {
            button.setOnClickListener(new Ae0.b(25, aVar2));
        }
        button.setVisibility(aVar.f57590a ? 0 : 8);
        button.setText(aVar.f57591b);
        button.setAppearanceFromAttr(B80(aVar.f57592c));
    }

    @Override // bz0.InterfaceC25739b
    public final void j(@l String str) {
        I5.a(this.f57596d, str, false);
    }

    @Override // bz0.InterfaceC25739b
    public final void mO(@l String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        Uri uri = Uri.parse(str);
        ImageView imageView = this.f57599g;
        com.avito.android.image_loader.glide.utils.b.b(imageView, uri, 0, kotlin.math.b.b(imageView.getContext().getResources().getDimension(R.dimen.order_image_radius)));
    }

    @Override // bz0.InterfaceC25739b
    public final void q(@l AttributedText attributedText) {
        j.a(this.f57598f, attributedText, null);
    }

    @Override // bz0.InterfaceC25739b
    public final void q20(@l String str) {
        ImageView imageView = this.f57600h;
        if (str == null || str.length() == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            com.avito.android.image_loader.glide.utils.b.b(imageView, Uri.parse(str), 0, kotlin.math.b.b(imageView.getContext().getResources().getDimension(R.dimen.buyer_avatar_image_radius)));
        }
    }

    @Override // bz0.InterfaceC25739b
    public final void setTitle(@k String str) {
        this.f57595c.setText(str);
    }
}
