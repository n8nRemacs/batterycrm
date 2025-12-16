package com.avito.android.advert.notes;

import android.view.MenuItem;
import com.avito.android.R;
import com.avito.android.component.snackbar.e;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: EditAdvertNotePresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/advert/notes/UpdateAdvertNoteResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f80915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f80916c;

    /* compiled from: EditAdvertNotePresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80917a;

        static {
            int[] iArr = new int[UpdateAdvertNoteResult.values().length];
            try {
                UpdateAdvertNoteResult updateAdvertNoteResult = UpdateAdvertNoteResult.f80878b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f80917a = iArr;
        }
    }

    public k(t tVar, String str) {
        this.f80915b = tVar;
        this.f80916c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        y yVar;
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.c;
        t tVar = this.f80915b;
        if (z12) {
            y yVar2 = tVar.f80937l;
            if (yVar2 != null) {
                D6.H(yVar2.f80955e);
                MenuItem menuItem = yVar2.f80956f;
                (menuItem != null ? menuItem : null).setEnabled(false);
                yVar2.f80954d.setEnabled(false);
                return;
            }
            return;
        }
        if (p22 instanceof P2.b) {
            int i12 = a.f80917a[((UpdateAdvertNoteResult) ((P2.b) p22).f318720a).ordinal()];
            String str = this.f80916c;
            if (i12 == 1) {
                tVar.f80936k.b(tVar.f80931f.b(tVar.f80926a, tVar.f80933h).n(new q(tVar)).s(tVar.f80930e.e()).x(new r(tVar, str), s.f80925b));
                return;
            } else {
                t.c(tVar, str, 2);
                return;
            }
        }
        if (!(p22 instanceof P2.a) || (yVar = tVar.f80937l) == null) {
            return;
        }
        D6.g(yVar.f80955e);
        e.b.f125239c.getClass();
        com.avito.android.component.snackbar.h.d(yVar.f80951a, R.string.advert_details_save_note_error_was_occurred, new e.b(null, null, null), 250);
        MenuItem menuItem2 = yVar.f80956f;
        (menuItem2 != null ? menuItem2 : null).setEnabled(true);
        yVar.f80954d.setEnabled(true);
    }
}
