package com.avito.android.messenger;

import android.app.Activity;
import com.avito.android.L;
import com.avito.android.messenger.o0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.InterfaceC35745a5;
import id.C41383a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: HashIdChangeUiControllerImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/v;", "Lcom/avito/android/messenger/u;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32573v implements InterfaceC32572u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.L f197450a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41383a f197451b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f197452c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final w0 f197453d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<kotlin.Q<Boolean, String>> f197454e = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f197455f = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: HashIdChangeUiControllerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/n0;", "condition", "Lcom/avito/android/messenger/o0;", "newEvent", "apply", "(Lcom/avito/android/messenger/n0;Lcom/avito/android/messenger/o0;)Lcom/avito/android/messenger/n0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.v$a */
    public static final class a<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T1, T2, R> f197456b = new a<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            n0 n0Var;
            n0 n0Var2 = (n0) obj;
            o0 o0Var = (o0) obj2;
            boolean z12 = n0Var2.f196914a;
            boolean z13 = n0Var2.f196915b;
            if (z12 && z13) {
                if (o0Var instanceof o0.a) {
                    return new n0(true, false);
                }
                if (o0Var instanceof o0.b) {
                    return new n0(false, o0Var instanceof o0.b.a);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (o0Var instanceof o0.a) {
                n0Var = new n0(true, z13);
            } else {
                if (!(o0Var instanceof o0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                n0Var = new n0(z12, o0Var instanceof o0.b.a);
            }
            return n0Var;
        }
    }

    /* compiled from: HashIdChangeUiControllerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/n0;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/n0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.v$c */
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C32573v c32573v = C32573v.this;
            Activity activity = c32573v.f197451b.get();
            if (activity != null) {
                activity.startActivity(L.a.a(c32573v.f197450a, null, 3).addFlags(268468224));
                activity.finish();
            }
        }
    }

    /* compiled from: HashIdChangeUiControllerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/p0;", "it", "Lcom/avito/android/messenger/o0$a;", "apply", "(Lru/avito/messenger/p0;)Lcom/avito/android/messenger/o0$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.v$d */
    public static final class d<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T, R> f197459b = new d<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return o0.a.f196928a;
        }
    }

    /* compiled from: HashIdChangeUiControllerImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/avito/android/messenger/o0$b;", VoiceInfo.STATE, "Lkotlin/Q;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 1>", "apply", "(Lcom/avito/android/messenger/o0$b;Lkotlin/Q;)Lcom/avito/android/messenger/o0$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.messenger.v$e */
    public static final class e<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T1, T2, R> f197460b = new e<>();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            o0.b bVar = (o0.b) obj;
            kotlin.Q q12 = (kotlin.Q) obj2;
            boolean zBooleanValue = ((Boolean) q12.f406619b).booleanValue();
            String str = (String) q12.f406620c;
            return zBooleanValue ? new o0.b.a(str) : ((bVar instanceof o0.b.a) && kotlin.jvm.internal.L.f(((o0.b.a) bVar).f196929a, str)) ? o0.b.C5793b.f196930a : bVar;
        }
    }

    public C32573v(@Y61.k com.avito.android.L l12, @Y61.k C41383a c41383a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k w0 w0Var) {
        this.f197450a = l12;
        this.f197451b = c41383a;
        this.f197452c = interfaceC35745a5;
        this.f197453d = w0Var;
    }

    @Override // com.avito.android.messenger.InterfaceC32572u
    public final void a(@Y61.k String str) {
        this.f197454e.accept(new kotlin.Q<>(Boolean.TRUE, str));
    }

    @Override // com.avito.android.messenger.InterfaceC32572u
    public final void b(@Y61.k String str) {
        this.f197454e.accept(new kotlin.Q<>(Boolean.FALSE, str));
    }

    @Override // com.avito.android.messenger.InterfaceC32572u
    public final void c() {
        io.reactivex.rxjava3.disposables.c cVar = this.f197455f;
        cVar.e();
        io.reactivex.rxjava3.core.z zVarG0 = io.reactivex.rxjava3.core.z.g0(this.f197453d.getF196366h().d0(d.f197459b), this.f197454e.o0(o0.b.C5793b.f196930a, e.f197460b));
        InterfaceC35745a5 interfaceC35745a5 = this.f197452c;
        cVar.b(zVarG0.x0(interfaceC35745a5.a()).o0(new n0(false, false), a.f197456b).N(new l41.r() { // from class: com.avito.android.messenger.v.b
            @Override // l41.r
            public final boolean test(Object obj) {
                n0 n0Var = (n0) obj;
                return n0Var.f196914a && n0Var.f196915b;
            }
        }).j0(interfaceC35745a5.e()).t0(new c()));
    }
}
