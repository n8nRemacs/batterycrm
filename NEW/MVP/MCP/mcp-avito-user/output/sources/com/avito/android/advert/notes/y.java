package com.avito.android.advert.notes;

import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.util.AbstractC35956u5;
import com.avito.android.util.P5;
import kotlin.Metadata;

/* compiled from: EditAdvertNoteView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/notes/y;", "Lcom/avito/android/advert/notes/w;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class y implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f80951a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<v> f80952b = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f80953c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    public final EditText f80954d;

    /* renamed from: e, reason: collision with root package name */
    public final View f80955e;

    /* renamed from: f, reason: collision with root package name */
    public final MenuItem f80956f;

    /* compiled from: EditAdvertNoteView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/notes/y$a", "Lcom/avito/android/util/u5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC35956u5 {
        public a() {
        }

        @Override // com.avito.android.util.AbstractC35956u5, android.text.TextWatcher
        public final void onTextChanged(@Y61.k CharSequence charSequence, int i12, int i13, int i14) {
            y.this.f80953c.accept(charSequence.toString());
        }
    }

    public y(@Y61.k View view, @Y61.k String str) {
        this.f80951a = view;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        EditText editText = (EditText) view.findViewById(R.id.edit_text);
        this.f80954d = editText;
        this.f80955e = view.findViewById(R.id.progress_bar_container);
        toolbar.setTitle(str);
        toolbar.setNavigationIcon(R.drawable.ic_close_24_blue);
        toolbar.setNavigationOnClickListener(new B(this, 8));
        if (!toolbar.getMenu().hasVisibleItems()) {
            toolbar.m(R.menu.advert_create_note);
            P5.f(toolbar, R.attr.blue);
            MenuItem menuItemFindItem = toolbar.getMenu().findItem(R.id.menu_save_note);
            this.f80956f = menuItemFindItem;
            com.avito.android.ui.d.a(menuItemFindItem, new x(this, 0));
        }
        editText.addTextChangedListener(new a());
    }
}
