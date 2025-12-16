package com.google.firebase.ktx;

import Y61.k;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.firebase.components.f;
import com.google.firebase.components.n;
import com.google.firebase.components.u;
import gZ0.InterfaceC40638a;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.A0;
import kotlinx.coroutines.M;

/* compiled from: Firebase.kt */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lcom/google/firebase/components/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
@InterfaceC42830m
/* loaded from: classes6.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/c;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/M;", "create", "(Lcom/google/firebase/components/c;)Lkotlinx/coroutines/M;", "BZ0/c", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a<T> implements f {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f361720b = new a<>();

        @Override // com.google.firebase.components.f
        public final Object a(com.google.firebase.components.c cVar) {
            return A0.b((Executor) cVar.f(new u<>(InterfaceC40638a.class, Executor.class)));
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/c;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/M;", "create", "(Lcom/google/firebase/components/c;)Lkotlinx/coroutines/M;", "BZ0/c", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class b<T> implements f {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f361721b = new b<>();

        @Override // com.google.firebase.components.f
        public final Object a(com.google.firebase.components.c cVar) {
            return A0.b((Executor) cVar.f(new u<>(gZ0.c.class, Executor.class)));
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/c;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/M;", "create", "(Lcom/google/firebase/components/c;)Lkotlinx/coroutines/M;", "BZ0/c", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class c<T> implements f {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f361722b = new c<>();

        @Override // com.google.firebase.components.f
        public final Object a(com.google.firebase.components.c cVar) {
            return A0.b((Executor) cVar.f(new u<>(gZ0.b.class, Executor.class)));
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T", "Lcom/google/firebase/components/c;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/M;", "create", "(Lcom/google/firebase/components/c;)Lkotlinx/coroutines/M;", "BZ0/c", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class d<T> implements f {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f361723b = new d<>();

        @Override // com.google.firebase.components.f
        public final Object a(com.google.firebase.components.c cVar) {
            return A0.b((Executor) cVar.f(new u<>(gZ0.d.class, Executor.class)));
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @k
    public List<com.google.firebase.components.b<?>> getComponents() {
        b.C10697b c10697bA = com.google.firebase.components.b.a(new u(InterfaceC40638a.class, M.class));
        c10697bA.a(new n((u<?>) new u(InterfaceC40638a.class, Executor.class), 1, 0));
        c10697bA.c(a.f361720b);
        com.google.firebase.components.b bVarB = c10697bA.b();
        b.C10697b c10697bA2 = com.google.firebase.components.b.a(new u(gZ0.c.class, M.class));
        c10697bA2.a(new n((u<?>) new u(gZ0.c.class, Executor.class), 1, 0));
        c10697bA2.c(b.f361721b);
        com.google.firebase.components.b bVarB2 = c10697bA2.b();
        b.C10697b c10697bA3 = com.google.firebase.components.b.a(new u(gZ0.b.class, M.class));
        c10697bA3.a(new n((u<?>) new u(gZ0.b.class, Executor.class), 1, 0));
        c10697bA3.c(c.f361722b);
        com.google.firebase.components.b bVarB3 = c10697bA3.b();
        b.C10697b c10697bA4 = com.google.firebase.components.b.a(new u(gZ0.d.class, M.class));
        c10697bA4.a(new n((u<?>) new u(gZ0.d.class, Executor.class), 1, 0));
        c10697bA4.c(d.f361723b);
        return C42745f0.U(bVarB, bVarB2, bVarB3, c10697bA4.b());
    }
}
