package ru.avito.component.info_label;

import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: InfoLabelViewHolder.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/component/info_label/k;", "Lru/avito/component/info_label/j;", "Lru/avito/component/animator/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class k extends com.avito.konveyor.adapter.b implements j, ru.avito.component.animator.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f430365b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public InfoLevel f430366c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final d f430367d;

    public k(@Y61.k View view) {
        super(view);
        this.f430365b = new a(view);
        this.f430367d = d.f430356a;
    }

    @Override // ru.avito.component.info_label.j
    public final void Qu(@Y61.k String str, @Y61.k InfoLevel infoLevel) {
        int iD2;
        a aVar = this.f430365b;
        aVar.f430355c.setText(str);
        int iOrdinal = infoLevel.ordinal();
        View view = aVar.f430353a;
        if (iOrdinal == 0) {
            iD2 = C35835l0.d(R.attr.blue, view.getContext());
        } else if (iOrdinal == 1) {
            iD2 = C35835l0.d(R.attr.orange, view.getContext());
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iD2 = C35835l0.d(R.attr.red, view.getContext());
        }
        aVar.f430354b.setBackgroundColor(iD2);
        this.f430366c = infoLevel;
    }

    @Override // ru.avito.component.animator.c
    public final ru.avito.component.animator.b y00() {
        return this.f430367d;
    }
}
