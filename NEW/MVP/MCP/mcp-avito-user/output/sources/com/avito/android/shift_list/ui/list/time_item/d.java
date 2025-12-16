package com.avito.android.shift_list.ui.list.time_item;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.service_booking_calendar.flexible.header.toolbar.g;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShiftTimeItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/shift_list/ui/list/time_item/d;", "Lcom/avito/android/shift_list/ui/list/time_item/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f281160e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f281161b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f281162c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f281163d;

    public d(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f281161b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f281162c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.title_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f281163d = (Button) viewFindViewById3;
    }

    @Override // com.avito.android.shift_list.ui.list.time_item.c
    public final void Tl(@k ShiftTimeItem shiftTimeItem, @k l<? super DeepLink, G0> lVar) {
        I5.a(this.f281161b, shiftTimeItem.f281153c, false);
        String str = shiftTimeItem.f281154d;
        int i12 = str != null ? 0 : 8;
        TextView textView = this.f281162c;
        textView.setVisibility(i12);
        I5.a(textView, str, false);
        Action action = shiftTimeItem.f281155e;
        int i13 = action != null ? 0 : 8;
        Button button = this.f281163d;
        button.setVisibility(i13);
        if (action != null) {
            com.avito.android.lib.design.button.b.a(button, action.f281150b, false);
            button.setOnClickListener(new g(13, (Object) lVar, (Object) action));
        }
    }
}
