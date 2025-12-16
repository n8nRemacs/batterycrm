package com.avito.android.screens.bbip_v2.ui.items.duration;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.screens.bbip_v2.ui.items.duration.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BbipV2DurationDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/duration/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f261606J = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f261607E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final List<b.a> f261608F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final Y41.l<b.a, G0> f261609G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C<Resources> f261610H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public Picker f261611I;

    /* compiled from: BbipV2DurationDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.screens.bbip_v2.ui.items.duration.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7826a extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            a aVar = (a) this.receiver;
            int i12 = a.f261606J;
            aVar.getClass();
            aVar.f261611I = (Picker) view.findViewById(R.id.bbip_v2_duration_picker_content);
            ArrayList arrayList = new ArrayList();
            List<b.a> list = aVar.f261608F;
            int i13 = 0;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Resources value = aVar.f261610H.getValue();
                int i15 = ((b.a) obj).f261619a;
                arrayList.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(i13), value.getQuantityString(R.plurals.duration, i15, Integer.valueOf(i15))));
                i13 = i14;
            }
            Iterator<b.a> it = list.iterator();
            int i16 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i16 = -1;
                    break;
                }
                if (it.next().f261621c) {
                    break;
                }
                i16++;
            }
            int i17 = i16 >= 0 ? i16 : 0;
            Picker picker = aVar.f261611I;
            if (picker != null) {
                Picker.d(picker, arrayList, new com.avito.android.lib.design.picker.m(null, false, -1, 1, null), 12);
                picker.setFirstWheelValue((com.avito.android.lib.design.picker.k) arrayList.get(i17));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BbipV2DurationDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            a aVar = (a) this.receiver;
            int i12 = a.f261606J;
            aVar.getClass();
            View viewFindViewById = view.findViewById(R.id.bbip_v2_duration_picker_action);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById;
            button.setText(aVar.f261607E);
            button.setOnClickListener(new com.avito.android.review_gallery.g(aVar, 10));
            return G0.f406611a;
        }
    }

    /* compiled from: BbipV2DurationDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Resources> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f261612l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.f261612l = context;
        }

        @Override // Y41.a
        public final Resources invoke() {
            Locale locale = new Locale("ru", "RU");
            Context context = this.f261612l;
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(locale);
            return context.createConfigurationContext(configuration).getResources();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Y61.k Context context, @Y61.k String str, @Y61.k String str2, @Y61.k List<b.a> list, @Y61.k Y41.l<? super b.a, G0> lVar) {
        super(context, 0, 2, null);
        this.f261607E = str2;
        this.f261608F = list;
        this.f261609G = lVar;
        this.f261610H = C42727D.c(new c(context));
        com.avito.android.lib.design.bottom_sheet.d.M(this, str, false, true, 6);
        B(R.layout.bbip_v2_duration_picker_content_view, R.layout.bbip_v2_duration_picker_footer_view, new C7826a(1, this, a.class, "onInflated", "onInflated(Landroid/view/View;)V", 0), new b(1, this, a.class, "onFooterInflated", "onFooterInflated(Landroid/view/View;)V", 0), true);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.lib.util.g.a(this);
    }
}
