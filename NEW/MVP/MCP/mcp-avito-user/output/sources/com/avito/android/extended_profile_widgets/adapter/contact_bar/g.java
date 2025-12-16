package com.avito.android.extended_profile_widgets.adapter.contact_bar;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContactBarItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/contact_bar/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/contact_bar/f;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f154367f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f154368b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f154369c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f154370d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f154371e;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_contact_bar_item_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f154368b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_contact_bar_reply_speed);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154369c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.extended_profile_contact_bar_call_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f154370d = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.extended_profile_contact_bar_write_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f154371e = (Button) viewFindViewById4;
    }

    public static void B80(Button button, ContactBar.Button.Action action, ContactBar.c cVar) {
        if (action == null) {
            D6.w(button);
            return;
        }
        D6.H(button);
        com.avito.android.lib.design.button.b.a(button, action.f125038b, false);
        button.setEnabled(!action.f125046j);
        button.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(4, cVar, action));
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.contact_bar.f
    public final int Jb() {
        Rect rect = new Rect();
        View view = this.f154368b;
        if (view.getHeight() <= 0) {
            return 0;
        }
        view.getGlobalVisibleRect(rect);
        return (int) ((((rect.top < 0 || rect.bottom < 0) ? 0.0f : rect.height()) / view.getHeight()) * 100);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.contact_bar.f
    public final void h30(@k ContactBarItem contactBarItem, @k ContactBar.c cVar) {
        I5.a(this.f154369c, contactBarItem.f154357g, false);
        B80(this.f154370d, contactBarItem.f154354d, cVar);
        B80(this.f154371e, contactBarItem.f154355e, cVar);
    }
}
