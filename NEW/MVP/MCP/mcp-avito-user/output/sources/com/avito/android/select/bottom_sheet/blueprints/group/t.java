package com.avito.android.select.bottom_sheet.blueprints.group;

import Ca1.ViewOnTouchListenerC13234a;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableGroupItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/group/t;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/select/bottom_sheet/blueprints/group/s;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t extends com.avito.konveyor.adapter.b implements s {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f265126d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f265127b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Checkbox f265128c;

    public t(@Y61.k View view) {
        super(view);
        this.f265127b = view;
        view.setOnClickListener(new com.avito.android.review_gallery.g(this, 14));
        this.f265128c = (Checkbox) view.findViewById(R.id.group_checkbox);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.group.s
    public final void Da(@Y61.k State state) {
        JV.a.a(this.f265128c, state);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.group.s
    public final void Y7(@Y61.k Y41.a<G0> aVar) {
        this.f265128c.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(20, aVar));
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.group.s
    public final void d9(boolean z12, boolean z13) {
        this.f265128c.setCompoundDrawablesWithIntrinsicBounds(0, 0, !z13 ? 0 : z12 ? R.drawable.ic_collapse_24 : R.drawable.ic_expand_24, 0);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.group.s
    public final void lb(@Y61.k Y41.a<G0> aVar) {
        this.f265128c.setOnTouchListener(new ViewOnTouchListenerC13234a(this, aVar));
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.group.s
    public final void setTitle(@Y61.k String str) {
        this.f265128c.setText(str);
    }
}
