package dn;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.cart_sheet_after_adding.ui.CartSheetAfterAddingArguments;
import com.avito.android.util.C35792f5;
import dagger.internal.h;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartSheetAfterAddingModule_ProvideSearchContextFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Ldn/f;", "Ldagger/internal/h;", "Lcom/avito/android/util/f5;", "a", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dn.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C39763f implements h<C35792f5> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f394051b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f394052a;

    /* compiled from: CartSheetAfterAddingModule_ProvideSearchContextFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldn/f$a;", "", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dn.f$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C39763f(@k l lVar) {
        this.f394052a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        CartSheetAfterAddingArguments cartSheetAfterAddingArguments = (CartSheetAfterAddingArguments) this.f394052a.f393949a;
        f394051b.getClass();
        C39760c.f394046a.getClass();
        return new C35792f5(cartSheetAfterAddingArguments.f115459c);
    }
}
