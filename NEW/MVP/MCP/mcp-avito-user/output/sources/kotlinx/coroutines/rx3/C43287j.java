package kotlinx.coroutines.rx3;

import com.avito.android.photo_cache.q;
import java.util.NoSuchElementException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: RxAwait.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\b\u00028\u00000\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b9¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/rx3/j;", "Lio/reactivex/rxjava3/core/G;", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.rx3.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43287j implements io.reactivex.rxjava3.core.G<Object> {

    /* renamed from: b, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.d f412100b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Object f412101c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f412102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f412103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ EnumC43283f f412104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q.a f412105g;

    /* compiled from: RxAwait.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.rx3.j$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[EnumC43283f.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC43283f enumC43283f = EnumC43283f.f412090c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC43283f enumC43283f2 = EnumC43283f.f412090c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC43283f enumC43283f3 = EnumC43283f.f412090c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: RxAwait.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.coroutines.rx3.j$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ io.reactivex.rxjava3.disposables.d f412106l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.reactivex.rxjava3.disposables.d dVar) {
            super(1);
            this.f412106l = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f412106l.dispose();
            return G0.f406611a;
        }
    }

    public C43287j(kotlinx.coroutines.r rVar, EnumC43283f enumC43283f, q.a aVar) {
        this.f412103e = rVar;
        this.f412104f = enumC43283f;
        this.f412105g = aVar;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(@Y61.k io.reactivex.rxjava3.disposables.d dVar) {
        this.f412100b = dVar;
        this.f412103e.r(new b(dVar));
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        boolean z12 = this.f412102d;
        kotlinx.coroutines.r rVar = this.f412103e;
        if (z12) {
            if (rVar.isActive()) {
                int i12 = Z.f406624c;
                rVar.resumeWith(this.f412101c);
                return;
            }
            return;
        }
        EnumC43283f enumC43283f = EnumC43283f.f412091d;
        EnumC43283f enumC43283f2 = this.f412104f;
        if (enumC43283f2 == enumC43283f) {
            int i13 = Z.f406624c;
            rVar.resumeWith(this.f412105g);
        } else if (rVar.isActive()) {
            int i14 = Z.f406624c;
            rVar.resumeWith(new Z.b(new NoSuchElementException("No value received via onNext for " + enumC43283f2)));
        }
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(@Y61.k Throwable th2) {
        int i12 = Z.f406624c;
        this.f412103e.resumeWith(new Z.b(th2));
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(@Y61.k Object obj) {
        EnumC43283f enumC43283f = this.f412104f;
        int iOrdinal = enumC43283f.ordinal();
        kotlinx.coroutines.r rVar = this.f412103e;
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (this.f412102d) {
                return;
            }
            this.f412102d = true;
            int i12 = Z.f406624c;
            rVar.resumeWith(obj);
            io.reactivex.rxjava3.disposables.d dVar = this.f412100b;
            (dVar != null ? dVar : null).dispose();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            if (enumC43283f != EnumC43283f.f412092e || !this.f412102d) {
                this.f412101c = obj;
                this.f412102d = true;
                return;
            }
            if (rVar.isActive()) {
                int i13 = Z.f406624c;
                rVar.resumeWith(new Z.b(new IllegalArgumentException("More than one onNext value for " + enumC43283f)));
            }
            io.reactivex.rxjava3.disposables.d dVar2 = this.f412100b;
            (dVar2 != null ? dVar2 : null).dispose();
        }
    }
}
