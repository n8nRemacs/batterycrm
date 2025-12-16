package com.avito.android.evidence_request.mvi.proof_types;

import Y61.k;
import Zz.InterfaceC19624a;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.radio.RadioGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: ProofTypesView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/proof_types/c;", "Lcom/avito/android/evidence_request/mvi/proof_types/b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f149171a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f149172b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CollapsingTitleAppBarLayout f149173c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f149174d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RadioGroup f149175e;

    public c(@k View view, @k d dVar) {
        this.f149171a = view;
        this.f149172b = dVar;
        View viewFindViewById = view.findViewById(R.id.app_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.toolbar.CollapsingTitleAppBarLayout");
        }
        CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = (CollapsingTitleAppBarLayout) viewFindViewById;
        this.f149173c = collapsingTitleAppBarLayout;
        View viewFindViewById2 = view.findViewById(R.id.select_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f149174d = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.types_group);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.radio.RadioGroup");
        }
        RadioGroup radioGroup = (RadioGroup) viewFindViewById3;
        this.f149175e = radioGroup;
        collapsingTitleAppBarLayout.setClickListener(new a());
        radioGroup.setDeprecatedOnCheckedChangeListener(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 14));
    }

    /* compiled from: ProofTypesView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/evidence_request/mvi/proof_types/c$a", "Lru/avito/component/toolbar/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ru.avito.component.toolbar.a {
        public a() {
        }

        @Override // ru.avito.component.toolbar.a
        public final void R() {
            c.this.f149172b.accept(InterfaceC19624a.C1475a.f20615a);
        }

        @Override // ru.avito.component.toolbar.a
        public final void u() {
        }
    }
}
