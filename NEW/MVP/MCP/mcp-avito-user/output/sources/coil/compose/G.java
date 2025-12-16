package coil.compose;

import androidx.compose.runtime.F3;
import androidx.compose.ui.unit.C22712b;
import coil.compose.C27242f;
import coil.request.NullRequestDataException;
import coil.view.C27251e;
import coil.view.C27253g;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public static final long f58163a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C27251e f58164b;

    /* compiled from: utils.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcoil/compose/f$c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcoil/compose/f$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<C27242f.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<C27242f.c.C2065c, G0> f58165l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<C27242f.c.d, G0> f58166m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<C27242f.c.b, G0> f58167n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super C27242f.c.C2065c, G0> lVar, Y41.l<? super C27242f.c.d, G0> lVar2, Y41.l<? super C27242f.c.b, G0> lVar3) {
            super(1);
            this.f58165l = lVar;
            this.f58166m = lVar2;
            this.f58167n = lVar3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(C27242f.c cVar) {
            C27242f.c cVar2 = cVar;
            if (cVar2 instanceof C27242f.c.C2065c) {
                Y41.l<C27242f.c.C2065c, G0> lVar = this.f58165l;
                if (lVar != 0) {
                    lVar.invoke(cVar2);
                }
            } else if (cVar2 instanceof C27242f.c.d) {
                Y41.l<C27242f.c.d, G0> lVar2 = this.f58166m;
                if (lVar2 != 0) {
                    lVar2.invoke(cVar2);
                }
            } else if (cVar2 instanceof C27242f.c.b) {
                Y41.l<C27242f.c.b, G0> lVar3 = this.f58167n;
                if (lVar3 != 0) {
                    lVar3.invoke(cVar2);
                }
            } else {
                boolean z12 = cVar2 instanceof C27242f.c.a;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: utils.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcoil/compose/f$c;", VoiceInfo.STATE, "invoke", "(Lcoil/compose/f$c;)Lcoil/compose/f$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<C27242f.c, C27242f.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f58168l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f58169m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f58170n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.graphics.painter.e eVar, androidx.compose.ui.graphics.painter.e eVar2, androidx.compose.ui.graphics.painter.e eVar3) {
            super(1);
            this.f58168l = eVar;
            this.f58169m = eVar2;
            this.f58170n = eVar3;
        }

        @Override // Y41.l
        public final C27242f.c invoke(C27242f.c cVar) {
            C27242f.c cVar2 = cVar;
            if (cVar2 instanceof C27242f.c.C2065c) {
                androidx.compose.ui.graphics.painter.e eVar = this.f58168l;
                C27242f.c.C2065c c2065c = (C27242f.c.C2065c) cVar2;
                if (eVar == null) {
                    return c2065c;
                }
                c2065c.getClass();
                return new C27242f.c.C2065c(eVar);
            }
            if (!(cVar2 instanceof C27242f.c.b)) {
                return cVar2;
            }
            C27242f.c.b bVar = (C27242f.c.b) cVar2;
            coil.request.e eVar2 = bVar.f58214b;
            if (eVar2.f58643c instanceof NullRequestDataException) {
                androidx.compose.ui.graphics.painter.e eVar3 = this.f58169m;
                return eVar3 != null ? new C27242f.c.b(eVar3, eVar2) : bVar;
            }
            androidx.compose.ui.graphics.painter.e eVar4 = this.f58170n;
            return eVar4 != null ? new C27242f.c.b(eVar4, eVar2) : bVar;
        }
    }

    static {
        C22712b.f42842b.getClass();
        f58163a = C22712b.a.c(0, 0);
        f58164b = new C27251e(C27253g.f58764c);
    }

    @F3
    @Y61.l
    public static final Y41.l<C27242f.c, G0> a(@Y61.l Y41.l<? super C27242f.c.C2065c, G0> lVar, @Y61.l Y41.l<? super C27242f.c.d, G0> lVar2, @Y61.l Y41.l<? super C27242f.c.b, G0> lVar3) {
        if (lVar == null && lVar2 == null && lVar3 == null) {
            return null;
        }
        return new a(lVar, lVar2, lVar3);
    }

    @F3
    @Y61.k
    public static final Y41.l<C27242f.c, C27242f.c> b(@Y61.l androidx.compose.ui.graphics.painter.e eVar, @Y61.l androidx.compose.ui.graphics.painter.e eVar2, @Y61.l androidx.compose.ui.graphics.painter.e eVar3) {
        if (eVar != null || eVar2 != null || eVar3 != null) {
            return new b(eVar, eVar3, eVar2);
        }
        C27242f.f58194v.getClass();
        return C27242f.f58195w;
    }
}
