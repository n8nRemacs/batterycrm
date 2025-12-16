package com.avito.android.publish.publish_advert_request;

import Y61.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.R0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.photo_picker.b0;
import com.avito.android.progress_overlay.l;
import com.avito.android.publish.W0;
import com.avito.android.publish.objects.di.C33930m;
import com.avito.android.publish.publish_advert_request.c;
import com.avito.android.publish.publish_advert_request.di.c;
import com.avito.android.publish.publish_advert_request.e;
import com.avito.android.util.NotFoundException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PublishAdvertRequestFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/publish/publish_advert_request/PublishAdvertRequestFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/ui/fragments/c;", "LId0/f;", "Lcom/avito/android/publish/uploading_dialog/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PublishAdvertRequestFragment extends Fragment implements com.avito.android.ui.fragments.c, Id0.f, com.avito.android.publish.uploading_dialog.a, InterfaceC28477j.b {

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public g f238955f0;

    /* renamed from: g0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f238956g0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public W0 f238957h0;

    /* renamed from: i0, reason: collision with root package name */
    public e f238958i0;

    /* renamed from: j0, reason: collision with root package name */
    public String f238959j0;

    /* renamed from: k0, reason: collision with root package name */
    public TextView f238960k0;

    /* renamed from: l0, reason: collision with root package name */
    public ProgressBar f238961l0;

    /* renamed from: m0, reason: collision with root package name */
    public l f238962m0;

    @Override // com.avito.android.publish.uploading_dialog.a
    public final void V2() {
        e eVar = this.f238958i0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.f239010T.setValue(e.a.c.f239013a);
        eVar.ke();
    }

    @Override // com.avito.android.publish.uploading_dialog.a
    public final void Y0() {
        e eVar = this.f238958i0;
        if (eVar == null) {
            eVar = null;
        }
        b0.a.a(eVar.f239002L, null, 3);
        eVar.me(300L);
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        e eVar = this.f238958i0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.f239005O.ye();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(@Y61.l Bundle bundle) {
        super.onActivityCreated(bundle);
        e eVar = this.f238958i0;
        if (eVar == null) {
            eVar = null;
        }
        W0 w02 = this.f238957h0;
        eVar.f239009S = w02 != null ? w02 : null;
        String str = eVar.f239005O.f231862Z;
        if (str == null || str.length() == 0) {
            eVar.me(0L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) throws NotFoundException {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("draft_id")) == null) {
            throw new NotFoundException("draft_id", (Throwable) null, 2, (C42822w) null);
        }
        C33930m c33930m = new C33930m(string);
        c.a aVarA = com.avito.android.publish.publish_advert_request.di.a.a();
        aVarA.c((com.avito.android.publish.publish_advert_request.di.b) C29972i.a(C29972i.b(this), com.avito.android.publish.publish_advert_request.di.b.class));
        new com.avito.android.publish.publish_advert_request.di.d();
        aVarA.a(c33930m);
        aVarA.b(getResources());
        aVarA.build().a(this);
        g gVar = this.f238955f0;
        this.f238958i0 = (e) R0.a(this, gVar != null ? gVar : null).a(e.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.publish_advert_request_fragment, viewGroup, false);
        this.f238959j0 = getResources().getString(R.string.photo_upload_info);
        View viewFindViewById = viewInflate.findViewById(R.id.image_upload_info);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f238960k0 = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.progress_indicator);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ProgressBar");
        }
        this.f238961l0 = (ProgressBar) viewFindViewById2;
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        e eVar = this.f238958i0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.f239010T.removeObservers(getViewLifecycleOwner());
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        InterfaceC28373a interfaceC28373a = this.f238956g0;
        this.f238962m0 = new l(viewGroup, R.id.image_upload_content, interfaceC28373a != null ? interfaceC28373a : null, R.layout.publish_confirm_progress_overlay, 0, 16, null);
        e eVar = this.f238958i0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.f239010T.observe(getViewLifecycleOwner(), new c.a(new a(this)));
        e eVar2 = this.f238958i0;
        if (eVar2 == null) {
            eVar2 = null;
        }
        l lVar = this.f238962m0;
        (lVar != null ? lVar : null).f231600j = new b(eVar2);
    }
}
