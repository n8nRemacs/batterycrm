package com.avito.android.search.filter.adapter.display_type_select;

import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import com.google.android.material.internal.CheckableImageButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChangeDisplayTypeView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/adapter/display_type_select/c;", "Lcom/avito/android/search/filter/adapter/display_type_select/a;", "Lcom/avito/konveyor/adapter/b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends com.avito.konveyor.adapter.b implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f262198g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f262199b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f262200c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f262201d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f262202e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public CheckableImageButton f262203f;

    public c(@Y61.k View view) {
        super(view);
        this.f262199b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f262200c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f262201d = (LinearLayout) viewFindViewById2;
    }

    @Override // com.avito.android.search.filter.adapter.display_type_select.k
    public final void Ox(int i12, @Y61.k final String str, boolean z12) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f262199b.getContext());
        ViewGroup viewGroup = this.f262201d;
        final CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.toggle_list_element_option_18, viewGroup, false);
        checkableImageButton.setImageResource(i12);
        checkableImageButton.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.search.filter.adapter.display_type_select.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = c.f262198g;
                CheckableImageButton checkableImageButton2 = checkableImageButton;
                c cVar = this.f262195b;
                CheckableImageButton checkableImageButton3 = cVar.f262203f;
                if (checkableImageButton3 != null) {
                    checkableImageButton3.setChecked(false);
                }
                cVar.f262203f = checkableImageButton2;
                checkableImageButton2.setChecked(true);
                Y41.l<? super String, G0> lVar = cVar.f262202e;
                if (lVar != null) {
                    ((i) lVar).invoke(str);
                }
            }
        });
        viewGroup.addView(checkableImageButton);
        if (z12) {
            CheckableImageButton checkableImageButton2 = this.f262203f;
            if (checkableImageButton2 != null) {
                checkableImageButton2.setChecked(false);
            }
            this.f262203f = checkableImageButton;
            checkableImageButton.setChecked(true);
        }
    }

    @Override // com.avito.android.search.filter.adapter.display_type_select.k
    public final void T9() {
        this.f262201d.removeAllViews();
    }

    @Override // com.avito.android.search.filter.adapter.display_type_select.k
    public final void i5(@l Y41.l<? super String, G0> lVar) {
        this.f262202e = lVar;
    }

    @Override // com.avito.android.search.filter.adapter.display_type_select.k
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f262200c, str, false);
    }
}
