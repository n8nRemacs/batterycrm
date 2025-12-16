package ru.cyberity.cbr.core.data.source.dynamic;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.M;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import ru.cyberity.cbr.core.data.source.dynamic.a;
import ru.cyberity.log.logger.Logger;

/* compiled from: DataKeeper.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003Bp\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012J\u0010\u000e\u001aF\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0018J'\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0018J-\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0018J\u001f\u0010\u0014\u001a\u00020\u001c2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u001dJ\u0013\u0010\u0014\u001a\u00020\u001cH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u001eJ\u001b\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R[\u0010\u000e\u001aF\b\u0001\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R#\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u0014\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/b;", "T", "P", "", "Lkotlinx/coroutines/T;", "scope", "Lkotlinx/coroutines/M;", "dispatcher", "Lkotlin/Function3;", "Lkotlin/S;", "name", "params", "current", "Lkotlin/coroutines/Continuation;", "updater", "", "tag", "<init>", "(Lkotlinx/coroutines/T;Lkotlinx/coroutines/M;LY41/q;Ljava/lang/String;)V", "Lkotlinx/coroutines/N0;", "a", "(Ljava/lang/Object;)Lkotlinx/coroutines/N0;", "", "reload", "(ZLjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Lru/cyberity/cbr/core/data/source/dynamic/a;", "b", "Lkotlin/G0;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/M;", "LY41/q;", "d", "Ljava/lang/String;", "e", "Lkotlinx/coroutines/N0;", "updateJob", "Lkotlinx/coroutines/flow/Y1;", "f", "Lkotlinx/coroutines/flow/Y1;", "_flow", "Lkotlinx/coroutines/flow/d2;", "g", "Lkotlinx/coroutines/flow/d2;", "()Lkotlinx/coroutines/flow/d2;", MessageBody.SystemMessageBody.Platform.FLOW, "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b<T, P> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final T scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final M dispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final q<P, T, Continuation<? super T>, Object> updater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final String tag;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private N0 updateJob;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final Y1<ru.cyberity.cbr.core.data.source.dynamic.a<T>> _flow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final d2<ru.cyberity.cbr.core.data.source.dynamic.a<T>> flow;

    /* compiled from: DataKeeper.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataKeeper", f = "DataKeeper.kt", i = {0}, l = {31, 32}, m = "get", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433649a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<T, P> f433651c;

        /* renamed from: d, reason: collision with root package name */
        int f433652d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T, P> bVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f433651c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f433650b = obj;
            this.f433652d |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f433651c.a(false, null, this);
        }
    }

    /* compiled from: DataKeeper.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataKeeper", f = "DataKeeper.kt", i = {0}, l = {54, 55}, m = "getAsResult", n = {"this"}, s = {"L$0"})
    /* renamed from: ru.cyberity.cbr.core.data.source.dynamic.b$b, reason: collision with other inner class name */
    public static final class C12474b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433653a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433654b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<T, P> f433655c;

        /* renamed from: d, reason: collision with root package name */
        int f433656d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12474b(b<T, P> bVar, Continuation<? super C12474b> continuation) {
            super(continuation);
            this.f433655c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f433654b = obj;
            this.f433656d |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f433655c.b(false, null, this);
        }
    }

    /* compiled from: DataKeeper.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataKeeper", f = "DataKeeper.kt", i = {0}, l = {43, 44}, m = "getOrThrow", n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433657a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f433658b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<T, P> f433659c;

        /* renamed from: d, reason: collision with root package name */
        int f433660d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b<T, P> bVar, Continuation<? super c> continuation) {
            super(continuation);
            this.f433659c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f433658b = obj;
            this.f433660d |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f433659c.c(false, null, this);
        }
    }

    /* compiled from: DataKeeper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "P", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.DataKeeper$refreshInternal$1", f = "DataKeeper.kt", i = {0, 1}, l = {73, 74, 78}, m = "invokeSuspend", n = {"cache", "cache"}, s = {"L$0", "L$0"})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f433661a;

        /* renamed from: b, reason: collision with root package name */
        int f433662b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<T, P> f433663c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ P f433664d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b<T, P> bVar, P p12, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f433663c = bVar;
            this.f433664d = p12;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new d(this.f433663c, this.f433664d, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433662b;
            try {
            } catch (Throwable th2) {
                Logger.e$default(ru.cyberity.log.a.f436064a, ((b) this.f433663c).tag, String.valueOf(th2.getMessage()), null, 4, null);
                Y1 y12 = ((b) this.f433663c)._flow;
                a.c<T> cVarA = ru.cyberity.cbr.core.data.source.dynamic.a.INSTANCE.a(i12, th2);
                this.f433661a = null;
                this.f433662b = 3;
                if (y12.emit(cVarA, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.cyberity.cbr.core.data.source.dynamic.a aVar = (ru.cyberity.cbr.core.data.source.dynamic.a) C42745f0.G(((b) this.f433663c)._flow.E3());
                Object objD = aVar != null ? aVar.d() : null;
                q qVar = ((b) this.f433663c).updater;
                P p12 = this.f433664d;
                this.f433661a = objD;
                this.f433662b = 1;
                obj = qVar.invoke(p12, objD, this);
                obj2 = objD;
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        return G0.f406611a;
                    }
                    Object obj3 = this.f433661a;
                    C42729a0.b(obj);
                    i12 = obj3;
                    Logger.i$default(ru.cyberity.log.a.f436064a, ((b) this.f433663c).tag, "Updated", null, 4, null);
                    return G0.f406611a;
                }
                Object obj4 = this.f433661a;
                C42729a0.b(obj);
                obj2 = obj4;
            }
            Y1 y13 = ((b) this.f433663c)._flow;
            a.d dVarA = ru.cyberity.cbr.core.data.source.dynamic.a.INSTANCE.a(obj);
            this.f433661a = obj2;
            this.f433662b = 2;
            i12 = obj2;
            if (y13.emit(dVarA, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Logger.i$default(ru.cyberity.log.a.f436064a, ((b) this.f433663c).tag, "Updated", null, 4, null);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k T t12, @k M m12, @k q<? super P, ? super T, ? super Continuation<? super T>, ? extends Object> qVar, @k String str) {
        this.scope = t12;
        this.dispatcher = m12;
        this.updater = qVar;
        this.tag = str;
        e2 e2VarB = f2.b(1, 0, null, 6);
        this._flow = e2VarB;
        this.flow = e2VarB;
    }

    @k
    public final d2<ru.cyberity.cbr.core.data.source.dynamic.a<T>> a() {
        return this.flow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r6, @Y61.l P r7, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.cbr.core.data.source.dynamic.a<T>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ru.cyberity.cbr.core.data.source.dynamic.b.C12474b
            if (r0 == 0) goto L13
            r0 = r8
            ru.cyberity.cbr.core.data.source.dynamic.b$b r0 = (ru.cyberity.cbr.core.data.source.dynamic.b.C12474b) r0
            int r1 = r0.f433656d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433656d = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.b$b r0 = new ru.cyberity.cbr.core.data.source.dynamic.b$b
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f433654b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433656d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r8)
            goto L70
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f433653a
            ru.cyberity.cbr.core.data.source.dynamic.b r6 = (ru.cyberity.cbr.core.data.source.dynamic.b) r6
            kotlin.C42729a0.b(r8)
            goto L62
        L3c:
            kotlin.C42729a0.b(r8)
            if (r6 != 0) goto L56
            kotlinx.coroutines.flow.Y1<ru.cyberity.cbr.core.data.source.dynamic.a<T>> r6 = r5._flow
            java.util.List r6 = r6.E3()
            java.lang.Object r6 = kotlin.collections.C42745f0.G(r6)
            ru.cyberity.cbr.core.data.source.dynamic.a r6 = (ru.cyberity.cbr.core.data.source.dynamic.a) r6
            if (r6 == 0) goto L56
            boolean r8 = r6.b()
            if (r8 != r4) goto L56
            return r6
        L56:
            r0.f433653a = r5
            r0.f433656d = r4
            java.lang.Object r6 = r5.a(r7, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            r6 = r5
        L62:
            kotlinx.coroutines.flow.Y1<ru.cyberity.cbr.core.data.source.dynamic.a<T>> r6 = r6._flow
            r7 = 0
            r0.f433653a = r7
            r0.f433656d = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.y(r6, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.b.b(boolean, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r7, @Y61.l P r8, @Y61.k kotlin.coroutines.Continuation<? super T> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ru.cyberity.cbr.core.data.source.dynamic.b.c
            if (r0 == 0) goto L13
            r0 = r9
            ru.cyberity.cbr.core.data.source.dynamic.b$c r0 = (ru.cyberity.cbr.core.data.source.dynamic.b.c) r0
            int r1 = r0.f433660d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433660d = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.b$c r0 = new ru.cyberity.cbr.core.data.source.dynamic.b$c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f433658b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433660d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.C42729a0.b(r9)
            goto L72
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f433657a
            ru.cyberity.cbr.core.data.source.dynamic.b r7 = (ru.cyberity.cbr.core.data.source.dynamic.b) r7
            kotlin.C42729a0.b(r9)
            goto L65
        L3d:
            kotlin.C42729a0.b(r9)
            if (r7 != 0) goto L59
            kotlinx.coroutines.flow.Y1<ru.cyberity.cbr.core.data.source.dynamic.a<T>> r7 = r6._flow
            java.util.List r7 = r7.E3()
            java.lang.Object r7 = kotlin.collections.C42745f0.G(r7)
            ru.cyberity.cbr.core.data.source.dynamic.a r7 = (ru.cyberity.cbr.core.data.source.dynamic.a) r7
            if (r7 == 0) goto L55
            java.lang.Object r7 = r7.d()
            goto L56
        L55:
            r7 = r3
        L56:
            if (r7 == 0) goto L59
            return r7
        L59:
            r0.f433657a = r6
            r0.f433660d = r5
            java.lang.Object r7 = r6.a(r8, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            r7 = r6
        L65:
            kotlinx.coroutines.flow.Y1<ru.cyberity.cbr.core.data.source.dynamic.a<T>> r7 = r7._flow
            r0.f433657a = r3
            r0.f433660d = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.y(r7, r0)
            if (r9 != r1) goto L72
            return r1
        L72:
            ru.cyberity.cbr.core.data.source.dynamic.a r9 = (ru.cyberity.cbr.core.data.source.dynamic.a) r9
            java.lang.Object r7 = r9.e()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.b.c(boolean, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r7, @Y61.l P r8, @Y61.k kotlin.coroutines.Continuation<? super T> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ru.cyberity.cbr.core.data.source.dynamic.b.a
            if (r0 == 0) goto L13
            r0 = r9
            ru.cyberity.cbr.core.data.source.dynamic.b$a r0 = (ru.cyberity.cbr.core.data.source.dynamic.b.a) r0
            int r1 = r0.f433652d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433652d = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.b$a r0 = new ru.cyberity.cbr.core.data.source.dynamic.b$a
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f433650b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433652d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.C42729a0.b(r9)
            goto L72
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f433649a
            ru.cyberity.cbr.core.data.source.dynamic.b r7 = (ru.cyberity.cbr.core.data.source.dynamic.b) r7
            kotlin.C42729a0.b(r9)
            goto L65
        L3d:
            kotlin.C42729a0.b(r9)
            if (r7 != 0) goto L59
            kotlinx.coroutines.flow.Y1<ru.cyberity.cbr.core.data.source.dynamic.a<T>> r7 = r6._flow
            java.util.List r7 = r7.E3()
            java.lang.Object r7 = kotlin.collections.C42745f0.G(r7)
            ru.cyberity.cbr.core.data.source.dynamic.a r7 = (ru.cyberity.cbr.core.data.source.dynamic.a) r7
            if (r7 == 0) goto L55
            java.lang.Object r7 = r7.d()
            goto L56
        L55:
            r7 = r3
        L56:
            if (r7 == 0) goto L59
            return r7
        L59:
            r0.f433649a = r6
            r0.f433652d = r5
            java.lang.Object r7 = r6.a(r8, r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            r7 = r6
        L65:
            kotlinx.coroutines.flow.Y1<ru.cyberity.cbr.core.data.source.dynamic.a<T>> r7 = r7._flow
            r0.f433649a = r3
            r0.f433652d = r4
            java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.y(r7, r0)
            if (r9 != r1) goto L72
            return r1
        L72:
            ru.cyberity.cbr.core.data.source.dynamic.a r9 = (ru.cyberity.cbr.core.data.source.dynamic.a) r9
            java.lang.Object r7 = r9.e()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.b.a(boolean, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ b(T t12, M m12, q qVar, String str, int i12, C42822w c42822w) {
        this(t12, m12, qVar, (i12 & 8) != 0 ? "DataKeeper" : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object b(b bVar, boolean z12, Object obj, Continuation continuation, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            obj = null;
        }
        return bVar.b(z12, obj, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object c(b bVar, boolean z12, Object obj, Continuation continuation, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            obj = null;
        }
        return bVar.c(z12, obj, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object a(b bVar, Object obj, Continuation continuation, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            obj = null;
        }
        return bVar.a(obj, continuation);
    }

    @l
    public final Object b(T t12, @k Continuation<? super G0> continuation) {
        Object objEmit = this._flow.emit(ru.cyberity.cbr.core.data.source.dynamic.a.INSTANCE.a(t12), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @l
    public final Object a(@l P p12, @k Continuation<? super G0> continuation) {
        N0 n02;
        N0 n03 = this.updateJob;
        if ((n03 != null && n03.isActive()) || ((n02 = this.updateJob) != null && !n02.c0())) {
            Logger.i$default(ru.cyberity.log.a.f436064a, this.tag, "Waiting for update complete", null, 4, null);
        } else {
            Logger.i$default(ru.cyberity.log.a.f436064a, this.tag, "Updating", null, 4, null);
            this.updateJob = a((b<T, P>) p12);
        }
        N0 n04 = this.updateJob;
        if (n04 == null) {
            return G0.f406611a;
        }
        Object objA = n04.A(continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    private final N0 a(P params) {
        return C43259k.d(this.scope, this.dispatcher, null, new d(this, params, null), 2);
    }

    @l
    public final Object a(@k Continuation<? super G0> continuation) {
        ru.cyberity.cbr.core.data.source.dynamic.a aVar = (ru.cyberity.cbr.core.data.source.dynamic.a) C42745f0.G(this._flow.E3());
        if (aVar != null && aVar.b()) {
            return G0.f406611a;
        }
        Object objA = a(this, null, continuation, 1, null);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }
}
