package Iw0;

import Bw0.i;
import Y61.k;
import com.avito.android.di.module.C30134o2;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CancelSilentUpdateLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LIw0/d;", "Ldagger/internal/h;", "LIw0/c;", "a", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Iw0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14169d implements h<C14168c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f8634b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30134o2 f8635a;

    /* compiled from: CancelSilentUpdateLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIw0/d$a;", "", "<init>", "()V", "_avito_silent-update-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Iw0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14169d(@k C30134o2 c30134o2) {
        this.f8635a = c30134o2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f8635a.get();
        f8634b.getClass();
        return new C14168c(iVar);
    }
}
