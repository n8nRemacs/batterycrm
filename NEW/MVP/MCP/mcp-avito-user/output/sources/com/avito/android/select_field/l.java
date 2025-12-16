package com.avito.android.select_field;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.select.Select;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import com.avito.android.select_field.model.SelectFieldArguments;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sq0.InterfaceC48399a;

/* compiled from: SelectFieldView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_field/l;", "Lcom/avito/android/select_field/j;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f267173a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f267174b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f267175c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC48399a, G0> f267176d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Select f267177e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f267178f;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k View view, @Y61.k e eVar, @Y61.k SelectFieldArguments selectFieldArguments, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k Y41.l<? super InterfaceC48399a, G0> lVar) {
        this.f267173a = view;
        this.f267174b = eVar;
        this.f267175c = screenPerformanceTracker;
        this.f267176d = lVar;
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.select);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.select.Select");
        }
        Select select = (Select) viewFindViewById4;
        this.f267177e = select;
        View viewFindViewById5 = view.findViewById(R.id.save_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById5;
        this.f267178f = button;
        SelectItem selectItem = selectFieldArguments.f267179b;
        textView.setText(selectItem.f229817g);
        I5.a(textView2, selectItem.f229815e, false);
        select.setHint(selectItem.f229818h);
        final int i12 = 0;
        select.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.select_field.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f267172c;

            {
                this.f267172c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f267172c.f267176d.invoke(InterfaceC48399a.b.f438881a);
                        break;
                    case 1:
                        this.f267172c.f267176d.invoke(InterfaceC48399a.c.f438882a);
                        break;
                    default:
                        this.f267172c.f267174b.a();
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.select_field.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f267172c;

            {
                this.f267172c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f267172c.f267176d.invoke(InterfaceC48399a.b.f438881a);
                        break;
                    case 1:
                        this.f267172c.f267176d.invoke(InterfaceC48399a.c.f438882a);
                        break;
                    default:
                        this.f267172c.f267174b.a();
                        break;
                }
            }
        });
        final int i14 = 2;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.select_field.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f267172c;

            {
                this.f267172c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f267172c.f267176d.invoke(InterfaceC48399a.b.f438881a);
                        break;
                    case 1:
                        this.f267172c.f267176d.invoke(InterfaceC48399a.c.f438882a);
                        break;
                    default:
                        this.f267172c.f267174b.a();
                        break;
                }
            }
        });
    }
}
