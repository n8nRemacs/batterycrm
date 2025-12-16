package com.avito.android.advert.notes;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.notes.di.a;
import com.avito.android.advert.notes.j;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.advert_details.ContactBarData;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EditAdvertNoteActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/notes/EditAdvertNoteActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/advert/notes/j$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EditAdvertNoteActivity extends com.avito.android.ui.activity.a implements j.a, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public j f80877m;

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.ac_advert_details_edit_note, (ViewGroup) null, false);
        setContentView(viewInflate);
        String stringExtra = getIntent().getStringExtra("advert_id");
        ContactBarData contactBarData = (ContactBarData) getIntent().getParcelableExtra("contact_bar_data");
        String stringExtra2 = getIntent().getStringExtra("advert_note");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        boolean z12 = bundle != null;
        boolean booleanExtra = getIntent().getBooleanExtra("is_favorite", false);
        String stringExtra3 = getIntent().getStringExtra("search_context");
        a.InterfaceC2396a interfaceC2396aA = com.avito.android.advert.notes.di.d.a();
        interfaceC2396aA.e((com.avito.android.advert.notes.di.b) C29972i.a(C29972i.b(this), com.avito.android.advert.notes.di.b.class));
        interfaceC2396aA.r(stringExtra);
        interfaceC2396aA.c(contactBarData);
        interfaceC2396aA.a(stringExtra2);
        interfaceC2396aA.d(z12);
        interfaceC2396aA.b(booleanExtra);
        interfaceC2396aA.n(stringExtra3);
        interfaceC2396aA.build().a(this);
        String stringExtra4 = getIntent().getStringExtra("advert_title");
        String str = stringExtra4 != null ? stringExtra4 : "";
        j jVar = this.f80877m;
        (jVar != null ? jVar : null).a(new y(viewInflate, str));
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        j jVar = this.f80877m;
        if (jVar == null) {
            jVar = null;
        }
        jVar.e0();
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        j jVar = this.f80877m;
        if (jVar == null) {
            jVar = null;
        }
        jVar.b(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        j jVar = this.f80877m;
        if (jVar == null) {
            jVar = null;
        }
        jVar.c0();
        super.onStop();
    }
}
