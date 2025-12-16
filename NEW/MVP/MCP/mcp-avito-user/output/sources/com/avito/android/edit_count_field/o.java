package com.avito.android.edit_count_field;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.view.C22977J;
import androidx.view.C23069w;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.edit_count_field.model.EditCountFieldArguments;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.profile_settings_extended.adapter.count.CountItem;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import uy.InterfaceC49125a;

/* compiled from: EditCountFieldView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_count_field/o;", "Lcom/avito/android/edit_count_field/i;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f146657a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f146658b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f146659c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC49125a, G0> f146660d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Input f146661e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f146662f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f146663g;

    public o(@Y61.k View view, @Y61.k d dVar, @Y61.k Lifecycle lifecycle, @Y61.k C22977J c22977j, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k EditCountFieldArguments editCountFieldArguments, @Y61.k Y41.l lVar) {
        this.f146657a = view;
        this.f146658b = dVar;
        this.f146659c = screenPerformanceTracker;
        this.f146660d = lVar;
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
        View viewFindViewById4 = view.findViewById(R.id.count_input);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById4;
        this.f146661e = input;
        View viewFindViewById5 = view.findViewById(R.id.error_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f146662f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.save_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById6;
        this.f146663g = button;
        CountItem countItem = editCountFieldArguments.f146623b;
        textView.setText(countItem.f229363h);
        I5.a(textView2, countItem.f229360e, false);
        input.setHint(countItem.f229366k);
        final int i12 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_count_field.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f146618c;

            {
                this.f146618c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f146618c.f146660d.invoke(InterfaceC49125a.b.f440351a);
                        break;
                    default:
                        this.f146618c.f146658b.b();
                        break;
                }
            }
        });
        final int i13 = 1;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.edit_count_field.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f146618c;

            {
                this.f146618c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f146618c.f146660d.invoke(InterfaceC49125a.b.f440351a);
                        break;
                    default:
                        this.f146618c.f146658b.b();
                        break;
                }
            }
        });
        InterfaceC43160i interfaceC43160iA = y.a(com.avito.android.lib.design.input.n.a(input, 6).d0(l.f146620b));
        Lifecycle.State state = Lifecycle.State.f46682e;
        C43175k.K(new C43197r1(new m(this, null), C23069w.a(interfaceC43160iA, lifecycle, state)), c22977j);
        C43175k.K(new C43197r1(new n(this, null), C23069w.a(y.a(com.avito.android.lib.design.input.n.f(input).d0(k.f146619b).D(io.reactivex.rxjava3.internal.functions.a.f401991a)), lifecycle, state)), c22977j);
    }
}
