package com.avito.android.gig_shift_action.ui;

import GX0.a;
import Y41.l;
import Y41.p;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.asynclayoutinflater.view.a;
import androidx.core.graphics.C22771k;
import androidx.core.view.J0;
import androidx.core.view.M;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.Reason;
import com.avito.android.gig_shift_action.mvi.a;
import com.avito.android.gig_shift_action.ui.GigShiftActionDialogFragment;
import com.avito.android.gig_shift_cancel.mvi.a;
import com.avito.android.gig_shift_cancel.ui.GigShiftCancelDialogFragment;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.radio.RadioGroup;
import com.avito.android.publish.objects.result.ObjectsFragmentResultImpl;
import com.avito.android.publish.scanner.BitmapConverterForGallery;
import com.avito.android.remote.model.Size;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersListSnippetItem;
import com.avito.android.service_orders.list.blueprints.snippet_item.m;
import com.avito.android.suggest_locations.sheet.SuggestLocationsFragmentSheet;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35973x1;
import com.avito.android.util.C35980y1;
import com.avito.android.util.C35987z1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.i;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.analytics.j;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.util.C36599o;
import com.google.android.exoplayer2.util.C36604u;
import com.google.android.exoplayer2.video.o;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.my.target.C37782e;
import com.my.target.M0;
import com.my.target.O0;
import com.my.target.V;
import com.my.target.b1;
import iF.InterfaceC41277a;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.C;
import io.reactivex.rxjava3.core.K;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class a implements RadioGroup.e, C, a.e, M, InterfaceC41277a, androidx.fragment.app.C, SwipeRefreshLayout.e, io.reactivex.rxjava3.core.M, Chips.b, HV0.c, a.InterfaceC0354a, C36604u.b, C36604u.a, b1.a, C37782e.d, InterfaceC37023f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f160581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f160582c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f160583d;

    public /* synthetic */ a(int i12, Object obj, Object obj2) {
        this.f160581b = i12;
        this.f160583d = obj;
        this.f160582c = obj2;
    }

    @Override // com.my.target.C37782e.d
    public void a() {
        O0 o02 = (O0) this.f160583d;
        o02.f364515b.setData((String) this.f160582c);
        o02.f364515b.setOnLayoutListener(null);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.e
    public boolean b() {
        return (((l0.f) this.f160583d).f406840b == 0 && ((l0.f) this.f160582c).f406840b == 1) ? false : true;
    }

    @Override // com.avito.android.lib.design.chips.Chips.b
    public void c(com.avito.android.lib.design.chips.h hVar, boolean z12) {
        Object next;
        Object next2;
        switch (this.f160581b) {
            case 11:
                if (!z12) {
                    Iterator<T> it = ((com.avito.android.vas_performance.screens.stickers.buy.item.stickers.b) this.f160583d).f320667d.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (L.f(((com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a) next).f320661b, ((com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a) hVar).f320661b)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a aVar = (com.avito.android.vas_performance.screens.stickers.buy.item.stickers.a) next;
                    if (aVar != null) {
                        ((com.avito.android.vas_performance.screens.stickers.buy.item.stickers.h) this.f160582c).f320675b.invoke(aVar);
                        break;
                    }
                }
                break;
            default:
                if (!z12) {
                    Iterator it2 = ((com.avito.android.vas_performance.ui.items.stickers.b) this.f160583d).f321727c.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (L.f(((com.avito.android.vas_performance.ui.items.stickers.a) next2).f321722b, ((com.avito.android.vas_performance.ui.items.stickers.a) hVar).f321722b)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    com.avito.android.vas_performance.ui.items.stickers.a aVar2 = (com.avito.android.vas_performance.ui.items.stickers.a) next2;
                    if (aVar2 != null) {
                        ((com.avito.android.vas_performance.ui.items.stickers.h) this.f160582c).f321737d.accept(aVar2);
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.my.target.b1.a
    public void d() {
        V v12 = (V) this.f160582c;
        ((M0) this.f160583d).getClass();
        if (v12.isShowing()) {
            v12.dismiss();
        }
    }

    @Override // HV0.c
    public void dispose() {
        ((com.avito.beduin.v2.repository.environment.g) this.f160583d).f338232g.remove((l) this.f160582c);
    }

    @Override // com.google.android.exoplayer2.util.C36604u.b
    public void e(Object obj, C36599o c36599o) {
        ((com.google.android.exoplayer2.analytics.b) obj).QW((d0) this.f160582c, new b.c(c36599o, ((j) this.f160583d).f343777f));
    }

    @Override // GX0.a.InterfaceC0354a
    public Object execute() {
        switch (this.f160581b) {
            case 15:
                ((i) this.f160583d).f343206c.L1((Iterable) this.f160582c);
                break;
            default:
                i iVar = (i) this.f160583d;
                iVar.getClass();
                Iterator it = ((HashMap) this.f160582c).entrySet().iterator();
                while (it.hasNext()) {
                    iVar.f343212i.d(((Integer) r2.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.core.C
    public void f(B b12) {
        Object obj = this.f160582c;
        Object obj2 = this.f160583d;
        switch (this.f160581b) {
            case 2:
                ((Input) obj2).setOnEditorActionListener(new com.avito.android.autoteka.presentation.previewsearch.b(2, (int[]) obj, b12));
                return;
            case 3:
                BitmapConverterForGallery bitmapConverterForGallery = (BitmapConverterForGallery) obj2;
                Uri uri = (Uri) obj;
                int i12 = BitmapConverterForGallery.f239111d;
                try {
                    File fileB = bitmapConverterForGallery.b(uri);
                    if (fileB == null) {
                        b12.onError(new IOException());
                    } else {
                        com.avito.android.publish.scanner.g.f239214a.getClass();
                        b12.onNext(fileB);
                        b12.e();
                    }
                    return;
                } catch (Exception e12) {
                    b12.onError(e12);
                    return;
                }
            default:
                RecyclerView recyclerView = (RecyclerView) obj2;
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null) {
                    throw new IllegalStateException("Need to use LinearLayoutManager for this RecyclerView");
                }
                com.avito.android.floating_views.h hVar = new com.avito.android.floating_views.h(new com.avito.android.rating_ui.utils.b((Y41.a) obj, b12), linearLayoutManager);
                recyclerView.o(hVar);
                b12.f(new com.avito.android.map_core.view.pin_items.i(recyclerView, hVar, 1));
                return;
        }
    }

    @Override // androidx.asynclayoutinflater.view.a.e
    public void g(View view, ViewGroup viewGroup) {
        int i12 = m.f279352m;
        View viewFindViewById = view.findViewById(R.id.srv_order_snippet_user_description);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ServiceOrdersListSnippetItem.a aVar = (ServiceOrdersListSnippetItem.a) this.f160583d;
        String str = aVar.f279248b;
        I5.a((TextView) viewFindViewById, str, false);
        View viewFindViewById2 = view.findViewById(R.id.srv_order_snippet_contact_separator);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        D6.G((TextView) viewFindViewById2, !(str == null || str.length() == 0));
        com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(view.getContext(), null, 0, 0, 14, null);
        aVar2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        aVar2.setEllipsize(TextUtils.TruncateAt.END);
        String str2 = aVar.f279249c;
        if (str2 == null) {
            aVar2.setLines(1);
            aVar2.setTextIsSelectable(false);
        } else {
            aVar2.setMaxLines(Integer.MAX_VALUE);
            aVar2.setTextIsSelectable(true);
        }
        aVar2.setTextAppearance(C35835l0.j(R.attr.textH5, view.getContext()));
        String string = aVar.f279247a;
        if (str2 != null) {
            string = string != null ? ((m) this.f160582c).f279354c.getString(R.string.srv_orders_list_contact_name, string, str2) : null;
        }
        I5.a(aVar2, string, false);
        aVar2.setTag("contact_name");
        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup2 != null) {
            viewGroup2.addView(aVar2);
        }
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // androidx.core.view.M
    public J0 h(View view, J0 j02) {
        switch (this.f160581b) {
            case 6:
                C22771k c22771kE = j02.e(1);
                C22771k c22771kE2 = j02.e(2);
                FrameLayout frameLayout = (FrameLayout) this.f160583d;
                frameLayout.setPadding(frameLayout.getPaddingLeft(), c22771kE.f44776b, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                ((View) this.f160582c).setPadding(c22771kE2.f44775a, 0, c22771kE2.f44777c, c22771kE2.f44778d);
                return J0.f44939b;
            default:
                J0 j03 = (J0) ((N) this.f160583d).invoke(view, j02);
                ((com.avito.beduin.v2.repository.environment.g) this.f160582c).f338229d.setValue(j03 != null ? j03.e(135) : null);
                return j02;
        }
    }

    @Override // com.google.android.exoplayer2.util.C36604u.a
    public void invoke(Object obj) {
        com.google.android.exoplayer2.analytics.b bVar = (com.google.android.exoplayer2.analytics.b) obj;
        switch (this.f160581b) {
            case 18:
                bVar.at((b.C10568b) this.f160583d, (Exception) this.f160582c);
                break;
            case 19:
                b.C10568b c10568b = (b.C10568b) this.f160583d;
                o oVar = (o) this.f160582c;
                bVar.jC(c10568b, oVar);
                int i12 = oVar.f348321b;
                break;
            case 20:
                bVar.mo((b.C10568b) this.f160583d, this.f160582c);
                break;
            case 21:
                bVar.FA((b.C10568b) this.f160583d, (c0) this.f160582c);
                break;
            case 22:
                bVar.tN((b.C10568b) this.f160583d, (com.google.android.exoplayer2.decoder.f) this.f160582c);
                break;
            case 23:
                bVar.wO((b.C10568b) this.f160583d, (PlaybackException) this.f160582c);
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                bVar.Kx((b.C10568b) this.f160583d, (t0) this.f160582c);
                break;
            default:
                bVar.Bg((b.C10568b) this.f160583d, (Metadata) this.f160582c);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.M
    public void j(K k12) {
        C35987z1 c35987z1 = C35987z1.f319133a;
        ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.b((Uri) this.f160583d);
        Size size = (Size) this.f160582c;
        imageRequestBuilderB.f340805c = new UW0.d(y6.b(size.getWidth()), y6.b(size.getHeight()));
        com.facebook.datasource.c cVarA = com.facebook.drawee.backends.pipeline.d.a().a(imageRequestBuilderB.a(), null);
        k12.f(new C35973x1(cVarA, 0));
        cVarA.d(new C35980y1(k12), com.facebook.common.executors.i.a());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.fragment.app.C
    public void k(Bundle bundle, String str) {
        String string;
        Object obj = this.f160582c;
        Object obj2 = this.f160583d;
        switch (this.f160581b) {
            case 8:
                SuggestLocationsFragmentSheet.a aVar = SuggestLocationsFragmentSheet.f292358k0;
                SuggestLocationsFragmentSheet suggestLocationsFragmentSheet = (SuggestLocationsFragmentSheet) obj2;
                suggestLocationsFragmentSheet.getParentFragmentManager().o0(bundle, (String) obj);
                suggestLocationsFragmentSheet.dismiss();
                break;
            default:
                if (str.equals(((ObjectsFragmentResultImpl.ObjectsRequestKey) obj2).f238090b) && (string = bundle.getString("objects_parameter_key")) != null) {
                    ((N) obj).invoke(string);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.InterfaceC37023f
    public void onFailure(Exception exc) {
        ru.cyberity.cbr.core.domain.f.a((l) this.f160583d, (Bitmap) this.f160582c, exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(p pVar, com.avito.beduin.v2.repository.environment.g gVar) {
        this.f160581b = 14;
        this.f160583d = (N) pVar;
        this.f160582c = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(ObjectsFragmentResultImpl.ObjectsRequestKey objectsRequestKey, l lVar) {
        this.f160581b = 29;
        this.f160583d = objectsRequestKey;
        this.f160582c = (N) lVar;
    }

    @Override // com.avito.android.lib.design.radio.RadioGroup.e
    public void a(ListItemRadio listItemRadio) {
        Object obj = this.f160582c;
        Object obj2 = this.f160583d;
        switch (this.f160581b) {
            case 0:
                GigShiftActionDialogFragment.a aVar = GigShiftActionDialogFragment.f160550v0;
                ((GigShiftActionDialogFragment) obj2).f5().accept(new a.c((Reason) ((List) obj).get(listItemRadio.getId())));
                break;
            default:
                GigShiftCancelDialogFragment.a aVar2 = GigShiftCancelDialogFragment.f160706u0;
                ((GigShiftCancelDialogFragment) obj2).f5().accept(new a.c((com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.Reason) ((List) obj).get(listItemRadio.getId())));
                break;
        }
    }

    @Override // iF.InterfaceC41277a
    public void d(int i12) {
        com.avito.android.str_booking.ui.gallery.c cVar = ((com.avito.android.str_booking.ui.gallery.h) this.f160582c).f286041e;
        if (cVar == null) {
            cVar = null;
        }
        ((p) this.f160583d).invoke(cVar.f286033b, Integer.valueOf(i12));
    }

    public /* synthetic */ a(b.C10568b c10568b, Object obj, long j12) {
        this.f160581b = 20;
        this.f160583d = c10568b;
        this.f160582c = obj;
    }
}
