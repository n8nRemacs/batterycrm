package com.avito.android.component.snackbar;

import X41.i;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.avito.android.component.snackbar.d;
import com.avito.android.component.snackbar.e;
import com.avito.android.util.C35777d6;
import com.avito.android.util.C35835l0;
import com.avito.android.util.TypefaceType;
import com.google.android.material.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Snackbars.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0016\u0010\u0002\"\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0003"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "ActionHandler", "_avito_ui-messages_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
@i
/* loaded from: classes12.dex */
public final class h {
    @k
    public static final TextView a(@k d dVar) {
        View viewFindViewById = dVar.f125236a.f357285i.findViewById(R.id.snackbar_text);
        if (viewFindViewById != null) {
            return (TextView) viewFindViewById;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    @k
    public static final void b(@k d dVar) {
        View viewFindViewById = dVar.f125236a.f357285i.findViewById(R.id.snackbar_action);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        Button button = (Button) viewFindViewById;
        Context context = button.getContext();
        TypefaceType typefaceType = TypefaceType.f318743c;
        int i12 = C35777d6.f318863a;
        button.setTypeface(androidx.core.content.res.i.c(C35835l0.j(com.avito.android.R.attr.fontHeavy, context), context));
        button.setTextSize(0, button.getResources().getDimension(com.avito.android.R.dimen.snackbar_text));
    }

    public static d c(View view, CharSequence charSequence, int i12, e.b bVar, String str, Y41.a aVar, Y41.a aVar2, int i13) {
        d dVarB = d.a.b(d.f125235c, view, charSequence, (i13 & 2) != 0 ? -1 : i12, (i13 & 4) != 0 ? e.a.f125238a : bVar, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? 2 : 3, (i13 & 32) != 0 ? null : aVar, (i13 & 64) != 0 ? f.f125242l : aVar2, 0, 0, 1536);
        dVarB.b();
        return dVarB;
    }

    public static void d(View view, int i12, e.b bVar, int i13) {
        e eVar = bVar;
        if ((i13 & 4) != 0) {
            eVar = e.a.f125238a;
        }
        g gVar = g.f125243l;
        String string = view.getResources().getString(i12);
        d.a.b(d.f125235c, view, string, -1, eVar, null, 2, null, gVar, 0, 0, 1536).b();
    }
}
