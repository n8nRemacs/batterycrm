package com.avito.android.parameters_sheet;

import Fc1.D3;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.di.C29972i;
import com.avito.android.parameters_sheet.e;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ParametersListDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/parameters_sheet/d;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "Lcom/avito/android/parameters_sheet/e$a;", "_avito_parameters-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends com.avito.android.lib.design.bottom_sheet.d implements e.a {

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ int f210694K = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.conveyor_item.a> f210695E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_parameters.h f210696F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f210697G;

    /* renamed from: H, reason: collision with root package name */
    public i f210698H;

    /* renamed from: I, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f210699I;

    /* renamed from: J, reason: collision with root package name */
    @Inject
    public e f210700J;

    public /* synthetic */ d(Context context, int i12, String str, List list, com.avito.android.category_parameters.h hVar, boolean z12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? 0 : i12, str, list, hVar, (i13 & 32) != 0 ? false : z12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.parameters_sheet.di.a.a().a((com.avito.android.parameters_sheet.di.c) C29972i.a(C29972i.b(this), com.avito.android.parameters_sheet.di.c.class), getContext().getResources(), this.f210695E, this.f210696F).a(this);
        com.avito.konveyor.adapter.j jVar = this.f210699I;
        if (jVar == null) {
            jVar = null;
        }
        this.f210698H = new i(this, jVar, this.f210697G);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, androidx.view.r, android.app.Dialog
    public final void onStart() {
        super.onStart();
        e eVar = this.f210700J;
        if (eVar == null) {
            eVar = null;
        }
        i iVar = this.f210698H;
        if (iVar == null) {
            iVar = null;
        }
        eVar.e(iVar);
        e eVar2 = this.f210700J;
        if (eVar2 == null) {
            eVar2 = null;
        }
        eVar2.d(this);
        e eVar3 = this.f210700J;
        (eVar3 != null ? eVar3 : null).b();
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void onStop() {
        e eVar = this.f210700J;
        if (eVar == null) {
            eVar = null;
        }
        eVar.e0();
        e eVar2 = this.f210700J;
        (eVar2 != null ? eVar2 : null).c0();
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k Context context, int i12, @l String str, @Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k com.avito.android.category_parameters.h hVar, boolean z12) {
        super(context, i12);
        this.f210695E = list;
        this.f210696F = hVar;
        this.f210697G = z12;
        D(R.layout.parameters_list_dialog, true);
        T();
        setCanceledOnTouchOutside(true);
        if (z12) {
            L(str, getContext().getString(R.string.parameters_sheet_reset), true, true);
            P(new b(this));
            R(new c(this));
        } else {
            int iB2 = y6.b(8);
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.inline_filter_dialog_header, (ViewGroup) null);
            viewInflate.setPadding(viewInflate.getPaddingLeft() + iB2, viewInflate.getPaddingTop(), viewInflate.getPaddingRight() + iB2, viewInflate.getPaddingBottom());
            View viewFindViewById = viewInflate.findViewById(R.id.close_inline_filter_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            View viewFindViewById2 = viewInflate.findViewById(R.id.reset_action_button);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(R.id.inline_filter_dialog_title);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            I5.a((TextView) viewFindViewById3, str, false);
            com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
            final int i13 = 0;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.parameters_sheet.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f210691c;

                {
                    this.f210691c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            e eVar = this.f210691c.f210700J;
                            if (eVar == null) {
                                eVar = null;
                            }
                            eVar.a();
                            break;
                        default:
                            e eVar2 = this.f210691c.f210700J;
                            if (eVar2 == null) {
                                eVar2 = null;
                            }
                            eVar2.c();
                            break;
                    }
                }
            });
            final int i14 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.parameters_sheet.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ d f210691c;

                {
                    this.f210691c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            e eVar = this.f210691c.f210700J;
                            if (eVar == null) {
                                eVar = null;
                            }
                            eVar.a();
                            break;
                        default:
                            e eVar2 = this.f210691c.f210700J;
                            if (eVar2 == null) {
                                eVar2 = null;
                            }
                            eVar2.c();
                            break;
                    }
                }
            });
            H(viewInflate);
        }
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        setOnCancelListener(new D3(this, 17));
    }
}
