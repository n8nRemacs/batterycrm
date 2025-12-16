package ru.cyberity.cbr.core.data.source.cache;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import ru.cyberity.log.c;

/* compiled from: CacheRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/data/source/cache/b;", "Lru/cyberity/cbr/core/data/source/cache/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "name", "Ljava/io/File;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b implements ru.cyberity.cbr.core.data.source.cache.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final Context context;

    /* compiled from: CacheRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Ljava/io/File;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/io/File;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.cache.CacheRepositoryImpl$addFileToCache$2", f = "CacheRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    final class a extends SuspendLambda implements p<T, Continuation<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433610a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f433612c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ byte[] f433613d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, byte[] bArr, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f433612c = str;
            this.f433613d = bArr;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super File> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(this.f433612c, this.f433613d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f433610a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            File file = new File(b.this.context.getCacheDir(), this.f433612c);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(this.f433613d);
                return file;
            } finally {
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        }
    }

    /* compiled from: CacheRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Ljava/io/File;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/io/File;"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.cache.CacheRepositoryImpl$createNewFile$2", f = "CacheRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: ru.cyberity.cbr.core.data.source.cache.b$b, reason: collision with other inner class name */
    public static final class C12471b extends SuspendLambda implements p<T, Continuation<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433614a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f433615b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f433617d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12471b(String str, Continuation<? super C12471b> continuation) {
            super(2, continuation);
            this.f433617d = str;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super File> continuation) {
            return ((C12471b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C12471b c12471b = b.this.new C12471b(this.f433617d, continuation);
            c12471b.f433615b = obj;
            return c12471b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f433614a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            T t12 = (T) this.f433615b;
            File file = new File(b.this.context.getCacheDir(), this.f433617d);
            try {
                file.createNewFile();
            } catch (Exception e12) {
                ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
                String strA = c.a(t12);
                String message = e12.getMessage();
                if (message == null) {
                    message = "";
                }
                aVar.e(strA, message, e12);
            }
            return file;
        }
    }

    public b(@k Context context) {
        this.context = context;
    }

    @Override // ru.cyberity.cbr.core.data.source.cache.a
    @l
    public Object a(@k String str, @k Continuation<? super File> continuation) {
        return C43259k.g(C43262l0.f411947c, new C12471b(str, null), continuation);
    }
}
