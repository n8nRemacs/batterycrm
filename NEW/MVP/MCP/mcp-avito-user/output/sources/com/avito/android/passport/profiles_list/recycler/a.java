package com.avito.android.passport.profiles_list.recycler;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfileListButtonItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profiles_list/recycler/a;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/passport/profiles_list/recycler/f;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f213863d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f213864b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Context f213865c;

    public a(@Y61.k View view) {
        super(view);
        this.f213864b = (Button) view.findViewById(R.id.profiles_list_bottom_sheet_add_button);
        this.f213865c = view.getContext();
    }

    @Override // com.avito.android.passport.profiles_list.recycler.f
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f213864b.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(15, aVar));
    }

    @Override // com.avito.android.passport.profiles_list.recycler.f
    public final void y(@Y61.k PrintableText printableText) {
        this.f213864b.setText(printableText.k0(this.f213865c));
    }
}
