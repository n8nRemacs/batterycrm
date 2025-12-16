package ru.cyberity.log.cacher;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.File;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;

/* compiled from: SinkCache.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001b*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000bB\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000b\u0010\u0018\"\u0004\b\u000b\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lru/cyberity/log/cacher/e;", "T", "Lru/cyberity/log/cacher/b;", "Lru/cyberity/log/cacher/c;", "Lru/cyberity/log/cacher/a;", "sink", "Ljava/io/File;", "rootCacheDir", "<init>", "(Lru/cyberity/log/cacher/a;Ljava/io/File;)V", "Lkotlin/G0;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/log/cacher/a;", "b", "Ljava/io/File;", "cacheDir", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "tagSuffix", "d", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class e<T> implements ru.cyberity.log.cacher.b, ru.cyberity.log.cacher.c<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final a<T> sink;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private File cacheDir;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private String tagSuffix = "";

    /* compiled from: SinkCache.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.log.cacher.SinkWrapper$processDir$2", f = "SinkCache.kt", i = {0, 0, 0}, l = {66}, m = "invokeSuspend", n = {"cacheFilesFound", "$this$forEach$iv", "file"}, s = {"L$0", "L$3", "L$4"})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f436083a;

        /* renamed from: b, reason: collision with root package name */
        Object f436084b;

        /* renamed from: c, reason: collision with root package name */
        Object f436085c;

        /* renamed from: d, reason: collision with root package name */
        Object f436086d;

        /* renamed from: e, reason: collision with root package name */
        Object f436087e;

        /* renamed from: f, reason: collision with root package name */
        int f436088f;

        /* renamed from: g, reason: collision with root package name */
        int f436089g;

        /* renamed from: h, reason: collision with root package name */
        int f436090h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ e<T> f436091i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e<T> eVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f436091i = eVar;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new b(this.f436091i, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:74:0x023d, code lost:
        
            r15.append(r5);
            ru.cyberity.log.b.b(r13, r14, r15.toString(), null, 4, null);
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00fa A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:6:0x0031, B:45:0x0171, B:48:0x017b, B:58:0x023d, B:34:0x00fa, B:35:0x00fc, B:37:0x0108, B:42:0x0151, B:61:0x0244, B:49:0x01b6, B:51:0x01ed, B:56:0x0229, B:57:0x022d, B:15:0x004e, B:17:0x0056, B:19:0x005e, B:24:0x00b4, B:26:0x00bb, B:28:0x00be, B:30:0x00c2, B:32:0x00f2), top: B:73:0x0010, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x017b A[Catch: all -> 0x0038, Exception -> 0x003b, TRY_ENTER, TryCatch #0 {Exception -> 0x003b, blocks: (B:6:0x0031, B:45:0x0171, B:48:0x017b, B:35:0x00fc, B:37:0x0108, B:42:0x0151, B:49:0x01b6), top: B:71:0x0031, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01b6 A[Catch: all -> 0x0038, Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:6:0x0031, B:45:0x0171, B:48:0x017b, B:35:0x00fc, B:37:0x0108, B:42:0x0151, B:49:0x01b6), top: B:71:0x0031, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0241  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x026c A[DONT_GENERATE] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Random, kotlin.jvm.internal.w] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x016e -> B:45:0x0171). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 684
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.log.cacher.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SinkCache.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.log.cacher.SinkWrapper", f = "SinkCache.kt", i = {0, 0, 1, 1, 1}, l = {88, 92}, m = "send", n = {"this", "value", "this", "value", "out"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f436092a;

        /* renamed from: b, reason: collision with root package name */
        Object f436093b;

        /* renamed from: c, reason: collision with root package name */
        Object f436094c;

        /* renamed from: d, reason: collision with root package name */
        Object f436095d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f436096e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e<T> f436097f;

        /* renamed from: g, reason: collision with root package name */
        int f436098g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e<T> eVar, Continuation<? super c> continuation) {
            super(continuation);
            this.f436097f = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f436096e = obj;
            this.f436098g |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f436097f.send(null, this);
        }
    }

    public e(@k a<T> aVar, @k File file) {
        this.sink = aVar;
        String strValueOf = String.valueOf(aVar.getClass().getName().hashCode());
        try {
            File file2 = new File(file, strValueOf);
            file2.mkdirs();
            this.cacheDir = file2;
        } catch (Exception e12) {
            ru.cyberity.log.a.f436064a.e("SinkWrapper" + this.tagSuffix, "Can't open cache directory " + strValueOf, e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6 A[Catch: Exception -> 0x00db, IOException -> 0x00de, FileNotFoundException -> 0x00e1, TryCatch #6 {FileNotFoundException -> 0x00e1, IOException -> 0x00de, Exception -> 0x00db, blocks: (B:34:0x00cd, B:36:0x00d6, B:44:0x00e5, B:50:0x00fa, B:51:0x00fd), top: B:71:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.coroutines.Continuation, ru.cyberity.log.cacher.e$c] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r15v7, types: [ru.cyberity.log.cacher.a<T>, ru.cyberity.log.cacher.c] */
    /* JADX WARN: Type inference failed for: r7v2, types: [ru.cyberity.log.cacher.a, ru.cyberity.log.cacher.a<T>] */
    @Override // ru.cyberity.log.cacher.c
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object send(T r14, @Y61.k kotlin.coroutines.Continuation<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.log.cacher.e.send(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getTagSuffix() {
        return this.tagSuffix;
    }

    public final void a(@k String str) {
        this.tagSuffix = str;
    }

    @Override // ru.cyberity.log.cacher.b
    @l
    public Object a(@k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(C43262l0.f411947c, new b(this, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
