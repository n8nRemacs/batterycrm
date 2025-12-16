package com.avito.android.advert.notes;

import android.content.Intent;
import android.widget.EditText;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.notes.di.c;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EditAdvertNotePresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/notes/t;", "Lcom/avito/android/advert/notes/j;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class t implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f80926a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ContactBarData f80927b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f80928c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final c f80929d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f80930e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f80931f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f80932g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f80933h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f80934i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f80935j = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f80936k = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public y f80937l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public EditAdvertNoteActivity f80938m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public String f80939n;

    @Inject
    public t(@c.a @Y61.k String str, @c.InterfaceC2397c @Y61.l ContactBarData contactBarData, @c.b @Y61.k String str2, @Y61.k c cVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.favorite.h hVar, @c.e boolean z12, @c.d boolean z13, @c.f @Y61.l String str3) {
        this.f80926a = str;
        this.f80927b = contactBarData;
        this.f80928c = str2;
        this.f80929d = cVar;
        this.f80930e = interfaceC35745a5;
        this.f80931f = hVar;
        this.f80932g = z12;
        this.f80933h = z13;
        this.f80934i = str3;
    }

    public static void c(t tVar, String str, int i12) {
        if ((i12 & 1) != 0) {
            str = "";
        }
        boolean z12 = (i12 & 2) != 0 ? !L.f(tVar.f80928c, str) : false;
        EditAdvertNoteActivity editAdvertNoteActivity = tVar.f80938m;
        if (editAdvertNoteActivity != null) {
            if (z12) {
                Intent intent = new Intent();
                intent.putExtra("advert_result_note", str);
                G0 g02 = G0.f406611a;
                editAdvertNoteActivity.setResult(-1, intent);
            }
            editAdvertNoteActivity.finish();
        }
    }

    @Override // com.avito.android.advert.notes.j
    public final void a(@Y61.k y yVar) {
        this.f80937l = yVar;
        InterfaceC35745a5 interfaceC35745a5 = this.f80930e;
        io.reactivex.rxjava3.disposables.d dVarT0 = yVar.f80952b.j0(interfaceC35745a5.e()).t0(new o(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f80935j;
        cVar.b(dVarT0);
        y yVar2 = this.f80937l;
        if (yVar2 == null) {
            throw new IllegalArgumentException("View is null");
        }
        cVar.b(yVar2.f80953c.j0(interfaceC35745a5.e()).K(new m(this)).t0(new n(this)));
        EditText editText = yVar.f80954d;
        K2.j(editText, 1);
        if (this.f80932g) {
            return;
        }
        editText.setEnabled(true);
        String str = this.f80928c;
        editText.setText(str);
        editText.setSelection(str != null ? str.length() : 0);
    }

    @Override // com.avito.android.advert.notes.j
    public final void b(@Y61.k EditAdvertNoteActivity editAdvertNoteActivity) {
        this.f80938m = editAdvertNoteActivity;
    }

    @Override // com.avito.android.advert.notes.j
    public final void c0() {
        this.f80938m = null;
    }

    @Override // com.avito.android.advert.notes.j
    public final void e0() {
        this.f80935j.e();
        this.f80936k.e();
        this.f80937l = null;
    }
}
