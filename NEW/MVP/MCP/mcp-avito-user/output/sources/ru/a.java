package RU;

import Y61.l;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.seller_promotions.o;
import com.avito.android.travel_guest_profile.items.profile_header.h;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: AlertBannerContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRU/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public String f14453a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public CharSequence f14454b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public String f14455c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public h f14456d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public String f14457e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public o f14458f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Drawable f14459g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public ColorStateList f14460h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14461i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public TextView f14462j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public TextView f14463k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public Button f14464l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public TextView f14465m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public ImageView f14466n;

    public final void a(@l CharSequence charSequence) {
        this.f14454b = charSequence;
        TextView textView = this.f14463k;
        if (textView != null) {
            I5.a(textView, charSequence, false);
        }
    }

    public final void b(@l Drawable drawable) {
        this.f14459g = drawable;
        ImageView imageView = this.f14466n;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        ImageView imageView2 = this.f14466n;
        if (imageView2 != null) {
            D6.G(imageView2, drawable != null);
        }
    }

    public final void c(@l String str) {
        this.f14453a = str;
        TextView textView = this.f14462j;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }
}
