package Kh0;

import Kh0.e;
import Y61.k;
import Y61.l;
import android.text.Editable;
import com.avito.android.util.C5;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingCounterTextWatcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKh0/c;", "LKh0/b;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    public final int f9620b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f9621c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public e f9622d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Integer f9623e;

    public c(int i12, @k d dVar) {
        this.f9620b = i12;
        this.f9621c = dVar;
    }

    @k
    public final e a(@l String str) {
        Integer numA = str != null ? C5.a(str) : null;
        int i12 = this.f9620b;
        if (numA == null) {
            return new e.b(i12);
        }
        if (numA.intValue() <= 0) {
            return new e.b(i12);
        }
        return numA.intValue() > i12 ? new e.a(numA.intValue(), i12) : new e.c(numA.intValue(), i12);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
        Integer numValueOf = charSequence != null ? Integer.valueOf(charSequence.length()) : null;
        if (L.f(this.f9623e, numValueOf)) {
            return;
        }
        this.f9623e = numValueOf;
        e eVarA = a(charSequence != null ? charSequence.toString() : null);
        this.f9621c.O10(eVarA);
        this.f9622d = eVarA;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(@l Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(@l CharSequence charSequence, int i12, int i13, int i14) {
    }
}
