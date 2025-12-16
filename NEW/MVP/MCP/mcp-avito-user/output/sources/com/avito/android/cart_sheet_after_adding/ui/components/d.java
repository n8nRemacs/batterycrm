package com.avito.android.cart_sheet_after_adding.ui.components;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import gn.C40709a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.sequences.InterfaceC43030m;
import kotlin.sequences.o0;

/* compiled from: BottomFormContent.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/ui/components/d;", "LB0/h;", "Lgn/a;", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements B0.h<C40709a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43030m<C40709a> f115528a;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        A a12 = new A();
        C40709a c40709a = new C40709a(null);
        o0.a aVar = (o0.a) a12.f115521a.iterator();
        if (!aVar.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Q q12 = (Q) aVar.next();
        this.f115528a = C42756l.f(new C40709a[]{c40709a, new C40709a(new C40709a.C11226a((AttributedText) q12.f406619b, (List) q12.f406620c))});
    }

    @Override // B0.h
    @Y61.k
    public final InterfaceC43030m<C40709a> a() {
        return this.f115528a;
    }
}
