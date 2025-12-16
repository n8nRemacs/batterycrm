package com.avito.android.sbc.autodispatcheslist.adapter;

import TV0.g;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: SbcAutoDispatchFullyLoadedItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/c;", "LTV0/b;", "Lcom/avito/android/sbc/autodispatcheslist/adapter/c$c;", "Lcom/avito/android/sbc/autodispatcheslist/adapter/r;", "a", "b", "c", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements TV0.b<C7783c, r> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f259038a = new b();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<C7783c> f259039b;

    /* compiled from: SbcAutoDispatchFullyLoadedItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/c$a;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a();
    }

    /* compiled from: SbcAutoDispatchFullyLoadedItemBlueprint.kt */
    @P
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/c$b;", "LTV0/d;", "Lcom/avito/android/sbc/autodispatcheslist/adapter/c$c;", "Lcom/avito/android/sbc/autodispatcheslist/adapter/r;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements TV0.d<C7783c, r> {
        @Override // TV0.d
        public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        }
    }

    /* compiled from: SbcAutoDispatchFullyLoadedItemBlueprint.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/c$c;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.autodispatcheslist.adapter.c$c, reason: collision with other inner class name */
    public static final class C7783c extends com.avito.konveyor.adapter.b implements TV0.e {
    }

    /* compiled from: SbcAutoDispatchFullyLoadedItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/sbc/autodispatcheslist/adapter/c$c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/sbc/autodispatcheslist/adapter/c$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<ViewGroup, View, C7783c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f259040l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar) {
            super(2);
            this.f259040l = aVar;
        }

        @Override // Y41.p
        public final C7783c invoke(ViewGroup viewGroup, View view) throws Resources.NotFoundException {
            View view2 = view;
            C7783c c7783c = new C7783c(view2);
            TextView textView = (TextView) view2.findViewById(R.id.sbc_auto_dispatch_fully_loaded_text_view);
            String string = view2.getResources().getString(R.string.sbc_auto_dispatch_page_fully_loaded);
            String string2 = view2.getResources().getString(R.string.sbc_auto_dispatch_write_to_support);
            int I12 = C43066x.I(string, string2, 0, false, 6);
            if (I12 != -1) {
                int length = string2.length() + I12;
                com.avito.android.sbc.autodispatcheslist.adapter.d dVar = new com.avito.android.sbc.autodispatcheslist.adapter.d(this.f259040l);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(dVar, I12, length, 33);
                textView.setText(spannableString);
            }
            return c7783c;
        }
    }

    @Inject
    public c(@Y61.k a aVar) {
        this.f259039b = new g.a<>(R.layout.sbc_auto_dispatch_fully_loaded_item, new d(aVar));
    }

    @Override // TV0.b
    @Y61.k
    public final TV0.d<C7783c, r> a() {
        return this.f259038a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<C7783c> b() {
        return this.f259039b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof r;
    }
}
