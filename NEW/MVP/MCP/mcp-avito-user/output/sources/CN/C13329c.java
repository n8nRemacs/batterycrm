package Cn;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartSnippetActionsApi_Module_ProvideCartSnippetActionsApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LCn/c;", "Ldagger/internal/h;", "LCn/a;", "a", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cn.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13329c implements h<InterfaceC13327a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f2668b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f2669a;

    /* compiled from: CartSnippetActionsApi_Module_ProvideCartSnippetActionsApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCn/c$a;", "", "<init>", "()V", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cn.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C13329c(@k f fVar) {
        this.f2669a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f2669a.get();
        f2668b.getClass();
        C13328b.f2667a.getClass();
        InterfaceC13327a interfaceC13327a = (InterfaceC13327a) r02.create(InterfaceC13327a.class);
        t.b(interfaceC13327a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC13327a;
    }
}
