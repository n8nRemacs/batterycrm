package com.avito.android.crm_candidates.view.list_items.notes_list;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmNoteView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/notes_list/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/crm_candidates/view/list_items/notes_list/g;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f130176g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f130177b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f130178c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f130179d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f130180e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f130181f;

    public h(@k View view) {
        super(view);
        this.f130177b = view;
        View viewFindViewById = view.findViewById(R.id.name);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130178c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.date);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130179d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130180e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.edit_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f130181f = viewFindViewById4;
    }

    @Override // com.avito.android.crm_candidates.view.list_items.notes_list.g
    public final void J(@k String str) {
        I5.a(this.f130178c, str, false);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.notes_list.g
    public final void QU(@l Y41.a<G0> aVar) {
        G0 g02;
        boolean z12 = aVar != null;
        View view = this.f130177b;
        view.setClickable(z12);
        view.setFocusable(aVar != null);
        view.setEnabled(aVar != null);
        if (aVar != null) {
            view.setOnClickListener(new com.avito.android.component.user_hat.items.k(17, aVar));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            view.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.crm_candidates.view.list_items.notes_list.g
    public final void b0(@k String str) {
        I5.a(this.f130179d, str, false);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.notes_list.g
    public final void setText(@k String str) {
        I5.a(this.f130180e, str, false);
    }

    @Override // com.avito.android.crm_candidates.view.list_items.notes_list.g
    public final void zU(boolean z12) {
        View view = this.f130181f;
        if (z12) {
            D6.H(view);
        } else {
            D6.w(view);
        }
    }
}
