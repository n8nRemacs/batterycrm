package Bt;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.g;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CvBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBt/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_job_cv-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f1750G = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final Y41.a<G0> f1751E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final Y41.a<G0> f1752F;

    public b(@k Y41.a aVar, @k Y41.a aVar2, @k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        super(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, myAdvertDetailsActivity, Integer.valueOf(R.style.Theme_DesignSystem_Re23)), R.style.Re23_BottomSheet_Default);
        this.f1751E = aVar;
        this.f1752F = aVar2;
        aVar.invoke();
        setContentView(R.layout.bottom_sheet);
        String string = getContext().getString(R.string.cv_dialog_title);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        View viewInflate = getLayoutInflater().inflate(R.layout.bottom_sheet_header, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.bottom_sheet_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(string);
        View viewFindViewById2 = viewInflate.findViewById(R.id.bottom_sheet_close_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        final int i12 = 1;
        ((ImageView) viewFindViewById2).setOnClickListener(new View.OnClickListener(this) { // from class: Bt.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f1749c;

            {
                this.f1749c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = this.f1749c;
                switch (i12) {
                    case 0:
                        int i13 = b.f1750G;
                        bVar.dismiss();
                        bVar.f1752F.invoke();
                        break;
                    default:
                        int i14 = b.f1750G;
                        bVar.dismiss();
                        break;
                }
            }
        });
        H(viewInflate);
        final int i13 = 0;
        ((Button) findViewById(R.id.edit_button)).setOnClickListener(new View.OnClickListener(this) { // from class: Bt.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f1749c;

            {
                this.f1749c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = this.f1749c;
                switch (i13) {
                    case 0:
                        int i132 = b.f1750G;
                        bVar.dismiss();
                        bVar.f1752F.invoke();
                        break;
                    default:
                        int i14 = b.f1750G;
                        bVar.dismiss();
                        break;
                }
            }
        });
        g.a(this);
    }
}
