package N91;

import Au.ViewOnClickListenerC13080b;
import B91.C13116i;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.RecyclerView;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import java.util.Locale;
import kotlin.G0;
import kotlin.Z;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class c extends B {

    /* renamed from: f, reason: collision with root package name */
    public static final a f11267f = new a();

    /* renamed from: e, reason: collision with root package name */
    public final N f11268e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Y41.l lVar) {
        super(f11267f);
        this.f11268e = (N) lVar;
        C42784z0 c42784z0 = C42784z0.f406748b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        b bVar = (b) c12;
        M91.b bVar2 = (M91.b) getItem(i12);
        C13116i c13116i = bVar.f11265b;
        try {
            int i13 = Z.f406624c;
            c13116i.f1121b.setImageBitmap(BitmapFactory.decodeStream(c13116i.f1120a.getContext().getAssets().open("country_flags/" + bVar2.f10432a.toUpperCase(Locale.ROOT) + ".png")));
            G0 g02 = G0.f406611a;
        } catch (Throwable unused) {
            int i14 = Z.f406624c;
        }
        int i15 = bVar2.f10434c ? R.drawable.sdk_bio_icon_right : 0;
        c13116i.f1122c.setText(bVar2.f10433b);
        c13116i.f1122c.setCompoundDrawablesWithIntrinsicBounds(0, 0, i15, 0);
        c13116i.f1120a.setOnClickListener(new ViewOnClickListenerC13080b(9, bVar.f11266c, bVar2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        View viewB = C0.b(viewGroup, R.layout.sdk_bio_item_country_search, viewGroup, false);
        int i13 = R.id.sdk_bio_iv_flag;
        ImageView imageView = (ImageView) g2.d.a(viewB, R.id.sdk_bio_iv_flag);
        if (imageView != null) {
            i13 = R.id.sdk_bio_tv_country;
            TextView textView = (TextView) g2.d.a(viewB, R.id.sdk_bio_tv_country);
            if (textView != null) {
                return new b(this, new C13116i((LinearLayout) viewB, imageView, textView));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewB.getResources().getResourceName(i13)));
    }
}
