package com.avito.android.user_adverts.root_screen.adverts_host.soa_info_bottom_sheet;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;

/* compiled from: SoaInfoBottomSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/soa_info_bottom_sheet/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends d {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f314136J = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final String f314137E;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final CharSequence f314138F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final String f314139G;

    /* renamed from: H, reason: collision with root package name */
    @k
    public final Image f314140H;

    /* renamed from: I, reason: collision with root package name */
    @k
    public final Y41.a<G0> f314141I;

    /* compiled from: SoaInfoBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.soa_info_bottom_sheet.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C9688a extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            a aVar = (a) this.receiver;
            int i12 = a.f314136J;
            aVar.getClass();
            TextView textView = (TextView) view2.findViewById(R.id.title);
            TextView textView2 = (TextView) view2.findViewById(R.id.text);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view2.findViewById(R.id.image);
            textView.setText(aVar.f314137E);
            textView2.setText(aVar.f314138F);
            com.avito.android.advert.item.delivery_suggests.l.w(aVar.f314140H, C35949t5.a(simpleDraweeView));
            return G0.f406611a;
        }
    }

    /* compiled from: SoaInfoBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<View, G0> {
        public final void f(@k View view) {
            a aVar = (a) this.receiver;
            int i12 = a.f314136J;
            aVar.getClass();
            ((Button) view.findViewById(R.id.confirm_button)).setState(new UU.a(aVar.f314139G, null, false, false, false, new com.avito.android.user_adverts.root_screen.adverts_host.soa_info_bottom_sheet.b(aVar), null, null, null, false, 990, null));
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    /* compiled from: SoaInfoBottomSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f314141I.invoke();
            return G0.f406611a;
        }
    }

    public a(@k Context context, @k String str, @l CharSequence charSequence, @k String str2, @k Image image, @k Y41.a<G0> aVar) {
        super(context, 0, 2, null);
        this.f314137E = str;
        this.f314138F = charSequence;
        this.f314139G = str2;
        this.f314140H = image;
        this.f314141I = aVar;
        B(R.layout.soa_info_dialog, R.layout.soa_info_confirm_button, new C9688a(1, this, a.class, "setupContentView", "setupContentView(Landroid/view/View;)V", 0), new b(1, this, a.class, "setupFooterView", "setupFooterView(Landroid/view/View;)V", 0), false);
        d.M(this, null, false, false, 10);
        setCancelable(true);
        T();
        setCanceledOnTouchOutside(true);
        this.f178532z = false;
        R(new c());
    }
}
