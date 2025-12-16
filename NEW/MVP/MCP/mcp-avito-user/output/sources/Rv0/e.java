package rV0;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.m;
import com.avito.beduin.v2.interaction.repository.flow.x;
import kotlin.Metadata;

/* compiled from: PersistentRepositoryUpdateInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LrV0/e;", "Lcom/avito/beduin/v2/interaction/repository/flow/x;", "a", "persistent_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends x {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f429849d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final com.avito.beduin.v2.engine.field.d f429850e;

    /* compiled from: PersistentRepositoryUpdateInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrV0/e$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/x$a;", "<init>", "()V", "persistent_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends x.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final a f429851b = new a();

        public a() {
            super("Persistent", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.x.a
        @k
        public final x c(@k z zVar, @k m mVar, @k Y41.a<dU0.f> aVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @l Y41.a<dU0.f> aVar2) {
            return new e(mVar.l(zVar, "key"), mVar.p(zVar, "value"), aVar, lVar, aVar2);
        }
    }

    public e(@k String str, @l com.avito.beduin.v2.engine.field.d dVar, @k Y41.a<dU0.f> aVar, @k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @l Y41.a<dU0.f> aVar2) {
        super(aVar, aVar2, lVar);
        this.f429849d = str;
        this.f429850e = dVar;
    }
}
