package com.avito.android.newcars_mark_model_filter.presentation.recycler.model;

import Y41.l;
import Y41.p;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import com.avito.android.lib.design.toggle.ToggleState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ModelOptionItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/model/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/newcars_mark_model_filter/presentation/recycler/model/i;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItemCheckbox f207401b;

    /* compiled from: ModelOptionItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isSelected", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p<Boolean, b, G0> f207402l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f207403m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super Boolean, ? super b, G0> pVar, b bVar) {
            super(1);
            this.f207402l = pVar;
            this.f207403m = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f207402l.invoke(bool2, this.f207403m);
            return G0.f406611a;
        }
    }

    public j(@Y61.k View view) {
        super(view);
        this.f207401b = (ListItemCheckbox) view.findViewById(R.id.checkbox_mark);
    }

    @Override // com.avito.android.newcars_mark_model_filter.presentation.recycler.model.i
    public final void zq(@Y61.k p pVar, @Y61.k b bVar) {
        this.f207401b.setState((kV.b) new kV.c(bVar.f207395d, null, null, null, null, false, null, new ToggleState(new a(pVar, bVar), false, false, false, bVar.f207396e ? ToggleState.ToggleValue.f181170d : ToggleState.ToggleValue.f181168b, 14, null), false, false, null, null, 3966, null));
    }
}
