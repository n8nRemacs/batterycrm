package com.avito.android.rating_form.step;

import android.content.ContentResolver;
import android.net.Uri;
import com.avito.android.J0;
import com.avito.android.di.B;
import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.api.remote.model.RatingFormField;
import com.avito.android.rating_form.step.z;
import com.avito.android.util.R0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import zZ.InterfaceC50529c;

/* compiled from: RatingFormFileInteractor.kt */
@B
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/step/f;", "", "a", "b", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f249472j = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RatingFormStepArguments f249473a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ContentResolver f249474b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Vg0.d f249475c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final J0 f249476d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f249477e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.m f249478f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C43238h f249479g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Z1<Map<FieldIdentifier, List<com.avito.android.rating_form.step.e>>> f249480h = p2.a(P0.c());

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList f249481i = new ArrayList();

    /* compiled from: RatingFormFileInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_form/step/f$a;", "", "<init>", "()V", "", "KEY_FID", "Ljava/lang/String;", "KEY_FILE", "KEY_FILE_KEY", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingFormFileInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/f$b;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final N0 f249482a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.rating_form.step.e f249483b;

        public b(@Y61.k N0 n02, @Y61.k com.avito.android.rating_form.step.e eVar) {
            this.f249482a = n02;
            this.f249483b = eVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f249482a, bVar.f249482a) && L.f(this.f249483b, bVar.f249483b);
        }

        public final int hashCode() {
            return this.f249483b.hashCode() + (this.f249482a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "LocalFileInfo(job=" + this.f249482a + ", file=" + this.f249483b + ')';
        }
    }

    /* compiled from: RatingFormFileInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f249484a;

        static {
            int[] iArr = new int[RatingFormField.Validation.Rule.values().length];
            try {
                iArr[RatingFormField.Validation.Rule.FILE_SIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RatingFormField.Validation.Rule.FILE_EXTENSIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f249484a = iArr;
        }
    }

    /* compiled from: RatingFormFileInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.RatingFormFileInteractor$addFiles$2", f = "RatingFormFileInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ FieldIdentifier f249486r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List<RatingFormField.FileInfo> f249487s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(FieldIdentifier fieldIdentifier, List<RatingFormField.FileInfo> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f249486r = fieldIdentifier;
            this.f249487s = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return f.this.new d(this.f249486r, this.f249487s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            ArrayList arrayList;
            Object next;
            com.avito.android.rating_form.step.e eVar;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            f fVar = f.this;
            LinkedHashMap linkedHashMap = new LinkedHashMap(fVar.f249480h.getValue());
            FieldIdentifier fieldIdentifier = this.f249486r;
            Collection collection = (List) linkedHashMap.get(fieldIdentifier);
            if (collection == null) {
                collection = C42784z0.f406748b;
            }
            ArrayList arrayList2 = new ArrayList(collection);
            ?? arrayList3 = 0;
            List<RatingFormField.FileInfo> list = this.f249487s;
            if (list != null) {
                arrayList = new ArrayList();
                for (RatingFormField.FileInfo fileInfo : list) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        com.avito.android.rating_form.step.e eVar2 = (com.avito.android.rating_form.step.e) next;
                        if ((eVar2.f249471e instanceof z.b) && L.f(fileInfo.getKey(), ((z.b) eVar2.f249471e).f249765a)) {
                            break;
                        }
                    }
                    if (((com.avito.android.rating_form.step.e) next) != null) {
                        eVar = null;
                    } else {
                        long jA2 = fVar.f249476d.a();
                        String name = fileInfo.getName();
                        String size = fileInfo.getSize();
                        eVar = new com.avito.android.rating_form.step.e(jA2, null, name, size != null ? C43066x.z0(size) : null, new z.b(fileInfo.getKey()));
                    }
                    if (eVar != null) {
                        arrayList.add(eVar);
                    }
                }
            } else {
                arrayList = null;
            }
            ArrayList arrayList4 = fVar.f249481i;
            if (arrayList != null) {
                arrayList3 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new b(Q0.a(), (com.avito.android.rating_form.step.e) it2.next()));
                }
            }
            if (arrayList3 == 0) {
                arrayList3 = C42784z0.f406748b;
            }
            arrayList4.addAll((Collection) arrayList3);
            RandomAccess randomAccess = arrayList;
            if (arrayList == null) {
                randomAccess = C42784z0.f406748b;
            }
            arrayList2.addAll((Collection) randomAccess);
            linkedHashMap.put(fieldIdentifier, arrayList2);
            fVar.f249480h.setValue(linkedHashMap);
            return G0.f406611a;
        }
    }

    /* compiled from: RatingFormFileInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.step.RatingFormFileInteractor$uploadFile$job$1", f = "RatingFormFileInteractor.kt", i = {}, l = {92, 95, 96, 103}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public f f249488q;

        /* renamed from: r, reason: collision with root package name */
        public FieldIdentifier f249489r;

        /* renamed from: s, reason: collision with root package name */
        public com.avito.android.rating_form.step.e f249490s;

        /* renamed from: t, reason: collision with root package name */
        public int f249491t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Uri f249492u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ f f249493v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.rating_form.step.e f249494w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ FieldIdentifier f249495x;

        /* compiled from: RatingFormFileInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LzZ/c;", "uploadState", "Lkotlin/G0;", "invoke", "(LzZ/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<InterfaceC50529c, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ f f249496l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ FieldIdentifier f249497m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.rating_form.step.e f249498n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, FieldIdentifier fieldIdentifier, com.avito.android.rating_form.step.e eVar) {
                super(1);
                this.f249496l = fVar;
                this.f249497m = fieldIdentifier;
                this.f249498n = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
            @Override // Y41.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final kotlin.G0 invoke(zZ.InterfaceC50529c r9) {
                /*
                    r8 = this;
                    zZ.c r9 = (zZ.InterfaceC50529c) r9
                    boolean r0 = r9 instanceof zZ.InterfaceC50529c.C12957c
                    r1 = 0
                    if (r0 == 0) goto L12
                    com.avito.android.rating_form.step.z$c r0 = new com.avito.android.rating_form.step.z$c
                    zZ.c$c r9 = (zZ.InterfaceC50529c.C12957c) r9
                    float r9 = r9.f444073a
                    r0.<init>(r9)
                L10:
                    r6 = r0
                    goto L27
                L12:
                    boolean r9 = r9 instanceof zZ.InterfaceC50529c.a
                    if (r9 == 0) goto L26
                    com.avito.android.rating_form.step.z$a r0 = new com.avito.android.rating_form.step.z$a
                    r9 = 0
                    java.io.Serializable[] r9 = new java.io.Serializable[r9]
                    r2 = 2131956329(0x7f131269, float:1.954921E38)
                    com.avito.android.printable_text.PrintableText r9 = com.avito.android.printable_text.b.c(r2, r9)
                    r0.<init>(r9)
                    goto L10
                L26:
                    r6 = r1
                L27:
                    if (r6 == 0) goto L3c
                    com.avito.android.rating_form.step.f r5 = r8.f249496l
                    kotlinx.coroutines.internal.h r9 = r5.f249479g
                    com.avito.android.rating_form.step.m r0 = new com.avito.android.rating_form.step.m
                    com.avito.android.rating_form.step.e r4 = r8.f249498n
                    r7 = 0
                    com.avito.android.rating_form.FieldIdentifier r3 = r8.f249497m
                    r2 = r0
                    r2.<init>(r3, r4, r5, r6, r7)
                    r2 = 3
                    kotlinx.coroutines.C43259k.d(r9, r1, r1, r0, r2)
                L3c:
                    kotlin.G0 r9 = kotlin.G0.f406611a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.f.e.a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Uri uri, f fVar, com.avito.android.rating_form.step.e eVar, FieldIdentifier fieldIdentifier, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f249492u = uri;
            this.f249493v = fVar;
            this.f249494w = eVar;
            this.f249495x = fieldIdentifier;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new e(this.f249492u, this.f249493v, this.f249494w, this.f249495x, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.f.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@Y61.k RatingFormStepArguments ratingFormStepArguments, @Y61.k ContentResolver contentResolver, @Y61.k Vg0.d dVar, @Y61.k J0 j02, @Y61.k com.avito.android.rating_form.y yVar, @Y61.k R0 r02) {
        this.f249473a = ratingFormStepArguments;
        this.f249474b = contentResolver;
        this.f249475c = dVar;
        this.f249476d = j02;
        this.f249477e = r02;
        this.f249478f = yVar.b(ratingFormStepArguments.f249115c);
        this.f249479g = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.a()));
    }

    @Y61.l
    public final Object a(@Y61.k FieldIdentifier fieldIdentifier, @Y61.l List<RatingFormField.FileInfo> list, @Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f249477e.b(), new d(fieldIdentifier, list, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[LOOP:1: B:17:0x0045->B:58:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.rating_form.api.remote.model.RatingFormField.Validation b(com.avito.android.rating_form.FieldIdentifier r9, com.avito.android.rating_form.step.e r10) {
        /*
            r8 = this;
            com.avito.android.rating_form.step.RatingFormStepArguments r0 = r8.f249473a
            com.avito.android.rating_form.StepIdentifier r0 = r0.f249116d
            com.avito.android.rating_form.m r1 = r8.f249478f
            java.util.ArrayList r0 = r1.y(r0)
            r1 = 0
            if (r0 == 0) goto La8
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.avito.android.rating_form.api.remote.model.RatingFormField r3 = (com.avito.android.rating_form.api.remote.model.RatingFormField) r3
            com.avito.android.rating_form.FieldIdentifier r4 = new com.avito.android.rating_form.FieldIdentifier
            int r5 = r3.getId()
            java.lang.String r3 = r3.getSlug()
            r4.<init>(r5, r3)
            boolean r3 = r4.equals(r9)
            if (r3 == 0) goto L11
            goto L33
        L32:
            r2 = r1
        L33:
            com.avito.android.rating_form.api.remote.model.RatingFormField r2 = (com.avito.android.rating_form.api.remote.model.RatingFormField) r2
            if (r2 != 0) goto L39
            goto La8
        L39:
            java.util.List r9 = r2.s()
            if (r9 == 0) goto La8
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L45:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r9.next()
            r2 = r0
            com.avito.android.rating_form.api.remote.model.RatingFormField$Validation r2 = (com.avito.android.rating_form.api.remote.model.RatingFormField.Validation) r2
            com.avito.android.rating_form.api.remote.model.RatingFormField$Validation$Rule r3 = r2.getRule()
            if (r3 != 0) goto L5a
            r3 = -1
            goto L62
        L5a:
            int[] r4 = com.avito.android.rating_form.step.f.c.f249484a
            int r3 = r3.ordinal()
            r3 = r4[r3]
        L62:
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L82
            r6 = 2
            if (r3 == r6) goto L6a
            goto La3
        L6a:
            java.util.List r2 = r2.c()
            if (r2 == 0) goto L7d
            java.lang.String r3 = r10.f249469c
            r6 = 46
            java.lang.String r3 = kotlin.text.C43066x.n0(r6, r3, r3)
            boolean r2 = r2.contains(r3)
            goto L7e
        L7d:
            r2 = r5
        L7e:
            if (r2 != 0) goto La3
        L80:
            r4 = r5
            goto La3
        L82:
            java.lang.Integer r2 = r2.getMax()
            if (r2 != 0) goto L8a
        L88:
            r2 = r5
            goto La0
        L8a:
            java.lang.Long r3 = r10.f249470d
            if (r3 != 0) goto L90
        L8e:
            r2 = r4
            goto La0
        L90:
            int r2 = r2.intValue()
            long r2 = (long) r2
            java.lang.Long r6 = r10.f249470d
            long r6 = r6.longValue()
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L8e
            goto L88
        La0:
            if (r2 != 0) goto La3
            goto L80
        La3:
            if (r4 == 0) goto L45
            r1 = r0
        La6:
            com.avito.android.rating_form.api.remote.model.RatingFormField$Validation r1 = (com.avito.android.rating_form.api.remote.model.RatingFormField.Validation) r1
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.f.b(com.avito.android.rating_form.FieldIdentifier, com.avito.android.rating_form.step.e):com.avito.android.rating_form.api.remote.model.RatingFormField$Validation");
    }

    @Y61.l
    public final Object c(@Y61.k FieldIdentifier fieldIdentifier, @Y61.k com.avito.android.rating_form.step.e eVar, @Y61.k Continuation<? super G0> continuation) {
        Object next;
        String str;
        ArrayList arrayList = this.f249481i;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((b) next).f249483b.f249467a == eVar.f249467a) {
                break;
            }
        }
        b bVar = (b) next;
        if (bVar != null) {
            z zVar = bVar.f249483b.f249471e;
            if (zVar instanceof z.b) {
                RatingFormArguments ratingFormArguments = this.f249473a.f249114b;
                RatingFormArguments.RatingSellerArguments ratingSellerArguments = ratingFormArguments instanceof RatingFormArguments.RatingSellerArguments ? (RatingFormArguments.RatingSellerArguments) ratingFormArguments : null;
                if (ratingSellerArguments == null || (str = ratingSellerArguments.f247909b) == null) {
                    str = "";
                }
                String str2 = ((z.b) zVar).f249765a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("fid", str);
                linkedHashMap.put("fileKey", str2);
                C43259k.d(this.f249479g, null, null, new g(this, linkedHashMap, fieldIdentifier, eVar, null), 3);
                Boxing.boxBoolean(arrayList.remove(bVar));
            } else {
                bVar.f249482a.c(null);
                arrayList.remove(bVar);
                Object objG = C43259k.g(this.f249477e.b(), new h(this, fieldIdentifier, eVar, null), (SuspendLambda) continuation);
                if (objG != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objG = G0.f406611a;
                }
                if (objG == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return objG;
                }
            }
        }
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k com.avito.android.rating_form.FieldIdentifier r11, @Y61.k com.avito.android.rating_form.step.e r12, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.avito.android.rating_form.step.i
            if (r0 == 0) goto L13
            r0 = r13
            com.avito.android.rating_form.step.i r0 = (com.avito.android.rating_form.step.i) r0
            int r1 = r0.f249512u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249512u = r1
            goto L18
        L13:
            com.avito.android.rating_form.step.i r0 = new com.avito.android.rating_form.step.i
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f249510s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f249512u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.avito.android.rating_form.step.e r12 = r0.f249509r
            com.avito.android.rating_form.step.f r11 = r0.f249508q
            kotlin.C42729a0.b(r13)
            goto L96
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.C42729a0.b(r13)
            java.util.ArrayList r13 = r10.f249481i
            java.util.Iterator r2 = r13.iterator()
        L3e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L57
            java.lang.Object r4 = r2.next()
            r6 = r4
            com.avito.android.rating_form.step.f$b r6 = (com.avito.android.rating_form.step.f.b) r6
            com.avito.android.rating_form.step.e r6 = r6.f249483b
            long r6 = r6.f249467a
            long r8 = r12.f249467a
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L3e
            goto L58
        L57:
            r4 = r5
        L58:
            com.avito.android.rating_form.step.f$b r4 = (com.avito.android.rating_form.step.f.b) r4
            if (r4 == 0) goto L68
            kotlinx.coroutines.N0 r2 = r4.f249482a
            r2.c(r5)
            boolean r13 = r13.remove(r4)
            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r13)
        L68:
            com.avito.android.rating_form.api.remote.model.RatingFormField$Validation r13 = r10.b(r11, r12)
            if (r13 == 0) goto La7
            java.lang.String r13 = r13.getMessage()
            if (r13 == 0) goto L79
            com.avito.android.printable_text.PrintableText r13 = com.avito.android.printable_text.b.f(r13)
            goto L83
        L79:
            r13 = 0
            java.io.Serializable[] r13 = new java.io.Serializable[r13]
            r2 = 2131956329(0x7f131269, float:1.954921E38)
            com.avito.android.printable_text.PrintableText r13 = com.avito.android.printable_text.b.c(r2, r13)
        L83:
            com.avito.android.rating_form.step.z$a r2 = new com.avito.android.rating_form.step.z$a
            r2.<init>(r13)
            r0.f249508q = r10
            r0.f249509r = r12
            r0.f249512u = r3
            java.lang.Object r11 = r10.e(r11, r12, r2, r0)
            if (r11 != r1) goto L95
            return r1
        L95:
            r11 = r10
        L96:
            java.util.ArrayList r11 = r11.f249481i
            com.avito.android.rating_form.step.f$b r13 = new com.avito.android.rating_form.step.f$b
            kotlinx.coroutines.P0 r0 = kotlinx.coroutines.Q0.a()
            r13.<init>(r0, r12)
            r11.add(r13)
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        La7:
            r10.g(r11, r12)
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.f.d(com.avito.android.rating_form.FieldIdentifier, com.avito.android.rating_form.step.e, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object e(FieldIdentifier fieldIdentifier, com.avito.android.rating_form.step.e eVar, z zVar, ContinuationImpl continuationImpl) {
        Object objG = C43259k.g(this.f249477e.b(), new k(fieldIdentifier, eVar, this, zVar, null), continuationImpl);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(@Y61.k com.avito.android.rating_form.FieldIdentifier r21, @Y61.k android.net.Uri r22, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r23) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.f.f(com.avito.android.rating_form.FieldIdentifier, android.net.Uri, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void g(FieldIdentifier fieldIdentifier, com.avito.android.rating_form.step.e eVar) {
        Uri uri = eVar.f249468b;
        if (uri == null) {
            return;
        }
        this.f249481i.add(new b(C43259k.d(this.f249479g, null, null, new e(uri, this, eVar, fieldIdentifier, null), 3), eVar));
    }
}
