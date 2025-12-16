package com.avito.android.profile_management_core.images;

import Y41.p;
import com.avito.android.error.z;
import com.avito.android.profile_management_core.images.a;
import com.avito.android.profile_management_core.images.entity.UploadImageState;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.remote.D0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.extended.modification.ModificationBody;
import com.avito.android.remote.model.extended.modification.ModificationResult;
import com.avito.android.remote.model.extended.modification.UploadImageModification;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.t1;

/* compiled from: ProfileManagementImageInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_management_core/images/a$c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$setImagesWithOrder$1", f = "ProfileManagementImageInteractor.kt", i = {0}, l = {231, 232}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class g extends SuspendLambda implements p<InterfaceC43172j<? super a.c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226721q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226722r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f226723s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f226724t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f226725u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f226726v;

    /* compiled from: ProfileManagementImageInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<String, UploadImageState> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f226727l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final UploadImageState invoke(String str) {
            return UploadImageState.Setting.f226708b;
        }
    }

    /* compiled from: ProfileManagementImageInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$setImagesWithOrder$1$2", f = "ProfileManagementImageInteractor.kt", i = {0, 1, 2, 4}, l = {256, 260, 271, 276, 278}, m = "invokeSuspend", n = {"uploadIds", "uploadIds", "error", "error"}, s = {"L$0", "L$0", "L$0", "L$0"})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f226728q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f226729r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ArrayList f226730s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.profile_management_core.images.d f226731t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f226732u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<a.c> f226733v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ArrayList f226734w;

        /* compiled from: ProfileManagementImageInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "valueId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a extends N implements Y41.l<String, UploadImageState> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Object f226735l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Map<String, ? extends ModerationStatus> map) {
                super(1);
                this.f226735l = map;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // Y41.l
            public final UploadImageState invoke(String str) {
                ModerationStatus moderationStatus = (ModerationStatus) this.f226735l.get(str);
                return moderationStatus != null ? com.avito.android.profile_management_core.images.entity.c.a(moderationStatus) : UploadImageState.Set.f226707b;
            }
        }

        /* compiled from: ProfileManagementImageInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "valueId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_management_core.images.g$b$b, reason: collision with other inner class name */
        public static final class C6882b extends N implements Y41.l<String, UploadImageState> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Map<String, Long> f226736l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Throwable f226737m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6882b(Throwable th2, Map map) {
                super(1);
                this.f226736l = map;
                this.f226737m = th2;
            }

            @Override // Y41.l
            public final UploadImageState invoke(String str) {
                Long l12 = this.f226736l.get(str);
                if (l12 == null) {
                    return null;
                }
                return new UploadImageState.SettingError(z.l(this.f226737m), l12.longValue());
            }
        }

        /* compiled from: ProfileManagementImageInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/profile_management_core/images/entity/UploadImageState;", "valueId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class c extends N implements Y41.l<String, UploadImageState> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Map<String, Long> f226738l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Map<String, Long> map) {
                super(1);
                this.f226738l = map;
            }

            @Override // Y41.l
            public final UploadImageState invoke(String str) {
                Long l12 = this.f226738l.get(str);
                if (l12 != null) {
                    return new UploadImageState.Uploaded(l12.longValue());
                }
                return null;
            }
        }

        /* compiled from: ProfileManagementImageInteractor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/extended/modification/ModificationResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile_management_core.images.ProfileManagementImageInteractorImpl$setImagesWithOrder$1$2$deferred$1", f = "ProfileManagementImageInteractor.kt", i = {}, l = {244}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements p<T, Continuation<? super TypedResult<ModificationResult>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f226739q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.profile_management_core.images.d f226740r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f226741s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ LinkedHashMap f226742t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ ArrayList f226743u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(com.avito.android.profile_management_core.images.d dVar, String str, LinkedHashMap linkedHashMap, ArrayList arrayList, Continuation continuation) {
                super(2, continuation);
                this.f226740r = dVar;
                this.f226741s = str;
                this.f226742t = linkedHashMap;
                this.f226743u = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new d(this.f226740r, this.f226741s, this.f226742t, this.f226743u, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super TypedResult<ModificationResult>> continuation) {
                return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f226739q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.profile_management_core.images.d dVar = this.f226740r;
                    D0 d02 = dVar.f226640a.get();
                    Gson gson = dVar.f226646g.get();
                    LinkedHashMap linkedHashMap = this.f226742t;
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        arrayList.add(new UploadImageModification.Operation((String) entry.getKey(), UploadImageModification.OperationType.ADD, new UploadImageModification.Operation.Value(((Number) entry.getValue()).longValue()), null, 8, null));
                    }
                    ArrayList arrayList2 = this.f226743u;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new UploadImageModification.OrderItem((String) it.next()));
                    }
                    String strL = gson.l(new ModificationBody(Collections.singletonList(new UploadImageModification(this.f226741s, arrayList, arrayList3))));
                    this.f226739q = 1;
                    obj = d02.e(strL, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList arrayList, com.avito.android.profile_management_core.images.d dVar, String str, InterfaceC43172j interfaceC43172j, ArrayList arrayList2, Continuation continuation) {
            super(2, continuation);
            this.f226730s = arrayList;
            this.f226731t = dVar;
            this.f226732u = str;
            this.f226733v = interfaceC43172j;
            this.f226734w = arrayList2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f226730s, this.f226731t, this.f226732u, this.f226733v, this.f226734w, continuation);
            bVar.f226729r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00e7 A[Catch: all -> 0x00f6, TryCatch #2 {all -> 0x00f6, blocks: (B:56:0x00e1, B:58:0x00e7, B:60:0x00f3, B:65:0x00fc, B:71:0x0122, B:73:0x0126, B:74:0x0137, B:75:0x0138, B:76:0x013d, B:53:0x00d6), top: B:100:0x00d6 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0122 A[Catch: all -> 0x00f6, TRY_ENTER, TryCatch #2 {all -> 0x00f6, blocks: (B:56:0x00e1, B:58:0x00e7, B:60:0x00f3, B:65:0x00fc, B:71:0x0122, B:73:0x0126, B:74:0x0137, B:75:0x0138, B:76:0x013d, B:53:0x00d6), top: B:100:0x00d6 }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0149 A[Catch: all -> 0x0032, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002d, B:94:0x0191, B:15:0x0035, B:18:0x003e, B:86:0x0162, B:81:0x0145, B:83:0x0149, B:91:0x0177), top: B:99:0x0015 }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0173 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0177 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #1 {all -> 0x0032, blocks: (B:12:0x002d, B:94:0x0191, B:15:0x0035, B:18:0x003e, B:86:0x0162, B:81:0x0145, B:83:0x0149, B:91:0x0177), top: B:99:0x0015 }] */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_management_core.images.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, String str, ArrayList arrayList, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.f226723s = dVar;
        this.f226724t = str;
        this.f226725u = arrayList;
        this.f226726v = arrayList2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f226723s, this.f226724t, this.f226725u, this.f226726v, continuation);
        gVar.f226722r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super a.c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226721q;
        ArrayList arrayList = this.f226725u;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f226722r;
            d dVar = this.f226723s;
            N0 n02 = (N0) dVar.f226649j.get(this.f226724t);
            if (n02 != null) {
                n02.c(null);
            }
            a.c.b bVar = new a.c.b(d.n(dVar, arrayList, a.f226727l));
            this.f226722r = interfaceC43172j2;
            this.f226721q = 1;
            if (interfaceC43172j2.emit(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            InterfaceC43172j interfaceC43172j3 = (InterfaceC43172j) this.f226722r;
            C42729a0.b(obj);
            interfaceC43172j = interfaceC43172j3;
        }
        b bVar2 = new b(arrayList, this.f226723s, this.f226724t, interfaceC43172j, this.f226726v, null);
        this.f226722r = null;
        this.f226721q = 2;
        if (t1.c(bVar2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
