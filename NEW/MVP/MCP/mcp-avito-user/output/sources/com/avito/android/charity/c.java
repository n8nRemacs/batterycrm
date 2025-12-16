package com.avito.android.charity;

import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.maybe.h0;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.D;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.rx3.Q;
import l41.s;
import oo.InterfaceC44830a;

/* compiled from: CharityInteractor.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/charity/c;", "Lcom/avito/android/charity/a;", "a", "_avito_charity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.charity.a {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f118052c = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f118053a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44830a> f118054b;

    /* compiled from: CharityInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/charity/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_charity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public c(@k InterfaceC35745a5 interfaceC35745a5, @k h31.e<InterfaceC44830a> eVar) {
        this.f118053a = interfaceC35745a5;
        this.f118054b = eVar;
    }

    @Override // com.avito.android.charity.a
    @k
    public final h0 a(@k final String str, @k final CharitySource charitySource) {
        return new D(new C42007e(new s() { // from class: com.avito.android.charity.b
            @Override // l41.s
            public final Object get() {
                int i12 = c.f118052c;
                return Q.a(EmptyCoroutineContext.INSTANCE, new d(str, this, charitySource, null));
            }
        }), new e(str, charitySource)).l().p(this.f118053a.a());
    }
}
