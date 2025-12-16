package androidx.datastore.migrations;

import X41.j;
import X41.n;
import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.SharedPreferences;
import j.InterfaceC42164u;
import j.X;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/migrations/a;", "T", "Landroidx/datastore/core/c;", "e", "datastore_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class a<T> implements androidx.datastore.core.c<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p<T, Continuation<? super Boolean>, Object> f45529a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final q<androidx.datastore.migrations.d, T, Continuation<? super T>, Object> f45530b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Context f45531c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f45532d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f45533e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final LinkedHashSet f45534f;

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.datastore.migrations.a$a, reason: collision with other inner class name */
    public static final class C1775a extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {
        public C1775a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C1775a(2, continuation);
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return ((C1775a) create(obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return Boxing.boxBoolean(true);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {
        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new b(2, continuation);
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return ((b) create(obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return Boxing.boxBoolean(true);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super Boolean>, Object> {
        public c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new c(2, continuation);
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super Boolean> continuation) {
            return ((c) create(obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return Boxing.boxBoolean(true);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "T"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class d extends N implements Y41.a<SharedPreferences> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f45535l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f45536m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, String str) {
            super(0);
            this.f45535l = context;
            this.f45536m = str;
        }

        @Override // Y41.a
        public final SharedPreferences invoke() {
            return this.f45535l.getSharedPreferences(this.f45536m, 0);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/datastore/migrations/a$e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "name", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @X
    public static final class e {
        static {
            new e();
        }

        @n
        @InterfaceC42164u
        public static final boolean a(@k Context context, @k String name) {
            return context.deleteSharedPreferences(name);
        }
    }

    @j
    public a() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Y41.a<? extends SharedPreferences> aVar, Set<String> set, p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, q<? super androidx.datastore.migrations.d, ? super T, ? super Continuation<? super T>, ? extends Object> qVar, Context context, String str) {
        this.f45529a = pVar;
        this.f45530b = qVar;
        this.f45531c = context;
        this.f45532d = str;
        this.f45533e = C42727D.c(aVar);
        this.f45534f = set == androidx.datastore.migrations.c.f45541a ? null : C42745f0.O0(set);
    }

    @Override // androidx.datastore.core.c
    @l
    public final G0 s() throws IOException {
        G0 g02;
        Context context;
        String str;
        InterfaceC42726C interfaceC42726C = this.f45533e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) interfaceC42726C.getValue()).edit();
        LinkedHashSet linkedHashSet = this.f45534f;
        if (linkedHashSet == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) interfaceC42726C.getValue()).getAll().isEmpty() && (context = this.f45531c) != null && (str = this.f45532d) != null && !e.a(context, str)) {
            throw new IOException(L.j(str, "Unable to delete SharedPreferences: "));
        }
        if (linkedHashSet == null) {
            g02 = null;
        } else {
            linkedHashSet.clear();
            g02 = G0.f406611a;
        }
        return g02 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g02 : G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.Object r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.migrations.b
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.migrations.b r0 = (androidx.datastore.migrations.b) r0
            int r1 = r0.f45540t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45540t = r1
            goto L18
        L13:
            androidx.datastore.migrations.b r0 = new androidx.datastore.migrations.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f45538r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45540t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.datastore.migrations.a r5 = r0.f45537q
            kotlin.C42729a0.b(r6)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r6)
            r0.f45537q = r4
            r0.f45540t = r3
            Y41.p<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r6 = r4.f45529a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 != 0) goto L52
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r5
        L52:
            java.util.LinkedHashSet r6 = r5.f45534f
            kotlin.C r5 = r5.f45533e
            if (r6 != 0) goto L6b
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.util.Map r5 = r5.getAll()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L69
            goto L96
        L69:
            r3 = r0
            goto L96
        L6b:
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L78
            goto L69
        L78:
            java.util.Iterator r6 = r6.iterator()
        L7c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L7c
        L96:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.migrations.a.t(java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.datastore.core.c
    @l
    public final Object u(T t12, @k Continuation<? super T> continuation) {
        return this.f45530b.invoke(new androidx.datastore.migrations.d((SharedPreferences) this.f45533e.getValue(), this.f45534f), t12, continuation);
    }

    public a(Y41.a aVar, Set set, p pVar, q qVar, Context context, String str, int i12, C42822w c42822w) {
        this((Y41.a<? extends SharedPreferences>) aVar, (Set<String>) set, (i12 & 4) != 0 ? new C1775a(2, null) : pVar, qVar, context, str);
    }

    @j
    public a(@k Context context, @k String str, @k Set<String> set, @k p<? super T, ? super Continuation<? super Boolean>, ? extends Object> pVar, @k q<? super androidx.datastore.migrations.d, ? super T, ? super Continuation<? super T>, ? extends Object> qVar) {
        this(new d(context, str), set, pVar, qVar, context, str);
    }

    public a(Y41.a aVar, Set set, p pVar, q qVar, int i12, C42822w c42822w) {
        this((Y41.a<? extends SharedPreferences>) aVar, (Set<String>) ((i12 & 2) != 0 ? androidx.datastore.migrations.c.f45541a : set), (i12 & 4) != 0 ? new b(2, null) : pVar, qVar, (Context) null, (String) null);
    }

    public a(Context context, String str, Set set, p pVar, q qVar, int i12, C42822w c42822w) {
        this(context, str, (i12 & 4) != 0 ? androidx.datastore.migrations.c.f45541a : set, (i12 & 8) != 0 ? new c(2, null) : pVar, qVar);
    }
}
