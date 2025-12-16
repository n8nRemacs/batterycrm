package com.avito.android.component.user_hat.items;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import hw.InterfaceC41177b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: Count.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/component/user_hat/items/D;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/component/user_hat/items/C;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class D extends com.avito.konveyor.adapter.b implements C {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f125323e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f125324b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f125325c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Resources f125326d;

    public D(@Y61.k View view) {
        super(view);
        this.f125324b = view;
        this.f125325c = (TextView) view.findViewById(R.id.profiles_count);
        this.f125326d = view.getContext().getResources();
    }

    @Override // com.avito.android.component.user_hat.f
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f125324b.setOnClickListener(new k(2, aVar));
    }

    @Override // com.avito.android.component.user_hat.items.C
    public final void g30(int i12) throws Resources.NotFoundException {
        String strValueOf;
        if (i12 > 99) {
            strValueOf = this.f125326d.getString(R.string.maximum_displayed_number_of_profiles, 99);
        } else {
            strValueOf = String.valueOf(i12);
        }
        this.f125325c.setText(strValueOf);
    }
}
