package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.sort;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.BaseSelect;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SortItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/sort/h;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BaseSelect f221185b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f221186c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public a f221187d;

    public h(@k View view) {
        super(view);
        BaseSelect baseSelect = (BaseSelect) view.findViewById(R.id.position_in_search_sort_select);
        this.f221185b = baseSelect;
        Button button = (Button) view.findViewById(R.id.position_in_search_sort_select_direction);
        this.f221186c = button;
        final int i12 = 0;
        baseSelect.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.sort.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f221184c;

            {
                this.f221184c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        a aVar = this.f221184c.f221187d;
                        if (aVar != null) {
                            aVar.f221173f.invoke();
                            break;
                        }
                        break;
                    default:
                        a aVar2 = this.f221184c.f221187d;
                        if (aVar2 != null) {
                            aVar2.f221174g.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.sort.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f221184c;

            {
                this.f221184c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        a aVar = this.f221184c.f221187d;
                        if (aVar != null) {
                            aVar.f221173f.invoke();
                            break;
                        }
                        break;
                    default:
                        a aVar2 = this.f221184c.f221187d;
                        if (aVar2 != null) {
                            aVar2.f221174g.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void B80(@k a aVar) {
        String str = aVar.f221169b;
        BaseSelect baseSelect = this.f221185b;
        Input.t(baseSelect, "", false, 6);
        Input.t(baseSelect, str, false, 6);
        FV.a aVar2 = FV.a.f4720a;
        Context context = this.itemView.getContext();
        int i12 = aVar.f221171d.f220413b;
        aVar2.getClass();
        CharSequence charSequenceI = FV.a.i("", context, i12, 0);
        Button button = this.f221186c;
        button.setText(charSequenceI);
        boolean z12 = aVar.f221175h;
        baseSelect.setEnabled(!z12);
        button.setLoading(z12);
        this.f221187d = aVar;
    }
}
