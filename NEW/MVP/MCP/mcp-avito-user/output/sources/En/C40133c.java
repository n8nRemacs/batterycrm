package en;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartSheetAfterAddingApi_Module_ProvideCartSheetAfterAddingApiFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Len/c;", "Ldagger/internal/h;", "Len/a;", "a", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: en.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C40133c implements h<InterfaceC40131a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f395357b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f395358a;

    /* compiled from: CartSheetAfterAddingApi_Module_ProvideCartSheetAfterAddingApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Len/c$a;", "", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: en.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40133c(@k f fVar) {
        this.f395358a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f395358a.get();
        f395357b.getClass();
        C40132b.f395356a.getClass();
        InterfaceC40131a interfaceC40131a = (InterfaceC40131a) r02.create(InterfaceC40131a.class);
        t.b(interfaceC40131a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC40131a;
    }
}
